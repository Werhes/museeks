package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8132e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f16506e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ ScheduledExecutorServiceC5603e f16507e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C6594e f16508e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16509e;

    public /* synthetic */ RunnableC8132e(ScheduledExecutorServiceC5603e scheduledExecutorServiceC5603e, Runnable runnable, C6594e c6594e, int i) {
        this.f16509e = i;
        this.f16507e = scheduledExecutorServiceC5603e;
        this.f16506e = runnable;
        this.f16508e = c6594e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16509e) {
            case 0:
                ExecutorService executorService = this.f16507e.f11957e;
                final int i = 0;
                final Runnable runnable = this.f16506e;
                final C6594e c6594e = this.f16508e;
                executorService.execute(new Runnable() { // from class: eۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC18179e) c6594e.f13613e).mopub(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC18179e) c6594e.f13613e).mopub(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                ScheduledFutureC18179e scheduledFutureC18179e = (ScheduledFutureC18179e) c6594e.f13613e;
                                try {
                                    runnable2.run();
                                    scheduledFutureC18179e.adcel(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC18179e.mopub(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f16507e.f11957e;
                final int i2 = 2;
                final Runnable runnable2 = this.f16506e;
                final C6594e c6594e2 = this.f16508e;
                executorService2.execute(new Runnable() { // from class: eۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC18179e) c6594e2.f13613e).mopub(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC18179e) c6594e2.f13613e).mopub(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                ScheduledFutureC18179e scheduledFutureC18179e = (ScheduledFutureC18179e) c6594e2.f13613e;
                                try {
                                    runnable22.run();
                                    scheduledFutureC18179e.adcel(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC18179e.mopub(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f16507e.f11957e;
                final int i3 = 1;
                final Runnable runnable3 = this.f16506e;
                final C6594e c6594e3 = this.f16508e;
                executorService3.execute(new Runnable() { // from class: eۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC18179e) c6594e3.f13613e).mopub(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC18179e) c6594e3.f13613e).mopub(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                ScheduledFutureC18179e scheduledFutureC18179e = (ScheduledFutureC18179e) c6594e3.f13613e;
                                try {
                                    runnable22.run();
                                    scheduledFutureC18179e.adcel(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC18179e.mopub(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
