package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11843e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public InterfaceC12123e f23753e;

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
        float vip = this.f23753e.vip(interfaceC13158e.getLayoutDirection());
        float license = this.f23753e.license();
        float metrica = this.f23753e.metrica(interfaceC13158e.getLayoutDirection());
        float ad = this.f23753e.ad();
        float f = 0;
        if (!((C15765e.ad(ad, f) >= 0) & (C15765e.ad(vip, f) >= 0) & (C15765e.ad(license, f) >= 0) & (C15765e.ad(metrica, f) >= 0))) {
            AbstractC9534e.ad("Padding must be non-negative");
        }
        int mo493e = interfaceC13158e.mo493e(vip);
        int mo493e2 = interfaceC13158e.mo493e(metrica) + mo493e;
        int mo493e3 = interfaceC13158e.mo493e(license);
        int mo493e4 = interfaceC13158e.mo493e(ad) + mo493e3;
        AbstractC2832e admob = interfaceC16719e.admob(AbstractC2278e.startapp(-mo493e2, j, -mo493e4));
        return interfaceC13158e.ads(AbstractC2278e.billing(admob.f6806e + mo493e2, j), AbstractC2278e.purchase(admob.f6804e + mo493e4, j), C9139e.f18290e, new C7727e(admob, mo493e, mo493e3, 3));
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
