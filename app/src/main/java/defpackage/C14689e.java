package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْْٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14689e implements InterfaceC1232e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ScheduledFuture f29093e;

    public C14689e(ScheduledFuture scheduledFuture) {
        this.f29093e = scheduledFuture;
    }

    @Override // defpackage.InterfaceC1232e
    public final void ad() {
        this.f29093e.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f29093e + ']';
    }
}
