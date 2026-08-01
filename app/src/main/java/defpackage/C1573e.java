package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1573e extends C4734e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final SQLiteStatement f4485e;

    public C1573e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, 1);
        this.f4485e = sQLiteStatement;
    }

    public final int crashlytics() {
        return this.f4485e.executeUpdateDelete();
    }
}
