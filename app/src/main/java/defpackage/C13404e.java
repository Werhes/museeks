package defpackage;

import android.hardware.camera2.CameraManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٞٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13404e extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ InterfaceC9543e ad;

    public C13404e(InterfaceC9543e interfaceC9543e) {
        this.ad = interfaceC9543e;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        C5060e.ad(str);
        AbstractC17113e.appmetrica(this.ad, new C5060e(str));
    }
}
