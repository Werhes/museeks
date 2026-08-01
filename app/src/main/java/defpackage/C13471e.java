package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13471e implements InterfaceC18069e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C13391e f26733e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f26734e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final CameraDevice f26735e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C14328e f26737e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC2531e f26738e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C17280e f26740e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C2673e f26739e = AbstractC14430e.metrica(false);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C7744e f26736e = AbstractC14430e.appmetrica(null);

    public C13471e(InterfaceC2531e interfaceC2531e, CameraDevice cameraDevice, String str, C14328e c14328e, C13391e c13391e, C17280e c17280e) {
        this.f26738e = interfaceC2531e;
        this.f26735e = cameraDevice;
        this.f26734e = str;
        this.f26737e = c14328e;
        this.f26733e = c13391e;
        this.f26740e = c17280e;
    }

    @Override // defpackage.InterfaceC18069e
    public final void Signature(int i) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String str = this.f26734e;
            C14328e c14328e = this.f26737e;
            try {
                AbstractC5096e.Signature(this.f26735e, i);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                int i2 = 0;
                if (e instanceof CameraAccessException) {
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
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    c14328e.ad(str, false, 9);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final C6571e ad(InterfaceC8260e interfaceC8260e) {
        if (this.f26739e.vip()) {
            metrica(interfaceC8260e);
            return new C6571e(Boolean.FALSE, null);
        }
        Boolean bool = Boolean.TRUE;
        C7744e c7744e = this.f26736e;
        c7744e.getClass();
        return new C6571e(bool, C7744e.vip.getAndSet(c7744e, interfaceC8260e));
    }

    @Override // defpackage.InterfaceC18069e
    public final String advert() {
        return this.f26734e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0153 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.InterfaceC18069e
    /* renamed from: break, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo3561break(java.util.List r27, defpackage.InterfaceC8943e r28) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13471e.mo3561break(java.util.List, eٌۙٝ):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0155 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r14v1, types: [eٓۢۨ] */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.InterfaceC18069e
    /* renamed from: const, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo3562const(android.hardware.camera2.params.InputConfiguration r27, java.util.ArrayList r28, defpackage.InterfaceC8943e r29) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13471e.mo3562const(android.hardware.camera2.params.InputConfiguration, java.util.ArrayList, eٌۙٝ):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01f0 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:34:0x00aa, B:36:0x00b3, B:38:0x00b9, B:39:0x00ca, B:43:0x00f5, B:44:0x0115, B:46:0x011b, B:48:0x0129, B:49:0x0133, B:51:0x0139, B:54:0x014b, B:57:0x0158, B:63:0x015c, B:66:0x016d, B:78:0x0176, B:79:0x0179, B:82:0x017b, B:83:0x017e, B:86:0x0195, B:88:0x0199, B:97:0x01c6, B:100:0x01eb, B:107:0x01f0, B:109:0x01f6, B:111:0x01fa, B:113:0x01fe, B:116:0x0203, B:118:0x0207, B:119:0x020d, B:120:0x020e), top: B:8:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0270 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0199 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:34:0x00aa, B:36:0x00b3, B:38:0x00b9, B:39:0x00ca, B:43:0x00f5, B:44:0x0115, B:46:0x011b, B:48:0x0129, B:49:0x0133, B:51:0x0139, B:54:0x014b, B:57:0x0158, B:63:0x015c, B:66:0x016d, B:78:0x0176, B:79:0x0179, B:82:0x017b, B:83:0x017e, B:86:0x0195, B:88:0x0199, B:97:0x01c6, B:100:0x01eb, B:107:0x01f0, B:109:0x01f6, B:111:0x01fa, B:113:0x01fe, B:116:0x0203, B:118:0x0207, B:119:0x020d, B:120:0x020e), top: B:8:0x003d }] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC18069e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean crashlytics(defpackage.C14510e r27) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13471e.crashlytics(eٕٔؖ):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef A[Catch: all -> 0x00c9, TryCatch #4 {all -> 0x00c9, blocks: (B:32:0x009d, B:34:0x00a9, B:36:0x00af, B:38:0x00c5, B:39:0x00cf, B:40:0x00d6, B:41:0x00d7, B:53:0x00eb, B:55:0x00ef, B:64:0x011c, B:70:0x013b, B:73:0x0141, B:75:0x0145, B:77:0x0149, B:79:0x014d, B:82:0x0152, B:84:0x0156, B:85:0x015c, B:86:0x015d), top: B:8:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0141 A[Catch: all -> 0x00c9, TryCatch #4 {all -> 0x00c9, blocks: (B:32:0x009d, B:34:0x00a9, B:36:0x00af, B:38:0x00c5, B:39:0x00cf, B:40:0x00d6, B:41:0x00d7, B:53:0x00eb, B:55:0x00ef, B:64:0x011c, B:70:0x013b, B:73:0x0141, B:75:0x0145, B:77:0x0149, B:79:0x014d, B:82:0x0152, B:84:0x0156, B:85:0x015c, B:86:0x015d), top: B:8:0x003c }] */
    @Override // defpackage.InterfaceC18069e
    /* renamed from: else, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo3563else(defpackage.C18240e r25) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13471e.mo3563else(eّٝ):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0153 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.InterfaceC18069e
    /* renamed from: extends, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo3564extends(java.util.ArrayList r27, defpackage.InterfaceC8943e r28) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13471e.mo3564extends(java.util.ArrayList, eٌۙٝ):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:9:0x003a, B:11:0x003f, B:12:0x005b, B:15:0x0061, B:18:0x006b, B:22:0x00bf, B:24:0x00c3, B:33:0x00f0, B:35:0x0117, B:51:0x011c, B:53:0x0122, B:55:0x0126, B:57:0x012a, B:60:0x012f, B:62:0x0133, B:63:0x0139, B:64:0x013a, B:71:0x0090, B:74:0x009a, B:77:0x00a7), top: B:8:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0194 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0196 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:9:0x003a, B:11:0x003f, B:12:0x005b, B:15:0x0061, B:18:0x006b, B:22:0x00bf, B:24:0x00c3, B:33:0x00f0, B:35:0x0117, B:51:0x011c, B:53:0x0122, B:55:0x0126, B:57:0x012a, B:60:0x012f, B:62:0x0133, B:63:0x0139, B:64:0x013a, B:71:0x0090, B:74:0x009a, B:77:0x00a7), top: B:8:0x003a }] */
    @Override // defpackage.InterfaceC18069e
    /* renamed from: final, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo3565final(defpackage.C2308e r24, java.util.ArrayList r25, defpackage.InterfaceC8943e r26) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13471e.mo3565final(eؔؑٙ, java.util.ArrayList, eٌۙٝ):boolean");
    }

    @Override // defpackage.InterfaceC18069e
    /* renamed from: goto, reason: not valid java name */
    public final CaptureRequest.Builder mo3566goto(int i) {
        double d;
        CaptureRequest.Builder builder;
        StringBuilder sb = new StringBuilder("CXCP#createCaptureRequest-");
        String str = this.f26734e;
        sb.append(str);
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            d = 1000000.0d;
        } catch (Throwable th) {
            th = th;
            d = 1000000.0d;
        }
        try {
            C14328e c14328e = this.f26737e;
            try {
                builder = this.f26735e.createCaptureRequest(i);
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    int i2 = 3;
                    if (reason != 1) {
                        if (reason == 2) {
                            i2 = 6;
                        } else if (reason == 3) {
                            i2 = 0;
                        } else if (reason == 4) {
                            i2 = 1;
                        } else if (reason != 5) {
                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i2 = 11;
                        } else {
                            i2 = 2;
                        }
                    }
                    c14328e.ad(str, true, i2);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    c14328e.ad(str, false, 9);
                }
                builder = null;
            }
            Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(sb2, " - ")));
            return builder;
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(sb2, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0178 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:9:0x0039, B:11:0x003e, B:12:0x004f, B:14:0x0055, B:16:0x007a, B:19:0x007e, B:22:0x0083, B:25:0x008c, B:37:0x00a3, B:39:0x00a7, B:48:0x00d4, B:50:0x00fb, B:57:0x0100, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0113, B:68:0x0117, B:69:0x011d, B:70:0x011e), top: B:8:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:9:0x0039, B:11:0x003e, B:12:0x004f, B:14:0x0055, B:16:0x007a, B:19:0x007e, B:22:0x0083, B:25:0x008c, B:37:0x00a3, B:39:0x00a7, B:48:0x00d4, B:50:0x00fb, B:57:0x0100, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0113, B:68:0x0117, B:69:0x011d, B:70:0x011e), top: B:8:0x0039 }] */
    @Override // defpackage.InterfaceC18069e
    /* renamed from: implements, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo3567implements(java.util.ArrayList r22, defpackage.InterfaceC8943e r23) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13471e.mo3567implements(java.util.ArrayList, eٌۙٝ):boolean");
    }

    @Override // defpackage.InterfaceC18069e
    public final void inmobi() {
        InterfaceC8260e interfaceC8260e;
        if (!this.f26739e.ad() || (interfaceC8260e = (InterfaceC8260e) this.f26736e.ad) == null) {
            return;
        }
        vip(interfaceC8260e);
    }

    @Override // defpackage.InterfaceC18069e
    public final CaptureRequest.Builder loadAd(TotalCaptureResult totalCaptureResult) {
        double d;
        CaptureRequest.Builder builder;
        StringBuilder sb = new StringBuilder("CXCP#createReprocessCaptureRequest-");
        String str = this.f26734e;
        sb.append(str);
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            d = 1000000.0d;
        } catch (Throwable th) {
            th = th;
            d = 1000000.0d;
        }
        try {
            C14328e c14328e = this.f26737e;
            try {
                builder = this.f26735e.createReprocessCaptureRequest(totalCaptureResult);
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
                    c14328e.ad(str, true, i);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    c14328e.ad(str, false, 9);
                }
                builder = null;
            }
            Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(sb2, " - ")));
            return builder;
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", AbstractC8703e.tapsense(new Object[]{Double.valueOf(AbstractC8703e.amazon(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC8703e.isPro(sb2, " - ")));
            throw th;
        }
    }

    public final void metrica(InterfaceC8260e interfaceC8260e) {
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            interfaceC8260e.ad();
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.InterfaceC18069e
    /* renamed from: new, reason: not valid java name */
    public final void mo3568new() {
        if (!this.f26739e.vip()) {
            throw new IllegalStateException("Check failed.");
        }
        C7744e c7744e = this.f26736e;
        c7744e.getClass();
        InterfaceC8260e interfaceC8260e = (InterfaceC8260e) C7744e.vip.getAndSet(c7744e, null);
        if (interfaceC8260e != null) {
            metrica(interfaceC8260e);
        }
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e.equals(AbstractC3820e.ad.vip(CameraDevice.class))) {
            return this.f26735e;
        }
        return null;
    }

    public final String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) C5060e.vip(this.f26734e)) + ')';
    }

    public final void vip(InterfaceC8260e interfaceC8260e) {
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            interfaceC8260e.vip();
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }
}
