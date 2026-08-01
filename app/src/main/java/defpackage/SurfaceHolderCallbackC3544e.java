package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC3544e implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ C4275e ad;

    public SurfaceHolderCallbackC3544e(C4275e c4275e) {
        this.ad = c4275e;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.ad.getClass();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.ad.getClass();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.ad.getClass();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C4275e c4275e = this.ad;
        if (c4275e.premium == surfaceHolder && c4275e.mo1580e()) {
            if (c4275e.tapsense() >= 8) {
                c4275e.mopub(new C13892e(this, i2, i3));
            }
            c4275e.m1606switch(i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C4275e c4275e = this.ad;
        if (c4275e.premium != surfaceHolder) {
            return;
        }
        c4275e.ads = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        c4275e.m1543e(c4275e.ads, surfaceFrame.width(), surfaceFrame.height());
        c4275e.m1606switch(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C4275e c4275e = this.ad;
        if (c4275e.premium != surfaceHolder) {
            return;
        }
        c4275e.ads = null;
        c4275e.m1543e(null, 0, 0);
        c4275e.m1606switch(0, 0);
    }
}
