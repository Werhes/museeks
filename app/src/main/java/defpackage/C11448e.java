package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11448e extends Thread {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f23028e = false;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final BlockingQueue f23029e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C6915e f23030e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f23031e;

    public C11448e(C6915e c6915e, String str, BlockingQueue blockingQueue) {
        this.f23030e = c6915e;
        AbstractC9528e.startapp(blockingQueue);
        this.f23031e = new Object();
        this.f23029e = blockingQueue;
        setName(str);
    }

    public final void ad() {
        Object obj = this.f23031e;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f23030e.f14165e.acquire();
                z = true;
            } catch (InterruptedException e) {
                C13879e c13879e = ((C6936e) this.f23030e.f36443e).f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27495e.vip(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f23029e;
                C17182e c17182e = (C17182e) blockingQueue.poll();
                if (c17182e != null) {
                    Process.setThreadPriority(true != c17182e.f33688e ? 10 : threadPriority);
                    c17182e.run();
                } else {
                    Object obj = this.f23031e;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f23030e.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                C13879e c13879e2 = ((C6936e) this.f23030e.f36443e).f14227e;
                                C6936e.yandex(c13879e2);
                                c13879e2.f27495e.vip(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f23030e.f14163e) {
                        if (this.f23029e.peek() == null) {
                            vip();
                            vip();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            vip();
            throw th;
        }
    }

    public final void vip() {
        C6915e c6915e = this.f23030e;
        synchronized (c6915e.f14163e) {
            try {
                if (!this.f23028e) {
                    c6915e.f14165e.release();
                    c6915e.f14163e.notifyAll();
                    if (this == c6915e.f14166e) {
                        c6915e.f14166e = null;
                    } else if (this == c6915e.f14162e) {
                        c6915e.f14162e = null;
                    } else {
                        C13879e c13879e = ((C6936e) c6915e.f36443e).f14227e;
                        C6936e.yandex(c13879e);
                        c13879e.f27502e.ad("Current scheduler thread is neither worker nor network");
                    }
                    this.f23028e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
