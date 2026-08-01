package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16434e implements InterfaceC16566e {
    public final AbstractC13270e ad;
    public final Object license = AbstractC18039e.appmetrica(2, new C3411e(4, this));
    public final Map metrica;
    public final C12816e vip;

    public C16434e(AbstractC13270e abstractC13270e, C12816e c12816e, Map map) {
        this.ad = abstractC13270e;
        this.vip = c12816e;
        this.metrica = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC16566e
    public final AbstractC1186e ad() {
        return (AbstractC1186e) this.license.getValue();
    }

    @Override // defpackage.InterfaceC16566e
    public final InterfaceC3054e adcel() {
        return InterfaceC3054e.f7112e;
    }

    @Override // defpackage.InterfaceC16566e
    public final Map advert() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC16566e
    public final C12816e mopub() {
        return this.vip;
    }
}
