package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٙؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11073e implements InterfaceC0107e {
    public final CameraDevice.CameraDeviceSetup ad;
    public final C14328e metrica;
    public final String vip;

    public C11073e(CameraDevice.CameraDeviceSetup cameraDeviceSetup, String str, C14328e c14328e) {
        this.ad = cameraDeviceSetup;
        this.vip = str;
        this.metrica = c14328e;
    }

    public final CaptureRequest.Builder ad(int i) {
        try {
            return this.ad.createCaptureRequest(i);
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            String str = this.vip;
            C14328e c14328e = this.metrica;
            if (!z) {
                if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                c14328e.ad(str, false, 9);
                return null;
            }
            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            c14328e.ad(str, true, i2);
            return null;
        }
    }
}
