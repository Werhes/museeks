import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../services/vk_api_service.dart';
import '../utils/logger.dart';
import '../main.dart';

class LoginScreen extends StatefulWidget {
  const LoginScreen({super.key});

  @override
  State<LoginScreen> createState() => _LoginScreenState();
}

class _LoginScreenState extends State<LoginScreen> {
  final _phoneController = TextEditingController();
  final _passwordController = TextEditingController();
  final _codeController = TextEditingController();
  final _phoneFocusNode = FocusNode();

  bool _showPassword = false;
  bool _showCodeInput = false;
  bool _showMethodSelection = false;
  bool _obscurePassword = true;
  List<VerificationMethod> _availableMethods = [];
  Map<String, dynamic>? _profile;
  bool _showLogs = false;

  @override
  void initState() {
    super.initState();
    _phoneFocusNode.requestFocus();
  }

  @override
  void dispose() {
    _phoneController.dispose();
    _passwordController.dispose();
    _codeController.dispose();
    _phoneFocusNode.dispose();
    super.dispose();
  }

  Future<void> _validatePhone() async {
    final api = context.read<VKApiService>();
    final login = _phoneController.text.trim();
    if (login.isEmpty) return;

    final result = await api.validateAccount(login);
    if (!mounted) return;

    if (result.isNotEmpty) {
      final methods = result['methods'] as List<VerificationMethod>? ?? [];
      final hasPassword = result['has_password'] as bool? ?? false;
      _profile = result['profile'] as Map<String, dynamic>?;
      setState(() {
        _availableMethods = methods;
        _showMethodSelection = !hasPassword && methods.isNotEmpty;
        _showPassword = hasPassword;
      });
    }
  }

  Future<void> _loginWithPassword() async {
    final api = context.read<VKApiService>();
    if (_passwordController.text.isEmpty) return;
    final success = await api.loginWithPassword(_passwordController.text);
    if (success && mounted) Navigator.of(context).pushReplacementNamed('/home');
  }

  Future<void> _requestCode(AuthMethod method) async {
    final api = context.read<VKApiService>();
    final success = await api.requestCode(method);
    if (success && mounted) setState(() => _showCodeInput = true);
  }

  Future<void> _confirmCode() async {
    final api = context.read<VKApiService>();
    if (_codeController.text.trim().isEmpty) return;
    final success = await api.confirmCode(_codeController.text.trim());
    if (success && mounted) Navigator.of(context).pushReplacementNamed('/home');
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: VKTheme.background,
      body: SafeArea(
        child: Stack(
          children: [
            Center(
              child: SingleChildScrollView(
                padding: const EdgeInsets.symmetric(horizontal: 32),
                child: Consumer<VKApiService>(
                  builder: (context, api, child) {
                    return Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        _buildLogo(),
                        const SizedBox(height: 40),
                        if (!_showPassword && !_showCodeInput && !_showMethodSelection)
                          _buildPhoneInput(api),
                        if (_showPassword) _buildPasswordInput(api),
                        if (_showMethodSelection && !_showCodeInput) _buildMethodSelection(api),
                        if (_showCodeInput) _buildCodeInput(api),
                        if (api.error != null)
                          Padding(
                            padding: const EdgeInsets.only(top: 16),
                            child: Text(api.error!, style: const TextStyle(color: VKTheme.error, fontSize: 13)),
                          ),
                        if (api.isLoading)
                          const Padding(
                            padding: EdgeInsets.only(top: 24),
                            child: CircularProgressIndicator(color: VKTheme.primary),
                          ),
                      ],
                    );
                  },
                ),
              ),
            ),
            // Кнопка логов
            Positioned(
              top: 8,
              right: 8,
              child: IconButton(
                icon: const Icon(Icons.bug_report_rounded, color: VKTheme.textHint),
                onPressed: () => setState(() => _showLogs = !_showLogs),
              ),
            ),
            // Панель логов
            if (_showLogs) _buildLogsPanel(),
          ],
        ),
      ),
    );
  }

  Widget _buildLogsPanel() {
    return Positioned(
      top: 0,
      left: 0,
      right: 0,
      bottom: 0,
      child: Container(
        color: VKTheme.background.withValues(alpha: 0.95),
        child: Column(
          children: [
            Container(
              padding: const EdgeInsets.all(12),
              color: VKTheme.primary,
              child: Row(
                children: [
                  const Icon(Icons.bug_report, color: Colors.white, size: 20),
                  const SizedBox(width: 8),
                  const Expanded(child: Text('Логи приложения', style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold))),
                  TextButton(
                    onPressed: AppLogger.clear,
                    child: const Text('Очистить', style: TextStyle(color: Colors.white)),
                  ),
                  IconButton(
                    icon: const Icon(Icons.close, color: Colors.white),
                    onPressed: () => setState(() => _showLogs = false),
                  ),
                ],
              ),
            ),
            Expanded(
              child: ListView.builder(
                padding: const EdgeInsets.all(8),
                itemCount: AppLogger.logs.length,
                itemBuilder: (context, index) {
                  final log = AppLogger.logs.reversed.toList()[index];
                  return Container(
                    padding: const EdgeInsets.symmetric(horizontal: 8, vertical: 4),
                    margin: const EdgeInsets.only(bottom: 2),
                    decoration: BoxDecoration(
                      color: Colors.white.withValues(alpha: 0.5),
                      borderRadius: BorderRadius.circular(4),
                    ),
                    child: Row(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text('${log.levelIcon} ', style: const TextStyle(fontSize: 12)),
                        Text('${log.formattedTime} ', style: TextStyle(fontSize: 11, color: VKTheme.textHint)),
                        if (log.action != null)
                          Text('[${log.action}] ', style: TextStyle(fontSize: 11, color: VKTheme.primary, fontWeight: FontWeight.w600)),
                        Expanded(
                          child: Text(
                            log.message,
                            style: TextStyle(
                              fontSize: 11,
                              color: log.level == LogLevel.error ? VKTheme.error : VKTheme.textPrimary,
                            ),
                          ),
                        ),
                      ],
                    ),
                  );
                },
              ),
            ),
          ],
        ),
      ),
    );
  }

  Widget _buildLogo() {
    return Column(
      children: [
        Container(
          width: 80,
          height: 80,
          decoration: BoxDecoration(
            color: VKTheme.primary,
            borderRadius: BorderRadius.circular(20),
            boxShadow: [
              BoxShadow(
                color: VKTheme.primary.withValues(alpha: 0.3),
                blurRadius: 20,
                offset: const Offset(0, 8),
              ),
            ],
          ),
          child: const Icon(Icons.music_note_rounded, color: Colors.white, size: 40),
        ),
        const SizedBox(height: 16),
        const Text('Museeks', style: TextStyle(color: VKTheme.textPrimary, fontSize: 28, fontWeight: FontWeight.bold, letterSpacing: -0.5)),
        const SizedBox(height: 8),
        const Text('Войдите в VK для прослушивания музыки', style: TextStyle(color: VKTheme.textSecondary, fontSize: 14)),
      ],
    );
  }

  Widget _buildPhoneInput(VKApiService api) {
    return Column(
      children: [
        Container(
          decoration: BoxDecoration(
            color: Colors.white,
            borderRadius: BorderRadius.circular(12),
            border: Border.all(color: VKTheme.primary.withValues(alpha: 0.2)),
          ),
          child: TextField(
            controller: _phoneController,
            focusNode: _phoneFocusNode,
            keyboardType: TextInputType.phone,
            style: const TextStyle(color: VKTheme.textPrimary, fontSize: 16),
            decoration: InputDecoration(
              hintText: 'Номер телефона или email',
              hintStyle: const TextStyle(color: VKTheme.textHint, fontSize: 16),
              prefixIcon: const Icon(Icons.phone_android_rounded, color: VKTheme.textHint),
              border: InputBorder.none,
              contentPadding: const EdgeInsets.symmetric(horizontal: 16, vertical: 16),
            ),
            textInputAction: TextInputAction.go,
            onSubmitted: (_) => _validatePhone(),
          ),
        ),
        const SizedBox(height: 16),
        SizedBox(
          width: double.infinity,
          height: 52,
          child: ElevatedButton(
            onPressed: api.isLoading ? null : _validatePhone,
            style: ElevatedButton.styleFrom(
              backgroundColor: VKTheme.primary,
              disabledBackgroundColor: VKTheme.primary.withValues(alpha: 0.5),
            ),
            child: const Text('Продолжить', style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.w600)),
          ),
        ),
      ],
    );
  }

  Widget _buildPasswordInput(VKApiService api) {
    return Column(
      children: [
        if (_profile != null)
          Container(
            padding: const EdgeInsets.all(16),
            margin: const EdgeInsets.only(bottom: 16),
            decoration: BoxDecoration(color: Colors.white, borderRadius: BorderRadius.circular(12)),
            child: Row(
              children: [
                CircleAvatar(
                  radius: 24,
                  backgroundColor: VKTheme.primary.withValues(alpha: 0.2),
                  backgroundImage: _profile!['photo'] != null ? NetworkImage(_profile!['photo'] as String) : null,
                  child: _profile!['photo'] == null ? const Icon(Icons.person, color: VKTheme.primary) : null,
                ),
                const SizedBox(width: 12),
                Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(_profile!['first_name'] as String? ?? 'Незнакомец',
                        style: const TextStyle(color: VKTheme.textPrimary, fontSize: 16, fontWeight: FontWeight.w500)),
                    Text(_phoneController.text, style: const TextStyle(color: VKTheme.textSecondary, fontSize: 13)),
                  ],
                ),
              ],
            ),
          ),
        Container(
          decoration: BoxDecoration(
            color: Colors.white,
            borderRadius: BorderRadius.circular(12),
            border: Border.all(color: VKTheme.primary.withValues(alpha: 0.2)),
          ),
          child: TextField(
            controller: _passwordController,
            obscureText: _obscurePassword,
            style: const TextStyle(color: VKTheme.textPrimary, fontSize: 16),
            decoration: InputDecoration(
              hintText: 'Пароль',
              hintStyle: const TextStyle(color: VKTheme.textHint, fontSize: 16),
              prefixIcon: const Icon(Icons.lock_rounded, color: VKTheme.textHint),
              suffixIcon: IconButton(
                icon: Icon(_obscurePassword ? Icons.visibility_off_rounded : Icons.visibility_rounded, color: VKTheme.textHint),
                onPressed: () => setState(() => _obscurePassword = !_obscurePassword),
              ),
              border: InputBorder.none,
              contentPadding: const EdgeInsets.symmetric(horizontal: 16, vertical: 16),
            ),
            textInputAction: TextInputAction.go,
            onSubmitted: (_) => _loginWithPassword(),
          ),
        ),
        const SizedBox(height: 16),
        SizedBox(
          width: double.infinity,
          height: 52,
          child: ElevatedButton(
            onPressed: api.isLoading ? null : _loginWithPassword,
            child: const Text('Войти', style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.w600)),
          ),
        ),
        TextButton(
          onPressed: () => setState(() { _showPassword = false; _showMethodSelection = _availableMethods.isNotEmpty; }),
          child: const Text('Другие способы входа', style: TextStyle(color: VKTheme.textSecondary, fontSize: 14)),
        ),
      ],
    );
  }

  Widget _buildMethodSelection(VKApiService api) {
    return Column(
      children: [
        const Text('Выберите способ входа', style: TextStyle(color: VKTheme.textPrimary, fontSize: 18, fontWeight: FontWeight.w600)),
        const SizedBox(height: 20),
        ..._availableMethods.map((method) => _buildMethodButton(api, method)),
        const SizedBox(height: 16),
        TextButton(
          onPressed: () => setState(() { _showMethodSelection = false; _showPassword = false; _showCodeInput = false; }),
          child: const Text('Назад', style: TextStyle(color: VKTheme.textSecondary, fontSize: 14)),
        ),
      ],
    );
  }

  Widget _buildMethodButton(VKApiService api, VerificationMethod method) {
    IconData icon;
    switch (method.method) {
      case AuthMethod.sms: icon = Icons.sms_rounded; break;
      case AuthMethod.push: icon = Icons.notifications_active_rounded; break;
      case AuthMethod.callReset: icon = Icons.phone_in_talk_rounded; break;
      case AuthMethod.reserveCode: icon = Icons.key_rounded; break;
      case AuthMethod.codegen: icon = Icons.app_registration_rounded; break;
      case AuthMethod.email: icon = Icons.email_rounded; break;
      case AuthMethod.passkey: icon = Icons.fingerprint; break;
      default: icon = Icons.help_outline_rounded;
    }
    return Container(
      margin: const EdgeInsets.only(bottom: 8),
      child: Material(
        color: Colors.transparent,
        child: InkWell(
          onTap: () => _requestCode(method.method),
          borderRadius: BorderRadius.circular(12),
          child: Container(
            padding: const EdgeInsets.all(16),
            decoration: BoxDecoration(
              color: Colors.white,
              borderRadius: BorderRadius.circular(12),
              border: Border.all(color: VKTheme.primary.withValues(alpha: 0.2)),
            ),
            child: Row(
              children: [
                Icon(icon, color: VKTheme.primary, size: 24),
                const SizedBox(width: 16),
                Expanded(
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(method.displayName, style: const TextStyle(color: VKTheme.textPrimary, fontSize: 15, fontWeight: FontWeight.w500)),
                      if (method.description.isNotEmpty)
                        Text(method.description, style: const TextStyle(color: VKTheme.textSecondary, fontSize: 12)),
                    ],
                  ),
                ),
                const Icon(Icons.chevron_right_rounded, color: VKTheme.textHint),
              ],
            ),
          ),
        ),
      ),
    );
  }

  Widget _buildCodeInput(VKApiService api) {
    return Column(
      children: [
        const Text('Введите код подтверждения', style: TextStyle(color: VKTheme.textPrimary, fontSize: 18, fontWeight: FontWeight.w600)),
        const SizedBox(height: 8),
        const Text('Код отправлен. Проверьте устройство.', style: TextStyle(color: VKTheme.textSecondary, fontSize: 14)),
        const SizedBox(height: 24),
        Container(
          decoration: BoxDecoration(
            color: Colors.white,
            borderRadius: BorderRadius.circular(12),
            border: Border.all(color: VKTheme.primary.withValues(alpha: 0.2)),
          ),
          child: TextField(
            controller: _codeController,
            keyboardType: TextInputType.number,
            textAlign: TextAlign.center,
            style: const TextStyle(color: VKTheme.textPrimary, fontSize: 24, letterSpacing: 8),
            decoration: const InputDecoration(
              hintText: '000000',
              hintStyle: TextStyle(color: VKTheme.textHint, fontSize: 24, letterSpacing: 8),
              border: InputBorder.none,
              contentPadding: EdgeInsets.symmetric(horizontal: 16, vertical: 20),
            ),
            maxLength: 6,
            textInputAction: TextInputAction.go,
            onSubmitted: (_) => _confirmCode(),
          ),
        ),
        const SizedBox(height: 16),
        SizedBox(
          width: double.infinity,
          height: 52,
          child: ElevatedButton(
            onPressed: api.isLoading ? null : _confirmCode,
            child: const Text('Подтвердить', style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.w600)),
          ),
        ),
        TextButton(
          onPressed: () => setState(() { _showCodeInput = false; _codeController.clear(); }),
          child: const Text('Назад', style: TextStyle(color: VKTheme.textSecondary, fontSize: 14)),
        ),
      ],
    );
  }
}