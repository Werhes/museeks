package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1257e extends AbstractRunnableC4951e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3952e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f3953e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C17768e f3954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257e(C17768e c17768e, Exception exc) {
        super(c17768e, false);
        this.f3952e = 3;
        this.f3953e = exc;
        this.f3954e = c17768e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1257e(C17768e c17768e, Object obj, int i) {
        super(c17768e, true);
        this.f3952e = i;
        this.f3953e = obj;
        this.f3954e = c17768e;
    }

    @Override // defpackage.AbstractRunnableC4951e
    public final void ad() {
        switch (this.f3952e) {
            case 0:
                InterfaceC3741e interfaceC3741e = this.f3954e.purchase;
                AbstractC9528e.startapp(interfaceC3741e);
                interfaceC3741e.setUserProperty("fcm", "_ln", new BinderC3838e(this.f3953e), true, this.f10474e);
                return;
            case 1:
                InterfaceC3741e interfaceC3741e2 = this.f3954e.purchase;
                AbstractC9528e.startapp(interfaceC3741e2);
                interfaceC3741e2.setConditionalUserProperty((Bundle) this.f3953e, this.f10474e);
                return;
            case 2:
                InterfaceC3741e interfaceC3741e3 = this.f3954e.purchase;
                AbstractC9528e.startapp(interfaceC3741e3);
                interfaceC3741e3.retrieveAndUploadBatches(new BinderC1335e(this, (RunnableC12554e) this.f3953e));
                return;
            case 3:
                InterfaceC3741e interfaceC3741e4 = this.f3954e.purchase;
                AbstractC9528e.startapp(interfaceC3741e4);
                interfaceC3741e4.logHealthData(5, "Error with data collection. Data lost.", new BinderC3838e((Exception) this.f3953e), new BinderC3838e(null), new BinderC3838e(null));
                return;
            default:
                InterfaceC3741e interfaceC3741e5 = this.f3954e.purchase;
                AbstractC9528e.startapp(interfaceC3741e5);
                interfaceC3741e5.registerOnMeasurementEventListener((BinderC3932e) this.f3953e);
                return;
        }
    }
}
