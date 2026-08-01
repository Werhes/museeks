package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5382e extends AbstractC6238e {
    public final int ad;

    public C5382e(int i) {
        this.ad = i;
    }

    @Override // defpackage.AbstractC6238e
    public final void license(Rect rect, View view, RecyclerView recyclerView) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int i = childLayoutPosition % 2;
        int i2 = this.ad;
        if (i == 0) {
            rect.left = i2;
            rect.right = i2 / 2;
        } else {
            rect.left = i2 / 2;
            rect.right = i2;
        }
        rect.bottom = i2;
        rect.top = (childLayoutPosition == 0 || childLayoutPosition == 1) ? i2 / 2 : 0;
    }
}
