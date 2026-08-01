package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14619e extends AbstractC6560e {
    @Override // defpackage.AbstractC6560e
    public void vip(C15013e c15013e, C15013e c15013e2, Window window, View view, boolean z, boolean z2) {
        AbstractC13467e.metrica(window, false);
        window.setStatusBarColor(z ? c15013e.vip : c15013e.ad);
        window.setNavigationBarColor(c15013e2.vip);
        C2691e c2691e = new C2691e(view);
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new C12643e(window, c2691e) : i >= 30 ? new C12643e(window, c2691e) : i >= 26 ? new C2309e(window, c2691e) : new C2309e(window, c2691e)).mopub(!z);
    }
}
