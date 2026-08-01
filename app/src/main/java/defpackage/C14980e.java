package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14980e {
    public final int ad;
    public final long metrica;
    public final int vip;

    public C14980e(int i, long j, int i2) {
        this.ad = i;
        this.vip = i2;
        this.metrica = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14980e)) {
            return false;
        }
        C14980e c14980e = (C14980e) obj;
        return this.ad == c14980e.ad && this.vip == c14980e.vip && this.metrica == c14980e.metrica;
    }

    public final int hashCode() {
        int m2467class = ((AbstractC8703e.m2467class(this.ad) * 31) + this.vip) * 31;
        long j = this.metrica;
        return m2467class + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(AbstractC0054e.m227while(this.ad));
        sb.append(", offset=");
        sb.append(this.vip);
        sb.append(", selectableId=");
        return AbstractC10257e.mopub(sb, this.metrica, ')');
    }
}
