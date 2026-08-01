package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2611e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C2936e c2936e = (C2936e) obj;
        String str = c2936e.f6932e;
        c17790e.m4424case(c2936e.ad());
        C15947e.f31404e.ad().adcel(c17790e, 3, c2936e.f6933e);
        EnumC10900e enumC10900e = c2936e.f6931e;
        if (enumC10900e != EnumC10900e.NEW) {
            EnumC10900e.f21578e.adcel(c17790e, 2, enumC10900e);
        }
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        AbstractC11069e.Signature.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj = EnumC10900e.NEW;
        ArrayList arrayList = new ArrayList();
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C2936e(str, (EnumC10900e) obj, arrayList, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                AbstractC11069e.Signature.getClass();
                str = c17546e.advert();
            } else if (billing == 2) {
                try {
                    obj = EnumC10900e.f21578e.metrica(c17546e);
                } catch (C17420e e) {
                    c17546e.ad(billing, 1, Long.valueOf(e.f34135e));
                }
            } else if (billing != 3) {
                c17546e.smaato(billing);
            } else {
                arrayList.add(C15947e.f31404e.metrica(c17546e));
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C2936e c2936e = (C2936e) obj;
        int license = c2936e.ad().license();
        String str = c2936e.f6932e;
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += AbstractC11069e.Signature.advert(1, str);
        }
        EnumC10900e enumC10900e = c2936e.f6931e;
        if (enumC10900e != EnumC10900e.NEW) {
            license += EnumC10900e.f21578e.advert(2, enumC10900e);
        }
        return C15947e.f31404e.ad().advert(3, c2936e.f6933e) + license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C2936e c2936e = (C2936e) obj;
        String str = c2936e.f6932e;
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.startapp(c0444e, 1, str);
        }
        EnumC10900e enumC10900e = c2936e.f6931e;
        if (enumC10900e != EnumC10900e.NEW) {
            EnumC10900e.f21578e.startapp(c0444e, 2, enumC10900e);
        }
        C15947e.f31404e.ad().startapp(c0444e, 3, c2936e.f6933e);
        c0444e.m356try(c2936e.ad());
    }
}
