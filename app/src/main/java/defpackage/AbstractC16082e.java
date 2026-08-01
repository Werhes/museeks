package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16082e {
    public static SharedPreferences appmetrica;
    public static SharedPreferences license;
    public static SharedPreferences purchase;
    public static final C2892e ad = new C2892e(-1609943566, false, new C8580e(13));
    public static final C2892e vip = new C2892e(-156161410, false, new C8580e(14));
    public static final C2892e metrica = new C2892e(-180454170, false, new C8580e(15));

    public static final C11887e ad(Iterable iterable) {
        Object obj;
        List m3577else = AbstractC13480e.m3577else(iterable, new C11797e(23));
        ListIterator listIterator = m3577else.listIterator(m3577else.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            C1577e c1577e = ((C11887e) obj).metrica;
            InterfaceC8614e interfaceC8614e = C11887e.yandex[0];
            if (((Boolean) c1577e.ad).booleanValue()) {
                break;
            }
        }
        return (C11887e) obj;
    }

    public static final void metrica(InterfaceC3477e interfaceC3477e, String str, int i, int i2, String str2) {
        String obj = AbstractC5304e.m1855const(str.substring(i, i2)).toString();
        if (obj.length() == 0) {
            return;
        }
        ((ArrayList) interfaceC3477e.getValue()).add(new C4839e(obj, str2));
    }

    public static final List vip(String str) {
        C6571e c6571e;
        C13664e c13664e = C13664e.f27089e;
        if (str == null) {
            return c13664e;
        }
        int i = 3;
        InterfaceC3477e appmetrica2 = AbstractC18039e.appmetrica(3, new C13564e(12));
        int i2 = 0;
        while (i2 <= AbstractC5304e.crashlytics(str)) {
            InterfaceC3477e appmetrica3 = AbstractC18039e.appmetrica(i, new C13564e(13));
            Integer num = null;
            int i3 = i2;
            while (true) {
                if (i3 <= AbstractC5304e.crashlytics(str)) {
                    char charAt = str.charAt(i3);
                    if (charAt == ',') {
                        ((ArrayList) appmetrica2.getValue()).add(new C16855e(AbstractC5304e.m1855const(str.substring(i2, num != null ? num.intValue() : i3)).toString(), appmetrica3.ad() ? (List) appmetrica3.getValue() : c13664e));
                        i3++;
                    } else if (charAt != ';') {
                        i3++;
                    } else {
                        if (num == null) {
                            num = Integer.valueOf(i3);
                        }
                        int i4 = i3 + 1;
                        int i5 = i4;
                        while (i5 <= AbstractC5304e.crashlytics(str)) {
                            char charAt2 = str.charAt(i5);
                            if (charAt2 == ',' || charAt2 == ';') {
                                metrica(appmetrica3, str, i4, i5, BuildConfig.FLAVOR);
                                break;
                            }
                            if (charAt2 != '=') {
                                i5++;
                            } else {
                                int i6 = i5 + 1;
                                if (str.length() == i6) {
                                    c6571e = new C6571e(Integer.valueOf(i6), BuildConfig.FLAVOR);
                                } else {
                                    char c = '\"';
                                    if (str.charAt(i6) == '\"') {
                                        int i7 = i5 + 2;
                                        StringBuilder sb = new StringBuilder();
                                        while (i7 <= AbstractC5304e.crashlytics(str)) {
                                            char charAt3 = str.charAt(i7);
                                            if (charAt3 == c) {
                                                int i8 = i7 + 1;
                                                int i9 = i8;
                                                while (i9 < str.length() && str.charAt(i9) == ' ') {
                                                    i9++;
                                                }
                                                if (i9 == str.length() || str.charAt(i9) == ';' || str.charAt(i9) == ',') {
                                                    c6571e = new C6571e(Integer.valueOf(i8), sb.toString());
                                                    break;
                                                }
                                            }
                                            if (charAt3 != '\\' || i7 >= AbstractC5304e.crashlytics(str) - 2) {
                                                sb.append(charAt3);
                                                i7++;
                                            } else {
                                                sb.append(str.charAt(i7 + 1));
                                                i7 += 2;
                                            }
                                            c = '\"';
                                        }
                                        c6571e = new C6571e(Integer.valueOf(i7), "\"".concat(sb.toString()));
                                    } else {
                                        int i10 = i6;
                                        while (i10 <= AbstractC5304e.crashlytics(str)) {
                                            char charAt4 = str.charAt(i10);
                                            if (charAt4 == ',' || charAt4 == ';') {
                                                c6571e = new C6571e(Integer.valueOf(i10), AbstractC5304e.m1855const(str.substring(i6, i10)).toString());
                                                break;
                                            }
                                            i10++;
                                        }
                                        c6571e = new C6571e(Integer.valueOf(i10), AbstractC5304e.m1855const(str.substring(i6, i10)).toString());
                                    }
                                }
                                int intValue = ((Number) c6571e.f13544e).intValue();
                                metrica(appmetrica3, str, i4, i5, (String) c6571e.f13543e);
                                i3 = intValue;
                            }
                        }
                        metrica(appmetrica3, str, i4, i5, BuildConfig.FLAVOR);
                        i3 = i5;
                    }
                } else {
                    ((ArrayList) appmetrica2.getValue()).add(new C16855e(AbstractC5304e.m1855const(str.substring(i2, num != null ? num.intValue() : i3)).toString(), appmetrica3.ad() ? (List) appmetrica3.getValue() : c13664e));
                }
            }
            i2 = i3;
            i = 3;
        }
        return appmetrica2.ad() ? (List) appmetrica2.getValue() : c13664e;
    }

    public abstract void license(int i, int i2, byte[] bArr);
}
