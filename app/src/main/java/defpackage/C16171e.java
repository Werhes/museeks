package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16171e {
    public final long ad;
    public final long appmetrica;
    public final long license;
    public final long metrica;
    public final long purchase;
    public final long vip;

    public C16171e(long j, long j2, long j3, long j4, long j5, long j6) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = j4;
        this.appmetrica = j5;
        this.purchase = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C16171e)) {
            return false;
        }
        C16171e c16171e = (C16171e) obj;
        return C3618e.metrica(this.ad, c16171e.ad) && C3618e.metrica(this.vip, c16171e.vip) && C3618e.metrica(this.metrica, c16171e.metrica) && C3618e.metrica(this.license, c16171e.license) && C3618e.metrica(this.appmetrica, c16171e.appmetrica) && C3618e.metrica(this.purchase, c16171e.purchase);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.purchase) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31), this.appmetrica, 31);
    }
}
