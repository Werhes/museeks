# Museeks

Museeks — нативный неофициальный плеер VK Музыки для iPhone и iPad на SwiftUI. Интерфейс плеера, авторизация, получение и форматирование каталога, воспроизведение и офлайн-загрузка интегрированы из локального проекта PrivateMusic2 по запросу владельца проекта и переименованы в Museeks.

## Возможности

- авторизация VK через изолированный `WKWebView` и восстановление веб-сессии;
- хранение токена и данных сессии в системном Keychain с режимом `ThisDeviceOnly`;
- рекомендации, каталог, миксы, поиск, исполнители, альбомы и плейлисты;
- потоковое воспроизведение через `AVPlayer`, очередь, shuffle, repeat, seek и восстановление позиции;
- обработка и восстановление URL аудио VK через `VKAudioURLResolver`;
- полноэкранный плеер, тексты песен, очередь и меню действий;
- компактный мини-плеер над панелью вкладок; на iOS 26.1+ используется `tabViewBottomAccessory`, на более ранних версиях — совместимый стек;
- HLS-загрузки, экспорт сегментов, локальные треки и офлайн-плейлисты;
- фоновые controls, экран блокировки, Control Center, AirPlay и Bluetooth;
- Liquid Glass на iOS 26+ и material-fallback на iOS 17–25;
- иконка Museeks из `C:\Users\Werhes\Downloads\AppIcon.png`.

## Локальная сборка

Нужны macOS, Xcode 26+ и XcodeGen 2.46+:

```bash
brew install xcodegen
git clone <адрес-приватного-репозитория>
cd museeks
bash scripts/bootstrap.sh
open Museeks.xcodeproj
```

В Xcode укажите свою команду в **Signing & Capabilities** и запустите схему `Museeks` на устройстве или симуляторе с iOS 17+.

Структурную проверку, доступную и на Windows, можно запустить так:

```powershell
python scripts/validate_project.py
```

Полный набор unit-тестов запускается на macOS:

```bash
xcodebuild test -project Museeks.xcodeproj -scheme Museeks -destination 'platform=iOS Simulator,name=iPhone 17'
```

## GitHub Actions и релизы

Workflow `.github/workflows/ios-release.yml` работает и в приватном репозитории:

- push в `main` и pull request сразу собирают unsigned IPA как Actions artifact, без валидаторов и unit-тестов в CI;
- тег `v*` собирает IPA, SHA-256 checksum и создаёт приватный GitHub Release;
- ручной запуск **iOS Build and Release** позволяет задать версию и выбрать создание релиза.

Обычный релиз:

```bash
git tag v1.0.0
git push origin v1.0.0
```

Workflow использует встроенный `GITHUB_TOKEN`; отдельный секрет не нужен. IPA собирается без подписи, поэтому перед установкой его необходимо подписать собственным Apple Developer сертификатом.

## Безопасность и ограничения

В репозитории нет пользовательских токенов, паролей и `client_secret`. Пароль и код подтверждения вводятся только на странице VK. API музыки VK не является стабильным публичным API и может измениться без предупреждения. Museeks не связан с VK и должен использоваться только с собственной учётной записью и с соблюдением применимых условий сервиса.
