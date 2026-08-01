package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12316e {
    public final long ad;
    public final C17085e metrica;
    public final long vip;

    public C12316e(long j, long j2, C17085e c17085e) {
        this.ad = j;
        this.vip = j2;
        this.metrica = c17085e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12316e)) {
            return false;
        }
        C12316e c12316e = (C12316e) obj;
        return C3618e.metrica(this.ad, c12316e.ad) && C3618e.metrica(this.vip, c12316e.vip) && AbstractC7890e.billing(this.metrica, c12316e.metrica);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return this.metrica.hashCode() + AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31);
    }
}
