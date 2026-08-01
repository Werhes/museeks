package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6156e implements InterfaceC1722e {
    public static final /* synthetic */ InterfaceC8614e[] appmetrica = {AbstractC3820e.ad.purchase(new C13506e(C6156e.class, "isEnabled", "isEnabled()Z", 0))};
    public final InterfaceC1722e ad;
    public final C1577e license;
    public final C11887e metrica;
    public final C4850e vip;

    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Set, java.lang.Object] */
    public C6156e(InterfaceC1722e interfaceC1722e, boolean z, int i) {
        C4850e c4850e = new C4850e();
        this.ad = interfaceC1722e;
        this.vip = c4850e;
        int i2 = 0;
        int i3 = 1;
        C11053e c11053e = new C11053e(i3, c4850e, C4850e.class, "startPredictiveBack", "startPredictiveBack(Lcom/arkivanov/essenty/backhandler/BackEvent;)Z", 8, i2);
        int i4 = 0;
        C2098e c2098e = new C2098e(i3, c4850e, C4850e.class, "progressPredictiveBack", "progressPredictiveBack(Lcom/arkivanov/essenty/backhandler/BackEvent;)V", i4, i2, 11);
        int i5 = 0;
        this.metrica = new C11887e(false, i, c11053e, c2098e, new C17011e(i5, c4850e, C4850e.class, "cancelPredictiveBack", "cancelPredictiveBack()V", i4, i2, 17), new C16604e(i5, c4850e, C4850e.class, "back", "back()Z", 8, 1));
        this.license = new C1577e(Boolean.valueOf(z), this, 1);
        c4850e.metrica = AbstractC4511e.Signature(c4850e.metrica, new C10739e(11, this));
    }

    @Override // defpackage.InterfaceC1722e
    public final void ad(C11887e c11887e) {
        this.vip.ad(c11887e);
    }

    public final void appmetrica() {
        InterfaceC1722e interfaceC1722e = this.ad;
        C11887e c11887e = this.metrica;
        if (interfaceC1722e.vip(c11887e)) {
            interfaceC1722e.metrica(c11887e);
        }
    }

    public final void license() {
        InterfaceC1722e interfaceC1722e = this.ad;
        C11887e c11887e = this.metrica;
        if (interfaceC1722e.vip(c11887e)) {
            return;
        }
        interfaceC1722e.ad(c11887e);
    }

    @Override // defpackage.InterfaceC1722e
    public final void metrica(C11887e c11887e) {
        this.vip.metrica(c11887e);
    }

    public final void purchase() {
        InterfaceC8614e interfaceC8614e = appmetrica[0];
        this.metrica.metrica.metrica(C11887e.yandex[0], Boolean.valueOf(((Boolean) this.license.ad).booleanValue() && this.vip.appmetrica()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.InterfaceC1722e
    public final boolean vip(C11887e c11887e) {
        return this.vip.ad.contains(c11887e);
    }
}
