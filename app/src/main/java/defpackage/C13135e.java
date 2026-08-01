package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13135e implements InterfaceC8943e {
    public final C2691e Signature;
    public final C9823e ad;
    public final int adcel;
    public InterfaceC18069e admob;
    public final C7744e advert;
    public final Map amazon;
    public int applovin;
    public final C13399e appmetrica;
    public final InterfaceC6755e billing;
    public Map inmobi;
    public final LinkedHashMap isPro;
    public final CountDownLatch isVip;
    public final C13322e license;
    public C1103e loadAd;
    public final C18464e metrica;
    public final Object mopub;
    public LinkedHashMap pro;
    public final C14955e purchase;
    public Object remoteconfig;
    public final CountDownLatch signatures;
    public final Map smaato;
    public final InterfaceC18435e startapp;
    public C0180e subscription;
    public boolean tapsense;
    public final InterfaceC17353e vip;
    public final C17280e yandex;

    public C13135e(C9823e c9823e, InterfaceC17353e interfaceC17353e, C18464e c18464e, C13322e c13322e, C13399e c13399e, C14955e c14955e, AbstractC10423e abstractC10423e, InterfaceC6755e interfaceC6755e, C17280e c17280e, InterfaceC18435e interfaceC18435e) {
        this.ad = c9823e;
        this.vip = interfaceC17353e;
        this.metrica = c18464e;
        this.license = c13322e;
        this.appmetrica = c13399e;
        this.purchase = c14955e;
        this.billing = interfaceC6755e;
        this.yandex = c17280e;
        this.startapp = interfaceC18435e;
        C11498e c11498e = AbstractC1135e.ad;
        c11498e.getClass();
        this.adcel = C11498e.vip.incrementAndGet(c11498e);
        this.mopub = new Object();
        this.advert = AbstractC14430e.appmetrica(Boolean.FALSE);
        this.smaato = DesugarCollections.synchronizedMap(new HashMap());
        this.amazon = DesugarCollections.synchronizedMap(new HashMap());
        this.Signature = abstractC10423e != null ? new C2691e(abstractC10423e) : null;
        this.applovin = 1;
        this.signatures = new CountDownLatch(1);
        this.isVip = new CountDownLatch(1);
        this.isPro = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eّؖٝ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object startapp(defpackage.C13135e r12, defpackage.AbstractC10731e r13) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13135e.startapp(eًْۚ, eُؑ۠):java.lang.Object");
    }

    public final void Signature(Map map, Map map2) {
        Surface surface;
        AutoCloseable autoCloseable;
        Set m3582e = AbstractC13480e.m3582e(map.values());
        Set m3582e2 = AbstractC13480e.m3582e(map2.values());
        Iterator it = AbstractC4511e.smaato(m3582e, m3582e2).iterator();
        do {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.isPro;
            if (!hasNext) {
                for (Surface surface2 : AbstractC4511e.smaato(m3582e2, m3582e)) {
                    linkedHashMap.put(surface2, this.license.ad(surface2));
                }
                return;
            }
            surface = (Surface) it.next();
            autoCloseable = (AutoCloseable) linkedHashMap.remove(surface);
            if (autoCloseable == null) {
                autoCloseable = null;
            } else if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                AbstractC6418e.smaato((ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        } while (autoCloseable != null);
        throw new IllegalStateException(("Surface " + surface + " doesn't have a matching surface token!").toString());
    }

    @Override // defpackage.InterfaceC8260e
    public final void ad() {
        if (this.advert.ad(Boolean.FALSE, Boolean.TRUE)) {
            Log.d("CXCP", this + " session finalizing");
            Trace.beginSection(this + "#onSessionFinalized");
            loadAd();
            amazon(0L);
            Trace.endSection();
        }
    }

    public final void adcel(InterfaceC6545e interfaceC6545e) {
        synchronized (this.mopub) {
            try {
                C0180e c0180e = this.subscription;
                if (c0180e == null && interfaceC6545e != null) {
                    C3895e m4487e = this.metrica.m4487e(interfaceC6545e, this.smaato, this.amazon);
                    C0180e c0180e2 = new C0180e(interfaceC6545e, new C10379e(m4487e), m4487e);
                    this.subscription = c0180e2;
                    c0180e = c0180e2;
                }
                if (this.applovin == 3 && c0180e != null) {
                    boolean z = (this.remoteconfig == null || this.pro == null) ? false : true;
                    Unit unit = Unit.INSTANCE;
                    if (z) {
                        smaato(false);
                    }
                    synchronized (this.mopub) {
                        this.appmetrica.getClass();
                        Log.i("CXCP", "Configured " + this + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - this.loadAd.ad) / 1000000.0d)}, 1)));
                        this.ad.vip(c0180e.vip);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void advert() {
        C0180e c0180e;
        synchronized (this.mopub) {
            try {
                int i = this.applovin;
                if (i != 4 && i != 5) {
                    this.applovin = 4;
                    C0180e c0180e2 = this.subscription;
                    InterfaceC5083e interfaceC5083e = null;
                    boolean z = false;
                    if (c0180e2 != null) {
                        this.subscription = null;
                    } else {
                        if (this.purchase.license && this.tapsense) {
                            z = true;
                        }
                        c0180e2 = null;
                    }
                    Unit unit = Unit.INSTANCE;
                    C2691e c2691e = this.Signature;
                    if (c2691e != null) {
                        c2691e.m1047while();
                    }
                    int i2 = 2;
                    if (z) {
                        Log.d("CXCP", "Waiting for CameraCaptureSession configuration");
                        if (((Unit) this.yandex.vip(3000L, new C4738e(this, interfaceC5083e, i2))) == null) {
                            Log.e("CXCP", "Waiting for CameraCaptureSession configuration timed out");
                        }
                        synchronized (this.mopub) {
                            c0180e = this.subscription;
                            this.subscription = null;
                        }
                        c0180e2 = c0180e;
                    }
                    Trace.beginSection(this.ad + "#onGraphStopping");
                    C9823e c9823e = this.ad;
                    c9823e.getClass();
                    Log.d("CXCP", c9823e + " onGraphStopping");
                    C1615e c1615e = c9823e.license;
                    C8072e c8072e = C8072e.vip;
                    c1615e.getClass();
                    c1615e.smaato(null, c8072e);
                    c9823e.vip.subs(null);
                    for (C5373e c5373e : c9823e.metrica) {
                        C5241e c5241e = c5373e.ad;
                        C12701e c12701e = c5373e.vip;
                        if (c12701e == null) {
                            c12701e = null;
                        }
                        c5241e.vip(c12701e, c8072e);
                    }
                    Trace.endSection();
                    if (c0180e2 != null) {
                        C10379e c10379e = c0180e2.vip;
                        Log.d("CXCP", this + " Shutdown");
                        Trace.beginSection(this + "#shutdown");
                        if (this.purchase.ad && ((Unit) this.yandex.vip(2000L, new C9143e(this, c10379e, interfaceC5083e, 3))) == null) {
                            Log.e("CXCP", "Failed to abort captures in 2000ms");
                        }
                        Trace.beginSection(this + "#disconnect");
                        c0180e2.metrica.license();
                        Trace.endSection();
                        if (this.purchase.license && ((Unit) this.yandex.vip(3000L, new C9143e(this, c0180e2, interfaceC5083e, i2))) == null) {
                            Log.e("CXCP", "Failed to close the capture session in 3000ms");
                        }
                        Trace.beginSection(this.ad + "#onGraphStopped");
                        this.ad.metrica();
                        Trace.endSection();
                        Trace.endSection();
                    } else {
                        Trace.beginSection(this.ad + "#onGraphStopped");
                        this.ad.metrica();
                        Trace.endSection();
                    }
                    this.signatures.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void amazon(long j) {
        List<AutoCloseable> m3575continue;
        if (j != 0) {
            AbstractC5336e.purchase(this.startapp, null, 0, new C2454e(j, this, (InterfaceC5083e) null), 3);
            return;
        }
        Log.d("CXCP", "Finalizing " + this);
        synchronized (this.mopub) {
            m3575continue = AbstractC13480e.m3575continue(this.isPro.values());
            this.isPro.clear();
        }
        for (AutoCloseable autoCloseable : m3575continue) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                AbstractC6418e.smaato((ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
    }

    @Override // defpackage.InterfaceC8943e
    public final void appmetrica() {
        Log.d("CXCP", this + " Ready");
    }

    @Override // defpackage.InterfaceC8943e
    public final void billing(InterfaceC6545e interfaceC6545e) {
        Log.d("CXCP", this + " Configured");
        Trace.beginSection(this + "#configure");
        adcel(interfaceC6545e);
        this.isVip.countDown();
        C2691e c2691e = this.Signature;
        if (c2691e != null) {
            c2691e.m1047while();
        }
        Trace.endSection();
    }

    @Override // defpackage.InterfaceC8943e
    public final void license() {
        Log.d("CXCP", this + " Closed");
        Trace.beginSection(this + "#onClosed");
        loadAd();
        this.isVip.countDown();
        C2691e c2691e = this.Signature;
        if (c2691e != null) {
            c2691e.m1047while();
        }
        Trace.endSection();
    }

    public final void loadAd() {
        long j;
        boolean z;
        int i;
        advert();
        synchronized (this.mopub) {
            try {
                j = 0;
                if (this.applovin != 5) {
                    z = true;
                    if (this.admob != null && this.tapsense && (i = this.purchase.metrica) != 1) {
                        if (i == 2) {
                            j = 2000;
                        }
                    }
                    this.admob = null;
                    this.applovin = 5;
                    Unit unit = Unit.INSTANCE;
                }
                z = false;
                this.admob = null;
                this.applovin = 5;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            amazon(j);
        }
    }

    @Override // defpackage.InterfaceC8943e
    public final void metrica() {
        Log.d("CXCP", this + " Active");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    public final void mopub(Map map) {
        synchronized (this.mopub) {
            try {
                int i = this.applovin;
                if (i != 4 && i != 5) {
                    Map map2 = this.inmobi;
                    if (map2 == null) {
                        map2 = C9139e.f18290e;
                    }
                    Signature(map2, map);
                    this.inmobi = map;
                    ?? r1 = this.remoteconfig;
                    InterfaceC5083e interfaceC5083e = null;
                    if (r1 != 0 && this.pro == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (r1.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == r1.size()) {
                            this.pro = linkedHashMap;
                            AbstractC5336e.purchase(this.startapp, null, 0, new C9042e(this, interfaceC5083e, 8), 3);
                        }
                    }
                    AbstractC5336e.purchase(this.startapp, null, 0, new C11722e(this, interfaceC5083e, 1), 3);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC8943e
    public final void purchase() {
        Log.d("CXCP", this + " CaptureQueueEmpty");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    public final void smaato(boolean z) {
        C0180e c0180e;
        ?? r2;
        LinkedHashMap linkedHashMap;
        boolean z2;
        synchronized (this.mopub) {
            c0180e = this.subscription;
            r2 = this.remoteconfig;
            linkedHashMap = this.pro;
            Unit unit = Unit.INSTANCE;
        }
        if (c0180e == null || r2 == 0 || linkedHashMap == null) {
            return;
        }
        Trace.beginSection(this + "#finalizeOutputConfigurations");
        this.appmetrica.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        for (Map.Entry entry : r2.entrySet()) {
            int i = ((C13269e) entry.getKey()).ad;
            InterfaceC2901e interfaceC2901e = (InterfaceC2901e) entry.getValue();
            Object obj = linkedHashMap.get(new C13269e(i));
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ((C2012e) interfaceC2901e).ad((Surface) obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = r2.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add((InterfaceC2901e) ((Map.Entry) it.next()).getValue());
        }
        c0180e.ad.mo1017switch(AbstractC13480e.m3575continue(linkedHashSet));
        synchronized (this.mopub) {
            try {
                z2 = false;
                if (this.applovin == 3) {
                    this.smaato.putAll(linkedHashMap);
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        int i2 = ((C13269e) entry2.getKey()).ad;
                        Surface surface = (Surface) entry2.getValue();
                        C12550e ad = ((C2107e) this.billing).ad(i2);
                        if (ad == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (ad.vip.size() != 1) {
                            throw new IllegalStateException("Cannot finalize a multi-output stream!");
                        }
                        this.amazon.put(new C18319e(((C7662e) AbstractC13480e.m3590instanceof(ad.vip)).ad), surface);
                    }
                    this.appmetrica.getClass();
                    long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Finalized ");
                    ArrayList arrayList = new ArrayList(r2.size());
                    Iterator it2 = r2.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C13269e(((C13269e) ((Map.Entry) it2.next()).getKey()).ad));
                    }
                    sb.append(arrayList);
                    sb.append(" for ");
                    sb.append(this);
                    sb.append(" in ");
                    sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(elapsedRealtimeNanos2 / 1000000.0d)}, 1)));
                    Log.i("CXCP", sb.toString());
                    z2 = true;
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2 && z) {
            C9823e c9823e = this.ad;
            c9823e.getClass();
            Log.d("CXCP", c9823e + " onGraphModified");
            c9823e.vip.f21517e.m4495e(C18369e.vip);
        }
        Trace.endSection();
    }

    public final String toString() {
        return "CaptureSessionState-" + this.adcel;
    }

    @Override // defpackage.InterfaceC8260e
    public final void vip() {
        Log.d("CXCP", this + " session disconnecting");
        Trace.beginSection(this + "#onSessionDisconnected");
        advert();
        try {
            Trace.beginSection(this + "#onSessionDisconnected Await");
            this.signatures.await();
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.InterfaceC8943e
    public final void yandex() {
        Log.w("CXCP", this + " Configuration Failed");
        Trace.beginSection(this + "#onConfigureFailed");
        this.ad.ad(new C16815e(9, false));
        loadAd();
        this.isVip.countDown();
        C2691e c2691e = this.Signature;
        if (c2691e != null) {
            c2691e.m1047while();
        }
        Trace.endSection();
    }
}
