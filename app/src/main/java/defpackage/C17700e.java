package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17700e {
    public final EnumC2880e ad;
    public final C13692e license;
    public final C2782e metrica;
    public final int vip;

    public C17700e(EnumC2880e enumC2880e, int i, C2782e c2782e, C13692e c13692e) {
        this.ad = enumC2880e;
        this.vip = i;
        this.metrica = c2782e;
        this.license = c13692e;
    }

    public /* synthetic */ C17700e(EnumC2880e enumC2880e, int i, C2782e c2782e, C13692e c13692e, int i2) {
        this(enumC2880e, i, (i2 & 4) != 0 ? null : c2782e, (i2 & 8) != 0 ? null : c13692e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17700e)) {
            return false;
        }
        C17700e c17700e = (C17700e) obj;
        return this.ad == c17700e.ad && this.vip == c17700e.vip && AbstractC7890e.billing(this.metrica, c17700e.metrica) && AbstractC7890e.billing(this.license, c17700e.license);
    }

    public final int hashCode() {
        int hashCode = ((this.ad.hashCode() * 31) + this.vip) * 31;
        C2782e c2782e = this.metrica;
        int i = (hashCode + (c2782e == null ? 0 : c2782e.ad)) * 31;
        C13692e c13692e = this.license;
        return i + (c13692e != null ? c13692e.ad : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.ad + ", numChildren=" + this.vip + ", horizontalAlignment=" + this.metrica + ", verticalAlignment=" + this.license + ')';
    }
}
