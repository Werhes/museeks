package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10497e {
    public final C14899e ad;
    public final ArrayList appmetrica = new ArrayList();
    public AbstractC6552e license;
    public boolean metrica;
    public boolean purchase;
    public final String vip;

    public C10497e(C14899e c14899e, String str) {
        this.ad = c14899e;
        this.vip = str;
    }

    public static void metrica(C10497e c10497e, String str, long j, Function0 function0, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        c10497e.getClass();
        c10497e.license(new C14799e(str, z, function0), j);
    }

    public final void ad() {
        C14899e c14899e = this.ad;
        TimeZone timeZone = AbstractC16286e.ad;
        synchronized (c14899e) {
            try {
                if (vip()) {
                    this.ad.metrica(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean appmetrica(AbstractC6552e abstractC6552e, long j, boolean z) {
        Logger logger = this.ad.vip;
        C10497e c10497e = abstractC6552e.metrica;
        if (c10497e != this) {
            if (c10497e != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            abstractC6552e.metrica = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.appmetrica;
        int indexOf = arrayList.indexOf(abstractC6552e);
        if (indexOf != -1) {
            if (abstractC6552e.license <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC0326e.ad(logger, abstractC6552e, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        abstractC6552e.license = j2;
        if (logger.isLoggable(Level.FINE)) {
            AbstractC0326e.ad(logger, abstractC6552e, this, z ? "run again after ".concat(AbstractC0326e.startapp(j2 - nanoTime)) : "scheduled after ".concat(AbstractC0326e.startapp(j2 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((AbstractC6552e) it.next()).license - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, abstractC6552e);
        return i == 0;
    }

    public final void license(AbstractC6552e abstractC6552e, long j) {
        synchronized (this.ad) {
            if (!this.metrica) {
                if (appmetrica(abstractC6552e, j, false)) {
                    this.ad.metrica(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (abstractC6552e.vip) {
                Logger logger = this.ad.vip;
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC0326e.ad(logger, abstractC6552e, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.ad.vip;
                if (logger2.isLoggable(Level.FINE)) {
                    AbstractC0326e.ad(logger2, abstractC6552e, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final void purchase() {
        C14899e c14899e = this.ad;
        TimeZone timeZone = AbstractC16286e.ad;
        synchronized (c14899e) {
            try {
                this.metrica = true;
                if (vip()) {
                    this.ad.metrica(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.vip;
    }

    public final boolean vip() {
        AbstractC6552e abstractC6552e = this.license;
        if (abstractC6552e != null && abstractC6552e.vip) {
            this.purchase = true;
        }
        ArrayList arrayList = this.appmetrica;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC6552e) arrayList.get(size)).vip) {
                Logger logger = this.ad.vip;
                AbstractC6552e abstractC6552e2 = (AbstractC6552e) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC0326e.ad(logger, abstractC6552e2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }
}
