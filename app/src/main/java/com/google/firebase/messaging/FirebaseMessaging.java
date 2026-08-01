package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.AbstractC0111e;
import defpackage.AbstractC14204e;
import defpackage.AbstractC1749e;
import defpackage.AbstractC9528e;
import defpackage.C0560e;
import defpackage.C10466e;
import defpackage.C10953e;
import defpackage.C11176e;
import defpackage.C11883e;
import defpackage.C13093e;
import defpackage.C14679e;
import defpackage.C18070e;
import defpackage.C2271e;
import defpackage.C2532e;
import defpackage.C2680e;
import defpackage.C4524e;
import defpackage.C5389e;
import defpackage.C5609e;
import defpackage.C5916e;
import defpackage.C6148e;
import defpackage.C8374e;
import defpackage.C9509e;
import defpackage.C9556e;
import defpackage.ExecutorC0082e;
import defpackage.InterfaceC13242e;
import defpackage.InterfaceC4648e;
import defpackage.InterfaceC5632e;
import defpackage.InterfaceC7970e;
import defpackage.RunnableC15684e;
import defpackage.ThreadFactoryC14833e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FirebaseMessaging {
    public static final long adcel = TimeUnit.HOURS.toSeconds(8);
    public static InterfaceC7970e advert = new C11176e(5);
    public static C5389e mopub;
    public static ScheduledThreadPoolExecutor smaato;
    public final C14679e ad;
    public final C5609e appmetrica;
    public final ThreadPoolExecutor billing;
    public final C11883e license;
    public final C2532e metrica;
    public final ScheduledThreadPoolExecutor purchase;
    public boolean startapp;
    public final Context vip;
    public final C6148e yandex;

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, eِّؔ] */
    public FirebaseMessaging(C14679e c14679e, InterfaceC7970e interfaceC7970e, InterfaceC7970e interfaceC7970e2, InterfaceC4648e interfaceC4648e, InterfaceC7970e interfaceC7970e3, InterfaceC13242e interfaceC13242e) {
        c14679e.ad();
        Context context = c14679e.ad;
        final C6148e c6148e = new C6148e(context);
        c14679e.ad();
        C5916e c5916e = new C5916e(c14679e.ad);
        final ?? obj = new Object();
        obj.f6388e = c14679e;
        obj.f6386e = c6148e;
        obj.f6385e = c5916e;
        obj.f6387e = interfaceC7970e;
        obj.f6384e = interfaceC7970e2;
        obj.f6389e = interfaceC4648e;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC14833e("Firebase-Messaging-Task"));
        final int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC14833e("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC14833e("Firebase-Messaging-File-Io"));
        final int i2 = 0;
        this.startapp = false;
        advert = interfaceC7970e3;
        this.ad = c14679e;
        this.appmetrica = new C5609e(this, interfaceC13242e);
        c14679e.ad();
        final Context context2 = c14679e.ad;
        this.vip = context2;
        C8374e c8374e = new C8374e();
        this.yandex = c6148e;
        this.metrica = obj;
        this.license = new C11883e(newSingleThreadExecutor);
        this.purchase = scheduledThreadPoolExecutor;
        this.billing = threadPoolExecutor;
        c14679e.ad();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c8374e);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: eٕۙۨ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ FirebaseMessaging f30907e;

            {
                this.f30907e = this;
            }

            private final void ad() {
                FirebaseMessaging firebaseMessaging = this.f30907e;
                if (firebaseMessaging.appmetrica.smaato() && firebaseMessaging.startapp(firebaseMessaging.license())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.startapp) {
                            firebaseMessaging.yandex(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0560e license;
                int i3;
                switch (i2) {
                    case 0:
                        ad();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f30907e;
                        Context context3 = firebaseMessaging.vip;
                        AbstractC14204e.premium(context3);
                        C2532e c2532e = firebaseMessaging.metrica;
                        boolean billing = firebaseMessaging.billing();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences purchase = AbstractC9110e.purchase(context3);
                            if (!purchase.contains("proxy_retention") || purchase.getBoolean("proxy_retention", false) != billing) {
                                C5916e c5916e2 = (C5916e) c2532e.f6385e;
                                if (c5916e2.metrica.isVip() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", billing);
                                    C9556e m2611default = C9556e.m2611default(c5916e2.vip);
                                    synchronized (m2611default) {
                                        i3 = m2611default.f18970e;
                                        m2611default.f18970e = i3 + 1;
                                    }
                                    license = m2611default.m2615implements(new C2680e(i3, 4, bundle, 0));
                                } else {
                                    license = AbstractC1749e.license(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                license.purchase(new ExecutorC14279e(2), new C18108e(context3, billing, 3));
                            }
                        }
                        if (firebaseMessaging.billing()) {
                            firebaseMessaging.appmetrica();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC14833e("Firebase-Messaging-Topics-Io"));
        int i3 = C10953e.adcel;
        AbstractC1749e.metrica(scheduledThreadPoolExecutor2, new Callable() { // from class: eّْٚ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C17780e c17780e;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C6148e c6148e2 = c6148e;
                C2532e c2532e = obj;
                synchronized (C17780e.class) {
                    try {
                        WeakReference weakReference = C17780e.license;
                        c17780e = weakReference != null ? (C17780e) weakReference.get() : null;
                        if (c17780e == null) {
                            C17780e c17780e2 = new C17780e(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            c17780e2.vip();
                            C17780e.license = new WeakReference(c17780e2);
                            c17780e = c17780e2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new C10953e(firebaseMessaging, c6148e2, c17780e, c2532e, context3, scheduledThreadPoolExecutor3);
            }
        }).purchase(scheduledThreadPoolExecutor, new C10466e(this, i2));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: eٕۙۨ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ FirebaseMessaging f30907e;

            {
                this.f30907e = this;
            }

            private final void ad() {
                FirebaseMessaging firebaseMessaging = this.f30907e;
                if (firebaseMessaging.appmetrica.smaato() && firebaseMessaging.startapp(firebaseMessaging.license())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.startapp) {
                            firebaseMessaging.yandex(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0560e license;
                int i32;
                switch (i) {
                    case 0:
                        ad();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f30907e;
                        Context context3 = firebaseMessaging.vip;
                        AbstractC14204e.premium(context3);
                        C2532e c2532e = firebaseMessaging.metrica;
                        boolean billing = firebaseMessaging.billing();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences purchase = AbstractC9110e.purchase(context3);
                            if (!purchase.contains("proxy_retention") || purchase.getBoolean("proxy_retention", false) != billing) {
                                C5916e c5916e2 = (C5916e) c2532e.f6385e;
                                if (c5916e2.metrica.isVip() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", billing);
                                    C9556e m2611default = C9556e.m2611default(c5916e2.vip);
                                    synchronized (m2611default) {
                                        i32 = m2611default.f18970e;
                                        m2611default.f18970e = i32 + 1;
                                    }
                                    license = m2611default.m2615implements(new C2680e(i32, 4, bundle, 0));
                                } else {
                                    license = AbstractC1749e.license(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                license.purchase(new ExecutorC14279e(2), new C18108e(context3, billing, 3));
                            }
                        }
                        if (firebaseMessaging.billing()) {
                            firebaseMessaging.appmetrica();
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C14679e c14679e) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c14679e.vip(FirebaseMessaging.class);
            AbstractC9528e.adcel(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized C5389e metrica(Context context) {
        C5389e c5389e;
        synchronized (FirebaseMessaging.class) {
            try {
                if (mopub == null) {
                    mopub = new C5389e(context);
                }
                c5389e = mopub;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5389e;
    }

    public static void vip(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (smaato == null) {
                    smaato = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC14833e("TAG"));
                }
                smaato.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String ad() {
        C0560e c0560e;
        C13093e license = license();
        if (!startapp(license)) {
            return license.ad;
        }
        String appmetrica = C6148e.appmetrica(this.ad);
        C11883e c11883e = this.license;
        synchronized (c11883e) {
            c0560e = (C0560e) ((C2271e) c11883e.f23814e).get(appmetrica);
            if (c0560e == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + appmetrica);
                }
                C2532e c2532e = this.metrica;
                c0560e = c2532e.m878abstract(c2532e.m885e(C6148e.appmetrica((C14679e) c2532e.f6388e), "*", new Bundle())).smaato(this.billing, new C9509e(4, this, appmetrica, license)).yandex((Executor) c11883e.f23815e, new C18070e(c11883e, appmetrica, 23));
                ((C2271e) c11883e.f23814e).put(appmetrica, c0560e);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + appmetrica);
            }
        }
        try {
            return (String) AbstractC1749e.ad(c0560e);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final void appmetrica() {
        C0560e license;
        int i;
        C5916e c5916e = (C5916e) this.metrica.f6385e;
        if (c5916e.metrica.isVip() >= 241100000) {
            C9556e m2611default = C9556e.m2611default(c5916e.vip);
            Bundle bundle = Bundle.EMPTY;
            synchronized (m2611default) {
                i = m2611default.f18970e;
                m2611default.f18970e = i + 1;
            }
            license = m2611default.m2615implements(new C2680e(i, 5, bundle, 1)).billing(ExecutorC0082e.f1250e, C4524e.f9808e);
        } else {
            license = AbstractC1749e.license(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        license.purchase(this.purchase, new C10466e(this, 1));
    }

    public final boolean billing() {
        Context context = this.vip;
        AbstractC14204e.premium(context);
        if (!AbstractC14204e.firebase(context)) {
            return false;
        }
        if (this.ad.vip(InterfaceC5632e.class) != null) {
            return true;
        }
        return AbstractC0111e.vip() && advert != null;
    }

    public final C13093e license() {
        C13093e vip;
        C5389e metrica = metrica(this.vip);
        C14679e c14679e = this.ad;
        c14679e.ad();
        String license = "[DEFAULT]".equals(c14679e.vip) ? BuildConfig.FLAVOR : c14679e.license();
        String appmetrica = C6148e.appmetrica(this.ad);
        synchronized (metrica) {
            vip = C13093e.vip(((SharedPreferences) metrica.f11540e).getString(license + "|T|" + appmetrica + "|*", null));
        }
        return vip;
    }

    public final synchronized void purchase(boolean z) {
        this.startapp = z;
    }

    public final boolean startapp(C13093e c13093e) {
        if (c13093e != null) {
            return System.currentTimeMillis() > c13093e.metrica + C13093e.license || !this.yandex.metrica().equals(c13093e.vip);
        }
        return true;
    }

    public final synchronized void yandex(long j) {
        vip(new RunnableC15684e(this, Math.min(Math.max(30L, 2 * j), adcel)), j);
        this.startapp = true;
    }
}
