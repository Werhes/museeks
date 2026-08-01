package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3414e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C7203e c7203e = (C7203e) obj;
        c17790e.m4424case(c7203e.ad());
        C4537e.f9821e.ad().adcel(c17790e, 1, c7203e.f14713e);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        ArrayList arrayList = new ArrayList();
        long license = c17546e.license();
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C7203e(arrayList, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                arrayList.add(C4537e.f9821e.metrica(c17546e));
            } else {
                c17546e.smaato(billing);
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C7203e c7203e = (C7203e) obj;
        return C4537e.f9821e.ad().advert(1, c7203e.f14713e) + c7203e.ad().license();
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C7203e c7203e = (C7203e) obj;
        C4537e.f9821e.ad().startapp(c0444e, 1, c7203e.f14713e);
        c0444e.m356try(c7203e.ad());
    }
}
