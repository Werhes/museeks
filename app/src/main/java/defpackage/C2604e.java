package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2604e implements InterfaceC12138e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f6454e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C14328e f6455e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final CameraExtensionSession f6456e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Executor f6457e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC18069e f6458e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final HashMap f6459e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C13710e f6460e;

    /* JADX WARN: Type inference failed for: r1v3, types: [eٓؒؕ, java.lang.Object] */
    public C2604e(C13471e c13471e, CameraExtensionSession cameraExtensionSession, C14328e c14328e, ExecutorC13626e executorC13626e) {
        this.f6458e = c13471e;
        this.f6456e = cameraExtensionSession;
        this.f6455e = c14328e;
        this.f6457e = executorC13626e;
        C11498e c11498e = AbstractC4701e.ad;
        c11498e.getClass();
        this.f6454e = C11498e.vip.incrementAndGet(c11498e);
        ?? obj = new Object();
        obj.ad = 0L;
        this.f6460e = obj;
        this.f6459e = new HashMap();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f6456e.close();
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public final Integer mo1013e(List list, C4780e c4780e) {
        if (list.size() == 1) {
            return subscription((CaptureRequest) AbstractC13480e.m3590instanceof(list), c4780e);
        }
        throw new IllegalStateException("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public final Integer mo1014e(CaptureRequest captureRequest, C4780e c4780e) {
        String advert = this.f6458e.advert();
        try {
            int i = Build.VERSION.SDK_INT;
            Executor executor = this.f6457e;
            return Integer.valueOf(i >= 33 ? this.f6456e.capture(captureRequest, executor, new C2837e(this, c4780e)) : this.f6456e.capture(captureRequest, executor, new C2837e(this, c4780e, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            C14328e c14328e = this.f6455e;
            if (!z) {
                if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                c14328e.ad(advert, false, 9);
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
            c14328e.ad(advert, true, i2);
            return null;
        }
    }

    @Override // defpackage.InterfaceC6545e
    public final Surface getInputSurface() {
        return null;
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: package, reason: not valid java name */
    public final InterfaceC18069e mo1015package() {
        return this.f6458e;
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e.equals(AbstractC3820e.ad.vip(C4403e.billing()))) {
            return this.f6456e;
        }
        return null;
    }

    @Override // defpackage.InterfaceC6545e
    public final Integer subscription(CaptureRequest captureRequest, C4780e c4780e) {
        String advert = this.f6458e.advert();
        try {
            int i = Build.VERSION.SDK_INT;
            Executor executor = this.f6457e;
            return Integer.valueOf(i >= 33 ? this.f6456e.setRepeatingRequest(captureRequest, executor, new C2837e(this, c4780e)) : this.f6456e.setRepeatingRequest(captureRequest, executor, new C2837e(this, c4780e, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            C14328e c14328e = this.f6455e;
            if (!z) {
                if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                c14328e.ad(advert, false, 9);
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
            c14328e.ad(advert, true, i2);
            return null;
        }
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: super, reason: not valid java name */
    public final boolean mo1016super() {
        return false;
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: switch, reason: not valid java name */
    public final boolean mo1017switch(List list) {
        Log.w("CXCP", "CameraExtensionSession does not support finalizeOutputConfigurations()");
        return false;
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: throws, reason: not valid java name */
    public final boolean mo1018throws() {
        Unit unit;
        String advert = this.f6458e.advert();
        try {
            this.f6456e.stopRepeating();
            unit = Unit.INSTANCE;
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            C14328e c14328e = this.f6455e;
            if (z) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                int i = 3;
                if (reason != 1) {
                    if (reason == 2) {
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
                }
                c14328e.ad(advert, true, i);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                c14328e.ad(advert, false, 9);
            } else {
                if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            unit = null;
        }
        return unit != null;
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: try, reason: not valid java name */
    public final Integer mo1019try(List list, C4780e c4780e) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo1014e((CaptureRequest) it.next(), c4780e);
        }
        return null;
    }
}
