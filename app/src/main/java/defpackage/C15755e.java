package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15755e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public float f31025e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public float f31026e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public float f31027e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public float f31028e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f31029e;

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        int mo493e = interfaceC13158e.mo493e(this.f31026e) + interfaceC13158e.mo493e(this.f31027e);
        int mo493e2 = interfaceC13158e.mo493e(this.f31025e) + interfaceC13158e.mo493e(this.f31028e);
        AbstractC2832e admob = interfaceC16719e.admob(AbstractC2278e.startapp(-mo493e, j, -mo493e2));
        return interfaceC13158e.ads(AbstractC2278e.billing(admob.f6806e + mo493e, j), AbstractC2278e.purchase(admob.f6804e + mo493e2, j), C9139e.f18290e, new C10869e(this, admob, 21));
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
