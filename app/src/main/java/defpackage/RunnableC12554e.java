package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12554e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f25147e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f25148e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25149e;

    public /* synthetic */ RunnableC12554e() {
        this.f25149e = 29;
    }

    public /* synthetic */ RunnableC12554e(int i, Object obj, Object obj2, Object obj3) {
        this.f25149e = i;
        this.f25148e = obj2;
        this.f25147e = obj3;
    }

    public RunnableC12554e(ServiceConnectionC2718e serviceConnectionC2718e, InterfaceC0614e interfaceC0614e, ServiceConnectionC2718e serviceConnectionC2718e2) {
        this.f25149e = 5;
        this.f25148e = interfaceC0614e;
        this.f25147e = serviceConnectionC2718e;
    }

    public RunnableC12554e(C8320e c8320e, InterfaceC9026e interfaceC9026e) {
        this.f25149e = 11;
        this.f25148e = interfaceC9026e;
        Objects.requireNonNull(c8320e);
        this.f25147e = c8320e;
    }

    public RunnableC12554e(C10640e c10640e, C13288e c13288e) {
        this.f25149e = 18;
        this.f25148e = c13288e;
        Objects.requireNonNull(c10640e);
        this.f25147e = c10640e;
    }

    public /* synthetic */ RunnableC12554e(Object obj, Object obj2, int i) {
        this.f25149e = i;
        this.f25148e = obj;
        this.f25147e = obj2;
    }

    public /* synthetic */ RunnableC12554e(Object obj, Object obj2, boolean z, int i) {
        this.f25149e = i;
        this.f25148e = obj2;
        this.f25147e = obj;
    }

    private final void ad() {
        ServiceConnectionC15550e serviceConnectionC15550e = (ServiceConnectionC15550e) this.f25148e;
        IBinder iBinder = (IBinder) this.f25147e;
        synchronized (serviceConnectionC15550e) {
            if (iBinder == null) {
                serviceConnectionC15550e.ad("Null service connection");
                return;
            }
            try {
                serviceConnectionC15550e.f30702e = new C9271e(iBinder);
                serviceConnectionC15550e.f30705e = 2;
                ((ScheduledExecutorService) serviceConnectionC15550e.f30706e.f18967e).execute(new RunnableC7077e(serviceConnectionC15550e, 0));
            } catch (RemoteException e) {
                serviceConnectionC15550e.ad(e.getMessage());
            }
        }
    }

    private final void adcel() {
        C1173e c1173e = (C1173e) this.f25147e;
        try {
            C0560e isVip = ((InterfaceC16794e) c1173e.f3770e).isVip(((C0560e) this.f25148e).adcel());
            ExecutorC8172e executorC8172e = AbstractC10468e.vip;
            isVip.purchase(executorC8172e, c1173e);
            isVip.license(executorC8172e, c1173e);
            isVip.vip.crashlytics(new C1173e((Executor) executorC8172e, (InterfaceC6786e) c1173e));
            isVip.remoteconfig();
        } catch (C16788e e) {
            if (e.getCause() instanceof Exception) {
                c1173e.mo268e((Exception) e.getCause());
            } else {
                c1173e.mo268e(e);
            }
        } catch (CancellationException unused) {
            c1173e.subscription();
        } catch (Exception e2) {
            c1173e.mo268e(e2);
        }
    }

    private final void advert() {
        C5609e c5609e = (C5609e) this.f25148e;
        AbstractC9528e.advert(((Thread) ((AtomicReference) c5609e.f11961e).getAndSet(Thread.currentThread())) == null);
        try {
            ((Runnable) this.f25147e).run();
            ((AtomicReference) c5609e.f11961e).set(null);
            c5609e.inmobi();
        } catch (Throwable th) {
            try {
                ((AtomicReference) c5609e.f11961e).set(null);
                c5609e.inmobi();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void amazon() {
        boolean z;
        C7568e c7568e = (C7568e) this.f25148e;
        String str = ((C18383e) this.f25147e).f36047e;
        if (AbstractC5942e.metrica(str, c7568e.f15405native)) {
            z = false;
        } else {
            c7568e.f15405native = str;
            z = true;
        }
        C7568e.f15392final.vip("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(c7568e.f15408throw));
        C18017e c18017e = c7568e.firebase;
        if (c18017e != null && (z || c7568e.f15408throw)) {
            c18017e.license();
        }
        c7568e.f15408throw = false;
    }

    private final void appmetrica() {
        ((ServiceConnectionC10526e) this.f25147e).f20780e.m2856e((ComponentName) this.f25148e);
    }

    private final void billing() {
        C10640e c10640e = ((ServiceConnectionC10526e) this.f25147e).f20780e;
        c10640e.f20961e = null;
        if (((C14758e) this.f25148e).f29190e != 7777) {
            c10640e.m2849e();
            return;
        }
        if (c10640e.f20963e == null) {
            c10640e.f20963e = Executors.newScheduledThreadPool(1);
        }
        c10640e.f20963e.schedule(new RunnableC16721e(16, this), ((Long) AbstractC17254e.f33860package.ad(null)).longValue(), TimeUnit.MILLISECONDS);
    }

    private final void license() {
        C1173e c1173e = (C1173e) this.f25147e;
        synchronized (c1173e.f3770e) {
            try {
                InterfaceC7898e interfaceC7898e = (InterfaceC7898e) c1173e.f3772e;
                if (interfaceC7898e != null) {
                    interfaceC7898e.license(((C0560e) this.f25148e).adcel());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, eِّؔ] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, eُۡٔ] */
    private final void metrica() {
        C1729e c1729e = (C1729e) this.f25148e;
        C8988e c8988e = (C8988e) this.f25147e;
        int decrementAndGet = c1729e.vip.decrementAndGet();
        AbstractC9528e.advert(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            synchronized (c1729e) {
                try {
                    c1729e.appmetrica.metrica();
                    C1729e.adcel = true;
                    ?? obj = new Object();
                    EnumC5396e enumC5396e = c1729e.startapp ? EnumC5396e.TYPE_THICK : EnumC5396e.TYPE_THIN;
                    C17856e c17856e = c1729e.purchase;
                    obj.f6385e = enumC5396e;
                    ?? obj2 = new Object();
                    obj2.f22772e = AbstractC4214e.ad(c1729e.license);
                    obj.f6387e = new C5244e(obj2);
                    EnumC2663e.f6529e.execute(new RunnableC11327e(16, c17856e, new C7306e(obj, 0), EnumC11135e.ON_DEVICE_BARCODE_CLOSE, c17856e.metrica(), false));
                } catch (Throwable th) {
                    throw th;
                }
            }
            c1729e.metrica.set(false);
        }
        AbstractC0393e.f2431e.clear();
        AbstractC9858e.ad.clear();
        c8988e.vip(null);
    }

    private final void mopub() {
        Context context = ((C13150e) this.f25148e).vip;
        C0409e c0409e = C7364e.f15097e;
        if (c0409e == null) {
            synchronized (C7364e.f15098e) {
                c0409e = C7364e.f15097e;
                if (c0409e == null) {
                    Csuper ad = AbstractC8507e.ad();
                    try {
                        String[] list = context.getAssets().list("phenotype");
                        if (list != null) {
                            for (String str : list) {
                                if (str.endsWith("_package_metadata.binarypb")) {
                                    try {
                                        AssetManager assets = context.getAssets();
                                        StringBuilder sb = new StringBuilder(str.length() + 10);
                                        sb.append("phenotype/");
                                        sb.append(str);
                                        InputStream open = assets.open(sb.toString());
                                        try {
                                            C17268e c17268e = C17268e.ad;
                                            int i = AbstractC3433e.ad;
                                            C7364e c7364e = new C7364e(context, C13871e.isVip(open, C17268e.vip));
                                            ad.mo3904implements(c7364e.f15099e, c7364e);
                                            if (open != null) {
                                                open.close();
                                            }
                                        } catch (Throwable th) {
                                            if (open != null) {
                                                try {
                                                    open.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                            break;
                                        }
                                    } catch (C10895e e) {
                                        StringBuilder sb2 = new StringBuilder(str.length() + 45);
                                        sb2.append("Unable to read Phenotype PackageMetadata for ");
                                        sb2.append(str);
                                        Log.e("PackageInfo", sb2.toString(), e);
                                    }
                                }
                            }
                        }
                    } catch (IOException e2) {
                        Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                    }
                    C0409e mopub = ad.mopub(true);
                    C7364e.f15097e = mopub;
                    c0409e = mopub;
                }
            }
        }
        String str2 = (String) this.f25147e;
        if (c0409e.containsKey(str2)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder(str2.length() + 173);
        sb3.append("Config package ");
        sb3.append(str2);
        sb3.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
        Log.e("FilePhenotypeFlags", sb3.toString());
    }

    private final void purchase() {
        ServiceConnectionC15550e serviceConnectionC15550e = (ServiceConnectionC15550e) this.f25148e;
        int i = ((C2680e) this.f25147e).ad;
        synchronized (serviceConnectionC15550e) {
            C2680e c2680e = (C2680e) serviceConnectionC15550e.f30701e.get(i);
            if (c2680e != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                serviceConnectionC15550e.f30701e.remove(i);
                c2680e.vip(new C2123e(16, "Timed out waiting for response", null));
                serviceConnectionC15550e.metrica();
            }
        }
    }

    private final void smaato() {
        boolean z;
        boolean z2;
        boolean z3;
        C7568e c7568e = (C7568e) this.f25148e;
        C17448e c17448e = (C17448e) this.f25147e;
        C18017e c18017e = c7568e.firebase;
        C17005e c17005e = c17448e.f34175e;
        C8023e c8023e = c17448e.f34178e;
        if (!AbstractC5942e.metrica(c17005e, c7568e.subs)) {
            c7568e.subs = c17005e;
            c18017e.metrica();
        }
        double d = c17448e.f34176e;
        if (Double.isNaN(d) || Math.abs(d - c7568e.f15409try) <= 1.0E-7d) {
            z = false;
        } else {
            c7568e.f15409try = d;
            z = true;
        }
        boolean z4 = c17448e.f34174e;
        if (z4 != c7568e.f15401extends) {
            c7568e.f15401extends = z4;
            z = true;
        }
        Double.isNaN(c17448e.f34177e);
        C18482e c18482e = C7568e.f15392final;
        c18482e.vip("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(c7568e.f15410while));
        if (c18017e != null && (z || c7568e.f15410while)) {
            c18017e.purchase();
        }
        int i = c17448e.f34173e;
        if (i != c7568e.f15396break) {
            c7568e.f15396break = i;
            z2 = true;
        } else {
            z2 = false;
        }
        c18482e.vip("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(c7568e.f15410while));
        if (c18017e != null && (z2 || c7568e.f15410while)) {
            c18017e.ad();
        }
        int i2 = c17448e.f34172e;
        if (i2 != c7568e.f15395abstract) {
            c7568e.f15395abstract = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        c18482e.vip("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(c7568e.f15410while));
        if (c18017e != null && (z3 || c7568e.f15410while)) {
            c18017e.appmetrica();
        }
        if (!AbstractC5942e.metrica(c7568e.f15406protected, c8023e)) {
            c7568e.f15406protected = c8023e;
        }
        c7568e.f15410while = false;
    }

    private final /* synthetic */ void startapp() {
        C5354e c5354e = (C5354e) this.f25148e;
        JobParameters jobParameters = (JobParameters) this.f25147e;
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((InterfaceC0523e) ((Service) c5354e.f11475e)).metrica(jobParameters);
    }

    private final void vip() {
        C1173e c1173e = (C1173e) this.f25147e;
        synchronized (c1173e.f3770e) {
            try {
                InterfaceC9307e interfaceC9307e = (InterfaceC9307e) c1173e.f3772e;
                if (interfaceC9307e != null) {
                    Exception startapp = ((C0560e) this.f25148e).startapp();
                    AbstractC9528e.startapp(startapp);
                    interfaceC9307e.mo268e(startapp);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void yandex() {
        C15398e c15398e = (C15398e) this.f25148e;
        c15398e.m3946default();
        Runnable runnable = (Runnable) this.f25147e;
        c15398e.mo2262e().mo2250e();
        if (c15398e.f30364e == null) {
            c15398e.f30364e = new ArrayList();
        }
        c15398e.f30364e.add(runnable);
        c15398e.advert();
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x068c, code lost:
    
        if (r15.m1804e() == 1) goto L242;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04eb A[Catch: IllegalStateException -> 0x04fb, TRY_LEAVE, TryCatch #7 {IllegalStateException -> 0x04fb, blocks: (B:155:0x04d0, B:158:0x04df, B:161:0x04e7, B:163:0x04eb, B:364:0x04d9), top: B:154:0x04d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x053d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x04d9 A[Catch: IllegalStateException -> 0x04fb, TryCatch #7 {IllegalStateException -> 0x04fb, blocks: (B:155:0x04d0, B:158:0x04df, B:161:0x04e7, B:163:0x04eb, B:364:0x04d9), top: B:154:0x04d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v65, types: [eٍؐؗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v86, types: [package, eؙؖۛ, eَ۟] */
    /* JADX WARN: Type inference failed for: r0v95, types: [eٔٛؒ] */
    /* JADX WARN: Type inference failed for: r2v37, types: [eًِۡ, eؙِۜ] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 3282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC12554e.run():void");
    }
}
