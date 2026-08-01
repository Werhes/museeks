package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؑۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13705e implements Closeable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final float[] f27146e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C7169e f27147e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f27148e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Surface f27150e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Executor f27151e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C9689e f27152e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Size f27153e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public InterfaceC0867e f27156e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final float[] f27157e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f27155e = new Object();

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f27154e = false;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f27149e = false;

    public C13705e(Surface surface, int i, Size size, C5453e c5453e, C5453e c5453e2) {
        float[] fArr = new float[16];
        this.f27146e = fArr;
        float[] fArr2 = new float[16];
        this.f27157e = fArr2;
        this.f27150e = surface;
        this.f27148e = i;
        this.f27153e = size;
        ad(fArr, new float[16], c5453e);
        ad(fArr2, new float[16], c5453e2);
        this.f27152e = AbstractC5750e.purchase(new C2007e(15, this));
    }

    public static void ad(float[] fArr, float[] fArr2, C5453e c5453e) {
        Matrix.setIdentityM(fArr, 0);
        if (c5453e == null) {
            return;
        }
        Size size = c5453e.ad;
        boolean z = c5453e.appmetrica;
        int i = c5453e.license;
        AbstractC9164e.billing(fArr);
        AbstractC9164e.purchase(fArr, i);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        android.graphics.Matrix ad = AbstractC8261e.ad(AbstractC8261e.startapp(size), AbstractC8261e.startapp(AbstractC8261e.yandex(i, size)), i, z);
        RectF rectF = new RectF(c5453e.vip);
        ad.mapRect(rectF);
        float width = rectF.left / r7.getWidth();
        float height = ((r7.getHeight() - rectF.height()) - rectF.top) / r7.getHeight();
        float width2 = rectF.width() / r7.getWidth();
        float height2 = rectF.height() / r7.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        InterfaceC2881e interfaceC2881e = c5453e.metrica;
        Matrix.setIdentityM(fArr2, 0);
        AbstractC9164e.billing(fArr2);
        if (interfaceC2881e != null) {
            AbstractC4265e.yandex("Camera has no transform.", interfaceC2881e.loadAd());
            AbstractC9164e.purchase(fArr2, interfaceC2881e.vip().metrica());
            if (interfaceC2881e.license()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f27155e) {
            try {
                if (!this.f27149e) {
                    this.f27149e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f27147e.ad(null);
    }

    public final Surface license(ScheduledExecutorServiceC5380e scheduledExecutorServiceC5380e, InterfaceC0867e interfaceC0867e) {
        boolean z;
        synchronized (this.f27155e) {
            this.f27151e = scheduledExecutorServiceC5380e;
            this.f27156e = interfaceC0867e;
            z = this.f27154e;
        }
        if (z) {
            purchase();
        }
        return this.f27150e;
    }

    public final void purchase() {
        Executor executor;
        InterfaceC0867e interfaceC0867e;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f27155e) {
            try {
                if (this.f27151e != null && (interfaceC0867e = this.f27156e) != null) {
                    if (!this.f27149e) {
                        atomicReference.set(interfaceC0867e);
                        executor = this.f27151e;
                        this.f27154e = false;
                    }
                    executor = null;
                }
                this.f27154e = true;
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new RunnableC11247e(this, atomicReference, 8));
            } catch (RejectedExecutionException e) {
                AbstractC9464e.startapp("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
            }
        }
    }
}
