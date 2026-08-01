package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17977e implements InterfaceC14599e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public volatile boolean f35237e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public volatile int f35240e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public ByteBuffer f35243e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public ByteBuffer f35244e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile int f35245e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public ByteBuffer f35246e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public ByteBuffer f35247e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public ByteBuffer f35248e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C4052e f35249e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public ByteBuffer f35251e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public ImageWriter f35253e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public InterfaceC0778e f35254e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Executor f35255e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public volatile boolean f35256e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public volatile int f35252e = 1;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Rect f35241e = new Rect();

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Rect f35250e = new Rect();

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public Matrix f35239e = new Matrix();

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public Matrix f35238e = new Matrix();

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final Object f35257e = new Object();

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public boolean f35242e = true;

    public abstract InterfaceC12385e ad(InterfaceC8668e interfaceC8668e);

    public final void adcel(C4052e c4052e) {
        synchronized (this.f35257e) {
            this.f35249e = c4052e;
        }
    }

    public final void advert(Rect rect) {
        synchronized (this.f35257e) {
            this.f35241e = rect;
            this.f35250e = new Rect(this.f35241e);
        }
    }

    public final void appmetrica(InterfaceC12385e interfaceC12385e) {
        if (this.f35252e != 1 && this.f35252e != 3) {
            if (this.f35252e == 2 && this.f35243e == null) {
                this.f35243e = ByteBuffer.allocateDirect(interfaceC12385e.vip() * interfaceC12385e.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.f35247e == null) {
            this.f35247e = ByteBuffer.allocateDirect(interfaceC12385e.vip() * interfaceC12385e.getWidth());
        }
        this.f35247e.position(0);
        if (this.f35248e == null) {
            this.f35248e = ByteBuffer.allocateDirect((interfaceC12385e.vip() * interfaceC12385e.getWidth()) / 4);
        }
        this.f35248e.position(0);
        if (this.f35246e == null) {
            this.f35246e = ByteBuffer.allocateDirect((interfaceC12385e.vip() * interfaceC12385e.getWidth()) / 4);
        }
        this.f35246e.position(0);
        if (this.f35252e == 3) {
            if (this.f35244e == null) {
                this.f35244e = ByteBuffer.allocateDirect(interfaceC12385e.vip() * interfaceC12385e.getWidth());
            }
            this.f35244e.position(0);
            if (this.f35251e == null) {
                this.f35251e = ByteBuffer.allocateDirect((interfaceC12385e.vip() * interfaceC12385e.getWidth()) / 2);
            }
            this.f35251e.position(0);
        }
    }

    public final void billing(int i, int i2, int i3, int i4) {
        int i5 = this.f35245e;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = AbstractC8261e.ad;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f35241e);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f35250e = rect;
        this.f35238e.setConcat(this.f35239e, matrix);
    }

    public abstract void license();

    @Override // defpackage.InterfaceC14599e
    public final void metrica(InterfaceC8668e interfaceC8668e) {
        try {
            InterfaceC12385e ad = ad(interfaceC8668e);
            if (ad != null) {
                purchase(ad);
            }
        } catch (IllegalStateException e) {
            AbstractC9464e.mopub("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public final void mopub(Matrix matrix) {
        synchronized (this.f35257e) {
            this.f35239e = matrix;
            this.f35238e = new Matrix(this.f35239e);
        }
    }

    public abstract void purchase(InterfaceC12385e interfaceC12385e);

    public final void startapp(Executor executor, InterfaceC0778e interfaceC0778e) {
        if (interfaceC0778e == null) {
            license();
        }
        synchronized (this.f35257e) {
            this.f35254e = interfaceC0778e;
            this.f35255e = executor;
        }
    }

    public final ListenableFuture vip(final InterfaceC12385e interfaceC12385e) {
        Object obj;
        final Executor executor;
        final InterfaceC0778e interfaceC0778e;
        boolean z;
        C4052e c4052e;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        C12997e billing;
        C12997e c12997e;
        int i = this.f35237e ? this.f35245e : 0;
        Object obj2 = this.f35257e;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f35255e;
                    interfaceC0778e = this.f35254e;
                    z = this.f35237e && i != this.f35240e;
                    if (z) {
                        yandex(interfaceC12385e, i);
                    }
                    try {
                        try {
                            if (!this.f35237e) {
                                if (this.f35252e == 3) {
                                }
                                c4052e = this.f35249e;
                                imageWriter = this.f35253e;
                                byteBuffer = this.f35243e;
                                byteBuffer2 = this.f35247e;
                                byteBuffer3 = this.f35248e;
                                byteBuffer4 = this.f35246e;
                                byteBuffer5 = this.f35244e;
                                byteBuffer6 = this.f35251e;
                            }
                            imageWriter = this.f35253e;
                            byteBuffer = this.f35243e;
                            byteBuffer2 = this.f35247e;
                            byteBuffer3 = this.f35248e;
                            byteBuffer4 = this.f35246e;
                            byteBuffer5 = this.f35244e;
                            byteBuffer6 = this.f35251e;
                        } catch (Throwable th) {
                            th = th;
                            obj = obj2;
                            throw th;
                        }
                        c4052e = this.f35249e;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                    appmetrica(interfaceC12385e);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
        if (interfaceC0778e == null || executor == null || !this.f35242e) {
            return new C4065e(1, new C14803e("No analyzer or executor currently set."));
        }
        if (c4052e != null) {
            if (this.f35252e == 2) {
                billing = ImageProcessingUtil.vip(interfaceC12385e, c4052e, byteBuffer, i, this.f35256e);
            } else {
                if (this.f35252e == 1) {
                    if (this.f35256e) {
                        ImageProcessingUtil.ad(interfaceC12385e);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        billing = ImageProcessingUtil.purchase(interfaceC12385e, c4052e, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                c12997e = null;
            }
            c12997e = billing;
        } else {
            if (this.f35252e == 3) {
                if (this.f35256e) {
                    ImageProcessingUtil.ad(interfaceC12385e);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    billing = ImageProcessingUtil.billing(interfaceC12385e, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i);
                    c12997e = billing;
                }
            }
            c12997e = null;
        }
        boolean z2 = c12997e == null;
        final InterfaceC12385e interfaceC12385e2 = z2 ? interfaceC12385e : c12997e;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f35257e) {
            if (z && !z2) {
                try {
                    billing(interfaceC12385e.getWidth(), interfaceC12385e.vip(), interfaceC12385e2.getWidth(), interfaceC12385e2.vip());
                } finally {
                }
            }
            this.f35240e = i;
            rect.set(this.f35250e);
            matrix.set(this.f35238e);
        }
        return AbstractC5750e.purchase(new InterfaceC12523e() { // from class: eٍٝۨ
            @Override // defpackage.InterfaceC12523e
            public final Object amazon(final C7169e c7169e) {
                final AbstractC17977e abstractC17977e = AbstractC17977e.this;
                final InterfaceC12385e interfaceC12385e3 = interfaceC12385e;
                final Matrix matrix2 = matrix;
                final InterfaceC12385e interfaceC12385e4 = interfaceC12385e2;
                final Rect rect2 = rect;
                final InterfaceC0778e interfaceC0778e2 = interfaceC0778e;
                executor.execute(new Runnable() { // from class: eًۣؗ
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC17977e abstractC17977e2 = AbstractC17977e.this;
                        InterfaceC12385e interfaceC12385e5 = interfaceC12385e3;
                        Matrix matrix3 = matrix2;
                        InterfaceC12385e interfaceC12385e6 = interfaceC12385e4;
                        Rect rect3 = rect2;
                        InterfaceC0778e interfaceC0778e3 = interfaceC0778e2;
                        C7169e c7169e2 = c7169e;
                        if (!abstractC17977e2.f35242e) {
                            c7169e2.metrica(new C14803e("ImageAnalysis is detached"));
                            return;
                        }
                        C5403e c5403e = new C5403e(interfaceC12385e6, null, new C1307e(interfaceC12385e5.mo691synchronized().ad(), interfaceC12385e5.mo691synchronized().metrica(), abstractC17977e2.f35237e ? 0 : abstractC17977e2.f35245e, matrix3, interfaceC12385e5.mo691synchronized().vip()));
                        if (!rect3.isEmpty()) {
                            Rect rect4 = new Rect(rect3);
                            if (!rect4.intersect(0, 0, c5403e.f11588e, c5403e.f11587e)) {
                                rect4.setEmpty();
                            }
                            synchronized (c5403e.f11586e) {
                            }
                        }
                        interfaceC0778e3.mopub(c5403e);
                        c7169e2.ad(null);
                    }
                });
                return "analyzeImage";
            }
        });
    }

    public final void yandex(InterfaceC12385e interfaceC12385e, int i) {
        C4052e c4052e = this.f35249e;
        if (c4052e == null) {
            return;
        }
        c4052e.advert();
        int width = interfaceC12385e.getWidth();
        int vip = interfaceC12385e.vip();
        int appmetrica = this.f35249e.appmetrica();
        int isVip = this.f35249e.isVip();
        boolean z = i == 90 || i == 270;
        int i2 = z ? vip : width;
        if (!z) {
            width = vip;
        }
        this.f35249e = new C4052e(AbstractC5750e.vip(i2, width, appmetrica, isVip));
        if (this.f35252e == 1) {
            ImageWriter imageWriter = this.f35253e;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.f35253e = ImageWriter.newInstance(this.f35249e.getSurface(), this.f35249e.isVip());
        }
    }
}
