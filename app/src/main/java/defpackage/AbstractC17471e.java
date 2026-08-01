package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17471e implements InterfaceC12462e {
    public int ad;
    public int license;
    public C18113e metrica;
    public C11325e vip;
    public final C1542e appmetrica = new C1542e(this);
    public int purchase = 0;
    public boolean billing = false;
    public final C17455e yandex = new C17455e(this);
    public final C17455e startapp = new C17455e(this);
    public int adcel = 1;

    public AbstractC17471e(C11325e c11325e) {
        this.vip = c11325e;
    }

    public static C17455e startapp(C9399e c9399e, int i) {
        C9399e c9399e2 = c9399e.purchase;
        if (c9399e2 == null) {
            return null;
        }
        C11325e c11325e = c9399e2.license;
        AbstractC17471e abstractC17471e = i == 0 ? c11325e.license : c11325e.appmetrica;
        int m2467class = AbstractC8703e.m2467class(c9399e2.appmetrica);
        if (m2467class == 1 || m2467class == 2) {
            return abstractC17471e.yandex;
        }
        if (m2467class == 3 || m2467class == 4) {
            return abstractC17471e.startapp;
        }
        return null;
    }

    public static void vip(C17455e c17455e, C17455e c17455e2, int i) {
        c17455e.advert.add(c17455e2);
        c17455e.purchase = i;
        c17455e2.mopub.add(c17455e);
    }

    public static C17455e yandex(C9399e c9399e) {
        C9399e c9399e2 = c9399e.purchase;
        if (c9399e2 == null) {
            return null;
        }
        C11325e c11325e = c9399e2.license;
        int m2467class = AbstractC8703e.m2467class(c9399e2.appmetrica);
        if (m2467class == 1) {
            return c11325e.license.yandex;
        }
        if (m2467class == 2) {
            return c11325e.appmetrica.yandex;
        }
        if (m2467class == 3) {
            return c11325e.license.startapp;
        }
        if (m2467class == 4) {
            return c11325e.appmetrica.startapp;
        }
        if (m2467class != 5) {
            return null;
        }
        return c11325e.appmetrica.mopub;
    }

    public long adcel() {
        if (this.appmetrica.adcel) {
            return r0.billing;
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.ad == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void advert(defpackage.C9399e r12, defpackage.C9399e r13, int r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17471e.advert(eٍُۙ, eٍُۙ, int):void");
    }

    public abstract void appmetrica();

    public final int billing(int i, int i2) {
        if (i2 == 0) {
            C11325e c11325e = this.vip;
            int i3 = c11325e.tapsense;
            int max = Math.max(c11325e.signatures, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            C11325e c11325e2 = this.vip;
            int i4 = c11325e2.isPro;
            int max2 = Math.max(c11325e2.inmobi, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public abstract void license();

    public final void metrica(C17455e c17455e, C17455e c17455e2, int i, C1542e c1542e) {
        c17455e.advert.add(c17455e2);
        c17455e.advert.add(this.appmetrica);
        c17455e.yandex = i;
        c17455e.startapp = c1542e;
        c17455e2.mopub.add(c17455e);
        c1542e.mopub.add(c17455e);
    }

    public abstract boolean mopub();

    public abstract void purchase();
}
