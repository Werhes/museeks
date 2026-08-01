package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٛۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1941e implements InterfaceC12504e, InterfaceC8427e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f5138e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5139e;

    public /* synthetic */ C1941e(boolean z, int i) {
        this.f5139e = i;
        this.f5138e = z;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        switch (this.f5139e) {
            case 4:
                ((C6268e) obj).mo2123e(this.f5138e);
                return;
            case 5:
                ((C6268e) obj).mo2086e(this.f5138e);
                return;
            default:
                ((C6268e) obj).mo2130native(this.f5138e);
                return;
        }
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        switch (this.f5139e) {
            case 0:
                ((InterfaceC8524e) obj).mo1500throw(this.f5138e);
                return;
            case 1:
                ((InterfaceC8524e) obj).isVip(this.f5138e);
                return;
            case 2:
                ((InterfaceC8524e) obj).mo1500throw(this.f5138e);
                return;
            default:
                ((InterfaceC8524e) obj).isVip(this.f5138e);
                return;
        }
    }
}
