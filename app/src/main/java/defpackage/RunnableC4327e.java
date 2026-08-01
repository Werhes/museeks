package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۘ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4327e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6122e f9461e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9462e;

    public /* synthetic */ RunnableC4327e(C6122e c6122e, int i) {
        this.f9462e = i;
        this.f9461e = c6122e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9462e) {
            case 0:
                this.f9461e.metrica();
                return;
            default:
                this.f9461e.yandex.cancel(true);
                return;
        }
    }
}
