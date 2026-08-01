package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC9463e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f18803e = 0;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C15899e f18804e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f18805e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final String f18802e = C5401e.crashlytics("ForceStopRunnable");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final long f18801e = TimeUnit.DAYS.toMillis(3650);

    public RunnableC9463e(Context context, C15899e c15899e) {
        this.f18805e = context.getApplicationContext();
        this.f18804e = c15899e;
    }

    public static void metrica(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = AbstractC12711e.ad() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + f18801e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad() {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC9463e.ad():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f18802e;
        C15899e c15899e = this.f18804e;
        try {
            if (!vip()) {
                return;
            }
            while (true) {
                AbstractC15314e.ad(this.f18805e);
                C5401e.loadAd().smaato(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    ad();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.f18803e + 1;
                    this.f18803e = i;
                    if (i >= 3) {
                        C5401e.loadAd().amazon(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        c15899e.license.getClass();
                        throw illegalStateException;
                    }
                    long j = i * 300;
                    C5401e.loadAd().smaato(str, "Retrying after " + j, e);
                    try {
                        Thread.sleep(this.f18803e * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            c15899e.yandex();
        }
    }

    public final boolean vip() {
        C11224e c11224e = this.f18804e.license;
        c11224e.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f18802e;
        if (isEmpty) {
            C5401e.loadAd().smaato(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean ad = AbstractC4617e.ad(this.f18805e, c11224e);
        C5401e.loadAd().smaato(str, "Is default app process = " + ad, new Throwable[0]);
        return ad;
    }
}
