#!/usr/bin/env python3
from __future__ import annotations

import json
import plistlib
import struct
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
REQUIRED = [
    ROOT / "project.yml",
    ROOT / "Museeks/App/MuseeksApp.swift",
    ROOT / "Museeks/App/AppEnvironment.swift",
    ROOT / "Museeks/Services/VKWebAuthService.swift",
    ROOT / "Museeks/Services/VKMusicService.swift",
    ROOT / "Museeks/Core/Security/KeychainStore.swift",
    ROOT / "Museeks/Player/PlayerController.swift",
    ROOT / "Museeks/Features/Shared/GlassDesign.swift",
    ROOT / "Museeks/Resources/Info.plist",
    ROOT / "Museeks/Resources/PrivacyInfo.xcprivacy",
    ROOT / ".github/workflows/ios-release.yml",
]


def png_size(path: Path) -> tuple[int, int]:
    data = path.read_bytes()
    if data[:8] != b"\x89PNG\r\n\x1a\n" or data[12:16] != b"IHDR":
        raise AssertionError(f"Not a PNG: {path}")
    return struct.unpack(">II", data[16:24])


def main() -> None:
    missing = [str(path.relative_to(ROOT)) for path in REQUIRED if not path.is_file()]
    if missing:
        raise AssertionError(f"Missing required files: {', '.join(missing)}")

    project = (ROOT / "project.yml").read_text(encoding="utf-8")
    for marker in ("name: Museeks", "PRODUCT_BUNDLE_IDENTIFIER: com.werhes.museeks"):
        if marker not in project:
            raise AssertionError(f"project.yml lacks {marker!r}")

    with (ROOT / "Museeks/Resources/Info.plist").open("rb") as stream:
        info = plistlib.load(stream)
    if info.get("CFBundleDisplayName") != "Museeks":
        raise AssertionError("Unexpected display name")
    if "audio" not in info.get("UIBackgroundModes", []):
        raise AssertionError("Background audio mode is missing")

    with (ROOT / "Museeks/Resources/PrivacyInfo.xcprivacy").open("rb") as stream:
        privacy = plistlib.load(stream)
    if privacy.get("NSPrivacyTracking") is not False:
        raise AssertionError("Privacy manifest must explicitly disable tracking")
    accessed = privacy.get("NSPrivacyAccessedAPITypes", [])
    defaults_entry = next(
        (
            item for item in accessed
            if item.get("NSPrivacyAccessedAPIType")
            == "NSPrivacyAccessedAPICategoryUserDefaults"
        ),
        None,
    )
    if not defaults_entry or "CA92.1" not in defaults_entry.get(
        "NSPrivacyAccessedAPITypeReasons", []
    ):
        raise AssertionError("UserDefaults required reason CA92.1 is missing")

    assets = ROOT / "Museeks/Resources/Assets.xcassets"
    for contents in assets.rglob("Contents.json"):
        json.loads(contents.read_text(encoding="utf-8"))

    icon = assets / "AppIcon.appiconset/AppIcon.png"
    if png_size(icon) != (1024, 1024):
        raise AssertionError("AppIcon must be 1024x1024")

    swift_files = list((ROOT / "Museeks").rglob("*.swift"))
    if len(swift_files) < 30:
        raise AssertionError("The application source set looks incomplete")

    source = "\n".join(path.read_text(encoding="utf-8") for path in swift_files)
    if "glassEffect(" not in source or "GlassEffectContainer" not in source:
        raise AssertionError("Liquid Glass integration is missing")
    if "kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly" not in source:
        raise AssertionError("Expected device-bound Keychain accessibility")
    if "UIBackgroundModes" not in (ROOT / "Museeks/Resources/Info.plist").read_text(encoding="utf-8"):
        raise AssertionError("Background mode declaration is missing")

    workflow = (ROOT / ".github/workflows/ios-release.yml").read_text(encoding="utf-8")
    for marker in (
        "runs-on: macos-26",
        "CODE_SIGNING_ALLOWED=NO",
        "uses: actions/upload-artifact@v4",
        "uses: actions/download-artifact@v4",
        "contents: write",
        "gh release",
    ):
        if marker not in workflow:
            raise AssertionError(f"Release workflow lacks {marker!r}")

    print(f"Validated {len(swift_files)} Swift files and all Museeks resources.")


if __name__ == "__main__":
    main()
