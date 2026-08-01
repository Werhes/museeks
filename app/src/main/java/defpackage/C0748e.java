package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748e extends AbstractC13757e {
    public SurfaceTexture adcel;
    public C9509e advert;
    public TextureView appmetrica;
    public C9689e billing;
    public AtomicReference mopub;
    public SurfaceTexture purchase;
    public boolean startapp;
    public C6122e yandex;

    @Override // defpackage.AbstractC13757e
    public final View ad() {
        return this.appmetrica;
    }

    @Override // defpackage.AbstractC13757e
    public final void appmetrica(C6122e c6122e, C9509e c9509e) {
        C9509e c9509e2;
        Size size = c6122e.vip;
        this.ad = size;
        size.getClass();
        FrameLayout frameLayout = this.vip;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.appmetrica = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.ad.getWidth(), this.ad.getHeight()));
        this.appmetrica.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC4255e(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.appmetrica);
        C6122e c6122e2 = this.yandex;
        if (c6122e2 != null && c6122e2.metrica() && (c9509e2 = this.advert) != null) {
            c9509e2.billing();
            this.advert = null;
        }
        this.yandex = c6122e;
        this.advert = c9509e;
        Executor Signature = AbstractC10077e.Signature(this.appmetrica.getContext());
        RunnableC11247e runnableC11247e = new RunnableC11247e(this, c6122e, 9);
        C4001e c4001e = c6122e.advert.metrica;
        if (c4001e != null) {
            c4001e.ad(runnableC11247e, Signature);
        }
        yandex();
    }

    @Override // defpackage.AbstractC13757e
    public final ListenableFuture billing() {
        return AbstractC5750e.purchase(new C2007e(16, this));
    }

    @Override // defpackage.AbstractC13757e
    public final void license() {
        this.startapp = true;
    }

    @Override // defpackage.AbstractC13757e
    public final void metrica() {
        if (!this.startapp || this.adcel == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.appmetrica.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.adcel;
        if (surfaceTexture != surfaceTexture2) {
            this.appmetrica.setSurfaceTexture(surfaceTexture2);
            this.adcel = null;
            this.startapp = false;
        }
    }

    @Override // defpackage.AbstractC13757e
    public final Bitmap vip() {
        TextureView textureView = this.appmetrica;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.appmetrica.getBitmap();
    }

    public final void yandex() {
        SurfaceTexture surfaceTexture;
        Size size = this.ad;
        if (size == null || (surfaceTexture = this.purchase) == null || this.yandex == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.ad.getHeight());
        Surface surface = new Surface(this.purchase);
        C6122e c6122e = this.yandex;
        C9689e purchase = AbstractC5750e.purchase(new C18070e(this, surface, 28));
        this.billing = purchase;
        purchase.f19184e.ad(new RunnableC6795e(this, surface, purchase, c6122e, 18), AbstractC10077e.Signature(this.appmetrica.getContext()));
        this.license = true;
        purchase();
    }
}
