package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4618e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C17983e c17983e = (C17983e) obj;
        c17790e.m4424case(c17983e.ad());
        AbstractC11069e.mopub.adcel(c17790e, 4, c17983e.f35275e);
        String str = c17983e.f35276e;
        C14808e c14808e = AbstractC11069e.Signature;
        c14808e.adcel(c17790e, 3, str);
        c14808e.adcel(c17790e, 2, c17983e.f35273e);
        EnumC3217e enumC3217e = c17983e.f35274e;
        if (enumC3217e != EnumC3217e.SUCCESS) {
            EnumC3217e.f7336e.adcel(c17790e, 1, enumC3217e);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj = EnumC3217e.SUCCESS;
        long license = c17546e.license();
        String str = null;
        String str2 = null;
        Long l = null;
        while (true) {
            Object obj2 = obj;
            while (true) {
                int billing = c17546e.billing();
                if (billing == -1) {
                    return new C17983e((EnumC3217e) obj2, str, str2, l, c17546e.appmetrica(license));
                }
                if (billing != 1) {
                    C14808e c14808e = AbstractC11069e.Signature;
                    if (billing == 2) {
                        c14808e.getClass();
                        str = c17546e.advert();
                    } else if (billing == 3) {
                        c14808e.getClass();
                        str2 = c17546e.advert();
                    } else if (billing != 4) {
                        c17546e.smaato(billing);
                    } else {
                        AbstractC11069e.mopub.getClass();
                        l = Long.valueOf(c17546e.loadAd());
                    }
                } else {
                    try {
                        obj = EnumC3217e.f7336e.metrica(c17546e);
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
        C17983e c17983e = (C17983e) obj;
        int license = c17983e.ad().license();
        EnumC3217e enumC3217e = c17983e.f35274e;
        if (enumC3217e != EnumC3217e.SUCCESS) {
            license += EnumC3217e.f7336e.advert(1, enumC3217e);
        }
        String str = c17983e.f35273e;
        C14808e c14808e = AbstractC11069e.Signature;
        return AbstractC11069e.mopub.advert(4, c17983e.f35275e) + c14808e.advert(3, c17983e.f35276e) + c14808e.advert(2, str) + license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C17983e c17983e = (C17983e) obj;
        EnumC3217e enumC3217e = c17983e.f35274e;
        if (enumC3217e != EnumC3217e.SUCCESS) {
            EnumC3217e.f7336e.startapp(c0444e, 1, enumC3217e);
        }
        String str = c17983e.f35273e;
        C14808e c14808e = AbstractC11069e.Signature;
        c14808e.startapp(c0444e, 2, str);
        c14808e.startapp(c0444e, 3, c17983e.f35276e);
        AbstractC11069e.mopub.startapp(c0444e, 4, c17983e.f35275e);
        c0444e.m356try(c17983e.ad());
    }
}
