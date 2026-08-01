package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10962e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C11333e c11333e = (C11333e) obj;
        String str = c11333e.f22792e;
        String str2 = c11333e.f22795e;
        String str3 = c11333e.f22794e;
        String str4 = c11333e.f22790e;
        String str5 = c11333e.f22793e;
        String str6 = c11333e.f22787e;
        c17790e.m4424case(c11333e.ad());
        C14632e c14632e = c11333e.f22789e;
        if (c14632e != null) {
            C14632e.f28868e.adcel(c17790e, 12, c14632e);
        }
        C17832e c17832e = c11333e.f22788e;
        if (c17832e != null) {
            C17832e.f34939e.adcel(c17790e, 11, c17832e);
        }
        C18099e c18099e = c11333e.f22785e;
        if (c18099e != null) {
            C18099e.f35485e.adcel(c17790e, 10, c18099e);
        }
        EnumC3531e enumC3531e = c11333e.f22786e;
        if (enumC3531e != EnumC3531e.StockOrUnknown) {
            EnumC3531e.f7970e.adcel(c17790e, 9, enumC3531e);
        }
        boolean z = c11333e.f22791e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 8, Boolean.valueOf(z));
        }
        boolean billing = AbstractC7890e.billing(str6, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 7, str6);
        }
        if (!AbstractC7890e.billing(str5, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 6, str5);
        }
        if (!AbstractC7890e.billing(str4, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 5, str4);
        }
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 4, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 3, str2);
        }
        int i = c11333e.f22784e;
        if (i != 0) {
            AbstractC11069e.billing.adcel(c17790e, 2, Integer.valueOf(i));
        }
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        c14808e.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj;
        String str;
        Object obj2 = EnumC3531e.StockOrUnknown;
        long license = c17546e.license();
        Object obj3 = obj2;
        String str2 = BuildConfig.FLAVOR;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        int i = 0;
        boolean z = false;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        String str7 = str6;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C11333e(str7, i, str2, str3, str4, str5, str6, z, (EnumC3531e) obj3, (C18099e) obj4, (C17832e) obj5, (C14632e) obj6, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.Signature;
            switch (billing) {
                case 1:
                    c14808e.getClass();
                    str7 = c17546e.advert();
                    continue;
                case 2:
                    AbstractC11069e.billing.getClass();
                    i = c17546e.amazon();
                    continue;
                case 3:
                    c14808e.getClass();
                    str2 = c17546e.advert();
                    continue;
                case 4:
                    c14808e.getClass();
                    str3 = c17546e.advert();
                    continue;
                case 5:
                    c14808e.getClass();
                    str4 = c17546e.advert();
                    continue;
                case 6:
                    c14808e.getClass();
                    str5 = c17546e.advert();
                    continue;
                case 7:
                    c14808e.getClass();
                    str6 = c17546e.advert();
                    continue;
                case 8:
                    z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
                    continue;
                case 9:
                    try {
                        obj3 = EnumC3531e.f7970e.metrica(c17546e);
                        continue;
                    } catch (C17420e e) {
                        obj = obj4;
                        str = str7;
                        c17546e.ad(billing, 1, Long.valueOf(e.f34135e));
                        break;
                    }
                case 10:
                    obj4 = C18099e.f35485e.metrica(c17546e);
                    continue;
                case 11:
                    obj5 = C17832e.f34939e.metrica(c17546e);
                    continue;
                case 12:
                    obj6 = C14632e.f28868e.metrica(c17546e);
                    continue;
                default:
                    c17546e.smaato(billing);
                    obj = obj4;
                    str = str7;
                    break;
            }
            str7 = str;
            obj4 = obj;
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C11333e c11333e = (C11333e) obj;
        String str = c11333e.f22787e;
        String str2 = c11333e.f22793e;
        String str3 = c11333e.f22790e;
        String str4 = c11333e.f22794e;
        String str5 = c11333e.f22795e;
        int license = c11333e.ad().license();
        String str6 = c11333e.f22792e;
        boolean billing = AbstractC7890e.billing(str6, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(1, str6);
        }
        int i = c11333e.f22784e;
        if (i != 0) {
            license = AbstractC8647e.signatures(i, AbstractC11069e.billing, 2, license);
        }
        if (!AbstractC7890e.billing(str5, BuildConfig.FLAVOR)) {
            license += c14808e.advert(3, str5);
        }
        if (!AbstractC7890e.billing(str4, BuildConfig.FLAVOR)) {
            license += c14808e.advert(4, str4);
        }
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            license += c14808e.advert(5, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            license += c14808e.advert(6, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += c14808e.advert(7, str);
        }
        boolean z = c11333e.f22791e;
        if (z) {
            license = AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 8, license);
        }
        EnumC3531e enumC3531e = c11333e.f22786e;
        if (enumC3531e != EnumC3531e.StockOrUnknown) {
            license += EnumC3531e.f7970e.advert(9, enumC3531e);
        }
        C18099e c18099e = c11333e.f22785e;
        if (c18099e != null) {
            license += C18099e.f35485e.advert(10, c18099e);
        }
        C17832e c17832e = c11333e.f22788e;
        if (c17832e != null) {
            license += C17832e.f34939e.advert(11, c17832e);
        }
        C14632e c14632e = c11333e.f22789e;
        return c14632e != null ? C14632e.f28868e.advert(12, c14632e) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C11333e c11333e = (C11333e) obj;
        String str = c11333e.f22787e;
        String str2 = c11333e.f22793e;
        String str3 = c11333e.f22790e;
        String str4 = c11333e.f22794e;
        String str5 = c11333e.f22795e;
        String str6 = c11333e.f22792e;
        boolean billing = AbstractC7890e.billing(str6, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 1, str6);
        }
        int i = c11333e.f22784e;
        if (i != 0) {
            AbstractC11069e.billing.startapp(c0444e, 2, Integer.valueOf(i));
        }
        if (!AbstractC7890e.billing(str5, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 3, str5);
        }
        if (!AbstractC7890e.billing(str4, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 4, str4);
        }
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 5, str3);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 6, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 7, str);
        }
        boolean z = c11333e.f22791e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 8, Boolean.valueOf(z));
        }
        EnumC3531e enumC3531e = c11333e.f22786e;
        if (enumC3531e != EnumC3531e.StockOrUnknown) {
            EnumC3531e.f7970e.startapp(c0444e, 9, enumC3531e);
        }
        C18099e c18099e = c11333e.f22785e;
        if (c18099e != null) {
            C18099e.f35485e.startapp(c0444e, 10, c18099e);
        }
        C17832e c17832e = c11333e.f22788e;
        if (c17832e != null) {
            C17832e.f34939e.startapp(c0444e, 11, c17832e);
        }
        C14632e c14632e = c11333e.f22789e;
        if (c14632e != null) {
            C14632e.f28868e.startapp(c0444e, 12, c14632e);
        }
        c0444e.m356try(c11333e.ad());
    }
}
