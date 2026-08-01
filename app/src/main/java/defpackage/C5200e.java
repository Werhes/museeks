package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗ۠۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5200e extends C1404e {
    @Override // defpackage.C1404e, defpackage.AbstractC12494e
    public void ad(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.AbstractC12494e
    public boolean vip(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
