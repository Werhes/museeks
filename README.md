# Museeks 🎵

> VK Music Player, но с названием Museeks

**Museeks** — это десктопное и мобильное приложение для прослушивания музыки ВКонтакте. Полная копия интерфейса VK X, написанная на Flutter.

## Возможности

- 🎧 Воспроизведение музыки из VK
- 📋 Список аудиозаписей с обложками
- 🔍 Поиск по трекам и исполнителям
- ❤️ Любимые треки
- 📱 Авторизация по телефону (как в VK X)
- 🌙 Тёмная тема
- 🖥️ Десктоп (Windows, macOS, Linux) + 📱 Мобилка (Android, iOS)

## Скриншоты

*(скоро будут)*

## 🚀 Быстрый старт

### 1. Серверная часть (Ubuntu)

Скопируйте папку `server` на ваш Ubuntu сервер и выполните команды по порядку:

```bash
# 1. На вашем компьютере (Windows) — создаём папку и копируем сервер на Ubuntu
ssh root@31.76.43.138 "mkdir -p /opt/museeks-server"
scp -r server/* root@31.76.43.138:/opt/museeks-server/

# 2. Подключаемся к серверу по SSH
ssh root@31.76.43.138

# 3. Обновление пакетов
apt update -y && apt upgrade -y

# 4. Установка Node.js 20.x
curl -fsSL https://deb.nodesource.com/setup_20.x | bash -
apt install -y nodejs

# 5. Установка PM2 (глобально)
npm install -g pm2

# 6. Переход в папку сервера и установка зависимостей
cd /opt/museeks-server
npm install --production

# 7. Создание .env
cp .env.example .env

# 8. Запуск через PM2
pm2 start ecosystem.config.js
pm2 save
pm2 startup systemd -u root --hp /root

# 9. Проверка
curl http://localhost:1000/health
# Должен быть ответ: {"status":"ok","timestamp":"...","version":"1.0.0"}
```

### 2. Настройка Flutter-приложения

Откройте файл [`lib/services/vk_api_service.dart`](lib/services/vk_api_service.dart) и замените `YOUR_SERVER_IP` на IP вашего Ubuntu сервера:

```dart
static const String _baseUrl = 'http://YOUR_SERVER_IP:1000/api';
```

### 3. Сборка приложения

```bash
# Установка зависимостей
flutter pub get

# Запуск в режиме разработки
flutter run -d windows   # Windows
flutter run -d android   # Android

# Сборка релиза
flutter build windows   # Windows
flutter build apk       # Android
flutter build ios       # iOS
flutter build linux     # Linux
flutter build macos     # macOS
```

## 📱 Авторизация

Приложение поддерживает авторизацию через VK по номеру телефона:

1. Ввод номера телефона или email
2. Автоматическое определение способа входа:
   - **Пароль** — если есть пароль
   - **SMS** — код по SMS
   - **Push** — подтверждение в приложении VK
   - **Звонок** — код по звонку
   - **Резервный код** — резервные коды
3. Получение токена и вход в приложение

## 🖥️ Сервер (Ubuntu)

Серверная часть работает как прокси для VK API и VK Ecosystem Auth.

### Структура сервера

```
server/
├── server.js            # Основной сервер (Express)
├── package.json         # Зависимости Node.js
├── ecosystem.config.js  # Конфиг PM2
├── deploy.sh            # Скрипт установки на Ubuntu
└── .env.example         # Пример конфига
```

### API Endpoints

| Метод | Путь | Описание |
|-------|------|----------|
| POST | `/api/auth/validate` | Валидация номера телефона |
| POST | `/api/auth/password` | Вход по паролю |
| POST | `/api/auth/requestCode` | Запрос кода подтверждения |
| POST | `/api/auth/confirmCode` | Подтверждение кода |
| GET | `/api/audio.get` | Получение списка аудио |
| GET | `/api/audio.search` | Поиск аудио |
| GET | `/api/audio.getById` | Получение URL аудио |
| GET | `/health` | Проверка сервера |

### Управление сервером через PM2

```bash
pm2 status                    # Статус
pm2 logs museeks-server       # Логи
pm2 restart museeks-server    # Перезапуск
pm2 stop museeks-server       # Остановка
pm2 delete museeks-server     # Удаление
```

## 🛠️ Технологии

- **Flutter** — фреймворк для UI
- **Dart** — язык программирования
- **just_audio** — аудиоплеер
- **provider** — управление состоянием
- **Express.js** — серверная часть
- **PM2** — менеджер процессов
- **VK API / VK Ecosystem** — получение музыки и авторизация

## 📄 Лицензия

MIT
