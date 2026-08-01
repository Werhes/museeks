package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC1156e implements Runnable, Closeable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f3736e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f3737e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f3738e = AbstractC0111e.billing(Thread.currentThread());

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f3739e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public InterfaceC4766e f3740e;

    public RunnableC1156e(InterfaceC4766e interfaceC4766e, boolean z) {
        this.f3736e = false;
        this.f3740e = interfaceC4766e;
        this.f3736e = z;
    }

    public final void ad(AbstractC0586e abstractC0586e) {
        if (this.f3737e) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.f3739e) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.f3739e = true;
        abstractC0586e.ad(this, EnumC3320e.f7489e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC4766e interfaceC4766e = this.f3740e;
        try {
            this.f3740e = null;
            boolean z = this.f3739e;
            if (!z) {
                if (this.f3737e) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.f3737e = true;
                if (this.f3738e && !z) {
                    AbstractC0111e.billing(Thread.currentThread());
                }
            }
            if (interfaceC4766e != null) {
                ((AbstractC2228e) interfaceC4766e).close();
            }
            if (this.f3736e) {
                AbstractC5076e.ad(AbstractC5076e.vip(), C13169e.f26148e);
            }
        } catch (Throwable th) {
            if (interfaceC4766e != null) {
                try {
                    ((AbstractC2228e) interfaceC4766e).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.f3737e || !(z = this.f3739e)) {
            AbstractC0111e.yandex().post(RunnableC18182e.f35606e);
            return;
        }
        this.f3737e = true;
        if (!this.f3738e || z) {
            return;
        }
        AbstractC0111e.billing(Thread.currentThread());
    }
}
