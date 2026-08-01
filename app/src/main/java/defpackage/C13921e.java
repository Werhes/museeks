package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13921e {
    public final InterfaceC16154e ad;
    public final InterfaceC16154e appmetrica;
    public final InterfaceC16154e billing;
    public final InterfaceC16154e license;
    public final InterfaceC16154e metrica;
    public final InterfaceC16154e purchase;
    public final InterfaceC16154e vip;
    public final InterfaceC16154e yandex;

    public C13921e(InterfaceC16154e interfaceC16154e, InterfaceC16154e interfaceC16154e2, InterfaceC16154e interfaceC16154e3, InterfaceC16154e interfaceC16154e4, InterfaceC16154e interfaceC16154e5, InterfaceC16154e interfaceC16154e6, InterfaceC16154e interfaceC16154e7, InterfaceC16154e interfaceC16154e8) {
        this.ad = interfaceC16154e;
        this.vip = interfaceC16154e2;
        this.metrica = interfaceC16154e3;
        this.license = interfaceC16154e4;
        this.appmetrica = interfaceC16154e5;
        this.purchase = interfaceC16154e6;
        this.billing = interfaceC16154e7;
        this.yandex = interfaceC16154e8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13921e.class != obj.getClass()) {
            return false;
        }
        C13921e c13921e = (C13921e) obj;
        return AbstractC7890e.billing(this.ad, c13921e.ad) && AbstractC7890e.billing(this.vip, c13921e.vip) && AbstractC7890e.billing(this.metrica, c13921e.metrica) && AbstractC7890e.billing(this.license, c13921e.license) && AbstractC7890e.billing(this.appmetrica, c13921e.appmetrica) && AbstractC7890e.billing(this.purchase, c13921e.purchase) && AbstractC7890e.billing(this.billing, c13921e.billing) && AbstractC7890e.billing(this.yandex, c13921e.yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() + AbstractC0054e.applovin(this.billing, AbstractC0054e.applovin(this.purchase, AbstractC0054e.applovin(this.appmetrica, AbstractC0054e.applovin(this.license, AbstractC0054e.applovin(this.metrica, AbstractC0054e.applovin(this.vip, this.ad.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ListItemShape(shape=" + this.ad + ", focusedShape=" + this.vip + ",pressedShape=" + this.metrica + ", selectedShape=" + this.license + ", disabledShape=" + this.appmetrica + ", focusedSelectedShape=" + this.purchase + ", focusedDisabledShape=" + this.billing + ", pressedSelectedShape=" + this.yandex + ')';
    }
}
