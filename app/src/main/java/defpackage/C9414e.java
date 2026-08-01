package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9414e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C13355e c13355e = (C13355e) obj;
        c17790e.m4424case(c13355e.ad());
        long j = c13355e.f26609e;
        if (j != 0) {
            AbstractC11069e.mopub.adcel(c17790e, 3, Long.valueOf(j));
        }
        C1768e.f4809e.ad().adcel(c17790e, 2, c13355e.f26611e);
        EnumC14727e enumC14727e = c13355e.f26610e;
        if (enumC14727e != EnumC14727e.RECOMMENDATIONS) {
            EnumC14727e.f29139e.adcel(c17790e, 1, enumC14727e);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        Object obj = EnumC14727e.RECOMMENDATIONS;
        ArrayList arrayList = new ArrayList();
        long license = c17546e.license();
        long j = 0;
        while (true) {
            Object obj2 = obj;
            while (true) {
                int billing = c17546e.billing();
                if (billing == -1) {
                    return new C13355e((EnumC14727e) obj2, arrayList, j, c17546e.appmetrica(license));
                }
                if (billing == 1) {
                    try {
                        obj = EnumC14727e.f29139e.metrica(c17546e);
                        break;
                    } catch (C17420e e) {
                        c17546e.ad(billing, 1, Long.valueOf(e.f34135e));
                    }
                } else if (billing == 2) {
                    arrayList.add(C1768e.f4809e.metrica(c17546e));
                } else if (billing != 3) {
                    c17546e.smaato(billing);
                } else {
                    AbstractC11069e.mopub.getClass();
                    j = c17546e.loadAd();
                }
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C13355e c13355e = (C13355e) obj;
        int license = c13355e.ad().license();
        EnumC14727e enumC14727e = c13355e.f26610e;
        if (enumC14727e != EnumC14727e.RECOMMENDATIONS) {
            license += EnumC14727e.f29139e.advert(1, enumC14727e);
        }
        int advert = C1768e.f4809e.ad().advert(2, c13355e.f26611e) + license;
        long j = c13355e.f26609e;
        if (j == 0) {
            return advert;
        }
        return AbstractC11069e.mopub.advert(3, Long.valueOf(j)) + advert;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C13355e c13355e = (C13355e) obj;
        EnumC14727e enumC14727e = c13355e.f26610e;
        if (enumC14727e != EnumC14727e.RECOMMENDATIONS) {
            EnumC14727e.f29139e.startapp(c0444e, 1, enumC14727e);
        }
        C1768e.f4809e.ad().startapp(c0444e, 2, c13355e.f26611e);
        long j = c13355e.f26609e;
        if (j != 0) {
            AbstractC11069e.mopub.startapp(c0444e, 3, Long.valueOf(j));
        }
        c0444e.m356try(c13355e.ad());
    }
}
