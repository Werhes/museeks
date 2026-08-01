package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۦٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1466e extends AbstractC14773e implements InterfaceC0875e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final AbstractC1186e f4306e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC14773e f4307e;

    public C1466e(AbstractC14773e abstractC14773e, AbstractC1186e abstractC1186e) {
        super(abstractC14773e.f29222e, abstractC14773e.f29221e);
        this.f4307e = abstractC14773e;
        this.f4306e = abstractC1186e;
    }

    @Override // defpackage.AbstractC1186e
    /* renamed from: admob */
    public final AbstractC1186e signatures(C13520e c13520e) {
        return new C1466e(this.f4307e, this.f4306e);
    }

    @Override // defpackage.AbstractC14773e
    public final String applovin(C8746e c8746e, C8746e c8746e2) {
        C1577e c1577e = c8746e2.ad.smaato;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[11];
        return ((Boolean) c1577e.ad).booleanValue() ? c8746e.m2481final(this.f4306e) : this.f4307e.applovin(c8746e, c8746e2);
    }

    @Override // defpackage.AbstractC14773e
    public final AbstractC10226e isPro() {
        return this.f4307e.isPro();
    }

    @Override // defpackage.AbstractC15728e
    public final AbstractC15728e isVip(C6557e c6557e) {
        return AbstractC10653e.appmetrica(this.f4307e.isVip(c6557e), this.f4306e);
    }

    @Override // defpackage.InterfaceC0875e
    public final AbstractC1186e license() {
        return this.f4306e;
    }

    @Override // defpackage.AbstractC15728e
    public final AbstractC15728e pro(boolean z) {
        return AbstractC10653e.appmetrica(this.f4307e.pro(z), this.f4306e.subscription().pro(z));
    }

    @Override // defpackage.AbstractC15728e
    public final AbstractC15728e signatures(C13520e c13520e) {
        return new C1466e(this.f4307e, this.f4306e);
    }

    @Override // defpackage.InterfaceC0875e
    public final AbstractC15728e startapp() {
        return this.f4307e;
    }

    @Override // defpackage.AbstractC14773e
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f4306e + ")] " + this.f4307e;
    }
}
