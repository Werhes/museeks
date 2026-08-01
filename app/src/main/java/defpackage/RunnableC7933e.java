package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7933e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9610e f16067e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1926e f16068e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16069e;

    public /* synthetic */ RunnableC7933e(InterfaceC1926e interfaceC1926e, InterfaceC9610e interfaceC9610e, int i) {
        this.f16069e = i;
        this.f16068e = interfaceC1926e;
        this.f16067e = interfaceC9610e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16069e) {
            case 0:
                this.f16068e.Signature(this.f16067e);
                return;
            case 1:
                this.f16068e.advert(this.f16067e);
                return;
            default:
                this.f16068e.subs(this.f16067e);
                return;
        }
    }
}
