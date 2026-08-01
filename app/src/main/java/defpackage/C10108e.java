package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10108e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C8874e c8874e = (C8874e) obj;
        c17790e.m4424case(c8874e.ad());
        boolean z = c8874e.f17828e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 2, Boolean.valueOf(z));
        }
        EnumC0698e enumC0698e = c8874e.f17829e;
        if (enumC0698e != EnumC0698e.f2985e) {
            EnumC0698e.f2986e.adcel(c17790e, 1, enumC0698e);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj = EnumC0698e.f2985e;
        long license = c17546e.license();
        boolean z = false;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C8874e((EnumC0698e) obj, z, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                try {
                    obj = EnumC0698e.f2986e.metrica(c17546e);
                } catch (C17420e e) {
                    c17546e.ad(billing, 1, Long.valueOf(e.f34135e));
                }
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C8874e c8874e = (C8874e) obj;
        int license = c8874e.ad().license();
        EnumC0698e enumC0698e = c8874e.f17829e;
        if (enumC0698e != EnumC0698e.f2985e) {
            license += EnumC0698e.f2986e.advert(1, enumC0698e);
        }
        boolean z = c8874e.f17828e;
        return z ? AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 2, license) : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C8874e c8874e = (C8874e) obj;
        EnumC0698e enumC0698e = c8874e.f17829e;
        if (enumC0698e != EnumC0698e.f2985e) {
            EnumC0698e.f2986e.startapp(c0444e, 1, enumC0698e);
        }
        boolean z = c8874e.f17828e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 2, Boolean.valueOf(z));
        }
        c0444e.m356try(c8874e.ad());
    }
}
