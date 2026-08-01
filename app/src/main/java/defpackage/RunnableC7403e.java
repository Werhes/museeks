package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۘٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC7403e extends AbstractC0798e implements Runnable {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public ListenableFuture f15167e;

    @Override // defpackage.AbstractC0586e
    public final void license() {
        this.f15167e = null;
    }

    @Override // defpackage.AbstractC0586e
    public final String mopub() {
        ListenableFuture listenableFuture = this.f15167e;
        if (listenableFuture == null) {
            return null;
        }
        return "delegate=[" + listenableFuture + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f15167e;
        if (listenableFuture != null) {
            loadAd(listenableFuture);
        }
    }
}
