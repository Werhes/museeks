package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13558e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C6838e c6838e = (C6838e) obj;
        c17790e.m4424case(c6838e.ad());
        boolean z = c6838e.f14088e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 2, Boolean.valueOf(z));
        }
        C18399e.f36074e.adcel(c17790e, 1, c6838e.f14089e);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        Object obj = null;
        boolean z = false;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C6838e((C18399e) obj, z, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                obj = C18399e.f36074e.metrica(c17546e);
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C6838e c6838e = (C6838e) obj;
        int advert = C18399e.f36074e.advert(1, c6838e.f14089e) + c6838e.ad().license();
        boolean z = c6838e.f14088e;
        return z ? AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 2, advert) : advert;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C6838e c6838e = (C6838e) obj;
        C18399e.f36074e.startapp(c0444e, 1, c6838e.f14089e);
        boolean z = c6838e.f14088e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 2, Boolean.valueOf(z));
        }
        c0444e.m356try(c6838e.ad());
    }
}
