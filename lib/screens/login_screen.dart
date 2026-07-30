import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../services/vk_api_service.dart';

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
    final password = _passwordController.text;

    if (password.isEmpty) return;

    final success = await api.loginWithPassword(password);

    if (success && mounted) {
      Navigator.of(context).pushReplacementNamed('/home');
    }
  }

  Future<void> _requestCode(AuthMethod method) async {
    final api = context.read<VKApiService>();
    final success = await api.requestCode(method);

    if (success && mounted) {
      setState(() {
        _showCodeInput = true;
      });
    }
  }

  Future<void> _confirmCode() async {
    final api = context.read<VKApiService>();
    final code = _codeController.text.trim();

    if (code.isEmpty) return;

    final success = await api.confirmCode(code);

    if (success && mounted) {
      Navigator.of(context).pushReplacementNamed('/home');
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color(0xFF0D0E1A),
      body: SafeArea(
        child: Center(
          child: SingleChildScrollView(
            padding: const EdgeInsets.symmetric(horizontal: 32),
            child: Consumer<VKApiService>(
              builder: (context, api, child) {
                return Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    _buildLogo(),
                    const SizedBox(height: 48),

                    if (!_showPassword && !_showCodeInput && !_showMethodSelection)
                      _buildPhoneInput(api),
                    if (_showPassword)
                      _buildPasswordInput(api),
                    if (_showMethodSelection && !_showCodeInput)
                      _buildMethodSelection(api),
                    if (_showCodeInput)
                      _buildCodeInput(api),

                    if (api.error != null)
                      Padding(
                        padding: const EdgeInsets.only(top: 16),
                        child: Text(
                          api.error!,
                          style: const TextStyle(
                            color: Color(0xFFFF6B6B),
                            fontSize: 13,
                          ),
                        ),
                      ),

                    if (api.isLoading)
                      const Padding(
                        padding: EdgeInsets.only(top: 24),
                        child: CircularProgressIndicator(
                          color: Color(0xFF6C5CE7),
                        ),
                      ),
                  ],
                );
              },
            ),
          ),
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
            gradient: const LinearGradient(
              colors: [Color(0xFF6C5CE7), Color(0xFFA29BFE)],
              begin: Alignment.topLeft,
              end: Alignment.bottomRight,
            ),
            borderRadius: BorderRadius.circular(20),
            boxShadow: [
              BoxShadow(
                color: const Color(0xFF6C5CE7).withValues(alpha: 0.3),
                blurRadius: 20,
                offset: const Offset(0, 8),
              ),
            ],
          ),
          child: const Icon(
            Icons.music_note_rounded,
            color: Colors.white,
            size: 40,
          ),
        ),
        const SizedBox(height: 16),
        const Text(
          'Museeks',
          style: TextStyle(
            color: Colors.white,
            fontSize: 28,
            fontWeight: FontWeight.bold,
            letterSpacing: -0.5,
          ),
        ),
        const SizedBox(height: 8),
        Text(
          'Войдите в VK для прослушивания музыки',
          style: TextStyle(
            color: Colors.white.withValues(alpha: 0.4),
            fontSize: 14,
          ),
        ),
      ],
    );
  }

  Widget _buildPhoneInput(VKApiService api) {
    return Column(
      children: [
        Container(
          decoration: BoxDecoration(
            color: const Color(0xFF1A1B2E),
            borderRadius: BorderRadius.circular(12),
            border: Border.all(
              color: const Color(0xFF2D2E4A),
            ),
          ),
          child: TextField(
            controller: _phoneController,
            focusNode: _phoneFocusNode,
            keyboardType: TextInputType.phone,
            style: const TextStyle(color: Colors.white, fontSize: 16),
            decoration: InputDecoration(
              hintText: 'Номер телефона или email',
              hintStyle: TextStyle(
                color: Colors.white.withValues(alpha: 0.3),
                fontSize: 16,
              ),
              prefixIcon: Icon(
                Icons.phone_android_rounded,
                color: Colors.white.withValues(alpha: 0.3),
              ),
              border: InputBorder.none,
              contentPadding: const EdgeInsets.symmetric(
                horizontal: 16,
                vertical: 16,
              ),
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
              backgroundColor: const Color(0xFF6C5CE7),
              disabledBackgroundColor: const Color(0xFF2D2E4A),
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(12),
              ),
              elevation: 0,
            ),
            child: const Text(
              'Продолжить',
              style: TextStyle(
                color: Colors.white,
                fontSize: 16,
                fontWeight: FontWeight.w600,
              ),
            ),
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
            decoration: BoxDecoration(
              color: const Color(0xFF1A1B2E),
              borderRadius: BorderRadius.circular(12),
            ),
            child: Row(
              children: [
                CircleAvatar(
                  radius: 24,
                  backgroundColor: const Color(0xFF2D2E4A),
                  backgroundImage: _profile!['photo'] != null
                      ? NetworkImage(_profile!['photo'] as String)
                      : null,
                  child: _profile!['photo'] == null
                      ? const Icon(Icons.person, color: Color(0xFF6C5CE7))
                      : null,
                ),
                const SizedBox(width: 12),
                Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(
                      _profile!['first_name'] as String? ?? 'Незнакомец',
                      style: const TextStyle(
                        color: Colors.white,
                        fontSize: 16,
                        fontWeight: FontWeight.w500,
                      ),
                    ),
                    Text(
                      _phoneController.text,
                      style: TextStyle(
                        color: Colors.white.withValues(alpha: 0.4),
                        fontSize: 13,
                      ),
                    ),
                  ],
                ),
              ],
            ),
          ),

        Container(
          decoration: BoxDecoration(
            color: const Color(0xFF1A1B2E),
            borderRadius: BorderRadius.circular(12),
            border: Border.all(
              color: const Color(0xFF2D2E4A),
            ),
          ),
          child: TextField(
            controller: _passwordController,
            obscureText: _obscurePassword,
            style: const TextStyle(color: Colors.white, fontSize: 16),
            decoration: InputDecoration(
              hintText: 'Пароль',
              hintStyle: TextStyle(
                color: Colors.white.withValues(alpha: 0.3),
                fontSize: 16,
              ),
              prefixIcon: Icon(
                Icons.lock_rounded,
                color: Colors.white.withValues(alpha: 0.3),
              ),
              suffixIcon: IconButton(
                icon: Icon(
                  _obscurePassword
                      ? Icons.visibility_off_rounded
                      : Icons.visibility_rounded,
                  color: Colors.white.withValues(alpha: 0.3),
                ),
                onPressed: () {
                  setState(() => _obscurePassword = !_obscurePassword);
                },
              ),
              border: InputBorder.none,
              contentPadding: const EdgeInsets.symmetric(
                horizontal: 16,
                vertical: 16,
              ),
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
            style: ElevatedButton.styleFrom(
              backgroundColor: const Color(0xFF6C5CE7),
              disabledBackgroundColor: const Color(0xFF2D2E4A),
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(12),
              ),
              elevation: 0,
            ),
            child: const Text(
              'Войти',
              style: TextStyle(
                color: Colors.white,
                fontSize: 16,
                fontWeight: FontWeight.w600,
              ),
            ),
          ),
        ),
        TextButton(
          onPressed: () {
            setState(() {
              _showPassword = false;
              _showMethodSelection = _availableMethods.isNotEmpty;
            });
          },
          child: Text(
            'Другие способы входа',
            style: TextStyle(
              color: Colors.white.withValues(alpha: 0.5),
              fontSize: 14,
            ),
          ),
        ),
      ],
    );
  }

  Widget _buildMethodSelection(VKApiService api) {
    return Column(
      children: [
        const Text(
          'Выберите способ входа',
          style: TextStyle(
            color: Colors.white,
            fontSize: 18,
            fontWeight: FontWeight.w600,
          ),
        ),
        const SizedBox(height: 20),
        ..._availableMethods.map((method) => _buildMethodButton(api, method)),
        const SizedBox(height: 16),
        TextButton(
          onPressed: () {
            setState(() {
              _showMethodSelection = false;
              _showPassword = false;
              _showCodeInput = false;
            });
          },
          child: Text(
            'Назад',
            style: TextStyle(
              color: Colors.white.withValues(alpha: 0.5),
              fontSize: 14,
            ),
          ),
        ),
      ],
    );
  }

  Widget _buildMethodButton(VKApiService api, VerificationMethod method) {
    IconData icon;
    switch (method.method) {
      case AuthMethod.sms:
        icon = Icons.sms_rounded;
        break;
      case AuthMethod.push:
        icon = Icons.notifications_active_rounded;
        break;
      case AuthMethod.callReset:
        icon = Icons.phone_in_talk_rounded;
        break;
      case AuthMethod.reserveCode:
        icon = Icons.key_rounded;
        break;
      case AuthMethod.codegen:
        icon = Icons.app_registration_rounded;
        break;
      case AuthMethod.email:
        icon = Icons.email_rounded;
        break;
      case AuthMethod.passkey:
        icon = Icons.fingerprint;
        break;
      default:
        icon = Icons.help_outline_rounded;
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
              color: const Color(0xFF1A1B2E),
              borderRadius: BorderRadius.circular(12),
              border: Border.all(
                color: const Color(0xFF2D2E4A),
              ),
            ),
            child: Row(
              children: [
                Icon(icon, color: const Color(0xFF6C5CE7), size: 24),
                const SizedBox(width: 16),
                Expanded(
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(
                        method.displayName,
                        style: const TextStyle(
                          color: Colors.white,
                          fontSize: 15,
                          fontWeight: FontWeight.w500,
                        ),
                      ),
                      if (method.description.isNotEmpty)
                        Text(
                          method.description,
                          style: TextStyle(
                            color: Colors.white.withValues(alpha: 0.4),
                            fontSize: 12,
                          ),
                        ),
                    ],
                  ),
                ),
                Icon(
                  Icons.chevron_right_rounded,
                  color: Colors.white.withValues(alpha: 0.3),
                ),
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
        const Text(
          'Введите код подтверждения',
          style: TextStyle(
            color: Colors.white,
            fontSize: 18,
            fontWeight: FontWeight.w600,
          ),
        ),
        const SizedBox(height: 8),
        Text(
          'Код отправлен. Проверьте устройство.',
          style: TextStyle(
            color: Colors.white.withValues(alpha: 0.4),
            fontSize: 14,
          ),
        ),
        const SizedBox(height: 24),
        Container(
          decoration: BoxDecoration(
            color: const Color(0xFF1A1B2E),
            borderRadius: BorderRadius.circular(12),
            border: Border.all(
              color: const Color(0xFF2D2E4A),
            ),
          ),
          child: TextField(
            controller: _codeController,
            keyboardType: TextInputType.number,
            textAlign: TextAlign.center,
            style: const TextStyle(
              color: Colors.white,
              fontSize: 24,
              letterSpacing: 8,
            ),
            decoration: InputDecoration(
              hintText: '000000',
              hintStyle: TextStyle(
                color: Colors.white.withValues(alpha: 0.2),
                fontSize: 24,
                letterSpacing: 8,
              ),
              border: InputBorder.none,
              contentPadding: const EdgeInsets.symmetric(
                horizontal: 16,
                vertical: 20,
              ),
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
            style: ElevatedButton.styleFrom(
              backgroundColor: const Color(0xFF6C5CE7),
              disabledBackgroundColor: const Color(0xFF2D2E4A),
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(12),
              ),
              elevation: 0,
            ),
            child: const Text(
              'Подтвердить',
              style: TextStyle(
                color: Colors.white,
                fontSize: 16,
                fontWeight: FontWeight.w600,
              ),
            ),
          ),
        ),
        TextButton(
          onPressed: () {
            setState(() {
              _showCodeInput = false;
              _codeController.clear();
            });
          },
          child: Text(
            'Назад',
            style: TextStyle(
              color: Colors.white.withValues(alpha: 0.5),
              fontSize: 14,
            ),
          ),
        ),
      ],
    );
  }
}