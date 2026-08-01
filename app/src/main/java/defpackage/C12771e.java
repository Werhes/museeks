package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ۟ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12771e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C15947e c15947e = (C15947e) obj;
        String str = c15947e.f31407e;
        String str2 = c15947e.f31405e;
        String str3 = c15947e.f31409e;
        c17790e.m4424case(c15947e.ad());
        boolean z = c15947e.f31408e;
        C14808e c14808e = AbstractC11069e.purchase;
        if (z) {
            c14808e.adcel(c17790e, 6, Boolean.valueOf(z));
        }
        boolean z2 = c15947e.f31406e;
        if (z2) {
            c14808e.adcel(c17790e, 5, Boolean.valueOf(z2));
        }
        boolean billing = AbstractC7890e.billing(str3, BuildConfig.FLAVOR);
        C14808e c14808e2 = AbstractC11069e.Signature;
        if (!billing) {
            c14808e2.adcel(c17790e, 4, str3);
        }
        int i = c15947e.f31410e;
        if (i != 0) {
            AbstractC11069e.billing.adcel(c17790e, 3, Integer.valueOf(i));
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e2.adcel(c17790e, 2, str2);
        }
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        c14808e2.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        String str3 = str2;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C15947e(str, str2, i, str3, z, z2, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.purchase;
            C14808e c14808e2 = AbstractC11069e.Signature;
            switch (billing) {
                case 1:
                    c14808e2.getClass();
                    str = c17546e.advert();
                    break;
                case 2:
                    c14808e2.getClass();
                    str2 = c17546e.advert();
                    break;
                case 3:
                    AbstractC11069e.billing.getClass();
                    i = c17546e.amazon();
                    break;
                case 4:
                    c14808e2.getClass();
                    str3 = c17546e.advert();
                    break;
                case 5:
                    z = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                case 6:
                    z2 = ((Boolean) c14808e.metrica(c17546e)).booleanValue();
                    break;
                default:
                    c17546e.smaato(billing);
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C15947e c15947e = (C15947e) obj;
        String str = c15947e.f31409e;
        String str2 = c15947e.f31405e;
        int license = c15947e.ad().license();
        String str3 = c15947e.f31407e;
        boolean billing = AbstractC7890e.billing(str3, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(1, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            license += c14808e.advert(2, str2);
        }
        int i = c15947e.f31410e;
        if (i != 0) {
            license = AbstractC8647e.signatures(i, AbstractC11069e.billing, 3, license);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += c14808e.advert(4, str);
        }
        boolean z = c15947e.f31406e;
        C14808e c14808e2 = AbstractC11069e.purchase;
        if (z) {
            license = AbstractC8647e.tapsense(z, c14808e2, 5, license);
        }
        boolean z2 = c15947e.f31408e;
        return z2 ? AbstractC8647e.tapsense(z2, c14808e2, 6, license) : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C15947e c15947e = (C15947e) obj;
        String str = c15947e.f31409e;
        String str2 = c15947e.f31405e;
        String str3 = c15947e.f31407e;
        boolean billing = AbstractC7890e.billing(str3, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 1, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 2, str2);
        }
        int i = c15947e.f31410e;
        if (i != 0) {
            AbstractC11069e.billing.startapp(c0444e, 3, Integer.valueOf(i));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 4, str);
        }
        boolean z = c15947e.f31406e;
        C14808e c14808e2 = AbstractC11069e.purchase;
        if (z) {
            c14808e2.startapp(c0444e, 5, Boolean.valueOf(z));
        }
        boolean z2 = c15947e.f31408e;
        if (z2) {
            c14808e2.startapp(c0444e, 6, Boolean.valueOf(z2));
        }
        c0444e.m356try(c15947e.ad());
    }
}
