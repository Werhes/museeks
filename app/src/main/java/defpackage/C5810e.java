package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5810e extends AbstractC14773e implements InterfaceC6346e {
    @Override // defpackage.AbstractC1186e
    /* renamed from: admob */
    public final AbstractC1186e signatures(C13520e c13520e) {
        return new AbstractC14773e(this.f29222e, this.f29221e);
    }

    @Override // defpackage.AbstractC14773e
    public final String applovin(C8746e c8746e, C8746e c8746e2) {
        boolean amazon = c8746e2.ad.amazon();
        AbstractC10226e abstractC10226e = this.f29221e;
        AbstractC10226e abstractC10226e2 = this.f29222e;
        if (!amazon) {
            return c8746e.firebase(c8746e.m2481final(abstractC10226e2), c8746e.m2481final(abstractC10226e), loadAd().amazon());
        }
        return "(" + c8746e.m2481final(abstractC10226e2) + ".." + c8746e.m2481final(abstractC10226e) + ')';
    }

    @Override // defpackage.InterfaceC6346e
    public final boolean billing() {
        AbstractC10226e abstractC10226e = this.f29222e;
        return (abstractC10226e.loadAd().advert() instanceof InterfaceC16046e) && AbstractC7890e.billing(abstractC10226e.loadAd(), this.f29221e.loadAd());
    }

    @Override // defpackage.AbstractC14773e
    public final AbstractC10226e isPro() {
        return this.f29222e;
    }

    @Override // defpackage.AbstractC15728e
    public final AbstractC15728e isVip(C6557e c6557e) {
        return AbstractC1596e.ad(this.f29222e.isVip(c6557e), this.f29221e.isVip(c6557e));
    }

    @Override // defpackage.AbstractC15728e
    public final AbstractC15728e pro(boolean z) {
        return AbstractC1596e.ad(this.f29222e.pro(z), this.f29221e.pro(z));
    }

    @Override // defpackage.InterfaceC6346e
    public final AbstractC15728e purchase(AbstractC1186e abstractC1186e) {
        AbstractC15728e ad;
        AbstractC15728e subscription = abstractC1186e.subscription();
        if (subscription instanceof AbstractC14773e) {
            ad = subscription;
        } else {
            if (!(subscription instanceof AbstractC10226e)) {
                throw new C14803e(10);
            }
            AbstractC10226e abstractC10226e = (AbstractC10226e) subscription;
            ad = AbstractC1596e.ad(abstractC10226e, abstractC10226e.pro(true));
        }
        return AbstractC10653e.appmetrica(ad, AbstractC10653e.vip(subscription));
    }

    @Override // defpackage.AbstractC15728e
    public final AbstractC15728e signatures(C13520e c13520e) {
        return new AbstractC14773e(this.f29222e, this.f29221e);
    }

    @Override // defpackage.AbstractC14773e
    public final String toString() {
        return "(" + this.f29222e + ".." + this.f29221e + ')';
    }
}
