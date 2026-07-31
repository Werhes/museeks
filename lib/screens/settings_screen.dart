import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../services/vk_api_service.dart';
import '../services/discord_rpc_service.dart';

/// Экран настроек в стиле FlutterVK
class SettingsScreen extends StatefulWidget {
  const SettingsScreen({super.key});

  @override
  State<SettingsScreen> createState() => _SettingsScreenState();
}

class _SettingsScreenState extends State<SettingsScreen> {
  @override
  Widget build(BuildContext context) {
    final cs = Theme.of(context).colorScheme;
    return Scaffold(
      backgroundColor: cs.surface,
      appBar: AppBar(
        backgroundColor: Colors.transparent,
        elevation: 0,
        leading: IconButton(
          icon: Icon(Icons.adaptive.arrow_back, color: cs.onSurface),
          onPressed: () => Navigator.of(context).pop(),
        ),
        title: Text('Настройки',
            style: TextStyle(color: cs.onSurface, fontWeight: FontWeight.w600)),
      ),
      body: Consumer<VKApiService>(
        builder: (context, api, child) {
          return ListView(
            padding: const EdgeInsets.symmetric(vertical: 8),
            children: [
              // Профиль
              _buildProfileSection(cs, api),
              const Divider(height: 1),

              // Воспроизведение
              _buildSectionHeader(cs, 'Воспроизведение'),
              _buildSettingTile(
                cs,
                icon: Icons.shuffle_rounded,
                title: 'Перемешивать при включении',
                subtitle: 'Автоматически включать перемешивание',
                trailing: Switch(
                  value: true,
                  onChanged: (v) {},
                  activeTrackColor: cs.primary,
                ),
              ),
              _buildSettingTile(
                cs,
                icon: Icons.repeat_rounded,
                title: 'Повтор',
                subtitle: 'Режим повтора по умолчанию',
                trailing: Text('Выкл',
                    style: TextStyle(color: cs.onSurface.withValues(alpha: 0.6))),
                onTap: () {},
              ),
              const Divider(height: 1),

              // Звук
              _buildSectionHeader(cs, 'Звук'),
              _buildSettingTile(
                cs,
                icon: Icons.volume_up_rounded,
                title: 'Громкость',
                subtitle: 'Уровень громкости по умолчанию',
                trailing: Text('100%',
                    style: TextStyle(color: cs.onSurface.withValues(alpha: 0.6))),
                onTap: () {},
              ),
              _buildSettingTile(
                cs,
                icon: Icons.equalizer_rounded,
                title: 'Эквалайзер',
                subtitle: 'Настройка звучания',
                trailing: Icon(Icons.chevron_right_rounded,
                    color: cs.onSurface.withValues(alpha: 0.4)),
                onTap: () {},
              ),
              const Divider(height: 1),

              // Интеграции
              _buildSectionHeader(cs, 'Интеграции'),
              _buildSettingTile(
                cs,
                icon: Icons.discord_rounded,
                title: 'Discord RPC',
                subtitle: DiscordRPCService.isEnabled
                    ? 'Показывать текущий трек в Discord'
                    : 'Отображать статус в Discord',
                trailing: Switch(
                  value: DiscordRPCService.isEnabled,
                  onChanged: (v) {
                    setState(() {
                      if (v) {
                        DiscordRPCService.enable();
                      } else {
                        DiscordRPCService.disable();
                      }
                    });
                  },
                  activeTrackColor: cs.primary,
                ),
              ),
              const Divider(height: 1),

              // Внешний вид
              _buildSectionHeader(cs, 'Внешний вид'),
              _buildSettingTile(
                cs,
                icon: Icons.dark_mode_rounded,
                title: 'Тёмная тема',
                subtitle: 'Следовать системной теме',
                trailing: Text('Системная',
                    style: TextStyle(color: cs.onSurface.withValues(alpha: 0.6))),
                onTap: () {},
              ),
              _buildSettingTile(
                cs,
                icon: Icons.palette_rounded,
                title: 'Акцентный цвет',
                subtitle: 'Цветовая схема приложения',
                trailing: Container(
                  width: 24,
                  height: 24,
                  decoration: BoxDecoration(
                    color: cs.primary,
                    shape: BoxShape.circle,
                  ),
                ),
                onTap: () {},
              ),
              const Divider(height: 1),

              // Кэш и данные
              _buildSectionHeader(cs, 'Кэш и данные'),
              _buildSettingTile(
                cs,
                icon: Icons.storage_rounded,
                title: 'Очистить кэш',
                subtitle: 'Освободить место на устройстве',
                trailing: Icon(Icons.chevron_right_rounded,
                    color: cs.onSurface.withValues(alpha: 0.4)),
                onTap: () => _showClearCacheDialog(context, cs),
              ),
              const Divider(height: 1),

              // Аккаунт
              _buildSectionHeader(cs, 'Аккаунт'),
              _buildSettingTile(
                cs,
                icon: Icons.logout_rounded,
                title: 'Выйти из аккаунта',
                subtitle: 'Потребуется повторный вход',
                trailing: Icon(Icons.chevron_right_rounded,
                    color: cs.onSurface.withValues(alpha: 0.4)),
                onTap: () => _showLogoutDialog(context, cs, api),
              ),
              const SizedBox(height: 32),

              // Версия
              Center(
                child: Column(
                  children: [
                    Text('Museeks',
                        style: TextStyle(
                            color: cs.onSurface.withValues(alpha: 0.4),
                            fontSize: 14,
                            fontWeight: FontWeight.w600)),
                    const SizedBox(height: 4),
                    Text('Версия 1.0.0',
                        style: TextStyle(
                            color: cs.onSurface.withValues(alpha: 0.3),
                            fontSize: 12)),
                  ],
                ),
              ),
              const SizedBox(height: 16),
            ],
          );
        },
      ),
    );
  }

  Widget _buildProfileSection(ColorScheme cs, VKApiService api) {
    final user = api.currentUser;
    return Container(
      padding: const EdgeInsets.all(16),
      child: Row(
        children: [
          CircleAvatar(
            radius: 28,
            backgroundColor: cs.primaryContainer,
            backgroundImage: user?.photoUrl != null
                ? NetworkImage(user!.photoUrl!)
                : null,
            child: user?.photoUrl == null
                ? Icon(Icons.person_rounded, color: cs.onPrimaryContainer, size: 28)
                : null,
          ),
          const SizedBox(width: 16),
          Expanded(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(user?.fullName ?? 'Пользователь',
                    style: TextStyle(
                        color: cs.onSurface, fontSize: 18, fontWeight: FontWeight.w600)),
                const SizedBox(height: 4),
                Text('Аккаунт VK',
                    style: TextStyle(
                        color: cs.onSurface.withValues(alpha: 0.6), fontSize: 13)),
              ],
            ),
          ),
          Icon(Icons.chevron_right_rounded,
              color: cs.onSurface.withValues(alpha: 0.4)),
        ],
      ),
    );
  }

  Widget _buildSectionHeader(ColorScheme cs, String title) {
    return Padding(
      padding: const EdgeInsets.fromLTRB(16, 16, 16, 4),
      child: Text(title,
          style: TextStyle(
              color: cs.primary,
              fontSize: 13,
              fontWeight: FontWeight.w600,
              letterSpacing: 0.5)),
    );
  }

  Widget _buildSettingTile(
    ColorScheme cs, {
    required IconData icon,
    required String title,
    String? subtitle,
    Widget? trailing,
    VoidCallback? onTap,
  }) {
    return ListTile(
      leading: Icon(icon, color: cs.onSurface.withValues(alpha: 0.7), size: 22),
      title: Text(title,
          style: TextStyle(color: cs.onSurface, fontSize: 15)),
      subtitle: subtitle != null
          ? Text(subtitle,
              style: TextStyle(
                  color: cs.onSurface.withValues(alpha: 0.5), fontSize: 12))
          : null,
      trailing: trailing,
      onTap: onTap,
      dense: true,
    );
  }

  void _showClearCacheDialog(BuildContext context, ColorScheme cs) {
    showDialog(
      context: context,
      builder: (ctx) => AlertDialog(
        backgroundColor: cs.surface,
        title: Text('Очистить кэш?',
            style: TextStyle(color: cs.onSurface)),
        content: Text('Будут удалены все временные файлы и кэш обложек.',
            style: TextStyle(color: cs.onSurface.withValues(alpha: 0.7))),
        actions: [
          TextButton(
            onPressed: () => Navigator.of(ctx).pop(),
            child: Text('Отмена',
                style: TextStyle(color: cs.onSurface.withValues(alpha: 0.6))),
          ),
          FilledButton(
            onPressed: () {
              Navigator.of(ctx).pop();
              ScaffoldMessenger.of(context).showSnackBar(
                const SnackBar(
                    content: Text('Кэш очищен'),
                    duration: Duration(seconds: 2)),
              );
            },
            child: const Text('Очистить'),
          ),
        ],
      ),
    );
  }

  void _showLogoutDialog(BuildContext context, ColorScheme cs, VKApiService api) {
    showDialog(
      context: context,
      builder: (ctx) => AlertDialog(
        backgroundColor: cs.surface,
        title: Text('Выйти из аккаунта?',
            style: TextStyle(color: cs.onSurface)),
        content: Text('Для прослушивания музыки потребуется войти снова.',
            style: TextStyle(color: cs.onSurface.withValues(alpha: 0.7))),
        actions: [
          TextButton(
            onPressed: () => Navigator.of(ctx).pop(),
            child: Text('Отмена',
                style: TextStyle(color: cs.onSurface.withValues(alpha: 0.6))),
          ),
          FilledButton(
            onPressed: () {
              api.logout();
              Navigator.of(ctx).pop();
              Navigator.of(context).pushNamedAndRemoveUntil('/login', (route) => false);
            },
            style: FilledButton.styleFrom(backgroundColor: cs.error),
            child: Text('Выйти',
                style: TextStyle(color: cs.onError)),
          ),
        ],
      ),
    );
  }
}