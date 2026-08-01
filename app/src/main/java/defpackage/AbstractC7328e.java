package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٞٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7328e {
    public static final C3852e adcel;
    public static final C10313e appmetrica;
    public static final C10313e billing;
    public static final String license;
    public static final String metrica;
    public static final C10313e purchase;
    public static final FloatBuffer startapp;
    public static final FloatBuffer yandex;
    public static final int[] ad = {12344};
    public static final int[] vip = {12445, 13632, 12344};

    static {
        Locale locale = Locale.US;
        metrica = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        license = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        appmetrica = new C10313e(0);
        purchase = new C10313e(1);
        billing = new C10313e(2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        yandex = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        startapp = asFloatBuffer2;
        adcel = new C3852e(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void ad(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        StringBuilder isPro = AbstractC8703e.isPro(str, ": EGL error: 0x");
        isPro.append(Integer.toHexString(eglGetError));
        throw new IllegalStateException(isPro.toString());
    }

    public static String adcel() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        return AbstractC4653e.isPro(group, ".", group2);
    }

    public static void appmetrica(int i, String str) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC5087e.m1746extends("Unable to locate '", str, "' in program"));
        }
    }

    public static HashMap billing(C14677e c14677e) {
        Object c15445e;
        EnumC5822e enumC5822e;
        Map map = Collections.EMPTY_MAP;
        HashMap hashMap = new HashMap();
        EnumC5822e[] values = EnumC5822e.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            EnumC5822e enumC5822e2 = values[i];
            C10313e c10313e = (C10313e) map.get(enumC5822e2);
            if (c10313e != null) {
                c15445e = new C15445e(c14677e, c10313e);
            } else if (enumC5822e2 == EnumC5822e.f12268e || enumC5822e2 == (enumC5822e = EnumC5822e.f12269e)) {
                c15445e = new C15445e(c14677e, enumC5822e2);
            } else {
                AbstractC4265e.yandex("Unhandled input format: " + enumC5822e2, enumC5822e2 == EnumC5822e.f12271e);
                if (c14677e.ad()) {
                    c15445e = new AbstractC6679e("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    C10313e c10313e2 = (C10313e) map.get(enumC5822e);
                    c15445e = c10313e2 != null ? new C15445e(c14677e, c10313e2) : new C15445e(c14677e, enumC5822e);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + enumC5822e2 + " created: " + c15445e);
            hashMap.put(enumC5822e2, c15445e);
        }
        return hashMap;
    }

    public static void license(AtomicBoolean atomicBoolean, boolean z) {
        AbstractC4265e.yandex(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
    }

    public static void metrica(Thread thread) {
        AbstractC4265e.yandex("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static int mopub(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        vip("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        AbstractC9464e.remoteconfig("GLUtils", "Could not compile shader: " + str);
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i + ":" + glGetShaderInfoLog);
    }

    public static int[] purchase(String str, C14677e c14677e) {
        int i = c14677e.ad;
        int[] iArr = ad;
        if (i == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return vip;
            }
            AbstractC9464e.remoteconfig("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static EGLSurface startapp(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        ad("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void vip(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        StringBuilder isPro = AbstractC8703e.isPro(str, ": GL error 0x");
        isPro.append(Integer.toHexString(glGetError));
        throw new IllegalStateException(isPro.toString());
    }

    public static int yandex() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        vip("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        vip("glBindTexture " + i);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        vip("glTexParameter");
        return i;
    }
}
