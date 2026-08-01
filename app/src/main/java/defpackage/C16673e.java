package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۨؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16673e extends AbstractC12947e {
    public final /* synthetic */ AbstractC12947e adcel;
    public final /* synthetic */ ThreadPoolExecutor mopub;

    public C16673e(AbstractC12947e abstractC12947e, ThreadPoolExecutor threadPoolExecutor) {
        this.adcel = abstractC12947e;
        this.mopub = threadPoolExecutor;
    }

    @Override // defpackage.AbstractC12947e
    public final void pro(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.mopub;
        try {
            this.adcel.pro(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.AbstractC12947e
    public final void signatures(C11980e c11980e) {
        ThreadPoolExecutor threadPoolExecutor = this.mopub;
        try {
            this.adcel.signatures(c11980e);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
