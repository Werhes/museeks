package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14073e {
    public static final C2892e ad = new C2892e(-547183648, false, new C11402e(12));
    public static final C2892e vip = new C2892e(1558913424, false, new C9375e(7));
    public static final C2892e metrica = new C2892e(-554567260, false, new C11402e(13));
    public static final C2892e license = new C2892e(-154320855, false, new C16627e(23));

    public static final C9831e ad(InterfaceC1108e interfaceC1108e) {
        InterfaceC0888e.startapp.getClass();
        int i = C18097e.vip;
        if (1 >= i) {
            i = 1;
        }
        int i2 = i - 1;
        if (interfaceC1108e instanceof AbstractC9910e) {
            AbstractC9910e abstractC9910e = (AbstractC9910e) interfaceC1108e;
            int i3 = abstractC9910e.f19546e;
            InterfaceC1108e yandex = abstractC9910e.yandex();
            if (yandex != null) {
                int i4 = abstractC9910e.f19547e;
                if (i4 != -3 && i4 != -2 && i4 != 0) {
                    i2 = i4;
                } else if (i3 != 1 || i4 == 0) {
                    i2 = 0;
                }
                return new C9831e(i2, i3, abstractC9910e.f19548e, yandex);
            }
        }
        return new C9831e(i2, 1, C2693e.f6576e, interfaceC1108e);
    }

    public static int adcel(byte[] bArr, int i, C6313e c6313e) {
        int i2 = i + 1;
        long j = bArr[i];
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

    public static int advert(Object obj, InterfaceC3028e interfaceC3028e, byte[] bArr, int i, int i2, int i3, C6313e c6313e) {
        C2546e c2546e = (C2546e) interfaceC3028e;
        int i4 = c6313e.license + 1;
        c6313e.license = i4;
        if (i4 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int firebase = c2546e.firebase(obj, bArr, i, i2, i3, c6313e);
        c6313e.license--;
        c6313e.metrica = obj;
        return firebase;
    }

    public static final C6571e amazon(Object obj, Object obj2) {
        return new C6571e(obj, obj2);
    }

    public static int appmetrica(InterfaceC3028e interfaceC3028e, int i, byte[] bArr, int i2, int i3, InterfaceC4115e interfaceC4115e, C6313e c6313e) {
        AbstractC4994e license2 = interfaceC3028e.license();
        InterfaceC3028e interfaceC3028e2 = interfaceC3028e;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C6313e c6313e2 = c6313e;
        int smaato = smaato(license2, interfaceC3028e2, bArr2, i2, i4, c6313e2);
        interfaceC3028e2.vip(license2);
        c6313e2.metrica = license2;
        interfaceC4115e.add(license2);
        while (smaato < i4) {
            C6313e c6313e3 = c6313e2;
            int i5 = i4;
            int yandex = yandex(bArr2, smaato, c6313e3);
            if (i != c6313e3.ad) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC3028e interfaceC3028e3 = interfaceC3028e2;
            AbstractC4994e license3 = interfaceC3028e3.license();
            smaato = smaato(license3, interfaceC3028e3, bArr3, yandex, i5, c6313e3);
            interfaceC3028e2 = interfaceC3028e3;
            bArr2 = bArr3;
            i4 = i5;
            c6313e2 = c6313e3;
            interfaceC3028e2.vip(license3);
            c6313e2.metrica = license3;
            interfaceC4115e.add(license3);
        }
        return smaato;
    }

    public static int billing(int i, byte[] bArr, int i2, C6313e c6313e) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c6313e.ad = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
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

    public static long license(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int metrica(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int purchase(int i, byte[] bArr, int i2, int i3, C16137e c16137e, C6313e c6313e) {
        if ((i >>> 3) == 0) {
            throw C11872e.ad();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int adcel = adcel(bArr, i2, c6313e);
            c16137e.license(i, Long.valueOf(c6313e.vip));
            return adcel;
        }
        if (i4 == 1) {
            c16137e.license(i, Long.valueOf(license(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int yandex = yandex(bArr, i2, c6313e);
            int i5 = c6313e.ad;
            if (i5 < 0) {
                throw C11872e.appmetrica();
            }
            if (i5 > bArr.length - yandex) {
                throw C11872e.billing();
            }
            if (i5 == 0) {
                c16137e.license(i, AbstractC4002e.f8908e);
            } else {
                c16137e.license(i, AbstractC4002e.yandex(yandex, i5, bArr));
            }
            return yandex + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw C11872e.ad();
            }
            c16137e.license(i, Integer.valueOf(metrica(i2, bArr)));
            return i2 + 4;
        }
        C16137e metrica2 = C16137e.metrica();
        int i6 = (i & (-8)) | 4;
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
            int yandex2 = yandex(bArr, i2, c6313e);
            i8 = c6313e.ad;
            if (i8 == i6) {
                i2 = yandex2;
                break;
            }
            i2 = purchase(i8, bArr, yandex2, i3, metrica2, c6313e);
        }
        c6313e.license--;
        if (i2 > i3 || i8 != i6) {
            throw C11872e.purchase();
        }
        c16137e.license(i, metrica2);
        return i2;
    }

    public static int smaato(Object obj, InterfaceC3028e interfaceC3028e, byte[] bArr, int i, int i2, C6313e c6313e) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = billing(i4, bArr, i3, c6313e);
            i4 = c6313e.ad;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw C11872e.billing();
        }
        int i6 = c6313e.license + 1;
        c6313e.license = i6;
        if (i6 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        interfaceC3028e.yandex(obj, bArr, i5, i7, c6313e);
        c6313e.license--;
        c6313e.metrica = obj;
        return i7;
    }

    public static int startapp(int i, byte[] bArr, int i2, int i3, InterfaceC4115e interfaceC4115e, C6313e c6313e) {
        C4178e c4178e = (C4178e) interfaceC4115e;
        int yandex = yandex(bArr, i2, c6313e);
        c4178e.billing(c6313e.ad);
        while (yandex < i3) {
            int yandex2 = yandex(bArr, yandex, c6313e);
            if (i != c6313e.ad) {
                break;
            }
            yandex = yandex(bArr, yandex2, c6313e);
            c4178e.billing(c6313e.ad);
        }
        return yandex;
    }

    public static int vip(byte[] bArr, int i, C6313e c6313e) {
        int yandex = yandex(bArr, i, c6313e);
        int i2 = c6313e.ad;
        if (i2 < 0) {
            throw C11872e.appmetrica();
        }
        if (i2 > bArr.length - yandex) {
            throw C11872e.billing();
        }
        if (i2 == 0) {
            c6313e.metrica = AbstractC4002e.f8908e;
            return yandex;
        }
        c6313e.metrica = AbstractC4002e.yandex(yandex, i2, bArr);
        return yandex + i2;
    }

    public static int yandex(byte[] bArr, int i, C6313e c6313e) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return billing(b, bArr, i2, c6313e);
        }
        c6313e.ad = b;
        return i2;
    }

    public abstract C0763e mopub();
}
