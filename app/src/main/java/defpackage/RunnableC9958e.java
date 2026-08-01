package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC9958e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ ServiceConnectionC10526e f19677e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8227e f19678e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19679e;

    public /* synthetic */ RunnableC9958e(ServiceConnectionC10526e serviceConnectionC10526e, InterfaceC8227e interfaceC8227e, int i) {
        this.f19679e = i;
        this.f19678e = interfaceC8227e;
        this.f19677e = serviceConnectionC10526e;
    }

    private final void ad() {
        ServiceConnectionC10526e serviceConnectionC10526e = this.f19677e;
        synchronized (serviceConnectionC10526e) {
            try {
                serviceConnectionC10526e.f20782e = false;
                C10640e c10640e = serviceConnectionC10526e.f20780e;
                if (!c10640e.m2862e()) {
                    C13879e c13879e = ((C6936e) c10640e.f36443e).f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27497e.ad("Connected to service");
                    InterfaceC8227e interfaceC8227e = this.f19678e;
                    c10640e.mo2250e();
                    c10640e.f20961e = interfaceC8227e;
                    c10640e.m2853e();
                    c10640e.m2849e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19679e) {
            case 0:
                ad();
                return;
            default:
                ServiceConnectionC10526e serviceConnectionC10526e = this.f19677e;
                synchronized (serviceConnectionC10526e) {
                    try {
                        serviceConnectionC10526e.f20782e = false;
                        C10640e c10640e = serviceConnectionC10526e.f20780e;
                        if (!c10640e.m2862e()) {
                            C13879e c13879e = ((C6936e) c10640e.f36443e).f14227e;
                            C6936e.yandex(c13879e);
                            c13879e.f27496e.ad("Connected to remote service");
                            InterfaceC8227e interfaceC8227e = this.f19678e;
                            c10640e.mo2250e();
                            c10640e.f20961e = interfaceC8227e;
                            c10640e.m2853e();
                            c10640e.m2849e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C10640e c10640e2 = this.f19677e.f20780e;
                ScheduledExecutorService scheduledExecutorService = c10640e2.f20963e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    c10640e2.f20963e = null;
                    return;
                }
                return;
        }
    }
}
