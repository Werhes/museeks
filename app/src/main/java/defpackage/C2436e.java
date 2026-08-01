package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2436e {
    public static final String[] adcel = {"UPDATE", "DELETE", "INSERT"};
    public final C6613e billing;
    public final WorkDatabase_Impl metrica;
    public volatile C1573e purchase;
    public final String[] vip;
    public final AtomicBoolean license = new AtomicBoolean(false);
    public volatile boolean appmetrica = false;
    public final C13615e yandex = new C13615e();
    public final RunnableC12991e startapp = new RunnableC12991e(14, this);
    public final HashMap ad = new HashMap();

    public C2436e(WorkDatabase_Impl workDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.metrica = workDatabase_Impl;
        this.billing = new C6613e(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.vip = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.ad.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) hashMap.get(strArr[i]);
            if (str2 != null) {
                this.vip[i] = str2.toLowerCase(locale);
            } else {
                this.vip[i] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.ad.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap hashMap3 = this.ad;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final boolean ad() {
        C4734e c4734e = this.metrica.ad;
        if (c4734e == null || !((SQLiteDatabase) c4734e.f10118e).isOpen()) {
            return false;
        }
        if (!this.appmetrica) {
            this.metrica.metrica.getWritableDatabase();
        }
        if (this.appmetrica) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void metrica(C4734e c4734e) {
        if (((SQLiteDatabase) c4734e.f10118e).inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.metrica.yandex.readLock();
                readLock.lock();
                try {
                    int[] m2237interface = this.billing.m2237interface();
                    if (m2237interface == null) {
                        readLock.unlock();
                        return;
                    }
                    int length = m2237interface.length;
                    c4734e.ad();
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = m2237interface[i];
                            if (i2 == 1) {
                                vip(c4734e, i);
                            } else if (i2 == 2) {
                                String str = this.vip[i];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = adcel;
                                for (int i3 = 0; i3 < 3; i3++) {
                                    String str2 = strArr[i3];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    c4734e.isVip(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            c4734e.Signature();
                            throw th;
                        }
                    }
                    c4734e.subs();
                    c4734e.Signature();
                    C6613e c6613e = this.billing;
                    synchronized (c6613e) {
                        c6613e.f13641e = false;
                    }
                    readLock.unlock();
                } catch (Throwable th2) {
                    readLock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }

    public final void vip(C4734e c4734e, int i) {
        c4734e.isVip(AbstractC1634e.smaato("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i, ", 0)"));
        String str = this.vip[i];
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = adcel[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            AbstractC13501e.Signature(sb, str, "_", str2, "`");
            AbstractC13501e.Signature(sb, " AFTER ", str2, " ON `", str);
            AbstractC13501e.Signature(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            AbstractC13501e.Signature(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            c4734e.isVip(sb.toString());
        }
    }
}
