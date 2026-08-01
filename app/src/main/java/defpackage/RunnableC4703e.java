package defpackage;

import android.os.Process;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4703e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Runnable f10091e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10092e;

    public /* synthetic */ RunnableC4703e(int i, Runnable runnable) {
        this.f10092e = i;
        this.f10091e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10092e) {
            case 0:
                try {
                    this.f10091e.run();
                    return;
                } catch (Exception e) {
                    AbstractC12640e.yandex("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f10091e.run();
                return;
            case 2:
                this.f10091e.run();
                return;
            case 3:
                this.f10091e.run();
                return;
            case 4:
                Process.setThreadPriority(0);
                this.f10091e.run();
                return;
            case 5:
                Deque deque = (Deque) C13122e.f26083e.get();
                AbstractC9528e.startapp(deque);
                Runnable runnable = this.f10091e;
                deque.add(runnable);
                if (deque.size() > 1) {
                    return;
                }
                do {
                    runnable.run();
                    deque.removeFirst();
                    runnable = (Runnable) deque.peekFirst();
                } while (runnable != null);
                return;
            default:
                C13122e.f26083e.set(new ArrayDeque());
                this.f10091e.run();
                return;
        }
    }

    public String toString() {
        switch (this.f10092e) {
            case 1:
                return this.f10091e.toString();
            case 2:
                return this.f10091e.toString();
            default:
                return super.toString();
        }
    }
}
