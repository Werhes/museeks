package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10996e implements InterfaceC11968e {
    public final InterfaceC11968e ad;
    public final int vip;

    public C10996e(InterfaceC11968e interfaceC11968e, int i) {
        this.ad = interfaceC11968e;
        this.vip = i;
    }

    @Override // defpackage.InterfaceC11968e
    public final int ad(InterfaceC14388e interfaceC14388e) {
        if ((this.vip & 16) != 0) {
            return this.ad.ad(interfaceC14388e);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10996e)) {
            return false;
        }
        C10996e c10996e = (C10996e) obj;
        return AbstractC7890e.billing(this.ad, c10996e.ad) && this.vip == c10996e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    @Override // defpackage.InterfaceC11968e
    public final int license(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e) {
        if (((enumC7792e == EnumC7792e.f15794e ? 8 : 2) & this.vip) != 0) {
            return this.ad.license(interfaceC14388e, enumC7792e);
        }
        return 0;
    }

    @Override // defpackage.InterfaceC11968e
    public final int metrica(InterfaceC14388e interfaceC14388e) {
        if ((this.vip & 32) != 0) {
            return this.ad.metrica(interfaceC14388e);
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.ad);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.vip;
        int i2 = AbstractC17113e.ad;
        if ((i & i2) == i2) {
            AbstractC17113e.purchase("Start", sb3);
        }
        int i3 = AbstractC17113e.metrica;
        if ((i & i3) == i3) {
            AbstractC17113e.purchase("Left", sb3);
        }
        if ((i & 16) == 16) {
            AbstractC17113e.purchase("Top", sb3);
        }
        int i4 = AbstractC17113e.vip;
        if ((i & i4) == i4) {
            AbstractC17113e.purchase("End", sb3);
        }
        int i5 = AbstractC17113e.license;
        if ((i & i5) == i5) {
            AbstractC17113e.purchase("Right", sb3);
        }
        if ((i & 32) == 32) {
            AbstractC17113e.purchase("Bottom", sb3);
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC11968e
    public final int vip(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e) {
        if (((enumC7792e == EnumC7792e.f15794e ? 4 : 1) & this.vip) != 0) {
            return this.ad.vip(interfaceC14388e, enumC7792e);
        }
        return 0;
    }
}
