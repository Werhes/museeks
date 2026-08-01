package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7355e {
    public static final C7355e purchase = new C7355e(new C10250e(4, C4190e.ad), new C10250e(4, C5501e.ad), new C10250e(4, C10976e.ad), new C10250e(4, new C9830e()), new C10250e(4, new C9830e()));
    public final InterfaceC1108e ad;
    public final InterfaceC1108e appmetrica;
    public final InterfaceC1108e license;
    public final InterfaceC1108e metrica;
    public final InterfaceC1108e vip;

    public C7355e(InterfaceC1108e interfaceC1108e, InterfaceC1108e interfaceC1108e2, InterfaceC1108e interfaceC1108e3, InterfaceC1108e interfaceC1108e4, InterfaceC1108e interfaceC1108e5) {
        this.ad = interfaceC1108e;
        this.vip = interfaceC1108e2;
        this.metrica = interfaceC1108e3;
        this.license = interfaceC1108e4;
        this.appmetrica = interfaceC1108e5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7355e)) {
            return false;
        }
        C7355e c7355e = (C7355e) obj;
        return AbstractC7890e.billing(this.ad, c7355e.ad) && AbstractC7890e.billing(this.vip, c7355e.vip) && AbstractC7890e.billing(this.metrica, c7355e.metrica) && AbstractC7890e.billing(this.license, c7355e.license) && AbstractC7890e.billing(this.appmetrica, c7355e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OrionFlows(myLibraryFlow=" + this.ad + ", virtualLibraryFlow=" + this.vip + ", allTracksLink=" + this.metrica + ", dataFlow=" + this.license + ", sortedDataFlow=" + this.appmetrica + ')';
    }
}
