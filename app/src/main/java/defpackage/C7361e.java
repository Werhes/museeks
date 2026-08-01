package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7361e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C12282e c12282e = (C12282e) obj;
        String str = c12282e.f24619e;
        c17790e.m4424case(c12282e.ad());
        String str2 = c12282e.f24618e;
        C14808e c14808e = AbstractC11069e.Signature;
        c14808e.adcel(c17790e, 5, str2);
        AbstractC11069e.yandex.adcel(c17790e, 4, c12282e.f24620e);
        AbstractC11069e.mopub.adcel(c17790e, 3, c12282e.f24621e);
        String str3 = c12282e.f24617e;
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 2, str3);
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
        Long l = null;
        Integer num = null;
        String str3 = null;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C12282e(str, str2, l, num, str3, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.Signature;
            if (billing == 1) {
                c14808e.getClass();
                str = c17546e.advert();
            } else if (billing == 2) {
                c14808e.getClass();
                str2 = c17546e.advert();
            } else if (billing == 3) {
                AbstractC11069e.mopub.getClass();
                l = Long.valueOf(c17546e.loadAd());
            } else if (billing == 4) {
                AbstractC11069e.yandex.getClass();
                num = Integer.valueOf(c17546e.amazon());
            } else if (billing != 5) {
                c17546e.smaato(billing);
            } else {
                c14808e.getClass();
                str3 = c17546e.advert();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C12282e c12282e = (C12282e) obj;
        String str = c12282e.f24617e;
        int license = c12282e.ad().license();
        String str2 = c12282e.f24619e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(1, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += c14808e.advert(2, str);
        }
        return c14808e.advert(5, c12282e.f24618e) + AbstractC11069e.yandex.advert(4, c12282e.f24620e) + AbstractC11069e.mopub.advert(3, c12282e.f24621e) + license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C12282e c12282e = (C12282e) obj;
        String str = c12282e.f24617e;
        String str2 = c12282e.f24619e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 1, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 2, str);
        }
        AbstractC11069e.mopub.startapp(c0444e, 3, c12282e.f24621e);
        AbstractC11069e.yandex.startapp(c0444e, 4, c12282e.f24620e);
        c14808e.startapp(c0444e, 5, c12282e.f24618e);
        c0444e.m356try(c12282e.ad());
    }
}
