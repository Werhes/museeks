package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16010e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C9037e c9037e = (C9037e) obj;
        c17790e.m4424case(c9037e.ad());
        EnumC16745e enumC16745e = c9037e.f18098e;
        if (enumC16745e != EnumC16745e.VKX_PLUS) {
            EnumC16745e.f32830e.adcel(c17790e, 1, enumC16745e);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj = EnumC16745e.VKX_PLUS;
        long license = c17546e.license();
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C9037e((EnumC16745e) obj, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                try {
                    obj = EnumC16745e.f32830e.metrica(c17546e);
                } catch (C17420e e) {
                    c17546e.ad(billing, 1, Long.valueOf(e.f34135e));
                }
            } else {
                c17546e.smaato(billing);
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C9037e c9037e = (C9037e) obj;
        int license = c9037e.ad().license();
        EnumC16745e enumC16745e = c9037e.f18098e;
        return enumC16745e != EnumC16745e.VKX_PLUS ? EnumC16745e.f32830e.advert(1, enumC16745e) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C9037e c9037e = (C9037e) obj;
        EnumC16745e enumC16745e = c9037e.f18098e;
        if (enumC16745e != EnumC16745e.VKX_PLUS) {
            EnumC16745e.f32830e.startapp(c0444e, 1, enumC16745e);
        }
        c0444e.m356try(c9037e.ad());
    }
}
