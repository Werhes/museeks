package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6434e {
    public static final /* synthetic */ C6434e ad = new Object();
    public static final int[] vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؙٖۡ] */
    static {
        HashMap hashMap = C0738e.metrica;
        C12232e c12232e = AbstractC3820e.ad;
        AbstractC3265e.ad(c12232e.vip(InterfaceC2112e.class), "androidx.camera.camera2.pipe.scalar.streamConfigurationMap");
        AbstractC3265e.ad(c12232e.vip(InterfaceC7937e.class), "androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap");
        AbstractC3265e.ad(c12232e.vip(InterfaceC5645e.class), "androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap");
        vip = new int[0];
    }

    public static boolean ad(InterfaceC2531e interfaceC2531e) {
        C9000e c9000e = (C9000e) interfaceC2531e;
        Float f = (Float) c9000e.metrica(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f == null) {
            int[] iArr = (int[]) c9000e.metrica(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr == null) {
                return false;
            }
            if (!AbstractC1660e.startapp(iArr, 1) && !AbstractC1660e.startapp(iArr, 2) && !AbstractC1660e.startapp(iArr, 4) && !AbstractC1660e.startapp(iArr, 3)) {
                return false;
            }
        } else if (f.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public static boolean vip(InterfaceC2531e interfaceC2531e) {
        Integer num = (Integer) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
