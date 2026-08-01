package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12604e implements InterfaceC5726e {
    public final long ad;
    public final long metrica;
    public final long vip;

    public C12604e(long j, long j2, long j3) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12604e)) {
            return false;
        }
        C12604e c12604e = (C12604e) obj;
        return this.ad == c12604e.ad && this.vip == c12604e.vip && this.metrica == c12604e.metrica;
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.metrica;
        return i + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferCancelledByStorageSpace(free=");
        sb.append(this.ad);
        sb.append(", total=");
        sb.append(this.vip);
        sb.append(", required=");
        return AbstractC10257e.mopub(sb, this.metrica, ')');
    }
}
