package defpackage;

import org.conscrypt.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3562e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3562e[] f8030e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f8031e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f8032e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f8033e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f8034e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f8035e;

    static {
        EnumC3562e[] enumC3562eArr = {new EnumC3562e("VTLite", 0, "VTLite", "https://github.com/vtosters/lite/releases", "0.4.16", true), new EnumC3562e("Sova", 1, "SOVA V RE", "https://t.me/sovav", "0.9b", true), new EnumC3562e("MP3Mod", 2, "VK mp3 mod", "https://t.me/vkmp3mod", "113/744", true), new EnumC3562e("VkTea", 3, "VK Tea", "https://t.me/vk_tea", "5.0", true), new EnumC3562e("VKDirect", 4, "VK Direct", "https://t.me/vkdirect", "?", false), new EnumC3562e("MP3ModAlpha", 5, "MP3Mod indev alpha", BuildConfig.FLAVOR, BuildConfig.FLAVOR, false)};
        f8030e = enumC3562eArr;
        f8031e = new C15937e(enumC3562eArr);
    }

    public EnumC3562e(String str, int i, String str2, String str3, String str4, boolean z) {
        this.f8035e = str2;
        this.f8033e = str3;
        this.f8032e = str4;
        this.f8034e = z;
    }

    public static EnumC3562e valueOf(String str) {
        return (EnumC3562e) Enum.valueOf(EnumC3562e.class, str);
    }

    public static EnumC3562e[] values() {
        return (EnumC3562e[]) f8030e.clone();
    }
}
