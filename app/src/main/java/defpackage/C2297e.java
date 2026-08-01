package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؐۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2297e implements InterfaceC12006e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC12006e f5810e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC12006e f5811e;

    public C2297e(InterfaceC12006e interfaceC12006e, InterfaceC12006e interfaceC12006e2) {
        this.f5811e = interfaceC12006e;
        this.f5810e = interfaceC12006e2;
    }

    @Override // defpackage.InterfaceC12006e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        this.f5811e.adcel(interfaceC15671e);
        this.f5810e.adcel(interfaceC15671e);
    }

    @Override // defpackage.InterfaceC12006e
    public final C4988e advert() {
        C4988e advert = this.f5810e.advert();
        InterfaceC12006e interfaceC12006e = this.f5811e;
        return advert != null ? advert.ad(interfaceC12006e.advert()) : interfaceC12006e.advert();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2297e.class != obj.getClass()) {
            return false;
        }
        C2297e c2297e = (C2297e) obj;
        return AbstractC7890e.billing(this.f5811e, c2297e.f5811e) && AbstractC7890e.billing(this.f5810e, c2297e.f5810e) && AbstractC7890e.billing(advert(), c2297e.advert());
    }

    public final int hashCode() {
        int hashCode = (this.f5810e.hashCode() + (this.f5811e.hashCode() * 31)) * 32;
        C4988e advert = advert();
        return hashCode + (advert != null ? advert.hashCode() : 0);
    }

    @Override // defpackage.InterfaceC12006e
    public final void mopub(C2573e c2573e) {
        this.f5811e.mopub(c2573e);
        this.f5810e.mopub(c2573e);
    }

    public final String toString() {
        return this.f5811e + ".then(" + this.f5810e + ')';
    }
}
