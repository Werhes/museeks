package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC14833e implements ThreadFactory {
    public final String ad;
    public final ThreadFactory vip = Executors.defaultThreadFactory();

    public ThreadFactoryC14833e(String str) {
        this.ad = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.vip.newThread(new RunnableC4703e(4, runnable));
        newThread.setName(this.ad);
        return newThread;
    }
}
