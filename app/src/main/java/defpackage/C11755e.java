package defpackage;

import android.hardware.camera2.CameraManager;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11755e extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ int ad = 0;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ InterfaceC9543e vip;

    public C11755e(InterfaceC9543e interfaceC9543e, C14246e c14246e) {
        this.vip = interfaceC9543e;
        this.metrica = c14246e;
    }

    public C11755e(C11546e c11546e, InterfaceC9543e interfaceC9543e) {
        this.metrica = c11546e;
        this.vip = interfaceC9543e;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        switch (this.ad) {
            case 0:
                Log.d("CXCP", "Camera access priorities have changed");
                if (AbstractC17113e.appmetrica(this.vip, C12448e.ad) instanceof C8870e) {
                    Log.w("CXCP", "Failed to emit CameraPrioritiesChanged");
                    return;
                }
                return;
            default:
                super.onCameraAccessPrioritiesChanged();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        switch (this.ad) {
            case 0:
                if (str.equals(((C14246e) this.metrica).f28160e)) {
                    Log.d("CXCP", "Camera " + str + " has become available");
                    C5060e.ad(str);
                    if (AbstractC17113e.appmetrica(this.vip, new C3064e(str)) instanceof C8870e) {
                        Log.w("CXCP", "Failed to emit CameraAvailable(" + str + ')');
                        return;
                    }
                    return;
                }
                return;
            default:
                C11546e.ad((C11546e) this.metrica, this.vip, str, true);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        switch (this.ad) {
            case 0:
                if (str.equals(((C14246e) this.metrica).f28160e)) {
                    Log.d("CXCP", "Camera " + str + " has become unavailable");
                    C5060e.ad(str);
                    if (AbstractC17113e.appmetrica(this.vip, new C5716e(str)) instanceof C8870e) {
                        Log.w("CXCP", "Failed to emit CameraUnavailable(" + str + ')');
                        return;
                    }
                    return;
                }
                return;
            default:
                C11546e.ad((C11546e) this.metrica, this.vip, str, false);
                return;
        }
    }
}
