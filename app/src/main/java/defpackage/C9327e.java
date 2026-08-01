package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9327e implements InterfaceC0325e, InterfaceC7845e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final String f18575e = C5401e.crashlytics("Processor");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final WorkDatabase f18576e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C11224e f18577e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Context f18579e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final List f18580e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0912e f18582e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final HashMap f18585e = new HashMap();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final HashMap f18586e = new HashMap();

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final HashSet f18583e = new HashSet();

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final ArrayList f18578e = new ArrayList();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public PowerManager.WakeLock f18584e = null;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final Object f18581e = new Object();

    public C9327e(Context context, C11224e c11224e, C0912e c0912e, WorkDatabase workDatabase, List list) {
        this.f18579e = context;
        this.f18577e = c11224e;
        this.f18582e = c0912e;
        this.f18576e = workDatabase;
        this.f18580e = list;
    }

    public static boolean vip(String str, RunnableC10742e runnableC10742e) {
        boolean z;
        if (runnableC10742e == null) {
            C5401e.loadAd().smaato(f18575e, AbstractC17861e.Signature("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        runnableC10742e.f21147e = true;
        runnableC10742e.startapp();
        ListenableFuture listenableFuture = runnableC10742e.f21149e;
        if (listenableFuture != null) {
            z = listenableFuture.isDone();
            runnableC10742e.f21149e.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = runnableC10742e.f21141e;
        if (listenableWorker == null || z) {
            C5401e.loadAd().smaato(RunnableC10742e.f21140e, "WorkSpec " + runnableC10742e.f21154e + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.billing();
        }
        C5401e.loadAd().smaato(f18575e, AbstractC17861e.Signature("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void ad(InterfaceC0325e interfaceC0325e) {
        synchronized (this.f18581e) {
            this.f18578e.add(interfaceC0325e);
        }
    }

    public final boolean adcel(String str) {
        boolean vip;
        synchronized (this.f18581e) {
            C5401e.loadAd().smaato(f18575e, "Processor stopping foreground work " + str, new Throwable[0]);
            vip = vip(str, (RunnableC10742e) this.f18586e.remove(str));
        }
        return vip;
    }

    public final boolean appmetrica(String str) {
        boolean z;
        synchronized (this.f18581e) {
            try {
                z = this.f18585e.containsKey(str) || this.f18586e.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public final void billing(String str, C8098e c8098e) {
        synchronized (this.f18581e) {
            try {
                C5401e.loadAd().premium(f18575e, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                RunnableC10742e runnableC10742e = (RunnableC10742e) this.f18585e.remove(str);
                if (runnableC10742e != null) {
                    if (this.f18584e == null) {
                        PowerManager.WakeLock ad = AbstractC7293e.ad(this.f18579e, "ProcessorForegroundLck");
                        this.f18584e = ad;
                        ad.acquire();
                    }
                    this.f18586e.put(str, runnableC10742e);
                    AbstractC10077e.subs(this.f18579e, C17387e.license(this.f18579e, str, c8098e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean license(String str) {
        boolean contains;
        synchronized (this.f18581e) {
            contains = this.f18583e.contains(str);
        }
        return contains;
    }

    @Override // defpackage.InterfaceC0325e
    public final void metrica(String str, boolean z) {
        synchronized (this.f18581e) {
            try {
                this.f18585e.remove(str);
                C5401e.loadAd().smaato(f18575e, C9327e.class.getSimpleName() + " " + str + " executed; reschedule = " + z, new Throwable[0]);
                Iterator it = this.f18578e.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0325e) it.next()).metrica(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean mopub(String str) {
        boolean vip;
        synchronized (this.f18581e) {
            C5401e.loadAd().smaato(f18575e, "Processor stopping background work " + str, new Throwable[0]);
            vip = vip(str, (RunnableC10742e) this.f18585e.remove(str));
        }
        return vip;
    }

    public final void purchase(InterfaceC0325e interfaceC0325e) {
        synchronized (this.f18581e) {
            this.f18578e.remove(interfaceC0325e);
        }
    }

    public final void startapp() {
        synchronized (this.f18581e) {
            try {
                if (this.f18586e.isEmpty()) {
                    Context context = this.f18579e;
                    String str = C17387e.f34081e;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f18579e.startService(intent);
                    } catch (Throwable th) {
                        C5401e.loadAd().amazon(f18575e, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f18584e;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f18584e = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [eُٖؒ, java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eؙٟۢ, eٍۡ, java.lang.Object] */
    public final boolean yandex(String str, C14595e c14595e) {
        synchronized (this.f18581e) {
            try {
                if (appmetrica(str)) {
                    C5401e.loadAd().smaato(f18575e, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f18579e;
                C11224e c11224e = this.f18577e;
                C0912e c0912e = this.f18582e;
                WorkDatabase workDatabase = this.f18576e;
                List list = Collections.EMPTY_LIST;
                Context applicationContext = context.getApplicationContext();
                List list2 = this.f18580e;
                ?? obj = new Object();
                obj.f21157e = new C14638e();
                ?? obj2 = new Object();
                obj.f21151e = obj2;
                obj.f21149e = null;
                obj.f21156e = applicationContext;
                obj.f21158e = c0912e;
                obj.f21155e = this;
                obj.f21148e = str;
                obj.f21144e = list2;
                obj.f21141e = null;
                obj.f21152e = c11224e;
                obj.f21145e = workDatabase;
                obj.f21153e = workDatabase.amazon();
                obj.f21143e = workDatabase.startapp();
                obj.f21142e = workDatabase.loadAd();
                RunnableC11666e runnableC11666e = new RunnableC11666e(2);
                runnableC11666e.f23445e = this;
                runnableC11666e.f23444e = str;
                runnableC11666e.f23446e = obj2;
                obj2.ad(runnableC11666e, (ExecutorC3044e) this.f18582e.f3333e);
                this.f18585e.put(str, obj);
                ((ExecutorC8351e) this.f18582e.f3332e).execute(obj);
                C5401e.loadAd().smaato(f18575e, AbstractC4653e.isPro(C9327e.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
