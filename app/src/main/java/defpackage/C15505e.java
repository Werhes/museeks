package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C15505e implements InterfaceC0810e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ long f30635e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f30636e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ ScheduledExecutorServiceC5603e f30637e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ long f30638e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30639e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ TimeUnit f30640e;

    public /* synthetic */ C15505e(ScheduledExecutorServiceC5603e scheduledExecutorServiceC5603e, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f30639e = i;
        this.f30637e = scheduledExecutorServiceC5603e;
        this.f30636e = runnable;
        this.f30638e = j;
        this.f30635e = j2;
        this.f30640e = timeUnit;
    }

    @Override // defpackage.InterfaceC0810e
    public final ScheduledFuture ad(C6594e c6594e) {
        switch (this.f30639e) {
            case 0:
                ScheduledExecutorServiceC5603e scheduledExecutorServiceC5603e = this.f30637e;
                return scheduledExecutorServiceC5603e.f11956e.scheduleAtFixedRate(new RunnableC8132e(scheduledExecutorServiceC5603e, this.f30636e, c6594e, 0), this.f30638e, this.f30635e, this.f30640e);
            default:
                ScheduledExecutorServiceC5603e scheduledExecutorServiceC5603e2 = this.f30637e;
                return scheduledExecutorServiceC5603e2.f11956e.scheduleWithFixedDelay(new RunnableC8132e(scheduledExecutorServiceC5603e2, this.f30636e, c6594e, 2), this.f30638e, this.f30635e, this.f30640e);
        }
    }
}
