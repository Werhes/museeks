package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ۠ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15004e implements InterfaceC15893e, InterfaceC4740e, InterfaceC17257e {
    public final /* synthetic */ int ad;
    public final C7988e vip;

    public /* synthetic */ C15004e(C7988e c7988e, int i) {
        this.ad = i;
        this.vip = c7988e;
    }

    @Override // defpackage.InterfaceC15893e
    public final C7988e ad() {
        switch (this.ad) {
            case 0:
                return this.vip;
            default:
                return this.vip;
        }
    }

    @Override // defpackage.InterfaceC15893e
    public final InterfaceC15893e advert() {
        switch (this.ad) {
            case 0:
                return new C15004e(new C7988e(2), 0);
            default:
                return new C15004e(new C7988e(2), 1);
        }
    }

    public void amazon(InterfaceC14232e interfaceC14232e) {
        this.vip.premium(interfaceC14232e);
    }

    @Override // defpackage.InterfaceC0792e
    public final /* synthetic */ void appmetrica() {
        int i = this.ad;
        AbstractC8703e.purchase(this);
    }

    @Override // defpackage.InterfaceC13522e
    public final /* synthetic */ void license(String str) {
        int i = this.ad;
        AbstractC8703e.license(this, str);
    }

    @Override // defpackage.InterfaceC15893e
    public final /* synthetic */ void metrica(String str, Function1 function1) {
        int i = this.ad;
        AbstractC8703e.vip(this, str, function1);
    }

    @Override // defpackage.InterfaceC0792e
    public final void purchase() {
        C15965e c15965e;
        switch (this.ad) {
            case 0:
                c15965e = new C15965e(new C9047e());
                break;
            default:
                c15965e = new C15965e(new C9047e());
                break;
        }
        smaato(c15965e);
    }

    @Override // defpackage.InterfaceC4740e
    public final void smaato(C15965e c15965e) {
        switch (this.ad) {
            case 0:
                amazon(c15965e);
                return;
            default:
                this.vip.premium(c15965e);
                return;
        }
    }

    @Override // defpackage.InterfaceC15893e
    public final /* synthetic */ void startapp(Function1[] function1Arr, Function1 function1) {
        int i = this.ad;
        AbstractC8703e.ad(this, function1Arr, function1);
    }

    @Override // defpackage.InterfaceC17257e
    public void vip() {
        amazon(new C15965e(new C4388e()));
    }
}
