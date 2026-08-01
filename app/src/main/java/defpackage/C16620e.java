package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16620e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C10209e c10209e = (C10209e) obj;
        c17790e.m4424case(c10209e.ad());
        C0193e c0193e = c10209e.f20189e;
        if (!AbstractC7890e.billing(c0193e, C0193e.f1409e)) {
            AbstractC11069e.loadAd.adcel(c17790e, 2, c0193e);
        }
        C17333e c17333e = c10209e.f20190e;
        if (c17333e != null) {
            C17333e.f34013e.adcel(c17790e, 1, c17333e);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        Object obj = null;
        C0193e c0193e = C0193e.f1409e;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C10209e((C17333e) obj, c0193e, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                obj = C17333e.f34013e.metrica(c17546e);
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                AbstractC11069e.loadAd.getClass();
                c0193e = c17546e.startapp();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C10209e c10209e = (C10209e) obj;
        C0193e c0193e = c10209e.f20189e;
        int license = c10209e.ad().license();
        C17333e c17333e = c10209e.f20190e;
        if (c17333e != null) {
            license += C17333e.f34013e.advert(1, c17333e);
        }
        return !AbstractC7890e.billing(c0193e, C0193e.f1409e) ? AbstractC11069e.loadAd.advert(2, c0193e) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C10209e c10209e = (C10209e) obj;
        C0193e c0193e = c10209e.f20189e;
        C17333e c17333e = c10209e.f20190e;
        if (c17333e != null) {
            C17333e.f34013e.startapp(c0444e, 1, c17333e);
        }
        if (!AbstractC7890e.billing(c0193e, C0193e.f1409e)) {
            AbstractC11069e.loadAd.startapp(c0444e, 2, c0193e);
        }
        c0444e.m356try(c10209e.ad());
    }
}
