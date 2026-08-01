package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5302e {
    public final C11709e ad;
    public final int vip;

    public C5302e(C11709e c11709e, int i) {
        this.ad = c11709e;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5302e)) {
            return false;
        }
        C5302e c5302e = (C5302e) obj;
        return AbstractC7890e.billing(this.ad, c5302e.ad) && this.vip == c5302e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.vip;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.ad);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
