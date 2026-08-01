package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14023e implements InterfaceC4868e {
    public InterfaceC3958e ad;
    public boolean vip;

    @Override // defpackage.InterfaceC4868e
    public final void ad(Object obj) {
        AbstractC4265e.yandex("SourceStreamRequirementObserver can be updated from main thread only", AbstractC13062e.purchase());
        boolean equals = Boolean.TRUE.equals((Boolean) obj);
        if (this.vip == equals) {
            return;
        }
        this.vip = equals;
        InterfaceC3958e interfaceC3958e = this.ad;
        if (interfaceC3958e == null) {
            AbstractC9464e.yandex("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
        } else if (equals) {
            interfaceC3958e.smaato();
        } else {
            interfaceC3958e.metrica();
        }
    }

    @Override // defpackage.InterfaceC4868e
    public final void onError(Throwable th) {
        AbstractC9464e.pro("VideoCapture", "SourceStreamRequirementObserver#onError", th);
    }

    public final void vip() {
        AbstractC4265e.yandex("SourceStreamRequirementObserver can be closed from main thread only", AbstractC13062e.purchase());
        AbstractC9464e.yandex("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.vip);
        InterfaceC3958e interfaceC3958e = this.ad;
        if (interfaceC3958e == null) {
            AbstractC9464e.yandex("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            return;
        }
        if (this.vip) {
            this.vip = false;
            if (interfaceC3958e != null) {
                interfaceC3958e.metrica();
            } else {
                AbstractC9464e.yandex("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            }
        }
        this.ad = null;
    }
}
