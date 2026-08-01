package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٞٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15631e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C11708e c11708e = (C11708e) obj;
        c17790e.m4424case(c11708e.ad());
        C18399e.f36074e.adcel(c17790e, 2, c11708e.f23541e);
        EnumC10358e enumC10358e = c11708e.f23542e;
        if (enumC10358e != EnumC10358e.ANDROID) {
            EnumC10358e.f20460e.adcel(c17790e, 1, enumC10358e);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj = EnumC10358e.ANDROID;
        long license = c17546e.license();
        Object obj2 = null;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C11708e((EnumC10358e) obj, (C18399e) obj2, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                try {
                    obj = EnumC10358e.f20460e.metrica(c17546e);
                } catch (C17420e e) {
                    c17546e.ad(billing, 1, Long.valueOf(e.f34135e));
                }
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                obj2 = C18399e.f36074e.metrica(c17546e);
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C11708e c11708e = (C11708e) obj;
        int license = c11708e.ad().license();
        EnumC10358e enumC10358e = c11708e.f23542e;
        if (enumC10358e != EnumC10358e.ANDROID) {
            license += EnumC10358e.f20460e.advert(1, enumC10358e);
        }
        return C18399e.f36074e.advert(2, c11708e.f23541e) + license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C11708e c11708e = (C11708e) obj;
        EnumC10358e enumC10358e = c11708e.f23542e;
        if (enumC10358e != EnumC10358e.ANDROID) {
            EnumC10358e.f20460e.startapp(c0444e, 1, enumC10358e);
        }
        C18399e.f36074e.startapp(c0444e, 2, c11708e.f23541e);
        c0444e.m356try(c11708e.ad());
    }
}
