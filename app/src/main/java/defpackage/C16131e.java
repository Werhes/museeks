package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16131e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C1569e c1569e = (C1569e) obj;
        C0193e c0193e = c1569e.f4478e;
        c17790e.m4424case(c1569e.ad());
        int i = c1569e.f4477e;
        if (i != 0) {
            AbstractC11069e.billing.adcel(c17790e, 2, Integer.valueOf(i));
        }
        if (AbstractC7890e.billing(c0193e, C0193e.f1409e)) {
            return;
        }
        AbstractC11069e.loadAd.adcel(c17790e, 1, c0193e);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        C0193e c0193e = C0193e.f1409e;
        int i = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C1569e(c0193e, i, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                AbstractC11069e.loadAd.getClass();
                c0193e = c17546e.startapp();
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                AbstractC11069e.billing.getClass();
                i = c17546e.amazon();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C1569e c1569e = (C1569e) obj;
        int license = c1569e.ad().license();
        C0193e c0193e = c1569e.f4478e;
        if (!AbstractC7890e.billing(c0193e, C0193e.f1409e)) {
            license += AbstractC11069e.loadAd.advert(1, c0193e);
        }
        int i = c1569e.f4477e;
        return i != 0 ? AbstractC8647e.signatures(i, AbstractC11069e.billing, 2, license) : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C1569e c1569e = (C1569e) obj;
        C0193e c0193e = c1569e.f4478e;
        if (!AbstractC7890e.billing(c0193e, C0193e.f1409e)) {
            AbstractC11069e.loadAd.startapp(c0444e, 1, c0193e);
        }
        int i = c1569e.f4477e;
        if (i != 0) {
            AbstractC11069e.billing.startapp(c0444e, 2, Integer.valueOf(i));
        }
        c0444e.m356try(c1569e.ad());
    }
}
