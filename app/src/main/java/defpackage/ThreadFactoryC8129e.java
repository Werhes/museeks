package defpackage;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC8129e implements ThreadFactory {
    public final /* synthetic */ int ad;
    public final AtomicInteger vip;

    public ThreadFactoryC8129e(int i) {
        this.ad = i;
        switch (i) {
            case 1:
                this.vip = new AtomicInteger(0);
                return;
            case 2:
                this.vip = new AtomicInteger(0);
                return;
            default:
                this.vip = new AtomicInteger(0);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.ad) {
            case 0:
                Thread thread = new Thread(new RunnableC17584e(14, runnable));
                thread.setPriority(7);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + this.vip.getAndIncrement());
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                thread2.setName("arch_disk_io_" + this.vip.getAndIncrement());
                return thread2;
            default:
                Thread thread3 = new Thread(runnable);
                Locale locale2 = Locale.US;
                thread3.setName("CameraX-camerax_io_" + this.vip.getAndIncrement());
                return thread3;
        }
    }
}
