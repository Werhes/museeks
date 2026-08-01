package defpackage;

import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؑٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2309e extends AbstractC12501e {
    public final Window appmetrica;
    public final C2691e purchase;

    public C2309e(Window window, C2691e c2691e) {
        this.appmetrica = window;
        this.purchase = c2691e;
    }

    @Override // defpackage.AbstractC12501e
    public final void advert(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    loadAd(4);
                    this.appmetrica.clearFlags(1024);
                } else if (i2 == 2) {
                    loadAd(2);
                } else if (i2 == 8) {
                    ((C9770e) this.purchase.f6570e).crashlytics();
                }
            }
        }
    }

    public final void amazon(int i) {
        View decorView = this.appmetrica.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    @Override // defpackage.AbstractC12501e
    public final void appmetrica() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((1 & i) != 0) {
                if (i == 1) {
                    amazon(4);
                } else if (i == 2) {
                    amazon(2);
                } else if (i == 8) {
                    ((C9770e) this.purchase.f6570e).isVip();
                }
            }
        }
    }

    public final void loadAd(int i) {
        View decorView = this.appmetrica.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.AbstractC12501e
    public final void mopub(boolean z) {
        if (!z) {
            loadAd(8192);
            return;
        }
        Window window = this.appmetrica;
        window.clearFlags(67108864);
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        amazon(8192);
    }
}
