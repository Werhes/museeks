package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9146e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C3147e c3147e = (C3147e) obj;
        String str = c3147e.f7230e;
        c17790e.m4424case(c3147e.ad());
        long j = c3147e.f7232e;
        if (j != 0) {
            AbstractC11069e.adcel.adcel(c17790e, 5, Long.valueOf(j));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.adcel(c17790e, 4, str);
        }
        C8874e.f17827e.ad().adcel(c17790e, 7, c3147e.f7229e);
        boolean z = c3147e.f7233e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.adcel(c17790e, 6, Boolean.valueOf(z));
        }
        boolean z2 = c3147e.f7234e;
        if (z2) {
            c14808e.adcel(c17790e, 3, Boolean.valueOf(z2));
        }
        boolean z3 = c3147e.f7228e;
        if (z3) {
            c14808e.adcel(c17790e, 2, Boolean.valueOf(z3));
        }
        boolean z4 = c3147e.f7231e;
        if (z4) {
            c14808e.adcel(c17790e, 1, Boolean.valueOf(z4));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        ArrayList arrayList = new ArrayList();
        long license = c17546e.license();
        boolean z = false;
        boolean z2 = false;
        long j = 0;
        boolean z3 = false;
        String str = BuildConfig.FLAVOR;
        boolean z4 = false;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C3147e(z, z4, z2, z3, arrayList, str, j, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.purchase;
            switch (billing) {
                case 1:
                    z = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 2:
                    z4 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 3:
                    z2 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 4:
                    AbstractC11069e.Signature.getClass();
                    str = c17546e.advert();
                    break;
                case 5:
                    AbstractC11069e.adcel.getClass();
                    j = c17546e.loadAd();
                    break;
                case 6:
                    z3 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 7:
                    arrayList.add(C8874e.f17827e.metrica(c17546e));
                    break;
                default:
                    c17546e.smaato(billing);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C3147e c3147e = (C3147e) obj;
        String str = c3147e.f7230e;
        int license = c3147e.ad().license();
        boolean z = c3147e.f7231e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            license = AbstractC8647e.tapsense(z, c14808e, 1, license);
        }
        boolean z2 = c3147e.f7228e;
        if (z2) {
            license = AbstractC8647e.tapsense(z2, c14808e, 2, license);
        }
        boolean z3 = c3147e.f7234e;
        if (z3) {
            license = AbstractC8647e.tapsense(z3, c14808e, 3, license);
        }
        boolean z4 = c3147e.f7233e;
        if (z4) {
            license = AbstractC8647e.tapsense(z4, c14808e, 6, license);
        }
        int advert = C8874e.f17827e.ad().advert(7, c3147e.f7229e) + license;
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            advert += AbstractC11069e.Signature.advert(4, str);
        }
        long j = c3147e.f7232e;
        if (j == 0) {
            return advert;
        }
        return AbstractC11069e.adcel.advert(5, Long.valueOf(j)) + advert;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C3147e c3147e = (C3147e) obj;
        String str = c3147e.f7230e;
        boolean z = c3147e.f7231e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.startapp(c0444e, 1, Boolean.valueOf(z));
        }
        boolean z2 = c3147e.f7228e;
        if (z2) {
            c14808e.startapp(c0444e, 2, Boolean.valueOf(z2));
        }
        boolean z3 = c3147e.f7234e;
        if (z3) {
            c14808e.startapp(c0444e, 3, Boolean.valueOf(z3));
        }
        boolean z4 = c3147e.f7233e;
        if (z4) {
            c14808e.startapp(c0444e, 6, Boolean.valueOf(z4));
        }
        C8874e.f17827e.ad().startapp(c0444e, 7, c3147e.f7229e);
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.startapp(c0444e, 4, str);
        }
        long j = c3147e.f7232e;
        if (j != 0) {
            AbstractC11069e.adcel.startapp(c0444e, 5, Long.valueOf(j));
        }
        c0444e.m356try(c3147e.ad());
    }
}
