package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2524e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C6019e c6019e = (C6019e) obj;
        c17790e.m4424case(c6019e.ad());
        float f = c6019e.f12676e;
        if (!Float.valueOf(f).equals(Float.valueOf(0.0f))) {
            AbstractC11069e.smaato.adcel(c17790e, 2, Float.valueOf(f));
        }
        boolean z = c6019e.f12677e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 1, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        boolean z = false;
        float f = 0.0f;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C6019e(z, f, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                AbstractC11069e.smaato.getClass();
                f = Float.intBitsToFloat(c17546e.adcel());
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C6019e c6019e = (C6019e) obj;
        float f = c6019e.f12676e;
        int license = c6019e.ad().license();
        boolean z = c6019e.f12677e;
        if (z) {
            license = AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 1, license);
        }
        if (Float.valueOf(f).equals(Float.valueOf(0.0f))) {
            return license;
        }
        return AbstractC11069e.smaato.advert(2, Float.valueOf(f)) + license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C6019e c6019e = (C6019e) obj;
        float f = c6019e.f12676e;
        boolean z = c6019e.f12677e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 1, Boolean.valueOf(z));
        }
        if (!Float.valueOf(f).equals(Float.valueOf(0.0f))) {
            AbstractC11069e.smaato.startapp(c0444e, 2, Float.valueOf(f));
        }
        c0444e.m356try(c6019e.ad());
    }
}
