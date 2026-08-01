package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7438e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C0488e c0488e = (C0488e) obj;
        c17790e.m4424case(c0488e.ad());
        String str = c0488e.f2554e;
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.adcel(c17790e, 2, str);
        }
        long j = c0488e.f2555e;
        if (j != 0) {
            AbstractC11069e.mopub.adcel(c17790e, 1, Long.valueOf(j));
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
                return new C0488e(j, str, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                AbstractC11069e.mopub.getClass();
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
        C0488e c0488e = (C0488e) obj;
        String str = c0488e.f2554e;
        int license = c0488e.ad().license();
        long j = c0488e.f2555e;
        if (j != 0) {
            license += AbstractC11069e.mopub.advert(1, Long.valueOf(j));
        }
        return !AbstractC7890e.billing(str, BuildConfig.FLAVOR) ? AbstractC11069e.Signature.advert(2, str) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C0488e c0488e = (C0488e) obj;
        String str = c0488e.f2554e;
        long j = c0488e.f2555e;
        if (j != 0) {
            AbstractC11069e.mopub.startapp(c0444e, 1, Long.valueOf(j));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.startapp(c0444e, 2, str);
        }
        c0444e.m356try(c0488e.ad());
    }
}
