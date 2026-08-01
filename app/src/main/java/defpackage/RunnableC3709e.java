package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3709e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ ListenableFuture f8294e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0485e f8295e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8296e;

    public /* synthetic */ RunnableC3709e(C0485e c0485e, ListenableFuture listenableFuture, int i) {
        this.f8296e = i;
        this.f8295e = c0485e;
        this.f8294e = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8296e) {
            case 0:
                C0485e c0485e = this.f8295e;
                ListenableFuture listenableFuture = this.f8294e;
                if (c0485e.f2776e instanceof C8973e) {
                    listenableFuture.cancel(false);
                    return;
                }
                return;
            default:
                C0485e c0485e2 = this.f8295e;
                ListenableFuture listenableFuture2 = this.f8294e;
                if (c0485e2.f2776e instanceof C8973e) {
                    listenableFuture2.cancel(false);
                    return;
                }
                return;
        }
    }
}
