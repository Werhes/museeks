package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۡۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7527e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ ListenableFuture f15354e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15355e;

    public /* synthetic */ RunnableC7527e(ListenableFuture listenableFuture, int i) {
        this.f15355e = i;
        this.f15354e = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15355e) {
            case 0:
                this.f15354e.cancel(true);
                return;
            default:
                try {
                    AbstractC2017e.vip(this.f15354e);
                    return;
                } catch (ExecutionException e) {
                    AbstractC0111e.yandex().post(new RunnableC16721e(19, e));
                    return;
                }
        }
    }
}
