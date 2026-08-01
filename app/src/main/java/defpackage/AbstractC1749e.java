package defpackage;

import android.os.Looper;
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1749e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C2892e f4790e = new C2892e(-1571120048, false, new Object());

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C2892e f4789e = new C2892e(-1455401925, false, new C14123e(17));

    public static Object ad(C0560e c0560e) {
        AbstractC9528e.yandex("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        AbstractC9528e.adcel(c0560e, "Task must not be null");
        if (c0560e.mopub()) {
            return startapp(c0560e);
        }
        C7988e c7988e = new C7988e(29);
        Executor executor = AbstractC10468e.vip;
        c0560e.purchase(executor, c7988e);
        c0560e.license(executor, c7988e);
        c0560e.vip.crashlytics(new C1173e(executor, (InterfaceC6786e) c7988e));
        c0560e.remoteconfig();
        ((CountDownLatch) c7988e.f16176e).await();
        return startapp(c0560e);
    }

    public static C0560e appmetrica(Object obj) {
        C0560e c0560e = new C0560e();
        c0560e.amazon(obj);
        return c0560e;
    }

    public static C12894e billing(Object obj) {
        return new C12894e(obj.getClass().getSimpleName());
    }

    public static C0560e license(Exception exc) {
        C0560e c0560e = new C0560e();
        c0560e.Signature(exc);
        return c0560e;
    }

    public static C0560e metrica(Executor executor, Callable callable) {
        AbstractC9528e.adcel(executor, "Executor must not be null");
        C0560e c0560e = new C0560e();
        executor.execute(new RunnableC14126e(c0560e, callable));
        return c0560e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double purchase(double r10, double r12) {
        /*
            double r0 = defpackage.AbstractC11866e.license(r10, r12)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        Lc:
            double r4 = defpackage.AbstractC11866e.metrica(r10, r12)
            double r2 = java.lang.Math.max(r2, r4)
            double r4 = defpackage.AbstractC11866e.purchase(r0, r10)
            double r6 = defpackage.AbstractC11866e.purchase(r2, r10)
            double r10 = java.lang.Math.rint(r10)
            r8 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L4b
            double r10 = r4 - r6
            double r10 = java.lang.Math.abs(r10)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L3f
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3f
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3f
            r10 = 1
            goto L40
        L3f:
            r10 = 0
        L40:
            int r11 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 >= 0) goto L54
            if (r10 == 0) goto L55
            goto L54
        L4b:
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L55
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L54
            goto L55
        L54:
            return r0
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1749e.purchase(double, double):double");
    }

    public static Object startapp(C0560e c0560e) {
        if (c0560e.advert()) {
            return c0560e.adcel();
        }
        if (c0560e.license) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(c0560e.startapp());
    }

    public static Object vip(C0560e c0560e, long j, TimeUnit timeUnit) {
        AbstractC9528e.yandex("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        AbstractC9528e.adcel(c0560e, "Task must not be null");
        AbstractC9528e.adcel(timeUnit, "TimeUnit must not be null");
        if (c0560e.mopub()) {
            return startapp(c0560e);
        }
        C7988e c7988e = new C7988e(29);
        Executor executor = AbstractC10468e.vip;
        c0560e.purchase(executor, c7988e);
        c0560e.license(executor, c7988e);
        c0560e.vip.crashlytics(new C1173e(executor, (InterfaceC6786e) c7988e));
        c0560e.remoteconfig();
        if (((CountDownLatch) c7988e.f16176e).await(j, timeUnit)) {
            return startapp(c0560e);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static C0560e yandex(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return appmetrica(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((C0560e) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C0560e c0560e = new C0560e();
        C13988e c13988e = new C13988e(collection.size(), c0560e);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            C0560e c0560e2 = (C0560e) it2.next();
            ExecutorC8172e executorC8172e = AbstractC10468e.vip;
            c0560e2.purchase(executorC8172e, c13988e);
            c0560e2.license(executorC8172e, c13988e);
            c0560e2.vip.crashlytics(new C1173e((Executor) executorC8172e, (InterfaceC6786e) c13988e));
            c0560e2.remoteconfig();
        }
        return c0560e;
    }
}
