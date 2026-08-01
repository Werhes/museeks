package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4760e {
    public final InterfaceC18435e ad;
    public final C13322e adcel;
    public C8419e ads;
    public final C13399e advert;
    public final C5327e amazon;
    public Object applovin;
    public final C14233e appmetrica;
    public final InterfaceC17353e billing;
    public C0216e inmobi;
    public C13135e isPro;
    public final C9823e license;
    public final C2107e loadAd;
    public final C9485e metrica;
    public final C5122e mopub;
    public C8419e premium;
    public C1096e pro;
    public final C14246e purchase;
    public AbstractC8434e remoteconfig;
    public C1103e signatures;
    public final C13783e smaato;
    public final C15682e startapp;
    public C8419e subs;
    public C8419e tapsense;
    public final C17280e vip;
    public final C18464e yandex;
    public final Object Signature = new Object();
    public boolean admob = true;
    public AbstractC3995e subscription = C9014e.remoteconfig;
    public final C8823e isVip = new C8823e();

    public C4760e(InterfaceC18435e interfaceC18435e, C17280e c17280e, C12204e c12204e, C9485e c9485e, C9823e c9823e, C14233e c14233e, C14246e c14246e, InterfaceC17353e interfaceC17353e, C18464e c18464e, C15682e c15682e, C13322e c13322e, C5122e c5122e, C13399e c13399e, C13783e c13783e, C5327e c5327e, C2107e c2107e, C1758e c1758e) {
        this.ad = interfaceC18435e;
        this.vip = c17280e;
        this.metrica = c9485e;
        this.license = c9823e;
        this.appmetrica = c14233e;
        this.purchase = c14246e;
        this.billing = interfaceC17353e;
        this.yandex = c18464e;
        this.startapp = c15682e;
        this.adcel = c13322e;
        this.mopub = c5122e;
        this.advert = c13399e;
        this.smaato = c13783e;
        this.amazon = c5327e;
        this.loadAd = c2107e;
        this.remoteconfig = new C5716e(c9485e.ad);
        InterfaceC5083e interfaceC5083e = null;
        this.premium = AbstractC5336e.purchase(interfaceC18435e, null, 0, new C6716e(this, interfaceC5083e, 0), 3);
        this.subs = AbstractC5336e.purchase(interfaceC18435e, null, 0, new C6716e(this, interfaceC5083e, 1), 3);
    }

    public static final void ad(C4760e c4760e, AbstractC8434e abstractC8434e) {
        Log.d("CXCP", c4760e + " (" + ((Object) C5060e.vip(c4760e.metrica.ad)) + ") camera status changed: " + abstractC8434e);
        synchronized (c4760e.Signature) {
            try {
                if (c4760e.purchase()) {
                    return;
                }
                if (abstractC8434e instanceof C3064e) {
                    c4760e.remoteconfig = abstractC8434e;
                } else if (abstractC8434e instanceof C5716e) {
                    c4760e.remoteconfig = abstractC8434e;
                } else if (abstractC8434e instanceof C12448e) {
                    c4760e.advert.getClass();
                    c4760e.signatures = new C1103e(SystemClock.elapsedRealtimeNanos());
                }
                c4760e.yandex();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void metrica(C4760e c4760e) {
        if (c4760e.purchase()) {
            Log.w("CXCP", "Ignoring stop(): " + c4760e + " is already closed");
            return;
        }
        AbstractC3995e abstractC3995e = c4760e.subscription;
        C9014e c9014e = C9014e.pro;
        if (abstractC3995e.equals(c9014e) || c4760e.subscription.equals(C9014e.remoteconfig)) {
            Log.w("CXCP", "Ignoring stop(): " + c4760e + " already stopping or stopped");
            return;
        }
        C0216e c0216e = c4760e.inmobi;
        C13135e c13135e = c4760e.isPro;
        c4760e.inmobi = null;
        c4760e.isPro = null;
        c4760e.subscription = c9014e;
        Log.d("CXCP", "Stopping " + c4760e);
        c4760e.appmetrica(c13135e, c0216e);
    }

    public static final void vip(C4760e c4760e, C10211e c10211e) {
        synchronized (c4760e.Signature) {
            try {
                if (c4760e.purchase()) {
                    return;
                }
                C1096e c1096e = c10211e.startapp;
                if (c1096e != null) {
                    c4760e.pro = c1096e;
                    int i = c1096e.ad;
                    if (i != 6 && i != 1 && i != 2) {
                        c4760e.subscription = C9014e.admob;
                        Log.d("CXCP", c4760e + " encountered error: " + ((Object) C1096e.ad(c10211e.startapp.ad)));
                    }
                    c4760e.subscription = C9014e.Signature;
                    Log.d("CXCP", c4760e + " is disconnected");
                } else {
                    c4760e.subscription = C9014e.remoteconfig;
                }
                c4760e.appmetrica.purchase();
                c4760e.yandex();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void appmetrica(C13135e c13135e, C0216e c0216e) {
        C8419e purchase = AbstractC5336e.purchase(this.ad, null, 0, new C4870e(c13135e, c0216e, null, 5), 3);
        if (this.subscription.equals(C9014e.loadAd)) {
            purchase.mo692else(new C17933e(this, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map, java.lang.Object] */
    public final void billing() {
        if (purchase()) {
            Log.i("CXCP", "Ignoring start(): " + this + " is already closed");
            return;
        }
        AbstractC3995e abstractC3995e = this.subscription;
        C9014e c9014e = C9014e.subscription;
        if (abstractC3995e.equals(c9014e)) {
            Log.w("CXCP", "Ignoring start(): " + this + " is already started");
            return;
        }
        InterfaceC5083e interfaceC5083e = null;
        this.pro = null;
        C9485e c9485e = this.metrica;
        String str = c9485e.ad;
        List m3575continue = AbstractC13480e.m3575continue(AbstractC4511e.advert(Collections.singleton(new C5060e(str)), new C5060e(str)));
        C17933e c17933e = new C17933e(this, 1);
        C15682e c15682e = this.startapp;
        InterfaceC18435e interfaceC18435e = c15682e.license;
        C9823e c9823e = this.license;
        C0216e c0216e = new C0216e(str, c9823e, interfaceC18435e);
        if (((C14137e) c15682e.appmetrica.f36189e).amazon(new C6504e(c0216e, m3575continue, c9823e, c17933e)) instanceof C8870e) {
            Log.e("CXCP", "Camera open request failed for " + ((Object) C5060e.vip(str)) + '!');
            c9823e.ad(new C16815e(12, false));
            c0216e = null;
        }
        if (c0216e == null) {
            Log.e("CXCP", "Failed to start " + this + ": Open request submission failed");
            return;
        }
        if (this.inmobi != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.isPro != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.inmobi = c0216e;
        C13135e c13135e = new C13135e(this.license, this.billing, this.yandex, this.adcel, this.advert, c9485e.loadAd, null, this.loadAd, this.vip, this.ad);
        this.isPro = c13135e;
        ?? r2 = this.applovin;
        if (r2 != 0) {
            c13135e.mopub(r2);
        }
        this.subscription = c9014e;
        Log.d("CXCP", "Started " + this);
        C8419e c8419e = this.ads;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        this.ads = AbstractC5336e.purchase(this.ad, null, 0, new C6716e(this, interfaceC5083e, 2), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(defpackage.AbstractC10731e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C11051e
            if (r0 == 0) goto L13
            r0 = r6
            eُۣٗ r0 = (defpackage.C11051e) r0
            int r1 = r0.f21927e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21927e = r1
            goto L18
        L13:
            eُۣٗ r0 = new eُۣٗ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f21926e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r0.f21927e
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.AbstractC2003e.purchase(r6)
            goto La4
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            defpackage.AbstractC2003e.purchase(r6)
            java.lang.String r6 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r4 = "#awaitClosed"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r6, r2)
            java.lang.Object r6 = r5.Signature
            monitor-enter(r6)
            eٌؖٙ r2 = r5.subscription     // Catch: java.lang.Throwable -> L70
            eٌ۟ۘ r4 = defpackage.C9014e.amazon     // Catch: java.lang.Throwable -> L70
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L72
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            r1.append(r5)     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = "#awaitClosed: Controller is already closed."
            r1.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L70
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L70
            monitor-exit(r6)
            return r0
        L70:
            r0 = move-exception
            goto La7
        L72:
            eٌؖٙ r2 = r5.subscription     // Catch: java.lang.Throwable -> L70
            eٌ۟ۘ r4 = defpackage.C9014e.loadAd     // Catch: java.lang.Throwable -> L70
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L96
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            r1.append(r5)     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = "#awaitClosed: Controller isn't closing!"
            r1.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L70
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L70
            monitor-exit(r6)
            return r0
        L96:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L70
            monitor-exit(r6)
            eٌٝؐ r6 = r5.isVip
            r0.f21927e = r3
            java.lang.Object r6 = r6.tapsense(r0)
            if (r6 != r1) goto La4
            return r1
        La4:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        La7:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4760e.license(eُؑ۠):java.lang.Object");
    }

    public final boolean purchase() {
        return AbstractC7890e.billing(this.subscription, C9014e.loadAd) || AbstractC7890e.billing(this.subscription, C9014e.amazon);
    }

    public final void startapp(Map map) {
        synchronized (this.Signature) {
            if (purchase()) {
                return;
            }
            this.applovin = map;
            C13135e c13135e = this.isPro;
            if (c13135e != null) {
                c13135e.mopub(map);
            }
        }
    }

    public final String toString() {
        return "Camera2CameraController(" + this.smaato + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
    
        if (r3.ad != 9) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
    
        if (r3.ad != 8) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yandex() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4760e.yandex():void");
    }
}
