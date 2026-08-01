package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4893e {
    public final C17280e ad;
    public final C16760e metrica;
    public final C5122e vip;

    public C4893e(C17280e c17280e, C5122e c5122e, C16760e c16760e) {
        this.ad = c17280e;
        this.vip = c5122e;
        this.metrica = c16760e;
    }

    public static final void ad(C4893e c4893e, InterfaceC18069e interfaceC18069e) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        C2673e metrica = AbstractC14430e.metrica(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (interfaceC18069e.mo3561break(Collections.singletonList(surface), new C12984e(countDownLatch, metrica, surface, surfaceTexture))) {
            countDownLatch.await();
            return;
        }
        Log.e("CXCP", "Failed to create a blank capture session! Surfaces may not be disconnected properly.");
        if (metrica.ad()) {
            surface.release();
            surfaceTexture.release();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eٍؚؔ, java.lang.Object] */
    public final void metrica(CameraDevice cameraDevice, C0272e c0272e) {
        String id = cameraDevice.getId();
        Log.d("CXCP", "closeCameraDevice(" + id + ')');
        ?? obj = new Object();
        if (((Unit) this.ad.vip(7000L, new C9143e(cameraDevice, obj, null, 1))) == null) {
            Log.e("CXCP", "Failed to close CameraDevice(" + id + ") after 7000ms. The camera is likely in a bad state.");
        }
        String id2 = cameraDevice.getId();
        C5060e.ad(id2);
        C5122e c5122e = this.vip;
        c5122e.vip.getClass();
        C6434e c6434e = InterfaceC2531e.yandex;
        InterfaceC2531e appmetrica = ((C7520e) c5122e.ad).appmetrica(id2);
        c6434e.getClass();
        if (C6434e.vip(appmetrica) && obj.f18534e) {
            Log.d("CXCP", "Waiting for OnClosed from " + ((Object) C5060e.vip(id2)));
            if (c0272e.subscription.await(2000L, TimeUnit.MILLISECONDS)) {
                Log.d("CXCP", "Received OnClosed for " + ((Object) C5060e.vip(id2)));
            } else {
                Log.w("CXCP", "Failed to close " + ((Object) C5060e.vip(id2)) + " after 2000ms!");
            }
        }
    }

    public final void vip(InterfaceC18069e interfaceC18069e, CameraDevice cameraDevice, C0272e c0272e, C9173e c9173e, boolean z, boolean z2) {
        C6947e c6947e;
        C6571e c6571e = null;
        CameraDevice cameraDevice2 = interfaceC18069e != null ? (CameraDevice) interfaceC18069e.mo754static(AbstractC3820e.ad.vip(CameraDevice.class)) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                metrica(cameraDevice, c0272e);
                return;
            }
            return;
        }
        String id = cameraDevice2.getId();
        C5060e.ad(id);
        if (cameraDevice != null && !id.equals(cameraDevice.getId())) {
            StringBuilder applovin = AbstractC8703e.applovin("Unwrapped camera device has camera ID ", id, ", but the wrapped camera device has camera ID ");
            applovin.append(cameraDevice.getId());
            applovin.append('!');
            throw new IllegalStateException(applovin.toString().toString());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i >= 30) {
            c9173e.appmetrica.remove(interfaceC18069e);
        }
        Log.d("CXCP", "handleQuirksBeforeClosing(" + cameraDevice2 + ')');
        String advert = interfaceC18069e.advert();
        if (z) {
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                Log.d("CXCP", "Reopening camera device");
                metrica(cameraDevice2, c0272e);
                c6947e = this.metrica.ad(advert, this);
            } finally {
            }
        } else {
            c6947e = new C6947e(interfaceC18069e, c0272e);
        }
        InterfaceC18069e interfaceC18069e2 = c6947e.ad;
        C0272e c0272e2 = c6947e.vip;
        if (interfaceC18069e2 == null || c0272e2 == null) {
            Log.e("CXCP", "Failed to retain an opened camera device!");
        } else {
            if (z2) {
                try {
                    Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                    Log.d("CXCP", "Creating an empty capture session before closing " + ((Object) C5060e.vip(advert)));
                    ad(this, interfaceC18069e2);
                    Log.d("CXCP", "Created an empty capture session.");
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            c6571e = new C6571e(interfaceC18069e2, c0272e2);
        }
        if (c6571e == null) {
            Log.e("CXCP", "Failed to handle quirks before closing the camera device!");
            interfaceC18069e.inmobi();
            interfaceC18069e.mo3568new();
            c0272e.license(cameraDevice2);
            return;
        }
        InterfaceC18069e interfaceC18069e3 = (InterfaceC18069e) c6571e.f13544e;
        C0272e c0272e3 = (C0272e) c6571e.f13543e;
        Object mo754static = interfaceC18069e3.mo754static(AbstractC3820e.ad.vip(CameraDevice.class));
        if (mo754static == null) {
            throw new IllegalStateException("Required value was null.");
        }
        interfaceC18069e.inmobi();
        metrica((CameraDevice) mo754static, c0272e3);
        interfaceC18069e.mo3568new();
        if (z) {
            c0272e.license(cameraDevice2);
        }
    }
}
