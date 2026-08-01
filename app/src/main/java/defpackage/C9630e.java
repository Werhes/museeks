package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9630e {
    public static final C9630e license;
    public final C7433e ad;
    public final InterfaceC16154e metrica;
    public final float vip;

    static {
        float f = 0;
        license = new C9630e(AbstractC16619e.ad(f, C3618e.startapp), f, AbstractC10432e.ad);
    }

    public C9630e(C7433e c7433e, float f, InterfaceC16154e interfaceC16154e) {
        this.ad = c7433e;
        this.vip = f;
        this.metrica = interfaceC16154e;
    }

    public C9630e(C7433e c7433e, InterfaceC16154e interfaceC16154e, int i) {
        this(c7433e, 0, (i & 4) != 0 ? AbstractC13703e.ad : interfaceC16154e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9630e.class != obj.getClass()) {
            return false;
        }
        C9630e c9630e = (C9630e) obj;
        return AbstractC7890e.billing(this.ad, c9630e.ad) && C15765e.vip(this.vip, c9630e.vip) && AbstractC7890e.billing(this.metrica, c9630e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC1414e.license(this.ad.hashCode() * 31, this.vip, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Border(border=");
        sb.append(this.ad);
        sb.append(", inset=");
        AbstractC10257e.admob(this.vip, sb, ", shape=");
        sb.append(this.metrica);
        sb.append(')');
        return sb.toString();
    }
}
