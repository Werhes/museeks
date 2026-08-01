package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۡۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12046e {
    public static final C15694e ad;
    public static final C12393e adcel;
    public static final C11897e appmetrica;
    public static final C12393e billing;
    public static final C9325e license;
    public static final C9325e metrica;
    public static final C11897e purchase;
    public static final C12393e startapp;
    public static final C15694e vip;
    public static final C12393e yandex;

    static {
        C11278e c11278e = C11278e.f22660e;
        C15400e c15400e = C15400e.f30387e;
        C6325e c6325e = C6325e.f13169e;
        C11594e c11594e = C11594e.f23292e;
        C16372e c16372e = C16372e.f32166e;
        try {
            C11106e vip2 = C15694e.vip();
            vip2.m3024synchronized();
            vip2.m3019return(16);
            vip2.m3023switch();
            vip2.f22006e = c16372e;
            ad = vip2.subscription();
            try {
                C11106e vip3 = C15694e.vip();
                vip3.m3024synchronized();
                vip3.m3019return(32);
                vip3.m3023switch();
                vip3.f22006e = c16372e;
                vip = vip3.subscription();
                try {
                    C11467e vip4 = C9325e.vip();
                    vip4.m3210class(16);
                    vip4.m3215interface(16);
                    vip4.m3213goto();
                    vip4.f23071e = c11594e;
                    metrica = vip4.startapp();
                    try {
                        C11467e vip5 = C9325e.vip();
                        vip5.m3210class(16);
                        vip5.m3215interface(32);
                        vip5.m3213goto();
                        vip5.f23071e = c11594e;
                        license = vip5.startapp();
                        try {
                            C2532e vip6 = C11897e.vip();
                            vip6.m904e(16);
                            vip6.m896e(32);
                            vip6.m918e(16);
                            vip6.m921e(16);
                            vip6.f6384e = c6325e;
                            vip6.f6389e = c15400e;
                            appmetrica = vip6.isVip();
                            try {
                                C2532e vip7 = C11897e.vip();
                                vip7.m904e(32);
                                vip7.m896e(32);
                                vip7.m918e(32);
                                vip7.m921e(16);
                                vip7.f6384e = c6325e;
                                vip7.f6389e = c15400e;
                                purchase = vip7.isVip();
                                try {
                                    billing = C12393e.vip(C11278e.f22661e, 12);
                                    try {
                                        yandex = C12393e.vip(c11278e, 12);
                                        try {
                                            C12393e vip8 = C12393e.vip(c11278e, 8);
                                            startapp = vip8;
                                            adcel = vip8;
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
                    } catch (Exception e6) {
                        throw new C14803e(e6, 14);
                    }
                } catch (Exception e7) {
                    throw new C14803e(e7, 14);
                }
            } catch (Exception e8) {
                throw new C14803e(e8, 14);
            }
        } catch (Exception e9) {
            throw new C14803e(e9, 14);
        }
    }
}
