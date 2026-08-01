package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ۟ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15749e implements InterfaceC0325e {

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final String f31014e = C5401e.crashlytics("SystemAlarmDispatcher");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C15899e f31015e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13255e f31016e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public SystemAlarmService f31017e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0912e f31018e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final ArrayList f31019e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C9327e f31020e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Intent f31021e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f31022e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Handler f31023e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C0201e f31024e;

    public C15749e(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f31022e = applicationContext;
        this.f31024e = new C0201e(applicationContext);
        this.f31016e = new C13255e();
        C15899e billing = C15899e.billing(systemAlarmService);
        this.f31015e = billing;
        C9327e c9327e = billing.yandex;
        this.f31020e = c9327e;
        this.f31018e = billing.purchase;
        c9327e.ad(this);
        this.f31019e = new ArrayList();
        this.f31021e = null;
        this.f31023e = new Handler(Looper.getMainLooper());
    }

    public final void ad(Intent intent, int i) {
        C5401e loadAd = C5401e.loadAd();
        String str = f31014e;
        loadAd.smaato(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        vip();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C5401e.loadAd().firebase(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && license()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f31019e) {
            try {
                boolean isEmpty = this.f31019e.isEmpty();
                this.f31019e.add(intent);
                if (isEmpty) {
                    billing();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void appmetrica() {
        C5401e.loadAd().smaato(f31014e, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f31020e.purchase(this);
        ScheduledExecutorService scheduledExecutorService = this.f31016e.ad;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f31017e = null;
    }

    public final void billing() {
        vip();
        PowerManager.WakeLock ad = AbstractC7293e.ad(this.f31022e, "ProcessCommand");
        try {
            ad.acquire();
            this.f31015e.purchase.license(new RunnableC10843e(this, 0));
        } finally {
            ad.release();
        }
    }

    public final boolean license() {
        vip();
        synchronized (this.f31019e) {
            try {
                Iterator it = this.f31019e.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC0325e
    public final void metrica(String str, boolean z) {
        String str2 = C0201e.f1413e;
        Intent intent = new Intent(this.f31022e, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        purchase(new RunnableC10028e(this, intent, 0, 3));
    }

    public final void purchase(Runnable runnable) {
        this.f31023e.post(runnable);
    }

    public final void vip() {
        if (this.f31023e.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }
}
