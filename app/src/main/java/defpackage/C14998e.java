package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ۟٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14998e {
    public final C3123e ad;
    public long appmetrica;
    public float[] billing;
    public long license;
    public long metrica;
    public long purchase;
    public C10097e vip;

    public C14998e() {
        C3123e c3123e = AbstractC12146e.ad;
        this.ad = new C3123e();
        this.metrica = -1L;
        this.license = 0L;
        this.appmetrica = 0L;
    }

    public final void ad(C10097e c10097e, long j, long j2, float[] fArr, long j3) {
        long j4 = c10097e.billing;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            c10097e.billing = j3;
            c10097e.ad(c10097e.appmetrica, c10097e.purchase, j, j2, fArr);
        }
    }

    public final boolean vip(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (C11490e.vip(j2, this.license)) {
            z = false;
        } else {
            this.license = j2;
            z = true;
        }
        if (!C11490e.vip(j, this.appmetrica)) {
            this.appmetrica = j;
            z = true;
        }
        if (fArr != null) {
            this.billing = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.purchase) {
            return z;
        }
        this.purchase = j3;
        return true;
    }
}
