package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13757e {
    public Size ad;
    public boolean license = false;
    public final C4519e metrica;
    public final FrameLayout vip;

    public AbstractC13757e(FrameLayout frameLayout, C4519e c4519e) {
        this.vip = frameLayout;
        this.metrica = c4519e;
    }

    public abstract View ad();

    public abstract void appmetrica(C6122e c6122e, C9509e c9509e);

    public abstract ListenableFuture billing();

    public abstract void license();

    public abstract void metrica();

    public final void purchase() {
        View ad = ad();
        if (ad == null || !this.license) {
            return;
        }
        FrameLayout frameLayout = this.vip;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        C4519e c4519e = this.metrica;
        c4519e.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            AbstractC9464e.remoteconfig("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (c4519e.yandex()) {
            if (ad instanceof TextureView) {
                ((TextureView) ad).setTransform(c4519e.purchase());
            } else {
                Display display = ad.getDisplay();
                boolean z = false;
                boolean z2 = (!c4519e.license || display == null || display.getRotation() == c4519e.vip) ? false : true;
                boolean z3 = c4519e.license;
                if (!z3) {
                    if ((!z3 ? c4519e.ad : -AbstractC3425e.billing(c4519e.vip)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    AbstractC9464e.adcel("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF billing = c4519e.billing(layoutDirection, size);
            ad.setPivotX(0.0f);
            ad.setPivotY(0.0f);
            ad.setScaleX(billing.width() / ((Size) c4519e.appmetrica).getWidth());
            ad.setScaleY(billing.height() / ((Size) c4519e.appmetrica).getHeight());
            ad.setTranslationX(billing.left - ad.getLeft());
            ad.setTranslationY(billing.top - ad.getTop());
        }
    }

    public abstract Bitmap vip();
}
