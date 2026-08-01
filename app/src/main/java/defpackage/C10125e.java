package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10125e implements InterfaceC15893e, InterfaceC15039e {
    public final C7988e ad;

    public C10125e(C7988e c7988e) {
        this.ad = c7988e;
    }

    @Override // defpackage.InterfaceC15893e
    public final C7988e ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC15039e
    public final void adcel(int i) {
        amazon(new C15965e(new C12508e(i)));
    }

    @Override // defpackage.InterfaceC15893e
    public final InterfaceC15893e advert() {
        return new C10125e(new C7988e(2));
    }

    public final void amazon(InterfaceC14232e interfaceC14232e) {
        this.ad.premium(interfaceC14232e);
    }

    @Override // defpackage.InterfaceC15039e
    public final void billing() {
        amazon(new C15965e(new C10380e()));
    }

    @Override // defpackage.InterfaceC13522e
    public final /* synthetic */ void license(String str) {
        AbstractC8703e.license(this, str);
    }

    @Override // defpackage.InterfaceC15893e
    public final /* synthetic */ void metrica(String str, Function1 function1) {
        AbstractC8703e.vip(this, str, function1);
    }

    @Override // defpackage.InterfaceC15039e
    public final void mopub(int i) {
        amazon(new C15965e(new C7296e(i)));
    }

    @Override // defpackage.InterfaceC15893e
    public final /* synthetic */ void startapp(Function1[] function1Arr, Function1 function1) {
        AbstractC8703e.ad(this, function1Arr, function1);
    }

    @Override // defpackage.InterfaceC15039e
    public final void yandex(int i) {
        amazon(new C15965e(new C15656e(i)));
    }
}
