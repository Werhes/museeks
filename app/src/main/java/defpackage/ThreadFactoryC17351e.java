package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۢۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC17351e implements ThreadFactory {
    public final /* synthetic */ int ad;
    public final Object vip;

    public /* synthetic */ ThreadFactoryC17351e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public ThreadFactoryC17351e(C17768e c17768e) {
        this.ad = 0;
        this.vip = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.ad) {
            case 0:
                Thread newThread = ((ThreadFactory) this.vip).newThread(runnable);
                newThread.setName("ScionFrontendApi");
                return newThread;
            case 1:
                return ((ThreadFactory) this.vip).newThread(new RunnableC4703e(6, runnable));
            default:
                Thread newThread2 = Executors.defaultThreadFactory().newThread(new RunnableC4929e(runnable));
                newThread2.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.vip).getAndIncrement());
                return newThread2;
        }
    }
}
