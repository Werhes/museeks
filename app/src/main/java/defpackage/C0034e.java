package defpackage;

import android.hardware.camera2.CameraDevice;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034e {
    public final CameraDevice.StateCallback ad;
    public final C11811e metrica;
    public final C13391e vip;

    public C0034e(CameraDevice.StateCallback stateCallback, C13391e c13391e, C11811e c11811e) {
        this.ad = stateCallback;
        this.vip = c13391e;
        this.metrica = c11811e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0034e)) {
            return false;
        }
        C0034e c0034e = (C0034e) obj;
        return AbstractC7890e.billing(this.ad, c0034e.ad) && AbstractC7890e.billing(this.vip, c0034e.vip) && AbstractC7890e.billing(this.metrica, c0034e.metrica);
    }

    public final int hashCode() {
        CameraDevice.StateCallback stateCallback = this.ad;
        int hashCode = (stateCallback == null ? 0 : stateCallback.hashCode()) * 31;
        C13391e c13391e = this.vip;
        int hashCode2 = (hashCode + (c13391e == null ? 0 : c13391e.hashCode())) * 31;
        C11811e c11811e = this.metrica;
        return hashCode2 + (c11811e != null ? C11811e.vip(c11811e.ad) : 0);
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=" + this.ad + ", cameraCaptureSessionListener=" + this.vip + ", cameraOpenRetryMaxTimeoutNs=" + this.metrica + ')';
    }
}
