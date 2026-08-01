package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7433e {
    public final float ad;
    public final C18466e vip;

    public C7433e(float f, C18466e c18466e) {
        this.ad = f;
        this.vip = c18466e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7433e)) {
            return false;
        }
        C7433e c7433e = (C7433e) obj;
        return C15765e.vip(this.ad, c7433e.ad) && this.vip.equals(c7433e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (Float.floatToIntBits(this.ad) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        AbstractC10257e.admob(this.ad, sb, ", brush=");
        sb.append(this.vip);
        sb.append(')');
        return sb.toString();
    }
}
