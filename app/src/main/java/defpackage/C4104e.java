package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4104e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C1768e c1768e = (C1768e) obj;
        String str = c1768e.f4812e;
        String str2 = c1768e.f4810e;
        String str3 = c1768e.f4814e;
        String str4 = c1768e.f4813e;
        c17790e.m4424case(c1768e.ad());
        String str5 = c1768e.f4811e;
        boolean billing = AbstractC7890e.billing(str5, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 5, str5);
        }
        if (!AbstractC7890e.billing(str4, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 4, str4);
        }
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 3, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 2, str2);
        }
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        c14808e.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C1768e(str, str2, str3, str4, str5, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.Signature;
            if (billing == 1) {
                c14808e.getClass();
                str = c17546e.advert();
            } else if (billing == 2) {
                c14808e.getClass();
                str2 = c17546e.advert();
            } else if (billing == 3) {
                c14808e.getClass();
                str3 = c17546e.advert();
            } else if (billing == 4) {
                c14808e.getClass();
                str4 = c17546e.advert();
            } else if (billing != 5) {
                c17546e.smaato(billing);
            } else {
                c14808e.getClass();
                str5 = c17546e.advert();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C1768e c1768e = (C1768e) obj;
        String str = c1768e.f4811e;
        String str2 = c1768e.f4813e;
        String str3 = c1768e.f4814e;
        String str4 = c1768e.f4810e;
        int license = c1768e.ad().license();
        String str5 = c1768e.f4812e;
        boolean billing = AbstractC7890e.billing(str5, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(1, str5);
        }
        if (!AbstractC7890e.billing(str4, BuildConfig.FLAVOR)) {
            license += c14808e.advert(2, str4);
        }
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            license += c14808e.advert(3, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            license += c14808e.advert(4, str2);
        }
        return !AbstractC7890e.billing(str, BuildConfig.FLAVOR) ? c14808e.advert(5, str) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C1768e c1768e = (C1768e) obj;
        String str = c1768e.f4811e;
        String str2 = c1768e.f4813e;
        String str3 = c1768e.f4814e;
        String str4 = c1768e.f4810e;
        String str5 = c1768e.f4812e;
        boolean billing = AbstractC7890e.billing(str5, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 1, str5);
        }
        if (!AbstractC7890e.billing(str4, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 2, str4);
        }
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 3, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 4, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 5, str);
        }
        c0444e.m356try(c1768e.ad());
    }
}
