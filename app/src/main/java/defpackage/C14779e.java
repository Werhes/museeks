package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14779e implements InterfaceC7106e {
    public final CameraDevice.CameraDeviceSetup ad;

    public C14779e(CameraManager cameraManager, String str) {
        this.ad = cameraManager.getCameraDeviceSetup(str);
    }

    @Override // defpackage.InterfaceC7106e
    public final C5401e ad(SessionConfiguration sessionConfiguration) {
        int i = this.ad.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2;
        String property = System.getProperty("ro.build.date.utc");
        if (property != null) {
            try {
                Long.parseLong(property);
            } catch (NumberFormatException unused) {
            }
        }
        return new C5401e(i, 4, (byte) 0);
    }
}
