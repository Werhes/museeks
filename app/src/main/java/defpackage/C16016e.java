package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16016e implements InterfaceC9479e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C1962e f31545e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4275e f31546e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31547e;

    public /* synthetic */ C16016e(C4275e c4275e, C1962e c1962e, int i) {
        this.f31547e = i;
        this.f31546e = c4275e;
        this.f31545e = c1962e;
    }

    @Override // defpackage.InterfaceC9479e
    public final void metrica(InterfaceC3001e interfaceC3001e, int i) {
        switch (this.f31547e) {
            case 0:
                C4275e c4275e = this.f31546e;
                interfaceC3001e.mo945e(c4275e.metrica, i, this.f31545e.metrica(c4275e.tapsense(), true), true);
                return;
            default:
                C4275e c4275e2 = this.f31546e;
                interfaceC3001e.mo958e(c4275e2.metrica, i, this.f31545e.metrica(c4275e2.tapsense(), true));
                return;
        }
    }
}
