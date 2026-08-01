package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۠ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14283e {
    public final C18525e ad;
    public final int vip;

    public C14283e(C18525e c18525e, int i) {
        if (c18525e == null) {
            throw new NullPointerException("Null quality");
        }
        this.ad = c18525e;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14283e) {
            C14283e c14283e = (C14283e) obj;
            if (this.ad.equals(c14283e.ad) && this.vip == c14283e.vip) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.ad);
        sb.append(", aspectRatio=");
        return AbstractC17861e.smaato(this.vip, "}", sb);
    }
}
