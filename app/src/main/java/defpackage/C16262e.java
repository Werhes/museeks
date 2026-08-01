package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16262e extends CameraCaptureSession.StateCallback {
    public final C13471e ad;
    public final Handler appmetrica;
    public final C7744e billing = AbstractC14430e.appmetrica(null);
    public final C13391e license;
    public final C14328e metrica;
    public final C7744e purchase;
    public final InterfaceC8943e vip;

    public C16262e(C13471e c13471e, InterfaceC8943e interfaceC8943e, InterfaceC8260e interfaceC8260e, C14328e c14328e, C13391e c13391e, Handler handler) {
        this.ad = c13471e;
        this.vip = interfaceC8943e;
        this.metrica = c14328e;
        this.license = c13391e;
        this.appmetrica = handler;
        this.purchase = AbstractC14430e.appmetrica(interfaceC8260e);
    }

    public final InterfaceC6545e ad(CameraCaptureSession cameraCaptureSession, C14328e c14328e) {
        InterfaceC6545e interfaceC6545e = (InterfaceC6545e) this.billing.ad;
        if (interfaceC6545e != null) {
            return interfaceC6545e;
        }
        Handler handler = this.appmetrica;
        C13471e c13471e = this.ad;
        InterfaceC6545e c11158e = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? new C11158e(c13471e, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, c14328e, handler) : new C6742e(c13471e, cameraCaptureSession, c14328e, handler);
        return this.billing.ad(null, c11158e) ? c11158e : (InterfaceC6545e) this.billing.ad;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        InterfaceC6545e ad = ad(cameraCaptureSession, this.metrica);
        InterfaceC8943e interfaceC8943e = this.vip;
        ad(cameraCaptureSession, this.metrica);
        interfaceC8943e.metrica();
        C13391e c13391e = this.license;
        if (c13391e != null) {
            this.ad.getClass();
            ad.getClass();
            Iterator it = ((List) ((C7744e) c13391e.f26644e).ad).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive((C10619e) c13391e.f26645e);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        C14328e c14328e = this.metrica;
        InterfaceC6545e ad = ad(cameraCaptureSession, c14328e);
        ad(cameraCaptureSession, c14328e);
        this.vip.purchase();
        C13391e c13391e = this.license;
        if (c13391e != null) {
            this.ad.getClass();
            ad.getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC11815e.m3270this((C10619e) c13391e.f26645e, (C7744e) c13391e.f26644e);
            } else if (AbstractC9464e.amazon()) {
                Log.e("CXCP", "onCaptureQueueEmpty called for unsupported OS version.");
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        C14328e c14328e = this.metrica;
        InterfaceC6545e ad = ad(cameraCaptureSession, c14328e);
        InterfaceC8943e interfaceC8943e = this.vip;
        ad(cameraCaptureSession, c14328e);
        interfaceC8943e.license();
        C7744e c7744e = this.purchase;
        c7744e.getClass();
        InterfaceC8260e interfaceC8260e = (InterfaceC8260e) C7744e.vip.getAndSet(c7744e, null);
        if (interfaceC8260e != null) {
            interfaceC8260e.ad();
        }
        this.vip.ad();
        C13391e c13391e = this.license;
        if (c13391e != null) {
            this.ad.getClass();
            ad.getClass();
            Iterator it = ((List) ((C7744e) c13391e.f26644e).ad).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed((C10619e) c13391e.f26645e);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        InterfaceC6545e ad = ad(cameraCaptureSession, this.metrica);
        this.vip.yandex();
        C7744e c7744e = this.purchase;
        c7744e.getClass();
        InterfaceC8260e interfaceC8260e = (InterfaceC8260e) C7744e.vip.getAndSet(c7744e, null);
        if (interfaceC8260e != null) {
            interfaceC8260e.ad();
        }
        this.vip.ad();
        C13391e c13391e = this.license;
        if (c13391e != null) {
            this.ad.getClass();
            ad.getClass();
            Iterator it = ((List) ((C7744e) c13391e.f26644e).ad).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((C10619e) c13391e.f26645e);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.vip.billing(ad(cameraCaptureSession, this.metrica));
        C7744e c7744e = this.purchase;
        c7744e.getClass();
        InterfaceC8260e interfaceC8260e = (InterfaceC8260e) C7744e.vip.getAndSet(c7744e, null);
        if (interfaceC8260e != null) {
            interfaceC8260e.ad();
        }
        C13391e c13391e = this.license;
        if (c13391e != null) {
            this.ad.getClass();
            Iterator it = ((List) ((C7744e) c13391e.f26644e).ad).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigured((C10619e) c13391e.f26645e);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        InterfaceC6545e ad = ad(cameraCaptureSession, this.metrica);
        InterfaceC8943e interfaceC8943e = this.vip;
        ad(cameraCaptureSession, this.metrica);
        interfaceC8943e.appmetrica();
        C13391e c13391e = this.license;
        if (c13391e != null) {
            this.ad.getClass();
            ad.getClass();
            Iterator it = ((List) ((C7744e) c13391e.f26644e).ad).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady((C10619e) c13391e.f26645e);
            }
        }
    }
}
