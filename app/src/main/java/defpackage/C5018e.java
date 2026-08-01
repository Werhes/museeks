package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5018e implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ InterfaceC14128e ad;

    public C5018e(InterfaceC14128e interfaceC14128e) {
        this.ad = interfaceC14128e;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.ad.ad(new C4734e(sQLiteQuery, 1));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
