package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۛ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11273e implements InterfaceC12504e, InterfaceC9479e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f22647e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4275e f22648e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22649e;

    public /* synthetic */ C11273e(C4275e c4275e, boolean z, int i) {
        this.f22649e = i;
        this.f22648e = c4275e;
        this.f22647e = z;
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
        switch (this.f22649e) {
            case 0:
                interfaceC8524e.firebase(this.f22648e.admob.pro, this.f22647e);
                return;
            default:
                interfaceC8524e.firebase(this.f22648e.admob.pro, this.f22647e);
                return;
        }
    }

    @Override // defpackage.InterfaceC9479e
    public void metrica(InterfaceC3001e interfaceC3001e, int i) {
        switch (this.f22649e) {
            case 1:
                interfaceC3001e.mo979e(this.f22648e.metrica, i, this.f22647e);
                return;
            case 2:
                interfaceC3001e.mo969e(this.f22648e.metrica, i, this.f22647e);
                return;
            default:
                interfaceC3001e.mo976e(this.f22648e.metrica, i, this.f22647e);
                return;
        }
    }
}
