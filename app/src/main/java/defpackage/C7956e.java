package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7956e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ String f16105e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C11546e f16106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7956e(String str, C11546e c11546e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f16105e = str;
        this.f16106e = c11546e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C7956e(this.f16105e, this.f16106e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7956e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Boolean bool;
        int i;
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        AbstractC2003e.purchase(obj);
        String str = this.f16105e;
        C11546e c11546e = this.f16106e;
        InterfaceC16964e interfaceC16964e = c11546e.ad;
        C14328e c14328e = c11546e.metrica;
        int i2 = 3;
        try {
            bool = Boolean.valueOf(((CameraManager) interfaceC16964e.get()).isCameraDeviceSetupSupported(str));
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                if (reason == 1) {
                    i = 3;
                } else if (reason == 2) {
                    i = 6;
                } else if (reason == 3) {
                    i = 0;
                } else if (reason == 4) {
                    i = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i = 11;
                } else {
                    i = 2;
                }
                c14328e.ad(str, true, i);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                c14328e.ad(str, false, 9);
            } else {
                if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            bool = null;
        }
        if (!AbstractC7890e.billing(bool, Boolean.TRUE)) {
            return null;
        }
        Log.d("CXCP", "Initializing CameraDeviceSetup for " + ((Object) C5060e.vip(str)));
        try {
            cameraDeviceSetup = ((CameraManager) interfaceC16964e.get()).getCameraDeviceSetup(str);
        } catch (Exception e2) {
            if (e2 instanceof CameraAccessException) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e2.getMessage());
                CameraAccessException cameraAccessException2 = (CameraAccessException) e2;
                int reason2 = cameraAccessException2.getReason();
                if (reason2 != 1) {
                    if (reason2 == 2) {
                        i2 = 6;
                    } else if (reason2 == 3) {
                        i2 = 0;
                    } else if (reason2 == 4) {
                        i2 = 1;
                    } else if (reason2 != 5) {
                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException2);
                        i2 = 11;
                    } else {
                        i2 = 2;
                    }
                }
                c14328e.ad(str, true, i2);
            } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e2.getMessage());
                c14328e.ad(str, false, 9);
            } else {
                if (!(e2 instanceof IllegalStateException)) {
                    throw e2;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            cameraDeviceSetup = null;
        }
        if (cameraDeviceSetup != null) {
            return new C11073e(cameraDeviceSetup, str, c14328e);
        }
        return null;
    }
}
