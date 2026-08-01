package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۡۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5973e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C3418e c3418e = (C3418e) obj;
        String str = c3418e.f7648e;
        c17790e.m4424case(c3418e.ad());
        String str2 = c3418e.f7650e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 3, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 2, str);
        }
        EnumC18502e enumC18502e = c3418e.f7649e;
        if (enumC18502e != EnumC18502e.OPEN_URL) {
            EnumC18502e.f36265e.adcel(c17790e, 1, enumC18502e);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj = EnumC18502e.OPEN_URL;
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        String str2 = BuildConfig.FLAVOR;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C3418e((EnumC18502e) obj, str, str2, c17546e.appmetrica(license));
            }
            if (billing != 1) {
                C14808e c14808e = AbstractC11069e.Signature;
                if (billing == 2) {
                    c14808e.getClass();
                    str = c17546e.advert();
                } else if (billing != 3) {
                    c17546e.smaato(billing);
                } else {
                    c14808e.getClass();
                    str2 = c17546e.advert();
                }
            } else {
                try {
                    obj = EnumC18502e.f36265e.metrica(c17546e);
                } catch (C17420e e) {
                    c17546e.ad(billing, 1, Long.valueOf(e.f34135e));
                }
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C3418e c3418e = (C3418e) obj;
        String str = c3418e.f7650e;
        String str2 = c3418e.f7648e;
        int license = c3418e.ad().license();
        EnumC18502e enumC18502e = c3418e.f7649e;
        if (enumC18502e != EnumC18502e.OPEN_URL) {
            license += EnumC18502e.f36265e.advert(1, enumC18502e);
        }
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(2, str2);
        }
        return !AbstractC7890e.billing(str, BuildConfig.FLAVOR) ? c14808e.advert(3, str) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C3418e c3418e = (C3418e) obj;
        String str = c3418e.f7650e;
        String str2 = c3418e.f7648e;
        EnumC18502e enumC18502e = c3418e.f7649e;
        if (enumC18502e != EnumC18502e.OPEN_URL) {
            EnumC18502e.f36265e.startapp(c0444e, 1, enumC18502e);
        }
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 2, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 3, str);
        }
        c0444e.m356try(c3418e.ad());
    }
}
