package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۚٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9737e extends AbstractC6238e {
    public final int ad;
    public final boolean vip;

    public C9737e(int i, boolean z) {
        this.ad = i;
        this.vip = z;
    }

    @Override // defpackage.AbstractC6238e
    public final void license(Rect rect, View view, RecyclerView recyclerView) {
        int billing = recyclerView.getAdapter().billing() - 1;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.ad;
        rect.left = childAdapterPosition == 0 ? i : 0;
        if (childAdapterPosition != billing && !this.vip) {
            i /= 2;
        }
        rect.right = i;
    }
}
