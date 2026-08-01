package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2625e extends C7188e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C13391e f6489e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C13391e f6491e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f6488e = -1;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f6490e = -1;

    public C2625e(C13391e c13391e, C13391e c13391e2) {
        this.f6491e = c13391e;
        this.f6489e = c13391e2;
    }

    public final void isVip(C3852e c3852e, C13705e c13705e, SurfaceTexture surfaceTexture, C13391e c13391e, int i, boolean z) {
        remoteconfig(i);
        int i2 = c3852e.vip;
        int i3 = c3852e.metrica;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, z ? c13705e.f27146e : c13705e.f27157e, 0);
        AbstractC6679e abstractC6679e = (AbstractC6679e) this.f14682e;
        abstractC6679e.getClass();
        if (abstractC6679e instanceof C15445e) {
            GLES20.glUniformMatrix4fv(((C15445e) abstractC6679e).purchase, 1, false, fArr2, 0);
            AbstractC7328e.vip("glUniformMatrix4fv");
        }
        C15552e c15552e = (C15552e) c13391e.f26644e;
        Object obj = c15552e.ad;
        Object obj2 = c15552e.vip;
        Size size = new Size((int) (((Float) c15552e.ad).floatValue() * i2), (int) (((Float) obj2).floatValue() * i3));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        C15552e c15552e2 = (C15552e) c13391e.f26645e;
        if (((Float) obj).floatValue() != 0.0f || ((Float) obj2).floatValue() != 0.0f) {
            Matrix.translateM(fArr4, 0, ((Float) c15552e2.ad).floatValue() / ((Float) obj).floatValue(), ((Float) c15552e2.vip).floatValue() / ((Float) obj2).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(abstractC6679e.vip, 1, false, fArr5, 0);
        AbstractC7328e.vip("glUniformMatrix4fv");
        GLES20.glUniform1f(abstractC6679e.metrica, 1.0f);
        AbstractC7328e.vip("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC7328e.vip("glDrawArrays");
        GLES20.glDisable(3042);
    }

    public final void signatures(long j, Surface surface, C13705e c13705e, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        AbstractC7328e.license((AtomicBoolean) this.f14683e, true);
        AbstractC7328e.metrica((Thread) this.f14680e);
        HashMap hashMap = (HashMap) this.f14688e;
        AbstractC4265e.yandex("The surface is not registered.", hashMap.containsKey(surface));
        C3852e c3852e = (C3852e) hashMap.get(surface);
        Objects.requireNonNull(c3852e);
        if (c3852e == AbstractC7328e.adcel) {
            c3852e = metrica(surface);
            if (c3852e == null) {
                return;
            } else {
                hashMap.put(surface, c3852e);
            }
        }
        C3852e c3852e2 = c3852e;
        EGLSurface eGLSurface = c3852e2.ad;
        if (surface != ((Surface) this.f14684e)) {
            mopub(eGLSurface);
            this.f14684e = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        isVip(c3852e2, c13705e, surfaceTexture, this.f6491e, this.f6488e, true);
        isVip(c3852e2, c13705e, surfaceTexture2, this.f6489e, this.f6490e, false);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f14692e, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f14692e, eGLSurface)) {
            return;
        }
        AbstractC9464e.remoteconfig("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        loadAd(surface, false);
    }

    @Override // defpackage.C7188e
    public final void smaato() {
        super.smaato();
        this.f6488e = -1;
        this.f6490e = -1;
    }

    @Override // defpackage.C7188e
    public final C5140e yandex(C14677e c14677e) {
        Map map = Collections.EMPTY_MAP;
        C5140e yandex = super.yandex(c14677e);
        this.f6488e = AbstractC7328e.yandex();
        this.f6490e = AbstractC7328e.yandex();
        return yandex;
    }
}
