package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5912e {
    public final InterfaceC11824e ad;
    public final InterfaceC3054e license;
    public final AbstractC8470e metrica;
    public final C2009e vip;

    public C5912e(InterfaceC11824e interfaceC11824e, C2009e c2009e, AbstractC8470e abstractC8470e, InterfaceC3054e interfaceC3054e) {
        this.ad = interfaceC11824e;
        this.vip = c2009e;
        this.metrica = abstractC8470e;
        this.license = interfaceC3054e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5912e)) {
            return false;
        }
        C5912e c5912e = (C5912e) obj;
        return AbstractC7890e.billing(this.ad, c5912e.ad) && AbstractC7890e.billing(this.vip, c5912e.vip) && AbstractC7890e.billing(this.metrica, c5912e.metrica) && AbstractC7890e.billing(this.license, c5912e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.ad + ", classProto=" + this.vip + ", metadataVersion=" + this.metrica + ", sourceElement=" + this.license + ')';
    }
}
