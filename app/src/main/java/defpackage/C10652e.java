package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۥٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10652e implements InterfaceC12123e {
    public final InterfaceC11968e ad;
    public final InterfaceC14388e vip;

    public C10652e(InterfaceC11968e interfaceC11968e, InterfaceC14388e interfaceC14388e) {
        this.ad = interfaceC11968e;
        this.vip = interfaceC14388e;
    }

    @Override // defpackage.InterfaceC12123e
    public final float ad() {
        InterfaceC11968e interfaceC11968e = this.ad;
        InterfaceC14388e interfaceC14388e = this.vip;
        return interfaceC14388e.mo496final(interfaceC11968e.metrica(interfaceC14388e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10652e)) {
            return false;
        }
        C10652e c10652e = (C10652e) obj;
        return AbstractC7890e.billing(this.ad, c10652e.ad) && AbstractC7890e.billing(this.vip, c10652e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC12123e
    public final float license() {
        InterfaceC11968e interfaceC11968e = this.ad;
        InterfaceC14388e interfaceC14388e = this.vip;
        return interfaceC14388e.mo496final(interfaceC11968e.ad(interfaceC14388e));
    }

    @Override // defpackage.InterfaceC12123e
    public final float metrica(EnumC7792e enumC7792e) {
        InterfaceC11968e interfaceC11968e = this.ad;
        InterfaceC14388e interfaceC14388e = this.vip;
        return interfaceC14388e.mo496final(interfaceC11968e.vip(interfaceC14388e, enumC7792e));
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.ad + ", density=" + this.vip + ')';
    }

    @Override // defpackage.InterfaceC12123e
    public final float vip(EnumC7792e enumC7792e) {
        InterfaceC11968e interfaceC11968e = this.ad;
        InterfaceC14388e interfaceC14388e = this.vip;
        return interfaceC14388e.mo496final(interfaceC11968e.license(interfaceC14388e, enumC7792e));
    }
}
