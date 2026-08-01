package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6190e {
    public static final int[] ad = {-4553, -2, -1, -1, -1, -1};
    public static final int[] vip = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
    public static final int[] metrica = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static final void ad(C4034e c4034e, C2892e c2892e, C13770e c13770e, int i) {
        c13770e.m3671package(-954926513);
        int i2 = (c13770e.yandex(c4034e) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC12511e.ad(c4034e, c2892e, c13770e, i2 & 126);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15284e(c4034e, c2892e, i, 1);
        }
    }

    public static void adcel(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        AbstractC16091e.applovin(iArr, iArr3);
        while (true) {
            billing(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC16091e.applovin(iArr2, iArr3);
            }
        }
    }

    public static void advert(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static final C8633e appmetrica(InterfaceC5372e interfaceC5372e, Object obj) {
        C8633e c8633e = new C8633e(null);
        c8633e.vip = new C10312e(obj, interfaceC5372e, 18);
        c8633e.ad = null;
        return c8633e;
    }

    public static void billing(int[] iArr, int[] iArr2) {
        long j = 4553 & 4294967295L;
        long j2 = iArr[6] & 4294967295L;
        long j3 = (j * j2) + (iArr[0] & 4294967295L);
        int i = (int) j3;
        iArr2[0] = i;
        long j4 = iArr[7] & 4294967295L;
        long j5 = (j * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i2 = (int) j5;
        iArr2[1] = i2;
        long j6 = iArr[8] & 4294967295L;
        long j7 = (j * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i3 = (int) j7;
        iArr2[2] = i3;
        long j8 = iArr[9] & 4294967295L;
        long j9 = (j * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i4 = (int) j9;
        iArr2[3] = i4;
        long j10 = iArr[10] & 4294967295L;
        long j11 = (j * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = iArr[11] & 4294967295L;
        long j13 = (j * j12) + j10 + (iArr[5] & 4294967295L) + (j11 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = (j13 >>> 32) + j12;
        long j15 = j14 & 4294967295L;
        long j16 = (j * j15) + (i & 4294967295L);
        iArr2[0] = (int) j16;
        long j17 = j14 >>> 32;
        long j18 = (j * j17) + j15 + (i2 & 4294967295L) + (j16 >>> 32);
        iArr2[1] = (int) j18;
        long j19 = j17 + (i3 & 4294967295L) + (j18 >>> 32);
        iArr2[2] = (int) j19;
        long j20 = (j19 >>> 32) + (i4 & 4294967295L);
        iArr2[3] = (int) j20;
        if (((j20 >>> 32) == 0 ? 0 : AbstractC12797e.isVip(6, 4, iArr2)) != 0 || (iArr2[5] == -1 && AbstractC16091e.Signature(iArr2, ad))) {
            AbstractC12797e.vip(6, 4553, iArr2);
        }
    }

    public static final void license(C13713e c13713e, final C9040e c9040e, final InterfaceC12864e interfaceC12864e, final C16005e c16005e, final InterfaceC8642e interfaceC8642e, final boolean z, final C11644e c11644e, final float f, final float f2, final Function1 function1, C13770e c13770e, final int i, final int i2) {
        int i3;
        int i4;
        C13713e c13713e2;
        Object c7746e;
        C13713e c13713e3;
        InterfaceC9959e interfaceC9959e;
        InterfaceC12864e interfaceC12864e2;
        c13770e.m3671package(-1904835166);
        if ((i & 6) == 0) {
            i3 = (c13770e.purchase(c13713e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c13770e.license(0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c13770e.purchase(c9040e) : c13770e.yandex(c9040e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c13770e.purchase(interfaceC12864e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c13770e.purchase(c16005e) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= c13770e.billing(false) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c13770e.purchase(interfaceC8642e) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c13770e.billing(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c13770e.purchase(c11644e) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c13770e.metrica(f) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (c13770e.metrica(f2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c13770e.yandex(function1) ? 32 : 16;
        }
        boolean z2 = true;
        if (c13770e.m3673protected(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            c13770e.m3655case();
            if ((i & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
            }
            c13770e.admob();
            int i6 = i5 & 14;
            int i7 = i6 | (i4 & 112);
            InterfaceC3314e mopub = AbstractC14533e.mopub(function1, c13770e);
            int i8 = i4;
            boolean z3 = (((i7 & 14) ^ 6) > 4 && c13770e.purchase(c13713e)) || (i7 & 6) == 4;
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (z3 || m3681throw == obj) {
                C10990e c10990e = C10990e.f21769e;
                m3681throw = new C12781e(0, 7, InterfaceC16132e.class, AbstractC14533e.appmetrica(c10990e, new C5625e(AbstractC14533e.appmetrica(c10990e, new C1672e(mopub, 18)), c13713e, 26)), "value", "getValue()Ljava/lang/Object;");
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC9959e interfaceC9959e2 = (InterfaceC9959e) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                m3681throw2 = AbstractC17680e.startapp(c13770e);
                c13770e.m3682throws(m3681throw2);
            }
            InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw2;
            InterfaceC2661e interfaceC2661e = (InterfaceC2661e) c13770e.adcel(AbstractC11473e.billing);
            int i9 = i5 >> 6;
            int i10 = i5 >> 12;
            int i11 = (i9 & 7168) | i6 | (i9 & 896) | ((i5 << 9) & 57344) | (i10 & 458752) | ((i8 << 18) & 3670016) | ((i5 << 18) & 234881024);
            boolean purchase = ((((i11 & 234881024) ^ 100663296) > 67108864 && c13770e.purchase(c9040e)) || (i11 & 100663296) == 67108864) | ((((i11 & 896) ^ 384) > 256 && c13770e.purchase(c16005e)) || (i11 & 384) == 256) | ((((i11 & 14) ^ 6) > 4 && c13770e.purchase(c13713e)) || (i11 & 6) == 4) | c13770e.purchase(interfaceC9959e2) | ((((i11 & 7168) ^ 3072) > 2048 && c13770e.billing(false)) || (i11 & 3072) == 2048) | ((((i11 & 57344) ^ 24576) > 16384 && c13770e.license(0)) || (i11 & 24576) == 16384) | ((((i11 & 458752) ^ 196608) > 131072 && c13770e.metrica(f)) || (i11 & 196608) == 131072) | ((((i11 & 3670016) ^ 1572864) > 1048576 && c13770e.metrica(f2)) || (i11 & 1572864) == 1048576) | c13770e.purchase(interfaceC2661e);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase || m3681throw3 == obj) {
                c13713e3 = c13713e;
                c7746e = new C7746e(c13713e3, c9040e, interfaceC9959e2, c16005e, f, interfaceC18435e, interfaceC2661e);
                interfaceC9959e = interfaceC9959e2;
                c13770e.m3682throws(c7746e);
            } else {
                c7746e = m3681throw3;
                interfaceC9959e = interfaceC9959e2;
                c13713e3 = c13713e;
            }
            InterfaceC14306e interfaceC14306e = (InterfaceC14306e) c7746e;
            int i12 = i6 | (i10 & 112);
            boolean z4 = ((((i12 & 112) ^ 48) > 32 && c13770e.billing(false)) || (i12 & 48) == 32) | ((((i12 & 14) ^ 6) > 4 && c13770e.purchase(c13713e3)) || (i12 & 6) == 4);
            Object m3681throw4 = c13770e.m3681throw();
            if (z4 || m3681throw4 == obj) {
                m3681throw4 = new C13764e(c13713e3);
                c13770e.m3682throws(m3681throw4);
            }
            C13764e c13764e = (C13764e) m3681throw4;
            EnumC17426e enumC17426e = EnumC17426e.f34146e;
            if (z) {
                c13770e.m3676strictfp(-1834596342);
                if (((i6 ^ 6) <= 4 || !c13770e.purchase(c13713e3)) && (i5 & 6) != 4) {
                    z2 = false;
                }
                Object m3681throw5 = c13770e.m3681throw();
                if (z2 || m3681throw5 == obj) {
                    m3681throw5 = new C17126e(c13713e3);
                    c13770e.m3682throws(m3681throw5);
                }
                interfaceC12864e2 = AbstractC6261e.license((C17126e) m3681throw5, c13713e3.mopub, enumC17426e);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-1834291488);
                c13770e.Signature(false);
                interfaceC12864e2 = C0115e.f1276e;
            }
            c13713e2 = c13713e3;
            AbstractC15118e.ad(interfaceC9959e, AbstractC6227e.license(AbstractC2003e.license(interfaceC12864e.premium(c13713e3.startapp).premium(c13713e3.adcel), interfaceC9959e, c13764e, enumC17426e, z).premium(interfaceC12864e2).premium((InterfaceC12864e) c13713e3.pro.advert), c13713e3, enumC17426e, c11644e, z, interfaceC8642e, c13713e3.subscription, null), c13713e2.smaato, interfaceC14306e, c13770e, 0);
        } else {
            c13713e2 = c13713e;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            final C13713e c13713e4 = c13713e2;
            subscription.license = new Function2() { // from class: eَؙُ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC6190e.license(C13713e.this, c9040e, interfaceC12864e, c16005e, interfaceC8642e, z, c11644e, f, f2, function1, (C13770e) obj2, AbstractC5190e.advert(i | 1), AbstractC5190e.advert(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void metrica(C7765e c7765e, boolean z, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-579239002);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(c7765e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.billing(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(c2892e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            AbstractC12511e.metrica(c7765e, z, c2892e, c13770e, i2 & 1022);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C14247e(c7765e, z, c2892e, i, 1);
        }
    }

    public static void mopub(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC16091e.ads(iArr, iArr2, iArr3) != 0) {
            AbstractC12797e.m3400interface(6, 4553, iArr3);
        }
    }

    public static void purchase(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        AbstractC16091e.signatures(iArr, iArr2, iArr4);
        billing(iArr4, iArr3);
    }

    public static Object smaato(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(AbstractC1786e.signatures(AbstractC17861e.tapsense("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
    }

    public static void startapp(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        AbstractC16091e.applovin(iArr, iArr3);
        billing(iArr3, iArr2);
    }

    public static final void vip(C15860e c15860e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(2080741862);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(c15860e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC12511e.vip(c15860e, c2892e, c13770e, i2 & 126);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4225e(c15860e, c2892e, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (((r2 >>> 32) != 0 ? defpackage.AbstractC12797e.isVip(6, 3, r12) : 0) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void yandex(int[] r12, int r13) {
        /*
            r0 = 6
            r1 = 4553(0x11c9, float:6.38E-42)
            if (r13 == 0) goto L3f
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r13
            long r6 = r6 & r4
            long r2 = r2 * r6
            r13 = 0
            r8 = r12[r13]
            long r8 = (long) r8
            long r8 = r8 & r4
            long r2 = r2 + r8
            int r8 = (int) r2
            r12[r13] = r8
            r8 = 32
            long r2 = r2 >>> r8
            r9 = 1
            r10 = r12[r9]
            long r10 = (long) r10
            long r10 = r10 & r4
            long r6 = r6 + r10
            long r6 = r6 + r2
            int r2 = (int) r6
            r12[r9] = r2
            long r2 = r6 >>> r8
            r6 = 2
            r7 = r12[r6]
            long r9 = (long) r7
            long r4 = r4 & r9
            long r2 = r2 + r4
            int r4 = (int) r2
            r12[r6] = r4
            long r2 = r2 >>> r8
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L38
            goto L3d
        L38:
            r13 = 3
            int r13 = defpackage.AbstractC12797e.isVip(r0, r13, r12)
        L3d:
            if (r13 != 0) goto L4d
        L3f:
            r13 = 5
            r13 = r12[r13]
            r2 = -1
            if (r13 != r2) goto L50
            int[] r13 = defpackage.AbstractC6190e.ad
            boolean r13 = defpackage.AbstractC16091e.Signature(r12, r13)
            if (r13 == 0) goto L50
        L4d:
            defpackage.AbstractC12797e.vip(r0, r1, r12)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6190e.yandex(int[], int):void");
    }
}
