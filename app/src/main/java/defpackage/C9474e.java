package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9474e implements InterfaceC12504e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f18816e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C18177e f18817e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18818e;

    public /* synthetic */ C9474e(C18177e c18177e, boolean z, int i) {
        this.f18818e = i;
        this.f18817e = c18177e;
        this.f18816e = z;
    }

    @Override // defpackage.InterfaceC12504e
    public final void invoke(Object obj) {
        switch (this.f18818e) {
            case 0:
                ((InterfaceC3190e) obj).appmetrica(this.f18817e, this.f18816e);
                return;
            case 1:
                ((InterfaceC3190e) obj).metrica(this.f18817e, this.f18816e);
                return;
            case 2:
                ((InterfaceC3190e) obj).ad(this.f18817e, this.f18816e);
                return;
            default:
                InterfaceC3190e interfaceC3190e = (InterfaceC3190e) obj;
                interfaceC3190e.getClass();
                interfaceC3190e.mo1296break(this.f18817e, this.f18816e);
                return;
        }
    }
}
