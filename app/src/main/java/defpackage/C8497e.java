package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8497e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C0943e c0943e = (C0943e) obj;
        String str = c0943e.f3363e;
        c17790e.m4424case(c0943e.ad());
        Long l = c0943e.f3366e;
        C14808e c14808e = AbstractC11069e.mopub;
        c14808e.adcel(c17790e, 8, l);
        boolean z = c0943e.f3364e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 7, Boolean.valueOf(z));
        }
        EnumC5699e enumC5699e = c0943e.f3368e;
        if (enumC5699e != EnumC5699e.GENERAL) {
            EnumC5699e.f12101e.adcel(c17790e, 6, enumC5699e);
        }
        long j = c0943e.f3365e;
        if (j != 0) {
            c14808e.adcel(c17790e, 5, Long.valueOf(j));
        }
        C3418e.f7647e.adcel(c17790e, 4, c0943e.f3369e);
        C15347e c15347e = c0943e.f3370e;
        if (c15347e != null) {
            C15347e.f30269e.adcel(c17790e, 3, c15347e);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.adcel(c17790e, 2, str);
        }
        long j2 = c0943e.f3367e;
        if (j2 != 0) {
            c14808e.adcel(c17790e, 1, Long.valueOf(j2));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj;
        Object obj2;
        Object obj3 = EnumC5699e.GENERAL;
        long license = c17546e.license();
        long j = 0;
        Object obj4 = null;
        Long l = null;
        boolean z = false;
        Object obj5 = obj3;
        String str = BuildConfig.FLAVOR;
        Object obj6 = null;
        long j2 = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C0943e(j2, str, (C15347e) obj6, (C3418e) obj4, j, (EnumC5699e) obj5, z, l, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.mopub;
            switch (billing) {
                case 1:
                    obj = obj5;
                    obj2 = obj6;
                    c14808e.getClass();
                    j2 = c17546e.loadAd();
                    break;
                case 2:
                    AbstractC11069e.Signature.getClass();
                    str = c17546e.advert();
                    continue;
                case 3:
                    obj6 = C15347e.f30269e.metrica(c17546e);
                    continue;
                case 4:
                    obj4 = C3418e.f7647e.metrica(c17546e);
                    continue;
                case 5:
                    obj = obj5;
                    obj2 = obj6;
                    c14808e.getClass();
                    j = c17546e.loadAd();
                    break;
                case 6:
                    try {
                        obj5 = EnumC5699e.f12101e.metrica(c17546e);
                        continue;
                    } catch (C17420e e) {
                        obj = obj5;
                        obj2 = obj6;
                        c17546e.ad(billing, 1, Long.valueOf(e.f34135e));
                        break;
                    }
                case 7:
                    z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
                    continue;
                case 8:
                    c14808e.getClass();
                    l = Long.valueOf(c17546e.loadAd());
                    continue;
                default:
                    c17546e.smaato(billing);
                    obj = obj5;
                    obj2 = obj6;
                    break;
            }
            obj6 = obj2;
            obj5 = obj;
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C0943e c0943e = (C0943e) obj;
        String str = c0943e.f3363e;
        int license = c0943e.ad().license();
        long j = c0943e.f3367e;
        C14808e c14808e = AbstractC11069e.mopub;
        if (j != 0) {
            license += c14808e.advert(1, Long.valueOf(j));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += AbstractC11069e.Signature.advert(2, str);
        }
        C15347e c15347e = c0943e.f3370e;
        if (c15347e != null) {
            license += C15347e.f30269e.advert(3, c15347e);
        }
        int advert = C3418e.f7647e.advert(4, c0943e.f3369e) + license;
        long j2 = c0943e.f3365e;
        if (j2 != 0) {
            advert += c14808e.advert(5, Long.valueOf(j2));
        }
        EnumC5699e enumC5699e = c0943e.f3368e;
        if (enumC5699e != EnumC5699e.GENERAL) {
            advert += EnumC5699e.f12101e.advert(6, enumC5699e);
        }
        boolean z = c0943e.f3364e;
        if (z) {
            advert = AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 7, advert);
        }
        return c14808e.advert(8, c0943e.f3366e) + advert;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C0943e c0943e = (C0943e) obj;
        String str = c0943e.f3363e;
        long j = c0943e.f3367e;
        C14808e c14808e = AbstractC11069e.mopub;
        if (j != 0) {
            c14808e.startapp(c0444e, 1, Long.valueOf(j));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.startapp(c0444e, 2, str);
        }
        C15347e c15347e = c0943e.f3370e;
        if (c15347e != null) {
            C15347e.f30269e.startapp(c0444e, 3, c15347e);
        }
        C3418e.f7647e.startapp(c0444e, 4, c0943e.f3369e);
        long j2 = c0943e.f3365e;
        if (j2 != 0) {
            c14808e.startapp(c0444e, 5, Long.valueOf(j2));
        }
        EnumC5699e enumC5699e = c0943e.f3368e;
        if (enumC5699e != EnumC5699e.GENERAL) {
            EnumC5699e.f12101e.startapp(c0444e, 6, enumC5699e);
        }
        boolean z = c0943e.f3364e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 7, Boolean.valueOf(z));
        }
        c14808e.startapp(c0444e, 8, c0943e.f3366e);
        c0444e.m356try(c0943e.ad());
    }
}
