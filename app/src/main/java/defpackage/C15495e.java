package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15495e implements InterfaceC3454e {
    public final int ad;
    public final long license;
    public final long metrica;
    public final InterfaceC17838e vip;

    public C15495e(int i, int i2, InterfaceC17838e interfaceC17838e) {
        this.ad = i;
        this.vip = interfaceC17838e;
        this.metrica = i * 1000000;
        this.license = i2 * 1000000;
    }

    @Override // defpackage.InterfaceC2869e
    public final InterfaceC17717e ad(C11139e c11139e) {
        return new C11467e(this);
    }

    @Override // defpackage.InterfaceC3454e
    public final float appmetrica(long j, float f, float f2, float f3) {
        long j2 = j - this.license;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.metrica;
        if (j2 > j3) {
            j2 = j3;
        }
        float ad = this.vip.ad(this.ad == 0 ? 1.0f : ((float) j2) / ((float) j3));
        return (f2 * ad) + ((1 - ad) * f);
    }

    @Override // defpackage.InterfaceC3454e
    public final float license(float f, float f2, float f3) {
        return vip(metrica(f, f2, f3), f, f2, f3);
    }

    @Override // defpackage.InterfaceC3454e
    public final long metrica(float f, float f2, float f3) {
        return this.license + this.metrica;
    }

    @Override // defpackage.InterfaceC3454e
    public final float vip(long j, float f, float f2, float f3) {
        long j2 = j - this.license;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.metrica;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (appmetrica(j4, f, f2, f3) - appmetrica(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }
}
