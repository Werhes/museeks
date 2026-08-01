package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16821e extends AbstractC13616e implements InterfaceC1683e, InterfaceC17303e {
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
        boolean z = this.f27016e && ((Boolean) AbstractC10432e.vip(this, AbstractC12527e.ad)).booleanValue();
        long j2 = AbstractC12527e.vip;
        AbstractC2832e admob = interfaceC16719e.admob(j);
        int max = z ? Math.max(admob.f6806e, interfaceC13158e.mo493e(C16109e.vip(j2))) : admob.f6806e;
        int max2 = z ? Math.max(admob.f6804e, interfaceC13158e.mo493e(C16109e.ad(j2))) : admob.f6804e;
        return interfaceC13158e.ads(max, max2, C9139e.f18290e, new C7727e(max, admob, max2, 2));
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
