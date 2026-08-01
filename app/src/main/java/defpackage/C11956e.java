package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11956e {
    public final int ad;
    public final boolean metrica;
    public final long vip;

    public C11956e(int i, long j, boolean z) {
        this.ad = i;
        this.vip = j;
        this.metrica = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11956e)) {
            return false;
        }
        C11956e c11956e = (C11956e) obj;
        return this.ad == c11956e.ad && this.vip == c11956e.vip && this.metrica == c11956e.metrica;
    }

    public final int hashCode() {
        int i = this.ad * 31;
        long j = this.vip;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + (this.metrica ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioTrackOwnershipContainer(id=");
        sb.append(this.ad);
        sb.append(", ownerId=");
        sb.append(this.vip);
        sb.append(", wasFirstMine=");
        return AbstractC1786e.isVip(sb, this.metrica, ')');
    }
}
