package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1731e {
    public final AbstractC12501e ad;

    public C1731e(Window window, View view) {
        C2691e c2691e = new C2691e(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.ad = new C12643e(window, c2691e);
            return;
        }
        if (i >= 30) {
            this.ad = new C12643e(window, c2691e);
        } else if (i >= 26) {
            this.ad = new C2309e(window, c2691e);
        } else {
            this.ad = new C2309e(window, c2691e);
        }
    }

    public final void ad(boolean z) {
        this.ad.adcel(z);
    }

    public final void vip(boolean z) {
        this.ad.mopub(z);
    }
}
