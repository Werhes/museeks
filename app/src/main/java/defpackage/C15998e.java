package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15998e implements InterfaceC5825e {
    public final long ad;
    public final long appmetrica;
    public final long[] billing;
    public final int license;
    public final long metrica;
    public final long purchase;
    public final int vip;

    public C15998e(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.ad = j;
        this.vip = i;
        this.metrica = j2;
        this.license = i2;
        this.appmetrica = j3;
        this.billing = jArr;
        this.purchase = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.InterfaceC5825e
    public final long ad() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        double d;
        double d2;
        boolean vip = vip();
        int i = this.vip;
        long j2 = this.ad;
        if (!vip) {
            C7278e c7278e = new C7278e(0L, j2 + i);
            return new C13178e(c7278e, c7278e);
        }
        long mopub = AbstractC9413e.mopub(j, 0L, this.metrica);
        double d3 = (mopub * 100.0d) / this.metrica;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.billing;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j3 = this.appmetrica;
        C7278e c7278e2 = new C7278e(mopub, j2 + AbstractC9413e.mopub(Math.round((d4 / d) * j3), i, j3 - 1));
        return new C13178e(c7278e2, c7278e2);
    }

    @Override // defpackage.InterfaceC6347e
    public final long billing() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC6347e
    public final /* synthetic */ boolean license() {
        return false;
    }

    @Override // defpackage.InterfaceC5825e
    public final long metrica(long j) {
        long j2 = j - this.ad;
        if (!vip() || j2 <= this.vip) {
            return 0L;
        }
        long[] jArr = this.billing;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.appmetrica;
        int purchase = AbstractC9413e.purchase(jArr, (long) d, true);
        long j3 = this.metrica;
        long j4 = (purchase * j3) / 100;
        long j5 = jArr[purchase];
        int i = purchase + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (purchase == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.InterfaceC5825e
    public final int purchase() {
        return this.license;
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean vip() {
        return this.billing != null;
    }
}
