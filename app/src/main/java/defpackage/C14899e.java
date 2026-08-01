package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14899e {
    public final C17974e ad;
    public long appmetrica;
    public int billing;
    public boolean license;
    public int purchase;
    public static final Logger mopub = Logger.getLogger(C14899e.class.getName());
    public static final C14899e advert = new C14899e(new C17974e(new ThreadFactoryC8551e(AbstractC1786e.signatures(new StringBuilder(), AbstractC16286e.vip, " TaskRunner"), true)));
    public final Logger vip = mopub;
    public int metrica = ModuleDescriptor.MODULE_VERSION;
    public final ArrayList yandex = new ArrayList();
    public final ArrayList startapp = new ArrayList();
    public final RunnableC12991e adcel = new RunnableC12991e(28, this);

    public C14899e(C17974e c17974e) {
        this.ad = c17974e;
    }

    public static final void ad(C14899e c14899e, AbstractC6552e abstractC6552e, long j, boolean z) {
        TimeZone timeZone = AbstractC16286e.ad;
        C10497e c10497e = abstractC6552e.metrica;
        if (c10497e.license != abstractC6552e) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = c10497e.purchase;
        c10497e.purchase = false;
        c10497e.license = null;
        c14899e.yandex.remove(c10497e);
        if (j != -1 && !z2 && !c10497e.metrica) {
            c10497e.appmetrica(abstractC6552e, j, true);
        }
        if (c10497e.appmetrica.isEmpty()) {
            return;
        }
        c14899e.startapp.add(c10497e);
        if (z) {
            return;
        }
        c14899e.appmetrica();
    }

    public final void appmetrica() {
        TimeZone timeZone = AbstractC16286e.ad;
        int i = this.purchase;
        if (i > this.billing) {
            return;
        }
        this.purchase = i + 1;
        ((ThreadPoolExecutor) this.ad.f35233e).execute(this.adcel);
    }

    public final C10497e license() {
        int i;
        synchronized (this) {
            i = this.metrica;
            this.metrica = i + 1;
        }
        return new C10497e(this, AbstractC1786e.admob(i, "Q"));
    }

    public final void metrica(C10497e c10497e) {
        TimeZone timeZone = AbstractC16286e.ad;
        if (c10497e.license == null) {
            boolean isEmpty = c10497e.appmetrica.isEmpty();
            ArrayList arrayList = this.startapp;
            if (isEmpty) {
                arrayList.remove(c10497e);
            } else {
                byte[] bArr = AbstractC10220e.ad;
                if (!arrayList.contains(c10497e)) {
                    arrayList.add(c10497e);
                }
            }
        }
        if (this.license) {
            notify();
        } else {
            appmetrica();
        }
    }

    public final AbstractC6552e vip() {
        boolean z;
        TimeZone timeZone = AbstractC16286e.ad;
        while (true) {
            ArrayList arrayList = this.startapp;
            if (arrayList.isEmpty()) {
                break;
            }
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j = Long.MAX_VALUE;
            AbstractC6552e abstractC6552e = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC6552e abstractC6552e2 = (AbstractC6552e) ((C10497e) it.next()).appmetrica.get(0);
                long max = Math.max(0L, abstractC6552e2.license - nanoTime);
                if (max > 0) {
                    j = Math.min(max, j);
                } else {
                    if (abstractC6552e != null) {
                        z = true;
                        break;
                    }
                    abstractC6552e = abstractC6552e2;
                }
            }
            ArrayList arrayList2 = this.yandex;
            if (abstractC6552e != null) {
                TimeZone timeZone2 = AbstractC16286e.ad;
                abstractC6552e.license = -1L;
                C10497e c10497e = abstractC6552e.metrica;
                c10497e.appmetrica.remove(abstractC6552e);
                arrayList.remove(c10497e);
                c10497e.license = abstractC6552e;
                arrayList2.add(c10497e);
                if (z || (!this.license && !arrayList.isEmpty())) {
                    appmetrica();
                }
                return abstractC6552e;
            }
            if (!this.license) {
                this.license = true;
                this.appmetrica = nanoTime + j;
                try {
                    try {
                        TimeZone timeZone3 = AbstractC16286e.ad;
                        if (j > 0) {
                            long j2 = j / 1000000;
                            Long.signum(j2);
                            long j3 = j - (1000000 * j2);
                            if (j2 > 0 || j > 0) {
                                wait(j2, (int) j3);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = AbstractC16286e.ad;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((C10497e) arrayList2.get(size)).vip();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            C10497e c10497e2 = (C10497e) arrayList.get(size2);
                            c10497e2.vip();
                            if (c10497e2.appmetrica.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.license = false;
                }
            } else if (j < this.appmetrica - nanoTime) {
                notify();
            }
        }
        return null;
    }
}
