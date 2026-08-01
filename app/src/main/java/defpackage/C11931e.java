package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11931e implements InterfaceC0590e {
    public static boolean license;
    public final InterfaceC6823e ad;
    public final C2986e metrica;
    public final int vip;

    public C11931e(InterfaceC6823e interfaceC6823e) {
        C2986e c2986e = C2986e.f7027e;
        this.ad = interfaceC6823e;
        this.vip = Math.max(5, 10);
        this.metrica = c2986e;
    }

    @Override // defpackage.InterfaceC0590e
    public final void ad() {
        synchronized (C11931e.class) {
            try {
                if (!license) {
                    RunnableC16721e runnableC16721e = new RunnableC16721e(23, this);
                    long j = this.vip;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    InterfaceScheduledExecutorServiceC1678e interfaceScheduledExecutorServiceC1678e = (InterfaceScheduledExecutorServiceC1678e) this.ad.get();
                    RunnableC15684e runnableC15684e = new RunnableC15684e(this, runnableC16721e, interfaceScheduledExecutorServiceC1678e, j);
                    C3598e c3598e = (C3598e) interfaceScheduledExecutorServiceC1678e;
                    c3598e.getClass();
                    RunnableFutureC9859e runnableFutureC9859e = new RunnableFutureC9859e(Executors.callable(runnableC15684e, null));
                    ScheduledFutureC15846e scheduledFutureC15846e = new ScheduledFutureC15846e(runnableFutureC9859e, c3598e.f8133e.schedule(runnableFutureC9859e, j, timeUnit));
                    scheduledFutureC15846e.ad(new RunnableC7527e(scheduledFutureC15846e, 1), EnumC3320e.f7489e);
                    license = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
