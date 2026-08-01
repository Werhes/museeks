package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13001e extends AbstractC6344e {
    public final String ad;
    public final String vip;

    public C13001e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6344e) {
            C13001e c13001e = (C13001e) ((AbstractC6344e) obj);
            if (this.ad.equals(c13001e.ad) && this.vip.equals(c13001e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.ad);
        sb.append(", value=");
        return AbstractC1786e.signatures(sb, this.vip, "}");
    }
}
