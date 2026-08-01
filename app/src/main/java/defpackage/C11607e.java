package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11607e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C0505e c0505e = (C0505e) obj;
        String str = c0505e.f2597e;
        String str2 = c0505e.f2600e;
        String str3 = c0505e.f2596e;
        c17790e.m4424case(c0505e.ad());
        String str4 = c0505e.f2598e;
        boolean billing = AbstractC7890e.billing(str4, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 9, str4);
        }
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 8, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 7, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 6, str);
        }
        boolean z = c0505e.f2601e;
        C14808e c14808e2 = AbstractC11069e.purchase;
        if (z) {
            c14808e2.adcel(c17790e, 5, Boolean.valueOf(z));
        }
        boolean z2 = c0505e.f2602e;
        if (z2) {
            c14808e2.adcel(c17790e, 4, Boolean.valueOf(z2));
        }
        boolean z3 = c0505e.f2594e;
        if (z3) {
            c14808e2.adcel(c17790e, 3, Boolean.valueOf(z3));
        }
        C2357e.f5894e.ad().adcel(c17790e, 2, c0505e.f2595e);
        C18344e c18344e = c0505e.f2599e;
        if (c18344e != null) {
            C18344e.f36011e.adcel(c17790e, 1, c18344e);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        ArrayList arrayList = new ArrayList();
        long license = c17546e.license();
        Object obj = null;
        boolean z = false;
        boolean z2 = false;
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        boolean z3 = false;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C0505e((C18344e) obj, arrayList, z, z3, z2, str, str2, str3, str4, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.purchase;
            C14808e c14808e2 = AbstractC11069e.Signature;
            switch (billing) {
                case 1:
                    obj = C18344e.f36011e.metrica(c17546e);
                    break;
                case 2:
                    arrayList.add(C2357e.f5894e.metrica(c17546e));
                    break;
                case 3:
                    z = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 4:
                    z3 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 5:
                    z2 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 6:
                    c14808e2.getClass();
                    str = c17546e.advert();
                    break;
                case 7:
                    c14808e2.getClass();
                    str2 = c17546e.advert();
                    break;
                case 8:
                    c14808e2.getClass();
                    str3 = c17546e.advert();
                    break;
                case 9:
                    c14808e2.getClass();
                    str4 = c17546e.advert();
                    break;
                default:
                    c17546e.smaato(billing);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C0505e c0505e = (C0505e) obj;
        String str = c0505e.f2598e;
        String str2 = c0505e.f2596e;
        String str3 = c0505e.f2600e;
        String str4 = c0505e.f2597e;
        int license = c0505e.ad().license();
        C18344e c18344e = c0505e.f2599e;
        if (c18344e != null) {
            license += C18344e.f36011e.advert(1, c18344e);
        }
        int advert = C2357e.f5894e.ad().advert(2, c0505e.f2595e) + license;
        boolean z = c0505e.f2594e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            advert = AbstractC8647e.tapsense(z, c14808e, 3, advert);
        }
        boolean z2 = c0505e.f2602e;
        if (z2) {
            advert = AbstractC8647e.tapsense(z2, c14808e, 4, advert);
        }
        boolean z3 = c0505e.f2601e;
        if (z3) {
            advert = AbstractC8647e.tapsense(z3, c14808e, 5, advert);
        }
        boolean billing = AbstractC7890e.billing(str4, BuildConfig.FLAVOR);
        C14808e c14808e2 = AbstractC11069e.Signature;
        if (!billing) {
            advert += c14808e2.advert(6, str4);
        }
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            advert += c14808e2.advert(7, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            advert += c14808e2.advert(8, str2);
        }
        return !AbstractC7890e.billing(str, BuildConfig.FLAVOR) ? c14808e2.advert(9, str) + advert : advert;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C0505e c0505e = (C0505e) obj;
        String str = c0505e.f2598e;
        String str2 = c0505e.f2596e;
        String str3 = c0505e.f2600e;
        String str4 = c0505e.f2597e;
        C18344e c18344e = c0505e.f2599e;
        if (c18344e != null) {
            C18344e.f36011e.startapp(c0444e, 1, c18344e);
        }
        C2357e.f5894e.ad().startapp(c0444e, 2, c0505e.f2595e);
        boolean z = c0505e.f2594e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.startapp(c0444e, 3, Boolean.valueOf(z));
        }
        boolean z2 = c0505e.f2602e;
        if (z2) {
            c14808e.startapp(c0444e, 4, Boolean.valueOf(z2));
        }
        boolean z3 = c0505e.f2601e;
        if (z3) {
            c14808e.startapp(c0444e, 5, Boolean.valueOf(z3));
        }
        boolean billing = AbstractC7890e.billing(str4, BuildConfig.FLAVOR);
        C14808e c14808e2 = AbstractC11069e.Signature;
        if (!billing) {
            c14808e2.startapp(c0444e, 6, str4);
        }
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            c14808e2.startapp(c0444e, 7, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e2.startapp(c0444e, 8, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e2.startapp(c0444e, 9, str);
        }
        c0444e.m356try(c0505e.ad());
    }
}
