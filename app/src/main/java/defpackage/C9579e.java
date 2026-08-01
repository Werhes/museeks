package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٛٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9579e extends AbstractC12082e implements InterfaceC6346e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC10226e f19012e;

    public C9579e(AbstractC10226e abstractC10226e) {
        this.f19012e = abstractC10226e;
    }

    @Override // defpackage.AbstractC12082e, defpackage.AbstractC1186e
    public final boolean Signature() {
        return false;
    }

    @Override // defpackage.AbstractC12082e
    public final AbstractC10226e ads() {
        return this.f19012e;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: applovin */
    public final AbstractC10226e isVip(C6557e c6557e) {
        return new C9579e(this.f19012e.isVip(c6557e));
    }

    @Override // defpackage.InterfaceC6346e
    public final boolean billing() {
        return true;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: isPro */
    public final AbstractC10226e pro(boolean z) {
        return z ? this.f19012e.pro(true) : this;
    }

    @Override // defpackage.AbstractC10226e, defpackage.AbstractC15728e
    public final AbstractC15728e isVip(C6557e c6557e) {
        return new C9579e(this.f19012e.isVip(c6557e));
    }

    @Override // defpackage.InterfaceC6346e
    public final AbstractC15728e purchase(AbstractC1186e abstractC1186e) {
        AbstractC15728e subscription = abstractC1186e.subscription();
        if (!AbstractC11957e.purchase(subscription) && !AbstractC11957e.appmetrica(subscription)) {
            return subscription;
        }
        if (subscription instanceof AbstractC10226e) {
            AbstractC10226e abstractC10226e = (AbstractC10226e) subscription;
            AbstractC10226e pro = abstractC10226e.pro(false);
            return !AbstractC11957e.purchase(abstractC10226e) ? pro : new C9579e(pro);
        }
        if (!(subscription instanceof AbstractC14773e)) {
            throw new C14803e(10);
        }
        AbstractC14773e abstractC14773e = (AbstractC14773e) subscription;
        AbstractC10226e abstractC10226e2 = abstractC14773e.f29222e;
        AbstractC10226e pro2 = abstractC10226e2.pro(false);
        if (AbstractC11957e.purchase(abstractC10226e2)) {
            pro2 = new C9579e(pro2);
        }
        AbstractC10226e abstractC10226e3 = abstractC14773e.f29221e;
        AbstractC10226e pro3 = abstractC10226e3.pro(false);
        if (AbstractC11957e.purchase(abstractC10226e3)) {
            pro3 = new C9579e(pro3);
        }
        return AbstractC10653e.appmetrica(AbstractC1596e.ad(pro2, pro3), AbstractC10653e.vip(subscription));
    }

    @Override // defpackage.AbstractC12082e
    public final AbstractC12082e subs(AbstractC10226e abstractC10226e) {
        return new C9579e(abstractC10226e);
    }
}
