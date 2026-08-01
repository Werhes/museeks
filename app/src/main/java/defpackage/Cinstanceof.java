package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: instanceof, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cinstanceof extends AbstractC12082e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC10226e f36405e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC10226e f36406e;

    public Cinstanceof(AbstractC10226e abstractC10226e, AbstractC10226e abstractC10226e2) {
        this.f36406e = abstractC10226e;
        this.f36405e = abstractC10226e2;
    }

    @Override // defpackage.AbstractC12082e, defpackage.AbstractC1186e
    /* renamed from: admob */
    public final AbstractC1186e signatures(C13520e c13520e) {
        return new Cinstanceof(this.f36406e, this.f36405e);
    }

    @Override // defpackage.AbstractC12082e
    public final AbstractC10226e ads() {
        return this.f36406e;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: applovin */
    public final AbstractC10226e isVip(C6557e c6557e) {
        return new Cinstanceof(this.f36406e.isVip(c6557e), this.f36405e);
    }

    @Override // defpackage.AbstractC10226e, defpackage.AbstractC15728e
    /* renamed from: firebase, reason: merged with bridge method [inline-methods] */
    public final Cinstanceof pro(boolean z) {
        return new Cinstanceof(this.f36406e.pro(z), this.f36405e.pro(z));
    }

    @Override // defpackage.AbstractC12082e
    /* renamed from: premium */
    public final AbstractC10226e admob(C13520e c13520e) {
        return new Cinstanceof(this.f36406e, this.f36405e);
    }

    @Override // defpackage.AbstractC12082e, defpackage.AbstractC15728e
    public final AbstractC15728e signatures(C13520e c13520e) {
        return new Cinstanceof(this.f36406e, this.f36405e);
    }

    @Override // defpackage.AbstractC12082e
    public final AbstractC12082e subs(AbstractC10226e abstractC10226e) {
        return new Cinstanceof(abstractC10226e, this.f36405e);
    }
}
