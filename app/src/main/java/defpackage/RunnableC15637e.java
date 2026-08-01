package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC15637e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ CaptureResult f30833e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ CameraCaptureSession f30834e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17839e f30835e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ CaptureRequest f30836e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30837e;

    public /* synthetic */ RunnableC15637e(C17839e c17839e, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult, int i) {
        this.f30837e = i;
        this.f30835e = c17839e;
        this.f30834e = cameraCaptureSession;
        this.f30836e = captureRequest;
        this.f30833e = captureResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30837e) {
            case 0:
                this.f30835e.ad.onCaptureProgressed(this.f30834e, this.f30836e, this.f30833e);
                return;
            default:
                this.f30835e.ad.onCaptureProgressed(this.f30834e, this.f30836e, this.f30833e);
                return;
        }
    }
}
