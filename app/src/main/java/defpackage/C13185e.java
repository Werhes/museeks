package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13185e extends AbstractC3947e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final String[] f26186e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f26187e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C9223e f26188e;

    public C13185e(C6936e c6936e) {
        super(c6936e);
        this.f26188e = new C9223e(this, ((C6936e) this.f36443e).f14225e);
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final void m3532e() {
        int i;
        C6936e c6936e = (C6936e) this.f36443e;
        mo2250e();
        if (!this.f26187e && c6936e.f14225e.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase m3533e = m3533e();
                        if (m3533e == null) {
                            this.f26187e = true;
                            return;
                        }
                        m3533e.beginTransaction();
                        m3533e.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        m3533e.setTransactionSuccessful();
                        m3533e.endTransaction();
                        m3533e.close();
                        return;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        C13879e c13879e = c6936e.f14227e;
                        C6936e.yandex(c13879e);
                        c13879e.f27502e.vip(e, "Error deleting app launch break from local database");
                        this.f26187e = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    i = 0 == 0 ? i + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e2) {
                    C13879e c13879e2 = c6936e.f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27502e.vip(e2, "Error deleting app launch break from local database");
                    this.f26187e = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            C13879e c13879e3 = c6936e.f14227e;
            C6936e.yandex(c13879e3);
            c13879e3.f27495e.ad("Error deleting app launch break from local database in reasonable time");
        }
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final SQLiteDatabase m3533e() {
        if (this.f26187e) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f26188e.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f26187e = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:95:0x0088, B:97:0x008e, B:65:0x00ae, B:67:0x00cf, B:70:0x00d8, B:73:0x00de, B:74:0x00f8, B:42:0x0120, B:44:0x0126, B:45:0x0129, B:33:0x015b, B:21:0x0144), top: B:94:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* renamed from: eًؚْ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3534e(int r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13185e.m3534e(int, byte[]):boolean");
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final void m3535e() {
        int delete;
        C6936e c6936e = (C6936e) this.f36443e;
        mo2250e();
        try {
            SQLiteDatabase m3533e = m3533e();
            if (m3533e == null || (delete = m3533e.delete("messages", null, null)) <= 0) {
                return;
            }
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27497e.vip(Integer.valueOf(delete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.vip(e, "Error resetting local analytics data. error");
        }
    }

    @Override // defpackage.AbstractC3947e
    /* renamed from: eّٖٗ */
    public final boolean mo803e() {
        return false;
    }
}
