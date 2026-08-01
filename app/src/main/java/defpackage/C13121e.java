package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13121e extends AbstractC4970e {
    public final float ad;
    public final C1667e appmetrica;
    public final int license;
    public final int metrica;
    public final float vip;

    public C13121e(float f, float f2, int i, int i2, C1667e c1667e, int i3) {
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        c1667e = (i3 & 16) != 0 ? null : c1667e;
        this.ad = f;
        this.vip = f2;
        this.metrica = i;
        this.license = i2;
        this.appmetrica = c1667e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13121e)) {
            return false;
        }
        C13121e c13121e = (C13121e) obj;
        return this.ad == c13121e.ad && this.vip == c13121e.vip && this.metrica == c13121e.metrica && this.license == c13121e.license && AbstractC7890e.billing(this.appmetrica, c13121e.appmetrica);
    }

    public final int hashCode() {
        int license = (((AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31) + this.metrica) * 31) + this.license) * 31;
        C1667e c1667e = this.appmetrica;
        return license + (c1667e != null ? c1667e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.ad);
        sb.append(", miter=");
        sb.append(this.vip);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.metrica;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.license;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=");
        sb.append(this.appmetrica);
        sb.append(')');
        return sb.toString();
    }
}
