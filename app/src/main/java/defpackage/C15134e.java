package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۨۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15134e implements InterfaceC2541e {
    public final C15074e ad;
    public C9508e vip;

    public C15134e(C15074e c15074e) {
        this.ad = c15074e;
    }

    @Override // defpackage.InterfaceC2541e
    public final void ad(C4017e c4017e) {
        C17689e c17689e = new C17689e(24, this);
        C15074e c15074e = this.ad;
        float ad = AbstractC15384e.ad(c15074e);
        boolean z = c15074e.f29835e != null;
        InterfaceC2661e interfaceC2661e = (InterfaceC2661e) AbstractC10432e.vip(c15074e, AbstractC11473e.billing);
        C16446e purchase = AbstractC1798e.purchase(c4017e, c15074e, ad, c15074e.f29847e, c15074e.f29852e);
        if (purchase != null) {
            purchase.billing(z);
            AbstractC1798e.yandex(c4017e, c15074e.f29852e ^ (-9223372034707292160L), C2108e.yandex(ad, c4017e.yandex()), z, new C12439e(c17689e, purchase, 17));
            interfaceC2661e.ad(purchase);
        }
    }

    @Override // defpackage.InterfaceC2541e
    public final /* bridge */ void vip() {
    }
}
