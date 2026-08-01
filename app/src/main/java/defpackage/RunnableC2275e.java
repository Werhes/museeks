package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2275e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4753e f5765e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5766e;

    public /* synthetic */ RunnableC2275e(C4753e c4753e, int i) {
        this.f5766e = i;
        this.f5765e = c4753e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5766e) {
            case 0:
                AbstractC3062e.amazon().execute(new RunnableC2275e(this.f5765e, 1));
                return;
            default:
                C4753e c4753e = this.f5765e;
                if (c4753e.amazon) {
                    return;
                }
                c4753e.appmetrica();
                return;
        }
    }
}
