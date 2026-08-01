package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC6417e implements ThreadFactory {
    public final /* synthetic */ ThreadFactory ad;
    public final /* synthetic */ C11498e metrica;
    public final /* synthetic */ String vip;

    public /* synthetic */ ThreadFactoryC6417e(ThreadFactory threadFactory, String str, C11498e c11498e) {
        this.ad = threadFactory;
        this.vip = str;
        this.metrica = c11498e;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.ad.newThread(runnable);
        StringBuilder inmobi = AbstractC8703e.inmobi(this.vip);
        inmobi.append(AbstractC5304e.m1850abstract(2, String.valueOf(C11498e.vip.incrementAndGet(this.metrica))));
        newThread.setName(inmobi.toString());
        return newThread;
    }
}
