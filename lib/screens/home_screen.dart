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
    final cs = Theme.of(context).colorScheme;
    final api = context.watch<VKApiService>();
    final user = api.currentUser;

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
      bottomNavigationBar: _buildBottomNav(cs),
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
          IconButton(
            icon: Icon(Icons.settings_rounded,
                color: cs.onSurface.withValues(alpha: 0.5), size: 22),
            onPressed: () {},
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