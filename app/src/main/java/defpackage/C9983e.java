package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9983e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C4537e c4537e = (C4537e) obj;
        c17790e.m4424case(c4537e.ad());
        C16742e.f32819e.adcel(c17790e, 2, c4537e.f9822e);
        C11590e.f23277e.adcel(c17790e, 1, c4537e.f9823e);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C4537e((C11590e) obj, (C16742e) obj2, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                obj = C11590e.f23277e.metrica(c17546e);
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                obj2 = C16742e.f32819e.metrica(c17546e);
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C4537e c4537e = (C4537e) obj;
        return C16742e.f32819e.advert(2, c4537e.f9822e) + C11590e.f23277e.advert(1, c4537e.f9823e) + c4537e.ad().license();
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C4537e c4537e = (C4537e) obj;
        C11590e.f23277e.startapp(c0444e, 1, c4537e.f9823e);
        C16742e.f32819e.startapp(c0444e, 2, c4537e.f9822e);
        c0444e.m356try(c4537e.ad());
    }
}
