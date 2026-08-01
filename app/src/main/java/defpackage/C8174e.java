package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۘۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8174e extends Surface {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static boolean f16651e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static int f16652e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f16653e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final HandlerThreadC11569e f16654e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f16655e;

    public C8174e(HandlerThreadC11569e handlerThreadC11569e, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f16654e = handlerThreadC11569e;
        this.f16655e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0039 A[Catch: eۣؗ٘ -> 0x0045, TRY_LEAVE, TryCatch #0 {eۣؗ٘ -> 0x0045, blocks: (B:3:0x0001, B:7:0x0039, B:16:0x000d, B:18:0x0017, B:22:0x0024, B:25:0x0031), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int ad(android.content.Context r5) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: defpackage.C5234e -> L45
            r2 = 24
            if (r1 >= r2) goto L9
        L7:
            r5 = r0
            goto L37
        L9:
            r2 = 26
            if (r1 >= r2) goto L22
            java.lang.String r3 = "samsung"
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch: defpackage.C5234e -> L45
            boolean r3 = r3.equals(r4)     // Catch: defpackage.C5234e -> L45
            if (r3 != 0) goto L7
            java.lang.String r3 = "XT1650"
            java.lang.String r4 = android.os.Build.MODEL     // Catch: defpackage.C5234e -> L45
            boolean r3 = r3.equals(r4)     // Catch: defpackage.C5234e -> L45
            if (r3 == 0) goto L22
            goto L7
        L22:
            if (r1 >= r2) goto L31
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: defpackage.C5234e -> L45
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r5 = r5.hasSystemFeature(r1)     // Catch: defpackage.C5234e -> L45
            if (r5 != 0) goto L31
            goto L7
        L31:
            java.lang.String r5 = "EGL_EXT_protected_content"
            boolean r5 = defpackage.AbstractC17352e.purchase(r5)     // Catch: defpackage.C5234e -> L45
        L37:
            if (r5 == 0) goto L47
            java.lang.String r5 = "EGL_KHR_surfaceless_context"
            boolean r5 = defpackage.AbstractC17352e.purchase(r5)     // Catch: defpackage.C5234e -> L45
            if (r5 == 0) goto L43
            r5 = 1
            return r5
        L43:
            r5 = 2
            return r5
        L45:
            r5 = move-exception
            goto L48
        L47:
            return r0
        L48:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to determine secure mode due to GL error: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "PlaceholderSurface"
            defpackage.AbstractC2803e.purchase(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8174e.ad(android.content.Context):int");
    }

    public static synchronized boolean vip(Context context) {
        boolean z;
        synchronized (C8174e.class) {
            try {
                if (!f16651e) {
                    f16652e = ad(context);
                    f16651e = true;
                }
                z = f16652e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f16654e) {
            try {
                if (!this.f16653e) {
                    HandlerThreadC11569e handlerThreadC11569e = this.f16654e;
                    handlerThreadC11569e.f23238e.getClass();
                    handlerThreadC11569e.f23238e.sendEmptyMessage(2);
                    this.f16653e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
