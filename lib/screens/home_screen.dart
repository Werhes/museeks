import 'dart:io';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart';
import '../services/vk_api_service.dart';
import '../models/track.dart';
import '../widgets/bottom_player.dart';
import 'main_tab_screen.dart';
import 'search_screen.dart';
import 'favorites_screen.dart';
import 'settings_screen.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({super.key});

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  int _currentTabIndex = 0;

  final List<Widget> _screens = [
    const MainTabScreen(),
    const SearchScreen(),
    const FavoritesScreen(),
  ];

  @override
  void initState() {
    super.initState();
    WidgetsBinding.instance.addPostFrameCallback((_) {
      context.read<AudioProvider>().loadTracks();
    });
  }

  @override
  Widget build(BuildContext context) {
    final cs = Theme.of(context).colorScheme;
    final api = context.watch<VKApiService>();
    final user = api.currentUser;
    final isDesktop = Platform.isWindows || Platform.isLinux || Platform.isMacOS;

    return Scaffold(
      backgroundColor: cs.surface,
      body: SafeArea(
        child: Column(
          children: [
            _buildTopBar(user, cs),
            Expanded(
              child: IndexedStack(index: _currentTabIndex, children: _screens),
            ),
            const BottomPlayer(),
          ],
        ),
      ),
      bottomNavigationBar: isDesktop
          ? null // На десктопе используем боковую панель
          : _buildBottomNav(cs),
      // На десктопе добавляем боковую навигацию
      drawer: isDesktop ? _buildDesktopDrawer(cs) : null,
    );
  }

  Widget _buildTopBar(VKUser? user, ColorScheme cs) {
    return Container(
      padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 12),
      color: cs.surfaceContainerLow,
      child: Row(
        children: [
          CircleAvatar(
            radius: 18,
            backgroundColor: cs.primaryContainer,
            backgroundImage: user?.photoUrl != null
                ? NetworkImage(user!.photoUrl!)
                : null,
            child: user?.photoUrl == null
                ? Icon(Icons.person_rounded, color: cs.onPrimaryContainer, size: 20)
                : null,
          ),
          const SizedBox(width: 12),
          Expanded(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(user?.fullName ?? 'Museeks',
                    style: TextStyle(
                        color: cs.onSurface, fontSize: 16, fontWeight: FontWeight.w600)),
                Text('Моя музыка',
                    style: TextStyle(
                        color: cs.onSurface.withValues(alpha: 0.6), fontSize: 12)),
              ],
            ),
          ),
          // Кнопка настроек — теперь работает!
          IconButton(
            icon: Icon(Icons.settings_rounded,
                color: cs.onSurface.withValues(alpha: 0.5), size: 22),
            onPressed: () {
              Navigator.of(context).push(
                MaterialPageRoute(builder: (context) => const SettingsScreen()),
              );
            },
          ),
        ],
      ),
    );
  }

  Widget _buildBottomNav(ColorScheme cs) {
    return Container(
      color: cs.surfaceContainerLow,
      child: SafeArea(
        top: false,
        child: Padding(
          padding: const EdgeInsets.symmetric(vertical: 8),
          child: Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              _buildNavItem(icon: Icons.home_rounded, label: 'Главная', index: 0, cs: cs),
              _buildNavItem(icon: Icons.search_rounded, label: 'Поиск', index: 1, cs: cs),
              _buildNavItem(icon: Icons.favorite_rounded, label: 'Любимые', index: 2, cs: cs),
            ],
          ),
        ),
      ),
    );
  }

  /// Боковое меню для десктопа (как во FlutterVK)
  Widget _buildDesktopDrawer(ColorScheme cs) {
    return Drawer(
      backgroundColor: cs.surface,
      child: SafeArea(
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            // Шапка
            Container(
              padding: const EdgeInsets.all(16),
              color: cs.surfaceContainerLow,
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  CircleAvatar(
                    radius: 24,
                    backgroundColor: cs.primaryContainer,
                    child: Icon(Icons.music_note_rounded, color: cs.onPrimaryContainer, size: 28),
                  ),
                  const SizedBox(height: 12),
                  Text('Museeks',
                      style: TextStyle(
                          color: cs.onSurface, fontSize: 20, fontWeight: FontWeight.bold)),
                  const SizedBox(height: 4),
                  Text('VK Music Player',
                      style: TextStyle(
                          color: cs.onSurface.withValues(alpha: 0.6), fontSize: 13)),
                ],
              ),
            ),
            const SizedBox(height: 8),

            // Пункты меню
            _buildDrawerItem(cs, icon: Icons.home_rounded, title: 'Главная', index: 0),
            _buildDrawerItem(cs, icon: Icons.search_rounded, title: 'Поиск', index: 1),
            _buildDrawerItem(cs, icon: Icons.favorite_rounded, title: 'Любимые', index: 2),
            const Divider(height: 16),
            _buildDrawerItem(cs, icon: Icons.settings_rounded, title: 'Настройки', index: -1, isSettings: true),
            const Spacer(),

            // Выход
            Padding(
              padding: const EdgeInsets.all(16),
              child: TextButton.icon(
                icon: Icon(Icons.logout_rounded, color: cs.onSurface.withValues(alpha: 0.5), size: 18),
                label: Text('Выйти',
                    style: TextStyle(color: cs.onSurface.withValues(alpha: 0.5), fontSize: 13)),
                onPressed: () {
                  context.read<VKApiService>().logout();
                  Navigator.of(context).pushNamedAndRemoveUntil('/login', (route) => false);
                },
              ),
            ),
          ],
        ),
      ),
    );
  }

  Widget _buildDrawerItem(ColorScheme cs, {
    required IconData icon,
    required String title,
    required int index,
    bool isSettings = false,
  }) {
    final isActive = !isSettings && _currentTabIndex == index;
    return ListTile(
      leading: Icon(icon,
          color: isActive ? cs.primary : cs.onSurface.withValues(alpha: 0.7), size: 22),
      title: Text(title,
          style: TextStyle(
              color: isActive ? cs.primary : cs.onSurface,
              fontSize: 15,
              fontWeight: isActive ? FontWeight.w600 : FontWeight.normal)),
      selected: isActive,
      selectedTileColor: cs.primaryContainer.withValues(alpha: 0.3),
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
      onTap: () {
        if (isSettings) {
          Navigator.of(context).pop(); // закрываем drawer
          Navigator.of(context).push(
            MaterialPageRoute(builder: (context) => const SettingsScreen()),
          );
        } else {
          setState(() => _currentTabIndex = index);
          Navigator.of(context).pop(); // закрываем drawer
        }
      },
    );
  }

  Widget _buildNavItem(
      {required IconData icon, required String label, required int index, required ColorScheme cs}) {
    final isActive = _currentTabIndex == index;
    return GestureDetector(
      onTap: () => setState(() => _currentTabIndex = index),
      behavior: HitTestBehavior.opaque,
      child: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
          Icon(icon,
              color: isActive ? cs.primary : cs.onSurface.withValues(alpha: 0.4), size: 24),
          const SizedBox(height: 4),
          Text(label,
              style: TextStyle(
                  color: isActive ? cs.primary : cs.onSurface.withValues(alpha: 0.4),
                  fontSize: 11,
                  fontWeight: isActive ? FontWeight.w600 : FontWeight.normal)),
        ],
      ),
    );
  }
}