package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٛٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13365e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C14056e c14056e = (C14056e) obj;
        float f = c14056e.f27805e;
        float f2 = c14056e.f27801e;
        float f3 = c14056e.f27808e;
        float f4 = c14056e.f27807e;
        float f5 = c14056e.f27803e;
        float f6 = c14056e.f27806e;
        float f7 = c14056e.f27802e;
        c17790e.m4424case(c14056e.ad());
        float f8 = c14056e.f27804e;
        Float valueOf = Float.valueOf(f8);
        Float valueOf2 = Float.valueOf(0.0f);
        boolean equals = valueOf.equals(valueOf2);
        C14808e c14808e = AbstractC11069e.smaato;
        if (!equals) {
            c14808e.adcel(c17790e, 8, Float.valueOf(f8));
        }
        if (!Float.valueOf(f7).equals(valueOf2)) {
            c14808e.adcel(c17790e, 7, Float.valueOf(f7));
        }
        if (!Float.valueOf(f6).equals(valueOf2)) {
            c14808e.adcel(c17790e, 6, Float.valueOf(f6));
        }
        if (!Float.valueOf(f5).equals(valueOf2)) {
            c14808e.adcel(c17790e, 5, Float.valueOf(f5));
        }
        if (!Float.valueOf(f4).equals(valueOf2)) {
            c14808e.adcel(c17790e, 4, Float.valueOf(f4));
        }
        if (!Float.valueOf(f3).equals(valueOf2)) {
            c14808e.adcel(c17790e, 3, Float.valueOf(f3));
        }
        if (!Float.valueOf(f2).equals(valueOf2)) {
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
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C14056e(f, f2, f3, f4, f5, f6, f7, f8, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.smaato;
            switch (billing) {
                case 1:
                    c14808e.getClass();
                    f = Float.intBitsToFloat(c17546e.adcel());
                    break;
                case 2:
                    c14808e.getClass();
                    f2 = Float.intBitsToFloat(c17546e.adcel());
                    break;
                case 3:
                    c14808e.getClass();
                    f3 = Float.intBitsToFloat(c17546e.adcel());
                    break;
                case 4:
                    c14808e.getClass();
                    f4 = Float.intBitsToFloat(c17546e.adcel());
                    break;
                case 5:
                    c14808e.getClass();
                    f5 = Float.intBitsToFloat(c17546e.adcel());
                    break;
                case 6:
                    c14808e.getClass();
                    f6 = Float.intBitsToFloat(c17546e.adcel());
                    break;
                case 7:
                    c14808e.getClass();
                    f7 = Float.intBitsToFloat(c17546e.adcel());
                    break;
                case 8:
                    c14808e.getClass();
                    f8 = Float.intBitsToFloat(c17546e.adcel());
                    break;
                default:
                    c17546e.smaato(billing);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C14056e c14056e = (C14056e) obj;
        float f = c14056e.f27804e;
        float f2 = c14056e.f27802e;
        float f3 = c14056e.f27806e;
        float f4 = c14056e.f27803e;
        float f5 = c14056e.f27807e;
        float f6 = c14056e.f27808e;
        float f7 = c14056e.f27801e;
        int license = c14056e.ad().license();
        float f8 = c14056e.f27805e;
        Float valueOf = Float.valueOf(f8);
        Float valueOf2 = Float.valueOf(0.0f);
        boolean equals = valueOf.equals(valueOf2);
        C14808e c14808e = AbstractC11069e.smaato;
        if (!equals) {
            license += c14808e.advert(1, Float.valueOf(f8));
        }
        if (!Float.valueOf(f7).equals(valueOf2)) {
            license += c14808e.advert(2, Float.valueOf(f7));
        }
        if (!Float.valueOf(f6).equals(valueOf2)) {
            license += c14808e.advert(3, Float.valueOf(f6));
        }
        if (!Float.valueOf(f5).equals(valueOf2)) {
            license += c14808e.advert(4, Float.valueOf(f5));
        }
        if (!Float.valueOf(f4).equals(valueOf2)) {
            license += c14808e.advert(5, Float.valueOf(f4));
        }
        if (!Float.valueOf(f3).equals(valueOf2)) {
            license += c14808e.advert(6, Float.valueOf(f3));
        }
        if (!Float.valueOf(f2).equals(valueOf2)) {
            license += c14808e.advert(7, Float.valueOf(f2));
        }
        return !Float.valueOf(f).equals(valueOf2) ? c14808e.advert(8, Float.valueOf(f)) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C14056e c14056e = (C14056e) obj;
        float f = c14056e.f27804e;
        float f2 = c14056e.f27802e;
        float f3 = c14056e.f27806e;
        float f4 = c14056e.f27803e;
        float f5 = c14056e.f27807e;
        float f6 = c14056e.f27808e;
        float f7 = c14056e.f27801e;
        float f8 = c14056e.f27805e;
        Float valueOf = Float.valueOf(f8);
        Float valueOf2 = Float.valueOf(0.0f);
        boolean equals = valueOf.equals(valueOf2);
        C14808e c14808e = AbstractC11069e.smaato;
        if (!equals) {
            c14808e.startapp(c0444e, 1, Float.valueOf(f8));
        }
        if (!Float.valueOf(f7).equals(valueOf2)) {
            c14808e.startapp(c0444e, 2, Float.valueOf(f7));
        }
        if (!Float.valueOf(f6).equals(valueOf2)) {
            c14808e.startapp(c0444e, 3, Float.valueOf(f6));
        }
        if (!Float.valueOf(f5).equals(valueOf2)) {
            c14808e.startapp(c0444e, 4, Float.valueOf(f5));
        }
        if (!Float.valueOf(f4).equals(valueOf2)) {
            c14808e.startapp(c0444e, 5, Float.valueOf(f4));
        }
        if (!Float.valueOf(f3).equals(valueOf2)) {
            c14808e.startapp(c0444e, 6, Float.valueOf(f3));
        }
        if (!Float.valueOf(f2).equals(valueOf2)) {
            c14808e.startapp(c0444e, 7, Float.valueOf(f2));
        }
        if (!Float.valueOf(f).equals(valueOf2)) {
            c14808e.startapp(c0444e, 8, Float.valueOf(f));
        }
        c0444e.m356try(c14056e.ad());
    }
}
