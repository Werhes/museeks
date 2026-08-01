package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15544e implements InterfaceC11968e {
    public final InterfaceC11968e ad;
    public final InterfaceC11968e vip;

    public C15544e(InterfaceC11968e interfaceC11968e, InterfaceC11968e interfaceC11968e2) {
        this.ad = interfaceC11968e;
        this.vip = interfaceC11968e2;
    }

    @Override // defpackage.InterfaceC11968e
    public final int ad(InterfaceC14388e interfaceC14388e) {
        int ad = this.ad.ad(interfaceC14388e) - this.vip.ad(interfaceC14388e);
        if (ad < 0) {
            return 0;
        }
        return ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15544e)) {
            return false;
        }
        C15544e c15544e = (C15544e) obj;
        return AbstractC7890e.billing(c15544e.ad, this.ad) && AbstractC7890e.billing(c15544e.vip, this.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC11968e
    public final int license(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e) {
        int license = this.ad.license(interfaceC14388e, enumC7792e) - this.vip.license(interfaceC14388e, enumC7792e);
        if (license < 0) {
            return 0;
        }
        return license;
    }

    @Override // defpackage.InterfaceC11968e
    public final int metrica(InterfaceC14388e interfaceC14388e) {
        int metrica = this.ad.metrica(interfaceC14388e) - this.vip.metrica(interfaceC14388e);
        if (metrica < 0) {
            return 0;
        }
        return metrica;
    }

    public final String toString() {
        return "(" + this.ad + " - " + this.vip + ')';
    }

    @Override // defpackage.InterfaceC11968e
    public final int vip(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e) {
        int vip = this.ad.vip(interfaceC14388e, enumC7792e) - this.vip.vip(interfaceC14388e, enumC7792e);
        if (vip < 0) {
            return 0;
        }
        return vip;
    }
}
