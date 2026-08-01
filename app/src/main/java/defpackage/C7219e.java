package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7219e extends AbstractRunnableC14981e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14740e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Executor f14741e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C12136e f14742e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Object f14743e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C12136e f14744e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7219e(C12136e c12136e, C7302e c7302e, Executor executor) {
        this(c12136e, executor);
        this.f14740e = 0;
        this.f14744e = c12136e;
        this.f14743e = c7302e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7219e(C12136e c12136e, Callable callable) {
        this(c12136e, EnumC3320e.f7489e);
        this.f14740e = 1;
        this.f14744e = c12136e;
        this.f14743e = callable;
    }

    public C7219e(C12136e c12136e, Executor executor) {
        this.f14742e = c12136e;
        executor.getClass();
        this.f14741e = executor;
    }

    @Override // defpackage.AbstractRunnableC14981e
    public final void ad(Throwable th) {
        C12136e c12136e = this.f14742e;
        c12136e.f24302e = null;
        if (th instanceof ExecutionException) {
            c12136e.amazon(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            c12136e.cancel(false);
        } else {
            c12136e.amazon(th);
        }
    }

    @Override // defpackage.AbstractRunnableC14981e
    public final Object appmetrica() {
        switch (this.f14740e) {
            case 0:
                return ((C7302e) this.f14743e).call();
            default:
                return ((Callable) this.f14743e).call();
        }
    }

    @Override // defpackage.AbstractRunnableC14981e
    public final boolean license() {
        return this.f14742e.isDone();
    }

    @Override // defpackage.AbstractRunnableC14981e
    public final String purchase() {
        switch (this.f14740e) {
            case 0:
                return ((C7302e) this.f14743e).toString();
            default:
                return ((Callable) this.f14743e).toString();
        }
    }

    @Override // defpackage.AbstractRunnableC14981e
    public final void vip(Object obj) {
        this.f14742e.f24302e = null;
        switch (this.f14740e) {
            case 0:
                this.f14744e.loadAd((ListenableFuture) obj);
                return;
            default:
                this.f14744e.smaato(obj);
                return;
        }
    }
}
