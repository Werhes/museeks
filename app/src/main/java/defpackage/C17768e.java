package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17768e {
    public static volatile C17768e yandex;
    public final ExecutorService ad;
    public boolean appmetrica;
    public volatile long billing;
    public int license;
    public final ArrayList metrica;
    public volatile InterfaceC3741e purchase;
    public final AppMeasurementSdk vip;

    public C17768e(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC17351e(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.ad = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.vip = new AppMeasurementSdk(this);
        this.metrica = new ArrayList();
        int i = 0;
        try {
            if (AbstractC15367e.advert(context, AbstractC10003e.amazon(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C17768e.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.appmetrica = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        ad(new C7078e(this, context, bundle, i));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C8374e(2, this));
        }
    }

    public static C17768e metrica(Context context, Bundle bundle) {
        AbstractC9528e.startapp(context);
        if (yandex == null) {
            synchronized (C17768e.class) {
                try {
                    if (yandex == null) {
                        yandex = new C17768e(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } finally {
                }
            }
        }
        return yandex;
    }

    public final void ad(AbstractRunnableC4951e abstractRunnableC4951e) {
        this.ad.execute(abstractRunnableC4951e);
    }

    public final long license() {
        BinderC7948e binderC7948e = new BinderC7948e();
        ad(new C6058e(this, binderC7948e, 2));
        Long l = (Long) BinderC7948e.m2360e(binderC7948e.remoteconfig(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.license + 1;
        this.license = i;
        return nextLong + i;
    }

    public final void vip(Exception exc, boolean z, boolean z2) {
        this.appmetrica |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            ad(new C1257e(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }
}
