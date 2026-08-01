package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12019e implements InterfaceC12504e, InterfaceC9479e, InterfaceC7449e, InterfaceC3812e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f24040e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ long f24041e;

    public /* synthetic */ C12019e(long j, C7869e c7869e) {
        this.f24041e = j;
        this.f24040e = c7869e;
    }

    public /* synthetic */ C12019e(long j, Object obj) {
        this.f24040e = obj;
        this.f24041e = j;
    }

    @Override // defpackage.InterfaceC3812e
    public Object apply(Object obj) {
        C7869e c7869e = (C7869e) this.f24040e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f24041e));
        String str = c7869e.ad;
        EnumC6651e enumC6651e = c7869e.metrica;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC12589e.ad(enumC6651e))}) < 1) {
            contentValues.put("backend_name", c7869e.ad);
            contentValues.put("priority", Integer.valueOf(AbstractC12589e.ad(enumC6651e)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        ((InterfaceC3190e) obj).mopub((C18177e) this.f24040e, this.f24041e);
    }

    @Override // defpackage.InterfaceC9479e
    public void metrica(InterfaceC3001e interfaceC3001e, int i) {
        C4275e c4275e = (C4275e) this.f24040e;
        interfaceC3001e.mo951e(c4275e.metrica, i, this.f24041e);
    }

    @Override // defpackage.InterfaceC7449e
    public Object startapp(C6584e c6584e, C18424e c18424e, int i) {
        return c6584e.crashlytics(c18424e, AbstractC17475e.ads((C1962e) this.f24040e), 0, this.f24041e);
    }
}
