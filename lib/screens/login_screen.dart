import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:provider/provider.dart';
import '../services/vk_api_service.dart';
import '../utils/logger.dart';

class LoginScreen extends StatefulWidget {
  const LoginScreen({super.key});

  @override
  State<LoginScreen> createState() => _LoginScreenState();
}

class _LoginScreenState extends State<LoginScreen> {
  final _phoneController = TextEditingController();
  final _passwordController = TextEditingController();
  final _codeController = TextEditingController();
  final _tokenController = TextEditingController();
  final _phoneFocusNode = FocusNode();

  bool _showPassword = false;
  bool _showCodeInput = false;
  bool _showMethodSelection = false;
  bool _showTokenInput = false;
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
    _tokenController.dispose();
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

  Future<void> _loginWithToken() async {
    final api = context.read<VKApiService>();
    final token = _tokenController.text.trim();
    if (token.isEmpty) return;
    final success = await api.loginWithToken(token);
    if (success && mounted) Navigator.of(context).pushReplacementNamed('/home');
  }

  @override
  Widget build(BuildContext context) {
    final cs = Theme.of(context).colorScheme;
    return Scaffold(
      backgroundColor: cs.surface,
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
                        _buildLogo(cs),
                        const SizedBox(height: 40),
                        if (!_showPassword && !_showCodeInput && !_showMethodSelection && !_showTokenInput)
                          _buildPhoneInput(api, cs),
                        if (_showPassword) _buildPasswordInput(api, cs),
                        if (_showMethodSelection && !_showCodeInput) _buildMethodSelection(api, cs),
                        if (_showCodeInput) _buildCodeInput(api, cs),
                        if (_showTokenInput) _buildTokenInput(api, cs),
                        if (api.error != null)
                          Padding(
                            padding: const EdgeInsets.only(top: 16),
                            child: Text(api.error!, style: TextStyle(color: cs.error, fontSize: 13)),
                          ),
                        if (api.isLoading)
                          const Padding(
                            padding: EdgeInsets.only(top: 24),
                            child: CircularProgressIndicator(),
                          ),
                        const SizedBox(height: 16),
                        // Кнопка переключения на вход по токену
                        if (!_showPassword && !_showCodeInput && !_showMethodSelection)
                          TextButton.icon(
                            icon: Icon(Icons.key_rounded, size: 18,
                                color: cs.onSurface.withValues(alpha: 0.6)),
                            label: Text(
                              _showTokenInput ? 'Войти по номеру' : 'Войти по токену',
                              style: TextStyle(
                                  color: cs.onSurface.withValues(alpha: 0.6), fontSize: 13),
                            ),
                            onPressed: () => setState(() => _showTokenInput = !_showTokenInput),
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
                icon: Icon(Icons.bug_report_rounded, color: cs.onSurface.withValues(alpha: 0.5)),
                onPressed: () => setState(() => _showLogs = !_showLogs),
              ),
            ),
            // Панель логов
            if (_showLogs) _buildLogsPanel(cs),
          ],
        ),
      ),
    );
  }

  Widget _buildLogsPanel(ColorScheme cs) {
    return Positioned(
      top: 0,
      left: 0,
      right: 0,
      bottom: 0,
      child: Container(
        color: cs.surface.withValues(alpha: 0.95),
        child: Column(
          children: [
            Container(
              padding: const EdgeInsets.all(12),
              color: cs.primaryContainer,
              child: Row(
                children: [
                  Icon(Icons.bug_report, color: cs.onPrimaryContainer, size: 20),
                  const SizedBox(width: 8),
                  Expanded(
                    child: Text('Логи приложения',
                        style: TextStyle(color: cs.onPrimaryContainer, fontWeight: FontWeight.bold)),
                  ),
                  IconButton(
                    icon: Icon(Icons.copy_rounded, color: cs.onPrimaryContainer, size: 20),
                    tooltip: 'Копировать все',
                    onPressed: () {
                      final logText = AppLogger.logs
                          .map((log) =>
                              '${log.levelIcon} ${log.formattedTime}${log.action != null ? ' [${log.action}]' : ''} ${log.message}')
                          .join('\n');
                      Clipboard.setData(ClipboardData(text: logText));
                      ScaffoldMessenger.of(context).showSnackBar(
                        const SnackBar(content: Text('Логи скопированы'), duration: Duration(seconds: 2)),
                      );
                    },
                  ),
                  TextButton(
                    onPressed: AppLogger.clear,
                    child: Text('Очистить', style: TextStyle(color: cs.onPrimaryContainer)),
                  ),
                  IconButton(
                    icon: Icon(Icons.close, color: cs.onPrimaryContainer),
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
                      color: cs.surfaceContainerHighest.withValues(alpha: 0.5),
                      borderRadius: BorderRadius.circular(4),
                    ),
                    child: Row(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text('${log.levelIcon} ', style: const TextStyle(fontSize: 12)),
                        Text('${log.formattedTime} ',
                            style: TextStyle(fontSize: 11, color: cs.onSurface.withValues(alpha: 0.5))),
                        if (log.action != null)
                          Text('[${log.action}] ',
                              style: TextStyle(
                                  fontSize: 11, color: cs.primary, fontWeight: FontWeight.w600)),
                        Expanded(
                          child: Text(
                            log.message,
                            style: TextStyle(
                              fontSize: 11,
                              color: log.level == LogLevel.error ? cs.error : cs.onSurface,
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

  Widget _buildLogo(ColorScheme cs) {
    return Column(
      children: [
        Container(
          width: 80,
          height: 80,
          decoration: BoxDecoration(
            color: cs.primaryContainer,
            borderRadius: BorderRadius.circular(20),
            boxShadow: [
              BoxShadow(
                color: cs.primary.withValues(alpha: 0.3),
                blurRadius: 20,
                offset: const Offset(0, 8),
              ),
            ],
          ),
          child: Icon(Icons.music_note_rounded, color: cs.onPrimaryContainer, size: 40),
        ),
        const SizedBox(height: 16),
        Text('Museeks',
            style: TextStyle(
                color: cs.onSurface, fontSize: 28, fontWeight: FontWeight.bold, letterSpacing: -0.5)),
        const SizedBox(height: 8),
        Text('Войдите в VK для прослушивания музыки',
            style: TextStyle(color: cs.onSurface.withValues(alpha: 0.6), fontSize: 14)),
      ],
    );
  }

  Widget _buildPhoneInput(VKApiService api, ColorScheme cs) {
    return Column(
      children: [
        Container(
          decoration: BoxDecoration(
            color: cs.surfaceContainerHighest,
            borderRadius: BorderRadius.circular(12),
          ),
          child: TextField(
            controller: _phoneController,
            focusNode: _phoneFocusNode,
            keyboardType: TextInputType.phone,
            style: TextStyle(color: cs.onSurface, fontSize: 16),
            decoration: InputDecoration(
              hintText: 'Номер телефона или email',
              hintStyle: TextStyle(color: cs.onSurface.withValues(alpha: 0.4), fontSize: 16),
              prefixIcon: Icon(Icons.phone_android_rounded, color: cs.onSurface.withValues(alpha: 0.4)),
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
          child: FilledButton(
            onPressed: api.isLoading ? null : _validatePhone,
            child: const Text('Продолжить',
                style: TextStyle(fontSize: 16, fontWeight: FontWeight.w600)),
          ),
        ),
      ],
    );
  }

  Widget _buildPasswordInput(VKApiService api, ColorScheme cs) {
    return Column(
      children: [
        if (_profile != null)
          Container(
            padding: const EdgeInsets.all(16),
            margin: const EdgeInsets.only(bottom: 16),
            decoration: BoxDecoration(
                color: cs.surfaceContainerHighest, borderRadius: BorderRadius.circular(12)),
            child: Row(
              children: [
                CircleAvatar(
                  radius: 24,
                  backgroundColor: cs.primaryContainer,
                  backgroundImage:
                      _profile!['photo'] != null ? NetworkImage(_profile!['photo'] as String) : null,
                  child: _profile!['photo'] == null
                      ? Icon(Icons.person, color: cs.onPrimaryContainer)
                      : null,
                ),
                const SizedBox(width: 12),
                Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(_profile!['first_name'] as String? ?? 'Незнакомец',
                        style: TextStyle(
                            color: cs.onSurface, fontSize: 16, fontWeight: FontWeight.w500)),
                    Text(_phoneController.text,
                        style: TextStyle(color: cs.onSurface.withValues(alpha: 0.6), fontSize: 13)),
                  ],
                ),
              ],
            ),
          ),
        Container(
          decoration: BoxDecoration(
            color: cs.surfaceContainerHighest,
            borderRadius: BorderRadius.circular(12),
          ),
          child: TextField(
            controller: _passwordController,
            obscureText: _obscurePassword,
            style: TextStyle(color: cs.onSurface, fontSize: 16),
            decoration: InputDecoration(
              hintText: 'Пароль',
              hintStyle: TextStyle(color: cs.onSurface.withValues(alpha: 0.4), fontSize: 16),
              prefixIcon: Icon(Icons.lock_rounded, color: cs.onSurface.withValues(alpha: 0.4)),
              suffixIcon: IconButton(
                icon: Icon(
                    _obscurePassword ? Icons.visibility_off_rounded : Icons.visibility_rounded,
                    color: cs.onSurface.withValues(alpha: 0.4)),
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
          child: FilledButton(
            onPressed: api.isLoading ? null : _loginWithPassword,
            child: const Text('Войти',
                style: TextStyle(fontSize: 16, fontWeight: FontWeight.w600)),
          ),
        ),
        TextButton(
          onPressed: () => setState(
              () { _showPassword = false; _showMethodSelection = _availableMethods.isNotEmpty; }),
          child: Text('Другие способы входа',
              style: TextStyle(color: cs.onSurface.withValues(alpha: 0.6), fontSize: 14)),
        ),
      ],
    );
  }

  Widget _buildMethodSelection(VKApiService api, ColorScheme cs) {
    return Column(
      children: [
        Text('Выберите способ входа',
            style: TextStyle(color: cs.onSurface, fontSize: 18, fontWeight: FontWeight.w600)),
        const SizedBox(height: 20),
        ..._availableMethods.map((method) => _buildMethodButton(api, method, cs)),
        const SizedBox(height: 16),
        TextButton(
          onPressed: () => setState(
              () { _showMethodSelection = false; _showPassword = false; _showCodeInput = false; }),
          child: Text('Назад',
              style: TextStyle(color: cs.onSurface.withValues(alpha: 0.6), fontSize: 14)),
        ),
      ],
    );
  }

  Widget _buildMethodButton(VKApiService api, VerificationMethod method, ColorScheme cs) {
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
              color: cs.surfaceContainerHighest,
              borderRadius: BorderRadius.circular(12),
            ),
            child: Row(
              children: [
                Icon(icon, color: cs.primary, size: 24),
                const SizedBox(width: 16),
                Expanded(
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(method.displayName,
                          style: TextStyle(
                              color: cs.onSurface, fontSize: 15, fontWeight: FontWeight.w500)),
                      if (method.description.isNotEmpty)
                        Text(method.description,
                            style:
                                TextStyle(color: cs.onSurface.withValues(alpha: 0.6), fontSize: 12)),
                    ],
                  ),
                ),
                Icon(Icons.chevron_right_rounded,
                    color: cs.onSurface.withValues(alpha: 0.4)),
              ],
            ),
          ),
        ),
      ),
    );
  }

  Widget _buildCodeInput(VKApiService api, ColorScheme cs) {
    return Column(
      children: [
        Text('Введите код подтверждения',
            style: TextStyle(color: cs.onSurface, fontSize: 18, fontWeight: FontWeight.w600)),
        const SizedBox(height: 8),
        Text('Код отправлен. Проверьте устройство.',
            style: TextStyle(color: cs.onSurface.withValues(alpha: 0.6), fontSize: 14)),
        const SizedBox(height: 24),
        Container(
          decoration: BoxDecoration(
            color: cs.surfaceContainerHighest,
            borderRadius: BorderRadius.circular(12),
          ),
          child: TextField(
            controller: _codeController,
            keyboardType: TextInputType.number,
            textAlign: TextAlign.center,
            style: TextStyle(color: cs.onSurface, fontSize: 24, letterSpacing: 8),
            decoration: InputDecoration(
              hintText: '000000',
              hintStyle:
                  TextStyle(color: cs.onSurface.withValues(alpha: 0.4), fontSize: 24, letterSpacing: 8),
              border: InputBorder.none,
              contentPadding: const EdgeInsets.symmetric(horizontal: 16, vertical: 20),
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
          child: FilledButton(
            onPressed: api.isLoading ? null : _confirmCode,
            child: const Text('Подтвердить',
                style: TextStyle(fontSize: 16, fontWeight: FontWeight.w600)),
          ),
        ),
        TextButton(
          onPressed: () => setState(() { _showCodeInput = false; _codeController.clear(); }),
          child: Text('Назад',
              style: TextStyle(color: cs.onSurface.withValues(alpha: 0.6), fontSize: 14)),
        ),
      ],
    );
  }

  Widget _buildTokenInput(VKApiService api, ColorScheme cs) {
    return Column(
      children: [
        Container(
          padding: const EdgeInsets.all(16),
          decoration: BoxDecoration(
            color: cs.primaryContainer.withValues(alpha: 0.2),
            borderRadius: BorderRadius.circular(12),
          ),
          child: Row(
            children: [
              Icon(Icons.info_outline, color: cs.primary, size: 20),
              const SizedBox(width: 12),
              Expanded(
                child: Text(
                  'Вставьте access_token, полученный от VK. '
                  'Можно получить через VK Admin или Kate Mobile.',
                  style: TextStyle(color: cs.onSurface.withValues(alpha: 0.6), fontSize: 12),
                ),
              ),
            ],
          ),
        ),
        const SizedBox(height: 16),
        Container(
          decoration: BoxDecoration(
            color: cs.surfaceContainerHighest,
            borderRadius: BorderRadius.circular(12),
          ),
          child: TextField(
            controller: _tokenController,
            style: TextStyle(color: cs.onSurface, fontSize: 14, fontFamily: 'monospace'),
            decoration: InputDecoration(
              hintText: 'vk1.a.xxxxx...',
              hintStyle: TextStyle(color: cs.onSurface.withValues(alpha: 0.4), fontSize: 14),
              prefixIcon: Icon(Icons.key_rounded, color: cs.onSurface.withValues(alpha: 0.4)),
              border: InputBorder.none,
              contentPadding: const EdgeInsets.symmetric(horizontal: 16, vertical: 16),
            ),
            textInputAction: TextInputAction.go,
            onSubmitted: (_) => _loginWithToken(),
          ),
        ),
        const SizedBox(height: 16),
        SizedBox(
          width: double.infinity,
          height: 52,
          child: FilledButton(
            onPressed: api.isLoading ? null : _loginWithToken,
            child: const Text('Войти по токену',
                style: TextStyle(fontSize: 16, fontWeight: FontWeight.w600)),
          ),
        ),
      ],
    );
  }
}