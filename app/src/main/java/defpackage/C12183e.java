package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12183e extends AbstractRunnableC5165e {
    @Override // defpackage.AbstractRunnableC5165e
    public final Object admob(Object obj, Object obj2) {
        InterfaceC18244e interfaceC18244e = (InterfaceC18244e) obj;
        ListenableFuture apply = interfaceC18244e.apply(obj2);
        AbstractC2301e.smaato(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC18244e);
        return apply;
    }

    @Override // defpackage.AbstractRunnableC5165e
    public final void subscription(Object obj) {
        loadAd((ListenableFuture) obj);
    }
}
