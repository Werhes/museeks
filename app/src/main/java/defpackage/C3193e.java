package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3193e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C2357e c2357e = (C2357e) obj;
        String str = c2357e.f5898e;
        String str2 = c2357e.f5895e;
        String str3 = c2357e.f5901e;
        c17790e.m4424case(c2357e.ad());
        int i = c2357e.f5896e;
        if (i != 0) {
            AbstractC11069e.yandex.adcel(c17790e, 7, Integer.valueOf(i));
        }
        boolean z = c2357e.f5899e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.adcel(c17790e, 6, Boolean.valueOf(z));
        }
        boolean z2 = c2357e.f5897e;
        if (z2) {
            c14808e.adcel(c17790e, 5, Boolean.valueOf(z2));
        }
        boolean z3 = c2357e.f5900e;
        if (z3) {
            c14808e.adcel(c17790e, 4, Boolean.valueOf(z3));
        }
        boolean billing = AbstractC7890e.billing(str3, BuildConfig.FLAVOR);
        C14808e c14808e2 = AbstractC11069e.Signature;
        if (!billing) {
            c14808e2.adcel(c17790e, 3, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e2.adcel(c17790e, 2, str2);
        }
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        c14808e2.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        String str3 = str2;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C2357e(str, str2, str3, z, z2, z3, i, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.Signature;
            C14808e c14808e2 = AbstractC11069e.purchase;
            switch (billing) {
                case 1:
                    c14808e.getClass();
                    str = c17546e.advert();
                    break;
                case 2:
                    c14808e.getClass();
                    str2 = c17546e.advert();
                    break;
                case 3:
                    c14808e.getClass();
                    str3 = c17546e.advert();
                    break;
                case 4:
                    z = ((Boolean) c14808e2.metrica(c17546e)).booleanValue();
                    break;
                case 5:
                    z2 = ((Boolean) c14808e2.metrica(c17546e)).booleanValue();
                    break;
                case 6:
                    z3 = ((Boolean) c14808e2.metrica(c17546e)).booleanValue();
                    break;
                case 7:
                    AbstractC11069e.yandex.getClass();
                    i = c17546e.amazon();
                    break;
                default:
                    c17546e.smaato(billing);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C2357e c2357e = (C2357e) obj;
        String str = c2357e.f5901e;
        String str2 = c2357e.f5895e;
        int license = c2357e.ad().license();
        String str3 = c2357e.f5898e;
        boolean billing = AbstractC7890e.billing(str3, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(1, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            license += c14808e.advert(2, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += c14808e.advert(3, str);
        }
        boolean z = c2357e.f5900e;
        C14808e c14808e2 = AbstractC11069e.purchase;
        if (z) {
            license = AbstractC8647e.tapsense(z, c14808e2, 4, license);
        }
        boolean z2 = c2357e.f5897e;
        if (z2) {
            license = AbstractC8647e.tapsense(z2, c14808e2, 5, license);
        }
        boolean z3 = c2357e.f5899e;
        if (z3) {
            license = AbstractC8647e.tapsense(z3, c14808e2, 6, license);
        }
        int i = c2357e.f5896e;
        if (i == 0) {
            return license;
        }
        return AbstractC11069e.yandex.advert(7, Integer.valueOf(i)) + license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C2357e c2357e = (C2357e) obj;
        String str = c2357e.f5901e;
        String str2 = c2357e.f5895e;
        String str3 = c2357e.f5898e;
        boolean billing = AbstractC7890e.billing(str3, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 1, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 2, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 3, str);
        }
        boolean z = c2357e.f5900e;
        C14808e c14808e2 = AbstractC11069e.purchase;
        if (z) {
            c14808e2.startapp(c0444e, 4, Boolean.valueOf(z));
        }
        boolean z2 = c2357e.f5897e;
        if (z2) {
            c14808e2.startapp(c0444e, 5, Boolean.valueOf(z2));
        }
        boolean z3 = c2357e.f5899e;
        if (z3) {
            c14808e2.startapp(c0444e, 6, Boolean.valueOf(z3));
        }
        int i = c2357e.f5896e;
        if (i != 0) {
            AbstractC11069e.yandex.startapp(c0444e, 7, Integer.valueOf(i));
        }
        c0444e.m356try(c2357e.ad());
    }
}
