package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC18273e implements ThreadFactory {
    public final AtomicInteger ad = new AtomicInteger(0);
    public final /* synthetic */ boolean vip;

    public ThreadFactoryC18273e(boolean z) {
        this.vip = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder inmobi = AbstractC8703e.inmobi(this.vip ? "WM.task-" : "androidx.work-");
        inmobi.append(this.ad.incrementAndGet());
        return new Thread(runnable, inmobi.toString());
    }
}
