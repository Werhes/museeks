package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16602e extends C10756e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ ServiceC13230e f32563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16602e(ServiceC13230e serviceC13230e) {
        super(serviceC13230e);
        this.f32563e = serviceC13230e;
    }

    @Override // defpackage.C11467e
    public final C18287e isVip() {
        ServiceC13230e serviceC13230e = this.f32563e;
        C17684e c17684e = serviceC13230e.f26259e;
        if (c17684e == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        if (c17684e != serviceC13230e.f26250e) {
            return c17684e.license;
        }
        C4363e c4363e = (C4363e) this.f23070e;
        c4363e.getClass();
        return new C18287e(c4363e.getCurrentBrowserInfo());
    }
}
