import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/audio_provider.dart';
import '../services/vk_api_service.dart';
import '../models/track.dart';
import '../widgets/bottom_player.dart';
import '../main.dart';
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
      backgroundColor: VKTheme.background,
      body: SafeArea(
        child: Column(
          children: [
            _buildTopBar(user),
            Expanded(
              child: IndexedStack(index: _currentTabIndex, children: _screens),
            ),
            const BottomPlayer(),
          ],
        ),
      ),
      bottomNavigationBar: _buildBottomNav(),
    );
  }

  Widget _buildTopBar(VKUser? user) {
    return Container(
      padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 12),
      color: VKTheme.surface,
      child: Row(
        children: [
          Container(
            width: 36,
            height: 36,
            decoration: BoxDecoration(
              borderRadius: BorderRadius.circular(10),
              image: user?.photoUrl != null
                  ? DecorationImage(image: NetworkImage(user!.photoUrl!), fit: BoxFit.cover)
                  : null,
              color: VKTheme.primary.withValues(alpha: 0.2),
            ),
            child: user?.photoUrl == null
                ? const Icon(Icons.person_rounded, color: VKTheme.primary, size: 20)
                : null,
          ),
          const SizedBox(width: 12),
          Expanded(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(user?.fullName ?? 'Museeks',
                    style: const TextStyle(color: VKTheme.textPrimary, fontSize: 16, fontWeight: FontWeight.w600)),
                const Text('Моя музыка', style: TextStyle(color: VKTheme.textSecondary, fontSize: 12)),
              ],
            ),
          ),
          IconButton(
            icon: const Icon(Icons.settings_rounded, color: VKTheme.textHint, size: 22),
            onPressed: () {},
          ),
        ],
      ),
    );
  }

  Widget _buildBottomNav() {
    return Container(
      color: VKTheme.surface,
      child: SafeArea(
        top: false,
        child: Padding(
          padding: const EdgeInsets.symmetric(vertical: 8),
          child: Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              _buildNavItem(icon: Icons.home_rounded, label: 'Главная', index: 0),
              _buildNavItem(icon: Icons.search_rounded, label: 'Поиск', index: 1),
              _buildNavItem(icon: Icons.favorite_rounded, label: 'Любимые', index: 2),
            ],
          ),
        ),
      ),
    );
  }

  Widget _buildNavItem({required IconData icon, required String label, required int index}) {
    final isActive = _currentTabIndex == index;
    return GestureDetector(
      onTap: () => setState(() => _currentTabIndex = index),
      behavior: HitTestBehavior.opaque,
      child: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
          Icon(icon, color: isActive ? VKTheme.primary : VKTheme.textHint, size: 24),
          const SizedBox(height: 4),
          Text(label,
              style: TextStyle(
                  color: isActive ? VKTheme.primary : VKTheme.textHint,
                  fontSize: 11,
                  fontWeight: isActive ? FontWeight.w600 : FontWeight.normal)),
        ],
      ),
    );
  }
}