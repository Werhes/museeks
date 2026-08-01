package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6922e extends SQLiteOpenHelper {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f14180e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5891e f14181e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4734e[] f14182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6922e(Context context, String str, C4734e[] c4734eArr, C5891e c5891e) {
        super(context, str, null, 12, new C7336e(c5891e, c4734eArr));
        c5891e.getClass();
        this.f14181e = c5891e;
        this.f14182e = c4734eArr;
    }

    public static C4734e ad(C4734e[] c4734eArr, SQLiteDatabase sQLiteDatabase) {
        C4734e c4734e = c4734eArr[0];
        if (c4734e == null || ((SQLiteDatabase) c4734e.f10118e) != sQLiteDatabase) {
            c4734eArr[0] = new C4734e(sQLiteDatabase, 0);
        }
        return c4734eArr[0];
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f14182e[0] = null;
    }

    public final synchronized C4734e license() {
        this.f14180e = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f14180e) {
            return ad(this.f14182e, writableDatabase);
        }
        close();
        return license();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        ad(this.f14182e, sQLiteDatabase);
        this.f14181e.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[ORIG_RETURN, RETURN] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r6) {
        /*
            r5 = this;
            eًٍؗ[] r0 = r5.f14182e
            eًٍؗ r6 = ad(r0, r6)
            eؘٟۚ r0 = r5.f14181e
            java.lang.Object r1 = r0.f12439e
            eٍۜۖ r1 = (defpackage.C9770e) r1
            java.lang.String r2 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r2 = r6.ads(r2)
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L21
            r4 = 0
            if (r3 == 0) goto L23
            int r3 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            r3 = 1
            goto L24
        L21:
            r6 = move-exception
            goto L6d
        L23:
            r3 = r4
        L24:
            r2.close()
            defpackage.C9770e.Signature(r6)
            if (r3 != 0) goto L4b
            eٌٜؒ r2 = defpackage.C9770e.applovin(r6)
            boolean r3 = r2.vip
            if (r3 == 0) goto L35
            goto L4b
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            java.lang.String r1 = r2.metrica
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L4b:
            r0.m1994default(r6)
            java.lang.Object r6 = r1.f19315e
            androidx.work.impl.WorkDatabase_Impl r6 = (androidx.work.impl.WorkDatabase_Impl) r6
            int r0 = androidx.work.impl.WorkDatabase_Impl.remoteconfig
            java.util.List r0 = r6.billing
            if (r0 == 0) goto L6c
            int r0 = r0.size()
        L5c:
            if (r4 >= r0) goto L6c
            java.util.List r1 = r6.billing
            java.lang.Object r1 = r1.get(r4)
            eۣؒٓ r1 = (defpackage.C1416e) r1
            r1.getClass()
            int r4 = r4 + 1
            goto L5c
        L6c:
            return
        L6d:
            r2.close()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6922e.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f14180e = true;
        this.f14181e.m2002while(ad(this.f14182e, sQLiteDatabase), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0068  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r11) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6922e.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f14180e = true;
        this.f14181e.m2002while(ad(this.f14182e, sQLiteDatabase), i, i2);
    }
}
