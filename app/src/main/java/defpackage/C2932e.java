package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2932e {
    public final InterfaceC16154e ad;
    public final InterfaceC16154e appmetrica;
    public final InterfaceC16154e license;
    public final InterfaceC16154e metrica;
    public final InterfaceC16154e vip;

    public C2932e(InterfaceC16154e interfaceC16154e, InterfaceC16154e interfaceC16154e2, InterfaceC16154e interfaceC16154e3, InterfaceC16154e interfaceC16154e4, InterfaceC16154e interfaceC16154e5) {
        this.ad = interfaceC16154e;
        this.vip = interfaceC16154e2;
        this.metrica = interfaceC16154e3;
        this.license = interfaceC16154e4;
        this.appmetrica = interfaceC16154e5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2932e.class != obj.getClass()) {
            return false;
        }
        C2932e c2932e = (C2932e) obj;
        return AbstractC7890e.billing(this.ad, c2932e.ad) && AbstractC7890e.billing(this.vip, c2932e.vip) && AbstractC7890e.billing(this.metrica, c2932e.metrica) && AbstractC7890e.billing(this.license, c2932e.license) && AbstractC7890e.billing(this.appmetrica, c2932e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + AbstractC0054e.applovin(this.license, AbstractC0054e.applovin(this.metrica, AbstractC0054e.applovin(this.vip, this.ad.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ClickableSurfaceShape(shape=" + this.ad + ", focusedShape=" + this.vip + ", pressedShape=" + this.metrica + ", disabledShape=" + this.license + ", focusedDisabledShape=" + this.appmetrica + ')';
    }
}
