package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ScheduledFutureC18179e extends AbstractC7904e implements ScheduledFuture {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final ScheduledFuture f35595e;

    public ScheduledFutureC18179e(InterfaceC0810e interfaceC0810e) {
        this.f35595e = interfaceC0810e.ad(new C6594e(11, this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f35595e.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f35595e.getDelay(timeUnit);
    }

    @Override // defpackage.AbstractC7904e
    public final void metrica() {
        ScheduledFuture scheduledFuture = this.f35595e;
        Object obj = this.f15982e;
        scheduledFuture.cancel((obj instanceof C7442e) && ((C7442e) obj).ad);
    }
}
