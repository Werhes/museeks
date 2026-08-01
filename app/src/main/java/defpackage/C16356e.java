package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16356e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C13168e c13168e = (C13168e) obj;
        String str = c13168e.f26143e;
        String str2 = c13168e.f26146e;
        c17790e.m4424case(c13168e.ad());
        boolean z = c13168e.f26144e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 5, Boolean.valueOf(z));
        }
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 4, str2);
        }
        long j = c13168e.f26147e;
        if (j != 0) {
            AbstractC11069e.mopub.adcel(c17790e, 3, Long.valueOf(j));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 2, str);
        }
        int i = c13168e.f26145e;
        if (i != 0) {
            AbstractC11069e.yandex.adcel(c17790e, 1, Integer.valueOf(i));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        int i = 0;
        boolean z = false;
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        long j = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C13168e(i, str, j, str2, z, c17546e.appmetrica(license));
            }
            if (billing != 1) {
                C14808e c14808e = AbstractC11069e.Signature;
                if (billing == 2) {
                    c14808e.getClass();
                    str = c17546e.advert();
                } else if (billing == 3) {
                    AbstractC11069e.mopub.getClass();
                    j = c17546e.loadAd();
                } else if (billing == 4) {
                    c14808e.getClass();
                    str2 = c17546e.advert();
                } else if (billing != 5) {
                    c17546e.smaato(billing);
                } else {
                    z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
                }
            } else {
                AbstractC11069e.yandex.getClass();
                i = c17546e.amazon();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C13168e c13168e = (C13168e) obj;
        String str = c13168e.f26146e;
        String str2 = c13168e.f26143e;
        int license = c13168e.ad().license();
        int i = c13168e.f26145e;
        if (i != 0) {
            license += AbstractC11069e.yandex.advert(1, Integer.valueOf(i));
        }
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(2, str2);
        }
        long j = c13168e.f26147e;
        if (j != 0) {
            license += AbstractC11069e.mopub.advert(3, Long.valueOf(j));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += c14808e.advert(4, str);
        }
        boolean z = c13168e.f26144e;
        return z ? AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 5, license) : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C13168e c13168e = (C13168e) obj;
        String str = c13168e.f26146e;
        String str2 = c13168e.f26143e;
        int i = c13168e.f26145e;
        if (i != 0) {
            AbstractC11069e.yandex.startapp(c0444e, 1, Integer.valueOf(i));
        }
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 2, str2);
        }
        long j = c13168e.f26147e;
        if (j != 0) {
            AbstractC11069e.mopub.startapp(c0444e, 3, Long.valueOf(j));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 4, str);
        }
        boolean z = c13168e.f26144e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 5, Boolean.valueOf(z));
        }
        c0444e.m356try(c13168e.ad());
    }
}
