package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17487e {
    public static final C2892e ad = new C2892e(230278729, false, new C8898e(9));
    public static final C2892e vip = new C2892e(146117832, false, new C8898e(17));
    public static final C2892e metrica = new C2892e(-362925379, false, new C8898e(18));
    public static final C2892e license = new C2892e(723850542, false, new C14866e(0));
    public static final C2892e appmetrica = new C2892e(-412093904, false, new C14866e(1));
    public static final C2892e purchase = new C2892e(-698890443, false, new C8898e(10));
    public static final C2892e billing = new C2892e(-1175703550, false, new C14866e(2));
    public static final C2892e yandex = new C2892e(1983319300, false, new C14866e(3));
    public static final C2892e startapp = new C2892e(1696522761, false, new C8898e(11));
    public static final C2892e adcel = new C2892e(-1057107709, false, new C8898e(12));
    public static final C2892e mopub = new C2892e(-1459295863, false, new C14866e(4));
    public static final C2892e advert = new C2892e(-1336014197, false, new C14866e(5));
    public static final C2892e smaato = new C2892e(785549712, false, new C8898e(13));
    public static final C2892e amazon = new C2892e(894610570, false, new C8898e(14));
    public static final C2892e loadAd = new C2892e(-671432651, false, new C8898e(15));
    public static final C2892e Signature = new C2892e(236558041, false, new C14866e(6));
    public static final C2892e admob = new C2892e(1134880208, false, new C8898e(16));

    public static final long ad(C11388e c11388e, C7765e c7765e, C7102e c7102e, long j) {
        long j2;
        long amazon2 = c7765e.amazon();
        if ((9223372034707292159L & amazon2) != 9205357640488583168L && c11388e.license().f33322e.length() != 0) {
            long j3 = c11388e.license().f33324e;
            EnumC12813e advert2 = c7765e.advert();
            int i = advert2 == null ? -1 : AbstractC7810e.ad[advert2.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    int i2 = C12347e.metrica;
                    j2 = j3 >> 32;
                } else {
                    if (i != 3) {
                        throw new C14803e(10);
                    }
                    int i3 = C12347e.metrica;
                    j2 = j3 & 4294967295L;
                }
                int i4 = (int) j2;
                C12476e metrica2 = c7102e.metrica();
                if (metrica2 != null) {
                    C12890e c12890e = metrica2.vip;
                    float intBitsToFloat = Float.intBitsToFloat((int) (amazon2 >> 32));
                    int license2 = c12890e.license(i4);
                    float billing2 = metrica2.billing(license2);
                    float yandex2 = metrica2.yandex(license2);
                    float vip2 = AbstractC3062e.vip(intBitsToFloat, Math.min(billing2, yandex2), Math.max(billing2, yandex2));
                    if (C12729e.vip(j, 0L) || Math.abs(intBitsToFloat - vip2) <= ((int) (j >> 32)) / 2) {
                        float purchase2 = c12890e.purchase(license2);
                        long floatToRawIntBits = (Float.floatToRawIntBits(((c12890e.vip(license2) - purchase2) / 2) + purchase2) & 4294967295L) | (Float.floatToRawIntBits(vip2) << 32);
                        InterfaceC0043e appmetrica2 = c7102e.appmetrica();
                        C2152e c2152e = null;
                        if (appmetrica2 != null) {
                            if (!appmetrica2.billing()) {
                                appmetrica2 = null;
                            }
                            if (appmetrica2 != null) {
                                floatToRawIntBits = AbstractC17416e.ad(floatToRawIntBits, AbstractC14520e.startapp(appmetrica2));
                            }
                        }
                        InterfaceC0043e appmetrica3 = c7102e.appmetrica();
                        if (appmetrica3 == null) {
                            return floatToRawIntBits;
                        }
                        if (!appmetrica3.billing()) {
                            appmetrica3 = null;
                        }
                        if (appmetrica3 == null) {
                            return floatToRawIntBits;
                        }
                        InterfaceC0043e interfaceC0043e = (InterfaceC0043e) c7102e.license.getValue();
                        if (interfaceC0043e != null) {
                            if (!interfaceC0043e.billing()) {
                                interfaceC0043e = null;
                            }
                            if (interfaceC0043e != null) {
                                c2152e = new C2152e(interfaceC0043e.mo207class(appmetrica3, floatToRawIntBits));
                            }
                        }
                        return c2152e != null ? c2152e.ad : floatToRawIntBits;
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    public static final long license(long j, long j2) {
        int appmetrica2;
        int billing2 = C12347e.billing(j);
        int purchase2 = C12347e.purchase(j);
        if ((C12347e.billing(j2) < C12347e.purchase(j)) && (C12347e.billing(j) < C12347e.purchase(j2))) {
            if (C12347e.ad(j2, j)) {
                billing2 = C12347e.billing(j2);
                purchase2 = billing2;
            } else {
                if (C12347e.ad(j, j2)) {
                    appmetrica2 = C12347e.appmetrica(j2);
                } else {
                    int billing3 = C12347e.billing(j2);
                    if (billing2 >= C12347e.purchase(j2) || billing3 > billing2) {
                        purchase2 = C12347e.billing(j2);
                    } else {
                        billing2 = C12347e.billing(j2);
                        appmetrica2 = C12347e.appmetrica(j2);
                    }
                }
                purchase2 -= appmetrica2;
            }
        } else if (purchase2 > C12347e.billing(j2)) {
            billing2 -= C12347e.appmetrica(j2);
            appmetrica2 = C12347e.appmetrica(j2);
            purchase2 -= appmetrica2;
        }
        return AbstractC9262e.metrica(billing2, purchase2);
    }

    public static final C0520e metrica(InterfaceC11824e interfaceC11824e, int i) {
        return C0520e.license(interfaceC11824e.getString(i));
    }

    public static final C11709e vip(InterfaceC11824e interfaceC11824e, int i) {
        return C9616e.advert(interfaceC11824e.ad(i), interfaceC11824e.vip(i));
    }
}
