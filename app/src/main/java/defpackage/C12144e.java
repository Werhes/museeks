package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12144e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C15521e c15521e = (C15521e) obj;
        c17790e.m4424case(c15521e.ad());
        C13168e.f26142e.ad().adcel(c17790e, 1, c15521e.f30660e);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        ArrayList arrayList = new ArrayList();
        long license = c17546e.license();
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C15521e(arrayList, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                arrayList.add(C13168e.f26142e.metrica(c17546e));
            } else {
                c17546e.smaato(billing);
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C15521e c15521e = (C15521e) obj;
        return C13168e.f26142e.ad().advert(1, c15521e.f30660e) + c15521e.ad().license();
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C15521e c15521e = (C15521e) obj;
        C13168e.f26142e.ad().startapp(c0444e, 1, c15521e.f30660e);
        c0444e.m356try(c15521e.ad());
    }
}
