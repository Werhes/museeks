package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC3603e extends AbstractC12934e implements Executor {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final ExecutorC3603e f8134e = new AbstractC3743e();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final AbstractC3743e f8135e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؕۥٙ, eؕۙۜ] */
    static {
        C3788e c3788e = C3788e.f8394e;
        int i = AbstractC9861e.ad;
        if (64 >= i) {
            i = 64;
        }
        f8135e = c3788e.mo685static(AbstractC12547e.yandex(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.AbstractC3743e
    public final void advert(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        f8135e.advert(interfaceC8850e, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        advert(C2693e.f6576e, runnable);
    }

    @Override // defpackage.AbstractC12934e
    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public final Executor mo1383e() {
        return this;
    }

    @Override // defpackage.AbstractC3743e
    public final void loadAd(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        f8135e.loadAd(interfaceC8850e, runnable);
    }

    @Override // defpackage.AbstractC3743e
    /* renamed from: static */
    public final AbstractC3743e mo685static(int i) {
        return C3788e.f8394e.mo685static(i);
    }

    @Override // defpackage.AbstractC3743e
    public final String toString() {
        return "Dispatchers.IO";
    }
}
