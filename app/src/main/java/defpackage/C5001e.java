package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٛؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5001e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C9441e c9441e = (C9441e) obj;
        String str = c9441e.f18781e;
        String str2 = c9441e.f18783e;
        c17790e.m4424case(c9441e.ad());
        int i = c9441e.f18782e;
        if (i != 0) {
            AbstractC11069e.billing.adcel(c17790e, 4, Integer.valueOf(i));
        }
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 3, str2);
        }
        EnumC13735e enumC13735e = c9441e.f18780e;
        if (enumC13735e != EnumC13735e.Android) {
            EnumC13735e.f27219e.adcel(c17790e, 2, enumC13735e);
        }
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        c14808e.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj = EnumC13735e.Android;
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        int i = 0;
        while (true) {
            Object obj2 = obj;
            while (true) {
                int billing = c17546e.billing();
                if (billing == -1) {
                    return new C9441e(str, (EnumC13735e) obj2, str2, i, c17546e.appmetrica(license));
                }
                C14808e c14808e = AbstractC11069e.Signature;
                if (billing == 1) {
                    c14808e.getClass();
                    str = c17546e.advert();
                } else if (billing == 2) {
                    try {
                        obj = EnumC13735e.f27219e.metrica(c17546e);
                        break;
                    } catch (C17420e e) {
                        c17546e.ad(billing, 1, Long.valueOf(e.f34135e));
                    }
                } else if (billing == 3) {
                    c14808e.getClass();
                    str2 = c17546e.advert();
                } else if (billing != 4) {
                    c17546e.smaato(billing);
                } else {
                    AbstractC11069e.billing.getClass();
                    i = c17546e.amazon();
                }
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C9441e c9441e = (C9441e) obj;
        String str = c9441e.f18783e;
        int license = c9441e.ad().license();
        String str2 = c9441e.f18781e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(1, str2);
        }
        EnumC13735e enumC13735e = c9441e.f18780e;
        if (enumC13735e != EnumC13735e.Android) {
            license += EnumC13735e.f27219e.advert(2, enumC13735e);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += c14808e.advert(3, str);
        }
        int i = c9441e.f18782e;
        return i != 0 ? AbstractC8647e.signatures(i, AbstractC11069e.billing, 4, license) : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C9441e c9441e = (C9441e) obj;
        String str = c9441e.f18783e;
        String str2 = c9441e.f18781e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 1, str2);
        }
        EnumC13735e enumC13735e = c9441e.f18780e;
        if (enumC13735e != EnumC13735e.Android) {
            EnumC13735e.f27219e.startapp(c0444e, 2, enumC13735e);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 3, str);
        }
        int i = c9441e.f18782e;
        if (i != 0) {
            AbstractC11069e.billing.startapp(c0444e, 4, Integer.valueOf(i));
        }
        c0444e.m356try(c9441e.ad());
    }
}
