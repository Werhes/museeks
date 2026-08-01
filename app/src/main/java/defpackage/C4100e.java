package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4100e {
    public final InterfaceC16154e ad;
    public final InterfaceC16154e adcel;
    public final InterfaceC16154e appmetrica;
    public final InterfaceC16154e billing;
    public final InterfaceC16154e license;
    public final InterfaceC16154e metrica;
    public final InterfaceC16154e purchase;
    public final InterfaceC16154e startapp;
    public final InterfaceC16154e vip;
    public final InterfaceC16154e yandex;

    public C4100e(InterfaceC16154e interfaceC16154e, InterfaceC16154e interfaceC16154e2, InterfaceC16154e interfaceC16154e3, InterfaceC16154e interfaceC16154e4, InterfaceC16154e interfaceC16154e5, InterfaceC16154e interfaceC16154e6, InterfaceC16154e interfaceC16154e7, InterfaceC16154e interfaceC16154e8, InterfaceC16154e interfaceC16154e9, InterfaceC16154e interfaceC16154e10) {
        this.ad = interfaceC16154e;
        this.vip = interfaceC16154e2;
        this.metrica = interfaceC16154e3;
        this.license = interfaceC16154e4;
        this.appmetrica = interfaceC16154e5;
        this.purchase = interfaceC16154e6;
        this.billing = interfaceC16154e7;
        this.yandex = interfaceC16154e8;
        this.startapp = interfaceC16154e9;
        this.adcel = interfaceC16154e10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4100e.class != obj.getClass()) {
            return false;
        }
        C4100e c4100e = (C4100e) obj;
        return AbstractC7890e.billing(this.ad, c4100e.ad) && AbstractC7890e.billing(this.vip, c4100e.vip) && AbstractC7890e.billing(this.metrica, c4100e.metrica) && AbstractC7890e.billing(this.license, c4100e.license) && AbstractC7890e.billing(this.appmetrica, c4100e.appmetrica) && AbstractC7890e.billing(this.purchase, c4100e.purchase) && AbstractC7890e.billing(this.billing, c4100e.billing) && AbstractC7890e.billing(this.yandex, c4100e.yandex) && AbstractC7890e.billing(this.startapp, c4100e.startapp) && AbstractC7890e.billing(this.adcel, c4100e.adcel);
    }

    public final int hashCode() {
        return this.adcel.hashCode() + AbstractC0054e.applovin(this.startapp, AbstractC0054e.applovin(this.yandex, AbstractC0054e.applovin(this.billing, AbstractC0054e.applovin(this.purchase, AbstractC0054e.applovin(this.appmetrica, AbstractC0054e.applovin(this.license, AbstractC0054e.applovin(this.metrica, AbstractC0054e.applovin(this.vip, this.ad.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "SelectableSurfaceShape(shape=" + this.ad + ", focusedShape=" + this.vip + ",pressedShape=" + this.metrica + ", selectedShape=" + this.license + ",disabledShape=" + this.appmetrica + ", focusedSelectedShape=" + this.purchase + ", focusedDisabledShape=" + this.billing + ",pressedSelectedShape=" + this.yandex + ", selectedDisabledShape=" + this.startapp + ", focusedSelectedDisabledShape=" + this.adcel + ')';
    }
}
