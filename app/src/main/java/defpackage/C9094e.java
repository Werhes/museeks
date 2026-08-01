package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۤٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9094e implements InterfaceC0810e, InterfaceC6395e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f18206e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f18207e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f18208e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f18209e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18210e;

    public /* synthetic */ C9094e(C4956e c4956e, Iterable iterable, C7869e c7869e, long j) {
        this.f18210e = 2;
        this.f18208e = c4956e;
        this.f18206e = iterable;
        this.f18209e = c7869e;
        this.f18207e = j;
    }

    public /* synthetic */ C9094e(ScheduledExecutorServiceC5603e scheduledExecutorServiceC5603e, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f18210e = i;
        this.f18208e = scheduledExecutorServiceC5603e;
        this.f18206e = obj;
        this.f18207e = j;
        this.f18209e = timeUnit;
    }

    @Override // defpackage.InterfaceC0810e
    public ScheduledFuture ad(final C6594e c6594e) {
        switch (this.f18210e) {
            case 0:
                ScheduledExecutorServiceC5603e scheduledExecutorServiceC5603e = (ScheduledExecutorServiceC5603e) this.f18208e;
                Runnable runnable = (Runnable) this.f18206e;
                return scheduledExecutorServiceC5603e.f11956e.schedule(new RunnableC8132e(scheduledExecutorServiceC5603e, runnable, c6594e, 1), this.f18207e, (TimeUnit) this.f18209e);
            default:
                final ScheduledExecutorServiceC5603e scheduledExecutorServiceC5603e2 = (ScheduledExecutorServiceC5603e) this.f18208e;
                final Callable callable = (Callable) this.f18206e;
                return scheduledExecutorServiceC5603e2.f11956e.schedule(new Callable() { // from class: eٔٙۘ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ScheduledExecutorServiceC5603e.this.f11957e.submit(new RunnableC2623e(callable, c6594e, 7));
                    }
                }, this.f18207e, (TimeUnit) this.f18209e);
        }
    }

    @Override // defpackage.InterfaceC6395e
    public Object purchase() {
        C4956e c4956e = (C4956e) this.f18208e;
        Iterable iterable = (Iterable) this.f18206e;
        C7869e c7869e = (C7869e) this.f18209e;
        C2417e c2417e = (C2417e) ((InterfaceC8685e) c4956e.f10512e);
        c2417e.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C2417e.isVip(iterable);
            SQLiteDatabase ad = c2417e.ad();
            ad.beginTransaction();
            try {
                ad.compileStatement(str).execute();
                Cursor rawQuery = ad.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        c2417e.loadAd(rawQuery.getInt(0), EnumC2962e.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                ad.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                ad.setTransactionSuccessful();
            } finally {
                ad.endTransaction();
            }
        }
        c2417e.purchase(new C12019e(((InterfaceC3832e) c4956e.f10518e).vip() + this.f18207e, c7869e));
        return null;
    }
}
