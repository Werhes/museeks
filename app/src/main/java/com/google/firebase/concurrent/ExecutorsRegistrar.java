package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC11138e;
import defpackage.C11176e;
import defpackage.C12582e;
import defpackage.C16786e;
import defpackage.C6491e;
import defpackage.C7259e;
import defpackage.C9237e;
import defpackage.InterfaceC10123e;
import defpackage.InterfaceC13161e;
import defpackage.InterfaceC4086e;
import defpackage.InterfaceC7549e;
import defpackage.ScheduledExecutorServiceC5603e;
import defpackage.ThreadFactoryC5915e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final C6491e ad = new C6491e(new C11176e(1));
    public static final C6491e vip = new C6491e(new C11176e(2));
    public static final C6491e metrica = new C6491e(new C11176e(3));
    public static final C6491e license = new C6491e(new C11176e(4));

    public static ScheduledExecutorServiceC5603e ad() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return new ScheduledExecutorServiceC5603e(Executors.newFixedThreadPool(4, new ThreadFactoryC5915e("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) license.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C16786e c16786e = new C16786e(InterfaceC7549e.class, ScheduledExecutorService.class);
        int i = 2;
        C16786e[] c16786eArr = {new C16786e(InterfaceC7549e.class, ExecutorService.class), new C16786e(InterfaceC7549e.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(c16786e);
        for (C16786e c16786e2 : c16786eArr) {
            AbstractC11138e.metrica(c16786e2, "Null interface");
        }
        Collections.addAll(hashSet, c16786eArr);
        C7259e c7259e = new C7259e(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C12582e(i), hashSet3);
        C16786e c16786e3 = new C16786e(InterfaceC10123e.class, ScheduledExecutorService.class);
        C16786e[] c16786eArr2 = {new C16786e(InterfaceC10123e.class, ExecutorService.class), new C16786e(InterfaceC10123e.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(c16786e3);
        for (C16786e c16786e4 : c16786eArr2) {
            AbstractC11138e.metrica(c16786e4, "Null interface");
        }
        Collections.addAll(hashSet4, c16786eArr2);
        C7259e c7259e2 = new C7259e(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C12582e(3), hashSet6);
        C16786e c16786e5 = new C16786e(InterfaceC4086e.class, ScheduledExecutorService.class);
        C16786e[] c16786eArr3 = {new C16786e(InterfaceC4086e.class, ExecutorService.class), new C16786e(InterfaceC4086e.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(c16786e5);
        for (C16786e c16786e6 : c16786eArr3) {
            AbstractC11138e.metrica(c16786e6, "Null interface");
        }
        Collections.addAll(hashSet7, c16786eArr3);
        C7259e c7259e3 = new C7259e(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C12582e(4), hashSet9);
        C9237e ad2 = C7259e.ad(new C16786e(InterfaceC13161e.class, Executor.class));
        ad2.billing = new C12582e(5);
        return Arrays.asList(c7259e, c7259e2, c7259e3, ad2.vip());
    }
}
