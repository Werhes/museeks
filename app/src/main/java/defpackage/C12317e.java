package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12317e extends CameraExtensionSession$StateCallback {
    public final C13471e ad;
    public final ExecutorC13626e appmetrica;
    public final C7744e billing = AbstractC14430e.appmetrica(null);
    public final C13391e license;
    public final C14328e metrica;
    public final C7744e purchase;
    public final C13274e vip;

    public C12317e(C13471e c13471e, C13274e c13274e, InterfaceC8260e interfaceC8260e, C14328e c14328e, C13391e c13391e, ExecutorC13626e executorC13626e) {
        this.ad = c13471e;
        this.vip = c13274e;
        this.metrica = c14328e;
        this.license = c13391e;
        this.appmetrica = executorC13626e;
        this.purchase = AbstractC14430e.appmetrica(interfaceC8260e);
    }

    public final InterfaceC12138e ad(CameraExtensionSession cameraExtensionSession, C14328e c14328e) {
        InterfaceC12138e interfaceC12138e = (InterfaceC12138e) this.billing.ad;
        if (interfaceC12138e != null) {
            return interfaceC12138e;
        }
        C2604e c2604e = new C2604e(this.ad, cameraExtensionSession, c14328e, this.appmetrica);
        return this.billing.ad(null, c2604e) ? c2604e : (InterfaceC12138e) this.billing.ad;
    }

    public final void onClosed(CameraExtensionSession cameraExtensionSession) {
        InterfaceC12138e ad = ad(cameraExtensionSession, this.metrica);
        C13274e c13274e = this.vip;
        ad(cameraExtensionSession, this.metrica);
        c13274e.ad.license();
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
            int i = ((C2604e) ad).f6454e;
            Iterator it = ((List) ((C7744e) c13391e.f26644e).ad).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed((C10619e) c13391e.f26645e);
            }
        }
    }

    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) {
        InterfaceC12138e ad = ad(cameraExtensionSession, this.metrica);
        this.vip.ad.yandex();
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
            int i = ((C2604e) ad).f6454e;
            Iterator it = ((List) ((C7744e) c13391e.f26644e).ad).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((C10619e) c13391e.f26645e);
            }
        }
    }

    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        this.vip.ad.billing(ad(cameraExtensionSession, this.metrica));
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
}
