package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۣؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10619e extends CameraCaptureSession {
    public static String ad(String str) {
        return AbstractC5087e.m1746extends("Current capture session is running on extensions mode which isn't allowed to invoke the ", str, " function!");
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void abortCaptures() {
        throw new IllegalArgumentException(ad("abortCaptures"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int capture(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        throw new IllegalArgumentException(ad("capture"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int captureBurst(List list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        throw new IllegalArgumentException(ad("captureBurst"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalArgumentException(ad("close"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void finalizeOutputConfigurations(List list) {
        throw new IllegalArgumentException(ad("finalizeOutputConfigurations"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final CameraDevice getDevice() {
        throw new IllegalArgumentException(ad("getDevice"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final Surface getInputSurface() {
        throw new IllegalArgumentException(ad("getInputSurface"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final boolean isReprocessable() {
        throw new IllegalArgumentException(ad("isReprocessable"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void prepare(Surface surface) {
        throw new IllegalArgumentException(ad("prepare"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int setRepeatingBurst(List list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        throw new IllegalArgumentException(ad("setRepeatingBurst"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int setRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        throw new IllegalArgumentException(ad("setRepeatingRequest"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void stopRepeating() {
        throw new IllegalArgumentException(ad("stopRepeating"));
    }
}
