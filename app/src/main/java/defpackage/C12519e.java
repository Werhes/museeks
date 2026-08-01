package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12519e extends AbstractC12082e implements InterfaceC6346e, InterfaceC1755e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f25057e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC10226e f25058e;

    public C12519e(AbstractC10226e abstractC10226e, boolean z) {
        this.f25058e = abstractC10226e;
        this.f25057e = z;
    }

    @Override // defpackage.AbstractC12082e, defpackage.AbstractC1186e
    public final boolean Signature() {
        return false;
    }

    @Override // defpackage.AbstractC12082e
    public final AbstractC10226e ads() {
        return this.f25058e;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: applovin */
    public final AbstractC10226e isVip(C6557e c6557e) {
        return new C12519e(this.f25058e.isVip(c6557e), this.f25057e);
    }

    @Override // defpackage.InterfaceC6346e
    public final boolean billing() {
        AbstractC10226e abstractC10226e = this.f25058e;
        abstractC10226e.loadAd();
        return abstractC10226e.loadAd().advert() instanceof InterfaceC16046e;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: isPro */
    public final AbstractC10226e pro(boolean z) {
        return z ? this.f25058e.pro(z) : this;
    }

    @Override // defpackage.InterfaceC6346e
    public final AbstractC15728e purchase(AbstractC1186e abstractC1186e) {
        return AbstractC16481e.purchase(abstractC1186e.subscription(), this.f25057e);
    }

    @Override // defpackage.AbstractC12082e
    public final AbstractC12082e subs(AbstractC10226e abstractC10226e) {
        return new C12519e(abstractC10226e, this.f25057e);
    }

    @Override // defpackage.AbstractC10226e
    public final String toString() {
        return this.f25058e + " & Any";
    }
}
