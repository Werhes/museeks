package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٚٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8786e extends AbstractC1802e {
    public C11226e ad;
    public int vip = 0;

    public AbstractC8786e() {
    }

    public AbstractC8786e(int i) {
    }

    public void pro(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.admob(view, i);
    }

    public final int remoteconfig() {
        C11226e c11226e = this.ad;
        if (c11226e != null) {
            return c11226e.license;
        }
        return 0;
    }

    @Override // defpackage.AbstractC1802e
    public boolean yandex(CoordinatorLayout coordinatorLayout, View view, int i) {
        pro(coordinatorLayout, view, i);
        if (this.ad == null) {
            this.ad = new C11226e(7, view);
        }
        C11226e c11226e = this.ad;
        View view2 = (View) c11226e.appmetrica;
        c11226e.vip = view2.getTop();
        c11226e.metrica = view2.getLeft();
        this.ad.metrica();
        int i2 = this.vip;
        if (i2 == 0) {
            return true;
        }
        C11226e c11226e2 = this.ad;
        if (c11226e2.license != i2) {
            c11226e2.license = i2;
            c11226e2.metrica();
        }
        this.vip = 0;
        return true;
    }
}
