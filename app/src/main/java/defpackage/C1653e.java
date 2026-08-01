package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1653e extends AbstractRunnableC4951e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ String f4582e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ BinderC7948e f4583e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C17768e f4584e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4585e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ String f4586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1653e(C17768e c17768e, String str, String str2, boolean z, BinderC7948e binderC7948e) {
        super(c17768e, true);
        this.f4582e = str;
        this.f4586e = str2;
        this.f4585e = z;
        this.f4583e = binderC7948e;
        this.f4584e = c17768e;
    }

    @Override // defpackage.AbstractRunnableC4951e
    public final void ad() {
        InterfaceC3741e interfaceC3741e = this.f4584e.purchase;
        AbstractC9528e.startapp(interfaceC3741e);
        interfaceC3741e.getUserProperties(this.f4582e, this.f4586e, this.f4585e, this.f4583e);
    }

    @Override // defpackage.AbstractRunnableC4951e
    public final void vip() {
        this.f4583e.tapsense(null);
    }
}
