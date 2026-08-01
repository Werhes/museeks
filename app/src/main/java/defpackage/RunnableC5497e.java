package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5497e implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final int[] f11774e = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public EGLSurface f11775e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public EGLDisplay f11776e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int[] f11777e = new int[1];

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public EGLContext f11778e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Handler f11779e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public SurfaceTexture f11780e;

    public RunnableC5497e(Handler handler) {
        this.f11779e = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f11779e.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f11780e;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
