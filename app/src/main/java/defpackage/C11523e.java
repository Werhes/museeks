package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11523e {
    public final Object ad;
    public final int vip;

    public C11523e(int i, Object obj) {
        this.ad = obj;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11523e)) {
            return false;
        }
        C11523e c11523e = (C11523e) obj;
        return AbstractC7890e.billing(this.ad, c11523e.ad) && this.vip == c11523e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemKey(value=");
        sb.append(this.ad);
        sb.append(", index=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
