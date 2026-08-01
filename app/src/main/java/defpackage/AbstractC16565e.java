package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۡٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16565e {
    public static final StackTraceElement[] ad = new StackTraceElement[0];

    public static final C8823e ad(Object obj) {
        C8823e c8823e = new C8823e();
        c8823e.m2175import(obj);
        return c8823e;
    }

    public static final boolean appmetrica(C0583e c0583e, Object obj, Object obj2) {
        Object billing = c0583e.billing(obj);
        if (billing == null) {
            return false;
        }
        if (!(billing instanceof C12618e)) {
            if (!billing.equals(obj2)) {
                return false;
            }
            c0583e.advert(obj);
            return true;
        }
        C12618e c12618e = (C12618e) billing;
        boolean smaato = c12618e.smaato(obj2);
        if (smaato && c12618e.yandex()) {
            c0583e.advert(obj);
        }
        return smaato;
    }

    public static int billing(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static C0583e license() {
        long[] jArr = AbstractC12981e.ad;
        return new C0583e();
    }

    public static final void metrica(C0583e c0583e, Object obj, Object obj2) {
        int purchase = c0583e.purchase(obj);
        boolean z = purchase < 0;
        Object obj3 = z ? null : c0583e.metrica[purchase];
        if (obj3 != null) {
            if (obj3 instanceof C12618e) {
                ((C12618e) obj3).ad(obj2);
            } else if (obj3 != obj2) {
                C12618e c12618e = new C12618e();
                c12618e.ad(obj3);
                c12618e.ad(obj2);
                obj2 = c12618e;
            }
            obj2 = obj3;
        }
        if (!z) {
            c0583e.metrica[purchase] = obj2;
            return;
        }
        int i = ~purchase;
        c0583e.vip[i] = obj;
        c0583e.metrica[i] = obj2;
    }

    public static final void purchase(C0583e c0583e, Object obj) {
        boolean z;
        long[] jArr = c0583e.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = c0583e.vip[i4];
                        Object obj3 = c0583e.metrica[i4];
                        if (obj3 instanceof C12618e) {
                            C12618e c12618e = (C12618e) obj3;
                            c12618e.smaato(obj);
                            z = c12618e.yandex();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            c0583e.smaato(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void vip(boolean z, Function1 function1, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        long billing;
        c13770e.m3671package(-1682403882);
        int i2 = i | (c13770e.billing(z) ? 4 : 2) | (c13770e.yandex(function1) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                c13770e.m3676strictfp(-1882420291);
                billing = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.ad;
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-1882417245);
                C15492e c15492e = AbstractC11785e.ad;
                billing = AbstractC6532e.billing(C3618e.vip(0.25f, ((C7019e) c13770e.adcel(c15492e)).ad.pro), ((C7019e) c13770e.adcel(c15492e)).ad.signatures);
                c13770e.Signature(false);
            }
            C9520e vip = AbstractC12322e.vip(((C3618e) AbstractC3145e.ad(billing, null, BuildConfig.FLAVOR, null, c13770e, 384, 10).getValue()).ad, 0L, 0L, 0L, c13770e, 0, 14);
            C3924e ad2 = AbstractC6549e.ad(28);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object m3681throw = c13770e.m3681throw();
            if (z2 || m3681throw == C2987e.ad) {
                m3681throw = new C2221e(3, function1, z);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC0865e.vip((Function0) m3681throw, interfaceC12864e, false, ad2, vip, null, null, AbstractC16653e.license(-896339381, new C15147e(z, function1, 2), c13770e), c13770e, 100663344, 228);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15545e(z, function1, interfaceC12864e, i, 2);
        }
    }
}
