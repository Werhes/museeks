package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۧٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C9924e extends AbstractC5397e implements InterfaceC17303e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public InterfaceC11968e f19629e;

    public C9924e(InterfaceC11968e interfaceC11968e) {
        this.f19629e = interfaceC11968e;
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.AbstractC5397e
    /* renamed from: eؒٚۨ */
    public final void mo1899e() {
        super.mo1899e();
        AbstractC1599e.purchase(this);
    }

    @Override // defpackage.AbstractC5397e
    /* renamed from: eٌٔٗ */
    public final InterfaceC11968e mo1900e(InterfaceC11968e interfaceC11968e) {
        return new C15657e(interfaceC11968e, this.f19629e);
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        int license = this.f11558e.license(interfaceC13158e, interfaceC13158e.getLayoutDirection()) - this.f11557e.license(interfaceC13158e, interfaceC13158e.getLayoutDirection());
        int ad = this.f11558e.ad(interfaceC13158e) - this.f11557e.ad(interfaceC13158e);
        int vip = (this.f11558e.vip(interfaceC13158e, interfaceC13158e.getLayoutDirection()) - this.f11557e.vip(interfaceC13158e, interfaceC13158e.getLayoutDirection())) + license;
        int metrica = (this.f11558e.metrica(interfaceC13158e) - this.f11557e.metrica(interfaceC13158e)) + ad;
        AbstractC2832e admob = interfaceC16719e.admob(AbstractC2278e.startapp(-vip, j, -metrica));
        return interfaceC13158e.ads(AbstractC2278e.billing(admob.f6806e + vip, j), AbstractC2278e.purchase(admob.f6804e + metrica, j), C9139e.f18290e, new C7727e(admob, license, ad, 0));
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }
}
