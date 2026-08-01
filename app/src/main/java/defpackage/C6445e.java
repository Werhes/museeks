package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6445e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C16801e c16801e = (C16801e) obj;
        String str = c16801e.f32938e;
        String str2 = c16801e.f32937e;
        c17790e.m4424case(c16801e.ad());
        boolean z = c16801e.f32940e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 4, Boolean.valueOf(z));
        }
        C1050e.f3535e.ad().adcel(c17790e, 3, c16801e.f32939e);
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
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        boolean z = false;
        String str2 = BuildConfig.FLAVOR;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C16801e(str, str2, arrayList, z, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.Signature;
            if (billing == 1) {
                c14808e.getClass();
                str = c17546e.advert();
            } else if (billing == 2) {
                c14808e.getClass();
                str2 = c17546e.advert();
            } else if (billing == 3) {
                arrayList.add(C1050e.f3535e.metrica(c17546e));
            } else if (billing != 4) {
                c17546e.smaato(billing);
            } else {
                z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C16801e c16801e = (C16801e) obj;
        String str = c16801e.f32937e;
        int license = c16801e.ad().license();
        String str2 = c16801e.f32938e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(1, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += c14808e.advert(2, str);
        }
        int advert = C1050e.f3535e.ad().advert(3, c16801e.f32939e) + license;
        boolean z = c16801e.f32940e;
        return z ? AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 4, advert) : advert;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C16801e c16801e = (C16801e) obj;
        String str = c16801e.f32937e;
        String str2 = c16801e.f32938e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 1, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 2, str);
        }
        C1050e.f3535e.ad().startapp(c0444e, 3, c16801e.f32939e);
        boolean z = c16801e.f32940e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 4, Boolean.valueOf(z));
        }
        c0444e.m356try(c16801e.ad());
    }
}
