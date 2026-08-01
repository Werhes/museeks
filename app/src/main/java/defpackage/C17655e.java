package defpackage;

import android.app.Activity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘ۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17655e extends AbstractRunnableC4951e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34607e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C8374e f34608e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Activity f34609e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17655e(C8374e c8374e, Activity activity, int i) {
        super((C17768e) c8374e.f17137e, true);
        this.f34607e = i;
        switch (i) {
            case 1:
                this.f34609e = activity;
                this.f34608e = c8374e;
                super((C17768e) c8374e.f17137e, true);
                return;
            case 2:
                this.f34609e = activity;
                this.f34608e = c8374e;
                super((C17768e) c8374e.f17137e, true);
                return;
            case 3:
                this.f34609e = activity;
                this.f34608e = c8374e;
                super((C17768e) c8374e.f17137e, true);
                return;
            case 4:
                this.f34609e = activity;
                this.f34608e = c8374e;
                super((C17768e) c8374e.f17137e, true);
                return;
            default:
                this.f34609e = activity;
                this.f34608e = c8374e;
                return;
        }
    }

    @Override // defpackage.AbstractRunnableC4951e
    public final void ad() {
        switch (this.f34607e) {
            case 0:
                InterfaceC3741e interfaceC3741e = ((C17768e) this.f34608e.f17137e).purchase;
                AbstractC9528e.startapp(interfaceC3741e);
                interfaceC3741e.onActivityStartedByScionActivityInfo(C4360e.billing(this.f34609e), this.f10472e);
                return;
            case 1:
                InterfaceC3741e interfaceC3741e2 = ((C17768e) this.f34608e.f17137e).purchase;
                AbstractC9528e.startapp(interfaceC3741e2);
                interfaceC3741e2.onActivityResumedByScionActivityInfo(C4360e.billing(this.f34609e), this.f10472e);
                return;
            case 2:
                InterfaceC3741e interfaceC3741e3 = ((C17768e) this.f34608e.f17137e).purchase;
                AbstractC9528e.startapp(interfaceC3741e3);
                interfaceC3741e3.onActivityPausedByScionActivityInfo(C4360e.billing(this.f34609e), this.f10472e);
                return;
            case 3:
                InterfaceC3741e interfaceC3741e4 = ((C17768e) this.f34608e.f17137e).purchase;
                AbstractC9528e.startapp(interfaceC3741e4);
                interfaceC3741e4.onActivityStoppedByScionActivityInfo(C4360e.billing(this.f34609e), this.f10472e);
                return;
            default:
                InterfaceC3741e interfaceC3741e5 = ((C17768e) this.f34608e.f17137e).purchase;
                AbstractC9528e.startapp(interfaceC3741e5);
                interfaceC3741e5.onActivityDestroyedByScionActivityInfo(C4360e.billing(this.f34609e), this.f10472e);
                return;
        }
    }
}
