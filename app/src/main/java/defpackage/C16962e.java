package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16962e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C1050e c1050e = (C1050e) obj;
        float f = c1050e.f3537e;
        c17790e.m4424case(c1050e.ad());
        float f2 = c1050e.f3536e;
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf(0.0f);
        boolean equals = valueOf.equals(valueOf2);
        C14808e c14808e = AbstractC11069e.smaato;
        if (!equals) {
            c14808e.adcel(c17790e, 2, Float.valueOf(f2));
        }
        if (Float.valueOf(f).equals(valueOf2)) {
            return;
        }
        c14808e.adcel(c17790e, 1, Float.valueOf(f));
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C1050e(f, f2, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.smaato;
            if (billing == 1) {
                c14808e.getClass();
                f = Float.intBitsToFloat(c17546e.adcel());
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                c14808e.getClass();
                f2 = Float.intBitsToFloat(c17546e.adcel());
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C1050e c1050e = (C1050e) obj;
        float f = c1050e.f3536e;
        int license = c1050e.ad().license();
        float f2 = c1050e.f3537e;
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf(0.0f);
        boolean equals = valueOf.equals(valueOf2);
        C14808e c14808e = AbstractC11069e.smaato;
        if (!equals) {
            license += c14808e.advert(1, Float.valueOf(f2));
        }
        return !Float.valueOf(f).equals(valueOf2) ? c14808e.advert(2, Float.valueOf(f)) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C1050e c1050e = (C1050e) obj;
        float f = c1050e.f3536e;
        float f2 = c1050e.f3537e;
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf(0.0f);
        boolean equals = valueOf.equals(valueOf2);
        C14808e c14808e = AbstractC11069e.smaato;
        if (!equals) {
            c14808e.startapp(c0444e, 1, Float.valueOf(f2));
        }
        if (!Float.valueOf(f).equals(valueOf2)) {
            c14808e.startapp(c0444e, 2, Float.valueOf(f));
        }
        c0444e.m356try(c1050e.ad());
    }
}
