package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C7188e implements InterfaceC0566e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f14680e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public Object f14681e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public Object f14682e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f14683e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Object f14684e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int[] f14685e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f14686e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Object f14687e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f14688e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f14689e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f14690e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f14691e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f14692e;

    public C7188e() {
        this.f14683e = new AtomicBoolean(false);
        this.f14688e = new HashMap();
        this.f14692e = EGL14.EGL_NO_DISPLAY;
        this.f14691e = EGL14.EGL_NO_CONTEXT;
        this.f14685e = AbstractC7328e.ad;
        this.f14689e = EGL14.EGL_NO_SURFACE;
        this.f14687e = Collections.EMPTY_MAP;
        this.f14682e = null;
        this.f14681e = EnumC5822e.f12271e;
        this.f14690e = -1;
    }

    public C7188e(C12452e c12452e, C3123e c3123e, int i, InterfaceC17838e interfaceC17838e) {
        this.f14683e = c12452e;
        this.f14688e = c3123e;
        this.f14690e = i;
        this.f14680e = interfaceC17838e;
        this.f14685e = AbstractC4422e.ad;
        float[] fArr = AbstractC4422e.vip;
        this.f14692e = fArr;
        this.f14687e = fArr;
        this.f14682e = fArr;
        this.f14681e = AbstractC4422e.metrica;
    }

    @Override // defpackage.InterfaceC0566e
    public int Signature() {
        return 0;
    }

    @Override // defpackage.InterfaceC17717e
    public /* synthetic */ boolean ad() {
        return false;
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e adcel(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        int[] iArr = AbstractC4422e.ad;
        int i = 0;
        long j2 = (j / 1000000) - 0;
        long j3 = this.f14690e;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return abstractC3424e3;
        }
        startapp(abstractC3424e, abstractC3424e2, abstractC3424e3);
        AbstractC3424e abstractC3424e4 = (AbstractC3424e) this.f14686e;
        if (((C16089e) this.f14681e) != AbstractC4422e.metrica) {
            int i2 = (int) j4;
            float purchase = purchase(appmetrica(i2), i2, false);
            float[] fArr = (float[]) this.f14682e;
            C6309e[][] c6309eArr = (C6309e[][]) ((C16089e) this.f14681e).f31681e;
            float f = c6309eArr[0][0].ad;
            float f2 = c6309eArr[c6309eArr.length - 1][0].vip;
            if (purchase < f) {
                purchase = f;
            }
            if (purchase <= f2) {
                f2 = purchase;
            }
            int length = fArr.length;
            boolean z = false;
            for (C6309e[] c6309eArr2 : c6309eArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    C6309e c6309e = c6309eArr2[i4];
                    if (f2 <= c6309e.vip) {
                        if (c6309e.Signature) {
                            fArr[i3] = c6309e.admob;
                            fArr[i3 + 1] = c6309e.subscription;
                        } else {
                            c6309e.metrica(f2);
                            fArr[i3] = c6309e.ad();
                            fArr[i3 + 1] = c6309e.vip();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                abstractC3424e4.appmetrica(i, fArr[i]);
                i++;
            }
        } else {
            AbstractC3424e pro = pro((j4 - 1) * 1000000, abstractC3424e, abstractC3424e2, abstractC3424e3);
            AbstractC3424e pro2 = pro(j4 * 1000000, abstractC3424e, abstractC3424e2, abstractC3424e3);
            int vip = pro.vip();
            while (i < vip) {
                abstractC3424e4.appmetrica(i, (pro.ad(i) - pro2.ad(i)) * 1000.0f);
                i++;
            }
        }
        return abstractC3424e4;
    }

    @Override // defpackage.InterfaceC0566e
    public int admob() {
        return this.f14690e;
    }

    public void advert(Surface surface) {
        AbstractC7328e.license((AtomicBoolean) this.f14683e, true);
        AbstractC7328e.metrica((Thread) this.f14680e);
        HashMap hashMap = (HashMap) this.f14688e;
        if (hashMap.containsKey(surface)) {
            return;
        }
        hashMap.put(surface, AbstractC7328e.adcel);
    }

    public void amazon() {
        HashMap hashMap = (HashMap) this.f14688e;
        Iterator it = ((Map) this.f14687e).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((AbstractC6679e) it.next()).ad);
        }
        this.f14687e = Collections.EMPTY_MAP;
        this.f14682e = null;
        if (!Objects.equals((EGLDisplay) this.f14692e, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f14692e;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (C3852e c3852e : hashMap.values()) {
                if (!Objects.equals(c3852e.ad, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f14692e, c3852e.ad)) {
                    try {
                        AbstractC7328e.ad("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        AbstractC9464e.mopub("GLUtils", e.toString(), e);
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals((EGLSurface) this.f14689e, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f14692e, (EGLSurface) this.f14689e);
                this.f14689e = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.f14691e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f14692e, (EGLContext) this.f14691e);
                this.f14691e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f14692e);
            this.f14692e = EGL14.EGL_NO_DISPLAY;
        }
        this.f14686e = null;
        this.f14690e = -1;
        this.f14681e = EnumC5822e.f12271e;
        this.f14684e = null;
        this.f14680e = null;
    }

    public int appmetrica(int i) {
        int i2;
        C12452e c12452e = (C12452e) this.f14683e;
        int i3 = c12452e.vip;
        c12452e.getClass();
        if (i3 <= 0 || i3 > c12452e.vip) {
            AbstractC14783e.yandex(BuildConfig.FLAVOR);
            throw null;
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = c12452e.ad[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public C15552e billing(C14677e c14677e) {
        AbstractC7328e.license((AtomicBoolean) this.f14683e, false);
        try {
            vip(c14677e, null);
            license();
            mopub((EGLSurface) this.f14689e);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString((EGLDisplay) this.f14692e, 12373);
            if (glGetString == null) {
                glGetString = BuildConfig.FLAVOR;
            }
            if (eglQueryString == null) {
                eglQueryString = BuildConfig.FLAVOR;
            }
            return new C15552e(glGetString, eglQueryString);
        } catch (IllegalStateException e) {
            AbstractC9464e.pro("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new C15552e(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        } finally {
            amazon();
        }
    }

    @Override // defpackage.InterfaceC17717e
    public long inmobi(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return admob() * 1000000;
    }

    public void license() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f14692e;
        EGLConfig eGLConfig = (EGLConfig) this.f14686e;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = AbstractC7328e.ad;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        AbstractC7328e.ad("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.f14689e = eglCreatePbufferSurface;
    }

    public void loadAd(Surface surface, boolean z) {
        HashMap hashMap = (HashMap) this.f14688e;
        if (((Surface) this.f14684e) == surface) {
            this.f14684e = null;
            mopub((EGLSurface) this.f14689e);
        }
        C3852e c3852e = z ? (C3852e) hashMap.remove(surface) : (C3852e) hashMap.put(surface, AbstractC7328e.adcel);
        if (c3852e == null || c3852e == AbstractC7328e.adcel) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.f14692e, c3852e.ad);
        } catch (RuntimeException e) {
            AbstractC9464e.pro("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    public C3852e metrica(Surface surface) {
        try {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f14692e;
            EGLConfig eGLConfig = (EGLConfig) this.f14686e;
            Objects.requireNonNull(eGLConfig);
            EGLSurface startapp = AbstractC7328e.startapp(eGLDisplay, eGLConfig, surface, this.f14685e);
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.f14692e;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, startapp, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, startapp, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return new C3852e(startapp, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            AbstractC9464e.pro("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    public void mopub(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f14692e).getClass();
        ((EGLContext) this.f14691e).getClass();
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f14692e, eGLSurface, eGLSurface, (EGLContext) this.f14691e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e pro(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        AbstractC3424e abstractC3424e4;
        AbstractC3424e abstractC3424e5;
        float f;
        C6309e[][] c6309eArr;
        boolean z;
        AbstractC3424e abstractC3424e6 = abstractC3424e;
        AbstractC3424e abstractC3424e7 = abstractC3424e2;
        C12452e c12452e = (C12452e) this.f14683e;
        int[] iArr = AbstractC4422e.ad;
        int i = 0;
        long j2 = (j / 1000000) - 0;
        int i2 = this.f14690e;
        long j3 = i2;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i3 = (int) j3;
        C3123e c3123e = (C3123e) this.f14688e;
        C1871e c1871e = (C1871e) c3123e.vip(i3);
        if (c1871e != null) {
            return c1871e.ad;
        }
        if (i3 >= i2) {
            return abstractC3424e7;
        }
        if (i3 <= 0) {
            return abstractC3424e6;
        }
        startapp(abstractC3424e6, abstractC3424e7, abstractC3424e3);
        AbstractC3424e abstractC3424e8 = (AbstractC3424e) this.f14691e;
        boolean z2 = true;
        if (((C16089e) this.f14681e) == AbstractC4422e.metrica) {
            int appmetrica = appmetrica(i3);
            float purchase = purchase(appmetrica, i3, true);
            C1871e c1871e2 = (C1871e) c3123e.vip(c12452e.metrica(appmetrica));
            if (c1871e2 != null && (abstractC3424e5 = c1871e2.ad) != null) {
                abstractC3424e6 = abstractC3424e5;
            }
            C1871e c1871e3 = (C1871e) c3123e.vip(c12452e.metrica(appmetrica + 1));
            if (c1871e3 != null && (abstractC3424e4 = c1871e3.ad) != null) {
                abstractC3424e7 = abstractC3424e4;
            }
            int vip = abstractC3424e8.vip();
            for (int i4 = 0; i4 < vip; i4++) {
                abstractC3424e8.appmetrica(i4, (abstractC3424e7.ad(i4) * purchase) + ((1 - purchase) * abstractC3424e6.ad(i4)));
            }
            return abstractC3424e8;
        }
        float purchase2 = purchase(appmetrica(i3), i3, false);
        float[] fArr = (float[]) this.f14687e;
        C6309e[][] c6309eArr2 = (C6309e[][]) ((C16089e) this.f14681e).f31681e;
        int length = c6309eArr2.length - 1;
        float f2 = c6309eArr2[0][0].ad;
        float f3 = c6309eArr2[length][0].vip;
        int length2 = fArr.length;
        if (purchase2 < f2 || purchase2 > f3) {
            if (purchase2 > f3) {
                f2 = f3;
            } else {
                length = 0;
            }
            float f4 = purchase2 - f2;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length2 - 1) {
                C6309e c6309e = c6309eArr2[length][i6];
                boolean z3 = c6309e.Signature;
                float f5 = c6309e.subscription;
                float f6 = c6309e.admob;
                if (z3) {
                    float f7 = c6309e.ad;
                    float f8 = c6309e.mopub;
                    f = f4;
                    float f9 = c6309e.metrica;
                    c6309eArr = c6309eArr2;
                    fArr[i5] = (f * f6) + AbstractC1634e.billing(c6309e.appmetrica, f9, (f2 - f7) * f8, f9);
                    float f10 = (f2 - f7) * f8;
                    float f11 = c6309e.license;
                    fArr[i5 + 1] = (f * f5) + AbstractC1634e.billing(c6309e.purchase, f11, f10, f11);
                } else {
                    f = f4;
                    c6309eArr = c6309eArr2;
                    c6309e.metrica(f2);
                    fArr[i5] = (c6309e.ad() * f) + (c6309e.amazon * c6309e.yandex) + f6;
                    fArr[i5 + 1] = (c6309e.vip() * f) + (c6309e.loadAd * c6309e.startapp) + f5;
                }
                i5 += 2;
                i6++;
                f4 = f;
                c6309eArr2 = c6309eArr;
            }
        } else {
            int length3 = c6309eArr2.length;
            int i7 = 0;
            boolean z4 = false;
            while (i7 < length3) {
                int i8 = i;
                int i9 = i8;
                while (i8 < length2 - 1) {
                    C6309e c6309e2 = c6309eArr2[i7][i9];
                    if (purchase2 <= c6309e2.vip) {
                        if (c6309e2.Signature) {
                            float f12 = c6309e2.ad;
                            float f13 = c6309e2.mopub;
                            float f14 = c6309e2.metrica;
                            z = z2;
                            fArr[i8] = AbstractC1634e.billing(c6309e2.appmetrica, f14, (purchase2 - f12) * f13, f14);
                            float f15 = c6309e2.license;
                            fArr[i8 + 1] = AbstractC1634e.billing(c6309e2.purchase, f15, (purchase2 - f12) * f13, f15);
                        } else {
                            z = z2;
                            c6309e2.metrica(purchase2);
                            fArr[i8] = (c6309e2.amazon * c6309e2.yandex) + c6309e2.admob;
                            fArr[i8 + 1] = (c6309e2.loadAd * c6309e2.startapp) + c6309e2.subscription;
                        }
                        z4 = z;
                    } else {
                        z = z2;
                    }
                    i8 += 2;
                    i9++;
                    z2 = z;
                }
                boolean z5 = z2;
                if (z4) {
                    break;
                }
                i7++;
                z2 = z5;
                i = 0;
            }
        }
        int length4 = fArr.length;
        for (int i10 = 0; i10 < length4; i10++) {
            abstractC3424e8.appmetrica(i10, fArr[i10]);
        }
        return abstractC3424e8;
    }

    public float purchase(int i, int i2, boolean z) {
        InterfaceC17838e interfaceC17838e;
        float f;
        C12452e c12452e = (C12452e) this.f14683e;
        if (i >= c12452e.vip - 1) {
            f = i2;
        } else {
            int metrica = c12452e.metrica(i);
            int metrica2 = c12452e.metrica(i + 1);
            if (i2 == metrica) {
                f = metrica;
            } else {
                int i3 = metrica2 - metrica;
                C1871e c1871e = (C1871e) ((C3123e) this.f14688e).vip(metrica);
                if (c1871e == null || (interfaceC17838e = c1871e.vip) == null) {
                    interfaceC17838e = (InterfaceC17838e) this.f14680e;
                }
                float f2 = i3;
                float ad = interfaceC17838e.ad((i2 - metrica) / f2);
                if (z) {
                    return ad;
                }
                f = (f2 * ad) + metrica;
            }
        }
        return f / ((float) 1000);
    }

    public void remoteconfig(int i) {
        AbstractC6679e abstractC6679e = (AbstractC6679e) ((Map) this.f14687e).get((EnumC5822e) this.f14681e);
        if (abstractC6679e == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + ((EnumC5822e) this.f14681e));
        }
        if (((AbstractC6679e) this.f14682e) != abstractC6679e) {
            this.f14682e = abstractC6679e;
            abstractC6679e.vip();
            Log.d("OpenGlRenderer", "Using program for input format " + ((EnumC5822e) this.f14681e) + ": " + ((AbstractC6679e) this.f14682e));
        }
        GLES20.glActiveTexture(33984);
        AbstractC7328e.vip("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        AbstractC7328e.vip("glBindTexture");
    }

    public void smaato() {
        if (((AtomicBoolean) this.f14683e).getAndSet(false)) {
            AbstractC7328e.metrica((Thread) this.f14680e);
            amazon();
        }
    }

    public void startapp(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        float[] fArr;
        C3123e c3123e = (C3123e) this.f14688e;
        C12452e c12452e = (C12452e) this.f14683e;
        boolean z = ((C16089e) this.f14681e) != AbstractC4422e.metrica;
        if (((AbstractC3424e) this.f14691e) == null) {
            this.f14691e = abstractC3424e.metrica();
            this.f14686e = abstractC3424e3.metrica();
            int i = c12452e.vip;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = c12452e.metrica(i2) / ((float) 1000);
            }
            this.f14692e = fArr2;
            int i3 = c12452e.vip;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.f14685e = iArr;
        }
        if (z) {
            if (((C16089e) this.f14681e) != AbstractC4422e.metrica && AbstractC7890e.billing((AbstractC3424e) this.f14689e, abstractC3424e) && AbstractC7890e.billing((AbstractC3424e) this.f14684e, abstractC3424e2)) {
                return;
            }
            this.f14689e = abstractC3424e;
            this.f14684e = abstractC3424e2;
            int vip = abstractC3424e.vip() + (abstractC3424e.vip() % 2);
            this.f14687e = new float[vip];
            this.f14682e = new float[vip];
            int i5 = c12452e.vip;
            float[][] fArr3 = new float[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                int metrica = c12452e.metrica(i6);
                C1871e c1871e = (C1871e) c3123e.vip(metrica);
                if (metrica == 0 && c1871e == null) {
                    fArr = new float[vip];
                    for (int i7 = 0; i7 < vip; i7++) {
                        fArr[i7] = abstractC3424e.ad(i7);
                    }
                } else if (metrica == this.f14690e && c1871e == null) {
                    fArr = new float[vip];
                    for (int i8 = 0; i8 < vip; i8++) {
                        fArr[i8] = abstractC3424e2.ad(i8);
                    }
                } else {
                    AbstractC3424e abstractC3424e4 = c1871e.ad;
                    float[] fArr4 = new float[vip];
                    for (int i9 = 0; i9 < vip; i9++) {
                        fArr4[i9] = abstractC3424e4.ad(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.f14681e = new C16089e(this.f14685e, (float[]) this.f14692e, fArr3);
        }
    }

    public void subscription(long j, float[] fArr, Surface surface) {
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
        int i = c3852e.metrica;
        int i2 = c3852e.vip;
        EGLSurface eGLSurface = c3852e.ad;
        if (surface != ((Surface) this.f14684e)) {
            mopub(eGLSurface);
            this.f14684e = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        AbstractC6679e abstractC6679e = (AbstractC6679e) this.f14682e;
        abstractC6679e.getClass();
        if (abstractC6679e instanceof C15445e) {
            GLES20.glUniformMatrix4fv(((C15445e) abstractC6679e).purchase, 1, false, fArr, 0);
            AbstractC7328e.vip("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC7328e.vip("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f14692e, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f14692e, eGLSurface)) {
            return;
        }
        AbstractC9464e.remoteconfig("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        loadAd(surface, false);
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e tapsense(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        return adcel(inmobi(abstractC3424e, abstractC3424e2, abstractC3424e3), abstractC3424e, abstractC3424e2, abstractC3424e3);
    }

    public void vip(C14677e c14677e, C11980e c11980e) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f14692e = eglGetDisplay;
        if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.f14692e, iArr, 0, iArr, 1)) {
            this.f14692e = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (c11980e != null) {
            String str = iArr[0] + "." + iArr[1];
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            c11980e.f23949e = str;
        }
        int i = c14677e.ad() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f14692e, new int[]{12324, i, 12323, i, 12322, i, 12321, c14677e.ad() ? 2 : 8, 12325, 0, 12326, 0, 12352, c14677e.ad() ? 64 : 4, 12610, c14677e.ad() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f14692e, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c14677e.ad() ? 3 : 2, 12344}, 0);
        AbstractC7328e.ad("eglCreateContext");
        this.f14686e = eGLConfig;
        this.f14691e = eglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext((EGLDisplay) this.f14692e, eglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public C5140e yandex(C14677e c14677e) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f14683e;
        AbstractC7328e.license(atomicBoolean, false);
        C11980e c11980e = new C11980e(3, false);
        c11980e.f23950e = "0.0";
        c11980e.f23949e = "0.0";
        String str = BuildConfig.FLAVOR;
        c11980e.f23951e = BuildConfig.FLAVOR;
        c11980e.f23948e = BuildConfig.FLAVOR;
        try {
            if (c14677e.ad()) {
                C15552e billing = billing(c14677e);
                String str2 = (String) billing.ad;
                str2.getClass();
                String str3 = (String) billing.vip;
                str3.getClass();
                if (!str2.contains("GL_EXT_YUV_target")) {
                    AbstractC9464e.remoteconfig("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    c14677e = C14677e.license;
                }
                this.f14685e = AbstractC7328e.purchase(str3, c14677e);
                c11980e.f23951e = str2;
                c11980e.f23948e = str3;
            }
            vip(c14677e, c11980e);
            license();
            mopub((EGLSurface) this.f14689e);
            String adcel = AbstractC7328e.adcel();
            if (adcel == null) {
                throw new NullPointerException("Null glVersion");
            }
            c11980e.f23950e = adcel;
            this.f14687e = AbstractC7328e.billing(c14677e);
            int yandex = AbstractC7328e.yandex();
            this.f14690e = yandex;
            remoteconfig(yandex);
            this.f14680e = Thread.currentThread();
            atomicBoolean.set(true);
            if (((String) c11980e.f23950e) == null) {
                str = " glVersion";
            }
            if (((String) c11980e.f23949e) == null) {
                str = str.concat(" eglVersion");
            }
            if (((String) c11980e.f23951e) == null) {
                str = AbstractC10257e.adcel(str, " glExtensions");
            }
            if (((String) c11980e.f23948e) == null) {
                str = AbstractC10257e.adcel(str, " eglExtensions");
            }
            if (str.isEmpty()) {
                return new C5140e((String) c11980e.f23950e, (String) c11980e.f23949e, (String) c11980e.f23951e, (String) c11980e.f23948e);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        } catch (IllegalArgumentException e) {
            e = e;
            amazon();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            amazon();
            throw e;
        }
    }
}
