package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4140e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9748e f9130e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f9131e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9132e = 0;

    public RunnableC4140e(C6339e c6339e, long j) {
        this.f9131e = j;
        Objects.requireNonNull(c6339e);
        this.f9130e = c6339e;
    }

    public RunnableC4140e(C10693e c10693e, long j) {
        this.f9131e = j;
        Objects.requireNonNull(c10693e);
        this.f9130e = c10693e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9132e) {
            case 0:
                ((C6339e) this.f9130e).m2154e(this.f9131e);
                return;
            default:
                C10693e c10693e = (C10693e) this.f9130e;
                C6339e c6339e = ((C6936e) c10693e.f36443e).f14204e;
                C6936e.appmetrica(c6339e);
                c6339e.m2158e(this.f9131e);
                c10693e.f21069e = null;
                return;
        }
    }
}
