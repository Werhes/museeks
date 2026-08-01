package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15531e {
    public final Object ad;
    public final String adcel;
    public final AtomicInteger advert;
    public long appmetrica;
    public boolean billing;
    public ScheduledFuture license;
    public int metrica;
    public final HashMap mopub;
    public final HashSet purchase;
    public final ScheduledExecutorService smaato;
    public final C17647e startapp;
    public final PowerManager.WakeLock vip;
    public C9536e yandex;
    public static final long amazon = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService loadAd = null;
    public static final Object Signature = new Object();

    public C15531e(Context context) {
        String packageName = context.getPackageName();
        this.ad = new Object();
        this.metrica = 0;
        this.purchase = new HashSet();
        this.billing = true;
        this.startapp = C17647e.f34570e;
        this.mopub = new HashMap();
        this.advert = new AtomicInteger(0);
        AbstractC9528e.billing("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.yandex = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.adcel = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.adcel = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new C14803e(sb.toString(), 21, (byte) 0);
        }
        this.vip = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (AbstractC2862e.ad(context)) {
            int i = AbstractC11450e.ad;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo vip = C5277e.ad(context).vip(0, packageName);
                    if (vip == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = vip.uid;
                        workSource = new WorkSource();
                        Method method = AbstractC2862e.vip;
                        if (method != null) {
                            try {
                                method.invoke(workSource, Integer.valueOf(i2), packageName);
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            Method method2 = AbstractC2862e.ad;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, Integer.valueOf(i2));
                                } catch (Exception e2) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.vip.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
                    Log.wtf("WakeLock", e3.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = loadAd;
        if (scheduledExecutorService == null) {
            synchronized (Signature) {
                try {
                    scheduledExecutorService = loadAd;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        loadAd = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.smaato = scheduledExecutorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ad(long j) {
        this.advert.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, amazon), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.ad) {
            try {
                if (!vip()) {
                    this.yandex = C9536e.f18901e;
                    this.vip.acquire();
                    this.startapp.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.metrica++;
                if (this.billing) {
                    TextUtils.isEmpty(null);
                }
                C6138e c6138e = (C6138e) this.mopub.get(null);
                C6138e c6138e2 = c6138e;
                if (c6138e == null) {
                    Object obj = new Object();
                    this.mopub.put(null, obj);
                    c6138e2 = obj;
                }
                c6138e2.ad++;
                this.startapp.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j2 > this.appmetrica) {
                    this.appmetrica = j2;
                    ScheduledFuture scheduledFuture = this.license;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.license = this.smaato.schedule(new RunnableC16721e(8, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void appmetrica() {
        synchronized (this.ad) {
            try {
                if (vip()) {
                    if (this.billing) {
                        int i = this.metrica - 1;
                        this.metrica = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.metrica = 0;
                    }
                    license();
                    Iterator it = this.mopub.values().iterator();
                    while (it.hasNext()) {
                        ((C6138e) it.next()).ad = 0;
                    }
                    this.mopub.clear();
                    ScheduledFuture scheduledFuture = this.license;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.license = null;
                        this.appmetrica = 0L;
                    }
                    if (this.vip.isHeld()) {
                        try {
                            try {
                                this.vip.release();
                                if (this.yandex != null) {
                                    this.yandex = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.adcel).concat(" failed to release!"), e);
                                if (this.yandex != null) {
                                    this.yandex = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.yandex != null) {
                                this.yandex = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.adcel).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void license() {
        HashSet hashSet = this.purchase;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void metrica() {
        if (this.advert.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.adcel).concat(" release without a matched acquire!"));
        }
        synchronized (this.ad) {
            try {
                if (this.billing) {
                    TextUtils.isEmpty(null);
                }
                if (this.mopub.containsKey(null)) {
                    C6138e c6138e = (C6138e) this.mopub.get(null);
                    if (c6138e != null) {
                        int i = c6138e.ad - 1;
                        c6138e.ad = i;
                        if (i == 0) {
                            this.mopub.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.adcel).concat(" counter does not exist"));
                }
                appmetrica();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean vip() {
        boolean z;
        synchronized (this.ad) {
            z = this.metrica > 0;
        }
        return z;
    }
}
