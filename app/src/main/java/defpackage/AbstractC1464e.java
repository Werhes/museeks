package defpackage;

import android.widget.LinearLayout;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۦُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1464e {
    public static final int ad;

    static {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        ad = VKXApplication.Companion.ad(16.0f);
    }

    public static final void ad(LinearLayout linearLayout) {
        int paddingTop = linearLayout.getPaddingTop();
        int paddingBottom = linearLayout.getPaddingBottom();
        int i = ad;
        linearLayout.setPadding(i, paddingTop, i, paddingBottom);
    }
}
