package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٛ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13364e implements InterfaceC11968e {
    public final float ad;
    public final float license;
    public final float metrica;
    public final float vip;

    public C13364e(float f, float f2, float f3, float f4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
    }

    @Override // defpackage.InterfaceC11968e
    public final int ad(InterfaceC14388e interfaceC14388e) {
        return interfaceC14388e.mo493e(this.vip);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13364e)) {
            return false;
        }
        C13364e c13364e = (C13364e) obj;
        return C15765e.vip(this.ad, c13364e.ad) && C15765e.vip(this.vip, c13364e.vip) && C15765e.vip(this.metrica, c13364e.metrica) && C15765e.vip(this.license, c13364e.license);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.license) + AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
    }

    @Override // defpackage.InterfaceC11968e
    public final int license(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e) {
        return interfaceC14388e.mo493e(this.ad);
    }

    @Override // defpackage.InterfaceC11968e
    public final int metrica(InterfaceC14388e interfaceC14388e) {
        return interfaceC14388e.mo493e(this.license);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        AbstractC10257e.admob(this.ad, sb, ", top=");
        AbstractC10257e.admob(this.vip, sb, ", right=");
        AbstractC10257e.admob(this.metrica, sb, ", bottom=");
        sb.append((Object) C15765e.metrica(this.license));
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC11968e
    public final int vip(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e) {
        return interfaceC14388e.mo493e(this.metrica);
    }
}
