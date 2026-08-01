package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؐؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14423e extends AbstractC12082e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC10226e f28519e;

    public AbstractC14423e(AbstractC10226e abstractC10226e) {
        this.f28519e = abstractC10226e;
    }

    @Override // defpackage.AbstractC12082e
    public final AbstractC10226e ads() {
        return this.f28519e;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: applovin */
    public final AbstractC10226e isVip(C6557e c6557e) {
        return c6557e != smaato() ? new C13369e(this, c6557e) : this;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: isPro */
    public final AbstractC10226e pro(boolean z) {
        return z == Signature() ? this : this.f28519e.pro(z).isVip(smaato());
    }
}
