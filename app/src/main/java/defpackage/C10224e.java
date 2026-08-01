package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10224e implements InterfaceC0908e, InterfaceC15070e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f20232e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final CaptureResult f20233e;

    public C10224e(CaptureResult captureResult, String str) {
        this.f20233e = captureResult;
        this.f20232e = str;
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        C12232e c12232e = AbstractC3820e.ad;
        boolean equals = interfaceC7227e.equals(c12232e.vip(CaptureResult.class));
        CaptureResult captureResult = this.f20233e;
        if (equals) {
            return captureResult;
        }
        if (!interfaceC7227e.equals(c12232e.vip(TotalCaptureResult.class)) || captureResult == null) {
            return null;
        }
        return captureResult;
    }

    public final String toString() {
        return "FrameMetadata(camera: " + ((Object) C5060e.vip(this.f20232e)) + ", frameNumber: " + this.f20233e.getFrameNumber() + ')';
    }
}
