package defpackage;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؐٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15899e extends AbstractC7763e {
    public static C15899e advert;
    public static final Object amazon;
    public static C15899e smaato;
    public boolean adcel;
    public final WorkDatabase appmetrica;
    public final List billing;
    public final C11224e license;
    public final Context metrica;
    public BroadcastReceiver.PendingResult mopub;
    public final C0912e purchase;
    public final C13935e startapp;
    public final C9327e yandex;

    static {
        C5401e.crashlytics("WorkManagerImpl");
        advert = null;
        smaato = null;
        amazon = new Object();
    }

    public C15899e(Context context, C11224e c11224e, C0912e c0912e) {
        C5665e c5665e;
        Executor executor;
        String str;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        ExecutorC8351e executorC8351e = (ExecutorC8351e) c0912e.f3332e;
        int i = WorkDatabase.mopub;
        int i2 = 1;
        if (z) {
            c5665e = new C5665e(applicationContext, null);
            c5665e.billing = true;
        } else {
            String str2 = AbstractC15314e.ad;
            C5665e c5665e2 = new C5665e(applicationContext, "androidx.work.workdb");
            c5665e2.purchase = new C12916e(29, applicationContext);
            c5665e = c5665e2;
        }
        c5665e.license = executorC8351e;
        Object obj = new Object();
        if (c5665e.metrica == null) {
            c5665e.metrica = new ArrayList();
        }
        c5665e.metrica.add(obj);
        c5665e.ad(AbstractC16481e.appmetrica);
        c5665e.ad(new C16518e(applicationContext, 2, 3));
        c5665e.ad(AbstractC16481e.purchase);
        c5665e.ad(AbstractC16481e.billing);
        c5665e.ad(new C16518e(applicationContext, 5, 6));
        c5665e.ad(AbstractC16481e.yandex);
        c5665e.ad(AbstractC16481e.startapp);
        c5665e.ad(AbstractC16481e.adcel);
        c5665e.ad(new C16518e(applicationContext));
        c5665e.ad(new C16518e(applicationContext, 10, 11));
        c5665e.ad(AbstractC16481e.mopub);
        c5665e.yandex = false;
        c5665e.startapp = true;
        Context context2 = c5665e.vip;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = c5665e.license;
        if (executor2 == null && c5665e.appmetrica == null) {
            ExecutorC14279e executorC14279e = C9129e.advert;
            c5665e.appmetrica = executorC14279e;
            c5665e.license = executorC14279e;
        } else if (executor2 != null && c5665e.appmetrica == null) {
            c5665e.appmetrica = executor2;
        } else if (executor2 == null && (executor = c5665e.appmetrica) != null) {
            c5665e.license = executor;
        }
        if (c5665e.purchase == null) {
            c5665e.purchase = new C10659e(i2);
        }
        String str3 = c5665e.ad;
        InterfaceC2276e interfaceC2276e = c5665e.purchase;
        C4731e c4731e = c5665e.adcel;
        ArrayList arrayList = c5665e.metrica;
        boolean z2 = c5665e.billing;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        int i3 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        Executor executor3 = c5665e.license;
        C9964e c9964e = new C9964e(context2, str3, interfaceC2276e, c4731e, arrayList, z2, i3, executor3, c5665e.appmetrica, c5665e.yandex, c5665e.startapp);
        int i4 = i3;
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str4;
            } else {
                str = name + "." + str4;
            }
            AbstractC3594e abstractC3594e = (AbstractC3594e) Class.forName(str).newInstance();
            InterfaceC11216e appmetrica = abstractC3594e.appmetrica(c9964e);
            abstractC3594e.metrica = appmetrica;
            boolean z3 = i4 == 3;
            appmetrica.setWriteAheadLoggingEnabled(z3);
            abstractC3594e.billing = arrayList;
            abstractC3594e.vip = executor3;
            new ArrayDeque();
            abstractC3594e.appmetrica = z2;
            abstractC3594e.purchase = z3;
            WorkDatabase workDatabase = (WorkDatabase) abstractC3594e;
            Context applicationContext2 = context.getApplicationContext();
            byte b = 0;
            C5401e c5401e = new C5401e(c11224e.ad, b, b);
            synchronized (C5401e.class) {
                C5401e.f11578e = c5401e;
            }
            String str5 = AbstractC8250e.ad;
            C12049e c12049e = new C12049e(applicationContext2, this);
            AbstractC16736e.ad(applicationContext2, SystemJobService.class, true);
            C5401e.loadAd().smaato(AbstractC8250e.ad, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            List asList = Arrays.asList(c12049e, new C8166e(applicationContext2, c11224e, c0912e, this));
            C9327e c9327e = new C9327e(context, c11224e, c0912e, workDatabase, asList);
            Context applicationContext3 = context.getApplicationContext();
            this.metrica = applicationContext3;
            this.license = c11224e;
            this.purchase = c0912e;
            this.appmetrica = workDatabase;
            this.billing = asList;
            this.yandex = c9327e;
            this.startapp = new C13935e(workDatabase);
            this.adcel = false;
            if (Build.VERSION.SDK_INT >= 24 && applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.purchase.license(new RunnableC9463e(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + WorkDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
        }
    }

    public static C15899e billing(Context context) {
        C15899e purchase;
        synchronized (amazon) {
            try {
                purchase = purchase();
                if (purchase == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return purchase;
    }

    public static C15899e purchase() {
        synchronized (amazon) {
            try {
                C15899e c15899e = advert;
                if (c15899e != null) {
                    return c15899e;
                }
                return smaato;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void adcel(String str, C14595e c14595e) {
        RunnableC11666e runnableC11666e = new RunnableC11666e(5);
        runnableC11666e.f23445e = this;
        runnableC11666e.f23444e = str;
        runnableC11666e.f23446e = c14595e;
        this.purchase.license(runnableC11666e);
    }

    public final void mopub(String str) {
        this.purchase.license(new RunnableC14891e(this, str, false));
    }

    public final void startapp() {
        ArrayList purchase;
        String str = C12049e.f24098e;
        Context context = this.metrica;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (purchase = C12049e.purchase(context, jobScheduler)) != null && !purchase.isEmpty()) {
            Iterator it = purchase.iterator();
            while (it.hasNext()) {
                C12049e.ad(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.appmetrica;
        C4956e amazon2 = workDatabase.amazon();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) amazon2.f10517e;
        workDatabase_Impl.vip();
        C9707e c9707e = (C9707e) amazon2.f10516e;
        C1573e ad = c9707e.ad();
        workDatabase_Impl.metrica();
        try {
            ad.f4485e.executeUpdateDelete();
            workDatabase_Impl.yandex();
            workDatabase_Impl.purchase();
            c9707e.metrica(ad);
            AbstractC8250e.ad(this.license, workDatabase, this.billing);
        } catch (Throwable th) {
            workDatabase_Impl.purchase();
            c9707e.metrica(ad);
            throw th;
        }
    }

    public final void yandex() {
        synchronized (amazon) {
            try {
                this.adcel = true;
                BroadcastReceiver.PendingResult pendingResult = this.mopub;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.mopub = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
