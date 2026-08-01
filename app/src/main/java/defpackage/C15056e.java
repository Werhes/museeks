package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15056e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C16742e c16742e = (C16742e) obj;
        String str = c16742e.f32820e;
        c17790e.m4424case(c16742e.ad());
        String str2 = c16742e.f32823e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 6, str2);
        }
        long j = c16742e.f32821e;
        C14808e c14808e2 = AbstractC11069e.mopub;
        if (j != 0) {
            c14808e2.adcel(c17790e, 5, Long.valueOf(j));
        }
        long j2 = c16742e.f32824e;
        if (j2 != 0) {
            c14808e2.adcel(c17790e, 4, Long.valueOf(j2));
        }
        boolean z = c16742e.f32825e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 3, Boolean.valueOf(z));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 2, str);
        }
        long j3 = c16742e.f32822e;
        if (j3 != 0) {
            c14808e2.adcel(c17790e, 1, Long.valueOf(j3));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        boolean z = false;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C16742e(j, str, z, j2, j3, str2, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.Signature;
            C14808e c14808e2 = AbstractC11069e.mopub;
            switch (billing) {
                case 1:
                    c14808e2.getClass();
                    j = c17546e.loadAd();
                    break;
                case 2:
                    c14808e.getClass();
                    str = c17546e.advert();
                    break;
                case 3:
                    z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
                    break;
                case 4:
                    c14808e2.getClass();
                    j2 = c17546e.loadAd();
                    break;
                case 5:
                    c14808e2.getClass();
                    j3 = c17546e.loadAd();
                    break;
                case 6:
                    c14808e.getClass();
                    str2 = c17546e.advert();
                    break;
                default:
                    c17546e.smaato(billing);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C16742e c16742e = (C16742e) obj;
        String str = c16742e.f32823e;
        String str2 = c16742e.f32820e;
        int license = c16742e.ad().license();
        long j = c16742e.f32822e;
        C14808e c14808e = AbstractC11069e.mopub;
        if (j != 0) {
            license += c14808e.advert(1, Long.valueOf(j));
        }
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e2 = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e2.advert(2, str2);
        }
        boolean z = c16742e.f32825e;
        if (z) {
            license = AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 3, license);
        }
        long j2 = c16742e.f32824e;
        if (j2 != 0) {
            license += c14808e.advert(4, Long.valueOf(j2));
        }
        long j3 = c16742e.f32821e;
        if (j3 != 0) {
            license += c14808e.advert(5, Long.valueOf(j3));
        }
        return !AbstractC7890e.billing(str, BuildConfig.FLAVOR) ? c14808e2.advert(6, str) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C16742e c16742e = (C16742e) obj;
        String str = c16742e.f32823e;
        String str2 = c16742e.f32820e;
        long j = c16742e.f32822e;
        C14808e c14808e = AbstractC11069e.mopub;
        if (j != 0) {
            c14808e.startapp(c0444e, 1, Long.valueOf(j));
        }
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e2 = AbstractC11069e.Signature;
        if (!billing) {
            c14808e2.startapp(c0444e, 2, str2);
        }
        boolean z = c16742e.f32825e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 3, Boolean.valueOf(z));
        }
        long j2 = c16742e.f32824e;
        if (j2 != 0) {
            c14808e.startapp(c0444e, 4, Long.valueOf(j2));
        }
        long j3 = c16742e.f32821e;
        if (j3 != 0) {
            c14808e.startapp(c0444e, 5, Long.valueOf(j3));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e2.startapp(c0444e, 6, str);
        }
        c0444e.m356try(c16742e.ad());
    }
}
