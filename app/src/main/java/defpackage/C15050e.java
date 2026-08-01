package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۣٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15050e extends AbstractC12082e implements InterfaceC0875e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC1186e f29818e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC10226e f29819e;

    public C15050e(AbstractC10226e abstractC10226e, AbstractC1186e abstractC1186e) {
        this.f29819e = abstractC10226e;
        this.f29818e = abstractC1186e;
    }

    @Override // defpackage.AbstractC12082e, defpackage.AbstractC1186e
    /* renamed from: admob */
    public final AbstractC1186e signatures(C13520e c13520e) {
        return new C15050e(this.f29819e, this.f29818e);
    }

    @Override // defpackage.AbstractC12082e
    public final AbstractC10226e ads() {
        return this.f29819e;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: applovin */
    public final AbstractC10226e isVip(C6557e c6557e) {
        return (AbstractC10226e) AbstractC10653e.appmetrica(this.f29819e.isVip(c6557e), this.f29818e);
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: isPro */
    public final AbstractC10226e pro(boolean z) {
        return (AbstractC10226e) AbstractC10653e.appmetrica(this.f29819e.pro(z), this.f29818e.subscription().pro(z));
    }

    @Override // defpackage.InterfaceC0875e
    public final AbstractC1186e license() {
        return this.f29818e;
    }

    @Override // defpackage.AbstractC12082e
    /* renamed from: premium */
    public final AbstractC10226e admob(C13520e c13520e) {
        return new C15050e(this.f29819e, this.f29818e);
    }

    @Override // defpackage.AbstractC12082e, defpackage.AbstractC15728e
    public final AbstractC15728e signatures(C13520e c13520e) {
        return new C15050e(this.f29819e, this.f29818e);
    }

    @Override // defpackage.InterfaceC0875e
    public final AbstractC15728e startapp() {
        return this.f29819e;
    }

    @Override // defpackage.AbstractC12082e
    public final AbstractC12082e subs(AbstractC10226e abstractC10226e) {
        return new C15050e(abstractC10226e, this.f29818e);
    }

    @Override // defpackage.AbstractC10226e
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f29818e + ")] " + this.f29819e;
    }
}
