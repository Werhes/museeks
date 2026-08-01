package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14229e implements InterfaceC12504e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ String f28112e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C18177e f28113e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28114e;

    public /* synthetic */ C14229e(C18177e c18177e, String str, int i) {
        this.f28114e = i;
        this.f28113e = c18177e;
        this.f28112e = str;
    }

    public /* synthetic */ C14229e(C18177e c18177e, String str, long j, long j2, int i) {
        this.f28114e = i;
        this.f28113e = c18177e;
        this.f28112e = str;
    }

    @Override // defpackage.InterfaceC12504e
    public final void invoke(Object obj) {
        switch (this.f28114e) {
            case 0:
                InterfaceC3190e interfaceC3190e = (InterfaceC3190e) obj;
                interfaceC3190e.getClass();
                interfaceC3190e.billing(this.f28113e, this.f28112e);
                return;
            case 1:
                ((InterfaceC3190e) obj).ads(this.f28113e, this.f28112e);
                return;
            case 2:
                InterfaceC3190e interfaceC3190e2 = (InterfaceC3190e) obj;
                interfaceC3190e2.getClass();
                interfaceC3190e2.mo1307protected(this.f28113e, this.f28112e);
                return;
            default:
                ((InterfaceC3190e) obj).license(this.f28113e, this.f28112e);
                return;
        }
    }
}
