package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0960e implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ C17148e ad;

    public SurfaceHolderCallbackC0960e(C17148e c17148e) {
        this.ad = c17148e;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        C17148e c17148e = this.ad;
        c17148e.m4265e(surface);
        c17148e.f33596e = surface;
        c17148e.m4270e(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C17148e c17148e = this.ad;
        c17148e.m4265e(null);
        c17148e.m4270e(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.ad.m4270e(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.ad.m4270e(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C17148e c17148e = this.ad;
        if (c17148e.f33628e) {
            c17148e.m4265e(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C17148e c17148e = this.ad;
        if (c17148e.f33628e) {
            c17148e.m4265e(null);
        }
        c17148e.m4270e(0, 0);
    }
}
