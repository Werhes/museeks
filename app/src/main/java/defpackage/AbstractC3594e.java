package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3594e {
    public volatile C4734e ad;
    public boolean appmetrica;
    public List billing;
    public final C2436e license;
    public InterfaceC11216e metrica;
    public boolean purchase;
    public Executor vip;
    public final ReentrantReadWriteLock yandex = new ReentrantReadWriteLock();
    public final ThreadLocal startapp = new ThreadLocal();

    public AbstractC3594e() {
        new ConcurrentHashMap();
        this.license = license();
    }

    public final void ad() {
        if (!this.appmetrica && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public abstract InterfaceC11216e appmetrica(C9964e c9964e);

    public final Cursor billing(InterfaceC14128e interfaceC14128e) {
        ad();
        vip();
        return this.metrica.getWritableDatabase().inmobi(interfaceC14128e);
    }

    public abstract C2436e license();

    public final void metrica() {
        ad();
        C4734e writableDatabase = this.metrica.getWritableDatabase();
        this.license.metrica(writableDatabase);
        writableDatabase.ad();
    }

    public final void purchase() {
        this.metrica.getWritableDatabase().Signature();
        if (((SQLiteDatabase) this.metrica.getWritableDatabase().f10118e).inTransaction()) {
            return;
        }
        C2436e c2436e = this.license;
        if (c2436e.license.compareAndSet(false, true)) {
            c2436e.metrica.vip.execute(c2436e.startapp);
        }
    }

    public final void vip() {
        if (!((SQLiteDatabase) this.metrica.getWritableDatabase().f10118e).inTransaction() && this.startapp.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void yandex() {
        this.metrica.getWritableDatabase().subs();
    }
}
