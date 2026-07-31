import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:provider/provider.dart';
import 'services/vk_api_service.dart';
import 'providers/audio_provider.dart';
import 'screens/login_screen.dart';
import 'screens/home_screen.dart';

void main() {
  WidgetsFlutterBinding.ensureInitialized();

  SystemChrome.setSystemUIOverlayStyle(const SystemUiOverlayStyle(
    statusBarColor: Colors.transparent,
    statusBarIconBrightness: Brightness.dark,
  ));

  final vkApiService = VKApiService();

  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider.value(value: vkApiService),
        ChangeNotifierProvider(
          create: (context) => AudioProvider(vkApiService),
        ),
      ],
      child: const MuseeksApp(),
    ),
  );
}

// Тема Museeks — Material 3 в стиле FlutterVK
class MuseeksTheme {
  // Светлая тема
  static const Color lightBackground = Color(0xFFF5F5F5);
  static const Color lightSurface = Color(0xFFFFFFFF);
  static const Color lightPrimary = Color(0xFF6750A4);
  static const Color lightOnPrimary = Color(0xFFFFFFFF);
  static const Color lightSecondary = Color(0xFF625B71);
  static const Color lightSurfaceTint = Color(0xFF6750A4);

  // Тёмная тема
  static const Color darkBackground = Color(0xFF1C1B1F);
  static const Color darkSurface = Color(0xFF2B2930);
  static const Color darkPrimary = Color(0xFFD0BCFF);
  static const Color darkOnPrimary = Color(0xFF381E72);
  static const Color darkSecondary = Color(0xFFCCC2DC);
  static const Color darkSurfaceTint = Color(0xFFD0BCFF);

  static ThemeData get lightTheme {
    return ThemeData(
      useMaterial3: true,
      brightness: Brightness.light,
      colorScheme: const ColorScheme.light(
        primary: lightPrimary,
        onPrimary: lightOnPrimary,
        secondary: lightSecondary,
        surface: lightSurface,
        onSurface: Color(0xFF1C1B1F),
        error: Color(0xFFB3261E),
        onError: Color(0xFFFFFFFF),
        surfaceTint: lightSurfaceTint,
      ),
      appBarTheme: const AppBarTheme(
        centerTitle: true,
        elevation: 0,
        scrolledUnderElevation: 1,
      ),
      cardTheme: CardThemeData(
        elevation: 0,
        shape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(12),
        ),
      ),
      navigationBarTheme: NavigationBarThemeData(
        elevation: 0,
        indicatorShape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(12),
        ),
      ),
    );
  }

  static ThemeData get darkTheme {
    return ThemeData(
      useMaterial3: true,
      brightness: Brightness.dark,
      colorScheme: const ColorScheme.dark(
        primary: darkPrimary,
        onPrimary: darkOnPrimary,
        secondary: darkSecondary,
        surface: darkSurface,
        onSurface: Color(0xFFE6E1E5),
        error: Color(0xFFF2B8B5),
        onError: Color(0xFF601410),
        surfaceTint: darkSurfaceTint,
      ),
      appBarTheme: const AppBarTheme(
        centerTitle: true,
        elevation: 0,
        scrolledUnderElevation: 1,
      ),
      cardTheme: CardThemeData(
        elevation: 0,
        shape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(12),
        ),
      ),
      navigationBarTheme: NavigationBarThemeData(
        elevation: 0,
        indicatorShape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(12),
        ),
      ),
    );
  }
}

class MuseeksApp extends StatelessWidget {
  const MuseeksApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Museeks',
      debugShowCheckedModeBanner: false,
      theme: MuseeksTheme.lightTheme,
      darkTheme: MuseeksTheme.darkTheme,
      themeMode: ThemeMode.system,
      initialRoute: '/login',
      routes: {
        '/login': (context) => const LoginScreen(),
        '/home': (context) => const HomeScreen(),
      },
    );
  }
}
