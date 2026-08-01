package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC7100e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C8320e f14567e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReference f14568e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14569e;

    public RunnableC7100e(C8320e c8320e, AtomicReference atomicReference, int i) {
        this.f14569e = i;
        switch (i) {
            case 1:
                this.f14568e = atomicReference;
                Objects.requireNonNull(c8320e);
                this.f14567e = c8320e;
                return;
            case 2:
                this.f14568e = atomicReference;
                Objects.requireNonNull(c8320e);
                this.f14567e = c8320e;
                return;
            case 3:
                this.f14568e = atomicReference;
                Objects.requireNonNull(c8320e);
                this.f14567e = c8320e;
                return;
            case 4:
                this.f14568e = atomicReference;
                Objects.requireNonNull(c8320e);
                this.f14567e = c8320e;
                return;
            default:
                this.f14568e = atomicReference;
                Objects.requireNonNull(c8320e);
                this.f14567e = c8320e;
                return;
        }
    }

    public /* synthetic */ RunnableC7100e(C8320e c8320e, AtomicReference atomicReference, int i, boolean z) {
        this.f14569e = i;
        this.f14567e = c8320e;
        this.f14568e = atomicReference;
    }

    private final void ad() {
        AtomicReference atomicReference = this.f14568e;
        synchronized (atomicReference) {
            try {
                try {
                    C6936e c6936e = (C6936e) this.f14567e.f36443e;
                    atomicReference.set(c6936e.f14221e.m2819e(c6936e.smaato().m3391e(), AbstractC17254e.f33855import));
                } finally {
                    this.f14568e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void license() {
        AtomicReference atomicReference = this.f14568e;
        synchronized (atomicReference) {
            try {
                try {
                    C6936e c6936e = (C6936e) this.f14567e.f36443e;
                    atomicReference.set(Double.valueOf(c6936e.f14221e.m2821e(c6936e.smaato().m3391e(), AbstractC17254e.f33869synchronized)));
                } finally {
                    this.f14568e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void metrica() {
        AtomicReference atomicReference = this.f14568e;
        synchronized (atomicReference) {
            try {
                try {
                    C6936e c6936e = (C6936e) this.f14567e.f36443e;
                    atomicReference.set(Integer.valueOf(c6936e.f14221e.m2825e(c6936e.smaato().m3391e(), AbstractC17254e.f33865static)));
                } finally {
                    this.f14568e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void vip() {
        AtomicReference atomicReference = this.f14568e;
        synchronized (atomicReference) {
            try {
                try {
                    C6936e c6936e = (C6936e) this.f14567e.f36443e;
                    atomicReference.set(Long.valueOf(c6936e.f14221e.m2816e(c6936e.smaato().m3391e(), AbstractC17254e.f33856instanceof)));
                } finally {
                    this.f14568e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14569e) {
            case 0:
                AtomicReference atomicReference = this.f14568e;
                synchronized (atomicReference) {
                    try {
                        try {
                            C6936e c6936e = (C6936e) this.f14567e.f36443e;
                            atomicReference.set(Boolean.valueOf(c6936e.f14221e.m2822e(c6936e.smaato().m3391e(), AbstractC17254e.f33873transient)));
                        } finally {
                            this.f14568e.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ad();
                return;
            case 2:
                vip();
                return;
            case 3:
                metrica();
                return;
            case 4:
                license();
                return;
            case 5:
                C8320e c8320e = this.f14567e;
                C1195e c1195e = ((C6936e) c8320e.f36443e).f14198e;
                C6936e.purchase(c1195e);
                Bundle m3009finally = c1195e.f3807e.m3009finally();
                C10640e mopub = ((C6936e) c8320e.f36443e).mopub();
                AtomicReference atomicReference2 = this.f14568e;
                mopub.mo2250e();
                mopub.m1411e();
                mopub.m2851e(new RunnableC11327e(13, mopub, atomicReference2, mopub.m2858e(false), m3009finally, false));
                return;
            default:
                C10640e mopub2 = ((C6936e) this.f14567e.f36443e).mopub();
                C1157e billing = C1157e.billing(EnumC14201e.SGTM_CLIENT);
                AtomicReference atomicReference3 = this.f14568e;
                mopub2.mo2250e();
                mopub2.m1411e();
                mopub2.m2851e(new RunnableC11327e(14, mopub2, atomicReference3, mopub2.m2858e(false), billing, false));
                return;
        }
    }
}
