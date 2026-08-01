package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7336e implements DatabaseErrorHandler {
    public final /* synthetic */ C5891e ad;
    public final /* synthetic */ C4734e[] vip;

    public C7336e(C5891e c5891e, C4734e[] c4734eArr) {
        this.ad = c5891e;
        this.vip = c4734eArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C4734e ad = C6922e.ad(this.vip, sQLiteDatabase);
        this.ad.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ((SQLiteDatabase) ad.f10118e).getPath());
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) ad.f10118e;
        if (!sQLiteDatabase2.isOpen()) {
            C5891e.premium(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            try {
                list = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                ad.close();
            } catch (IOException unused2) {
            }
        } finally {
            if (list != null) {
                Iterator<Pair<String, String>> it = list.iterator();
                while (it.hasNext()) {
                    C5891e.premium((String) it.next().second);
                }
            } else {
                C5891e.premium(sQLiteDatabase2.getPath());
            }
        }
    }
}
