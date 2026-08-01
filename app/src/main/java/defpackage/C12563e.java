package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12563e {
    public static final /* synthetic */ int ad = 0;

    static {
        float f = AbstractC6957e.ad;
    }

    public static C14602e ad(C9553e c9553e, long j) {
        C14602e c14602e = c9553e.f18946return;
        if (c14602e != null) {
            return c14602e;
        }
        long j2 = C3618e.startapp;
        C14602e c14602e2 = new C14602e(j2, j, j2, C3618e.vip(0.38f, j));
        c9553e.f18946return = c14602e2;
        return c14602e2;
    }

    public static C14602e appmetrica(C9553e c9553e) {
        C14602e c14602e = c9553e.f18950switch;
        if (c14602e != null) {
            return c14602e;
        }
        C14602e c14602e2 = new C14602e(AbstractC7893e.license(c9553e, 32), AbstractC7893e.license(c9553e, 15), C3618e.vip(0.1f, AbstractC7893e.license(c9553e, 18)), C3618e.vip(0.38f, AbstractC7893e.license(c9553e, 18)));
        c9553e.f18950switch = c14602e2;
        return c14602e2;
    }

    public static long billing() {
        float f = AbstractC6957e.vip;
        return AbstractC11160e.ad(AbstractC6957e.metrica + f + f, AbstractC6957e.ad);
    }

    public static C16171e license(long j, long j2, long j3, long j4, C13770e c13770e) {
        long j5 = C3618e.adcel;
        C9553e c9553e = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad;
        C16171e c16171e = c9553e.f18954throws;
        if (c16171e == null) {
            C16171e c16171e2 = new C16171e(AbstractC7893e.license(c9553e, 32), AbstractC7893e.license(c9553e, 15), C3618e.vip(0.1f, AbstractC7893e.license(c9553e, 18)), C3618e.vip(0.38f, AbstractC7893e.license(c9553e, 18)), AbstractC7893e.license(c9553e, 31), AbstractC7893e.license(c9553e, 14));
            c9553e.f18954throws = c16171e2;
            c16171e = c16171e2;
        }
        long j6 = j != 16 ? j : c16171e.ad;
        long j7 = j2 != 16 ? j2 : c16171e.vip;
        long j8 = j5 != 16 ? j5 : c16171e.metrica;
        if (j5 == 16) {
            j5 = c16171e.license;
        }
        return new C16171e(j6, j7, j8, j5, j3 != 16 ? j3 : c16171e.appmetrica, j4 != 16 ? j4 : c16171e.purchase);
    }

    public static C14602e metrica(C13770e c13770e) {
        return appmetrica(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad);
    }

    public static C14602e purchase(long j, C13770e c13770e) {
        long j2 = C3618e.adcel;
        return ad(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad, ((C3618e) c13770e.adcel(AbstractC0608e.ad)).ad).ad(j2, j, j2, C3618e.vip(0.38f, j));
    }

    public static C14602e vip(long j, long j2, C13770e c13770e, int i) {
        C14602e c14602e;
        long j3 = C3618e.adcel;
        C9553e c9553e = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad;
        C14602e c14602e2 = c9553e.f18928else;
        if (c14602e2 == null) {
            C14602e c14602e3 = new C14602e(AbstractC7893e.license(c9553e, 26), AbstractC7893e.license(c9553e, 10), C3618e.vip(0.1f, AbstractC7893e.license(c9553e, 18)), C3618e.vip(0.38f, AbstractC7893e.license(c9553e, 18)));
            c9553e.f18928else = c14602e3;
            c14602e = c14602e3;
        } else {
            c14602e = c14602e2;
        }
        return c14602e.ad(j, j2, j3, j3);
    }
}
