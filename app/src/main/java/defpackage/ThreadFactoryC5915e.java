package defpackage;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC5915e implements ThreadFactory {
    public static final ThreadFactory appmetrica = Executors.defaultThreadFactory();
    public final AtomicLong ad = new AtomicLong();
    public final StrictMode.ThreadPolicy license;
    public final int metrica;
    public final String vip;

    public ThreadFactoryC5915e(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.vip = str;
        this.metrica = i;
        this.license = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = appmetrica.newThread(new RunnableC16019e(this, runnable, 28));
        Locale locale = Locale.ROOT;
        newThread.setName(this.vip + " Thread #" + this.ad.getAndIncrement());
        return newThread;
    }
}
