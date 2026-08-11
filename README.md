# Museeks

Museeks — нативный неофициальный плеер VK Музыки для iPhone и iPad, написанный с нуля на SwiftUI.

## Что реализовано

- вход на настоящей странице VK в изолированном `WKWebView` без чтения полей логина;
- обмен завершённой веб-сессии на API-токен и автоматическое обновление сессии;
- хранение токена, cookie обновления и профиля в системном Keychain с режимом `ThisDeviceOnly`;
- персональные рекомендации, разделы каталога VK, история, плейлисты и медиатека;
- поиск треков и исполнителей, страницы исполнителей, добавление и удаление музыки из медиатеки;
- потоковый `AVPlayer`: очередь, play next, shuffle, repeat, seek, таймер сна и восстановление позиции;
- фоновое воспроизведение, экран блокировки, Control Center, AirPlay и Bluetooth;
- тексты песен из ответа VK;
- системный Liquid Glass на iOS 26+ и аккуратный material-fallback на iOS 17–25;
- Privacy Manifest без аналитики и отслеживания, с approved reason для локальных настроек;
- иконка из `C:\Users\Werhes\Downloads\AppIcon.png` подключена к приложению и launch screen.

## Сборка

Нужны macOS, Xcode 26+ и XcodeGen:

```bash
brew install xcodegen
git clone <адрес-этого-репозитория>
cd museeks
bash scripts/bootstrap.sh
open Museeks.xcodeproj
```

В Xcode выберите свою команду в **Signing & Capabilities**, затем запустите схему `Museeks` на iPhone с iOS 17 или новее. Liquid Glass включается системой на iOS 26+; старые версии используют совместимый материал.

Проверки структуры, которые работают и на Windows:

```powershell
python scripts/validate_project.py
```

Unit-тесты запускаются на macOS:

```bash
xcodebuild test -project Museeks.xcodeproj -scheme Museeks -destination 'platform=iOS Simulator,name=iPhone 17'
```

## GitHub Actions и релизы

Workflow `.github/workflows/ios-release.yml` запускает проверки и собирает unsigned IPA на `macos-26`:

- push в `main` или pull request — сборка и временный Actions artifact;
- push тега `v*` — сборка и GitHub Release с IPA и SHA-256;
- ручной запуск **iOS Build and Release** — можно указать версию и выбрать, создавать ли release.

Для обычного релиза:

```bash
git tag v1.0.0
git push origin v1.0.0
```

В приватном репозитории release и его файлы также остаются приватными. Workflow использует встроенный `GITHUB_TOKEN` с правом `contents: write` только в release-job. Полученный IPA не подписан: перед установкой его нужно подписать своим Apple Developer сертификатом.

## Безопасность и ограничения

Museeks не содержит пользовательских токенов, паролей или `client_secret`. Пароль и код подтверждения вводятся только на странице VK. Не публикуйте содержимое своего Keychain и используйте только собственную учётную запись.

Методы VK Музыки не являются стабильным публичным API и могут измениться без предупреждения. Приложение не обходит DRM и воспроизводит только потоки, которые VK возвращает текущей пользовательской сессии. Проект не связан с VK.
