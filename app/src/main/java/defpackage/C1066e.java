package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1066e extends AbstractRunnableC14981e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f3594e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f3595e = 0;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ RunnableFutureC9859e f3596e;

    public C1066e(RunnableFutureC9859e runnableFutureC9859e, InterfaceC0987e interfaceC0987e) {
        this.f3596e = runnableFutureC9859e;
        this.f3594e = interfaceC0987e;
    }

    public C1066e(RunnableFutureC9859e runnableFutureC9859e, Callable callable) {
        this.f3596e = runnableFutureC9859e;
        callable.getClass();
        this.f3594e = callable;
    }

    @Override // defpackage.AbstractRunnableC14981e
    public final void ad(Throwable th) {
        switch (this.f3595e) {
            case 0:
                this.f3596e.amazon(th);
                return;
            default:
                this.f3596e.amazon(th);
                return;
        }
    }

    @Override // defpackage.AbstractRunnableC14981e
    public final Object appmetrica() {
        switch (this.f3595e) {
            case 0:
                InterfaceC0987e interfaceC0987e = (InterfaceC0987e) this.f3594e;
                ListenableFuture call = interfaceC0987e.call();
                AbstractC2301e.smaato(call, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC0987e);
                return call;
            default:
                return ((Callable) this.f3594e).call();
        }
    }

    @Override // defpackage.AbstractRunnableC14981e
    public final boolean license() {
        switch (this.f3595e) {
            case 0:
                return this.f3596e.isDone();
            default:
                return this.f3596e.isDone();
        }
    }

    @Override // defpackage.AbstractRunnableC14981e
    public final String purchase() {
        switch (this.f3595e) {
            case 0:
                return ((InterfaceC0987e) this.f3594e).toString();
            default:
                return ((Callable) this.f3594e).toString();
        }
    }

    @Override // defpackage.AbstractRunnableC14981e
    public final void vip(Object obj) {
        switch (this.f3595e) {
            case 0:
                this.f3596e.loadAd((ListenableFuture) obj);
                return;
            default:
                this.f3596e.smaato(obj);
                return;
        }
    }
}
