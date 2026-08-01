package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4956e implements InterfaceC10283e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f10511e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f10512e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f10513e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f10514e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f10515e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f10516e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f10517e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f10518e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f10519e;

    public C4956e(WorkDatabase_Impl workDatabase_Impl) {
        this.f10517e = workDatabase_Impl;
        this.f10513e = new C3606e(workDatabase_Impl, 4);
        this.f10512e = new C9707e(workDatabase_Impl, 3);
        this.f10515e = new C9707e(workDatabase_Impl, 4);
        this.f10511e = new C9707e(workDatabase_Impl, 5);
        this.f10519e = new C9707e(workDatabase_Impl, 6);
        this.f10518e = new C9707e(workDatabase_Impl, 7);
        this.f10514e = new C9707e(workDatabase_Impl, 8);
        this.f10516e = new C9707e(workDatabase_Impl, 9);
        new AtomicBoolean(false);
    }

    public C4956e(C18277e c18277e, InterfaceC11824e interfaceC11824e, InterfaceC15498e interfaceC15498e, C17221e c17221e, C5311e c5311e, AbstractC8470e abstractC8470e, InterfaceC7794e interfaceC7794e, C5306e c5306e, List list) {
        String signatures;
        this.f10517e = c18277e;
        this.f10513e = interfaceC11824e;
        this.f10512e = interfaceC15498e;
        this.f10515e = c17221e;
        this.f10511e = c5311e;
        this.f10519e = abstractC8470e;
        this.f10518e = interfaceC7794e;
        this.f10514e = new C5306e(this, c5306e, list, "Deserializer for \"" + interfaceC15498e.getName() + '\"', (interfaceC7794e == null || (signatures = interfaceC7794e.signatures()) == null) ? "[container not found]" : signatures);
        this.f10516e = new C9864e(this);
    }

    public static void subscription(JSONObject jSONObject, String str) {
        StringBuilder inmobi = AbstractC8703e.inmobi(str);
        inmobi.append(jSONObject.toString());
        String sb = inmobi.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb, null);
        }
    }

    public int Signature(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        workDatabase_Impl.vip();
        C9707e c9707e = (C9707e) this.f10519e;
        C1573e ad = c9707e.ad();
        if (str == null) {
            ad.advert(1);
        } else {
            ad.loadAd(1, str);
        }
        workDatabase_Impl.metrica();
        try {
            int executeUpdateDelete = ad.f4485e.executeUpdateDelete();
            workDatabase_Impl.yandex();
            return executeUpdateDelete;
        } finally {
            workDatabase_Impl.purchase();
            c9707e.metrica(ad);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [eٕ٘ؔ] */
    /* JADX WARN: Type inference failed for: r0v7, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [eٕ٘ؔ] */
    public void ad(C2271e c2271e) {
        ArrayList arrayList;
        C15627e c15627e = (C15627e) c2271e.keySet();
        C2271e c2271e2 = c15627e.f30814e;
        if (c2271e2.isEmpty()) {
            return;
        }
        if (c2271e.f34352e > 999) {
            ?? c17519e = new C17519e(999);
            int i = c2271e.f34352e;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                c17519e.put((String) c2271e.purchase(i2), (ArrayList) c2271e.startapp(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    ad(c17519e);
                    c17519e = new C17519e(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                ad(c17519e);
                return;
            }
            return;
        }
        StringBuilder inmobi = AbstractC8703e.inmobi("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int i4 = c2271e2.f34352e;
        AbstractC18209e.ad(i4, inmobi);
        inmobi.append(")");
        C6096e purchase = C6096e.purchase(i4, inmobi.toString());
        Iterator it = c15627e.iterator();
        int i5 = 1;
        while (true) {
            C6748e c6748e = (C6748e) it;
            if (!c6748e.hasNext()) {
                break;
            }
            String str = (String) c6748e.next();
            if (str == null) {
                purchase.loadAd(i5);
            } else {
                purchase.Signature(i5, str);
            }
            i5++;
        }
        Cursor billing = ((WorkDatabase_Impl) this.f10517e).billing(purchase);
        try {
            int columnIndex = billing.getColumnIndex("work_spec_id");
            if (columnIndex < 0) {
                columnIndex = billing.getColumnIndex("`work_spec_id`");
            }
            if (columnIndex == -1) {
                return;
            }
            while (billing.moveToNext()) {
                if (!billing.isNull(columnIndex) && (arrayList = (ArrayList) c2271e.get(billing.getString(columnIndex))) != null) {
                    arrayList.add(C13198e.ad(billing.getBlob(0)));
                }
            }
        } finally {
            billing.close();
        }
    }

    public ArrayList adcel() {
        C6096e c6096e;
        int startapp;
        int startapp2;
        int startapp3;
        int startapp4;
        int startapp5;
        int startapp6;
        int startapp7;
        int startapp8;
        int startapp9;
        int startapp10;
        int startapp11;
        int startapp12;
        int startapp13;
        C6096e purchase = C6096e.purchase(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        workDatabase_Impl.vip();
        Cursor billing = workDatabase_Impl.billing(purchase);
        try {
            startapp = AbstractC12640e.startapp(billing, "required_network_type");
            startapp2 = AbstractC12640e.startapp(billing, "requires_charging");
            startapp3 = AbstractC12640e.startapp(billing, "requires_device_idle");
            startapp4 = AbstractC12640e.startapp(billing, "requires_battery_not_low");
            startapp5 = AbstractC12640e.startapp(billing, "requires_storage_not_low");
            startapp6 = AbstractC12640e.startapp(billing, "trigger_content_update_delay");
            startapp7 = AbstractC12640e.startapp(billing, "trigger_max_content_delay");
            startapp8 = AbstractC12640e.startapp(billing, "content_uri_triggers");
            startapp9 = AbstractC12640e.startapp(billing, "id");
            startapp10 = AbstractC12640e.startapp(billing, "state");
            startapp11 = AbstractC12640e.startapp(billing, "worker_class_name");
            startapp12 = AbstractC12640e.startapp(billing, "input_merger_class_name");
            startapp13 = AbstractC12640e.startapp(billing, "input");
            c6096e = purchase;
        } catch (Throwable th) {
            th = th;
            c6096e = purchase;
        }
        try {
            int startapp14 = AbstractC12640e.startapp(billing, "output");
            int startapp15 = AbstractC12640e.startapp(billing, "initial_delay");
            int startapp16 = AbstractC12640e.startapp(billing, "interval_duration");
            int startapp17 = AbstractC12640e.startapp(billing, "flex_duration");
            int startapp18 = AbstractC12640e.startapp(billing, "run_attempt_count");
            int startapp19 = AbstractC12640e.startapp(billing, "backoff_policy");
            int startapp20 = AbstractC12640e.startapp(billing, "backoff_delay_duration");
            int startapp21 = AbstractC12640e.startapp(billing, "period_start_time");
            int startapp22 = AbstractC12640e.startapp(billing, "minimum_retention_duration");
            int startapp23 = AbstractC12640e.startapp(billing, "schedule_requested_at");
            int startapp24 = AbstractC12640e.startapp(billing, "run_in_foreground");
            int startapp25 = AbstractC12640e.startapp(billing, "out_of_quota_policy");
            int i = startapp14;
            ArrayList arrayList = new ArrayList(billing.getCount());
            while (billing.moveToNext()) {
                String string = billing.getString(startapp9);
                int i2 = startapp9;
                String string2 = billing.getString(startapp11);
                int i3 = startapp11;
                C7829e c7829e = new C7829e();
                int i4 = startapp;
                c7829e.ad = AbstractC11203e.purchase(billing.getInt(startapp));
                c7829e.vip = billing.getInt(startapp2) != 0;
                c7829e.metrica = billing.getInt(startapp3) != 0;
                c7829e.license = billing.getInt(startapp4) != 0;
                c7829e.appmetrica = billing.getInt(startapp5) != 0;
                int i5 = startapp2;
                c7829e.purchase = billing.getLong(startapp6);
                c7829e.billing = billing.getLong(startapp7);
                c7829e.yandex = AbstractC11203e.ad(billing.getBlob(startapp8));
                C13394e c13394e = new C13394e(string, string2);
                c13394e.vip = AbstractC11203e.yandex(billing.getInt(startapp10));
                c13394e.license = billing.getString(startapp12);
                c13394e.appmetrica = C13198e.ad(billing.getBlob(startapp13));
                int i6 = i;
                c13394e.purchase = C13198e.ad(billing.getBlob(i6));
                int i7 = startapp13;
                i = i6;
                int i8 = startapp15;
                c13394e.billing = billing.getLong(i8);
                startapp15 = i8;
                int i9 = startapp3;
                int i10 = startapp16;
                c13394e.yandex = billing.getLong(i10);
                startapp16 = i10;
                int i11 = startapp17;
                c13394e.startapp = billing.getLong(i11);
                int i12 = startapp18;
                c13394e.mopub = billing.getInt(i12);
                int i13 = startapp19;
                startapp18 = i12;
                c13394e.advert = AbstractC11203e.appmetrica(billing.getInt(i13));
                startapp17 = i11;
                int i14 = startapp20;
                c13394e.smaato = billing.getLong(i14);
                startapp20 = i14;
                int i15 = startapp21;
                c13394e.amazon = billing.getLong(i15);
                startapp21 = i15;
                int i16 = startapp22;
                c13394e.loadAd = billing.getLong(i16);
                startapp22 = i16;
                int i17 = startapp23;
                c13394e.Signature = billing.getLong(i17);
                int i18 = startapp24;
                c13394e.admob = billing.getInt(i18) != 0;
                int i19 = startapp25;
                startapp24 = i18;
                c13394e.subscription = AbstractC11203e.billing(billing.getInt(i19));
                c13394e.adcel = c7829e;
                arrayList.add(c13394e);
                startapp19 = i13;
                startapp3 = i9;
                startapp25 = i19;
                startapp23 = i17;
                startapp13 = i7;
                startapp9 = i2;
                startapp11 = i3;
                startapp = i4;
                startapp2 = i5;
            }
            billing.close();
            c6096e.isVip();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            billing.close();
            c6096e.isVip();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0426 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, eؗ٘ٔ] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, eؗ٘ٔ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void admob(defpackage.C7869e r47, int r48) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4956e.admob(eًُۧ, int):void");
    }

    public EnumC7300e advert(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        C6096e purchase = C6096e.purchase(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            purchase.loadAd(1);
        } else {
            purchase.Signature(1, str);
        }
        workDatabase_Impl.vip();
        Cursor billing = workDatabase_Impl.billing(purchase);
        try {
            return billing.moveToFirst() ? AbstractC11203e.yandex(billing.getInt(0)) : null;
        } finally {
            billing.close();
            purchase.isVip();
        }
    }

    public C13394e amazon(String str) {
        C6096e c6096e;
        int startapp;
        int startapp2;
        int startapp3;
        int startapp4;
        int startapp5;
        int startapp6;
        int startapp7;
        int startapp8;
        int startapp9;
        int startapp10;
        int startapp11;
        int startapp12;
        int startapp13;
        int startapp14;
        C13394e c13394e;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        C6096e purchase = C6096e.purchase(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            purchase.loadAd(1);
        } else {
            purchase.Signature(1, str);
        }
        workDatabase_Impl.vip();
        Cursor billing = workDatabase_Impl.billing(purchase);
        try {
            startapp = AbstractC12640e.startapp(billing, "required_network_type");
            startapp2 = AbstractC12640e.startapp(billing, "requires_charging");
            startapp3 = AbstractC12640e.startapp(billing, "requires_device_idle");
            startapp4 = AbstractC12640e.startapp(billing, "requires_battery_not_low");
            startapp5 = AbstractC12640e.startapp(billing, "requires_storage_not_low");
            startapp6 = AbstractC12640e.startapp(billing, "trigger_content_update_delay");
            startapp7 = AbstractC12640e.startapp(billing, "trigger_max_content_delay");
            startapp8 = AbstractC12640e.startapp(billing, "content_uri_triggers");
            startapp9 = AbstractC12640e.startapp(billing, "id");
            startapp10 = AbstractC12640e.startapp(billing, "state");
            startapp11 = AbstractC12640e.startapp(billing, "worker_class_name");
            startapp12 = AbstractC12640e.startapp(billing, "input_merger_class_name");
            startapp13 = AbstractC12640e.startapp(billing, "input");
            startapp14 = AbstractC12640e.startapp(billing, "output");
            c6096e = purchase;
        } catch (Throwable th) {
            th = th;
            c6096e = purchase;
        }
        try {
            int startapp15 = AbstractC12640e.startapp(billing, "initial_delay");
            int startapp16 = AbstractC12640e.startapp(billing, "interval_duration");
            int startapp17 = AbstractC12640e.startapp(billing, "flex_duration");
            int startapp18 = AbstractC12640e.startapp(billing, "run_attempt_count");
            int startapp19 = AbstractC12640e.startapp(billing, "backoff_policy");
            int startapp20 = AbstractC12640e.startapp(billing, "backoff_delay_duration");
            int startapp21 = AbstractC12640e.startapp(billing, "period_start_time");
            int startapp22 = AbstractC12640e.startapp(billing, "minimum_retention_duration");
            int startapp23 = AbstractC12640e.startapp(billing, "schedule_requested_at");
            int startapp24 = AbstractC12640e.startapp(billing, "run_in_foreground");
            int startapp25 = AbstractC12640e.startapp(billing, "out_of_quota_policy");
            if (billing.moveToFirst()) {
                String string = billing.getString(startapp9);
                String string2 = billing.getString(startapp11);
                C7829e c7829e = new C7829e();
                c7829e.ad = AbstractC11203e.purchase(billing.getInt(startapp));
                c7829e.vip = billing.getInt(startapp2) != 0;
                c7829e.metrica = billing.getInt(startapp3) != 0;
                c7829e.license = billing.getInt(startapp4) != 0;
                c7829e.appmetrica = billing.getInt(startapp5) != 0;
                c7829e.purchase = billing.getLong(startapp6);
                c7829e.billing = billing.getLong(startapp7);
                c7829e.yandex = AbstractC11203e.ad(billing.getBlob(startapp8));
                c13394e = new C13394e(string, string2);
                c13394e.vip = AbstractC11203e.yandex(billing.getInt(startapp10));
                c13394e.license = billing.getString(startapp12);
                c13394e.appmetrica = C13198e.ad(billing.getBlob(startapp13));
                c13394e.purchase = C13198e.ad(billing.getBlob(startapp14));
                c13394e.billing = billing.getLong(startapp15);
                c13394e.yandex = billing.getLong(startapp16);
                c13394e.startapp = billing.getLong(startapp17);
                c13394e.mopub = billing.getInt(startapp18);
                c13394e.advert = AbstractC11203e.appmetrica(billing.getInt(startapp19));
                c13394e.smaato = billing.getLong(startapp20);
                c13394e.amazon = billing.getLong(startapp21);
                c13394e.loadAd = billing.getLong(startapp22);
                c13394e.Signature = billing.getLong(startapp23);
                c13394e.admob = billing.getInt(startapp24) != 0;
                c13394e.subscription = AbstractC11203e.billing(billing.getInt(startapp25));
                c13394e.adcel = c7829e;
            } else {
                c13394e = null;
            }
            billing.close();
            c6096e.isVip();
            return c13394e;
        } catch (Throwable th2) {
            th = th2;
            billing.close();
            c6096e.isVip();
            throw th;
        }
    }

    public void appmetrica(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        workDatabase_Impl.vip();
        C9707e c9707e = (C9707e) this.f10512e;
        C1573e ad = c9707e.ad();
        if (str == null) {
            ad.advert(1);
        } else {
            ad.loadAd(1, str);
        }
        workDatabase_Impl.metrica();
        try {
            ad.crashlytics();
            workDatabase_Impl.yandex();
        } finally {
            workDatabase_Impl.purchase();
            c9707e.metrica(ad);
        }
    }

    public C13827e billing(int i) {
        C13827e c13827e = null;
        try {
            if (!AbstractC8703e.adcel(2, i)) {
                JSONObject m2370protected = ((C7988e) this.f10511e).m2370protected();
                if (m2370protected != null) {
                    C13827e m3751while = ((C13935e) this.f10512e).m3751while(m2370protected);
                    subscription(m2370protected, "Loaded cached settings: ");
                    ((C9821e) this.f10515e).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (AbstractC8703e.adcel(3, i) || m3751while.metrica >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return m3751while;
                        } catch (Exception e) {
                            e = e;
                            c13827e = m3751while;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return c13827e;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // defpackage.InterfaceC10283e
    public View getRoot() {
        return (FrameLayout) this.f10517e;
    }

    public int isVip(EnumC7300e enumC7300e, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        workDatabase_Impl.vip();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=? WHERE id IN (");
        AbstractC18209e.ad(strArr.length, sb);
        sb.append(")");
        String sb2 = sb.toString();
        workDatabase_Impl.ad();
        workDatabase_Impl.vip();
        SQLiteStatement compileStatement = ((SQLiteDatabase) workDatabase_Impl.metrica.getWritableDatabase().f10118e).compileStatement(sb2);
        compileStatement.bindLong(1, AbstractC11203e.mopub(enumC7300e));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, str);
            }
            i++;
        }
        workDatabase_Impl.metrica();
        try {
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            workDatabase_Impl.yandex();
            return executeUpdateDelete;
        } finally {
            workDatabase_Impl.purchase();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [eًؗۨ, java.lang.Object] */
    public ArrayList loadAd(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        C6096e purchase = C6096e.purchase(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            purchase.loadAd(1);
        } else {
            purchase.Signature(1, str);
        }
        workDatabase_Impl.vip();
        Cursor billing = workDatabase_Impl.billing(purchase);
        try {
            int startapp = AbstractC12640e.startapp(billing, "id");
            int startapp2 = AbstractC12640e.startapp(billing, "state");
            ArrayList arrayList = new ArrayList(billing.getCount());
            while (billing.moveToNext()) {
                ?? obj = new Object();
                obj.ad = billing.getString(startapp);
                obj.vip = AbstractC11203e.yandex(billing.getInt(startapp2));
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            billing.close();
            purchase.isVip();
        }
    }

    public C4956e metrica(InterfaceC15498e interfaceC15498e, List list, InterfaceC11824e interfaceC11824e, C17221e c17221e, C5311e c5311e, AbstractC8470e abstractC8470e) {
        C18277e c18277e = (C18277e) this.f10517e;
        int i = abstractC8470e.vip;
        if ((i != 1 || abstractC8470e.metrica < 4) && i <= 1) {
            c5311e = (C5311e) this.f10511e;
        }
        return new C4956e(c18277e, interfaceC11824e, interfaceC15498e, c17221e, c5311e, abstractC8470e, (InterfaceC7794e) this.f10518e, (C5306e) this.f10514e, list);
    }

    public C13827e mopub() {
        return (C13827e) ((AtomicReference) this.f10514e).get();
    }

    public int pro(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        workDatabase_Impl.vip();
        C9707e c9707e = (C9707e) this.f10518e;
        C1573e ad = c9707e.ad();
        if (str == null) {
            ad.advert(1);
        } else {
            ad.loadAd(1, str);
        }
        workDatabase_Impl.metrica();
        try {
            int executeUpdateDelete = ad.f4485e.executeUpdateDelete();
            workDatabase_Impl.yandex();
            return executeUpdateDelete;
        } finally {
            workDatabase_Impl.purchase();
            c9707e.metrica(ad);
        }
    }

    public ArrayList purchase() {
        C6096e c6096e;
        C6096e purchase = C6096e.purchase(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        purchase.advert(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        workDatabase_Impl.vip();
        Cursor billing = workDatabase_Impl.billing(purchase);
        try {
            int startapp = AbstractC12640e.startapp(billing, "required_network_type");
            int startapp2 = AbstractC12640e.startapp(billing, "requires_charging");
            int startapp3 = AbstractC12640e.startapp(billing, "requires_device_idle");
            int startapp4 = AbstractC12640e.startapp(billing, "requires_battery_not_low");
            int startapp5 = AbstractC12640e.startapp(billing, "requires_storage_not_low");
            int startapp6 = AbstractC12640e.startapp(billing, "trigger_content_update_delay");
            int startapp7 = AbstractC12640e.startapp(billing, "trigger_max_content_delay");
            int startapp8 = AbstractC12640e.startapp(billing, "content_uri_triggers");
            int startapp9 = AbstractC12640e.startapp(billing, "id");
            int startapp10 = AbstractC12640e.startapp(billing, "state");
            int startapp11 = AbstractC12640e.startapp(billing, "worker_class_name");
            int startapp12 = AbstractC12640e.startapp(billing, "input_merger_class_name");
            int startapp13 = AbstractC12640e.startapp(billing, "input");
            c6096e = purchase;
            try {
                int startapp14 = AbstractC12640e.startapp(billing, "output");
                int startapp15 = AbstractC12640e.startapp(billing, "initial_delay");
                int startapp16 = AbstractC12640e.startapp(billing, "interval_duration");
                int startapp17 = AbstractC12640e.startapp(billing, "flex_duration");
                int startapp18 = AbstractC12640e.startapp(billing, "run_attempt_count");
                int startapp19 = AbstractC12640e.startapp(billing, "backoff_policy");
                int startapp20 = AbstractC12640e.startapp(billing, "backoff_delay_duration");
                int startapp21 = AbstractC12640e.startapp(billing, "period_start_time");
                int startapp22 = AbstractC12640e.startapp(billing, "minimum_retention_duration");
                int startapp23 = AbstractC12640e.startapp(billing, "schedule_requested_at");
                int startapp24 = AbstractC12640e.startapp(billing, "run_in_foreground");
                int startapp25 = AbstractC12640e.startapp(billing, "out_of_quota_policy");
                int i = startapp14;
                ArrayList arrayList = new ArrayList(billing.getCount());
                while (billing.moveToNext()) {
                    String string = billing.getString(startapp9);
                    int i2 = startapp9;
                    String string2 = billing.getString(startapp11);
                    int i3 = startapp11;
                    C7829e c7829e = new C7829e();
                    int i4 = startapp;
                    c7829e.ad = AbstractC11203e.purchase(billing.getInt(startapp));
                    c7829e.vip = billing.getInt(startapp2) != 0;
                    c7829e.metrica = billing.getInt(startapp3) != 0;
                    c7829e.license = billing.getInt(startapp4) != 0;
                    c7829e.appmetrica = billing.getInt(startapp5) != 0;
                    int i5 = startapp2;
                    c7829e.purchase = billing.getLong(startapp6);
                    c7829e.billing = billing.getLong(startapp7);
                    c7829e.yandex = AbstractC11203e.ad(billing.getBlob(startapp8));
                    C13394e c13394e = new C13394e(string, string2);
                    c13394e.vip = AbstractC11203e.yandex(billing.getInt(startapp10));
                    c13394e.license = billing.getString(startapp12);
                    c13394e.appmetrica = C13198e.ad(billing.getBlob(startapp13));
                    int i6 = i;
                    c13394e.purchase = C13198e.ad(billing.getBlob(i6));
                    int i7 = startapp13;
                    i = i6;
                    int i8 = startapp15;
                    c13394e.billing = billing.getLong(i8);
                    startapp15 = i8;
                    int i9 = startapp3;
                    int i10 = startapp16;
                    c13394e.yandex = billing.getLong(i10);
                    startapp16 = i10;
                    int i11 = startapp17;
                    c13394e.startapp = billing.getLong(i11);
                    int i12 = startapp18;
                    c13394e.mopub = billing.getInt(i12);
                    int i13 = startapp19;
                    startapp18 = i12;
                    c13394e.advert = AbstractC11203e.appmetrica(billing.getInt(i13));
                    startapp17 = i11;
                    int i14 = startapp20;
                    c13394e.smaato = billing.getLong(i14);
                    startapp20 = i14;
                    int i15 = startapp21;
                    c13394e.amazon = billing.getLong(i15);
                    startapp21 = i15;
                    int i16 = startapp22;
                    c13394e.loadAd = billing.getLong(i16);
                    startapp22 = i16;
                    int i17 = startapp23;
                    c13394e.Signature = billing.getLong(i17);
                    int i18 = startapp24;
                    c13394e.admob = billing.getInt(i18) != 0;
                    int i19 = startapp25;
                    startapp24 = i18;
                    c13394e.subscription = AbstractC11203e.billing(billing.getInt(i19));
                    c13394e.adcel = c7829e;
                    arrayList.add(c13394e);
                    startapp19 = i13;
                    startapp3 = i9;
                    startapp25 = i19;
                    startapp23 = i17;
                    startapp13 = i7;
                    startapp9 = i2;
                    startapp11 = i3;
                    startapp = i4;
                    startapp2 = i5;
                }
                billing.close();
                c6096e.isVip();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                billing.close();
                c6096e.isVip();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c6096e = purchase;
        }
    }

    public int remoteconfig(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        workDatabase_Impl.vip();
        C9707e c9707e = (C9707e) this.f10514e;
        C1573e ad = c9707e.ad();
        ad.purchase(1, j);
        if (str == null) {
            ad.advert(2);
        } else {
            ad.loadAd(2, str);
        }
        workDatabase_Impl.metrica();
        try {
            int executeUpdateDelete = ad.f4485e.executeUpdateDelete();
            workDatabase_Impl.yandex();
            return executeUpdateDelete;
        } finally {
            workDatabase_Impl.purchase();
            c9707e.metrica(ad);
        }
    }

    public void signatures(String str, C13198e c13198e) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        workDatabase_Impl.vip();
        C9707e c9707e = (C9707e) this.f10515e;
        C1573e ad = c9707e.ad();
        byte[] vip = C13198e.vip(c13198e);
        if (vip == null) {
            ad.advert(1);
        } else {
            ad.license(1, vip);
        }
        if (str == null) {
            ad.advert(2);
        } else {
            ad.loadAd(2, str);
        }
        workDatabase_Impl.metrica();
        try {
            ad.crashlytics();
            workDatabase_Impl.yandex();
        } finally {
            workDatabase_Impl.purchase();
            c9707e.metrica(ad);
        }
    }

    public ArrayList smaato(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        C6096e purchase = C6096e.purchase(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            purchase.loadAd(1);
        } else {
            purchase.Signature(1, str);
        }
        workDatabase_Impl.vip();
        Cursor billing = workDatabase_Impl.billing(purchase);
        try {
            ArrayList arrayList = new ArrayList(billing.getCount());
            while (billing.moveToNext()) {
                arrayList.add(billing.getString(0));
            }
            return arrayList;
        } finally {
            billing.close();
            purchase.isVip();
        }
    }

    public ArrayList startapp() {
        C6096e c6096e;
        int startapp;
        int startapp2;
        int startapp3;
        int startapp4;
        int startapp5;
        int startapp6;
        int startapp7;
        int startapp8;
        int startapp9;
        int startapp10;
        int startapp11;
        int startapp12;
        int startapp13;
        C6096e purchase = C6096e.purchase(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        workDatabase_Impl.vip();
        Cursor billing = workDatabase_Impl.billing(purchase);
        try {
            startapp = AbstractC12640e.startapp(billing, "required_network_type");
            startapp2 = AbstractC12640e.startapp(billing, "requires_charging");
            startapp3 = AbstractC12640e.startapp(billing, "requires_device_idle");
            startapp4 = AbstractC12640e.startapp(billing, "requires_battery_not_low");
            startapp5 = AbstractC12640e.startapp(billing, "requires_storage_not_low");
            startapp6 = AbstractC12640e.startapp(billing, "trigger_content_update_delay");
            startapp7 = AbstractC12640e.startapp(billing, "trigger_max_content_delay");
            startapp8 = AbstractC12640e.startapp(billing, "content_uri_triggers");
            startapp9 = AbstractC12640e.startapp(billing, "id");
            startapp10 = AbstractC12640e.startapp(billing, "state");
            startapp11 = AbstractC12640e.startapp(billing, "worker_class_name");
            startapp12 = AbstractC12640e.startapp(billing, "input_merger_class_name");
            startapp13 = AbstractC12640e.startapp(billing, "input");
            c6096e = purchase;
        } catch (Throwable th) {
            th = th;
            c6096e = purchase;
        }
        try {
            int startapp14 = AbstractC12640e.startapp(billing, "output");
            int startapp15 = AbstractC12640e.startapp(billing, "initial_delay");
            int startapp16 = AbstractC12640e.startapp(billing, "interval_duration");
            int startapp17 = AbstractC12640e.startapp(billing, "flex_duration");
            int startapp18 = AbstractC12640e.startapp(billing, "run_attempt_count");
            int startapp19 = AbstractC12640e.startapp(billing, "backoff_policy");
            int startapp20 = AbstractC12640e.startapp(billing, "backoff_delay_duration");
            int startapp21 = AbstractC12640e.startapp(billing, "period_start_time");
            int startapp22 = AbstractC12640e.startapp(billing, "minimum_retention_duration");
            int startapp23 = AbstractC12640e.startapp(billing, "schedule_requested_at");
            int startapp24 = AbstractC12640e.startapp(billing, "run_in_foreground");
            int startapp25 = AbstractC12640e.startapp(billing, "out_of_quota_policy");
            int i = startapp14;
            ArrayList arrayList = new ArrayList(billing.getCount());
            while (billing.moveToNext()) {
                String string = billing.getString(startapp9);
                int i2 = startapp9;
                String string2 = billing.getString(startapp11);
                int i3 = startapp11;
                C7829e c7829e = new C7829e();
                int i4 = startapp;
                c7829e.ad = AbstractC11203e.purchase(billing.getInt(startapp));
                c7829e.vip = billing.getInt(startapp2) != 0;
                c7829e.metrica = billing.getInt(startapp3) != 0;
                c7829e.license = billing.getInt(startapp4) != 0;
                c7829e.appmetrica = billing.getInt(startapp5) != 0;
                int i5 = startapp2;
                c7829e.purchase = billing.getLong(startapp6);
                c7829e.billing = billing.getLong(startapp7);
                c7829e.yandex = AbstractC11203e.ad(billing.getBlob(startapp8));
                C13394e c13394e = new C13394e(string, string2);
                c13394e.vip = AbstractC11203e.yandex(billing.getInt(startapp10));
                c13394e.license = billing.getString(startapp12);
                c13394e.appmetrica = C13198e.ad(billing.getBlob(startapp13));
                int i6 = i;
                c13394e.purchase = C13198e.ad(billing.getBlob(i6));
                int i7 = startapp13;
                i = i6;
                int i8 = startapp15;
                c13394e.billing = billing.getLong(i8);
                startapp15 = i8;
                int i9 = startapp3;
                int i10 = startapp16;
                c13394e.yandex = billing.getLong(i10);
                startapp16 = i10;
                int i11 = startapp17;
                c13394e.startapp = billing.getLong(i11);
                int i12 = startapp18;
                c13394e.mopub = billing.getInt(i12);
                int i13 = startapp19;
                startapp18 = i12;
                c13394e.advert = AbstractC11203e.appmetrica(billing.getInt(i13));
                startapp17 = i11;
                int i14 = startapp20;
                c13394e.smaato = billing.getLong(i14);
                startapp20 = i14;
                int i15 = startapp21;
                c13394e.amazon = billing.getLong(i15);
                startapp21 = i15;
                int i16 = startapp22;
                c13394e.loadAd = billing.getLong(i16);
                startapp22 = i16;
                int i17 = startapp23;
                c13394e.Signature = billing.getLong(i17);
                int i18 = startapp24;
                c13394e.admob = billing.getInt(i18) != 0;
                int i19 = startapp25;
                startapp24 = i18;
                c13394e.subscription = AbstractC11203e.billing(billing.getInt(i19));
                c13394e.adcel = c7829e;
                arrayList.add(c13394e);
                startapp19 = i13;
                startapp3 = i9;
                startapp25 = i19;
                startapp23 = i17;
                startapp13 = i7;
                startapp9 = i2;
                startapp11 = i3;
                startapp = i4;
                startapp2 = i5;
            }
            billing.close();
            c6096e.isVip();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            billing.close();
            c6096e.isVip();
            throw th;
        }
    }

    public void tapsense(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        workDatabase_Impl.vip();
        C9707e c9707e = (C9707e) this.f10511e;
        C1573e ad = c9707e.ad();
        ad.purchase(1, j);
        if (str == null) {
            ad.advert(2);
        } else {
            ad.loadAd(2, str);
        }
        workDatabase_Impl.metrica();
        try {
            ad.crashlytics();
            workDatabase_Impl.yandex();
        } finally {
            workDatabase_Impl.purchase();
            c9707e.metrica(ad);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [eٕ٘ؔ] */
    /* JADX WARN: Type inference failed for: r0v7, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [eٕ٘ؔ] */
    public void vip(C2271e c2271e) {
        ArrayList arrayList;
        C15627e c15627e = (C15627e) c2271e.keySet();
        C2271e c2271e2 = c15627e.f30814e;
        if (c2271e2.isEmpty()) {
            return;
        }
        if (c2271e.f34352e > 999) {
            ?? c17519e = new C17519e(999);
            int i = c2271e.f34352e;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                c17519e.put((String) c2271e.purchase(i2), (ArrayList) c2271e.startapp(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    vip(c17519e);
                    c17519e = new C17519e(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                vip(c17519e);
                return;
            }
            return;
        }
        StringBuilder inmobi = AbstractC8703e.inmobi("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int i4 = c2271e2.f34352e;
        AbstractC18209e.ad(i4, inmobi);
        inmobi.append(")");
        C6096e purchase = C6096e.purchase(i4, inmobi.toString());
        Iterator it = c15627e.iterator();
        int i5 = 1;
        while (true) {
            C6748e c6748e = (C6748e) it;
            if (!c6748e.hasNext()) {
                break;
            }
            String str = (String) c6748e.next();
            if (str == null) {
                purchase.loadAd(i5);
            } else {
                purchase.Signature(i5, str);
            }
            i5++;
        }
        Cursor billing = ((WorkDatabase_Impl) this.f10517e).billing(purchase);
        try {
            int columnIndex = billing.getColumnIndex("work_spec_id");
            if (columnIndex < 0) {
                columnIndex = billing.getColumnIndex("`work_spec_id`");
            }
            if (columnIndex == -1) {
                return;
            }
            while (billing.moveToNext()) {
                if (!billing.isNull(columnIndex) && (arrayList = (ArrayList) c2271e.get(billing.getString(columnIndex))) != null) {
                    arrayList.add(billing.getString(0));
                }
            }
        } finally {
            billing.close();
        }
    }

    public ArrayList yandex(int i) {
        C6096e c6096e;
        int startapp;
        int startapp2;
        int startapp3;
        int startapp4;
        int startapp5;
        int startapp6;
        int startapp7;
        int startapp8;
        int startapp9;
        int startapp10;
        int startapp11;
        int startapp12;
        int startapp13;
        C6096e purchase = C6096e.purchase(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        purchase.advert(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10517e;
        workDatabase_Impl.vip();
        Cursor billing = workDatabase_Impl.billing(purchase);
        try {
            startapp = AbstractC12640e.startapp(billing, "required_network_type");
            startapp2 = AbstractC12640e.startapp(billing, "requires_charging");
            startapp3 = AbstractC12640e.startapp(billing, "requires_device_idle");
            startapp4 = AbstractC12640e.startapp(billing, "requires_battery_not_low");
            startapp5 = AbstractC12640e.startapp(billing, "requires_storage_not_low");
            startapp6 = AbstractC12640e.startapp(billing, "trigger_content_update_delay");
            startapp7 = AbstractC12640e.startapp(billing, "trigger_max_content_delay");
            startapp8 = AbstractC12640e.startapp(billing, "content_uri_triggers");
            startapp9 = AbstractC12640e.startapp(billing, "id");
            startapp10 = AbstractC12640e.startapp(billing, "state");
            startapp11 = AbstractC12640e.startapp(billing, "worker_class_name");
            startapp12 = AbstractC12640e.startapp(billing, "input_merger_class_name");
            startapp13 = AbstractC12640e.startapp(billing, "input");
            c6096e = purchase;
        } catch (Throwable th) {
            th = th;
            c6096e = purchase;
        }
        try {
            int startapp14 = AbstractC12640e.startapp(billing, "output");
            int startapp15 = AbstractC12640e.startapp(billing, "initial_delay");
            int startapp16 = AbstractC12640e.startapp(billing, "interval_duration");
            int startapp17 = AbstractC12640e.startapp(billing, "flex_duration");
            int startapp18 = AbstractC12640e.startapp(billing, "run_attempt_count");
            int startapp19 = AbstractC12640e.startapp(billing, "backoff_policy");
            int startapp20 = AbstractC12640e.startapp(billing, "backoff_delay_duration");
            int startapp21 = AbstractC12640e.startapp(billing, "period_start_time");
            int startapp22 = AbstractC12640e.startapp(billing, "minimum_retention_duration");
            int startapp23 = AbstractC12640e.startapp(billing, "schedule_requested_at");
            int startapp24 = AbstractC12640e.startapp(billing, "run_in_foreground");
            int startapp25 = AbstractC12640e.startapp(billing, "out_of_quota_policy");
            int i2 = startapp14;
            ArrayList arrayList = new ArrayList(billing.getCount());
            while (billing.moveToNext()) {
                String string = billing.getString(startapp9);
                int i3 = startapp9;
                String string2 = billing.getString(startapp11);
                int i4 = startapp11;
                C7829e c7829e = new C7829e();
                int i5 = startapp;
                c7829e.ad = AbstractC11203e.purchase(billing.getInt(startapp));
                c7829e.vip = billing.getInt(startapp2) != 0;
                c7829e.metrica = billing.getInt(startapp3) != 0;
                c7829e.license = billing.getInt(startapp4) != 0;
                c7829e.appmetrica = billing.getInt(startapp5) != 0;
                int i6 = startapp2;
                c7829e.purchase = billing.getLong(startapp6);
                c7829e.billing = billing.getLong(startapp7);
                c7829e.yandex = AbstractC11203e.ad(billing.getBlob(startapp8));
                C13394e c13394e = new C13394e(string, string2);
                c13394e.vip = AbstractC11203e.yandex(billing.getInt(startapp10));
                c13394e.license = billing.getString(startapp12);
                c13394e.appmetrica = C13198e.ad(billing.getBlob(startapp13));
                int i7 = i2;
                c13394e.purchase = C13198e.ad(billing.getBlob(i7));
                int i8 = startapp15;
                int i9 = startapp13;
                i2 = i7;
                c13394e.billing = billing.getLong(i8);
                int i10 = startapp3;
                int i11 = startapp16;
                c13394e.yandex = billing.getLong(i11);
                startapp16 = i11;
                int i12 = startapp17;
                c13394e.startapp = billing.getLong(i12);
                int i13 = startapp18;
                c13394e.mopub = billing.getInt(i13);
                int i14 = startapp19;
                startapp18 = i13;
                c13394e.advert = AbstractC11203e.appmetrica(billing.getInt(i14));
                startapp17 = i12;
                int i15 = startapp20;
                c13394e.smaato = billing.getLong(i15);
                startapp20 = i15;
                int i16 = startapp21;
                c13394e.amazon = billing.getLong(i16);
                startapp21 = i16;
                int i17 = startapp22;
                c13394e.loadAd = billing.getLong(i17);
                startapp22 = i17;
                int i18 = startapp23;
                c13394e.Signature = billing.getLong(i18);
                int i19 = startapp24;
                c13394e.admob = billing.getInt(i19) != 0;
                int i20 = startapp25;
                startapp24 = i19;
                c13394e.subscription = AbstractC11203e.billing(billing.getInt(i20));
                c13394e.adcel = c7829e;
                arrayList.add(c13394e);
                startapp19 = i14;
                startapp3 = i10;
                startapp13 = i9;
                startapp25 = i20;
                startapp23 = i18;
                startapp15 = i8;
                startapp9 = i3;
                startapp11 = i4;
                startapp = i5;
                startapp2 = i6;
            }
            billing.close();
            c6096e.isVip();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            billing.close();
            c6096e.isVip();
            throw th;
        }
    }
}
