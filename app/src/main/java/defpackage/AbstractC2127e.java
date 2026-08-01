package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2127e {
    public static final C2892e ad = new C2892e(324108469, false, new C11402e(10));
    public static final C2892e vip = new C2892e(-743378603, false, new C11402e(11));
    public static final C2892e metrica = new C2892e(-562634699, false, new C16627e(22));

    public static final long Signature(long j) {
        return AbstractC2278e.ad(C5602e.adcel(j), C5602e.yandex(j), C5602e.startapp(j), C5602e.billing(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(defpackage.InterfaceC6034e r4, java.lang.Object r5, java.lang.Object r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C15511e
            if (r0 == 0) goto L13
            r0 = r7
            eٕٖۨ r0 = (defpackage.C15511e) r0
            int r1 = r0.f30647e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30647e = r1
            goto L18
        L13:
            eٕٖۨ r0 = new eٕٖۨ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f30645e
            int r1 = r0.f30647e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            java.lang.Object r6 = r0.f30646e
            defpackage.AbstractC2003e.purchase(r7)
            goto L3f
        L2f:
            defpackage.AbstractC2003e.purchase(r7)
            r0.f30646e = r6
            r0.f30647e = r2
            java.lang.Object r4 = r4.startapp(r5, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r4 != r5) goto L3f
            return
        L3f:
            static r4 = new static
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2127e.ad(eؘۥؒ, java.lang.Object, java.lang.Object, eُؑ۠):void");
    }

    public static int adcel(byte[] bArr, int i, C6313e c6313e) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return startapp(b, bArr, i2, c6313e);
        }
        c6313e.ad = b;
        return i2;
    }

    public static int advert(byte[] bArr, int i, C6313e c6313e) {
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

    public static int amazon(Object obj, InterfaceC11115e interfaceC11115e, byte[] bArr, int i, int i2, C6313e c6313e) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = startapp(i4, bArr, i3, c6313e);
            i4 = c6313e.ad;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw C8868e.billing();
        }
        int i6 = c6313e.license + 1;
        c6313e.license = i6;
        if (i6 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        interfaceC11115e.yandex(obj, bArr, i5, i7, c6313e);
        c6313e.license--;
        c6313e.metrica = obj;
        return i7;
    }

    public static int appmetrica(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int billing(InterfaceC11115e interfaceC11115e, int i, byte[] bArr, int i2, int i3, InterfaceC16489e interfaceC16489e, C6313e c6313e) {
        Object license = interfaceC11115e.license();
        InterfaceC11115e interfaceC11115e2 = interfaceC11115e;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C6313e c6313e2 = c6313e;
        int amazon = amazon(license, interfaceC11115e2, bArr2, i2, i4, c6313e2);
        interfaceC11115e2.vip(license);
        c6313e2.metrica = license;
        interfaceC16489e.add(license);
        while (amazon < i4) {
            C6313e c6313e3 = c6313e2;
            int i5 = i4;
            int adcel = adcel(bArr2, amazon, c6313e3);
            if (i != c6313e3.ad) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC11115e interfaceC11115e3 = interfaceC11115e2;
            Object license2 = interfaceC11115e3.license();
            amazon = amazon(license2, interfaceC11115e3, bArr3, adcel, i5, c6313e3);
            interfaceC11115e2 = interfaceC11115e3;
            bArr2 = bArr3;
            i4 = i5;
            c6313e2 = c6313e3;
            interfaceC11115e2.vip(license2);
            c6313e2.metrica = license2;
            interfaceC16489e.add(license2);
        }
        return amazon;
    }

    public static int license(byte[] bArr, int i, C6313e c6313e) {
        int adcel = adcel(bArr, i, c6313e);
        int i2 = c6313e.ad;
        if (i2 < 0) {
            throw C8868e.appmetrica();
        }
        if (i2 > bArr.length - adcel) {
            throw C8868e.billing();
        }
        if (i2 == 0) {
            c6313e.metrica = AbstractC10498e.f20717e;
            return adcel;
        }
        c6313e.metrica = AbstractC10498e.yandex(adcel, i2, bArr);
        return adcel + i2;
    }

    public static C15904e loadAd(C15904e c15904e, String[] strArr, Map map) {
        int i = 0;
        if (c15904e == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C15904e) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C15904e c15904e2 = new C15904e();
                int length = strArr.length;
                while (i < length) {
                    c15904e2.ad((C15904e) map.get(strArr[i]));
                    i++;
                }
                return c15904e2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c15904e.ad((C15904e) map.get(strArr[0]));
                return c15904e;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c15904e.ad((C15904e) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c15904e;
    }

    public static long metrica(int i, long j) {
        return AbstractC2278e.ad(0, C5602e.yandex(j), (i & 4) != 0 ? C5602e.startapp(j) : 0, C5602e.billing(j));
    }

    public static int mopub(int i, byte[] bArr, int i2, int i3, InterfaceC16489e interfaceC16489e, C6313e c6313e) {
        AbstractC14936e abstractC14936e = (AbstractC14936e) interfaceC16489e;
        int adcel = adcel(bArr, i2, c6313e);
        abstractC14936e.billing(c6313e.ad);
        while (adcel < i3) {
            int adcel2 = adcel(bArr, adcel, c6313e);
            if (i != c6313e.ad) {
                break;
            }
            adcel = adcel(bArr, adcel2, c6313e);
            abstractC14936e.billing(c6313e.ad);
        }
        return adcel;
    }

    public static long purchase(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int smaato(Object obj, InterfaceC11115e interfaceC11115e, byte[] bArr, int i, int i2, int i3, C6313e c6313e) {
        C2624e c2624e = (C2624e) interfaceC11115e;
        int i4 = c6313e.license + 1;
        c6313e.license = i4;
        if (i4 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int firebase = c2624e.firebase(obj, bArr, i, i2, i3, c6313e);
        c6313e.license--;
        c6313e.metrica = obj;
        return firebase;
    }

    public static int startapp(int i, byte[] bArr, int i2, C6313e c6313e) {
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

    public static long vip(int i, long j) {
        return AbstractC2278e.ad(i == 1 ? C5602e.adcel(j) : C5602e.startapp(j), i == 1 ? C5602e.yandex(j) : C5602e.billing(j), i == 1 ? C5602e.startapp(j) : C5602e.adcel(j), i == 1 ? C5602e.billing(j) : C5602e.yandex(j));
    }

    public static int yandex(int i, byte[] bArr, int i2, int i3, C1434e c1434e, C6313e c6313e) {
        if ((i >>> 3) == 0) {
            throw C8868e.ad();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int advert = advert(bArr, i2, c6313e);
            c1434e.license(i, Long.valueOf(c6313e.vip));
            return advert;
        }
        if (i4 == 1) {
            c1434e.license(i, Long.valueOf(purchase(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int adcel = adcel(bArr, i2, c6313e);
            int i5 = c6313e.ad;
            if (i5 < 0) {
                throw C8868e.appmetrica();
            }
            if (i5 > bArr.length - adcel) {
                throw C8868e.billing();
            }
            if (i5 == 0) {
                c1434e.license(i, AbstractC10498e.f20717e);
            } else {
                c1434e.license(i, AbstractC10498e.yandex(adcel, i5, bArr));
            }
            return adcel + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw C8868e.ad();
            }
            c1434e.license(i, Integer.valueOf(appmetrica(i2, bArr)));
            return i2 + 4;
        }
        C1434e metrica2 = C1434e.metrica();
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
            int adcel2 = adcel(bArr, i2, c6313e);
            i8 = c6313e.ad;
            if (i8 == i6) {
                i2 = adcel2;
                break;
            }
            i2 = yandex(i8, bArr, adcel2, i3, metrica2, c6313e);
        }
        c6313e.license--;
        if (i2 > i3 || i8 != i6) {
            throw C8868e.purchase();
        }
        c1434e.license(i, metrica2);
        return i2;
    }
}
