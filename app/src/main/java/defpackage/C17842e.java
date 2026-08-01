package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17842e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C3315e c3315e = (C3315e) obj;
        c17790e.m4424case(c3315e.ad());
        long j = c3315e.f7484e;
        if (j != 0) {
            AbstractC11069e.mopub.adcel(c17790e, 1, Long.valueOf(j));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        long j = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C3315e(j, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                AbstractC11069e.mopub.getClass();
                j = c17546e.loadAd();
            } else {
                c17546e.smaato(billing);
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C3315e c3315e = (C3315e) obj;
        int license = c3315e.ad().license();
        long j = c3315e.f7484e;
        if (j == 0) {
            return license;
        }
        return AbstractC11069e.mopub.advert(1, Long.valueOf(j)) + license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C3315e c3315e = (C3315e) obj;
        long j = c3315e.f7484e;
        if (j != 0) {
            AbstractC11069e.mopub.startapp(c0444e, 1, Long.valueOf(j));
        }
        c0444e.m356try(c3315e.ad());
    }
}
