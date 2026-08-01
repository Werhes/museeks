package defpackage;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10220e {
    public static final byte[] ad = new byte[0];
    public static final C3128e vip = AbstractC14114e.billing(AbstractC5458e.license("efbbbf"), AbstractC5458e.license("feff"), AbstractC5458e.license("fffe0000"), AbstractC5458e.license("fffe"), AbstractC5458e.license("0000feff"));

    public static final String Signature(int i, int i2, String str) {
        int yandex = yandex(i, i2, str);
        return str.substring(yandex, startapp(yandex, i2, str));
    }

    public static final void ad(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder inmobi = AbstractC1786e.inmobi(j, "length=", ", offset=");
            inmobi.append(j2);
            inmobi.append(", count=");
            inmobi.append(j2);
            throw new ArrayIndexOutOfBoundsException(inmobi.toString());
        }
    }

    public static final String[] adcel(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final int advert(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int amazon(C16151e c16151e) {
        int i = 0;
        while (!c16151e.yandex() && c16151e.Signature(0L) == 61) {
            i++;
            c16151e.readByte();
        }
        return i;
    }

    public static /* synthetic */ int appmetrica(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return license(str, c, i, i2);
    }

    public static final int billing(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (AbstractC7890e.yandex(charAt, 31) <= 0 || AbstractC7890e.yandex(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int license(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int loadAd(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Alert.DURATION_SHOW_INDEFINITELY;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final int metrica(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (AbstractC5304e.isPro(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean mopub(String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final boolean purchase(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int smaato(InterfaceC4895e interfaceC4895e) {
        return (interfaceC4895e.readByte() & 255) | ((interfaceC4895e.readByte() & 255) << 16) | ((interfaceC4895e.readByte() & 255) << 8);
    }

    public static final int startapp(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final void vip(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int yandex(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }
}
