package defpackage;

import android.hardware.camera2.CaptureFailure;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۤۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10639e implements InterfaceC7172e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f20958e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f20959e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final CaptureFailure f20960e;

    public C10639e(CaptureFailure captureFailure) {
        this.f20960e = captureFailure;
        captureFailure.getFrameNumber();
        this.f20959e = captureFailure.getReason();
        this.f20958e = captureFailure.wasImageCaptured();
    }

    @Override // defpackage.InterfaceC7172e
    public final int ads() {
        return this.f20959e;
    }

    @Override // defpackage.InterfaceC7172e
    public final boolean isVip() {
        return this.f20958e;
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e.equals(AbstractC3820e.ad.vip(CaptureFailure.class))) {
            return this.f20960e;
        }
        return null;
    }
}
