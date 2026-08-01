package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12806e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C18344e c18344e = (C18344e) obj;
        String str = c18344e.f36014e;
        c17790e.m4424case(c18344e.ad());
        boolean z = c18344e.f36013e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.adcel(c17790e, 9, Boolean.valueOf(z));
        }
        AbstractC11069e.yandex.adcel(c17790e, 5, c18344e.f36016e);
        C14902e.f29528e.ad().adcel(c17790e, 4, c18344e.f36015e);
        boolean z2 = c18344e.f36017e;
        if (z2) {
            c14808e.adcel(c17790e, 3, Boolean.valueOf(z2));
        }
        boolean z3 = c18344e.f36012e;
        if (z3) {
            c14808e.adcel(c17790e, 2, Boolean.valueOf(z3));
        }
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        AbstractC11069e.Signature.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        ArrayList arrayList = new ArrayList();
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        boolean z = false;
        boolean z2 = false;
        Integer num = null;
        boolean z3 = false;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C18344e(str, z, z3, arrayList, num, z2, c17546e.appmetrica(license));
            }
            if (billing != 1) {
                C14808e c14808e = AbstractC11069e.purchase;
                if (billing == 2) {
                    z = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                } else if (billing == 3) {
                    z3 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                } else if (billing == 4) {
                    arrayList.add(C14902e.f29528e.metrica(c17546e));
                } else if (billing == 5) {
                    AbstractC11069e.yandex.getClass();
                    num = Integer.valueOf(c17546e.amazon());
                } else if (billing != 9) {
                    c17546e.smaato(billing);
                } else {
                    z2 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                }
            } else {
                AbstractC11069e.Signature.getClass();
                str = c17546e.advert();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C18344e c18344e = (C18344e) obj;
        int license = c18344e.ad().license();
        String str = c18344e.f36014e;
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += AbstractC11069e.Signature.advert(1, str);
        }
        boolean z = c18344e.f36012e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            license = AbstractC8647e.tapsense(z, c14808e, 2, license);
        }
        boolean z2 = c18344e.f36017e;
        if (z2) {
            license = AbstractC8647e.tapsense(z2, c14808e, 3, license);
        }
        int advert = AbstractC11069e.yandex.advert(5, c18344e.f36016e) + C14902e.f29528e.ad().advert(4, c18344e.f36015e) + license;
        boolean z3 = c18344e.f36013e;
        return z3 ? AbstractC8647e.tapsense(z3, c14808e, 9, advert) : advert;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C18344e c18344e = (C18344e) obj;
        String str = c18344e.f36014e;
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.startapp(c0444e, 1, str);
        }
        boolean z = c18344e.f36012e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.startapp(c0444e, 2, Boolean.valueOf(z));
        }
        boolean z2 = c18344e.f36017e;
        if (z2) {
            c14808e.startapp(c0444e, 3, Boolean.valueOf(z2));
        }
        C14902e.f29528e.ad().startapp(c0444e, 4, c18344e.f36015e);
        AbstractC11069e.yandex.startapp(c0444e, 5, c18344e.f36016e);
        boolean z3 = c18344e.f36013e;
        if (z3) {
            c14808e.startapp(c0444e, 9, Boolean.valueOf(z3));
        }
        c0444e.m356try(c18344e.ad());
    }
}
