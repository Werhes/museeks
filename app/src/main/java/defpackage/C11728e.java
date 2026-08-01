package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11728e {
    public final C8591e ad;
    public final Object appmetrica = new Object();
    public final LinkedHashMap billing = new LinkedHashMap();
    public final C8020e license;
    public final InterfaceC14312e metrica;
    public C8763e purchase;
    public C8823e startapp;
    public final C9872e vip;
    public LinkedHashMap yandex;

    public C11728e(C8591e c8591e, C9872e c9872e, InterfaceC14312e interfaceC14312e, C8020e c8020e) {
        this.ad = c8591e;
        this.vip = c9872e;
        this.metrica = interfaceC14312e;
        this.license = c8020e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C11728e r4, java.util.List r5, long r6, defpackage.AbstractC10731e r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C1621e
            if (r0 == 0) goto L13
            r0 = r8
            eؓؗٗ r0 = (defpackage.C1621e) r0
            int r1 = r0.f4538e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4538e = r1
            goto L18
        L13:
            eؓؗٗ r0 = new eؓؗٗ
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.f4537e
            int r8 = r0.f4538e
            r1 = 1
            if (r8 == 0) goto L2d
            if (r8 != r1) goto L25
            defpackage.AbstractC2003e.purchase(r4)
            goto L42
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.AbstractC2003e.purchase(r4)
            eؘِۖ r4 = new eؘِۖ
            r8 = 0
            r2 = 1
            r4.<init>(r2, r8, r5)
            r0.f4538e = r1
            java.lang.Object r4 = defpackage.AbstractC8306e.mopub(r6, r4, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r4 != r5) goto L42
            return r5
        L42:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L48
            eْۨٝ r4 = defpackage.C13664e.f27089e
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11728e.ad(eؘِٓ, java.util.List, long, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object metrica(defpackage.C11728e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C8465e
            if (r0 == 0) goto L13
            r0 = r5
            eٌُؔ r0 = (defpackage.C8465e) r0
            int r1 = r0.f17236e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17236e = r1
            goto L18
        L13:
            eٌُؔ r0 = new eٌُؔ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f17235e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r0.f17236e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.AbstractC2003e.purchase(r5)     // Catch: java.util.concurrent.CancellationException -> L49
            return r5
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r5)
            java.lang.Object r5 = r4.appmetrica
            monitor-enter(r5)
            eٌ٘ٚ r2 = r4.purchase     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L5b
            eٌٝؐ r4 = r4.startapp     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L3e
            goto L5b
        L3e:
            monitor-exit(r5)
            r0.f17236e = r3     // Catch: java.util.concurrent.CancellationException -> L49
            java.lang.Object r4 = r2.tapsense(r0)     // Catch: java.util.concurrent.CancellationException -> L49
            if (r4 != r1) goto L48
            return r1
        L48:
            return r4
        L49:
            boolean r4 = defpackage.AbstractC9464e.admob()
            if (r4 == 0) goto L56
            java.lang.String r4 = "CXCP"
            java.lang.String r5 = "Surface setup was cancelled"
            android.util.Log.w(r4, r5)
        L56:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L59:
            r4 = move-exception
            goto L5f
        L5b:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L59
            monitor-exit(r5)
            return r4
        L5f:
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11728e.metrica(eؘِٓ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1908e purchase(C11728e c11728e, C12701e c12701e, C8020e c8020e, Map map) {
        C8823e c8823e;
        synchronized (c11728e.appmetrica) {
            try {
                if (c11728e.purchase != null) {
                    throw new IllegalStateException("Surfaces should only be set up once!");
                }
                if (c11728e.startapp != null) {
                    throw new IllegalStateException("Surfaces being setup after stopped!");
                }
                if (c11728e.yandex != null) {
                    throw new IllegalStateException("Check failed.");
                }
                List list = (List) c8020e.billing.getValue();
                InterfaceC5083e interfaceC5083e = null;
                try {
                    AbstractC3752e.metrica(list);
                    C8763e vip = AbstractC5336e.vip(3, null, c11728e.ad.ad, new C3472e(c8020e, c11728e, list, map, c12701e, (InterfaceC5083e) null, 16));
                    vip.mo692else(new C16934e(2, list));
                    c11728e.purchase = vip;
                    c8823e = vip;
                } catch (C3720e e) {
                    if (AbstractC9464e.admob()) {
                        Log.w("CXCP", "Failed to increment DeferrableSurfaces: Surfaces closed");
                    }
                    AbstractC5336e.purchase(c11728e.ad.ad, null, 0, new C10954e(c8020e, e, interfaceC5083e, 28), 3);
                    c8823e = AbstractC16565e.ad(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8823e;
    }

    public static final void vip(C11728e c11728e) {
        Set keySet;
        C13322e ad = c11728e.vip.ad();
        synchronized (ad.ad) {
            try {
                ad.metrica.add(c11728e);
                LinkedHashMap linkedHashMap = ad.vip;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 0) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                keySet = linkedHashMap2.keySet();
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            c11728e.license((Surface) it.next());
        }
    }

    public final void appmetrica(Surface surface) {
        synchronized (this.appmetrica) {
            try {
                AbstractC5113e abstractC5113e = (AbstractC5113e) this.billing.remove(surface);
                if (abstractC5113e != null) {
                    if (AbstractC9464e.smaato("CXCP")) {
                        Log.d("CXCP", "SurfaceInactive " + abstractC5113e + " in " + this);
                    }
                    this.metrica.startapp(abstractC5113e);
                    try {
                        abstractC5113e.vip();
                    } catch (IllegalStateException e) {
                        if (AbstractC9464e.admob()) {
                            Log.w("CXCP", "Error when " + surface + " going to decrease the use count.", e);
                        }
                    }
                    billing();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void billing() {
        synchronized (this.appmetrica) {
            try {
                if (this.billing.isEmpty() && this.yandex == null) {
                    if (AbstractC9464e.smaato("CXCP")) {
                        Log.d("CXCP", this + " remove surface listener");
                    }
                    this.vip.ad().vip(this);
                    C8823e c8823e = this.startapp;
                    if (c8823e != null) {
                        c8823e.m2175import(Unit.INSTANCE);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void license(Surface surface) {
        AbstractC5113e abstractC5113e;
        synchronized (this.appmetrica) {
            try {
                LinkedHashMap linkedHashMap = this.yandex;
                if (linkedHashMap != null && (abstractC5113e = (AbstractC5113e) linkedHashMap.get(surface)) != null) {
                    if (!this.billing.containsKey(surface)) {
                        if (AbstractC9464e.smaato("CXCP")) {
                            Log.d("CXCP", "SurfaceActive " + abstractC5113e + " in " + this);
                        }
                        this.billing.put(surface, abstractC5113e);
                        try {
                            abstractC5113e.license();
                        } catch (C3720e e) {
                            if (AbstractC9464e.admob()) {
                                Log.w("CXCP", "Error when " + surface + " going to increase the use count.", e);
                            }
                            this.license.ad(e.f8303e);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
