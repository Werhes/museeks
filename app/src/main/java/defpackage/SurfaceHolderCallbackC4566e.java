package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC4566e implements SurfaceHolder.Callback {
    public Size ad;
    public Size appmetrica;
    public C9509e license;
    public C6122e metrica;
    public C6122e vip;
    public final /* synthetic */ C4096e yandex;
    public boolean purchase = false;
    public boolean billing = false;

    public SurfaceHolderCallbackC4566e(C4096e c4096e) {
        this.yandex = c4096e;
    }

    public final void ad() {
        C9509e c9509e;
        if (this.vip != null) {
            AbstractC9464e.yandex("SurfaceViewImpl", "Request canceled: " + this.vip);
            if (!this.vip.metrica() || (c9509e = this.license) == null) {
                return;
            }
            c9509e.billing();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        AbstractC9464e.yandex("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
        this.appmetrica = new Size(i2, i3);
        vip();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C6122e c6122e;
        AbstractC9464e.yandex("SurfaceViewImpl", "Surface created.");
        if (!this.billing || (c6122e = this.metrica) == null) {
            return;
        }
        c6122e.metrica();
        c6122e.mopub.ad(null);
        this.metrica = null;
        this.billing = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractC9464e.yandex("SurfaceViewImpl", "Surface destroyed.");
        if (!this.purchase) {
            ad();
        } else if (this.vip != null) {
            AbstractC9464e.yandex("SurfaceViewImpl", "Surface closed " + this.vip);
            this.vip.smaato.ad();
        }
        this.billing = true;
        C6122e c6122e = this.vip;
        if (c6122e != null) {
            this.metrica = c6122e;
        }
        this.purchase = false;
        this.vip = null;
        this.license = null;
        this.appmetrica = null;
        this.ad = null;
    }

    public final boolean vip() {
        C4096e c4096e = this.yandex;
        Surface surface = c4096e.appmetrica.getHolder().getSurface();
        if (this.purchase || this.vip == null || !Objects.equals(this.ad, this.appmetrica)) {
            return false;
        }
        AbstractC9464e.yandex("SurfaceViewImpl", "Surface set on Preview.");
        C9509e c9509e = this.license;
        C6122e c6122e = this.vip;
        Objects.requireNonNull(c6122e);
        c6122e.ad(surface, AbstractC10077e.Signature(c4096e.appmetrica.getContext()), new C18027e(2, c9509e));
        this.purchase = true;
        c4096e.license = true;
        c4096e.purchase();
        return true;
    }
}
