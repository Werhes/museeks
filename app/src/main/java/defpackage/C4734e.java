package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C4734e implements Closeable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final String[] f10117e = new String[0];

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f10118e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10119e;

    public C4734e() {
        this.f10119e = 2;
        this.f10118e = new Inflater(true);
    }

    public /* synthetic */ C4734e(SQLiteClosable sQLiteClosable, int i) {
        this.f10119e = i;
        this.f10118e = sQLiteClosable;
    }

    public void Signature() {
        ((SQLiteDatabase) this.f10118e).endTransaction();
    }

    public void ad() {
        ((SQLiteDatabase) this.f10118e).beginTransaction();
    }

    public Cursor ads(String str) {
        return inmobi(new C15400e(str, 3));
    }

    public void advert(int i) {
        ((SQLiteProgram) this.f10118e).bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f10119e) {
            case 0:
                ((SQLiteDatabase) this.f10118e).close();
                return;
            case 1:
                ((SQLiteProgram) this.f10118e).close();
                return;
            default:
                ((Inflater) this.f10118e).end();
                return;
        }
    }

    public Cursor inmobi(InterfaceC14128e interfaceC14128e) {
        return ((SQLiteDatabase) this.f10118e).rawQueryWithFactory(new C5018e(interfaceC14128e), interfaceC14128e.license(), f10117e, null);
    }

    public void isVip(String str) {
        ((SQLiteDatabase) this.f10118e).execSQL(str);
    }

    public void license(int i, byte[] bArr) {
        ((SQLiteProgram) this.f10118e).bindBlob(i, bArr);
    }

    public void loadAd(int i, String str) {
        ((SQLiteProgram) this.f10118e).bindString(i, str);
    }

    public void purchase(int i, long j) {
        ((SQLiteProgram) this.f10118e).bindLong(i, j);
    }

    public void subs() {
        ((SQLiteDatabase) this.f10118e).setTransactionSuccessful();
    }
}
