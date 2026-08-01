package defpackage;

import java.util.Deque;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13122e extends AbstractExecutorServiceC1585e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final ThreadLocal f26083e = new ThreadLocal();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ThreadPoolExecutor f26084e;

    public C13122e() {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC17351e(1, defaultThreadFactory));
        this.f26084e = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f26083e.get();
        if (deque == null || deque.size() > 1) {
            this.f26084e.execute(new RunnableC4703e(5, runnable));
            return;
        }
        deque.add(runnable);
        if (deque.size() > 1) {
            return;
        }
        do {
            runnable.run();
            deque.removeFirst();
            runnable = (Runnable) deque.peekFirst();
        } while (runnable != null);
    }
}
