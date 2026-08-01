package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۛٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C5267e c5267e = (C5267e) obj;
        c17790e.m4424case(c5267e.ad());
        C14056e.f27800e.ad().adcel(c17790e, 5, c5267e.f11346e);
        int i = c5267e.f11348e;
        C14808e c14808e = AbstractC11069e.billing;
        if (i != 0) {
            c14808e.adcel(c17790e, 4, Integer.valueOf(i));
        }
        int i2 = c5267e.f11349e;
        if (i2 != 0) {
            c14808e.adcel(c17790e, 3, Integer.valueOf(i2));
        }
        boolean z = c5267e.f11345e;
        C14808e c14808e2 = AbstractC11069e.purchase;
        if (z) {
            c14808e2.adcel(c17790e, 2, Boolean.valueOf(z));
        }
        boolean z2 = c5267e.f11347e;
        if (z2) {
            c14808e2.adcel(c17790e, 1, Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        ArrayList arrayList = new ArrayList();
        long license = c17546e.license();
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C5267e(z, z2, i, i2, arrayList, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.purchase;
            if (billing == 1) {
                z = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
            } else if (billing != 2) {
                C14808e c14808e2 = AbstractC11069e.billing;
                if (billing == 3) {
                    c14808e2.getClass();
                    i = c17546e.amazon();
                } else if (billing == 4) {
                    c14808e2.getClass();
                    i2 = c17546e.amazon();
                } else if (billing != 5) {
                    c17546e.smaato(billing);
                } else {
                    arrayList.add(C14056e.f27800e.metrica(c17546e));
                }
            } else {
                z2 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C5267e c5267e = (C5267e) obj;
        int license = c5267e.ad().license();
        boolean z = c5267e.f11347e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            license = AbstractC8647e.tapsense(z, c14808e, 1, license);
        }
        boolean z2 = c5267e.f11345e;
        if (z2) {
            license = AbstractC8647e.tapsense(z2, c14808e, 2, license);
        }
        int i = c5267e.f11349e;
        C14808e c14808e2 = AbstractC11069e.billing;
        if (i != 0) {
            license = AbstractC8647e.signatures(i, c14808e2, 3, license);
        }
        int i2 = c5267e.f11348e;
        if (i2 != 0) {
            license = AbstractC8647e.signatures(i2, c14808e2, 4, license);
        }
        return C14056e.f27800e.ad().advert(5, c5267e.f11346e) + license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C5267e c5267e = (C5267e) obj;
        boolean z = c5267e.f11347e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.startapp(c0444e, 1, Boolean.valueOf(z));
        }
        boolean z2 = c5267e.f11345e;
        if (z2) {
            c14808e.startapp(c0444e, 2, Boolean.valueOf(z2));
        }
        int i = c5267e.f11349e;
        C14808e c14808e2 = AbstractC11069e.billing;
        if (i != 0) {
            c14808e2.startapp(c0444e, 3, Integer.valueOf(i));
        }
        int i2 = c5267e.f11348e;
        if (i2 != 0) {
            c14808e2.startapp(c0444e, 4, Integer.valueOf(i2));
        }
        C14056e.f27800e.ad().startapp(c0444e, 5, c5267e.f11346e);
        c0444e.m356try(c5267e.ad());
    }
}
