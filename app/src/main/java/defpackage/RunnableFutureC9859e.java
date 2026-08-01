package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۣٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableFutureC9859e extends AbstractC16326e implements RunnableFuture {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public volatile AbstractRunnableC14981e f19447e;

    public RunnableFutureC9859e(Callable callable) {
        this.f19447e = new C1066e(this, callable);
    }

    @Override // defpackage.AbstractC0586e
    public final void license() {
        AbstractRunnableC14981e abstractRunnableC14981e;
        if (Signature() && (abstractRunnableC14981e = this.f19447e) != null) {
            abstractRunnableC14981e.metrica();
        }
        this.f19447e = null;
    }

    @Override // defpackage.AbstractC0586e
    public final String mopub() {
        AbstractRunnableC14981e abstractRunnableC14981e = this.f19447e;
        if (abstractRunnableC14981e == null) {
            return super.mopub();
        }
        return "task=[" + abstractRunnableC14981e + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC14981e abstractRunnableC14981e = this.f19447e;
        if (abstractRunnableC14981e != null) {
            abstractRunnableC14981e.run();
        }
        this.f19447e = null;
    }
}
