package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14162e {
    public final C17149e ad;
    public final int vip;

    public C14162e(C17149e c17149e, int i) {
        this.ad = c17149e;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14162e)) {
            return false;
        }
        C14162e c14162e = (C14162e) obj;
        return AbstractC7890e.billing(this.ad, c14162e.ad) && this.vip == c14162e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.ad);
        sb.append(", configFlags=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
