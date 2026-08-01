package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.Arrays;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۡٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7520e implements InterfaceC12541e {
    public final Context ad;
    public final C13399e appmetrica;
    public final C17647e license;
    public final C1739e metrica;
    public final C17280e vip;
    public final ArrayMap purchase = new ArrayMap();
    public final ArrayMap billing = new ArrayMap();
    public final ArrayMap yandex = new ArrayMap();

    public C7520e(Context context, C17280e c17280e, C1739e c1739e, C17647e c17647e, C13399e c13399e) {
        this.ad = context;
        this.vip = c17280e;
        this.metrica = c1739e;
        this.license = c17647e;
        this.appmetrica = c13399e;
    }

    public static final C2303e ad(C7520e c7520e, String str, boolean z, int i) {
        String str2;
        C13399e c13399e = c7520e.appmetrica;
        c13399e.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) C5060e.vip(str)) + "#readCameraExtensionMetadata");
            try {
                Log.d("CXCP", "Loading extension metadata for " + ((Object) C5060e.vip(str)));
                C2303e c2303e = new C2303e(str, i, c7520e.purchase(str));
                c13399e.getClass();
                long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                if (!z) {
                    str2 = BuildConfig.FLAVOR;
                } else {
                    if (!z) {
                        throw new C14803e(10);
                    }
                    str2 = " (redacted)";
                }
                Log.i("CXCP", "Loaded extension metadata for " + ((Object) C5060e.vip(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(elapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
                return c2303e;
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to load extension metadata for " + ((Object) C5060e.vip(str)) + '!', th);
            }
        } finally {
            Trace.endSection();
        }
    }

    public static final boolean metrica(C7520e c7520e) {
        boolean z;
        C1739e c1739e = c7520e.metrica;
        c1739e.getClass();
        if (AbstractC7890e.billing(Build.FINGERPRINT, "robolectric")) {
            z = true;
        } else {
            if (!c1739e.vip) {
                Trace.beginSection("CXCP#checkCameraPermission");
                if (c1739e.ad.checkSelfPermission("android.permission.CAMERA") == 0) {
                    c1739e.vip = true;
                }
                Trace.endSection();
            }
            z = c1739e.vip;
        }
        return !z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0078 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:25:0x005e, B:27:0x0066, B:11:0x0078, B:12:0x0083, B:15:0x0099, B:21:0x00d4, B:22:0x00db, B:23:0x007c, B:9:0x0072), top: B:24:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:25:0x005e, B:27:0x0066, B:11:0x0078, B:12:0x0083, B:15:0x0099, B:21:0x00d4, B:22:0x00db, B:23:0x007c, B:9:0x0072), top: B:24:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b A[Catch: all -> 0x012e, TryCatch #2 {all -> 0x012e, blocks: (B:3:0x002e, B:30:0x00df, B:32:0x00e5, B:38:0x010b, B:39:0x0112, B:40:0x0113, B:41:0x012d, B:42:0x00ec, B:45:0x00fd, B:46:0x00f7), top: B:2:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113 A[Catch: all -> 0x012e, TryCatch #2 {all -> 0x012e, blocks: (B:3:0x002e, B:30:0x00df, B:32:0x00e5, B:38:0x010b, B:39:0x0112, B:40:0x0113, B:41:0x012d, B:42:0x00ec, B:45:0x00fd, B:46:0x00f7), top: B:2:0x002e }] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C9000e vip(defpackage.C7520e r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7520e.vip(eؚۡٝ, java.lang.String, boolean):eٌ۟");
    }

    public final InterfaceC2531e appmetrica(String str) {
        InterfaceC2531e interfaceC2531e;
        try {
            Trace.beginSection(((Object) C5060e.vip(str)) + "#awaitMetadata");
            synchronized (this.purchase) {
                try {
                    interfaceC2531e = (InterfaceC2531e) this.purchase.get(str);
                    if (interfaceC2531e == null) {
                        if (metrica(this)) {
                            Unit unit = Unit.INSTANCE;
                            interfaceC2531e = vip(this, str, true);
                        } else {
                            interfaceC2531e = vip(this, str, false);
                            this.purchase.put(str, interfaceC2531e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return interfaceC2531e;
        } finally {
            Trace.endSection();
        }
    }

    public final InterfaceC2196e license(int i, String str) {
        InterfaceC2196e interfaceC2196e;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31) {
            throw new Exception(AbstractC1786e.admob(i2, "Extension sessions are only supported on Android S or higher. Device SDK is "));
        }
        try {
            Trace.beginSection(((Object) C5060e.vip(str)) + "#awaitExtensionMetadata");
            synchronized (this.billing) {
                try {
                    interfaceC2196e = (InterfaceC2196e) this.billing.get(str);
                    if (interfaceC2196e == null) {
                        if (metrica(this)) {
                            Unit unit = Unit.INSTANCE;
                            interfaceC2196e = ad(this, str, true, i);
                        } else {
                            interfaceC2196e = ad(this, str, false, i);
                            this.billing.put(str, interfaceC2196e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return interfaceC2196e;
        } finally {
            Trace.endSection();
        }
    }

    public final CameraExtensionCharacteristics purchase(String str) {
        synchronized (this.yandex) {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.yandex.get(str);
            if (cameraExtensionCharacteristics != null) {
                return cameraExtensionCharacteristics;
            }
            Unit unit = Unit.INSTANCE;
            Log.d("CXCP", "Retrieving CameraExtensionCharacteristics for " + ((Object) C5060e.vip(str)));
            return ((CameraManager) this.ad.getSystemService("camera")).getCameraExtensionCharacteristics(str);
        }
    }
}
