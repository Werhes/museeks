package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15373e extends AbstractC12460e {
    public final String ad;
    public final String vip;

    public C15373e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC12460e) {
            C15373e c15373e = (C15373e) ((AbstractC12460e) obj);
            if (this.ad.equals(c15373e.ad) && this.vip.equals(c15373e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.ad);
        sb.append(", variantId=");
        return AbstractC1786e.signatures(sb, this.vip, "}");
    }
}
