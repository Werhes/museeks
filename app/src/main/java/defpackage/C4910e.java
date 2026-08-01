package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4910e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C7546e c7546e = (C7546e) obj;
        String str = c7546e.f15372e;
        String str2 = c7546e.f15371e;
        c17790e.m4424case(c7546e.ad());
        EnumC17057e enumC17057e = c7546e.f15373e;
        if (enumC17057e != EnumC17057e.f33396e) {
            EnumC17057e.f33397e.adcel(c17790e, 4, enumC17057e);
        }
        int i = c7546e.f15374e;
        if (i != 0) {
            AbstractC11069e.billing.adcel(c17790e, 3, Integer.valueOf(i));
        }
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 2, str2);
        }
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        c14808e.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj = EnumC17057e.f33396e;
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        int i = 0;
        while (true) {
            Object obj2 = obj;
            while (true) {
                int billing = c17546e.billing();
                if (billing == -1) {
                    return new C7546e(str, str2, i, (EnumC17057e) obj2, c17546e.appmetrica(license));
                }
                C14808e c14808e = AbstractC11069e.Signature;
                if (billing == 1) {
                    c14808e.getClass();
                    str = c17546e.advert();
                } else if (billing == 2) {
                    c14808e.getClass();
                    str2 = c17546e.advert();
                } else if (billing == 3) {
                    AbstractC11069e.billing.getClass();
                    i = c17546e.amazon();
                } else if (billing != 4) {
                    c17546e.smaato(billing);
                } else {
                    try {
                        obj = EnumC17057e.f33397e.metrica(c17546e);
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
        C7546e c7546e = (C7546e) obj;
        String str = c7546e.f15371e;
        int license = c7546e.ad().license();
        String str2 = c7546e.f15372e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(1, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += c14808e.advert(2, str);
        }
        int i = c7546e.f15374e;
        if (i != 0) {
            license = AbstractC8647e.signatures(i, AbstractC11069e.billing, 3, license);
        }
        EnumC17057e enumC17057e = c7546e.f15373e;
        return enumC17057e != EnumC17057e.f33396e ? EnumC17057e.f33397e.advert(4, enumC17057e) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C7546e c7546e = (C7546e) obj;
        String str = c7546e.f15371e;
        String str2 = c7546e.f15372e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 1, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 2, str);
        }
        int i = c7546e.f15374e;
        if (i != 0) {
            AbstractC11069e.billing.startapp(c0444e, 3, Integer.valueOf(i));
        }
        EnumC17057e enumC17057e = c7546e.f15373e;
        if (enumC17057e != EnumC17057e.f33396e) {
            EnumC17057e.f33397e.startapp(c0444e, 4, enumC17057e);
        }
        c0444e.m356try(c7546e.ad());
    }
}
