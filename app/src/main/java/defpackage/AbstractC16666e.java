package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Range;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۧۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16666e {

    /* renamed from: class, reason: not valid java name */
    public static final C1493e f32683class = new Object();
    public InterfaceC13777e Signature;
    public final C11725e ad;
    public final C14677e adcel;
    public final C0912e admob;
    public final C6594e ads;
    public final Range advert;
    public C14598e amazon;
    public final C6594e applovin;
    public Executor appmetrica;
    public C12477e billing;
    public final HashMap crashlytics;
    public final long firebase;
    public final C6736e inmobi;
    public final C1326e isPro;
    public final C6736e isVip;
    public C3373e license;
    public C3936e loadAd;
    public C9301e metrica;
    public final C14677e mopub;
    public final C6594e premium;
    public final boolean pro;
    public C10697e purchase;
    public int remoteconfig;
    public final boolean signatures;
    public C1874e smaato;
    public final C16108e startapp;
    public final HashSet subs;
    public final C3694e subscription;
    public C12309e tapsense;
    public int vip;
    public C16864e yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [eٍْٚ, eؙۢۙ] */
    /* JADX WARN: Type inference failed for: r2v17, types: [eٍْٚ, eؙۢۙ] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, eٍ۟ۤ, eؒۛ٘] */
    /* JADX WARN: Type inference failed for: r2v29, types: [eٍؚؐ, eٖۜؓ] */
    public AbstractC16666e(Context context) {
        boolean z;
        ListenableFuture listenableFuture;
        int i;
        int i2;
        Object[] objArr;
        Object[] objArr2;
        C5306e c5306e = C6097e.vip.ad;
        synchronized (c5306e.f11399e) {
            Object obj = AbstractC7093e.ad;
            z = false;
            Object[] objArr3 = 0;
            objArr2 = 0;
            objArr = 0;
            c5306e.f11401e = AbstractC0978e.ad(Build.VERSION.SDK_INT >= 34 ? AbstractC5666e.advert(context) : 0);
            listenableFuture = (C6815e) c5306e.f11402e;
            int i3 = 1;
            i = 11;
            i2 = 22;
            if (listenableFuture == null) {
                C13945e c13945e = new C13945e(context, null);
                RunnableC3397e remoteconfig = AbstractC15792e.remoteconfig(AbstractC15792e.remoteconfig(C6815e.vip((ListenableFuture) c5306e.f11405e), new C17687e(13, new C6846e(i3, c13945e)), AbstractC3062e.billing()), new C17974e(i, new C17687e(14, new Cthrows(i2, c5306e, c13945e, context))), AbstractC3062e.billing());
                c5306e.f11402e = remoteconfig;
                remoteconfig.ad(new RunnableC17144e((Object) remoteconfig, (Object) new C17974e(15, c5306e), (int) (objArr3 == true ? 1 : 0)), AbstractC3062e.billing());
                listenableFuture = AbstractC15792e.smaato(remoteconfig);
            }
        }
        RunnableC3397e remoteconfig2 = AbstractC15792e.remoteconfig(AbstractC15792e.remoteconfig(listenableFuture, new C17974e(i, new C15945e(new C4526e(24))), AbstractC3062e.billing()), new C17974e(i, new C4403e(27)), AbstractC3062e.billing());
        this.ad = C11725e.metrica;
        this.vip = 3;
        new HashMap();
        this.startapp = C13343e.firebase;
        C14677e c14677e = C14677e.metrica;
        this.adcel = c14677e;
        this.mopub = c14677e;
        this.advert = C6884e.yandex;
        this.remoteconfig = -1;
        this.pro = true;
        this.signatures = true;
        this.isVip = new AbstractC9559e();
        this.inmobi = new AbstractC9559e();
        ?? abstractC9790e = new AbstractC9790e(new C16360e(0));
        this.isPro = abstractC9790e;
        C4403e c4403e = new C4403e(28);
        C11512e c11512e = new C11512e(c4403e.apply(abstractC9790e.license()), c4403e);
        C1326e c1326e = c11512e.loadAd;
        c11512e.loadAd = abstractC9790e;
        AbstractC13062e.billing(new RunnableC4904e(i2, c1326e, c11512e, (Object) abstractC9790e));
        this.applovin = new C6594e(i2, z);
        this.ads = new C6594e(i2, (boolean) (objArr == true ? 1 : 0));
        this.premium = new C6594e(i2, (boolean) (objArr2 == true ? 1 : 0));
        this.subs = new HashSet();
        this.crashlytics = new HashMap();
        this.firebase = TimeUnit.MILLISECONDS.toNanos(5000L);
        Context ad = AbstractC7093e.ad(context);
        C3186e c3186e = new C3186e(2);
        metrica(c3186e);
        C4069e c4069e = c3186e.f7297e;
        c4069e.yandex(InterfaceC14405e.ads, c14677e);
        C5450e c5450e = new C5450e(C17015e.vip(c4069e));
        AbstractC14100e.purchase(c5450e);
        ?? abstractC16510e = new AbstractC16510e(c5450e);
        abstractC16510e.pro = C9301e.ads;
        this.metrica = abstractC16510e;
        this.license = appmetrica(null);
        this.billing = license(null, null, null);
        this.yandex = billing();
        C10454e c10454e = (C10454e) this;
        AbstractC15792e.remoteconfig(remoteconfig2, new C17974e(i, new C3694e(c10454e)), AbstractC3062e.amazon());
        this.admob = new C0912e(ad);
        this.subscription = new C3694e(c10454e);
    }

    public final void Signature() {
        C5783e yandex = yandex();
        if (yandex == null) {
            AbstractC9464e.yandex("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            C3373e c3373e = this.license;
            c3373e.getClass();
            C13319e c13319e = new C13319e(f32683class);
            c3373e.isVip = c13319e;
            c3373e.appmetrica().yandex(c13319e);
            return;
        }
        C3373e c3373e2 = this.license;
        InterfaceC14003e interfaceC14003e = yandex.vip;
        c3373e2.getClass();
        C13319e c13319e2 = new C13319e(interfaceC14003e);
        c3373e2.isVip = c13319e2;
        c3373e2.appmetrica().yandex(c13319e2);
        AbstractC9464e.yandex("CameraController", "Set ScreenFlash instance to ImageCapture, provided by " + yandex.ad.name());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.InterfaceC13777e r7, defpackage.C3936e r8) {
        /*
            r6 = this;
            defpackage.AbstractC13062e.metrica()
            eٓؖۚ r0 = r6.Signature
            r1 = 0
            if (r0 == r7) goto L38
            r6.Signature = r7
            eٍؚؐ r0 = r6.metrica
            r0.getClass()
            eؘؓؕ r2 = defpackage.C9301e.ads
            defpackage.AbstractC13062e.metrica()
            if (r7 != 0) goto L1f
            r0.remoteconfig = r1
            r7 = 2
            r0.license = r7
            r0.subscription()
            goto L38
        L1f:
            r0.remoteconfig = r7
            r0.pro = r2
            android.util.Size r7 = r0.metrica()
            if (r7 == 0) goto L35
            eّّٗ r7 = r0.yandex
            eؘؗۜ r7 = (defpackage.C5450e) r7
            eؚؓٝ r2 = r0.startapp
            r0.m2542this(r7, r2)
            r0.admob()
        L35:
            r0.Signature()
        L38:
            eؙؖؑ r7 = r6.loadAd
            if (r7 == 0) goto L62
            int r7 = r6.startapp(r8)
            r0 = -1
            if (r7 == r0) goto L4b
            eؘؔٔ r2 = new eؘؔٔ
            r3 = 1
            r4 = 0
            r2.<init>(r7, r3, r4)
            goto L4c
        L4b:
            r2 = r1
        L4c:
            eؙؖؑ r7 = r6.loadAd
            int r7 = r6.startapp(r7)
            if (r7 == r0) goto L5c
            eؘؔٔ r0 = new eؘؔٔ
            r3 = 1
            r4 = 0
            r0.<init>(r7, r3, r4)
            goto L5d
        L5c:
            r0 = r1
        L5d:
            if (r2 == r0) goto L60
            goto L62
        L60:
            r7 = 0
            goto L63
        L62:
            r7 = 1
        L63:
            r6.loadAd = r8
            eؚؒٗ r8 = r6.admob
            eؘؓؕ r0 = defpackage.AbstractC3062e.amazon()
            eؕۡۧ r2 = r6.subscription
            java.lang.Object r3 = r8.f3332e
            monitor-enter(r3)
            java.lang.Object r4 = r8.f3331e     // Catch: java.lang.Throwable -> L83
            eّٝٔ r4 = (defpackage.C12613e) r4     // Catch: java.lang.Throwable -> L83
            boolean r4 = r4.canDetectOrientation()     // Catch: java.lang.Throwable -> L83
            if (r4 != 0) goto L85
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r8 = "CameraController"
            java.lang.String r0 = "The device cannot detect rotation changes."
            defpackage.AbstractC9464e.remoteconfig(r8, r0)
            goto L99
        L83:
            r7 = move-exception
            goto La2
        L85:
            java.lang.Object r4 = r8.f3333e     // Catch: java.lang.Throwable -> L83
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L83
            eًٌۚ r5 = new eًٌۚ     // Catch: java.lang.Throwable -> L83
            r5.<init>(r2, r0)     // Catch: java.lang.Throwable -> L83
            r4.put(r2, r5)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r8 = r8.f3331e     // Catch: java.lang.Throwable -> L83
            eّٝٔ r8 = (defpackage.C12613e) r8     // Catch: java.lang.Throwable -> L83
            r8.enable()     // Catch: java.lang.Throwable -> L83
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L83
        L99:
            if (r7 == 0) goto L9e
            r6.amazon()
        L9e:
            r6.smaato(r1)
            return
        La2:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L83
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16666e.ad(eٓؖۚ, eؙؖؑ):void");
    }

    public final boolean adcel() {
        return this.smaato != null;
    }

    public abstract C1874e advert();

    /* JADX WARN: Type inference failed for: r0v3, types: [eٍؚؐ, eٖۜؓ] */
    public final void amazon() {
        C10697e c10697e;
        loadAd();
        C3186e c3186e = new C3186e(2);
        metrica(c3186e);
        C14677e c14677e = this.mopub;
        C4069e c4069e = c3186e.f7297e;
        c4069e.yandex(InterfaceC14405e.ads, c14677e);
        C5450e c5450e = new C5450e(C17015e.vip(c4069e));
        AbstractC14100e.purchase(c5450e);
        ?? abstractC16510e = new AbstractC16510e(c5450e);
        ScheduledExecutorServiceC5380e scheduledExecutorServiceC5380e = C9301e.ads;
        abstractC16510e.pro = scheduledExecutorServiceC5380e;
        this.metrica = abstractC16510e;
        InterfaceC13777e interfaceC13777e = this.Signature;
        if (interfaceC13777e != null) {
            AbstractC13062e.metrica();
            abstractC16510e.remoteconfig = interfaceC13777e;
            abstractC16510e.pro = scheduledExecutorServiceC5380e;
            if (abstractC16510e.metrica() != null) {
                abstractC16510e.m2542this((C5450e) abstractC16510e.yandex, abstractC16510e.startapp);
                abstractC16510e.admob();
            }
            abstractC16510e.Signature();
        }
        AbstractC13062e.metrica();
        Integer valueOf = Integer.valueOf(this.license.remoteconfig);
        int m1344native = this.license.m1344native();
        this.license = appmetrica(valueOf);
        AbstractC13062e.metrica();
        if (m1344native == 3) {
            Integer vip = this.ad.vip();
            if (vip != null && vip.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            Signature();
        }
        C3373e c3373e = this.license;
        c3373e.getClass();
        AbstractC9464e.yandex("ImageCapture", "setFlashMode: flashMode = " + m1344native);
        if (m1344native != 0 && m1344native != 1 && m1344native != 2) {
            if (m1344native != 3) {
                throw new IllegalArgumentException(AbstractC1786e.admob(m1344native, "Invalid flash mode: "));
            }
            if (c3373e.isVip.ad == null) {
                throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            }
            if (c3373e.license() != null) {
                InterfaceC2881e license = c3373e.license();
                if ((license != null ? license.vip().admob() : -1) != 0) {
                    throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
                }
            }
        }
        synchronized (c3373e.pro) {
            c3373e.signatures = m1344native;
            c3373e.m1347while();
        }
        Integer num = (Integer) ((C17015e) ((C9654e) this.billing.yandex).mopub()).smaato(C9654e.f19136e, 0);
        num.intValue();
        Integer valueOf2 = Integer.valueOf(this.billing.m3354this());
        Integer valueOf3 = Integer.valueOf(this.billing.m3353native());
        AbstractC13062e.metrica();
        C12477e license2 = license(num, valueOf2, valueOf3);
        this.billing = license2;
        Executor executor = this.appmetrica;
        if (executor != null && (c10697e = this.purchase) != null) {
            license2.m3355throw(executor, c10697e);
        }
        this.yandex = billing();
    }

    public final C3373e appmetrica(Integer num) {
        C3186e c3186e = new C3186e(1);
        C4069e c4069e = c3186e.f7297e;
        if (num != null) {
            c4069e.yandex(C5753e.f12173e, num);
        }
        metrica(c3186e);
        int i = this.remoteconfig;
        if (i != -1) {
            c4069e.yandex(InterfaceC13842e.subs, Integer.valueOf(i));
        }
        return c3186e.ad();
    }

    public final C16864e billing() {
        int startapp;
        C11180e c11180e = C13343e.f26595goto;
        C11180e c11180e2 = C13343e.f26597native;
        C18247e c18247e = C13343e.f26596interface;
        c18247e.getClass();
        int i = C10354e.license;
        C10354e c10354e = c18247e.ad;
        int i2 = c18247e.vip;
        C16108e c16108e = this.startapp;
        AbstractC4265e.billing(c16108e, "The specified quality selector can't be null.");
        c10354e.getClass();
        C10354e c10354e2 = new C10354e(c16108e, c10354e.vip, c10354e.metrica);
        C3936e c3936e = this.loadAd;
        if (c3936e != null && c16108e == C13343e.firebase && (startapp = startapp(c3936e)) != -1) {
            c10354e2 = new C10354e(c10354e2.ad, startapp, c10354e2.metrica);
        }
        C3186e c3186e = new C3186e(new C13343e(new C18247e(c10354e2, i2), c11180e, c11180e, c11180e2));
        Range range = this.advert;
        C14326e c14326e = InterfaceC12438e.f24889e;
        C4069e c4069e = c3186e.f7297e;
        c4069e.yandex(c14326e, range);
        c4069e.yandex(InterfaceC13842e.firebase, 0);
        c4069e.yandex(InterfaceC14405e.ads, this.adcel);
        int i3 = this.remoteconfig;
        if (i3 != -1) {
            c4069e.yandex(InterfaceC13842e.subs, Integer.valueOf(i3));
        }
        return new C16864e(new C5186e(C17015e.vip(c4069e)));
    }

    public final C12477e license(Integer num, Integer num2, Integer num3) {
        C3186e c3186e = new C3186e(0);
        C4069e c4069e = c3186e.f7297e;
        if (num != null) {
            c4069e.yandex(C9654e.f19136e, num);
        }
        if (num2 != null) {
            c4069e.yandex(C9654e.f19135e, num2);
        }
        if (num3 != null) {
            c4069e.yandex(C9654e.f19134e, num3);
        }
        metrica(c3186e);
        int i = this.remoteconfig;
        if (i != -1) {
            c4069e.yandex(InterfaceC13842e.subs, Integer.valueOf(i));
        }
        C9654e c9654e = new C9654e(C17015e.vip(c4069e));
        AbstractC14100e.purchase(c9654e);
        return new C12477e(c9654e);
    }

    public final void loadAd() {
        C14598e c14598e = this.amazon;
        if (c14598e != null) {
            c14598e.vip(this.metrica, this.license, this.billing, this.yandex);
        }
    }

    public final void metrica(C3186e c3186e) {
        C3936e c3936e = this.loadAd;
        if (c3936e != null) {
            int startapp = startapp(c3936e);
            C5401e c5401e = startapp != -1 ? new C5401e(startapp, 1, (byte) 0) : null;
            if (c5401e != null) {
                C8070e c8070e = new C8070e(c5401e, null, null);
                switch (c3186e.f7298e) {
                    case 0:
                        c3186e.f7297e.yandex(InterfaceC13842e.f27423native, c8070e);
                        return;
                    case 1:
                        c3186e.f7297e.yandex(InterfaceC13842e.f27423native, c8070e);
                        return;
                    case 2:
                        c3186e.f7297e.yandex(InterfaceC13842e.f27423native, c8070e);
                        return;
                    default:
                        c3186e.f7297e.yandex(InterfaceC13842e.f27423native, c8070e);
                        return;
                }
            }
        }
    }

    public final ListenableFuture mopub(float f) {
        AbstractC13062e.metrica();
        if (adcel()) {
            return ((C0200e) this.smaato.appmetrica()).metrica.purchase(f);
        }
        Float valueOf = Float.valueOf(f);
        C6594e c6594e = this.premium;
        c6594e.getClass();
        AbstractC13062e.metrica();
        return AbstractC5750e.purchase(new C18070e(c6594e, valueOf, 18));
    }

    public final C0912e purchase() {
        if (this.amazon == null) {
            AbstractC9464e.yandex("CameraController", "Camera not initialized.");
            return null;
        }
        if (this.Signature == null || this.loadAd == null) {
            AbstractC9464e.yandex("CameraController", "PreviewView not attached to CameraController.");
            return null;
        }
        loadAd();
        C14629e c14629e = new C14629e();
        C9301e c9301e = this.metrica;
        ArrayList arrayList = c14629e.vip;
        arrayList.add(c9301e);
        AbstractC13062e.metrica();
        if ((this.vip & 1) != 0) {
            arrayList.add(this.license);
        }
        AbstractC13062e.metrica();
        if ((this.vip & 2) != 0) {
            arrayList.add(this.billing);
        }
        AbstractC13062e.metrica();
        c14629e.ad = this.loadAd;
        Iterator it = this.subs.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList2 = c14629e.metrica;
            if (!hasNext) {
                AbstractC4265e.license(!arrayList.isEmpty(), "UseCase must not be empty.");
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    throw AbstractC5087e.m1747goto(it2);
                }
                return new C0912e(9, c14629e.ad, arrayList, arrayList2);
            }
            if (it.next() != null) {
                throw new ClassCastException();
            }
            arrayList2.add(null);
        }
    }

    public final void smaato(RunnableC9766e runnableC9766e) {
        ListenableFuture license;
        ListenableFuture adcel;
        C1495e c1495e;
        C1495e c1495e2;
        try {
            this.smaato = advert();
            if (!adcel()) {
                AbstractC9464e.yandex("CameraController", "Use cases not attached to camera.");
                return;
            }
            AbstractC9790e mo3342interface = ((C16575e) this.smaato.vip()).f32520e.mo3342interface();
            C6736e c6736e = this.isVip;
            AbstractC9790e abstractC9790e = c6736e.smaato;
            if (abstractC9790e != null && (c1495e2 = (C1495e) c6736e.advert.billing(abstractC9790e)) != null) {
                c1495e2.ad.yandex(c1495e2);
            }
            c6736e.smaato = mo3342interface;
            c6736e.mopub(mo3342interface, new C4979e(0, c6736e));
            AbstractC9790e yandex = ((C16575e) this.smaato.vip()).f32520e.yandex();
            C6736e c6736e2 = this.inmobi;
            AbstractC9790e abstractC9790e2 = c6736e2.smaato;
            if (abstractC9790e2 != null && (c1495e = (C1495e) c6736e2.advert.billing(abstractC9790e2)) != null) {
                c1495e.ad.yandex(c1495e);
            }
            c6736e2.smaato = yandex;
            c6736e2.mopub(yandex, new C4979e(0, c6736e2));
            C6594e c6594e = this.applovin;
            c6594e.getClass();
            AbstractC13062e.metrica();
            C15552e c15552e = (C15552e) c6594e.f13613e;
            if (c15552e != null) {
                Boolean bool = (Boolean) c15552e.vip;
                boolean booleanValue = bool.booleanValue();
                AbstractC13062e.metrica();
                if (adcel()) {
                    adcel = ((C0200e) this.smaato.appmetrica()).metrica.adcel(booleanValue);
                } else {
                    c6594e.getClass();
                    AbstractC13062e.metrica();
                    adcel = AbstractC5750e.purchase(new C18070e(c6594e, bool, 18));
                }
                C7169e c7169e = (C7169e) ((C15552e) c6594e.f13613e).ad;
                Objects.requireNonNull(c7169e);
                AbstractC15792e.amazon(true, adcel, c7169e, AbstractC3062e.billing());
                c6594e.f13613e = null;
            }
            C6594e c6594e2 = this.ads;
            c6594e2.getClass();
            AbstractC13062e.metrica();
            C15552e c15552e2 = (C15552e) c6594e2.f13613e;
            if (c15552e2 != null) {
                Float f = (Float) c15552e2.vip;
                float floatValue = f.floatValue();
                AbstractC13062e.metrica();
                if (adcel()) {
                    license = ((C0200e) this.smaato.appmetrica()).metrica.license(floatValue);
                } else {
                    AbstractC13062e.metrica();
                    license = AbstractC5750e.purchase(new C18070e(c6594e2, f, 18));
                }
                C7169e c7169e2 = (C7169e) ((C15552e) c6594e2.f13613e).ad;
                Objects.requireNonNull(c7169e2);
                AbstractC15792e.amazon(true, license, c7169e2, AbstractC3062e.billing());
                c6594e2.f13613e = null;
            }
            C6594e c6594e3 = this.premium;
            c6594e3.getClass();
            AbstractC13062e.metrica();
            C15552e c15552e3 = (C15552e) c6594e3.f13613e;
            if (c15552e3 != null) {
                ListenableFuture mopub = mopub(((Float) c15552e3.vip).floatValue());
                C7169e c7169e3 = (C7169e) ((C15552e) c6594e3.f13613e).ad;
                Objects.requireNonNull(c7169e3);
                AbstractC15792e.amazon(true, mopub, c7169e3, AbstractC3062e.billing());
                c6594e3.f13613e = null;
            }
        } catch (RuntimeException e) {
            if (runnableC9766e != null) {
                runnableC9766e.run();
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int startapp(defpackage.C3936e r10) {
        /*
            r9 = this;
            eِْۨ r0 = r9.ad
            r1 = 0
            if (r10 != 0) goto L7
            r2 = r1
            goto Ld
        L7:
            int r2 = r10.metrica
            int r2 = defpackage.AbstractC3425e.billing(r2)
        Ld:
            r3 = 1
            eًٔۨ r4 = r9.amazon     // Catch: java.lang.IllegalArgumentException -> L31
            if (r4 == 0) goto L2f
            eؙؐؓ r4 = r4.ad     // Catch: java.lang.IllegalArgumentException -> L31
            eؗۨ r4 = r4.ad     // Catch: java.lang.IllegalArgumentException -> L31
            eٖۡۨ r4 = r4.loadAd(r0)     // Catch: java.lang.IllegalArgumentException -> L31
            eِّٔ r4 = r4.f34060e     // Catch: java.lang.IllegalArgumentException -> L31
            int r5 = r4.metrica()     // Catch: java.lang.IllegalArgumentException -> L31
            int r0 = r4.admob()     // Catch: java.lang.IllegalArgumentException -> L2b
            if (r0 != r3) goto L28
            goto L91
        L28:
            r0 = r1
            goto L92
        L2b:
            r4 = move-exception
            goto L33
        L2d:
            r5 = r1
            goto L33
        L2f:
            r5 = r1
            goto L91
        L31:
            r4 = move-exception
            goto L2d
        L33:
            if (r0 != 0) goto L38
            java.lang.String r0 = "null"
            goto L7e
        L38:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "CameraSelector{"
            r6.<init>(r7)
            java.lang.Integer r0 = r0.vip()
            if (r0 == 0) goto L70
            int r7 = r0.intValue()
            if (r7 == 0) goto L6a
            if (r7 == r3) goto L64
            r8 = 2
            if (r7 == r8) goto L5e
            java.lang.String r7 = "lensFacing=UNKNOWN("
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = ")"
            r6.append(r0)
            goto L75
        L5e:
            java.lang.String r0 = "lensFacing=EXTERNAL"
            r6.append(r0)
            goto L75
        L64:
            java.lang.String r0 = "lensFacing=BACK"
            r6.append(r0)
            goto L75
        L6a:
            java.lang.String r0 = "lensFacing=FRONT"
            r6.append(r0)
            goto L75
        L70:
            java.lang.String r0 = "lensFacing=NOT_SPECIFIED"
            r6.append(r0)
        L75:
            java.lang.String r0 = "}"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
        L7e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to retrieve CameraInfo for selector: "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r6 = "CameraController"
            defpackage.AbstractC9464e.pro(r6, r0, r4)
        L91:
            r0 = r3
        L92:
            int r0 = defpackage.AbstractC3425e.vip(r2, r5, r0)
            android.util.Rational r10 = r10.vip
            r2 = 90
            if (r0 == r2) goto La0
            r2 = 270(0x10e, float:3.78E-43)
            if (r0 != r2) goto Lae
        La0:
            android.util.Rational r0 = new android.util.Rational
            int r2 = r10.getDenominator()
            int r10 = r10.getNumerator()
            r0.<init>(r2, r10)
            r10 = r0
        Lae:
            android.util.Rational r0 = defpackage.AbstractC1146e.ad
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto Lb7
            return r1
        Lb7:
            android.util.Rational r0 = defpackage.AbstractC1146e.metrica
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto Lc0
            return r3
        Lc0:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16666e.startapp(eؙؖؑ):int");
    }

    public final void vip() {
        AbstractC13062e.metrica();
        C14598e c14598e = this.amazon;
        if (c14598e != null) {
            c14598e.vip(this.metrica, this.license, this.billing, this.yandex);
        }
        C9301e c9301e = this.metrica;
        c9301e.getClass();
        C14418e c14418e = C9301e.applovin;
        AbstractC13062e.metrica();
        c9301e.remoteconfig = null;
        c9301e.license = 2;
        c9301e.subscription();
        this.smaato = null;
        this.Signature = null;
        this.loadAd = null;
        C0912e c0912e = this.admob;
        C3694e c3694e = this.subscription;
        synchronized (c0912e.f3332e) {
            try {
                C8565e c8565e = (C8565e) ((HashMap) c0912e.f3333e).get(c3694e);
                if (c8565e != null) {
                    c8565e.metrica.set(false);
                    ((HashMap) c0912e.f3333e).remove(c3694e);
                }
                if (((HashMap) c0912e.f3333e).isEmpty()) {
                    ((C12613e) c0912e.f3331e).disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C5783e yandex() {
        HashMap hashMap = this.crashlytics;
        EnumC6335e enumC6335e = EnumC6335e.f13177e;
        if (hashMap.get(enumC6335e) != null) {
            return (C5783e) hashMap.get(enumC6335e);
        }
        EnumC6335e enumC6335e2 = EnumC6335e.f13178e;
        if (hashMap.get(enumC6335e2) != null) {
            return (C5783e) hashMap.get(enumC6335e2);
        }
        return null;
    }
}
