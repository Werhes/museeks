package defpackage;

import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9628e implements InterfaceC7805e {
    public final /* synthetic */ AppActivity ad;

    public C9628e(AppActivity appActivity) {
        this.ad = appActivity;
    }

    @Override // defpackage.InterfaceC7805e
    public final void ad() {
        AppActivity appActivity = this.ad;
        AbstractC12346e loadAd = appActivity.loadAd();
        loadAd.license();
        ((C3168e) appActivity.f31251e.f12439e).isPro("androidx:appcompat");
        loadAd.purchase();
    }
}
