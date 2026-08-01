package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۢؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14315e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C12212e c12212e = (C12212e) obj;
        c17790e.m4424case(c12212e.ad());
        boolean z = c12212e.f24524e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 1, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        boolean z = false;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C12212e(z, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
            } else {
                c17546e.smaato(billing);
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C12212e c12212e = (C12212e) obj;
        int license = c12212e.ad().license();
        boolean z = c12212e.f24524e;
        return z ? AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 1, license) : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C12212e c12212e = (C12212e) obj;
        boolean z = c12212e.f24524e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 1, Boolean.valueOf(z));
        }
        c0444e.m356try(c12212e.ad());
    }
}
