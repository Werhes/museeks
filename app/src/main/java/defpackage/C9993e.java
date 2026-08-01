package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9993e implements InterfaceC12179e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f19720e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19721e;

    public /* synthetic */ C9993e(int i, Object obj) {
        this.f19721e = i;
        this.f19720e = obj;
    }

    @Override // defpackage.InterfaceC12179e
    public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
        switch (this.f19721e) {
            case 0:
                C3560e c3560e = (C3560e) this.f19720e;
                if (enumC14621e == EnumC14621e.ON_START) {
                    c3560e.metrica = true;
                    return;
                } else {
                    if (enumC14621e == EnumC14621e.ON_STOP) {
                        c3560e.metrica = false;
                        return;
                    }
                    return;
                }
            default:
                AbstractC5133e abstractC5133e = (AbstractC5133e) this.f19720e;
                if (enumC14621e == EnumC14621e.ON_DESTROY) {
                    abstractC5133e.appmetrica();
                    return;
                }
                return;
        }
    }
}
