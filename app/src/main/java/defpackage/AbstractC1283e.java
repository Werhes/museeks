package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۙٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1283e {
    static {
        AbstractC1418e.ad("media3.database");
    }

    public static int ad(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            String str2 = AbstractC9413e.ad;
            if (!(DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0)) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str}, null, null, null);
            try {
                if (query.getCount() == 0) {
                    query.close();
                    return -1;
                }
                query.moveToNext();
                int i2 = query.getInt(0);
                query.close();
                return i2;
            } finally {
            }
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    public static void metrica(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", (Integer) 1);
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    public static void vip(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            String str2 = AbstractC9413e.ad;
            if (DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str});
            }
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }
}
