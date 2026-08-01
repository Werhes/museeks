package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٞٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3525e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C10033e c10033e = (C10033e) obj;
        String str = c10033e.f19836e;
        c17790e.m4424case(c10033e.ad());
        String str2 = c10033e.f19837e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 3, str2);
        }
        long j = c10033e.f19835e;
        if (j != 0) {
            AbstractC11069e.adcel.adcel(c17790e, 2, Long.valueOf(j));
        }
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        c14808e.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        long j = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C10033e(str, j, str2, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.Signature;
            if (billing == 1) {
                c14808e.getClass();
                str = c17546e.advert();
            } else if (billing == 2) {
                AbstractC11069e.adcel.getClass();
                j = c17546e.loadAd();
            } else if (billing != 3) {
                c17546e.smaato(billing);
            } else {
                c14808e.getClass();
                str2 = c17546e.advert();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C10033e c10033e = (C10033e) obj;
        String str = c10033e.f19837e;
        int license = c10033e.ad().license();
        String str2 = c10033e.f19836e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(1, str2);
        }
        long j = c10033e.f19835e;
        if (j != 0) {
            license += AbstractC11069e.adcel.advert(2, Long.valueOf(j));
        }
        return !AbstractC7890e.billing(str, BuildConfig.FLAVOR) ? c14808e.advert(3, str) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C10033e c10033e = (C10033e) obj;
        String str = c10033e.f19837e;
        String str2 = c10033e.f19836e;
        boolean billing = AbstractC7890e.billing(str2, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 1, str2);
        }
        long j = c10033e.f19835e;
        if (j != 0) {
            AbstractC11069e.adcel.startapp(c0444e, 2, Long.valueOf(j));
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 3, str);
        }
        c0444e.m356try(c10033e.ad());
    }
}
