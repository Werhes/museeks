package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۛ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2865e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C13034e c13034e = (C13034e) obj;
        String str = c13034e.f25956e;
        c17790e.m4424case(c13034e.ad());
        boolean z = c13034e.f25960e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.adcel(c17790e, 7, Boolean.valueOf(z));
        }
        boolean z2 = c13034e.f25958e;
        if (z2) {
            c14808e.adcel(c17790e, 6, Boolean.valueOf(z2));
        }
        boolean z3 = c13034e.f25961e;
        if (z3) {
            c14808e.adcel(c17790e, 5, Boolean.valueOf(z3));
        }
        boolean z4 = c13034e.f25962e;
        if (z4) {
            c14808e.adcel(c17790e, 4, Boolean.valueOf(z4));
        }
        C17196e.f33713e.ad().adcel(c17790e, 3, c13034e.f25957e);
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.adcel(c17790e, 2, str);
        }
        boolean z5 = c13034e.f25959e;
        if (z5) {
            c14808e.adcel(c17790e, 1, Boolean.valueOf(z5));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        ArrayList arrayList = new ArrayList();
        long license = c17546e.license();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = BuildConfig.FLAVOR;
        boolean z5 = false;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C13034e(z, str, arrayList, z5, z2, z3, z4, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.purchase;
            switch (billing) {
                case 1:
                    z = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 2:
                    AbstractC11069e.Signature.getClass();
                    str = c17546e.advert();
                    break;
                case 3:
                    arrayList.add(C17196e.f33713e.metrica(c17546e));
                    break;
                case 4:
                    z5 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 5:
                    z2 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 6:
                    z3 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 7:
                    z4 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                default:
                    c17546e.smaato(billing);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C13034e c13034e = (C13034e) obj;
        String str = c13034e.f25956e;
        int license = c13034e.ad().license();
        boolean z = c13034e.f25959e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            license = AbstractC8647e.tapsense(z, c14808e, 1, license);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += AbstractC11069e.Signature.advert(2, str);
        }
        int advert = C17196e.f33713e.ad().advert(3, c13034e.f25957e) + license;
        boolean z2 = c13034e.f25962e;
        if (z2) {
            advert = AbstractC8647e.tapsense(z2, c14808e, 4, advert);
        }
        boolean z3 = c13034e.f25961e;
        if (z3) {
            advert = AbstractC8647e.tapsense(z3, c14808e, 5, advert);
        }
        boolean z4 = c13034e.f25958e;
        if (z4) {
            advert = AbstractC8647e.tapsense(z4, c14808e, 6, advert);
        }
        boolean z5 = c13034e.f25960e;
        return z5 ? AbstractC8647e.tapsense(z5, c14808e, 7, advert) : advert;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C13034e c13034e = (C13034e) obj;
        String str = c13034e.f25956e;
        boolean z = c13034e.f25959e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.startapp(c0444e, 1, Boolean.valueOf(z));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.startapp(c0444e, 2, str);
        }
        C17196e.f33713e.ad().startapp(c0444e, 3, c13034e.f25957e);
        boolean z2 = c13034e.f25962e;
        if (z2) {
            c14808e.startapp(c0444e, 4, Boolean.valueOf(z2));
        }
        boolean z3 = c13034e.f25961e;
        if (z3) {
            c14808e.startapp(c0444e, 5, Boolean.valueOf(z3));
        }
        boolean z4 = c13034e.f25958e;
        if (z4) {
            c14808e.startapp(c0444e, 6, Boolean.valueOf(z4));
        }
        boolean z5 = c13034e.f25960e;
        if (z5) {
            c14808e.startapp(c0444e, 7, Boolean.valueOf(z5));
        }
        c0444e.m356try(c13034e.ad());
    }
}
