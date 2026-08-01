package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15383e {
    public static final C15383e billing;
    public final InterfaceC1108e ad;
    public final InterfaceC1108e appmetrica;
    public final InterfaceC1108e license;
    public final InterfaceC1108e metrica;
    public final InterfaceC1108e purchase;
    public final InterfaceC1108e vip;

    static {
        C10327e c10327e = C10327e.f20377e;
        billing = new C15383e(new C10250e(4, c10327e), new C10250e(4, EnumC3988e.f8898e), new C10250e(4, c10327e), new C10250e(4, 0), new C10250e(4, 0), new C10250e(4, 0));
    }

    public C15383e(InterfaceC1108e interfaceC1108e, InterfaceC1108e interfaceC1108e2, InterfaceC1108e interfaceC1108e3, InterfaceC1108e interfaceC1108e4, InterfaceC1108e interfaceC1108e5, InterfaceC1108e interfaceC1108e6) {
        this.ad = interfaceC1108e;
        this.vip = interfaceC1108e2;
        this.metrica = interfaceC1108e3;
        this.license = interfaceC1108e4;
        this.appmetrica = interfaceC1108e5;
        this.purchase = interfaceC1108e6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15383e)) {
            return false;
        }
        C15383e c15383e = (C15383e) obj;
        return AbstractC7890e.billing(this.ad, c15383e.ad) && AbstractC7890e.billing(this.vip, c15383e.vip) && AbstractC7890e.billing(this.metrica, c15383e.metrica) && AbstractC7890e.billing(this.license, c15383e.license) && AbstractC7890e.billing(this.appmetrica, c15383e.appmetrica) && AbstractC7890e.billing(this.purchase, c15383e.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + ((this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SkylineFlows(playlistsStack=" + this.ad + ", emptyPageFlow=" + this.vip + ", trackFlow=" + this.metrica + ", libraryCountFlow=" + this.license + ", manualTracksCountFlow=" + this.appmetrica + ", allTracksSizeFlow=" + this.purchase + ')';
    }
}
