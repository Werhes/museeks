package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1677e {
    public final InterfaceC13466e ad;

    public C1677e(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.ad = new C1745e(nestedScrollView);
        } else {
            this.ad = new C6173e(8);
        }
    }
}
