package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۚۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11981e implements InterfaceC5779e {
    public final /* synthetic */ C7315e license;
    public boolean metrica;
    public final C15816e ad = new C15816e(19, this);
    public final C11669e vip = new C11669e(65536);

    public C11981e(C7315e c7315e) {
        this.license = c7315e;
    }

    @Override // defpackage.InterfaceC5779e
    public final void ad(AbstractC3317e abstractC3317e, AbstractC6690e abstractC6690e) {
        C7315e c7315e = this.license;
        c7315e.f14978e = abstractC6690e;
        if (this.metrica) {
            return;
        }
        this.metrica = true;
        InterfaceC14239e vip = abstractC3317e.vip(new C18208e(abstractC6690e.advert(0)), this.vip, 0L);
        c7315e.f14976e = vip;
        vip.smaato(this.ad, 0L);
    }
}
