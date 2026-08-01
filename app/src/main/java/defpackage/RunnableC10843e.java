package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10843e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C15749e f21476e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21477e;

    public /* synthetic */ RunnableC10843e(C15749e c15749e, int i) {
        this.f21477e = i;
        this.f21476e = c15749e;
    }

    private final void ad() {
        C15749e c15749e;
        RunnableC10843e runnableC10843e;
        synchronized (this.f21476e.f31019e) {
            C15749e c15749e2 = this.f21476e;
            c15749e2.f31021e = (Intent) c15749e2.f31019e.get(0);
        }
        Intent intent = this.f21476e.f31021e;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f21476e.f31021e.getIntExtra("KEY_START_ID", 0);
            C5401e loadAd = C5401e.loadAd();
            String str = C15749e.f31014e;
            int i = 1;
            loadAd.smaato(str, String.format("Processing command %s, %s", this.f21476e.f31021e, Integer.valueOf(intExtra)), new Throwable[0]);
            PowerManager.WakeLock ad = AbstractC7293e.ad(this.f21476e.f31022e, action + " (" + intExtra + ")");
            try {
                C5401e.loadAd().smaato(str, "Acquiring operation wake lock (" + action + ") " + ad, new Throwable[0]);
                ad.acquire();
                C15749e c15749e3 = this.f21476e;
                c15749e3.f31024e.appmetrica(c15749e3.f31021e, intExtra, c15749e3);
                C5401e.loadAd().smaato(str, "Releasing operation wake lock (" + action + ") " + ad, new Throwable[0]);
                ad.release();
                c15749e = this.f21476e;
                runnableC10843e = new RunnableC10843e(c15749e, i);
            } catch (Throwable th) {
                try {
                    C5401e loadAd2 = C5401e.loadAd();
                    String str2 = C15749e.f31014e;
                    loadAd2.amazon(str2, "Unexpected error in onHandleIntent", th);
                    C5401e.loadAd().smaato(str2, "Releasing operation wake lock (" + action + ") " + ad, new Throwable[0]);
                    ad.release();
                    c15749e = this.f21476e;
                    runnableC10843e = new RunnableC10843e(c15749e, i);
                } catch (Throwable th2) {
                    C5401e.loadAd().smaato(C15749e.f31014e, "Releasing operation wake lock (" + action + ") " + ad, new Throwable[0]);
                    ad.release();
                    C15749e c15749e4 = this.f21476e;
                    c15749e4.purchase(new RunnableC10843e(c15749e4, i));
                    throw th2;
                }
            }
            c15749e.purchase(runnableC10843e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21477e) {
            case 0:
                ad();
                return;
            default:
                C15749e c15749e = this.f21476e;
                C5401e loadAd = C5401e.loadAd();
                String str = C15749e.f31014e;
                loadAd.smaato(str, "Checking if commands are complete.", new Throwable[0]);
                c15749e.vip();
                synchronized (c15749e.f31019e) {
                    try {
                        if (c15749e.f31021e != null) {
                            C5401e.loadAd().smaato(str, String.format("Removing command %s", c15749e.f31021e), new Throwable[0]);
                            if (!((Intent) c15749e.f31019e.remove(0)).equals(c15749e.f31021e)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            c15749e.f31021e = null;
                        }
                        ExecutorC8351e executorC8351e = (ExecutorC8351e) c15749e.f31018e.f3332e;
                        if (!c15749e.f31024e.license() && c15749e.f31019e.isEmpty() && !executorC8351e.ad()) {
                            C5401e.loadAd().smaato(str, "No more commands & intents.", new Throwable[0]);
                            SystemAlarmService systemAlarmService = c15749e.f31017e;
                            if (systemAlarmService != null) {
                                systemAlarmService.metrica();
                            }
                        } else if (!c15749e.f31019e.isEmpty()) {
                            c15749e.billing();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
