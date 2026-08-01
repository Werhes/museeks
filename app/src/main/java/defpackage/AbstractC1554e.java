package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1554e {
    public static final String ad = C5401e.crashlytics("Alarms");

    public static void ad(int i, Context context, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C0201e.ad(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        C5401e.loadAd().smaato(ad, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void vip(Context context, C15899e c15899e, String str, long j) {
        int m354this;
        WorkDatabase workDatabase = c15899e.appmetrica;
        C15024e mopub = workDatabase.mopub();
        C17108e signatures = mopub.signatures(str);
        if (signatures != null) {
            ad(signatures.vip, context, str);
            int i = signatures.vip;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i, C0201e.ad(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        C0444e c0444e = new C0444e(workDatabase);
        synchronized (C0444e.class) {
            m354this = c0444e.m354this("next_alarm_manager_id");
        }
        mopub.isVip(new C17108e(str, m354this));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, m354this, C0201e.ad(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
