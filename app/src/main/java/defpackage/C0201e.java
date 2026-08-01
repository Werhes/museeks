package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201e implements InterfaceC0325e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final String f1413e = C5401e.crashlytics("CommandHandler");

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f1416e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final HashMap f1415e = new HashMap();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f1414e = new Object();

    public C0201e(Context context) {
        this.f1416e = context;
    }

    public static Intent ad(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent vip(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public final void appmetrica(Intent intent, int i, C15749e c15749e) {
        String action = intent.getAction();
        int i2 = 3;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C5401e.loadAd().smaato(f1413e, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.f1416e;
            C1000e c1000e = new C1000e(context, i, c15749e);
            C16000e c16000e = c1000e.vip;
            ArrayList adcel = c15749e.f31015e.appmetrica.amazon().adcel();
            String str = AbstractC14304e.ad;
            Iterator it = adcel.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                C7829e c7829e = ((C13394e) it.next()).adcel;
                z |= c7829e.license;
                z2 |= c7829e.vip;
                z3 |= c7829e.appmetrica;
                z4 |= c7829e.ad != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.ad;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            c16000e.metrica(adcel);
            ArrayList arrayList = new ArrayList(adcel.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = adcel.iterator();
            while (it2.hasNext()) {
                C13394e c13394e = (C13394e) it2.next();
                String str3 = c13394e.ad;
                if (currentTimeMillis >= c13394e.ad() && (!c13394e.vip() || c16000e.ad(str3))) {
                    arrayList.add(c13394e);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str4 = ((C13394e) it3.next()).ad;
                Intent ad = ad(context, str4);
                C5401e.loadAd().smaato(C1000e.metrica, AbstractC5087e.m1746extends("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                c15749e.purchase(new RunnableC10028e(c15749e, ad, c1000e.ad, i2));
            }
            c16000e.license();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            C5401e.loadAd().smaato(f1413e, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            c15749e.f31015e.startapp();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            C5401e.loadAd().amazon(f1413e, AbstractC5087e.m1746extends("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f1414e) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        C5401e loadAd = C5401e.loadAd();
                        String str5 = f1413e;
                        loadAd.smaato(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.f1415e.containsKey(string)) {
                            C5401e.loadAd().smaato(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            C6546e c6546e = new C6546e(this.f1416e, i, string, c15749e);
                            this.f1415e.put(string, c6546e);
                            c6546e.license();
                        }
                    } finally {
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    C5401e.loadAd().firebase(f1413e, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z5 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                C5401e.loadAd().smaato(f1413e, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
                metrica(string2, z5);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            C5401e.loadAd().smaato(f1413e, AbstractC17861e.Signature("Handing stopWork work for ", string3), new Throwable[0]);
            c15749e.f31015e.mopub(string3);
            Context context2 = this.f1416e;
            C15899e c15899e = c15749e.f31015e;
            String str6 = AbstractC1554e.ad;
            C15024e mopub = c15899e.appmetrica.mopub();
            C17108e signatures = mopub.signatures(string3);
            if (signatures != null) {
                AbstractC1554e.ad(signatures.vip, context2, string3);
                C5401e.loadAd().smaato(AbstractC1554e.ad, AbstractC5087e.m1746extends("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                mopub.applovin(string3);
            }
            c15749e.metrica(string3, false);
            return;
        }
        Context context3 = this.f1416e;
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C5401e loadAd2 = C5401e.loadAd();
        String str7 = f1413e;
        loadAd2.smaato(str7, AbstractC17861e.Signature("Handling schedule work for ", string4), new Throwable[0]);
        C15899e c15899e2 = c15749e.f31015e;
        WorkDatabase workDatabase = c15899e2.appmetrica;
        workDatabase.metrica();
        try {
            C13394e amazon = workDatabase.amazon().amazon(string4);
            if (amazon == null) {
                C5401e.loadAd().firebase(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (amazon.vip.ad()) {
                C5401e.loadAd().firebase(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
                return;
            }
            long ad2 = amazon.ad();
            if (amazon.vip()) {
                C5401e.loadAd().smaato(str7, "Opportunistically setting an alarm for " + string4 + " at " + ad2, new Throwable[0]);
                AbstractC1554e.vip(context3, c15899e2, string4, ad2);
                Intent intent3 = new Intent(context3, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                c15749e.purchase(new RunnableC10028e(c15749e, intent3, i, 3));
            } else {
                C5401e.loadAd().smaato(str7, "Setting up Alarms for " + string4 + " at " + ad2, new Throwable[0]);
                AbstractC1554e.vip(context3, c15899e2, string4, ad2);
            }
            workDatabase.yandex();
        } finally {
            workDatabase.purchase();
        }
    }

    public final boolean license() {
        boolean z;
        synchronized (this.f1414e) {
            z = !this.f1415e.isEmpty();
        }
        return z;
    }

    @Override // defpackage.InterfaceC0325e
    public final void metrica(String str, boolean z) {
        synchronized (this.f1414e) {
            try {
                InterfaceC0325e interfaceC0325e = (InterfaceC0325e) this.f1415e.remove(str);
                if (interfaceC0325e != null) {
                    interfaceC0325e.metrica(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
