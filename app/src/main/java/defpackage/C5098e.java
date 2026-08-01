package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5098e extends C13272e {
    @Override // defpackage.C13272e, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (AbstractC9476e.amazon(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC11408e.applovin);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = AbstractC2774e.appmetrica(context2, obtainStyledAttributes, iArr[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (i2 >= 0) {
                setLineHeight(i2);
            }
        }
    }
}
