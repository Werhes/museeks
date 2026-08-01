package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.util.Log;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC17144e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f33554e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f33555e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33556e;

    public /* synthetic */ RunnableC17144e(int i, Executor executor) {
        this.f33556e = i;
        this.f33554e = executor;
    }

    public RunnableC17144e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f33556e = 21;
        this.f33554e = swipeDismissBehavior;
        this.f33555e = view;
    }

    public RunnableC17144e(C1246e c1246e, C11616e c11616e, int i) {
        this.f33556e = 12;
        this.f33554e = c1246e;
        this.f33555e = c11616e;
    }

    public /* synthetic */ RunnableC17144e(Object obj, Object obj2, int i) {
        this.f33556e = i;
        this.f33555e = obj;
        this.f33554e = obj2;
    }

    public /* synthetic */ RunnableC17144e(Object obj, Object obj2, boolean z, int i) {
        this.f33556e = i;
        this.f33554e = obj;
        this.f33555e = obj2;
    }

    private final void ad() {
        int i = 0;
        while (true) {
            try {
                ((Runnable) this.f33555e).run();
            } catch (Throwable th) {
                try {
                    AbstractC15849e.license(C2693e.f6576e, th);
                } catch (Throwable th2) {
                    C17325e c17325e = (C17325e) this.f33554e;
                    synchronized (c17325e.f34008e) {
                        C17325e.f34004e.decrementAndGet(c17325e);
                        throw th2;
                    }
                }
            }
            Runnable m4304e = ((C17325e) this.f33554e).m4304e();
            if (m4304e == null) {
                return;
            }
            this.f33555e = m4304e;
            i++;
            if (i >= 16) {
                C17325e c17325e2 = (C17325e) this.f33554e;
                if (AbstractC7214e.amazon(c17325e2.f34007e, c17325e2)) {
                    C17325e c17325e3 = (C17325e) this.f33554e;
                    AbstractC7214e.smaato(c17325e3.f34007e, c17325e3, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f33555e).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        defpackage.ExecutorC12022e.f24042e.vip().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f33555e), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        r10.f33555e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void appmetrica() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f33554e     // Catch: java.lang.Throwable -> L58
            eِ۟ۗ r2 = (defpackage.ExecutorC12022e) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f24045e     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f33554e     // Catch: java.lang.Throwable -> L20
            eِ۟ۗ r0 = (defpackage.ExecutorC12022e) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f24044e     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L81
        L22:
            long r6 = r0.f24046e     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f24046e = r6     // Catch: java.lang.Throwable -> L20
            r0.f24044e = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f33554e     // Catch: java.lang.Throwable -> L20
            eِ۟ۗ r4 = (defpackage.ExecutorC12022e) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f24045e     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f33555e = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f33554e     // Catch: java.lang.Throwable -> L20
            eِ۟ۗ r0 = (defpackage.ExecutorC12022e) r0     // Catch: java.lang.Throwable -> L20
            r0.f24044e = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f33555e     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
        L55:
            r10.f33555e = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L83
        L5a:
            r0 = move-exception
            goto L7e
        L5c:
            r3 = move-exception
            eًؘۛ r4 = defpackage.ExecutorC12022e.f24042e     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Logger r4 = r4.vip()     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f33555e     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7e:
            r10.f33555e = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L81:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L83:
            if (r1 == 0) goto L8c
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC17144e.appmetrica():void");
    }

    private final void metrica() {
        try {
            license();
        } catch (Error e) {
            synchronized (((ExecutorC12660e) this.f33554e).f25382e) {
                ((ExecutorC12660e) this.f33554e).f25381e = 1;
                throw e;
            }
        }
    }

    private final void vip() {
        try {
            license();
        } catch (Error e) {
            synchronized (((ExecutorC12022e) this.f33554e).f24045e) {
                ((ExecutorC12022e) this.f33554e).f24044e = 1;
                throw e;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        ((java.lang.Runnable) r10.f33555e).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        defpackage.ExecutorC12660e.f25379e.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f33555e), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        r10.f33555e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r1 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void license() {
        /*
            r10 = this;
            int r0 = r10.f33556e
            switch(r0) {
                case 18: goto L8e;
                default: goto L5;
            }
        L5:
            r0 = 0
            r1 = r0
        L7:
            java.lang.Object r2 = r10.f33554e     // Catch: java.lang.Throwable -> L5d
            eّۖٗ r2 = (defpackage.ExecutorC12660e) r2     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayDeque r2 = r2.f25382e     // Catch: java.lang.Throwable -> L5d
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5d
            r3 = 1
            if (r0 != 0) goto L31
            java.lang.Object r0 = r10.f33554e     // Catch: java.lang.Throwable -> L25
            eّۖٗ r0 = (defpackage.ExecutorC12660e) r0     // Catch: java.lang.Throwable -> L25
            int r4 = r0.f25381e     // Catch: java.lang.Throwable -> L25
            r5 = 4
            if (r4 != r5) goto L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L4b
        L1d:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L4b
        L25:
            r0 = move-exception
            goto L82
        L27:
            long r6 = r0.f25383e     // Catch: java.lang.Throwable -> L25
            r8 = 1
            long r6 = r6 + r8
            r0.f25383e = r6     // Catch: java.lang.Throwable -> L25
            r0.f25381e = r5     // Catch: java.lang.Throwable -> L25
            r0 = r3
        L31:
            java.lang.Object r4 = r10.f33554e     // Catch: java.lang.Throwable -> L25
            eّۖٗ r4 = (defpackage.ExecutorC12660e) r4     // Catch: java.lang.Throwable -> L25
            java.util.ArrayDeque r4 = r4.f25382e     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L25
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L25
            r10.f33555e = r4     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L4c
            java.lang.Object r0 = r10.f33554e     // Catch: java.lang.Throwable -> L25
            eّۖٗ r0 = (defpackage.ExecutorC12660e) r0     // Catch: java.lang.Throwable -> L25
            r0.f25381e = r3     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L4b
            goto L1d
        L4b:
            return
        L4c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5d
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f33555e     // Catch: java.lang.Throwable -> L5f java.lang.RuntimeException -> L61
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5f java.lang.RuntimeException -> L61
            r3.run()     // Catch: java.lang.Throwable -> L5f java.lang.RuntimeException -> L61
        L5a:
            r10.f33555e = r2     // Catch: java.lang.Throwable -> L5d
            goto L7
        L5d:
            r0 = move-exception
            goto L84
        L5f:
            r0 = move-exception
            goto L7f
        L61:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.ExecutorC12660e.f25379e     // Catch: java.lang.Throwable -> L5f
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r6.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r10.f33555e     // Catch: java.lang.Throwable -> L5f
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5f
            r6.append(r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5f
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5f
            goto L5a
        L7f:
            r10.f33555e = r2     // Catch: java.lang.Throwable -> L5d
            throw r0     // Catch: java.lang.Throwable -> L5d
        L82:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r0     // Catch: java.lang.Throwable -> L5d
        L84:
            if (r1 == 0) goto L8d
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8d:
            throw r0
        L8e:
            r10.appmetrica()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC17144e.license():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v69, types: [eؙۦؒ] */
    /* JADX WARN: Type inference failed for: r3v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9, types: [eؔؕٓ] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, eؚؐۚ] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC18087e interfaceC18087e;
        int i;
        int i2;
        int i3;
        int[] iArr;
        Throwable vip;
        InterfaceC6840e interfaceC6840e;
        ?? r7;
        boolean z;
        boolean z2;
        boolean z3;
        try {
            switch (this.f33556e) {
                case 0:
                    InterfaceC2295e interfaceC2295e = (InterfaceC2295e) this.f33554e;
                    try {
                        interfaceC2295e.license(AbstractC15792e.purchase((Future) this.f33555e));
                        return;
                    } catch (Error e) {
                        e = e;
                        interfaceC2295e.yandex(e);
                        return;
                    } catch (RuntimeException e2) {
                        e = e2;
                        interfaceC2295e.yandex(e);
                        return;
                    } catch (ExecutionException e3) {
                        Throwable cause = e3.getCause();
                        if (cause == null) {
                            interfaceC2295e.yandex(e3);
                            return;
                        } else {
                            interfaceC2295e.yandex(cause);
                            return;
                        }
                    }
                case 1:
                    C9337e c9337e = (C9337e) this.f33555e;
                    C13631e c13631e = (C13631e) this.f33554e;
                    MenuC8939e menuC8939e = c13631e.f27034e;
                    if (menuC8939e != null && (interfaceC18087e = menuC8939e.f17925e) != null) {
                        interfaceC18087e.advert(menuC8939e);
                    }
                    View view = (View) c13631e.f27043e;
                    if (view != null && view.getWindowToken() != null) {
                        if (!c9337e.vip()) {
                            if (c9337e.appmetrica != null) {
                                c9337e.license(0, 0, false, false);
                            }
                        }
                        c13631e.f27046e = c9337e;
                    }
                    c13631e.f27036e = null;
                    return;
                case 2:
                    ((C12108e) this.f33555e).f24274e = this.f33554e;
                    return;
                case 3:
                    ((Application) this.f33555e).unregisterActivityLifecycleCallbacks((C12108e) this.f33554e);
                    return;
                case 4:
                    Object obj = this.f33554e;
                    Object obj2 = this.f33555e;
                    try {
                        Method method = AbstractC13941e.license;
                        if (method != null) {
                            method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                        } else {
                            AbstractC13941e.appmetrica.invoke(obj2, obj, Boolean.FALSE);
                        }
                        return;
                    } catch (RuntimeException e4) {
                        if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                            throw e4;
                        }
                        return;
                    } catch (Throwable th) {
                        Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                        return;
                    }
                case 5:
                    RunnableC1887e runnableC1887e = (RunnableC1887e) this.f33554e;
                    C1847e c1847e = (C1847e) runnableC1887e.f5024e;
                    if (c1847e.billing == runnableC1887e.f5026e) {
                        List list = (List) runnableC1887e.f5027e;
                        C16042e c16042e = (C16042e) this.f33555e;
                        c1847e.appmetrica = list;
                        c1847e.purchase = DesugarCollections.unmodifiableList(list);
                        C9770e c9770e = c1847e.ad;
                        int[] iArr2 = (int[]) c16042e.f31594e;
                        ArrayList arrayList = (ArrayList) c16042e.f31597e;
                        int i4 = c16042e.f31598e;
                        C7850e c7850e = (C7850e) c16042e.f31599e;
                        C2446e c2446e = new C2446e(c9770e);
                        ArrayDeque arrayDeque = new ArrayDeque();
                        int i5 = c16042e.f31596e;
                        int size = arrayList.size() - 1;
                        int i6 = i5;
                        int i7 = i4;
                        while (size >= 0) {
                            C3650e c3650e = (C3650e) arrayList.get(size);
                            int i8 = c3650e.ad;
                            int i9 = r4;
                            int i10 = c3650e.metrica;
                            int i11 = i8 + i10;
                            int i12 = c3650e.vip;
                            C1847e c1847e2 = c1847e;
                            int i13 = i12 + i10;
                            while (i7 > i11) {
                                i7--;
                                int i14 = iArr2[i7];
                                if ((i14 & 12) != 0) {
                                    i2 = i8;
                                    int i15 = i14 >> 4;
                                    i3 = i11;
                                    iArr = iArr2;
                                    C14851e vip2 = C16042e.vip(arrayDeque, i15, false);
                                    if (vip2 != null) {
                                        int i16 = (i4 - vip2.vip) - 1;
                                        c2446e.metrica(i7, i16);
                                        if ((i14 & 4) != 0) {
                                            c7850e.applovin(i7, i15);
                                            c2446e.startapp(i16, i9);
                                        }
                                    } else {
                                        ?? r3 = i9;
                                        arrayDeque.add(new C14851e(i7, (i4 - i7) - (r3 == true ? 1 : 0), r3));
                                    }
                                } else {
                                    i2 = i8;
                                    i3 = i11;
                                    iArr = iArr2;
                                    c2446e.billing(i7, i9);
                                    i4--;
                                }
                                i8 = i2;
                                i11 = i3;
                                iArr2 = iArr;
                                i9 = 1;
                            }
                            int i17 = i8;
                            int[] iArr3 = iArr2;
                            while (i6 > i13) {
                                i6--;
                                int i18 = ((int[]) c16042e.f31600e)[i6];
                                if ((i18 & 12) != 0) {
                                    int i19 = i18 >> 4;
                                    i = i13;
                                    C14851e vip3 = C16042e.vip(arrayDeque, i19, true);
                                    if (vip3 == null) {
                                        arrayDeque.add(new C14851e(i6, i4 - i7, false));
                                    } else {
                                        c2446e.metrica((i4 - vip3.vip) - 1, i7);
                                        if ((i18 & 4) != 0) {
                                            c7850e.applovin(i19, i6);
                                            c2446e.startapp(i7, 1);
                                        }
                                    }
                                } else {
                                    i = i13;
                                    c2446e.appmetrica(i7, 1);
                                    i4++;
                                }
                                i13 = i;
                            }
                            int i20 = i12;
                            int i21 = i17;
                            for (int i22 = 0; i22 < i10; i22++) {
                                if ((iArr3[i21] & 15) == 2) {
                                    c7850e.applovin(i21, i20);
                                    c2446e.startapp(i21, 1);
                                }
                                i21++;
                                i20++;
                            }
                            size--;
                            i6 = i12;
                            c1847e = c1847e2;
                            i7 = i17;
                            iArr2 = iArr3;
                            r4 = 1;
                        }
                        c2446e.ad();
                        c1847e.ad();
                        return;
                    }
                    return;
                case 6:
                    C0731e c0731e = (C0731e) this.f33555e;
                    Typeface typeface = (Typeface) this.f33554e;
                    AbstractC14437e abstractC14437e = (AbstractC14437e) c0731e.f3025e;
                    if (abstractC14437e != null) {
                        abstractC14437e.startapp(typeface);
                        return;
                    }
                    return;
                case 7:
                    try {
                        try {
                            RunnableC3397e runnableC3397e = (RunnableC3397e) this.f33554e;
                            Object adcel = AbstractC15792e.adcel((ListenableFuture) this.f33555e);
                            C7169e c7169e = runnableC3397e.f14033e;
                            if (c7169e != null) {
                                c7169e.ad(adcel);
                            }
                        } catch (CancellationException unused) {
                            ((RunnableC3397e) this.f33554e).cancel(false);
                        }
                    } catch (ExecutionException e5) {
                        RunnableC3397e runnableC3397e2 = (RunnableC3397e) this.f33554e;
                        Throwable cause2 = e5.getCause();
                        C7169e c7169e2 = runnableC3397e2.f14033e;
                        if (c7169e2 != null) {
                            c7169e2.metrica(cause2);
                        }
                    }
                    return;
                case 8:
                    Iterator it = ((ArrayList) this.f33555e).iterator();
                    while (it.hasNext()) {
                        AbstractC8112e abstractC8112e = (AbstractC8112e) it.next();
                        Object obj3 = ((AbstractC9166e) this.f33554e).appmetrica;
                        abstractC8112e.vip = obj3;
                        abstractC8112e.license(abstractC8112e.license, obj3);
                    }
                    return;
                case 9:
                    synchronized (((ConstraintTrackingWorker) this.f33554e).f622e) {
                        if (((ConstraintTrackingWorker) this.f33554e).f620e) {
                            ((ConstraintTrackingWorker) this.f33554e).f621e.startapp(new Object());
                        } else {
                            ((ConstraintTrackingWorker) this.f33554e).f621e.mopub((ListenableFuture) this.f33555e);
                        }
                    }
                    return;
                case 10:
                    C5401e loadAd = C5401e.loadAd();
                    String str = C14026e.license;
                    C13394e c13394e = (C13394e) this.f33555e;
                    loadAd.smaato(str, AbstractC17861e.Signature("Scheduling work ", c13394e.ad), new Throwable[0]);
                    ((C14026e) this.f33554e).ad.appmetrica(c13394e);
                    return;
                case 11:
                    InterfaceC14309e interfaceC14309e = (InterfaceC14309e) this.f33554e;
                    ?? r0 = (Future) this.f33555e;
                    if ((r0 instanceof AbstractC16520e) && (vip = ((AbstractC16520e) r0).vip()) != null) {
                        interfaceC14309e.yandex(vip);
                        return;
                    }
                    try {
                        interfaceC14309e.license(AbstractC2017e.vip(r0));
                        return;
                    } catch (ExecutionException e6) {
                        interfaceC14309e.yandex(e6.getCause());
                        return;
                    } catch (Throwable th2) {
                        interfaceC14309e.yandex(th2);
                        return;
                    }
                case 12:
                    C11616e c11616e = (C11616e) this.f33555e;
                    C1246e c1246e = (C1246e) this.f33554e;
                    RecyclerView recyclerView = c1246e.subscription;
                    if (recyclerView == null || !recyclerView.isAttachedToWindow() || c11616e.mopub || c11616e.appmetrica.vip() == -1) {
                        return;
                    }
                    AbstractC2199e itemAnimator = c1246e.subscription.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.purchase()) {
                        ArrayList arrayList2 = c1246e.Signature;
                        int size2 = arrayList2.size();
                        for (int i23 = 0; i23 < size2; i23++) {
                            if (((C11616e) arrayList2.get(i23)).advert) {
                            }
                        }
                        c1246e.smaato.getClass();
                        return;
                    }
                    c1246e.subscription.post(this);
                    return;
                case 13:
                    ad();
                    return;
                case 14:
                    C11467e c11467e = (C11467e) this.f33554e;
                    C13765e c13765e = (C13765e) this.f33555e;
                    ArrayList arrayList3 = (ArrayList) c11467e.f23072e;
                    if (!arrayList3.isEmpty()) {
                        InterfaceC16274e ad = c13765e.ad();
                        if (ad != null) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                ((Bundle) it2.next()).putBinder("extra_session_binder", ad.asBinder());
                            }
                        }
                        arrayList3.clear();
                    }
                    C4363e c4363e = (C4363e) c11467e.f23070e;
                    c4363e.getClass();
                    c4363e.setSessionToken(c13765e.f27276e);
                    return;
                case 15:
                    IBinder binder = ((Messenger) ((C9770e) this.f33555e).f19315e).getBinder();
                    C17684e c17684e = (C17684e) ((ServiceC13230e) ((C12916e) this.f33554e).f25784e).f26248e.remove(binder);
                    if (c17684e != null) {
                        binder.unlinkToDeath(c17684e, 0);
                        return;
                    }
                    return;
                case 16:
                    ((C12631e) this.f33555e).accept(this.f33554e);
                    return;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    ((C13578e) this.f33554e).m3618goto((C14530e) this.f33555e, Unit.INSTANCE);
                    return;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    vip();
                    return;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    metrica();
                    return;
                case 20:
                    ExecutorC8351e executorC8351e = (ExecutorC8351e) this.f33555e;
                    try {
                        ((Runnable) this.f33554e).run();
                        return;
                    } finally {
                        executorC8351e.vip();
                    }
                case 21:
                    C2237e c2237e = ((SwipeDismissBehavior) this.f33554e).ad;
                    if (c2237e == null || !c2237e.purchase()) {
                        return;
                    }
                    View view2 = (View) this.f33555e;
                    WeakHashMap weakHashMap = AbstractC2016e.ad;
                    view2.postOnAnimation(this);
                    return;
                case 22:
                    C13578e c13578e = (C13578e) this.f33554e;
                    AbstractC0586e abstractC0586e = (AbstractC0586e) this.f33555e;
                    if (abstractC0586e.isCancelled()) {
                        c13578e.ad(null);
                        return;
                    }
                    try {
                        c13578e.billing(AbstractC17976e.vip(abstractC0586e));
                        return;
                    } catch (ExecutionException e7) {
                        c13578e.billing(new C12763e(e7.getCause()));
                        return;
                    }
                case 23:
                    C13578e c13578e2 = (C13578e) this.f33554e;
                    ListenableFuture listenableFuture = (ListenableFuture) this.f33555e;
                    if (listenableFuture.isCancelled()) {
                        c13578e2.ad(null);
                        return;
                    }
                    try {
                        c13578e2.billing(AbstractC7904e.billing(listenableFuture));
                        return;
                    } catch (ExecutionException e8) {
                        c13578e2.billing(new C12763e(e8.getCause()));
                        return;
                    }
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    C14758e c14758e = (C14758e) this.f33555e;
                    C8331e c8331e = (C8331e) this.f33554e;
                    C16680e c16680e = (C16680e) c8331e.f17058e;
                    ?? r6 = (InterfaceC2367e) c8331e.f17054e;
                    C1623e c1623e = (C1623e) c16680e.f32737e.get((C7735e) c8331e.f17055e);
                    if (c1623e == null) {
                        return;
                    }
                    if (c14758e.f29190e != 0) {
                        c1623e.amazon(c14758e, null);
                        return;
                    }
                    c8331e.f17057e = true;
                    if (r6.metrica()) {
                        if (!c8331e.f17057e || (interfaceC6840e = (InterfaceC6840e) c8331e.f17056e) == null) {
                            return;
                        }
                        ((AbstractC6785e) r6).smaato(interfaceC6840e, (Set) c8331e.f17053e);
                        return;
                    }
                    try {
                        AbstractC8031e abstractC8031e = (AbstractC8031e) r6;
                        ((AbstractC6785e) r6).smaato(null, abstractC8031e.metrica() ? abstractC8031e.ads : Collections.EMPTY_SET);
                        return;
                    } catch (SecurityException e9) {
                        Log.e("GoogleApiManager", "Failed to get service from broker. ", e9);
                        ((AbstractC6785e) r6).billing("Failed to get service from broker.");
                        c1623e.amazon(new C14758e(10, null, null), null);
                        return;
                    }
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    C2580e c2580e = (C2580e) this.f33555e;
                    InterfaceC10801e interfaceC10801e = (InterfaceC10801e) this.f33554e;
                    C9364e c9364e = (C9364e) c2580e.vip;
                    if (c9364e == null) {
                        return;
                    }
                    interfaceC10801e.ad(c9364e.ad);
                    return;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    BinderC7597e binderC7597e = (BinderC7597e) this.f33554e;
                    C8302e c8302e = (C8302e) this.f33555e;
                    binderC7597e.getClass();
                    C14758e c14758e2 = c8302e.f16977e;
                    if (c14758e2.f29190e == 0) {
                        C4694e c4694e = c8302e.f16976e;
                        AbstractC9528e.startapp(c4694e);
                        C14758e c14758e3 = c4694e.f10078e;
                        if (c14758e3.f29190e != 0) {
                            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c14758e3)), new Exception());
                            binderC7597e.adcel.metrica(c14758e3);
                            binderC7597e.startapp.purchase();
                            return;
                        }
                        C8331e c8331e2 = binderC7597e.adcel;
                        IBinder iBinder = c4694e.f10079e;
                        if (iBinder == null) {
                            r7 = 0;
                        } else {
                            int i24 = AbstractBinderC17538e.license;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            r7 = queryLocalInterface instanceof InterfaceC6840e ? (InterfaceC6840e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                        }
                        Set set = binderC7597e.billing;
                        c8331e2.getClass();
                        if (r7 == 0 || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            c8331e2.metrica(new C14758e(4, null, null));
                        } else {
                            c8331e2.f17056e = r7;
                            c8331e2.f17053e = set;
                            if (c8331e2.f17057e) {
                                ((AbstractC6785e) ((InterfaceC2367e) c8331e2.f17054e)).smaato(r7, set);
                            }
                        }
                    } else {
                        binderC7597e.adcel.metrica(c14758e2);
                    }
                    binderC7597e.startapp.purchase();
                    return;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    InterfaceC17023e interfaceC17023e = (InterfaceC17023e) this.f33555e;
                    interfaceC17023e.mo2260e();
                    if (C7936e.yandex()) {
                        interfaceC17023e.mo2262e().m2254e(this);
                        return;
                    }
                    AbstractC11861e abstractC11861e = (AbstractC11861e) this.f33554e;
                    r4 = abstractC11861e.metrica == 0 ? 0 : 1;
                    abstractC11861e.metrica = 0L;
                    if (r4 != 0) {
                        abstractC11861e.ad();
                        return;
                    }
                    return;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    ReferenceQueue referenceQueue = (ReferenceQueue) this.f33555e;
                    while (!((Set) this.f33554e).isEmpty()) {
                        try {
                            C13326e c13326e = (C13326e) referenceQueue.remove();
                            if (c13326e.ad.remove(c13326e)) {
                                c13326e.clear();
                                c13326e.vip.getClass();
                            }
                        } catch (InterruptedException unused2) {
                        }
                    }
                    return;
                default:
                    C4612e c4612e = ((BinderC12679e) this.f33555e).license;
                    C17448e c17448e = (C17448e) this.f33554e;
                    C18017e c18017e = c4612e.crashlytics;
                    C17005e c17005e = c17448e.f34175e;
                    C8023e c8023e = c17448e.f34178e;
                    if (!AbstractC5942e.metrica(c17005e, c4612e.pro)) {
                        c4612e.pro = c17005e;
                        c18017e.metrica();
                    }
                    double d = c17448e.f34176e;
                    if (Double.isNaN(d) || Math.abs(d - c4612e.tapsense) <= 1.0E-7d) {
                        z = false;
                    } else {
                        c4612e.tapsense = d;
                        z = true;
                    }
                    boolean z4 = c17448e.f34174e;
                    if (z4 != c4612e.isVip) {
                        c4612e.isVip = z4;
                        z = true;
                    }
                    C18482e c18482e = C4612e.f9940interface;
                    c18482e.vip("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(c4612e.smaato));
                    if (c18017e != null && (z || c4612e.smaato)) {
                        c18017e.purchase();
                    }
                    Double.isNaN(c17448e.f34177e);
                    int i25 = c17448e.f34173e;
                    if (i25 != c4612e.inmobi) {
                        c4612e.inmobi = i25;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c18482e.vip("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(c4612e.smaato));
                    if (c18017e != null && (z2 || c4612e.smaato)) {
                        c18017e.ad();
                    }
                    int i26 = c17448e.f34172e;
                    if (i26 != c4612e.isPro) {
                        c4612e.isPro = i26;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c18482e.vip("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(c4612e.smaato));
                    if (c18017e != null && (z3 || c4612e.smaato)) {
                        c18017e.appmetrica();
                    }
                    if (!AbstractC5942e.metrica(c4612e.applovin, c8023e)) {
                        c4612e.applovin = c8023e;
                    }
                    c4612e.smaato = false;
                    return;
            }
        } finally {
            ((RunnableC3397e) this.f33554e).f7608e = null;
        }
        ((RunnableC3397e) this.f33554e).f7608e = null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eٍؚؒ, java.lang.Object] */
    public String toString() {
        switch (this.f33556e) {
            case 0:
                return RunnableC17144e.class.getSimpleName() + "," + ((InterfaceC2295e) this.f33554e);
            case 11:
                C12894e billing = AbstractC1749e.billing(this);
                InterfaceC14309e interfaceC14309e = (InterfaceC14309e) this.f33554e;
                ?? obj = new Object();
                ((C0909e) billing.f25752e).f3321e = obj;
                billing.f25752e = obj;
                obj.f3322e = interfaceC14309e;
                return billing.toString();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Runnable runnable = (Runnable) this.f33555e;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((ExecutorC12022e) this.f33554e).f24044e;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Runnable runnable2 = (Runnable) this.f33555e;
                if (runnable2 != null) {
                    return "SequentialExecutorWorker{running=" + runnable2 + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((ExecutorC12660e) this.f33554e).f25381e;
                sb2.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
