package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۦ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16653e {
    public static final C14298e ad = new C14298e(1000);
    public static final C14298e metrica;
    public static final C14298e vip;

    static {
        new C14298e(1007);
        vip = new C14298e(1008);
        metrica = new C14298e(1002);
    }

    public static int Signature(Object obj, InterfaceC15433e interfaceC15433e, byte[] bArr, int i, int i2, int i3, C16807e c16807e) {
        C3017e c3017e = (C3017e) interfaceC15433e;
        int i4 = c16807e.appmetrica + 1;
        c16807e.appmetrica = i4;
        if (i4 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int pro = c3017e.pro(obj, bArr, i, i2, i3, c16807e);
        c16807e.appmetrica--;
        c16807e.metrica = obj;
        return pro;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, eٔۦْ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.InterfaceC10481e r4, float r5, defpackage.InterfaceC2869e r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C5212e
            if (r0 == 0) goto L13
            r0 = r7
            eؗۡۢ r0 = (defpackage.C5212e) r0
            int r1 = r0.f11116e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11116e = r1
            goto L18
        L13:
            eؗۡۢ r0 = new eؗۡۢ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11114e
            int r1 = r0.f11116e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eٔۦْ r4 = r0.f11115e
            defpackage.AbstractC2003e.purchase(r7)
            goto L4d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r7)
            eٔۦْ r7 = new eٔۦْ
            r7.<init>()
            eِّْ r1 = new eِّْ
            r3 = 0
            r1.<init>(r5, r6, r7, r3)
            r0.f11115e = r7
            r0.f11116e = r2
            eؚؗۨ r5 = defpackage.EnumC6955e.f14256e
            java.lang.Object r4 = r4.vip(r5, r1, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r4 != r5) goto L4c
            return r5
        L4c:
            r4 = r7
        L4d:
            float r4 = r4.f29883e
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16653e.ad(eَۘۛ, float, eؔۜؐ, eُؑ۠):java.lang.Object");
    }

    public static int adcel(byte[] bArr, int i, InterfaceC5024e interfaceC5024e, C16807e c16807e) {
        C10506e c10506e = (C10506e) interfaceC5024e;
        int advert = advert(bArr, i, c16807e);
        int i2 = c16807e.ad + advert;
        while (advert < i2) {
            advert = advert(bArr, advert, c16807e);
            c10506e.yandex(c16807e.ad);
        }
        if (advert == i2) {
            return advert;
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int admob(Object obj, InterfaceC15433e interfaceC15433e, byte[] bArr, int i, int i2, C16807e c16807e) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = smaato(i4, bArr, i3, c16807e);
            i4 = c16807e.ad;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = c16807e.appmetrica + 1;
        c16807e.appmetrica = i6;
        if (i6 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        interfaceC15433e.license(obj, bArr, i5, i7, c16807e);
        c16807e.appmetrica--;
        c16807e.metrica = obj;
        return i7;
    }

    public static int advert(byte[] bArr, int i, C16807e c16807e) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return smaato(b, bArr, i2, c16807e);
        }
        c16807e.ad = b;
        return i2;
    }

    public static int amazon(int i, byte[] bArr, int i2, int i3, InterfaceC5024e interfaceC5024e, C16807e c16807e) {
        C10506e c10506e = (C10506e) interfaceC5024e;
        int advert = advert(bArr, i2, c16807e);
        c10506e.yandex(c16807e.ad);
        while (advert < i3) {
            int advert2 = advert(bArr, advert, c16807e);
            if (i != c16807e.ad) {
                break;
            }
            advert = advert(bArr, advert2, c16807e);
            c10506e.yandex(c16807e.ad);
        }
        return advert;
    }

    public static final boolean appmetrica(C2846e c2846e, C2846e c2846e2) {
        if (c2846e == null) {
            return true;
        }
        if (c2846e instanceof C2846e) {
            return !c2846e.ad() || c2846e.equals(c2846e2) || AbstractC7890e.billing(c2846e.metrica, c2846e2.metrica);
        }
        return false;
    }

    public static int billing(byte[] bArr, int i, C16807e c16807e) {
        int advert = advert(bArr, i, c16807e);
        int i2 = c16807e.ad;
        if (i2 < 0) {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - advert) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            c16807e.metrica = AbstractC13532e.f26826e;
            return advert;
        }
        c16807e.metrica = AbstractC13532e.ads(advert, i2, bArr);
        return advert + i2;
    }

    public static final C2892e license(int i, InterfaceC12561e interfaceC12561e, C13770e c13770e) {
        Object m3681throw = c13770e.m3681throw();
        if (m3681throw == C2987e.ad) {
            m3681throw = new C2892e(i, true, interfaceC12561e);
            c13770e.m3682throws(m3681throw);
        }
        C2892e c2892e = (C2892e) m3681throw;
        if (!c2892e.f6879e.equals(interfaceC12561e)) {
            c2892e.f6879e = interfaceC12561e;
            if (c2892e.f6880e) {
                C2846e c2846e = c2892e.f6881e;
                if (c2846e != null) {
                    c2846e.vip();
                    c2892e.f6881e = null;
                }
                ArrayList arrayList = c2892e.f6878e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((C2846e) arrayList.get(i2)).vip();
                    }
                    arrayList.clear();
                }
            }
        }
        return c2892e;
    }

    public static int loadAd(byte[] bArr, int i, C16807e c16807e) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c16807e.vip = j;
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
        c16807e.vip = j2;
        return i3;
    }

    public static final C2892e metrica(List list) {
        return new C2892e(1271844412, true, new C1827e(6, list));
    }

    public static int mopub(int i, byte[] bArr, int i2, int i3, C10308e c10308e, C16807e c16807e) {
        if ((i >>> 3) == 0) {
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int loadAd = loadAd(bArr, i2, c16807e);
            c10308e.metrica(i, Long.valueOf(c16807e.vip));
            return loadAd;
        }
        if (i4 == 1) {
            c10308e.metrica(i, Long.valueOf(remoteconfig(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int advert = advert(bArr, i2, c16807e);
            int i5 = c16807e.ad;
            if (i5 < 0) {
                throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - advert) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                c10308e.metrica(i, AbstractC13532e.f26826e);
            } else {
                c10308e.metrica(i, AbstractC13532e.ads(advert, i5, bArr));
            }
            return advert + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new IOException("Protocol message contained an invalid tag (zero).");
            }
            c10308e.metrica(i, Integer.valueOf(yandex(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        C10308e vip2 = C10308e.vip();
        int i7 = c16807e.appmetrica + 1;
        c16807e.appmetrica = i7;
        if (i7 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int advert2 = advert(bArr, i2, c16807e);
            int i9 = c16807e.ad;
            if (i9 == i6) {
                i8 = i9;
                i2 = advert2;
                break;
            }
            i2 = mopub(i9, bArr, advert2, i3, vip2, c16807e);
            i8 = i9;
        }
        c16807e.appmetrica--;
        if (i2 > i3 || i8 != i6) {
            throw new IOException("Failed to parse the message.");
        }
        c10308e.metrica(i, vip2);
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, eٔۦْ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object purchase(defpackage.InterfaceC10481e r4, float r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C2678e
            if (r0 == 0) goto L13
            r0 = r6
            eؔٙۤ r0 = (defpackage.C2678e) r0
            int r1 = r0.f6553e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6553e = r1
            goto L18
        L13:
            eؔٙۤ r0 = new eؔٙۤ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6551e
            int r1 = r0.f6553e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eٔۦْ r4 = r0.f6552e
            defpackage.AbstractC2003e.purchase(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eٔۦْ r6 = new eٔۦْ
            r6.<init>()
            eِّٔ r1 = new eِّٔ
            r3 = 0
            r1.<init>(r6, r5, r3)
            r0.f6552e = r6
            r0.f6553e = r2
            eؚؗۨ r5 = defpackage.EnumC6955e.f14256e
            java.lang.Object r4 = r4.vip(r5, r1, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r4 != r5) goto L4c
            return r5
        L4c:
            r4 = r6
        L4d:
            float r4 = r4.f29883e
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16653e.purchase(eَۘۛ, float, eُؑ۠):java.lang.Object");
    }

    public static long remoteconfig(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int smaato(int i, byte[] bArr, int i2, C16807e c16807e) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c16807e.ad = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c16807e.ad = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c16807e.ad = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c16807e.ad = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c16807e.ad = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int startapp(InterfaceC15433e interfaceC15433e, int i, byte[] bArr, int i2, int i3, InterfaceC5024e interfaceC5024e, C16807e c16807e) {
        Object yandex = interfaceC15433e.yandex();
        InterfaceC15433e interfaceC15433e2 = interfaceC15433e;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C16807e c16807e2 = c16807e;
        int admob = admob(yandex, interfaceC15433e2, bArr2, i2, i4, c16807e2);
        interfaceC15433e2.ad(yandex);
        c16807e2.metrica = yandex;
        interfaceC5024e.add(yandex);
        while (admob < i4) {
            C16807e c16807e3 = c16807e2;
            int i5 = i4;
            int advert = advert(bArr2, admob, c16807e3);
            if (i != c16807e3.ad) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC15433e interfaceC15433e3 = interfaceC15433e2;
            Object yandex2 = interfaceC15433e3.yandex();
            admob = admob(yandex2, interfaceC15433e3, bArr3, advert, i5, c16807e3);
            interfaceC15433e2 = interfaceC15433e3;
            bArr2 = bArr3;
            i4 = i5;
            c16807e2 = c16807e3;
            interfaceC15433e2.ad(yandex2);
            c16807e2.metrica = yandex2;
            interfaceC5024e.add(yandex2);
        }
        return admob;
    }

    public static int subscription(int i, byte[] bArr, int i2, int i3, C16807e c16807e) {
        if ((i >>> 3) == 0) {
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return loadAd(bArr, i2, c16807e);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return advert(bArr, i2, c16807e) + c16807e.ad;
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
            i2 = advert(bArr, i2, c16807e);
            i6 = c16807e.ad;
            if (i6 == i5) {
                break;
            }
            i2 = subscription(i6, bArr, i2, i3, c16807e);
        }
        if (i2 > i3 || i6 != i5) {
            throw new IOException("Failed to parse the message.");
        }
        return i2;
    }

    public static final int vip(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static int yandex(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }
}
