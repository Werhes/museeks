package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۣؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15248e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C12503e c12503e = (C12503e) obj;
        c17790e.m4424case(c12503e.ad());
        C17333e c17333e = c12503e.f25044e;
        if (c17333e != null) {
            C17333e.f34013e.adcel(c17790e, 1, c17333e);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        Object obj = null;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C12503e((C17333e) obj, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                obj = C17333e.f34013e.metrica(c17546e);
            } else {
                c17546e.smaato(billing);
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C12503e c12503e = (C12503e) obj;
        int license = c12503e.ad().license();
        C17333e c17333e = c12503e.f25044e;
        return c17333e != null ? C17333e.f34013e.advert(1, c17333e) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C12503e c12503e = (C12503e) obj;
        C17333e c17333e = c12503e.f25044e;
        if (c17333e != null) {
            C17333e.f34013e.startapp(c0444e, 1, c17333e);
        }
        c0444e.m356try(c12503e.ad());
    }
}
