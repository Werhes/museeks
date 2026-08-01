package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5669e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f12047e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public Function2 f12048e;

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
        AbstractC2832e admob = interfaceC16719e.admob(AbstractC2278e.ad(this.f12047e != 1 ? 0 : C5602e.adcel(j), C5602e.yandex(j), this.f12047e == 2 ? C5602e.startapp(j) : 0, C5602e.billing(j)));
        int metrica = AbstractC3062e.metrica(admob.f6806e, C5602e.adcel(j), C5602e.yandex(j));
        int metrica2 = AbstractC3062e.metrica(admob.f6804e, C5602e.startapp(j), C5602e.billing(j));
        return interfaceC13158e.ads(metrica, metrica2, C9139e.f18290e, new C2633e(metrica, metrica2, 3, this, admob, interfaceC13158e));
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
