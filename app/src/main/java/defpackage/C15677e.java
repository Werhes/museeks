package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۘۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15677e implements InterfaceC16047e {
    public final C9577e ad;
    public final int metrica;
    public final C9577e vip;

    public C15677e(C9577e c9577e, C9577e c9577e2, int i) {
        this.ad = c9577e;
        this.vip = c9577e2;
        this.metrica = i;
    }

    @Override // defpackage.InterfaceC16047e
    public final int ad(C10163e c10163e, long j, int i, EnumC7792e enumC7792e) {
        int ad = this.vip.ad(0, c10163e.license(), enumC7792e);
        int i2 = -this.ad.ad(0, i, enumC7792e);
        EnumC7792e enumC7792e2 = EnumC7792e.f15794e;
        int i3 = this.metrica;
        if (enumC7792e != enumC7792e2) {
            i3 = -i3;
        }
        return AbstractC8703e.crashlytics(c10163e.ad, ad, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15677e)) {
            return false;
        }
        C15677e c15677e = (C15677e) obj;
        return this.ad.equals(c15677e.ad) && this.vip.equals(c15677e.vip) && this.metrica == c15677e.metrica;
    }

    public final int hashCode() {
        return AbstractC1414e.license(Float.floatToIntBits(this.ad.ad) * 31, this.vip.ad, 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.ad);
        sb.append(", anchorAlignment=");
        sb.append(this.vip);
        sb.append(", offset=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}
