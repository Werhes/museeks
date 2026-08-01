package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12869e {
    public static final C9622e ad;
    public static final C0834e metrica;
    public static final C9622e vip;

    static {
        C3700e c3700e = C3700e.purchase;
        C3700e c3700e2 = C3700e.license;
        C2942e c2942e = C2942e.vip;
        try {
            C11467e vip2 = C9622e.vip();
            vip2.f23072e = 32;
            vip2.f23070e = 16;
            vip2.f23071e = c2942e;
            vip2.f23069e = c3700e2;
            ad = vip2.loadAd();
            try {
                C11467e vip3 = C9622e.vip();
                vip3.f23072e = 32;
                vip3.f23070e = 32;
                vip3.f23071e = c2942e;
                vip3.f23069e = c3700e2;
                vip3.loadAd();
                try {
                    C11467e vip4 = C9622e.vip();
                    vip4.f23072e = 64;
                    vip4.f23070e = 32;
                    vip4.f23071e = c2942e;
                    vip4.f23069e = c3700e;
                    vip4.loadAd();
                    try {
                        C11467e vip5 = C9622e.vip();
                        vip5.f23072e = 64;
                        vip5.f23070e = 64;
                        vip5.f23071e = c2942e;
                        vip5.f23069e = c3700e;
                        vip = vip5.loadAd();
                        try {
                            C0909e vip6 = C0834e.vip();
                            vip6.m418break(32);
                            vip6.m417abstract(16);
                            vip6.f3321e = C6594e.f13609e;
                            metrica = vip6.tapsense();
                        } catch (Exception e) {
                            throw new C14803e(e, 14);
                        }
                    } catch (Exception e2) {
                        throw new C14803e(e2, 14);
                    }
                } catch (Exception e3) {
                    throw new C14803e(e3, 14);
                }
            } catch (Exception e4) {
                throw new C14803e(e4, 14);
            }
        } catch (Exception e5) {
            throw new C14803e(e5, 14);
        }
    }
}
