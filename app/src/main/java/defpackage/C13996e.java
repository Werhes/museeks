package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13996e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public float f27722e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C16330e f27723e;

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
        C16330e c16330e = this.f27723e;
        int round = (c16330e == null || ((Number) c16330e.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) c16330e.getValue()).floatValue() * this.f27722e);
        int adcel = round != Integer.MAX_VALUE ? round : C5602e.adcel(j);
        int startapp = C5602e.startapp(j);
        if (round == Integer.MAX_VALUE) {
            round = C5602e.yandex(j);
        }
        AbstractC2832e admob = interfaceC16719e.admob(AbstractC2278e.ad(adcel, round, startapp, C5602e.billing(j)));
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C4889e(admob, 11));
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
