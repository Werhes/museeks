package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۥؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17392e extends CameraDevice.StateCallback {
    public C7744e ad;

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        Iterator it = ((List) this.ad.ad).iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        Iterator it = ((List) this.ad.ad).iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        Iterator it = ((List) this.ad.ad).iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Iterator it = ((List) this.ad.ad).iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
        }
    }
}
