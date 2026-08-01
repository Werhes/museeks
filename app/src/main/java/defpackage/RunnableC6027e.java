package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۤٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6027e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C12318e f12694e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4187e f12695e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12696e;

    public /* synthetic */ RunnableC6027e(C4187e c4187e, C12318e c12318e, int i) {
        this.f12696e = i;
        this.f12695e = c4187e;
        this.f12694e = c12318e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12696e) {
            case 0:
                C4187e c4187e = this.f12695e;
                C12318e c12318e = this.f12694e;
                c4187e.f9226e = c12318e;
                if (c4187e.f9224e) {
                    c4187e.smaato(c12318e);
                }
                c4187e.ad(new RunnableC6027e(c4187e, c12318e, 1), new ExecutorC17160e(3, c4187e));
                return;
            default:
                C4187e c4187e2 = this.f12695e;
                C12318e c12318e2 = this.f12694e;
                if (c4187e2.f2776e instanceof C8973e) {
                    c12318e2.release();
                    return;
                }
                return;
        }
    }
}
