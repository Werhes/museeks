package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14917e {
    public static final C14917e license = new C14917e(17, C17979e.metrica, 0);
    public final float ad;
    public final int metrica;
    public final int vip;

    public C14917e(int i, float f, int i2) {
        this.ad = f;
        this.vip = i;
        this.metrica = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14917e)) {
            return false;
        }
        C14917e c14917e = (C14917e) obj;
        float f = c14917e.ad;
        float f2 = C17979e.vip;
        return Float.compare(this.ad, f) == 0 && this.vip == c14917e.vip && this.metrica == c14917e.metrica;
    }

    public final int hashCode() {
        float f = C17979e.vip;
        return (((Float.floatToIntBits(this.ad) * 31) + this.vip) * 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) C17979e.vip(this.ad));
        sb.append(", trim=");
        String str = "Invalid";
        int i = this.vip;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.metrica;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
