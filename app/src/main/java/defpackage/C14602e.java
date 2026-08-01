package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14602e {
    public final long ad;
    public final long license;
    public final long metrica;
    public final long vip;

    public C14602e(long j, long j2, long j3, long j4) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = j4;
    }

    public final C14602e ad(long j, long j2, long j3, long j4) {
        if (j == 16) {
            j = this.ad;
        }
        return new C14602e(j, j2 != 16 ? j2 : this.vip, j3 != 16 ? j3 : this.metrica, j4 != 16 ? j4 : this.license);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C14602e)) {
            return false;
        }
        C14602e c14602e = (C14602e) obj;
        return C3618e.metrica(this.ad, c14602e.ad) && C3618e.metrica(this.vip, c14602e.vip) && C3618e.metrica(this.metrica, c14602e.metrica) && C3618e.metrica(this.license, c14602e.license);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.license) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }
}
