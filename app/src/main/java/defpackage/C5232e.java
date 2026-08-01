package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5232e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C12761e c12761e = (C12761e) obj;
        String str = c12761e.f25535e;
        String str2 = c12761e.f25534e;
        c17790e.m4424case(c12761e.ad());
        String str3 = c12761e.f25532e;
        boolean billing = AbstractC7890e.billing(str3, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 5, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 4, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 3, str);
        }
        boolean z = c12761e.f25531e;
        C14808e c14808e2 = AbstractC11069e.purchase;
        if (z) {
            c14808e2.adcel(c17790e, 2, Boolean.valueOf(z));
        }
        boolean z2 = c12761e.f25533e;
        if (z2) {
            c14808e2.adcel(c17790e, 1, Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        boolean z = false;
        boolean z2 = false;
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        String str3 = str2;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C12761e(z, z2, str, str2, str3, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.purchase;
            if (billing == 1) {
                z = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
            } else if (billing != 2) {
                C14808e c14808e2 = AbstractC11069e.Signature;
                if (billing == 3) {
                    c14808e2.getClass();
                    str = c17546e.advert();
                } else if (billing == 4) {
                    c14808e2.getClass();
                    str2 = c17546e.advert();
                } else if (billing != 5) {
                    c17546e.smaato(billing);
                } else {
                    c14808e2.getClass();
                    str3 = c17546e.advert();
                }
            } else {
                z2 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C12761e c12761e = (C12761e) obj;
        String str = c12761e.f25532e;
        String str2 = c12761e.f25534e;
        String str3 = c12761e.f25535e;
        int license = c12761e.ad().license();
        boolean z = c12761e.f25533e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            license = AbstractC8647e.tapsense(z, c14808e, 1, license);
        }
        boolean z2 = c12761e.f25531e;
        if (z2) {
            license = AbstractC8647e.tapsense(z2, c14808e, 2, license);
        }
        boolean billing = AbstractC7890e.billing(str3, BuildConfig.FLAVOR);
        C14808e c14808e2 = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e2.advert(3, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            license += c14808e2.advert(4, str2);
        }
        return !AbstractC7890e.billing(str, BuildConfig.FLAVOR) ? c14808e2.advert(5, str) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C12761e c12761e = (C12761e) obj;
        String str = c12761e.f25532e;
        String str2 = c12761e.f25534e;
        String str3 = c12761e.f25535e;
        boolean z = c12761e.f25533e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.startapp(c0444e, 1, Boolean.valueOf(z));
        }
        boolean z2 = c12761e.f25531e;
        if (z2) {
            c14808e.startapp(c0444e, 2, Boolean.valueOf(z2));
        }
        boolean billing = AbstractC7890e.billing(str3, BuildConfig.FLAVOR);
        C14808e c14808e2 = AbstractC11069e.Signature;
        if (!billing) {
            c14808e2.startapp(c0444e, 3, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e2.startapp(c0444e, 4, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e2.startapp(c0444e, 5, str);
        }
        c0444e.m356try(c12761e.ad());
    }
}
