package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16005e implements InterfaceC12123e {
    public final float ad;
    public final float license;
    public final float metrica;
    public final float vip;

    public C16005e(float f, float f2, float f3, float f4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            AbstractC9534e.ad("Padding must be non-negative");
        }
    }

    @Override // defpackage.InterfaceC12123e
    public final float ad() {
        return this.license;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16005e)) {
            return false;
        }
        C16005e c16005e = (C16005e) obj;
        return C15765e.vip(this.ad, c16005e.ad) && C15765e.vip(this.vip, c16005e.vip) && C15765e.vip(this.metrica, c16005e.metrica) && C15765e.vip(this.license, c16005e.license);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }

    @Override // defpackage.InterfaceC12123e
    public final float license() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC12123e
    public final float metrica(EnumC7792e enumC7792e) {
        return enumC7792e == EnumC7792e.f15794e ? this.metrica : this.ad;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        AbstractC10257e.admob(this.ad, sb, ", top=");
        AbstractC10257e.admob(this.vip, sb, ", end=");
        AbstractC10257e.admob(this.metrica, sb, ", bottom=");
        sb.append((Object) C15765e.metrica(this.license));
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC12123e
    public final float vip(EnumC7792e enumC7792e) {
        return enumC7792e == EnumC7792e.f15794e ? this.ad : this.metrica;
    }
}
