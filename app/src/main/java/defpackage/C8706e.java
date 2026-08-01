package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8706e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C12100e c12100e = (C12100e) obj;
        String str = c12100e.f24260e;
        c17790e.m4424case(c12100e.ad());
        String str2 = c12100e.f24259e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 4, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 3, str);
        }
        EnumC8488e enumC8488e = c12100e.f24257e;
        if (enumC8488e != EnumC8488e.Verbose) {
            EnumC8488e.f17274e.adcel(c17790e, 2, enumC8488e);
        }
        long j = c12100e.f24258e;
        if (j != 0) {
            AbstractC11069e.mopub.adcel(c17790e, 1, Long.valueOf(j));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj = EnumC8488e.Verbose;
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        long j = 0;
        while (true) {
            Object obj2 = obj;
            while (true) {
                int billing = c17546e.billing();
                if (billing == -1) {
                    return new C12100e(j, (EnumC8488e) obj2, str, str2, c17546e.appmetrica(license));
                }
                if (billing == 1) {
                    AbstractC11069e.mopub.getClass();
                    j = c17546e.loadAd();
                } else if (billing != 2) {
                    C14808e c14808e = AbstractC11069e.Signature;
                    if (billing == 3) {
                        c14808e.getClass();
                        str = c17546e.advert();
                    } else if (billing != 4) {
                        c17546e.smaato(billing);
                    } else {
                        c14808e.getClass();
                        str2 = c17546e.advert();
                    }
                } else {
                    try {
                        obj = EnumC8488e.f17274e.metrica(c17546e);
                        break;
                    } catch (C17420e e) {
                        c17546e.ad(billing, 1, Long.valueOf(e.f34135e));
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C12100e c12100e = (C12100e) obj;
        String str = c12100e.f24259e;
        String str2 = c12100e.f24260e;
        int license = c12100e.ad().license();
        long j = c12100e.f24258e;
        if (j != 0) {
            license += AbstractC11069e.mopub.advert(1, Long.valueOf(j));
        }
        EnumC8488e enumC8488e = c12100e.f24257e;
        if (enumC8488e != EnumC8488e.Verbose) {
            license += EnumC8488e.f17274e.advert(2, enumC8488e);
        }
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(3, str2);
        }
        return !AbstractC7890e.billing(str, BuildConfig.FLAVOR) ? c14808e.advert(4, str) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C12100e c12100e = (C12100e) obj;
        String str = c12100e.f24259e;
        String str2 = c12100e.f24260e;
        long j = c12100e.f24258e;
        if (j != 0) {
            AbstractC11069e.mopub.startapp(c0444e, 1, Long.valueOf(j));
        }
        EnumC8488e enumC8488e = c12100e.f24257e;
        if (enumC8488e != EnumC8488e.Verbose) {
            EnumC8488e.f17274e.startapp(c0444e, 2, enumC8488e);
        }
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 3, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 4, str);
        }
        c0444e.m356try(c12100e.ad());
    }
}
