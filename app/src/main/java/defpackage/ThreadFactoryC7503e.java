package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC7503e implements ThreadFactory {
    public int ad;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("WorkManager-WorkTimer-thread-" + this.ad);
        this.ad = this.ad + 1;
        return newThread;
    }
}
