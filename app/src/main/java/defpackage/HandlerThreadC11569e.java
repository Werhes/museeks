package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerThreadC11569e extends HandlerThread implements Handler.Callback {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C8174e f23236e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Error f23237e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Handler f23238e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public RuntimeException f23239e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public RunnableC5497e f23240e;

    public final void ad(int i) {
        EGLSurface eglCreatePbufferSurface;
        this.f23240e.getClass();
        RunnableC5497e runnableC5497e = this.f23240e;
        int[] iArr = runnableC5497e.f11777e;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC17352e.vip("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr2 = new int[2];
        AbstractC17352e.vip("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        runnableC5497e.f11776e = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, RunnableC5497e.f11774e, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = AbstractC9413e.ad;
        AbstractC17352e.vip(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(runnableC5497e.f11776e, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC17352e.vip("eglCreateContext failed", eglCreateContext != null);
        runnableC5497e.f11778e = eglCreateContext;
        EGLDisplay eGLDisplay = runnableC5497e.f11776e;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC17352e.vip("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        AbstractC17352e.vip("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        runnableC5497e.f11775e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb = new StringBuilder();
        AbstractC17595e.metrica(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z2) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int i3 = i2 + 1;
            int vip = AbstractC13584e.vip(objArr2.length, i3);
            if (vip > objArr2.length) {
                objArr2 = Arrays.copyOf(objArr2, vip);
            }
            objArr2[i2] = valueOf;
            i2 = i3;
            z2 = true;
        }
        if (z2) {
            throw new C5234e(sb.toString(), AbstractC17475e.loadAd(i2, objArr2));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        runnableC5497e.f11780e = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC5497e);
        SurfaceTexture surfaceTexture2 = this.f23240e.f11780e;
        surfaceTexture2.getClass();
        this.f23236e = new C8174e(this, surfaceTexture2, i != 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    ad(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (C5234e e) {
                    AbstractC2803e.billing("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f23239e = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    AbstractC2803e.billing("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f23237e = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    AbstractC2803e.billing("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f23239e = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    vip();
                    return true;
                } catch (Throwable th) {
                    try {
                        AbstractC2803e.billing("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vip() {
        this.f23240e.getClass();
        RunnableC5497e runnableC5497e = this.f23240e;
        runnableC5497e.f11779e.removeCallbacks(runnableC5497e);
        try {
            SurfaceTexture surfaceTexture = runnableC5497e.f11780e;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC5497e.f11777e, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC5497e.f11776e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC5497e.f11776e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC5497e.f11775e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC5497e.f11776e, runnableC5497e.f11775e);
            }
            EGLContext eGLContext = runnableC5497e.f11778e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC5497e.f11776e, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = runnableC5497e.f11776e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC5497e.f11776e);
            }
            runnableC5497e.f11776e = null;
            runnableC5497e.f11778e = null;
            runnableC5497e.f11775e = null;
            runnableC5497e.f11780e = null;
        }
    }
}
