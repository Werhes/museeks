package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10454e extends AbstractC16666e {

    /* renamed from: interface, reason: not valid java name */
    public InterfaceC16400e f20646interface;

    @Override // defpackage.AbstractC16666e
    public final C1874e advert() {
        C11725e c11725e = this.ad;
        if (this.f20646interface == null) {
            Log.d("CamLifecycleController", "Lifecycle is not set.");
            return null;
        }
        C14598e c14598e = this.amazon;
        if (c14598e == null) {
            Log.d("CamLifecycleController", "CameraProvider is not ready.");
            return null;
        }
        try {
            if (c14598e == null) {
                AbstractC9464e.yandex("CameraController", "Camera not initialized.");
            } else if (this.Signature == null || this.loadAd == null) {
                AbstractC9464e.yandex("CameraController", "PreviewView not attached to CameraController.");
            }
            C0912e purchase = purchase();
            if (purchase == null) {
                return null;
            }
            return this.amazon.ad(this.f20646interface, c11725e, purchase);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
        }
    }
}
