package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ۟ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10564e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C8169e c8169e = (C8169e) obj;
        c17790e.m4424case(c8169e.ad());
        EnumC9150e enumC9150e = c8169e.f16633e;
        if (enumC9150e != EnumC9150e.LINEAR) {
            EnumC9150e.f18307e.adcel(c17790e, 3, enumC9150e);
        }
        int i = c8169e.f16631e;
        if (i != 0) {
            AbstractC11069e.billing.adcel(c17790e, 2, Integer.valueOf(i));
        }
        boolean z = c8169e.f16632e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 1, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj = EnumC9150e.LINEAR;
        long license = c17546e.license();
        boolean z = false;
        int i = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C8169e(z, i, (EnumC9150e) obj, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
            } else if (billing == 2) {
                AbstractC11069e.billing.getClass();
                i = c17546e.amazon();
            } else if (billing != 3) {
                c17546e.smaato(billing);
            } else {
                try {
                    obj = EnumC9150e.f18307e.metrica(c17546e);
                } catch (C17420e e) {
                    c17546e.ad(billing, 1, Long.valueOf(e.f34135e));
                }
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C8169e c8169e = (C8169e) obj;
        int license = c8169e.ad().license();
        boolean z = c8169e.f16632e;
        if (z) {
            license = AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 1, license);
        }
        int i = c8169e.f16631e;
        if (i != 0) {
            license = AbstractC8647e.signatures(i, AbstractC11069e.billing, 2, license);
        }
        EnumC9150e enumC9150e = c8169e.f16633e;
        return enumC9150e != EnumC9150e.LINEAR ? EnumC9150e.f18307e.advert(3, enumC9150e) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C8169e c8169e = (C8169e) obj;
        boolean z = c8169e.f16632e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 1, Boolean.valueOf(z));
        }
        int i = c8169e.f16631e;
        if (i != 0) {
            AbstractC11069e.billing.startapp(c0444e, 2, Integer.valueOf(i));
        }
        EnumC9150e enumC9150e = c8169e.f16633e;
        if (enumC9150e != EnumC9150e.LINEAR) {
            EnumC9150e.f18307e.startapp(c0444e, 3, enumC9150e);
        }
        c0444e.m356try(c8169e.ad());
    }
}
