package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؐ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9166e {
    public static final String purchase = C5401e.crashlytics("ConstraintTracker");
    public final C0912e ad;
    public Object appmetrica;
    public final Context vip;
    public final Object metrica = new Object();
    public final LinkedHashSet license = new LinkedHashSet();

    public AbstractC9166e(C0912e c0912e, Context context) {
        this.vip = context.getApplicationContext();
        this.ad = c0912e;
    }

    public abstract Object ad();

    public abstract void appmetrica();

    public abstract void license();

    public final void metrica(Object obj) {
        synchronized (this.metrica) {
            try {
                Object obj2 = this.appmetrica;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.appmetrica = obj;
                    ((ExecutorC3044e) this.ad.f3333e).execute(new RunnableC17144e(this, new ArrayList(this.license), false, 8));
                }
            } finally {
            }
        }
    }

    public final void vip(AbstractC8112e abstractC8112e) {
        synchronized (this.metrica) {
            try {
                if (this.license.remove(abstractC8112e) && this.license.isEmpty()) {
                    appmetrica();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
