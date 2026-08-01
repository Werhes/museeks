package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3494e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C8334e c8334e = (C8334e) obj;
        c17790e.m4424case(c8334e.ad());
        long j = c8334e.f17062e;
        if (j != 0) {
            AbstractC11069e.mopub.adcel(c17790e, 2, Long.valueOf(j));
        }
        C0943e.f3362e.ad().adcel(c17790e, 1, c8334e.f17061e);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        ArrayList arrayList = new ArrayList();
        long license = c17546e.license();
        long j = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C8334e(arrayList, j, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                arrayList.add(C0943e.f3362e.metrica(c17546e));
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                AbstractC11069e.mopub.getClass();
                j = c17546e.loadAd();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C8334e c8334e = (C8334e) obj;
        int advert = C0943e.f3362e.ad().advert(1, c8334e.f17061e) + c8334e.ad().license();
        long j = c8334e.f17062e;
        if (j == 0) {
            return advert;
        }
        return AbstractC11069e.mopub.advert(2, Long.valueOf(j)) + advert;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C8334e c8334e = (C8334e) obj;
        C0943e.f3362e.ad().startapp(c0444e, 1, c8334e.f17061e);
        long j = c8334e.f17062e;
        if (j != 0) {
            AbstractC11069e.mopub.startapp(c0444e, 2, Long.valueOf(j));
        }
        c0444e.m356try(c8334e.ad());
    }
}
