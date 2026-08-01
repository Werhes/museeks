package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓ۟ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderC2120e implements SurfaceHolder {
    public final Surface ad;
    public SurfaceHolder.Callback metrica;
    public final Rect vip;

    public SurfaceHolderC2120e(Surface surface) {
        this.vip = new Rect();
        this.ad = surface;
    }

    public SurfaceHolderC2120e(Surface surface, int i, int i2) {
        Rect rect = new Rect();
        this.vip = rect;
        this.ad = surface;
        rect.set(0, 0, i, i2);
    }

    @Override // android.view.SurfaceHolder
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.metrica = callback;
    }

    @Override // android.view.SurfaceHolder
    public final Surface getSurface() {
        return this.ad;
    }

    @Override // android.view.SurfaceHolder
    public final Rect getSurfaceFrame() {
        return this.vip;
    }

    @Override // android.view.SurfaceHolder
    public final boolean isCreating() {
        return false;
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.SurfaceHolder
    public final void removeCallback(SurfaceHolder.Callback callback) {
        if (this.metrica == callback) {
            this.metrica = null;
        }
    }

    @Override // android.view.SurfaceHolder
    public final void setFixedSize(int i, int i2) {
        this.vip.set(0, 0, i, i2);
        SurfaceHolder.Callback callback = this.metrica;
        if (callback != null) {
            callback.surfaceChanged(this, 1, i, i2);
        }
    }

    @Override // android.view.SurfaceHolder
    public final void setFormat(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final void setKeepScreenOn(boolean z) {
    }

    @Override // android.view.SurfaceHolder
    public final void setSizeFromLayout() {
    }

    @Override // android.view.SurfaceHolder
    public final void setType(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final void unlockCanvasAndPost(Canvas canvas) {
    }
}
