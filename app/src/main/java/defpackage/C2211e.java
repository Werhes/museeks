package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۤۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2211e implements InterfaceC11968e {
    public final C3229e ad;

    public C2211e(C3229e c3229e) {
        this.ad = c3229e;
    }

    @Override // defpackage.InterfaceC11968e
    public final int ad(InterfaceC14388e interfaceC14388e) {
        int i;
        float purchase = ((C2616e) this.ad.purchase.startapp).purchase();
        if (!Float.isNaN(purchase) && (i = (int) purchase) >= 0) {
            return i;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2211e)) {
            return false;
        }
        return AbstractC7890e.billing(this.ad, ((C2211e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC11968e
    public final int license(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e) {
        return 0;
    }

    @Override // defpackage.InterfaceC11968e
    public final int metrica(InterfaceC14388e interfaceC14388e) {
        return 0;
    }

    @Override // defpackage.InterfaceC11968e
    public final int vip(InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e) {
        return 0;
    }
}
