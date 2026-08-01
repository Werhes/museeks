package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10980e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C7190e c7190e = (C7190e) obj;
        float f = c7190e.f14694e;
        float f2 = c7190e.f14699e;
        float f3 = c7190e.f14698e;
        float f4 = c7190e.f14695e;
        c17790e.m4424case(c7190e.ad());
        float f5 = c7190e.f14697e;
        Float valueOf = Float.valueOf(f5);
        Float valueOf2 = Float.valueOf(0.0f);
        boolean equals = valueOf.equals(valueOf2);
        C14808e c14808e = AbstractC11069e.smaato;
        if (!equals) {
            c14808e.adcel(c17790e, 6, Float.valueOf(f5));
        }
        if (!Float.valueOf(f4).equals(valueOf2)) {
            c14808e.adcel(c17790e, 5, Float.valueOf(f4));
        }
        if (!Float.valueOf(f3).equals(valueOf2)) {
            c14808e.adcel(c17790e, 4, Float.valueOf(f3));
        }
        if (!Float.valueOf(f2).equals(valueOf2)) {
            c14808e.adcel(c17790e, 3, Float.valueOf(f2));
        }
        if (!Float.valueOf(f).equals(valueOf2)) {
            c14808e.adcel(c17790e, 2, Float.valueOf(f));
        }
        boolean z = c7190e.f14696e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 1, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        boolean z = false;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C7190e(z, f, f2, f3, f4, f5, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.smaato;
            switch (billing) {
                case 1:
                    z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
                    break;
                case 2:
                    c14808e.getClass();
                    f = Float.intBitsToFloat(c17546e.adcel());
                    break;
                case 3:
                    c14808e.getClass();
                    f2 = Float.intBitsToFloat(c17546e.adcel());
                    break;
                case 4:
                    c14808e.getClass();
                    f3 = Float.intBitsToFloat(c17546e.adcel());
                    break;
                case 5:
                    c14808e.getClass();
                    f4 = Float.intBitsToFloat(c17546e.adcel());
                    break;
                case 6:
                    c14808e.getClass();
                    f5 = Float.intBitsToFloat(c17546e.adcel());
                    break;
                default:
                    c17546e.smaato(billing);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C7190e c7190e = (C7190e) obj;
        Float valueOf = Float.valueOf(0.0f);
        float f = c7190e.f14697e;
        float f2 = c7190e.f14695e;
        float f3 = c7190e.f14698e;
        float f4 = c7190e.f14699e;
        float f5 = c7190e.f14694e;
        int license = c7190e.ad().license();
        boolean z = c7190e.f14696e;
        if (z) {
            license = AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 1, license);
        }
        boolean equals = Float.valueOf(f5).equals(valueOf);
        C14808e c14808e = AbstractC11069e.smaato;
        if (!equals) {
            license += c14808e.advert(2, Float.valueOf(f5));
        }
        if (!Float.valueOf(f4).equals(valueOf)) {
            license += c14808e.advert(3, Float.valueOf(f4));
        }
        if (!Float.valueOf(f3).equals(valueOf)) {
            license += c14808e.advert(4, Float.valueOf(f3));
        }
        if (!Float.valueOf(f2).equals(valueOf)) {
            license += c14808e.advert(5, Float.valueOf(f2));
        }
        return !Float.valueOf(f).equals(valueOf) ? c14808e.advert(6, Float.valueOf(f)) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C7190e c7190e = (C7190e) obj;
        Float valueOf = Float.valueOf(0.0f);
        float f = c7190e.f14697e;
        float f2 = c7190e.f14695e;
        float f3 = c7190e.f14698e;
        float f4 = c7190e.f14699e;
        float f5 = c7190e.f14694e;
        boolean z = c7190e.f14696e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 1, Boolean.valueOf(z));
        }
        boolean equals = Float.valueOf(f5).equals(valueOf);
        C14808e c14808e = AbstractC11069e.smaato;
        if (!equals) {
            c14808e.startapp(c0444e, 2, Float.valueOf(f5));
        }
        if (!Float.valueOf(f4).equals(valueOf)) {
            c14808e.startapp(c0444e, 3, Float.valueOf(f4));
        }
        if (!Float.valueOf(f3).equals(valueOf)) {
            c14808e.startapp(c0444e, 4, Float.valueOf(f3));
        }
        if (!Float.valueOf(f2).equals(valueOf)) {
            c14808e.startapp(c0444e, 5, Float.valueOf(f2));
        }
        if (!Float.valueOf(f).equals(valueOf)) {
            c14808e.startapp(c0444e, 6, Float.valueOf(f));
        }
        c0444e.m356try(c7190e.ad());
    }
}
