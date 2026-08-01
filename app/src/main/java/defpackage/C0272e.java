package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272e extends CameraDevice.StateCallback {
    public C6167e Signature;
    public final String ad;
    public final C9173e adcel;
    public boolean admob;
    public final C13391e advert;
    public final Object amazon;
    public final C13399e appmetrica;
    public final C4893e billing;
    public final long license;
    public boolean loadAd;
    public final int metrica;
    public final CameraDevice.StateCallback mopub;
    public C1103e pro;
    public final C14328e purchase;
    public final long remoteconfig;
    public final C1615e signatures;
    public final int smaato;
    public final C17280e startapp;
    public final CountDownLatch subscription;
    public final InterfaceC2531e vip;
    public final C5122e yandex;

    public C0272e(String str, InterfaceC2531e interfaceC2531e, int i, long j, C13399e c13399e, C14328e c14328e, C4893e c4893e, C5122e c5122e, C17280e c17280e, C9173e c9173e, CameraDevice.StateCallback stateCallback, C13391e c13391e) {
        this.ad = str;
        this.vip = interfaceC2531e;
        this.metrica = i;
        this.license = j;
        this.appmetrica = c13399e;
        this.purchase = c14328e;
        this.billing = c4893e;
        this.yandex = c5122e;
        this.startapp = c17280e;
        this.adcel = c9173e;
        this.mopub = stateCallback;
        this.advert = c13391e;
        C11498e c11498e = AbstractC17855e.vip;
        c11498e.getClass();
        this.smaato = C11498e.vip.incrementAndGet(c11498e);
        this.amazon = new Object();
        this.subscription = new CountDownLatch(1);
        this.signatures = AbstractC9180e.metrica(C5910e.ad);
        Log.i("CXCP", "Opening " + ((Object) C5060e.vip(str)));
        this.remoteconfig = i != 1 ? SystemClock.elapsedRealtimeNanos() : j;
    }

    public static boolean appmetrica(C5122e c5122e, String str, C1096e c1096e) {
        c5122e.vip.getClass();
        int i = Build.VERSION.SDK_INT;
        if (24 > i || i >= 29) {
            return false;
        }
        C6434e c6434e = InterfaceC2531e.yandex;
        InterfaceC2531e appmetrica = ((C7520e) c5122e.ad).appmetrica(str);
        c6434e.getClass();
        return C6434e.vip(appmetrica) && c1096e == null;
    }

    public final void ad() {
        AbstractC12314e abstractC12314e = (AbstractC12314e) this.signatures.getValue();
        InterfaceC18069e interfaceC18069e = abstractC12314e instanceof C15902e ? ((C15902e) abstractC12314e).ad : null;
        vip(interfaceC18069e != null ? (CameraDevice) interfaceC18069e.mo754static(AbstractC3820e.ad.vip(CameraDevice.class)) : null, new C6167e(1, null, null, 14));
    }

    public final void license(CameraDevice cameraDevice) {
        Trace.beginSection(((Object) C5060e.vip(this.ad)) + "#onFinalized");
        Log.d("CXCP", this + ": onFinalized");
        vip(cameraDevice, new C6167e(3, null, null, 14));
        CameraDevice.StateCallback stateCallback = this.mopub;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    public final C10211e metrica(C6167e c6167e) {
        this.appmetrica.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C1103e c1103e = this.pro;
        long j = c6167e.vip;
        C11811e c11811e = c1103e != null ? new C11811e(c1103e.ad - this.license) : null;
        C11811e c11811e2 = c1103e != null ? new C11811e(c1103e.ad - this.remoteconfig) : null;
        C11811e c11811e3 = c1103e == null ? null : new C11811e(j - c1103e.ad);
        long j2 = elapsedRealtimeNanos - j;
        int i = c6167e.ad;
        int i2 = this.metrica - 1;
        return new C10211e(this.ad, i, Integer.valueOf(i2), c11811e, c6167e.license, c11811e2, c11811e3, new C11811e(j2), c6167e.metrica);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        if (!AbstractC7890e.billing(cameraDevice.getId(), this.ad)) {
            throw new IllegalStateException("Check failed.");
        }
        Log.d("CXCP", ((Object) C5060e.vip(this.ad)) + ": onClosed");
        this.subscription.countDown();
        synchronized (this.amazon) {
            if (!this.admob) {
                Unit unit = Unit.INSTANCE;
                license(cameraDevice);
            } else {
                Log.i("CXCP", this + "#onClosed: Delaying finalizing.");
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        String id = cameraDevice.getId();
        String str = this.ad;
        if (!AbstractC7890e.billing(id, str)) {
            throw new IllegalStateException("Check failed.");
        }
        Trace.beginSection(((Object) C5060e.vip(str)) + "#onDisconnected");
        Log.d("CXCP", ((Object) C5060e.vip(str)) + ": onDisconnected");
        this.subscription.countDown();
        vip(cameraDevice, new C6167e(4, new C1096e(6), null, 10));
        CameraDevice.StateCallback stateCallback = this.mopub;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        String id = cameraDevice.getId();
        String str = this.ad;
        if (!AbstractC7890e.billing(id, str)) {
            throw new IllegalStateException("Check failed.");
        }
        Trace.beginSection(((Object) C5060e.vip(str)) + "#onError-" + i);
        Log.d("CXCP", ((Object) C5060e.vip(str)) + ": onError " + i);
        this.subscription.countDown();
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalArgumentException(AbstractC1786e.admob(i, "Unexpected StateCallback error code: "));
                        }
                        i2 = 5;
                    }
                }
            }
        }
        vip(cameraDevice, new C6167e(5, new C1096e(i2), null, 10));
        CameraDevice.StateCallback stateCallback = this.mopub;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, i);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        String smaato;
        C6167e c6167e;
        C6167e c6167e2;
        if (!AbstractC7890e.billing(cameraDevice.getId(), this.ad)) {
            throw new IllegalStateException("Check failed.");
        }
        this.appmetrica.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.pro = new C1103e(elapsedRealtimeNanos);
        Trace.beginSection(((Object) C5060e.vip(this.ad)) + "#onOpened");
        long j = elapsedRealtimeNanos - this.remoteconfig;
        long j2 = elapsedRealtimeNanos - this.license;
        if (this.metrica == 1) {
            StringBuilder sb = new StringBuilder("Opened ");
            sb.append((Object) C5060e.vip(this.ad));
            sb.append(" in ");
            smaato = AbstractC8703e.tapsense(new Object[]{Double.valueOf(j / 1000000.0d)}, 1, null, "%.3f ms", sb);
        } else {
            StringBuilder sb2 = new StringBuilder("Opened ");
            sb2.append((Object) C5060e.vip(this.ad));
            sb2.append(" in ");
            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1)));
            sb2.append(" (");
            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1)));
            sb2.append(" total) after ");
            smaato = AbstractC17861e.smaato(this.metrica, " attempts.", sb2);
        }
        Log.i("CXCP", smaato);
        synchronized (this.amazon) {
            c6167e = this.Signature;
            if (c6167e == null) {
                this.loadAd = true;
            }
        }
        CameraDevice.StateCallback stateCallback = this.mopub;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        if (c6167e != null) {
            C4893e c4893e = this.billing;
            C9173e c9173e = this.adcel;
            C5122e c5122e = this.yandex;
            String str = this.ad;
            c4893e.vip(null, cameraDevice, this, c9173e, appmetrica(c5122e, str, c6167e.metrica) && c5122e.ad(str), appmetrica(this.yandex, this.ad, c6167e.metrica));
            return;
        }
        C13471e c13471e = new C13471e(this.vip, cameraDevice, this.ad, this.purchase, this.advert, this.startapp);
        this.adcel.ad(c13471e);
        C1615e c1615e = this.signatures;
        C15902e c15902e = new C15902e(c13471e);
        c1615e.getClass();
        c1615e.smaato(null, c15902e);
        synchronized (this.amazon) {
            this.loadAd = false;
            c6167e2 = this.Signature;
        }
        if (c6167e2 != null) {
            C1615e c1615e2 = this.signatures;
            C12848e c12848e = new C12848e(c6167e2.metrica);
            c1615e2.getClass();
            c1615e2.smaato(null, c12848e);
            C4893e c4893e2 = this.billing;
            C9173e c9173e2 = this.adcel;
            C5122e c5122e2 = this.yandex;
            String str2 = this.ad;
            c4893e2.vip(c13471e, cameraDevice, this, c9173e2, appmetrica(c5122e2, str2, c6167e2.metrica) && c5122e2.ad(str2), appmetrica(this.yandex, this.ad, c6167e2.metrica));
            C1615e c1615e3 = this.signatures;
            C10211e metrica = metrica(c6167e2);
            c1615e3.getClass();
            c1615e3.smaato(null, metrica);
        }
        Trace.endSection();
    }

    public final String toString() {
        return "CameraState-" + this.smaato;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x001f, code lost:
    
        if (r10.loadAd == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip(android.hardware.camera2.CameraDevice r11, defpackage.C6167e r12) {
        /*
            r10 = this;
            eؓؗ r0 = r10.signatures
            java.lang.Object r0 = r0.getValue()
            eَؙّ r0 = (defpackage.AbstractC12314e) r0
            boolean r1 = r0 instanceof defpackage.C15902e
            r2 = 0
            if (r1 == 0) goto L13
            eٖٟؐ r0 = (defpackage.C15902e) r0
            e٘ۡ۠ r0 = r0.ad
            r4 = r0
            goto L14
        L13:
            r4 = r2
        L14:
            java.lang.Object r1 = r10.amazon
            monitor-enter(r1)
            eؙؔۢ r0 = r10.Signature     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L27
            r10.Signature = r12     // Catch: java.lang.Throwable -> L22
            boolean r0 = r10.loadAd     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L27
            goto L28
        L22:
            r0 = move-exception
            r11 = r0
            r6 = r10
            goto L9e
        L27:
            r12 = r2
        L28:
            monitor-exit(r1)
            if (r12 == 0) goto L99
            eؒٗ r0 = r12.metrica
            r1 = 0
            if (r0 == 0) goto L3e
            int r3 = r12.ad
            r5 = 6
            if (r3 == r5) goto L3e
            eٓۢۨ r3 = r10.purchase
            java.lang.String r5 = r10.ad
            int r0 = r0.ad
            r3.ad(r5, r1, r0)
        L3e:
            eؓؗ r0 = r10.signatures
            eّۣ۟ r3 = new eّۣ۟
            eؒٗ r5 = r12.metrica
            r3.<init>(r5)
            r0.getClass()
            r0.smaato(r2, r3)
            int r0 = r12.ad
            r3 = 3
            if (r0 == r3) goto L8b
            eؗۙٔ r0 = r10.yandex
            java.lang.String r3 = r10.ad
            eؒٗ r5 = r12.metrica
            boolean r5 = appmetrica(r0, r3, r5)
            r6 = 1
            if (r5 == 0) goto L67
            boolean r0 = r0.ad(r3)
            if (r0 == 0) goto L67
            r8 = r6
            goto L68
        L67:
            r8 = r1
        L68:
            if (r8 == 0) goto L77
            java.lang.Object r1 = r10.amazon
            monitor-enter(r1)
            r10.admob = r6     // Catch: java.lang.Throwable -> L73
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L73
            monitor-exit(r1)
            goto L77
        L73:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)
            throw r11
        L77:
            eؗٔۗ r3 = r10.billing
            eٍٍؑ r7 = r10.adcel
            eؗۙٔ r0 = r10.yandex
            java.lang.String r1 = r10.ad
            eؒٗ r5 = r12.metrica
            boolean r9 = appmetrica(r0, r1, r5)
            r6 = r10
            r5 = r11
            r3.vip(r4, r5, r6, r7, r8, r9)
            goto L8c
        L8b:
            r6 = r10
        L8c:
            eؓؗ r11 = r6.signatures
            eَِۨ r12 = r10.metrica(r12)
            r11.getClass()
            r11.smaato(r2, r12)
            return
        L99:
            r6 = r10
            return
        L9b:
            r0 = move-exception
            r6 = r10
            r11 = r0
        L9e:
            monitor-exit(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0272e.vip(android.hardware.camera2.CameraDevice, eؙؔۢ):void");
    }
}
