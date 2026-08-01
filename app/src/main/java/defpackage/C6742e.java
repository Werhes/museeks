package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C6742e implements InterfaceC6545e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C14328e f13937e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final CameraCaptureSession f13938e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Handler f13939e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC18069e f13940e;

    public C6742e(InterfaceC18069e interfaceC18069e, CameraCaptureSession cameraCaptureSession, C14328e c14328e, Handler handler) {
        this.f13940e = interfaceC18069e;
        this.f13938e = cameraCaptureSession;
        this.f13937e = c14328e;
        this.f13939e = handler;
        C11498e c11498e = AbstractC4701e.ad;
        c11498e.getClass();
        C11498e.vip.incrementAndGet(c11498e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f13938e.close();
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: eؘُٔ */
    public final Integer mo1013e(List list, C4780e c4780e) {
        double d;
        char c;
        Integer num;
        int i;
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingBurst-");
        InterfaceC18069e interfaceC18069e = this.f13940e;
        sb.append(interfaceC18069e.advert());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String advert = interfaceC18069e.advert();
            d = 1000000.0d;
            try {
                C14328e c14328e = this.f13937e;
                try {
                    num = Integer.valueOf(this.f13938e.setRepeatingBurst(list, c4780e, this.f13939e));
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
                        c14328e.ad(advert, true, i);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        c = 0;
                        c14328e.ad(advert, false, 9);
                        num = null;
                    }
                    num = null;
                }
                c = 0;
                long amazon = AbstractC8703e.amazon(elapsedRealtimeNanos);
                StringBuilder isPro = AbstractC8703e.isPro(sb2, " - ");
                Object[] objArr = new Object[1];
                objArr[c] = Double.valueOf(amazon / 1000000.0d);
                Log.d("CXCP", AbstractC8703e.tapsense(objArr, 1, null, "%.3f ms", isPro));
                return num;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(sb2, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: eٟٗۦ */
    public final Integer mo1014e(CaptureRequest captureRequest, C4780e c4780e) {
        double d;
        char c;
        Integer num;
        int i;
        StringBuilder sb = new StringBuilder("CXCP#capture-");
        InterfaceC18069e interfaceC18069e = this.f13940e;
        sb.append(interfaceC18069e.advert());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String advert = interfaceC18069e.advert();
            d = 1000000.0d;
            try {
                C14328e c14328e = this.f13937e;
                try {
                    num = Integer.valueOf(this.f13938e.capture(captureRequest, c4780e, this.f13939e));
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
                        c14328e.ad(advert, true, i);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        c = 0;
                        c14328e.ad(advert, false, 9);
                        num = null;
                    }
                    num = null;
                }
                c = 0;
                long amazon = AbstractC8703e.amazon(elapsedRealtimeNanos);
                StringBuilder isPro = AbstractC8703e.isPro(sb2, " - ");
                Object[] objArr = new Object[1];
                objArr[c] = Double.valueOf(amazon / 1000000.0d);
                Log.d("CXCP", AbstractC8703e.tapsense(objArr, 1, null, "%.3f ms", isPro));
                return num;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(sb2, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.InterfaceC6545e
    public final Surface getInputSurface() {
        return this.f13938e.getInputSurface();
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: package */
    public final InterfaceC18069e mo1015package() {
        return this.f13940e;
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public Object mo754static(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e.equals(AbstractC3820e.ad.vip(CameraCaptureSession.class))) {
            return this.f13938e;
        }
        return null;
    }

    @Override // defpackage.InterfaceC6545e
    public final Integer subscription(CaptureRequest captureRequest, C4780e c4780e) {
        double d;
        char c;
        Integer num;
        int i;
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingRequest-");
        InterfaceC18069e interfaceC18069e = this.f13940e;
        sb.append(interfaceC18069e.advert());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String advert = interfaceC18069e.advert();
            d = 1000000.0d;
            try {
                C14328e c14328e = this.f13937e;
                try {
                    num = Integer.valueOf(this.f13938e.setRepeatingRequest(captureRequest, c4780e, this.f13939e));
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
                        c14328e.ad(advert, true, i);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        c = 0;
                        c14328e.ad(advert, false, 9);
                        num = null;
                    }
                    num = null;
                }
                c = 0;
                long amazon = AbstractC8703e.amazon(elapsedRealtimeNanos);
                StringBuilder isPro = AbstractC8703e.isPro(sb2, " - ");
                Object[] objArr = new Object[1];
                objArr[c] = Double.valueOf(amazon / 1000000.0d);
                Log.d("CXCP", AbstractC8703e.tapsense(objArr, 1, null, "%.3f ms", isPro));
                return num;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(sb2, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: super */
    public final boolean mo1016super() {
        double d;
        String advert;
        Unit unit;
        StringBuilder sb = new StringBuilder("CXCP#abortCaptures-");
        InterfaceC18069e interfaceC18069e = this.f13940e;
        sb.append(interfaceC18069e.advert());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            advert = interfaceC18069e.advert();
            d = 1000000.0d;
        } catch (Throwable th) {
            th = th;
            d = 1000000.0d;
        }
        try {
            C14328e c14328e = this.f13937e;
            try {
                this.f13938e.abortCaptures();
                unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
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
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    c14328e.ad(advert, false, 9);
                }
                unit = null;
            }
            Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(sb2, " - ")));
            return unit != null;
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(sb2, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0133 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.InterfaceC6545e
    /* renamed from: switch */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo1017switch(java.util.List r20) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6742e.mo1017switch(java.util.List):boolean");
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: throws */
    public final boolean mo1018throws() {
        double d;
        String advert;
        Unit unit;
        StringBuilder sb = new StringBuilder("CXCP#stopRepeating-");
        InterfaceC18069e interfaceC18069e = this.f13940e;
        sb.append(interfaceC18069e.advert());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            advert = interfaceC18069e.advert();
            d = 1000000.0d;
        } catch (Throwable th) {
            th = th;
            d = 1000000.0d;
        }
        try {
            C14328e c14328e = this.f13937e;
            try {
                this.f13938e.stopRepeating();
                unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
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
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    c14328e.ad(advert, false, 9);
                }
                unit = null;
            }
            Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(sb2, " - ")));
            return unit != null;
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(sb2, " - ")));
            throw th;
        }
    }

    @Override // defpackage.InterfaceC6545e
    /* renamed from: try */
    public final Integer mo1019try(List list, C4780e c4780e) {
        double d;
        char c;
        Integer num;
        int i;
        StringBuilder sb = new StringBuilder("CXCP#captureBurst-");
        InterfaceC18069e interfaceC18069e = this.f13940e;
        sb.append(interfaceC18069e.advert());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String advert = interfaceC18069e.advert();
            d = 1000000.0d;
            try {
                C14328e c14328e = this.f13937e;
                try {
                    num = Integer.valueOf(this.f13938e.captureBurst(list, c4780e, this.f13939e));
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
                        c14328e.ad(advert, true, i);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        c = 0;
                        c14328e.ad(advert, false, 9);
                        num = null;
                    }
                    num = null;
                }
                c = 0;
                long amazon = AbstractC8703e.amazon(elapsedRealtimeNanos);
                StringBuilder isPro = AbstractC8703e.isPro(sb2, " - ");
                Object[] objArr = new Object[1];
                objArr[c] = Double.valueOf(amazon / 1000000.0d);
                Log.d("CXCP", AbstractC8703e.tapsense(objArr, 1, null, "%.3f ms", isPro));
                return num;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(sb2, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }
}
