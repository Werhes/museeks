package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10097e {
    public final int ad;
    public long appmetrica;
    public long billing = Long.MIN_VALUE;
    public C10097e license;
    public final C12439e metrica;
    public long purchase;
    public final C14794e vip;
    public final /* synthetic */ C14998e yandex;

    public C10097e(C14998e c14998e, int i, C14794e c14794e, C12439e c12439e) {
        this.yandex = c14998e;
        this.ad = i;
        this.vip = c14794e;
        this.metrica = c12439e;
    }

    public final void ad(long j, long j2, long j3, long j4, float[] fArr) {
        C10473e c10473e;
        C10473e c10473e2;
        long j5 = this.yandex.purchase;
        C14794e c14794e = this.vip;
        AbstractC17732e yandex = AbstractC5851e.yandex(c14794e, 2);
        C13915e mopub = AbstractC5851e.mopub(c14794e);
        boolean m3724throw = mopub.m3724throw();
        C14742e c14742e = mopub.f27592e;
        if (m3724throw) {
            if (((AbstractC17732e) c14742e.appmetrica) != yandex) {
                long floatToRawIntBits = (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                yandex.getClass();
                long j6 = yandex.f6803e;
                AbstractC17732e abstractC17732e = (AbstractC17732e) c14742e.appmetrica;
                abstractC17732e.getClass();
                c10473e = new C10473e(AbstractC17324e.purchase(abstractC17732e.mo210native(yandex, floatToRawIntBits, true)), (4294967295L & (((int) (r2 & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (r2 >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, c14794e);
            } else {
                c10473e = new C10473e(j, j2, j3, j4, j5, fArr, c14794e);
            }
            c10473e2 = c10473e;
        } else {
            c10473e2 = null;
        }
        if (c10473e2 == null) {
            return;
        }
        this.metrica.invoke(c10473e2);
    }

    public final void vip() {
        C14998e c14998e = this.yandex;
        C3123e c3123e = c14998e.ad;
        int i = this.ad;
        C10097e c10097e = (C10097e) c3123e.billing(i);
        if (c10097e != null) {
            if (c10097e.equals(this)) {
                C10097e c10097e2 = this.license;
                this.license = null;
                if (c10097e2 == null) {
                    C13915e mopub = AbstractC5851e.mopub(this.vip.f27022e);
                    if (mopub.f27624e) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(mopub)).getRectManager().vip.m4652static(mopub.f27594e, false);
                        return;
                    }
                    return;
                }
                int license = c3123e.license(i);
                Object[] objArr = c3123e.metrica;
                Object obj = objArr[license];
                c3123e.vip[license] = i;
                objArr[license] = c10097e2;
                return;
            }
            int license2 = c3123e.license(i);
            Object[] objArr2 = c3123e.metrica;
            Object obj2 = objArr2[license2];
            c3123e.vip[license2] = i;
            objArr2[license2] = c10097e;
            while (true) {
                C10097e c10097e3 = c10097e.license;
                if (c10097e3 == null) {
                    break;
                }
                if (c10097e3 == this) {
                    c10097e.license = this.license;
                    this.license = null;
                    return;
                }
                c10097e = c10097e3;
            }
        }
        C10097e c10097e4 = c14998e.vip;
        if (c10097e4 == this) {
            c14998e.vip = c10097e4.license;
            this.license = null;
            return;
        }
        C10097e c10097e5 = c10097e4 != null ? c10097e4.license : null;
        while (true) {
            C10097e c10097e6 = c10097e4;
            c10097e4 = c10097e5;
            if (c10097e4 == null) {
                return;
            }
            if (c10097e4 == this) {
                if (c10097e6 != null) {
                    c10097e6.license = c10097e4.license;
                }
                this.license = null;
                return;
            }
            c10097e5 = c10097e4.license;
        }
    }
}
