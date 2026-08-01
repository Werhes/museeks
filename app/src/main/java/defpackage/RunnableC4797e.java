package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4797e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ListenableFuture f10225e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC0586e f10226e;

    public RunnableC4797e(AbstractC0586e abstractC0586e, ListenableFuture listenableFuture) {
        this.f10226e = abstractC0586e;
        this.f10225e = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10226e.f2776e != this) {
            return;
        }
        if (AbstractC0586e.f2773e.license(this.f10226e, this, AbstractC0586e.startapp(this.f10225e))) {
            AbstractC0586e.purchase(this.f10226e, false);
        }
    }
}
