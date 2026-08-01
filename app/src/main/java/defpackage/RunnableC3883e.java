package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؕۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3883e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f8710e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8598e f8711e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ String f8712e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8713e;

    public /* synthetic */ RunnableC3883e(C8598e c8598e, long j, String str, int i) {
        this.f8713e = i;
        this.f8711e = c8598e;
        this.f8710e = j;
        this.f8712e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8713e) {
            case 0:
                C8598e c8598e = this.f8711e;
                ((ExecutorC4614e) c8598e.loadAd.f25750e).ad(new RunnableC3883e(c8598e, this.f8710e, this.f8712e, 1));
                return;
            default:
                C4594e c4594e = this.f8711e.billing;
                C17707e c17707e = c4594e.amazon;
                if (c17707e == null || !c17707e.appmetrica.get()) {
                    ((InterfaceC5974e) c4594e.startapp.f33136e).billing(this.f8710e, this.f8712e);
                    return;
                }
                return;
        }
    }
}
