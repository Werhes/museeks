package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7212e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C0072e c0072e = (C0072e) obj;
        c17790e.m4424case(c0072e.ad());
        AbstractC11069e.Signature.ad().adcel(c17790e, 3, c0072e.f1238e);
        C9441e c9441e = c0072e.f1236e;
        if (c9441e != null) {
            C9441e.f18779e.adcel(c17790e, 2, c9441e);
        }
        int i = c0072e.f1237e;
        if (i != 0) {
            AbstractC11069e.billing.adcel(c17790e, 1, Integer.valueOf(i));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        ArrayList arrayList = new ArrayList();
        long license = c17546e.license();
        int i = 0;
        Object obj = null;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C0072e(i, (C9441e) obj, arrayList, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                AbstractC11069e.billing.getClass();
                i = c17546e.amazon();
            } else if (billing == 2) {
                obj = C9441e.f18779e.metrica(c17546e);
            } else if (billing != 3) {
                c17546e.smaato(billing);
            } else {
                AbstractC11069e.Signature.getClass();
                arrayList.add(c17546e.advert());
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C0072e c0072e = (C0072e) obj;
        int license = c0072e.ad().license();
        int i = c0072e.f1237e;
        if (i != 0) {
            license = AbstractC8647e.signatures(i, AbstractC11069e.billing, 1, license);
        }
        C9441e c9441e = c0072e.f1236e;
        if (c9441e != null) {
            license += C9441e.f18779e.advert(2, c9441e);
        }
        return AbstractC11069e.Signature.ad().advert(3, c0072e.f1238e) + license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C0072e c0072e = (C0072e) obj;
        int i = c0072e.f1237e;
        if (i != 0) {
            AbstractC11069e.billing.startapp(c0444e, 1, Integer.valueOf(i));
        }
        C9441e c9441e = c0072e.f1236e;
        if (c9441e != null) {
            C9441e.f18779e.startapp(c0444e, 2, c9441e);
        }
        AbstractC11069e.Signature.ad().startapp(c0444e, 3, c0072e.f1238e);
        c0444e.m356try(c0072e.ad());
    }
}
