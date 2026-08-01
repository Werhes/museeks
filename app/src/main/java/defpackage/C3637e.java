package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۜؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3637e {
    public final int ad;
    public final int metrica;
    public final long vip;

    public C3637e(int i, long j, int i2) {
        this.ad = i;
        this.vip = j;
        this.metrica = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3637e)) {
            return false;
        }
        C3637e c3637e = (C3637e) obj;
        return this.ad == c3637e.ad && this.vip == c3637e.vip && this.metrica == c3637e.metrica;
    }

    public final int hashCode() {
        int i = this.ad * 31;
        long j = this.vip;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DuplicateOccurrence(id=");
        sb.append(this.ad);
        sb.append(", ownerId=");
        sb.append(this.vip);
        sb.append(", date=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}
