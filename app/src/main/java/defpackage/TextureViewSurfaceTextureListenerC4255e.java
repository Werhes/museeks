package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC4255e implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C0748e ad;

    public TextureViewSurfaceTextureListenerC4255e(C0748e c0748e) {
        this.ad = c0748e;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC9464e.yandex("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
        C0748e c0748e = this.ad;
        c0748e.purchase = surfaceTexture;
        if (c0748e.billing == null) {
            c0748e.yandex();
            return;
        }
        c0748e.yandex.getClass();
        AbstractC9464e.yandex("TextureViewImpl", "Surface invalidated " + c0748e.yandex);
        c0748e.yandex.smaato.ad();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0748e c0748e = this.ad;
        c0748e.purchase = null;
        C9689e c9689e = c0748e.billing;
        if (c9689e == null) {
            AbstractC9464e.yandex("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        C5891e c5891e = new C5891e(this, surfaceTexture, false, 19);
        c9689e.ad(new RunnableC17144e(c9689e, c5891e, 0), AbstractC10077e.Signature(c0748e.appmetrica.getContext()));
        c0748e.adcel = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC9464e.yandex("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C7169e c7169e = (C7169e) this.ad.mopub.getAndSet(null);
        if (c7169e != null) {
            c7169e.ad(null);
        }
    }
}
