package defpackage;

import android.view.View;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2830e {
    public static final C0583e ad;

    static {
        long[] jArr = AbstractC12981e.ad;
        ad = new C0583e();
    }

    public static final AbstractC5830e ad(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC5830e) {
            return (AbstractC5830e) tag;
        }
        return null;
    }
}
