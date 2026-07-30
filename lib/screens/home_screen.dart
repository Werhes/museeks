import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart';
import '../services/vk_api_service.dart';
import '../models/track.dart';
import '../widgets/bottom_player.dart';
import 'main_tab_screen.dart';
import 'search_screen.dart';
import 'favorites_screen.dart';

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
    final api = context.watch<VKApiService>();
    final user = api.currentUser;

    return Scaffold(
      backgroundColor: const Color(0xFF0D0E1A),
      body: SafeArea(
        child: Column(
          children: [
            // Верхняя панель с профилем
            _buildTopBar(user),
            // Основной контент
            Expanded(
              child: IndexedStack(
                index: _currentTabIndex,
                children: _screens,
              ),
            ),
            // Нижний плеер
            const BottomPlayer(),
          ],
        ),
      ),
      // Нижняя навигация
      bottomNavigationBar: _buildBottomNav(),
    );
  }

  Widget _buildTopBar(VKUser? user) {
    return Container(
      padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 12),
      decoration: BoxDecoration(
        color: const Color(0xFF0D0E1A),
        border: Border(
          bottom: BorderSide(color: Colors.white.withValues(alpha: 0.05)),
        ),
      ),
      child: Row(
        children: [
          // Аватар пользователя
          GestureDetector(
            onTap: () {},
            child: Container(
              width: 36,
              height: 36,
              decoration: BoxDecoration(
                borderRadius: BorderRadius.circular(10),
                image: user?.photoUrl != null
                    ? DecorationImage(
                        image: NetworkImage(user!.photoUrl!),
                        fit: BoxFit.cover,
                      )
                    : null,
                color: const Color(0xFF2D2E4A),
              ),
              child: user?.photoUrl == null
                  ? const Icon(
                      Icons.person_rounded,
                      color: Color(0xFF6C5CE7),
                      size: 20,
                    )
                  : null,
            ),
          ),
          const SizedBox(width: 12),
          // Имя пользователя
          Expanded(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(
                  user?.fullName ?? 'Museeks',
                  style: const TextStyle(
                    color: Colors.white,
                    fontSize: 16,
                    fontWeight: FontWeight.w600,
                  ),
                ),
                Text(
                  'Моя музыка',
                  style: TextStyle(
                    color: Colors.white.withValues(alpha: 0.4),
                    fontSize: 12,
                  ),
                ),
              ],
            ),
          ),
          // Кнопка настроек
          IconButton(
            icon: Icon(
              Icons.settings_rounded,
              color: Colors.white.withValues(alpha: 0.5),
              size: 22,
            ),
            onPressed: () {},
          ),
        ],
      ),
    );
  }

  Widget _buildBottomNav() {
    return Container(
      decoration: BoxDecoration(
        color: const Color(0xFF1A1B2E),
        border: Border(
          top: BorderSide(color: Colors.white.withValues(alpha: 0.05)),
        ),
      ),
      child: SafeArea(
        top: false,
        child: Padding(
          padding: const EdgeInsets.symmetric(vertical: 8),
          child: Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              _buildNavItem(
                icon: Icons.home_rounded,
                label: 'Главная',
                index: 0,
              ),
              _buildNavItem(
                icon: Icons.search_rounded,
                label: 'Поиск',
                index: 1,
              ),
              _buildNavItem(
                icon: Icons.favorite_rounded,
                label: 'Любимые',
                index: 2,
              ),
            ],
          ),
        ),
      ),
    );
  }

  Widget _buildNavItem({
    required IconData icon,
    required String label,
    required int index,
  }) {
    final isActive = _currentTabIndex == index;

    return GestureDetector(
      onTap: () {
        setState(() => _currentTabIndex = index);
      },
      behavior: HitTestBehavior.opaque,
      child: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
          Icon(
            icon,
            color: isActive
                ? const Color(0xFF6C5CE7)
                : Colors.white.withValues(alpha: 0.4),
            size: 24,
          ),
          const SizedBox(height: 4),
          Text(
            label,
            style: TextStyle(
              color: isActive
                  ? const Color(0xFF6C5CE7)
                  : Colors.white.withValues(alpha: 0.4),
              fontSize: 11,
              fontWeight: isActive ? FontWeight.w600 : FontWeight.normal,
            ),
          ),
        ],
      ),
    );
  }
}