package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916e {
    public final C16330e ad = new C16330e(0);
    public final C16330e vip = new C16330e(0);
    public final C0576e metrica = AbstractC14533e.startapp(AbstractC7893e.metrica(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 65535));
    public final C0576e license = AbstractC14533e.startapp(Boolean.FALSE);

    public final float ad(C13770e c13770e) {
        return ((InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex)).mo496final(this.vip.purchase());
    }

    public final C13364e appmetrica(C13770e c13770e) {
        return AbstractC15842e.billing(0.0f, metrica(c13770e), 0.0f, 13);
    }

    public final C13364e license(C13770e c13770e) {
        return AbstractC15842e.billing(0.0f, 0.0f, ad(c13770e), 7);
    }

    public final float metrica(C13770e c13770e) {
        return ((InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex)).mo496final(this.ad.purchase());
    }

    public final C16005e vip(C13770e c13770e) {
        return AbstractC12220e.appmetrica(0.0f, 0.0f, 0.0f, ad(c13770e), 7);
    }
}
