package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13793e {
    public final long ad;
    public final long appmetrica;
    public final long license;
    public final long metrica;
    public final long purchase;
    public final long vip;

    public C13793e(long j, long j2, long j3, long j4, long j5, long j6) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = j4;
        this.appmetrica = j5;
        this.purchase = j6;
    }

    public final C13793e ad(long j, long j2, long j3, long j4, long j5, long j6) {
        return new C13793e(j != 16 ? j : this.ad, j2 != 16 ? j2 : this.vip, j3 != 16 ? j3 : this.metrica, j4 != 16 ? j4 : this.license, j5 != 16 ? j5 : this.appmetrica, j6 != 16 ? j6 : this.purchase);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C13793e)) {
            return false;
        }
        C13793e c13793e = (C13793e) obj;
        return C3618e.metrica(this.ad, c13793e.ad) && C3618e.metrica(this.vip, c13793e.vip) && C3618e.metrica(this.metrica, c13793e.metrica) && C3618e.metrica(this.license, c13793e.license) && C3618e.metrica(this.appmetrica, c13793e.appmetrica) && C3618e.metrica(this.purchase, c13793e.purchase);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.purchase) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31), this.appmetrica, 31);
    }
}
