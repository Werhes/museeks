package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ۟ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6681e implements InterfaceC13297e, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final AtomicBoolean f13787e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ScheduledExecutorServiceC5380e f13788e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f13789e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final HandlerThread f13790e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final LinkedHashMap f13791e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final ArrayList f13792e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Handler f13793e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f13794e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C7188e f13795e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final float[] f13796e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final float[] f13797e;

    public C6681e(C14677e c14677e) {
        Map map = Collections.EMPTY_MAP;
        this.f13787e = new AtomicBoolean(false);
        this.f13797e = new float[16];
        this.f13796e = new float[16];
        this.f13791e = new LinkedHashMap();
        this.f13794e = 0;
        this.f13789e = false;
        this.f13792e = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f13790e = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f13793e = handler;
        this.f13788e = new ScheduledExecutorServiceC5380e(handler);
        this.f13795e = new C7188e();
        try {
            try {
                AbstractC5750e.purchase(new C11565e(this, c14677e)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    @Override // defpackage.InterfaceC13297e
    public final void ad(C6122e c6122e) {
        if (this.f13787e.get()) {
            c6122e.metrica();
        } else {
            license(new RunnableC2623e(this, c6122e, 4), new RunnableC4327e(c6122e, 0));
        }
    }

    public final void appmetrica(Exception exc) {
        ArrayList arrayList = this.f13792e;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((AbstractC4971e) it.next()).getClass();
            throw null;
        }
        arrayList.clear();
    }

    public final void billing(C10985e c10985e) {
        ArrayList arrayList = this.f13792e;
        if (arrayList.isEmpty()) {
            return;
        }
        if (c10985e == null) {
            appmetrica(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    byteArrayOutputStream.close();
                    return;
                }
                ((AbstractC4971e) it.next()).getClass();
                Bitmap purchase = purchase((Size) c10985e.f21741e, (float[]) c10985e.f21740e, 0);
                byteArrayOutputStream.reset();
                purchase.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Surface surface = (Surface) c10985e.f21742e;
                Objects.requireNonNull(byteArray);
                ImageProcessingUtil.yandex(byteArray, surface);
                throw null;
            } finally {
            }
        } catch (IOException e) {
            appmetrica(e);
        }
    }

    public final void license(Runnable runnable, Runnable runnable2) {
        try {
            this.f13788e.execute(new RunnableC4904e(10, this, runnable2, runnable));
        } catch (RejectedExecutionException e) {
            AbstractC9464e.pro("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void metrica() {
        if (this.f13789e && this.f13794e == 0) {
            LinkedHashMap linkedHashMap = this.f13791e;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((C13705e) it.next()).close();
            }
            Iterator it2 = this.f13792e.iterator();
            if (it2.hasNext()) {
                ((AbstractC4971e) it2.next()).getClass();
                new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
                throw null;
            }
            linkedHashMap.clear();
            this.f13795e.smaato();
            this.f13790e.quit();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f13787e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f13797e;
        surfaceTexture.getTransformMatrix(fArr);
        C10985e c10985e = null;
        for (Map.Entry entry : this.f13791e.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            C13705e c13705e = (C13705e) entry.getKey();
            float[] fArr2 = c13705e.f27146e;
            float[] fArr3 = this.f13796e;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            int i = c13705e.f27148e;
            if (i == 34) {
                try {
                    this.f13795e.subscription(surfaceTexture.getTimestamp(), fArr3, surface);
                } catch (RuntimeException e) {
                    AbstractC9464e.mopub("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                AbstractC4265e.yandex("Unsupported format: " + i, i == 256);
                AbstractC4265e.yandex("Only one JPEG output is supported.", c10985e == null);
                c10985e = new C10985e(surface, c13705e.f27153e, (float[]) fArr3.clone());
            }
        }
        try {
            billing(c10985e);
        } catch (RuntimeException e2) {
            appmetrica(e2);
        }
    }

    public final Bitmap purchase(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        AbstractC9164e.purchase(fArr2, i);
        AbstractC9164e.billing(fArr2);
        Size yandex = AbstractC8261e.yandex(i, size);
        C7188e c7188e = this.f13795e;
        c7188e.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(yandex.getHeight() * yandex.getWidth() * 4);
        AbstractC4265e.license(allocateDirect.capacity() == (yandex.getHeight() * yandex.getWidth()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        AbstractC4265e.license(allocateDirect.isDirect(), "ByteBuffer is not direct.");
        int[] iArr = AbstractC7328e.ad;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        AbstractC7328e.vip("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        AbstractC7328e.vip("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        AbstractC7328e.vip("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, yandex.getWidth(), yandex.getHeight(), 0, 6407, 5121, null);
        AbstractC7328e.vip("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        AbstractC7328e.vip("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        AbstractC7328e.vip("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        AbstractC7328e.vip("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        AbstractC7328e.vip("glActiveTexture");
        GLES20.glBindTexture(36197, c7188e.f14690e);
        AbstractC7328e.vip("glBindTexture");
        c7188e.f14684e = null;
        GLES20.glViewport(0, 0, yandex.getWidth(), yandex.getHeight());
        GLES20.glScissor(0, 0, yandex.getWidth(), yandex.getHeight());
        AbstractC6679e abstractC6679e = (AbstractC6679e) c7188e.f14682e;
        abstractC6679e.getClass();
        if (abstractC6679e instanceof C15445e) {
            GLES20.glUniformMatrix4fv(((C15445e) abstractC6679e).purchase, 1, false, fArr2, 0);
            AbstractC7328e.vip("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC7328e.vip("glDrawArrays");
        GLES20.glReadPixels(0, 0, yandex.getWidth(), yandex.getHeight(), 6408, 5121, allocateDirect);
        AbstractC7328e.vip("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        AbstractC7328e.vip("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        AbstractC7328e.vip("glDeleteFramebuffers");
        int i4 = c7188e.f14690e;
        GLES20.glActiveTexture(33984);
        AbstractC7328e.vip("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        AbstractC7328e.vip("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(yandex.getWidth(), yandex.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.metrica(createBitmap, allocateDirect, yandex.getWidth() * 4);
        return createBitmap;
    }

    @Override // defpackage.InterfaceC13297e
    public final void release() {
        if (this.f13787e.getAndSet(true)) {
            return;
        }
        license(new RunnableC17584e(28, this), new RunnableC5512e(3));
    }

    @Override // defpackage.InterfaceC13297e
    public final void vip(C13705e c13705e) {
        if (this.f13787e.get()) {
            c13705e.close();
            return;
        }
        RunnableC2623e runnableC2623e = new RunnableC2623e(this, c13705e, 3);
        Objects.requireNonNull(c13705e);
        license(runnableC2623e, new RunnableC17584e(27, c13705e));
    }
}
