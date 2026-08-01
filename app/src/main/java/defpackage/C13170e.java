package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13170e extends Thread {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26149e = 0;

    public /* synthetic */ C13170e(String str) {
        super(str);
    }

    public /* synthetic */ C13170e(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        switch (this.f26149e) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                C13572e c13572e = C7332e.yandex;
                reentrantLock = C7332e.adcel;
                reentrantLock.lock();
            } catch (InterruptedException unused2) {
            }
            try {
                C7332e advert = C15802e.advert();
                if (advert == C7332e.startapp) {
                    C7332e.startapp = null;
                    return;
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                if (advert != null) {
                    advert.mopub();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
