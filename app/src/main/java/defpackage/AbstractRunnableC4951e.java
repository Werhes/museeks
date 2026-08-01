package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC4951e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f10471e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f10472e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C17768e f10473e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f10474e;

    public AbstractRunnableC4951e(C17768e c17768e, boolean z) {
        Objects.requireNonNull(c17768e);
        this.f10473e = c17768e;
        this.f10474e = System.currentTimeMillis();
        this.f10472e = SystemClock.elapsedRealtime();
        this.f10471e = z;
    }

    public abstract void ad();

    @Override // java.lang.Runnable
    public final void run() {
        C17768e c17768e = this.f10473e;
        if (c17768e.appmetrica) {
            vip();
            return;
        }
        try {
            ad();
        } catch (Exception e) {
            c17768e.vip(e, false, this.f10471e);
            vip();
        }
    }

    public void vip() {
    }
}
