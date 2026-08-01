package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5206e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C3230e c3230e = (C3230e) obj;
        c17790e.m4424case(c3230e.ad());
        int i = c3230e.f7359e;
        if (i != 0) {
            AbstractC11069e.billing.adcel(c17790e, 2, Integer.valueOf(i));
        }
        boolean z = c3230e.f7360e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 1, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        boolean z = false;
        int i = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C3230e(z, i, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
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
        C3230e c3230e = (C3230e) obj;
        int license = c3230e.ad().license();
        boolean z = c3230e.f7360e;
        if (z) {
            license = AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 1, license);
        }
        int i = c3230e.f7359e;
        return i != 0 ? AbstractC8647e.signatures(i, AbstractC11069e.billing, 2, license) : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C3230e c3230e = (C3230e) obj;
        boolean z = c3230e.f7360e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 1, Boolean.valueOf(z));
        }
        int i = c3230e.f7359e;
        if (i != 0) {
            AbstractC11069e.billing.startapp(c0444e, 2, Integer.valueOf(i));
        }
        c0444e.m356try(c3230e.ad());
    }
}
