package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4096e extends AbstractC13757e {
    public SurfaceView appmetrica;
    public final SurfaceHolderCallbackC4566e purchase;

    public C4096e(FrameLayout frameLayout, C4519e c4519e) {
        super(frameLayout, c4519e);
        this.purchase = new SurfaceHolderCallbackC4566e(this);
    }

    @Override // defpackage.AbstractC13757e
    public final View ad() {
        return this.appmetrica;
    }

    @Override // defpackage.AbstractC13757e
    public final void appmetrica(C6122e c6122e, C9509e c9509e) {
        SurfaceView surfaceView = this.appmetrica;
        boolean equals = Objects.equals(this.ad, c6122e.vip);
        if (surfaceView == null || !equals) {
            Size size = c6122e.vip;
            this.ad = size;
            size.getClass();
            FrameLayout frameLayout = this.vip;
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.appmetrica = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.ad.getWidth(), this.ad.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.appmetrica);
            this.appmetrica.getHolder().addCallback(this.purchase);
        }
        Executor Signature = AbstractC10077e.Signature(this.appmetrica.getContext());
        RunnableC1352e runnableC1352e = new RunnableC1352e(5, c9509e);
        C4001e c4001e = c6122e.advert.metrica;
        if (c4001e != null) {
            c4001e.ad(runnableC1352e, Signature);
        }
        this.appmetrica.post(new RunnableC9527e(7, this, c6122e, c9509e));
    }

    @Override // defpackage.AbstractC13757e
    public final ListenableFuture billing() {
        return C4065e.f9036e;
    }

    @Override // defpackage.AbstractC13757e
    public final void license() {
    }

    @Override // defpackage.AbstractC13757e
    public final void metrica() {
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [eٖۧؓ] */
    @Override // defpackage.AbstractC13757e
    public final Bitmap vip() {
        SurfaceView surfaceView = this.appmetrica;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.appmetrica.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap createBitmap = Bitmap.createBitmap(this.appmetrica.getWidth(), this.appmetrica.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        AbstractC12026e.remoteconfig(this.appmetrica, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: eٖۧؓ
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                Semaphore semaphore2 = semaphore;
                if (i == 0) {
                    AbstractC9464e.yandex("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    AbstractC9464e.adcel("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
                }
                semaphore2.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                AbstractC9464e.adcel("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return createBitmap;
        } catch (InterruptedException e) {
            AbstractC9464e.mopub("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            return createBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }
}
