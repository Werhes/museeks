import 'package:flutter_test/flutter_test.dart';
import 'package:museeks/main.dart';

void main() {
  testWidgets('Museeks app smoke test', (WidgetTester tester) async {
    await tester.pumpWidget(const MuseeksApp());
    expect(find.text('Museeks'), findsOneWidget);
  });
}
