package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.car.app.hardware.common.CarResultStub;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14559e implements InterfaceC13995e, InterfaceC0771e, InterfaceC9479e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f28769e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f28770e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28771e;

    public /* synthetic */ C14559e(CarResultStub carResultStub, boolean z, C10147e c10147e) {
        this.f28770e = carResultStub;
        this.f28771e = z;
        this.f28769e = c10147e;
    }

    public /* synthetic */ C14559e(Object obj, Object obj2, boolean z) {
        this.f28770e = obj;
        this.f28769e = obj2;
        this.f28771e = z;
    }

    @Override // defpackage.InterfaceC13995e
    public Object ad() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.f28770e).lambda$onCarHardwareResult$0(this.f28771e, (C10147e) this.f28769e);
        return lambda$onCarHardwareResult$0;
    }

    @Override // defpackage.InterfaceC0771e
    public Object advert(C0560e c0560e) {
        return (AbstractC11765e.metrica() && ((Integer) c0560e.adcel()).intValue() == 402) ? C18540e.tapsense((Context) this.f28770e, (Intent) this.f28769e, this.f28771e).billing(new ExecutorC14279e(2), new C12582e(10)) : c0560e;
    }

    @Override // defpackage.InterfaceC9479e
    public void metrica(InterfaceC3001e interfaceC3001e, int i) {
        interfaceC3001e.crashlytics(((C4275e) this.f28770e).metrica, i, ((C3335e) this.f28769e).appmetrica(), this.f28771e);
    }
}
