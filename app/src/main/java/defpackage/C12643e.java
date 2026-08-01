package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12643e extends AbstractC12501e {
    public final WindowInsetsController appmetrica;
    public final Window billing;
    public final C2691e purchase;

    public C12643e(Window window, C2691e c2691e) {
        this.appmetrica = window.getInsetsController();
        this.purchase = c2691e;
        this.billing = window;
    }

    @Override // defpackage.AbstractC12501e
    public void adcel(boolean z) {
        amazon(16, 16, z);
    }

    @Override // defpackage.AbstractC12501e
    public final void advert(int i) {
        if ((i & 8) != 0) {
            ((C9770e) this.purchase.f6570e).crashlytics();
        }
        this.appmetrica.show(i & (-9));
    }

    public final void amazon(int i, int i2, boolean z) {
        Window window = this.billing;
        if (window == null) {
            if (z) {
                this.appmetrica.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                this.appmetrica.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }

    @Override // defpackage.AbstractC12501e
    public final void appmetrica() {
        this.appmetrica.hide(1);
    }

    @Override // defpackage.AbstractC12501e
    public void mopub(boolean z) {
        amazon(8192, 8, z);
    }
}
