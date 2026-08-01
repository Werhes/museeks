package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5441e extends AbstractRunnableC15090e {
    @Override // defpackage.AbstractRunnableC15090e
    public final Object admob(Object obj, Throwable th) {
        InterfaceC18244e interfaceC18244e = (InterfaceC18244e) obj;
        ListenableFuture apply = interfaceC18244e.apply(th);
        AbstractC2301e.smaato(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC18244e);
        return apply;
    }

    @Override // defpackage.AbstractRunnableC15090e
    public final void subscription(Object obj) {
        loadAd((ListenableFuture) obj);
    }
}
