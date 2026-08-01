package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۦٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6058e extends AbstractRunnableC4951e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f12734e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C17768e f12735e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ BinderC7948e f12736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6058e(C17768e c17768e, BinderC7948e binderC7948e, int i) {
        super(c17768e, true);
        this.f12734e = i;
        switch (i) {
            case 1:
                this.f12736e = binderC7948e;
                Objects.requireNonNull(c17768e);
                this.f12735e = c17768e;
                super(c17768e, true);
                return;
            case 2:
                this.f12736e = binderC7948e;
                Objects.requireNonNull(c17768e);
                this.f12735e = c17768e;
                super(c17768e, true);
                return;
            default:
                this.f12736e = binderC7948e;
                Objects.requireNonNull(c17768e);
                this.f12735e = c17768e;
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6058e(C17768e c17768e, BinderC7948e binderC7948e, int i, boolean z) {
        super(c17768e, true);
        this.f12734e = i;
        this.f12736e = binderC7948e;
        this.f12735e = c17768e;
    }

    @Override // defpackage.AbstractRunnableC4951e
    public final void ad() {
        switch (this.f12734e) {
            case 0:
                InterfaceC3741e interfaceC3741e = this.f12735e.purchase;
                AbstractC9528e.startapp(interfaceC3741e);
                interfaceC3741e.getGmpAppId(this.f12736e);
                return;
            case 1:
                InterfaceC3741e interfaceC3741e2 = this.f12735e.purchase;
                AbstractC9528e.startapp(interfaceC3741e2);
                interfaceC3741e2.getCachedAppInstanceId(this.f12736e);
                return;
            case 2:
                InterfaceC3741e interfaceC3741e3 = this.f12735e.purchase;
                AbstractC9528e.startapp(interfaceC3741e3);
                interfaceC3741e3.generateEventId(this.f12736e);
                return;
            case 3:
                InterfaceC3741e interfaceC3741e4 = this.f12735e.purchase;
                AbstractC9528e.startapp(interfaceC3741e4);
                interfaceC3741e4.getCurrentScreenName(this.f12736e);
                return;
            default:
                InterfaceC3741e interfaceC3741e5 = this.f12735e.purchase;
                AbstractC9528e.startapp(interfaceC3741e5);
                interfaceC3741e5.getCurrentScreenClass(this.f12736e);
                return;
        }
    }

    @Override // defpackage.AbstractRunnableC4951e
    public final void vip() {
        switch (this.f12734e) {
            case 0:
                this.f12736e.tapsense(null);
                return;
            case 1:
                this.f12736e.tapsense(null);
                return;
            case 2:
                this.f12736e.tapsense(null);
                return;
            case 3:
                this.f12736e.tapsense(null);
                return;
            default:
                this.f12736e.tapsense(null);
                return;
        }
    }
}
