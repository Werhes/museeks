package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1121e implements InterfaceC13824e, InterfaceC9479e, InterfaceC3812e, InterfaceC6395e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f3668e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f3669e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ long f3670e;

    public /* synthetic */ C1121e(long j, Object obj, Object obj2) {
        this.f3669e = obj;
        this.f3668e = obj2;
        this.f3670e = j;
    }

    public /* synthetic */ C1121e(String str, long j, C10579e c10579e) {
        this.f3669e = str;
        this.f3670e = j;
        this.f3668e = c10579e;
    }

    @Override // defpackage.InterfaceC3812e
    public Object apply(Object obj) {
        String str = (String) this.f3669e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((EnumC2962e) this.f3668e).f7009e;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.f3670e;
            if (z) {
                sQLiteDatabase.execSQL(AbstractC1634e.mopub(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC9479e
    public void metrica(InterfaceC3001e interfaceC3001e, int i) {
        C4275e c4275e = (C4275e) this.f3669e;
        interfaceC3001e.mo941abstract(c4275e.metrica, i, ((C1962e) this.f3668e).metrica(c4275e.tapsense(), true), this.f3670e);
    }

    @Override // defpackage.InterfaceC6395e
    public Object purchase() {
        C4956e c4956e = (C4956e) this.f3669e;
        C7869e c7869e = (C7869e) this.f3668e;
        InterfaceC8685e interfaceC8685e = (InterfaceC8685e) c4956e.f10512e;
        long vip = ((InterfaceC3832e) c4956e.f10518e).vip() + this.f3670e;
        C2417e c2417e = (C2417e) interfaceC8685e;
        c2417e.getClass();
        c2417e.purchase(new C12019e(vip, c7869e));
        return null;
    }

    @Override // defpackage.InterfaceC13824e
    public void yandex(InterfaceC7970e interfaceC7970e) {
        ((C12787e) interfaceC7970e.get()).license((String) this.f3669e, this.f3670e, (C10579e) this.f3668e);
    }
}
