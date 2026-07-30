import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:provider/provider.dart';
import 'services/vk_api_service.dart';
import 'providers/audio_provider.dart';
import 'screens/login_screen.dart';
import 'screens/home_screen.dart';

void main() {
  WidgetsFlutterBinding.ensureInitialized();

  // Настройка статус-бара
  SystemChrome.setSystemUIOverlayStyle(const SystemUiOverlayStyle(
    statusBarColor: Colors.transparent,
    statusBarIconBrightness: Brightness.light,
  ));

  // Создаем сервисы
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

class MuseeksApp extends StatelessWidget {
  const MuseeksApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Museeks',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        brightness: Brightness.dark,
        primaryColor: const Color(0xFF6C5CE7),
        scaffoldBackgroundColor: const Color(0xFF0D0E1A),
        colorScheme: const ColorScheme.dark(
          primary: Color(0xFF6C5CE7),
          secondary: Color(0xFFA29BFE),
          surface: Color(0xFF1A1B2E),
        ),
        fontFamily: 'SF Pro Display',
      ),
      initialRoute: '/login',
      routes: {
        '/login': (context) => const LoginScreen(),
        '/home': (context) => const HomeScreen(),
      },
    );
  }
}
