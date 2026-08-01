package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC7412e extends AtomicReference implements Executor, Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f15173e = 0;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Runnable f15174e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Executor f15175e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Thread f15176e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16911e f15177e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == EnumC10346e.f20420e) {
            this.f15175e = null;
            this.f15177e = null;
            return;
        }
        this.f15176e = Thread.currentThread();
        try {
            C16911e c16911e = this.f15177e;
            Objects.requireNonNull(c16911e);
            C12894e c12894e = (C12894e) c16911e.f33136e;
            if (((Thread) c12894e.f25751e) == this.f15176e) {
                this.f15177e = null;
                AbstractC2301e.subscription(((Runnable) c12894e.f25750e) == null);
                c12894e.f25750e = runnable;
                Executor executor = this.f15175e;
                Objects.requireNonNull(executor);
                c12894e.f25752e = executor;
                this.f15175e = null;
            } else {
                Executor executor2 = this.f15175e;
                Objects.requireNonNull(executor2);
                this.f15175e = null;
                this.f15174e = runnable;
                executor2.execute(this);
            }
            this.f15176e = null;
        } catch (Throwable th) {
            this.f15176e = null;
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.f15176e) {
            Runnable runnable = this.f15174e;
            Objects.requireNonNull(runnable);
            this.f15174e = null;
            runnable.run();
            return;
        }
        C12894e c12894e = new C12894e(16, false);
        c12894e.f25751e = currentThread;
        C16911e c16911e = this.f15177e;
        Objects.requireNonNull(c16911e);
        c16911e.f33136e = c12894e;
        this.f15177e = null;
        try {
            Runnable runnable2 = this.f15174e;
            Objects.requireNonNull(runnable2);
            this.f15174e = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) c12894e.f25750e;
                if (runnable3 == null || (executor = (Executor) c12894e.f25752e) == null) {
                    break;
                }
                c12894e.f25750e = null;
                c12894e.f25752e = null;
                executor.execute(runnable3);
            }
        } finally {
            c12894e.f25751e = null;
        }
    }
}
