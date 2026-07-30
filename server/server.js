require('dotenv').config();
const express = require('express');
const cors = require('cors');
const axios = require('axios');
const crypto = require('crypto');

const app = express();
const PORT = process.env.PORT || 1000;

app.use(cors());
app.use(express.json());

// VK API
const VK_API_URL = 'https://api.vk.com/method';
const VK_ECOSYSTEM_URL = 'https://api.vk.com/ecosystem';
const API_VERSION = '5.131';

// Константы для VK Auth (как в VK X / Music-M)
const CLIENT_ID = '2274003'; // Официальный ID VK для мобильных приложений
const CLIENT_SECRET = 'hHbZxrka2uZ6jB1inYsH'; // Секрет для VK приложения
const DEVICE_ID = crypto.randomUUID();

// ==========================================
// VK ECOSYSTEM AUTH (авторизация по телефону)
// ==========================================

/**
 * Шаг 1: Валидация аккаунта (номера телефона или email)
 * Аналог ValidateAccountAsync из VK UI3
 */
app.post('/api/auth/validate', async (req, res) => {
  try {
    const { login } = req.body;

    if (!login) {
      return res.status(400).json({ error: 'Login is required' });
    }

    // Запрос к VK для валидации аккаунта
    const response = await axios.post(`${VK_ECOSYSTEM_URL}/auth/validateAccount`, {
      login,
      client_id: CLIENT_ID,
      client_secret: CLIENT_SECRET,
      device_id: DEVICE_ID,
      lang: 'ru',
      login_ways: JSON.stringify([
        'push', 'sms', 'call_reset', 'reserve_code',
        'codegen', 'email', 'passkey'
      ]),
      passkey_supported: true,
    }, {
      headers: {
        'User-Agent': 'VKAndroidApp/7.23-10866 (Android 13; SDK 33; arm64-v8a; ru; 2400x1080)',
        'Content-Type': 'application/x-www-form-urlencoded',
      },
    });

    const data = response.data;

    if (data.error) {
      return res.status(400).json({ error: data.error.error_msg || 'Auth error' });
    }

    // Парсим ответ
    const sid = data.sid;
    const hasPassword = data.flow_names?.includes('password') || false;
    const methods = (data.flow_names || [])
      .filter(name => name !== 'password')
      .map((name, index) => ({
        name,
        priority: index,
        info: data.flow_info?.[name] || null,
      }));

    // Информация о профиле
    const profile = data.profile || {
      first_name: 'Незнакомец',
      photo: null,
    };

    res.json({
      sid,
      has_password: hasPassword,
      methods,
      profile,
    });
  } catch (error) {
    console.error('Validate Account Error:', error.response?.data || error.message);
    res.status(500).json({
      error: error.response?.data?.error?.error_msg || 'Internal server error',
    });
  }
});

/**
 * Шаг 2a: Вход по паролю
 */
app.post('/api/auth/password', async (req, res) => {
  try {
    const { sid, password } = req.body;

    if (!sid || !password) {
      return res.status(400).json({ error: 'sid and password are required' });
    }

    const response = await axios.post(`${VK_ECOSYSTEM_URL}/auth/authWithPassword`, {
      sid,
      password,
      client_id: CLIENT_ID,
      client_secret: CLIENT_SECRET,
      device_id: DEVICE_ID,
      lang: 'ru',
    }, {
      headers: {
        'User-Agent': 'VKAndroidApp/7.23-10866 (Android 13; SDK 33; arm64-v8a; ru; 2400x1080)',
        'Content-Type': 'application/x-www-form-urlencoded',
      },
    });

    const data = response.data;

    if (data.error) {
      return res.status(400).json({ error: data.error.error_msg || 'Wrong password' });
    }

    res.json({
      access_token: data.access_token,
      user_id: data.user_id,
      expires_in: data.expires_in,
    });
  } catch (error) {
    console.error('Password Auth Error:', error.response?.data || error.message);
    res.status(500).json({
      error: error.response?.data?.error?.error_msg || 'Internal server error',
    });
  }
});

/**
 * Шаг 2b: Запрос кода подтверждения (SMS, Push, звонок и т.д.)
 */
app.post('/api/auth/requestCode', async (req, res) => {
  try {
    const { sid, method } = req.body;

    if (!sid || !method) {
      return res.status(400).json({ error: 'sid and method are required' });
    }

    const response = await axios.post(`${VK_ECOSYSTEM_URL}/auth/requestCode`, {
      sid,
      method,
      client_id: CLIENT_ID,
      client_secret: CLIENT_SECRET,
      device_id: DEVICE_ID,
      lang: 'ru',
    }, {
      headers: {
        'User-Agent': 'VKAndroidApp/7.23-10866 (Android 13; SDK 33; arm64-v8a; ru; 2400x1080)',
        'Content-Type': 'application/x-www-form-urlencoded',
      },
    });

    const data = response.data;

    if (data.error) {
      return res.status(400).json({ error: data.error.error_msg || 'Code request failed' });
    }

    res.json({ success: true, status: data.status });
  } catch (error) {
    console.error('Request Code Error:', error.response?.data || error.message);
    res.status(500).json({
      error: error.response?.data?.error?.error_msg || 'Internal server error',
    });
  }
});

/**
 * Шаг 3: Подтверждение кодом
 */
app.post('/api/auth/confirmCode', async (req, res) => {
  try {
    const { sid, code } = req.body;

    if (!sid || !code) {
      return res.status(400).json({ error: 'sid and code are required' });
    }

    const response = await axios.post(`${VK_ECOSYSTEM_URL}/auth/confirmCode`, {
      sid,
      code,
      client_id: CLIENT_ID,
      client_secret: CLIENT_SECRET,
      device_id: DEVICE_ID,
      lang: 'ru',
    }, {
      headers: {
        'User-Agent': 'VKAndroidApp/7.23-10866 (Android 13; SDK 33; arm64-v8a; ru; 2400x1080)',
        'Content-Type': 'application/x-www-form-urlencoded',
      },
    });

    const data = response.data;

    if (data.error) {
      return res.status(400).json({ error: data.error.error_msg || 'Invalid code' });
    }

    res.json({
      access_token: data.access_token,
      user_id: data.user_id,
      expires_in: data.expires_in,
    });
  } catch (error) {
    console.error('Confirm Code Error:', error.response?.data || error.message);
    res.status(500).json({
      error: error.response?.data?.error?.error_msg || 'Internal server error',
    });
  }
});

// ==========================================
// VK API PROXY (для получения музыки)
// ==========================================

/**
 * Прокси для всех VK API запросов
 */
app.get('/api/*', async (req, res) => {
  try {
    const method = req.path.replace('/api/', '');
    const accessToken = req.query.access_token;

    if (!accessToken) {
      return res.status(401).json({ error: 'No access token provided' });
    }

    const { access_token, ...vkParams } = req.query;

    const response = await axios.get(`${VK_API_URL}/${method}`, {
      params: {
        ...vkParams,
        access_token: accessToken,
        v: API_VERSION,
      },
      headers: {
        'User-Agent': 'VKAndroidApp/7.23-10866 (Android 13; SDK 33; arm64-v8a; ru; 2400x1080)',
      },
    });

    res.json(response.data);
  } catch (error) {
    console.error('VK API Error:', error.response?.data || error.message);
    res.status(error.response?.status || 500).json({
      error: error.response?.data || { error_msg: 'Internal server error' },
    });
  }
});

/**
 * POST прокси для VK API
 */
app.post('/api/*', async (req, res) => {
  try {
    const method = req.path.replace('/api/', '');
    const accessToken = req.query.access_token || req.body.access_token;

    if (!accessToken) {
      return res.status(401).json({ error: 'No access token provided' });
    }

    const response = await axios.post(`${VK_API_URL}/${method}`, null, {
      params: {
        ...req.body,
        access_token: accessToken,
        v: API_VERSION,
      },
      headers: {
        'User-Agent': 'VKAndroidApp/7.23-10866 (Android 13; SDK 33; arm64-v8a; ru; 2400x1080)',
      },
    });

    res.json(response.data);
  } catch (error) {
    console.error('VK API Error:', error.response?.data || error.message);
    res.status(error.response?.status || 500).json({
      error: error.response?.data || { error_msg: 'Internal server error' },
    });
  }
});

// Health check
app.get('/health', (req, res) => {
  res.json({
    status: 'ok',
    timestamp: new Date().toISOString(),
    version: '1.0.0',
  });
});

app.listen(PORT, '0.0.0.0', () => {
  console.log('🎵 Museeks Server running on port', PORT);
  console.log('🌐 Health check: http://localhost:' + PORT + '/health');
  console.log('📱 VK Ecosystem Auth enabled');
  console.log('🎧 VK API Proxy enabled');
});