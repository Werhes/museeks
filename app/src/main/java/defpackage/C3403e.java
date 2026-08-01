package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3403e extends AbstractC9555e {
    public static final C3403e license = new AbstractC9555e(0, 2, 1);

    @Override // defpackage.AbstractC9555e
    public final void license(C11226e c11226e, InterfaceC11305e interfaceC11305e, C14479e c14479e, C14995e c14995e, InterfaceC15989e interfaceC15989e) {
        int i;
        C9898e c9898e = (C9898e) c11226e.billing(0);
        int metrica = c14479e.metrica((C3155e) c11226e.billing(1));
        if (c14479e.pro >= metrica) {
            AbstractC1889e.ad("Check failed");
        }
        AbstractC12681e.license(c14479e, interfaceC11305e, metrica);
        int i2 = c14479e.pro;
        int i3 = c14479e.tapsense;
        while (i3 >= 0 && !c14479e.isPro(i3)) {
            i3 = c14479e.firebase(c14479e.vip, i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (c14479e.tapsense(i2, i4)) {
                if (c14479e.isPro(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += c14479e.isPro(i4) ? 1 : c14479e.vip[(c14479e.subscription(i4) * 5) + 1] & 67108863;
                i4 += c14479e.signatures(i4);
            }
        }
        while (true) {
            i = c14479e.pro;
            if (i >= metrica) {
                break;
            }
            if (c14479e.tapsense(metrica, i)) {
                int i6 = c14479e.pro;
                if (i6 < c14479e.signatures && (c14479e.vip[(c14479e.subscription(i6) * 5) + 1] & 1073741824) != 0) {
                    interfaceC11305e.appmetrica(c14479e.crashlytics(c14479e.pro));
                    i5 = 0;
                }
                c14479e.m3809break();
            } else {
                i5 += c14479e.m3821throw();
            }
        }
        if (i != metrica) {
            AbstractC1889e.ad("Check failed");
        }
        c9898e.ad = i5;
    }
}
