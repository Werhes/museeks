package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٞۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5063e implements InterfaceC12179e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f10885e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f10886e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10887e;

    public /* synthetic */ C5063e(Object obj, Object obj2, int i) {
        this.f10887e = i;
        this.f10886e = obj;
        this.f10885e = obj2;
    }

    @Override // defpackage.InterfaceC12179e
    public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
        switch (this.f10887e) {
            case 0:
                AbstractActivityC15824e.startapp((C6194e) this.f10886e, (AbstractActivityC15824e) this.f10885e, enumC14621e);
                return;
            default:
                EnumC14621e enumC14621e2 = (EnumC14621e) this.f10886e;
                C8791e c8791e = (C8791e) this.f10885e;
                if (enumC14621e != enumC14621e2 || AbstractC7890e.billing(c8791e.appmetrica(), C3214e.ad)) {
                    return;
                }
                c8791e.license.setValue(c8791e.ad());
                return;
        }
    }
}
