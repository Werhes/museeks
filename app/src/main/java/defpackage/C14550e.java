package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14550e extends AbstractC3370e {
    public final AbstractC3370e metrica;
    public final AbstractC3370e vip;

    public C14550e(AbstractC3370e abstractC3370e, AbstractC3370e abstractC3370e2) {
        this.vip = abstractC3370e;
        this.metrica = abstractC3370e2;
    }

    @Override // defpackage.AbstractC3370e
    public final boolean ad() {
        return this.vip.ad() || this.metrica.ad();
    }

    @Override // defpackage.AbstractC3370e
    public final AbstractC16232e license(AbstractC1186e abstractC1186e) {
        AbstractC16232e license = this.vip.license(abstractC1186e);
        return license == null ? this.metrica.license(abstractC1186e) : license;
    }

    @Override // defpackage.AbstractC3370e
    public final InterfaceC2460e metrica(InterfaceC2460e interfaceC2460e) {
        return this.metrica.metrica(this.vip.metrica(interfaceC2460e));
    }

    @Override // defpackage.AbstractC3370e
    public final AbstractC1186e purchase(int i, AbstractC1186e abstractC1186e) {
        return this.metrica.purchase(i, this.vip.purchase(i, abstractC1186e));
    }

    @Override // defpackage.AbstractC3370e
    public final boolean vip() {
        return this.vip.vip() || this.metrica.vip();
    }
}
