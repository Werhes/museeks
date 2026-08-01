package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2017e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eٖٛؑ, eؘؗؕ, eٔۥۥ, java.lang.Runnable] */
    public static C5441e ad(ListenableFuture listenableFuture, Class cls, InterfaceC18244e interfaceC18244e, Executor executor) {
        int i = AbstractRunnableC15090e.f29871e;
        ?? abstractRunnableC15090e = new AbstractRunnableC15090e(listenableFuture, cls, interfaceC18244e);
        listenableFuture.ad(abstractRunnableC15090e, AbstractC3697e.billing(executor, abstractRunnableC15090e));
        return abstractRunnableC15090e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eؚۘٙ, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable] */
    public static ListenableFuture appmetrica(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        ?? obj = new Object();
        obj.f15167e = listenableFuture;
        listenableFuture.ad(obj, EnumC3320e.f7489e);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eٖٛؑ, eؗۜؐ, java.lang.Runnable, eّؑ۠] */
    public static C12183e billing(ListenableFuture listenableFuture, InterfaceC18244e interfaceC18244e, Executor executor) {
        int i = AbstractRunnableC5165e.f11052e;
        executor.getClass();
        ?? abstractRunnableC5165e = new AbstractRunnableC5165e(listenableFuture, interfaceC18244e);
        listenableFuture.ad(abstractRunnableC5165e, AbstractC3697e.billing(executor, abstractRunnableC5165e));
        return abstractRunnableC5165e;
    }

    public static C13747e license(Object obj) {
        return obj == null ? C13747e.f27231e : new C13747e(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚؑ۟, eَۨ۟, java.lang.Object] */
    public static C10701e metrica(Exception exc) {
        ?? obj = new Object();
        obj.amazon(exc);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eٖٛؑ, eؗۜؐ, eٍٜؓ, java.lang.Runnable] */
    public static C9590e purchase(ListenableFuture listenableFuture, InterfaceC8223e interfaceC8223e, Executor executor) {
        int i = AbstractRunnableC5165e.f11052e;
        ?? abstractRunnableC5165e = new AbstractRunnableC5165e(listenableFuture, interfaceC8223e);
        listenableFuture.ad(abstractRunnableC5165e, AbstractC3697e.billing(executor, abstractRunnableC5165e));
        return abstractRunnableC5165e;
    }

    public static Object vip(Future future) {
        if (future.isDone()) {
            return AbstractC17976e.vip(future);
        }
        throw new IllegalStateException(AbstractC12992e.adcel("Future was expected to be done: %s", future));
    }
}
