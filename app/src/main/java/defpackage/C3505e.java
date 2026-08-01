package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3505e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C10046e c10046e = (C10046e) obj;
        String str = c10046e.f19847e;
        String str2 = c10046e.f19845e;
        c17790e.m4424case(c10046e.ad());
        C10046e c10046e2 = c10046e.f19849e;
        if (c10046e2 != null) {
            C10046e.f19844e.adcel(c17790e, 6, c10046e2);
        }
        C10046e.f19844e.ad().adcel(c17790e, 5, c10046e.f19846e);
        C15947e.f31404e.ad().adcel(c17790e, 4, c10046e.f19848e);
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 2, str2);
        }
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        c14808e.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        Object obj = null;
        String str2 = BuildConfig.FLAVOR;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C10046e(str, str2, arrayList, arrayList2, (C10046e) obj, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.Signature;
            if (billing == 1) {
                c14808e.getClass();
                str = c17546e.advert();
            } else if (billing == 2) {
                c14808e.getClass();
                str2 = c17546e.advert();
            } else if (billing == 4) {
                arrayList.add(C15947e.f31404e.metrica(c17546e));
            } else if (billing == 5) {
                arrayList2.add(C10046e.f19844e.metrica(c17546e));
            } else if (billing != 6) {
                c17546e.smaato(billing);
            } else {
                obj = C10046e.f19844e.metrica(c17546e);
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C10046e c10046e = (C10046e) obj;
        String str = c10046e.f19845e;
        int license = c10046e.ad().license();
        String str2 = c10046e.f19847e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(1, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += c14808e.advert(2, str);
        }
        int advert = C15947e.f31404e.ad().advert(4, c10046e.f19848e) + license;
        C3505e c3505e = C10046e.f19844e;
        int advert2 = c3505e.ad().advert(5, c10046e.f19846e) + advert;
        C10046e c10046e2 = c10046e.f19849e;
        return c10046e2 != null ? c3505e.advert(6, c10046e2) + advert2 : advert2;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C10046e c10046e = (C10046e) obj;
        String str = c10046e.f19845e;
        String str2 = c10046e.f19847e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 1, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 2, str);
        }
        C15947e.f31404e.ad().startapp(c0444e, 4, c10046e.f19848e);
        C3505e c3505e = C10046e.f19844e;
        c3505e.ad().startapp(c0444e, 5, c10046e.f19846e);
        C10046e c10046e2 = c10046e.f19849e;
        if (c10046e2 != null) {
            c3505e.startapp(c0444e, 6, c10046e2);
        }
        c0444e.m356try(c10046e.ad());
    }
}
