package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7789e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ListenableFuture f15789e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6566e f15790e;

    public RunnableC7789e(C6566e c6566e, ListenableFuture listenableFuture) {
        this.f15790e = c6566e;
        this.f15789e = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15790e.f36122e != this) {
            return;
        }
        if (AbstractC18423e.f36119e.vip(this.f15790e, this, AbstractC18423e.purchase(this.f15789e))) {
            AbstractC18423e.metrica(this.f15790e);
        }
    }
}
