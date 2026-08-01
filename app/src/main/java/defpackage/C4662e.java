package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C4662e {
    public final int ad;
    public int appmetrica;
    public int license;
    public final C10215e metrica;
    public int purchase;
    public final C13207e vip;

    public C4662e(int i) {
        this.ad = i;
        if (i <= 0) {
            AbstractC14783e.billing("maxSize <= 0");
            throw null;
        }
        this.vip = new C13207e(1);
        this.metrica = new C10215e(4);
    }

    public Object ad(Object obj) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void appmetrica(int r4) {
        /*
            r3 = this;
        L0:
            eَّّ r0 = r3.metrica
            monitor-enter(r0)
            int r1 = r3.license     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L53
            eٌِْ r1 = r3.vip     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.ad     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            int r1 = r3.license     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L53
            goto L18
        L16:
            r4 = move-exception
            goto L5b
        L18:
            int r1 = r3.license     // Catch: java.lang.Throwable -> L16
            if (r1 <= r4) goto L51
            eٌِْ r1 = r3.vip     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.ad     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L27
            goto L51
        L27:
            eٌِْ r1 = r3.vip     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.ad     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = defpackage.AbstractC13480e.m3587goto(r1)     // Catch: java.lang.Throwable -> L16
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L3b
            monitor-exit(r0)
            return
        L3b:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            r1.getValue()     // Catch: java.lang.Throwable -> L16
            eٌِْ r1 = r3.vip     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.ad     // Catch: java.lang.Throwable -> L16
            r1.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r1 = r3.license     // Catch: java.lang.Throwable -> L16
            int r1 = r1 + (-1)
            r3.license = r1     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            goto L0
        L51:
            monitor-exit(r0)
            return
        L53:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L5b:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4662e.appmetrica(int):void");
    }

    public final Object license(Object obj) {
        Object remove;
        synchronized (this.metrica) {
            try {
                remove = this.vip.ad.remove(obj);
                if (remove != null) {
                    this.license--;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    public final Object metrica(Object obj, Object obj2) {
        Object put;
        synchronized (this.metrica) {
            try {
                this.license++;
                put = this.vip.ad.put(obj, obj2);
                if (put != null) {
                    this.license--;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        appmetrica(this.ad);
        return put;
    }

    public final String toString() {
        String str;
        synchronized (this.metrica) {
            try {
                int i = this.appmetrica;
                int i2 = this.purchase + i;
                str = "LruCache[maxSize=" + this.ad + ",hits=" + this.appmetrica + ",misses=" + this.purchase + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final Object vip(Object obj) {
        Object put;
        synchronized (this.metrica) {
            Object obj2 = this.vip.ad.get(obj);
            if (obj2 != null) {
                this.appmetrica++;
                return obj2;
            }
            this.purchase++;
            Object ad = ad(obj);
            if (ad == null) {
                return null;
            }
            synchronized (this.metrica) {
                try {
                    put = this.vip.ad.put(obj, ad);
                    if (put != null) {
                        this.vip.ad.put(obj, put);
                    } else {
                        this.license++;
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                return put;
            }
            appmetrica(this.ad);
            return ad;
        }
    }
}
