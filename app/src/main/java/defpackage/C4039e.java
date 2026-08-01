package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4039e extends AbstractC14049e {
    public final C11106e ad;
    public final C0576e metrica;
    public final C0576e vip;

    public C4039e(C11106e c11106e, C0404e c0404e, C0763e c0763e) {
        this.ad = c11106e;
        this.vip = AbstractC14533e.startapp(c0404e);
        this.metrica = AbstractC14533e.startapp(c0763e);
    }

    @Override // defpackage.AbstractC14049e
    public final AbstractC14049e ad(C7589e c7589e, C0404e c0404e, long j, long j2, long j3) {
        C0576e c0576e = this.vip;
        AbstractC6494e.vip(this.ad, j, j2, j3, !AbstractC7890e.billing((C0404e) c0576e.getValue(), c0404e));
        c0576e.setValue(c0404e);
        return this;
    }

    @Override // defpackage.AbstractC14049e
    public final C11106e appmetrica() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14049e
    public final AbstractC14049e billing(C0404e c0404e) {
        return this;
    }

    @Override // defpackage.AbstractC14049e
    public final boolean license() {
        return true;
    }

    @Override // defpackage.AbstractC14049e
    public final C0763e metrica() {
        return (C0763e) this.metrica.getValue();
    }

    @Override // defpackage.AbstractC14049e
    public final void startapp(C0763e c0763e) {
        this.metrica.setValue(c0763e);
    }

    @Override // defpackage.AbstractC14049e
    public final AbstractC14049e yandex() {
        C11106e c11106e = this.ad;
        AbstractC18489e.billing(C2152e.startapp(((C2152e) ((C0576e) c11106e.f22006e).getValue()).ad, ((C2152e) ((C0576e) c11106e.f22009e).getValue()).ad), ((C2108e) ((C0576e) c11106e.f22008e).getValue()).ad);
        C16223e c16223e = ((C0404e) this.vip.getValue()).f2444e;
        C0576e c0576e = c16223e.f31882e;
        C8009e c8009e = (C8009e) ((C9185e) c0576e.getValue()).vip.getValue();
        InterfaceC0043e interfaceC0043e = c16223e.appmetrica().vip.f27006e;
        if (interfaceC0043e == null) {
            throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        }
        AbstractC8116e.startapp(interfaceC0043e.advert());
        c8009e.getClass();
        return C4471e.ad;
    }
}
