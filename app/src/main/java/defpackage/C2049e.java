package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۘۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2049e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C17333e c17333e = (C17333e) obj;
        c17790e.m4424case(c17333e.ad());
        String str = c17333e.f34014e;
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.adcel(c17790e, 2, str);
        }
        long j = c17333e.f34015e;
        if (j != 0) {
            AbstractC11069e.adcel.adcel(c17790e, 1, Long.valueOf(j));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        long j = 0;
        String str = BuildConfig.FLAVOR;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C17333e(j, str, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                AbstractC11069e.adcel.getClass();
                j = c17546e.loadAd();
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                AbstractC11069e.Signature.getClass();
                str = c17546e.advert();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C17333e c17333e = (C17333e) obj;
        String str = c17333e.f34014e;
        int license = c17333e.ad().license();
        long j = c17333e.f34015e;
        if (j != 0) {
            license += AbstractC11069e.adcel.advert(1, Long.valueOf(j));
        }
        return !AbstractC7890e.billing(str, BuildConfig.FLAVOR) ? AbstractC11069e.Signature.advert(2, str) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C17333e c17333e = (C17333e) obj;
        String str = c17333e.f34014e;
        long j = c17333e.f34015e;
        if (j != 0) {
            AbstractC11069e.adcel.startapp(c0444e, 1, Long.valueOf(j));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.startapp(c0444e, 2, str);
        }
        c0444e.m356try(c17333e.ad());
    }
}
