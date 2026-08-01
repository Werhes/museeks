package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3298e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C1609e c1609e = (C1609e) obj;
        c17790e.m4424case(c1609e.ad());
        boolean z = c1609e.f4529e;
        if (z) {
            AbstractC11069e.purchase.adcel(c17790e, 3, Boolean.valueOf(z));
        }
        int i = c1609e.f4527e;
        if (i != 0) {
            AbstractC11069e.yandex.adcel(c17790e, 2, Integer.valueOf(i));
        }
        long j = c1609e.f4528e;
        if (j != 0) {
            AbstractC11069e.mopub.adcel(c17790e, 1, Long.valueOf(j));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        long j = 0;
        int i = 0;
        boolean z = false;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C1609e(j, i, z, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                AbstractC11069e.mopub.getClass();
                j = c17546e.loadAd();
            } else if (billing == 2) {
                AbstractC11069e.yandex.getClass();
                i = c17546e.amazon();
            } else if (billing != 3) {
                c17546e.smaato(billing);
            } else {
                z = ((Boolean) AbstractC11069e.purchase.metrica(c17546e)).booleanValue();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C1609e c1609e = (C1609e) obj;
        int license = c1609e.ad().license();
        long j = c1609e.f4528e;
        if (j != 0) {
            license += AbstractC11069e.mopub.advert(1, Long.valueOf(j));
        }
        int i = c1609e.f4527e;
        if (i != 0) {
            license += AbstractC11069e.yandex.advert(2, Integer.valueOf(i));
        }
        boolean z = c1609e.f4529e;
        return z ? AbstractC8647e.tapsense(z, AbstractC11069e.purchase, 3, license) : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C1609e c1609e = (C1609e) obj;
        long j = c1609e.f4528e;
        if (j != 0) {
            AbstractC11069e.mopub.startapp(c0444e, 1, Long.valueOf(j));
        }
        int i = c1609e.f4527e;
        if (i != 0) {
            AbstractC11069e.yandex.startapp(c0444e, 2, Integer.valueOf(i));
        }
        boolean z = c1609e.f4529e;
        if (z) {
            AbstractC11069e.purchase.startapp(c0444e, 3, Boolean.valueOf(z));
        }
        c0444e.m356try(c1609e.ad());
    }
}
