package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٞۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2755e {
    public final AtomicBoolean ad = new AtomicBoolean(false);
    public volatile C1573e metrica;
    public final AbstractC3594e vip;

    public AbstractC2755e(AbstractC3594e abstractC3594e) {
        this.vip = abstractC3594e;
    }

    public final C1573e ad() {
        this.vip.ad();
        if (!this.ad.compareAndSet(false, true)) {
            String vip = vip();
            AbstractC3594e abstractC3594e = this.vip;
            abstractC3594e.ad();
            abstractC3594e.vip();
            return new C1573e(((SQLiteDatabase) abstractC3594e.metrica.getWritableDatabase().f10118e).compileStatement(vip));
        }
        if (this.metrica == null) {
            String vip2 = vip();
            AbstractC3594e abstractC3594e2 = this.vip;
            abstractC3594e2.ad();
            abstractC3594e2.vip();
            this.metrica = new C1573e(((SQLiteDatabase) abstractC3594e2.metrica.getWritableDatabase().f10118e).compileStatement(vip2));
        }
        return this.metrica;
    }

    public final void metrica(C1573e c1573e) {
        if (c1573e == this.metrica) {
            this.ad.set(false);
        }
    }

    public abstract String vip();
}
