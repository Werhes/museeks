package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C14721e c14721e = (C14721e) obj;
        c17790e.m4424case(c14721e.ad());
        C12100e.f24256e.ad().adcel(c17790e, 4, c14721e.f29135e);
        C11333e c11333e = c14721e.f29136e;
        if (c11333e != null) {
            C11333e.f22783e.adcel(c17790e, 3, c11333e);
        }
        C7546e c7546e = c14721e.f29133e;
        if (c7546e != null) {
            C7546e.f15370e.adcel(c17790e, 2, c7546e);
        }
        long j = c14721e.f29134e;
        if (j != 0) {
            AbstractC11069e.mopub.adcel(c17790e, 1, Long.valueOf(j));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        ArrayList arrayList = new ArrayList();
        long license = c17546e.license();
        long j = 0;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C14721e(j, (C7546e) obj, (C11333e) obj2, arrayList, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                AbstractC11069e.mopub.getClass();
                j = c17546e.loadAd();
            } else if (billing == 2) {
                obj = C7546e.f15370e.metrica(c17546e);
            } else if (billing == 3) {
                obj2 = C11333e.f22783e.metrica(c17546e);
            } else if (billing != 4) {
                c17546e.smaato(billing);
            } else {
                arrayList.add(C12100e.f24256e.metrica(c17546e));
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C14721e c14721e = (C14721e) obj;
        int license = c14721e.ad().license();
        long j = c14721e.f29134e;
        if (j != 0) {
            license += AbstractC11069e.mopub.advert(1, Long.valueOf(j));
        }
        C7546e c7546e = c14721e.f29133e;
        if (c7546e != null) {
            license += C7546e.f15370e.advert(2, c7546e);
        }
        C11333e c11333e = c14721e.f29136e;
        if (c11333e != null) {
            license += C11333e.f22783e.advert(3, c11333e);
        }
        return C12100e.f24256e.ad().advert(4, c14721e.f29135e) + license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C14721e c14721e = (C14721e) obj;
        long j = c14721e.f29134e;
        if (j != 0) {
            AbstractC11069e.mopub.startapp(c0444e, 1, Long.valueOf(j));
        }
        C7546e c7546e = c14721e.f29133e;
        if (c7546e != null) {
            C7546e.f15370e.startapp(c0444e, 2, c7546e);
        }
        C11333e c11333e = c14721e.f29136e;
        if (c11333e != null) {
            C11333e.f22783e.startapp(c0444e, 3, c11333e);
        }
        C12100e.f24256e.ad().startapp(c0444e, 4, c14721e.f29135e);
        c0444e.m356try(c14721e.ad());
    }
}
