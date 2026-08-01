package defpackage;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9386e {
    public static final int appmetrica = 12;
    public static final int license = 10;
    public static final int metrica = 9;
    public static final short[] ad = {2285, 2571, 2970, 1812, 1493, 1422, 287, 202, 3158, 622, 1577, 182, 962, 2127, 1855, 1468, 573, 2004, 264, 383, 2500, 1458, 1727, 3199, 2648, 1017, 732, 608, 1787, 411, 3124, 1758, 1223, 652, 2777, 1015, 2036, 1491, 3047, 1785, 516, 3321, 3009, 2663, 1711, 2167, 126, 1469, 2476, 3239, 3058, 830, 107, 1908, 3082, 2378, 2931, 961, 1821, 2604, 448, 2264, 677, 2054, 2226, 430, 555, 843, 2078, 871, 1550, 105, 422, 587, 177, 3094, 3038, 2869, 1574, 1653, 3083, 778, 1159, 3182, 2552, 1483, 2727, 1119, 1739, 644, 2457, 349, 418, 329, 3173, 3254, 817, 1097, 603, 610, 1322, 2044, 1864, 384, 2114, 3193, 1218, 1994, 2455, 220, 2142, 1670, 2144, 1799, 2051, 794, 1819, 2475, 2459, 478, 3221, 3021, 996, 991, 958, 1869, 1522, 1628};
    public static final short[] vip = {1701, 1807, 1460, 2371, 2338, 2333, 308, 108, 2851, 870, 854, 1510, 2535, 1278, 1530, 1185, 1659, 1187, 3109, 874, 1335, 2111, 136, 1215, 2945, 1465, 1285, 2007, 2719, 2726, 2232, 2512, 75, 156, 3000, 2911, 2980, 872, 2685, 1590, 2210, 602, 1846, 777, 147, 2170, 2551, 246, 1676, 1755, 460, 291, 235, 3152, 2742, 2907, 3224, 1779, 2458, 1251, 2486, 2774, 2899, 1103, 1275, 2652, 1065, 2881, 725, 1508, 2368, 398, 951, 247, 1421, 3222, 2499, 271, 90, 853, 1860, 3203, 1162, 1618, 666, 320, 8, 2813, 1544, 282, 1838, 1293, 2314, 552, 2677, 2106, 1571, 205, 2918, 1542, 2721, 2597, 2312, 681, 130, 1602, 1871, 829, 2946, 3065, 1325, 2756, 1861, 1474, 1202, 2367, 3147, 1752, 2707, 171, 3127, 3042, 1907, 1836, 1517, 359, 758, 1441};

    public static int Signature(InterfaceC16984e interfaceC16984e, int i, byte[] bArr, int i2, int i3, InterfaceC13229e interfaceC13229e, C6313e c6313e) {
        AbstractC15319e ad2 = interfaceC16984e.ad();
        InterfaceC16984e interfaceC16984e2 = interfaceC16984e;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C6313e c6313e2 = c6313e;
        int advert = advert(ad2, interfaceC16984e2, bArr2, i2, i4, c6313e2);
        interfaceC16984e2.metrica(ad2);
        c6313e2.metrica = ad2;
        interfaceC13229e.add(ad2);
        while (advert < i4) {
            C6313e c6313e3 = c6313e2;
            int i5 = i4;
            int appmetrica2 = appmetrica(bArr2, advert, c6313e3);
            if (i != c6313e3.ad) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC16984e interfaceC16984e3 = interfaceC16984e2;
            AbstractC15319e ad3 = interfaceC16984e3.ad();
            advert = advert(ad3, interfaceC16984e3, bArr3, appmetrica2, i5, c6313e3);
            interfaceC16984e2 = interfaceC16984e3;
            bArr2 = bArr3;
            i4 = i5;
            c6313e2 = c6313e3;
            interfaceC16984e2.metrica(ad3);
            c6313e2.metrica = ad3;
            interfaceC13229e.add(ad3);
        }
        return advert;
    }

    public static String ad(InterfaceC0293e interfaceC0293e) {
        String algorithmName = interfaceC0293e.getAlgorithmName();
        int indexOf = algorithmName.indexOf(45);
        if (indexOf <= 0 || algorithmName.startsWith("SHA3")) {
            return algorithmName;
        }
        return algorithmName.substring(0, indexOf) + algorithmName.substring(indexOf + 1);
    }

    public static int adcel(byte[] bArr, int i, C6313e c6313e) {
        int appmetrica2 = appmetrica(bArr, i, c6313e);
        int i2 = c6313e.ad;
        if (i2 < 0) {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            c6313e.metrica = BuildConfig.FLAVOR;
            return appmetrica2;
        }
        c6313e.metrica = AbstractC2059e.license(appmetrica2, i2, bArr);
        return appmetrica2 + i2;
    }

    public static int admob(int i, byte[] bArr, int i2, int i3, C2370e c2370e, C6313e c6313e) {
        if ((i >>> 3) == 0) {
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int billing = billing(bArr, i2, c6313e);
            c2370e.license(i, Long.valueOf(c6313e.vip));
            return billing;
        }
        if (i4 == 1) {
            c2370e.license(i, Long.valueOf(startapp(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int appmetrica2 = appmetrica(bArr, i2, c6313e);
            int i5 = c6313e.ad;
            if (i5 < 0) {
                throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - appmetrica2) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                c2370e.license(i, AbstractC7244e.f14800e);
            } else {
                c2370e.license(i, AbstractC7244e.loadAd(appmetrica2, i5, bArr));
            }
            return appmetrica2 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new IOException("Protocol message contained an invalid tag (zero).");
            }
            c2370e.license(i, Integer.valueOf(yandex(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        C2370e ad2 = C2370e.ad();
        int i7 = c6313e.license + 1;
        c6313e.license = i7;
        if (i7 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int appmetrica3 = appmetrica(bArr, i2, c6313e);
            int i9 = c6313e.ad;
            if (i9 == i6) {
                i8 = i9;
                i2 = appmetrica3;
                break;
            }
            i2 = admob(i9, bArr, appmetrica3, i3, ad2, c6313e);
            i8 = i9;
        }
        c6313e.license--;
        if (i2 > i3 || i8 != i6) {
            throw new IOException("Failed to parse the message.");
        }
        c2370e.license(i, ad2);
        return i2;
    }

    public static int advert(Object obj, InterfaceC16984e interfaceC16984e, byte[] bArr, int i, int i2, C6313e c6313e) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = purchase(i4, bArr, i3, c6313e);
            i4 = c6313e.ad;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = c6313e.license + 1;
        c6313e.license = i6;
        if (i6 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        interfaceC16984e.purchase(obj, bArr, i5, i7, c6313e);
        c6313e.license--;
        c6313e.metrica = obj;
        return i7;
    }

    public static int amazon(int i, byte[] bArr, int i2, int i3, InterfaceC13229e interfaceC13229e, C6313e c6313e) {
        C5407e c5407e = (C5407e) interfaceC13229e;
        int appmetrica2 = appmetrica(bArr, i2, c6313e);
        c5407e.startapp(c6313e.ad);
        while (appmetrica2 < i3) {
            int appmetrica3 = appmetrica(bArr, appmetrica2, c6313e);
            if (i != c6313e.ad) {
                break;
            }
            appmetrica2 = appmetrica(bArr, appmetrica3, c6313e);
            c5407e.startapp(c6313e.ad);
        }
        return appmetrica2;
    }

    public static int appmetrica(byte[] bArr, int i, C6313e c6313e) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return purchase(b, bArr, i2, c6313e);
        }
        c6313e.ad = b;
        return i2;
    }

    public static int billing(byte[] bArr, int i, C6313e c6313e) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c6313e.vip = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        c6313e.vip = j2;
        return i3;
    }

    public static final List license(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C13664e.f27089e;
        }
        if (size == 1) {
            return Collections.singletonList(AbstractC13480e.m3591interface(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static int loadAd(byte[] bArr, int i, InterfaceC13229e interfaceC13229e, C6313e c6313e) {
        C5407e c5407e = (C5407e) interfaceC13229e;
        int appmetrica2 = appmetrica(bArr, i, c6313e);
        int i2 = c6313e.ad + appmetrica2;
        while (appmetrica2 < i2) {
            appmetrica2 = appmetrica(bArr, appmetrica2, c6313e);
            c5407e.startapp(c6313e.ad);
        }
        if (appmetrica2 == i2) {
            return appmetrica2;
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static void metrica(C9831e c9831e, int i, short s, short s2, short s3, short s4, short s5) {
        ((short[]) c9831e.license)[i] = (short) (AbstractC7890e.mopub(s * s3) + AbstractC7890e.mopub(AbstractC7890e.mopub(s2 * s4) * s5));
        short mopub = (short) (AbstractC7890e.mopub(s2 * s3) + AbstractC7890e.mopub(s * s4));
        ((short[]) c9831e.license)[i + 1] = mopub;
    }

    public static int mopub(byte[] bArr, int i, C6313e c6313e) {
        int appmetrica2 = appmetrica(bArr, i, c6313e);
        int i2 = c6313e.ad;
        if (i2 < 0) {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - appmetrica2) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            c6313e.metrica = AbstractC7244e.f14800e;
            return appmetrica2;
        }
        c6313e.metrica = AbstractC7244e.loadAd(appmetrica2, i2, bArr);
        return appmetrica2 + i2;
    }

    public static int purchase(int i, byte[] bArr, int i2, C6313e c6313e) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c6313e.ad = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c6313e.ad = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c6313e.ad = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c6313e.ad = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c6313e.ad = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int smaato(Object obj, InterfaceC16984e interfaceC16984e, byte[] bArr, int i, int i2, int i3, C6313e c6313e) {
        C1866e c1866e = (C1866e) interfaceC16984e;
        int i4 = c6313e.license + 1;
        c6313e.license = i4;
        if (i4 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int isPro = c1866e.isPro(obj, bArr, i, i2, i3, c6313e);
        c6313e.license--;
        c6313e.metrica = obj;
        return isPro;
    }

    public static long startapp(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int subscription(int i, byte[] bArr, int i2, int i3, C6313e c6313e) {
        if ((i >>> 3) == 0) {
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return billing(bArr, i2, c6313e);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return appmetrica(bArr, i2, c6313e) + c6313e.ad;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = appmetrica(bArr, i2, c6313e);
            i6 = c6313e.ad;
            if (i6 == i5) {
                break;
            }
            i2 = subscription(i6, bArr, i2, i3, c6313e);
        }
        if (i2 > i3 || i6 != i5) {
            throw new IOException("Failed to parse the message.");
        }
        return i2;
    }

    public static final void vip(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static int yandex(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }
}
