package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3384e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C16074e c16074e = (C16074e) obj;
        float f = c16074e.f31669e;
        c17790e.m4424case(c16074e.ad());
        float f2 = c16074e.f31667e;
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf(0.0f);
        boolean equals = valueOf.equals(valueOf2);
        C14808e c14808e = AbstractC11069e.smaato;
        if (!equals) {
            c14808e.adcel(c17790e, 5, Float.valueOf(f2));
        }
        if (!Float.valueOf(f).equals(valueOf2)) {
            c14808e.adcel(c17790e, 4, Float.valueOf(f));
        }
        boolean z = c16074e.f31670e;
        C14808e c14808e2 = AbstractC11069e.purchase;
        if (z) {
            c14808e2.adcel(c17790e, 3, Boolean.valueOf(z));
        }
        boolean z2 = c16074e.f31666e;
        if (z2) {
            c14808e2.adcel(c17790e, 2, Boolean.valueOf(z2));
        }
        boolean z3 = c16074e.f31668e;
        if (z3) {
            c14808e2.adcel(c17790e, 1, Boolean.valueOf(z3));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C16074e(z, z2, z3, f, f2, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.purchase;
            if (billing == 1) {
                z = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
            } else if (billing == 2) {
                z2 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
            } else if (billing != 3) {
                C14808e c14808e2 = AbstractC11069e.smaato;
                if (billing == 4) {
                    c14808e2.getClass();
                    f = Float.intBitsToFloat(c17546e.adcel());
                } else if (billing != 5) {
                    c17546e.smaato(billing);
                } else {
                    c14808e2.getClass();
                    f2 = Float.intBitsToFloat(c17546e.adcel());
                }
            } else {
                z3 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C16074e c16074e = (C16074e) obj;
        Float valueOf = Float.valueOf(0.0f);
        float f = c16074e.f31667e;
        float f2 = c16074e.f31669e;
        int license = c16074e.ad().license();
        boolean z = c16074e.f31668e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            license = AbstractC8647e.tapsense(z, c14808e, 1, license);
        }
        boolean z2 = c16074e.f31666e;
        if (z2) {
            license = AbstractC8647e.tapsense(z2, c14808e, 2, license);
        }
        boolean z3 = c16074e.f31670e;
        if (z3) {
            license = AbstractC8647e.tapsense(z3, c14808e, 3, license);
        }
        boolean equals = Float.valueOf(f2).equals(valueOf);
        C14808e c14808e2 = AbstractC11069e.smaato;
        if (!equals) {
            license += c14808e2.advert(4, Float.valueOf(f2));
        }
        return !Float.valueOf(f).equals(valueOf) ? c14808e2.advert(5, Float.valueOf(f)) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C16074e c16074e = (C16074e) obj;
        Float valueOf = Float.valueOf(0.0f);
        float f = c16074e.f31667e;
        float f2 = c16074e.f31669e;
        boolean z = c16074e.f31668e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.startapp(c0444e, 1, Boolean.valueOf(z));
        }
        boolean z2 = c16074e.f31666e;
        if (z2) {
            c14808e.startapp(c0444e, 2, Boolean.valueOf(z2));
        }
        boolean z3 = c16074e.f31670e;
        if (z3) {
            c14808e.startapp(c0444e, 3, Boolean.valueOf(z3));
        }
        boolean equals = Float.valueOf(f2).equals(valueOf);
        C14808e c14808e2 = AbstractC11069e.smaato;
        if (!equals) {
            c14808e2.startapp(c0444e, 4, Float.valueOf(f2));
        }
        if (!Float.valueOf(f).equals(valueOf)) {
            c14808e2.startapp(c0444e, 5, Float.valueOf(f));
        }
        c0444e.m356try(c16074e.ad());
    }
}
