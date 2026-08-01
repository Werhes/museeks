package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2072e implements InterfaceC15893e, InterfaceC4740e, InterfaceC17257e, InterfaceC15039e {
    public final C7988e ad;

    public C2072e(C7988e c7988e) {
        this.ad = c7988e;
    }

    @Override // defpackage.InterfaceC15893e
    public final C7988e ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC15039e
    public final void adcel(int i) {
        loadAd(new C15965e(new C12508e(i)));
    }

    @Override // defpackage.InterfaceC15893e
    public final InterfaceC15893e advert() {
        return new C2072e(new C7988e(2));
    }

    public final void amazon(InterfaceC14232e interfaceC14232e) {
        this.ad.premium(interfaceC14232e);
    }

    @Override // defpackage.InterfaceC0792e
    public final /* synthetic */ void appmetrica() {
        AbstractC8703e.purchase(this);
    }

    @Override // defpackage.InterfaceC15039e
    public final void billing() {
        loadAd(new C15965e(new C10380e()));
    }

    @Override // defpackage.InterfaceC13522e
    public final /* synthetic */ void license(String str) {
        AbstractC8703e.license(this, str);
    }

    public final void loadAd(InterfaceC14232e interfaceC14232e) {
        this.ad.premium(interfaceC14232e);
    }

    @Override // defpackage.InterfaceC15893e
    public final /* synthetic */ void metrica(String str, Function1 function1) {
        AbstractC8703e.vip(this, str, function1);
    }

    @Override // defpackage.InterfaceC15039e
    public final void mopub(int i) {
        loadAd(new C15965e(new C7296e(i)));
    }

    @Override // defpackage.InterfaceC0792e
    public final void purchase() {
        smaato(new C15965e(new C9047e()));
    }

    @Override // defpackage.InterfaceC4740e
    public final void smaato(C15965e c15965e) {
        amazon(c15965e);
    }

    @Override // defpackage.InterfaceC15893e
    public final /* synthetic */ void startapp(Function1[] function1Arr, Function1 function1) {
        AbstractC8703e.ad(this, function1Arr, function1);
    }

    @Override // defpackage.InterfaceC17257e
    public final void vip() {
        amazon(new C15965e(new C4388e()));
    }

    @Override // defpackage.InterfaceC15039e
    public final void yandex(int i) {
        loadAd(new C15965e(new C15656e(i)));
    }
}
