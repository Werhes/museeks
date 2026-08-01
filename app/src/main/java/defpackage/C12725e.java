package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12725e extends AbstractC3370e {
    public final AbstractC3370e metrica;
    public final /* synthetic */ int vip;

    public /* synthetic */ C12725e(AbstractC3370e abstractC3370e, int i) {
        this.vip = i;
        this.metrica = abstractC3370e;
    }

    @Override // defpackage.AbstractC3370e
    public boolean ad() {
        switch (this.vip) {
            case 0:
                return this.metrica.ad();
            default:
                return super.ad();
        }
    }

    @Override // defpackage.AbstractC3370e
    public final boolean appmetrica() {
        switch (this.vip) {
            case 0:
                return this.metrica.appmetrica();
            default:
                return this.metrica.appmetrica();
        }
    }

    @Override // defpackage.AbstractC3370e
    public final AbstractC16232e license(AbstractC1186e abstractC1186e) {
        switch (this.vip) {
            case 0:
                AbstractC16232e license = this.metrica.license(abstractC1186e);
                if (license == null) {
                    return null;
                }
                InterfaceC4077e advert = abstractC1186e.loadAd().advert();
                return AbstractC4224e.metrica(license, advert instanceof InterfaceC16046e ? (InterfaceC16046e) advert : null);
            default:
                return this.metrica.license(abstractC1186e);
        }
    }

    @Override // defpackage.AbstractC3370e
    public final InterfaceC2460e metrica(InterfaceC2460e interfaceC2460e) {
        switch (this.vip) {
            case 0:
                return this.metrica.metrica(interfaceC2460e);
            default:
                return this.metrica.metrica(interfaceC2460e);
        }
    }

    @Override // defpackage.AbstractC3370e
    public final AbstractC1186e purchase(int i, AbstractC1186e abstractC1186e) {
        switch (this.vip) {
            case 0:
                return this.metrica.purchase(i, abstractC1186e);
            default:
                return this.metrica.purchase(i, abstractC1186e);
        }
    }

    @Override // defpackage.AbstractC3370e
    public boolean vip() {
        switch (this.vip) {
            case 0:
                return true;
            default:
                return super.vip();
        }
    }
}
