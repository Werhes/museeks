package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۧؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC10678e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9610e f21033e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1037e f21034e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21035e;

    public /* synthetic */ RunnableC10678e(AbstractC1037e abstractC1037e, C8928e c8928e, InterfaceC9610e interfaceC9610e, int i) {
        this.f21035e = i;
        this.f21034e = abstractC1037e;
        this.f21033e = interfaceC9610e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21035e) {
            case 0:
                this.f21034e.appmetrica(C8928e.metrica(this.f21033e));
                return;
            default:
                this.f21034e.ad(C8928e.metrica(this.f21033e));
                return;
        }
    }
}
