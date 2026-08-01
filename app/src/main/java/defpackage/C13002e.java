package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13002e {
    public final float ad;
    public final float vip;

    public C13002e(float f, float f2) {
        this.ad = f;
        this.vip = f2;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.vip) + (Float.floatToIntBits(this.ad) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.ad;
        AbstractC10257e.admob(f, sb, ", right=");
        float f2 = this.vip;
        sb.append((Object) C15765e.metrica(f + f2));
        sb.append(", width=");
        sb.append((Object) C15765e.metrica(f2));
        sb.append(')');
        return sb.toString();
    }
}
