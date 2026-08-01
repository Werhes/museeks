package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2417e implements InterfaceC8685e, InterfaceC1640e, InterfaceC2361e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C12007e f6204e = new C12007e("proto");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC16964e f6205e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC3832e f6206e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC3832e f6207e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0176e f6208e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17438e f6209e;

    public C2417e(InterfaceC3832e interfaceC3832e, InterfaceC3832e interfaceC3832e2, C0176e c0176e, C17438e c17438e, InterfaceC16964e interfaceC16964e) {
        this.f6209e = c17438e;
        this.f6207e = interfaceC3832e;
        this.f6206e = interfaceC3832e2;
        this.f6208e = c0176e;
        this.f6205e = interfaceC16964e;
    }

    public static Object inmobi(Cursor cursor, InterfaceC3812e interfaceC3812e) {
        try {
            return interfaceC3812e.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static String isVip(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C5171e) it.next()).ad);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Long license(SQLiteDatabase sQLiteDatabase, C7869e c7869e) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c7869e.ad, String.valueOf(AbstractC12589e.ad(c7869e.metrica))));
        byte[] bArr = c7869e.vip;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public final Object Signature(InterfaceC6395e interfaceC6395e) {
        SQLiteDatabase ad = ad();
        InterfaceC3832e interfaceC3832e = this.f6206e;
        long vip = interfaceC3832e.vip();
        while (true) {
            try {
                ad.beginTransaction();
                try {
                    Object purchase = interfaceC6395e.purchase();
                    ad.setTransactionSuccessful();
                    return purchase;
                } finally {
                    ad.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC3832e.vip() >= this.f6208e.metrica + vip) {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final SQLiteDatabase ad() {
        C17438e c17438e = this.f6209e;
        Objects.requireNonNull(c17438e);
        InterfaceC3832e interfaceC3832e = this.f6206e;
        long vip = interfaceC3832e.vip();
        while (true) {
            try {
                return c17438e.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC3832e.vip() >= this.f6208e.metrica + vip) {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final ArrayList advert(SQLiteDatabase sQLiteDatabase, C7869e c7869e, int i) {
        ArrayList arrayList = new ArrayList();
        Long license = license(sQLiteDatabase, c7869e);
        if (license == null) {
            return arrayList;
        }
        inmobi(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{license.toString()}, null, null, null, String.valueOf(i)), new C9509e(16, this, arrayList, c7869e));
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6209e.close();
    }

    public final void loadAd(long j, EnumC2962e enumC2962e, String str) {
        purchase(new C1121e(j, str, enumC2962e));
    }

    public final Object purchase(InterfaceC3812e interfaceC3812e) {
        SQLiteDatabase ad = ad();
        ad.beginTransaction();
        try {
            Object apply = interfaceC3812e.apply(ad);
            ad.setTransactionSuccessful();
            return apply;
        } finally {
            ad.endTransaction();
        }
    }
}
