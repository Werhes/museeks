package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9489e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ long f18833e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ CameraCaptureSession f18834e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17839e f18835e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ CaptureRequest f18836e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18837e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ long f18838e;

    public /* synthetic */ RunnableC9489e(C17839e c17839e, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2, int i) {
        this.f18837e = i;
        this.f18835e = c17839e;
        this.f18834e = cameraCaptureSession;
        this.f18836e = captureRequest;
        this.f18833e = j;
        this.f18838e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18837e) {
            case 0:
                this.f18835e.ad.onCaptureStarted(this.f18834e, this.f18836e, this.f18833e, this.f18838e);
                return;
            default:
                AbstractC5666e.applovin(this.f18835e.ad, this.f18834e, this.f18836e, this.f18833e, this.f18838e);
                return;
        }
    }
}
