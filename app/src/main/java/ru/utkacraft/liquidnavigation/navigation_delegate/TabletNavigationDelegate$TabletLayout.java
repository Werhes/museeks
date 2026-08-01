package ru.utkacraft.liquidnavigation.navigation_delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import defpackage.AbstractC17211e;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public final class TabletNavigationDelegate$TabletLayout extends ViewGroup {
    @Keep
    public TabletNavigationDelegate$TabletLayout(AbstractC17211e abstractC17211e, Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() != 2) {
            return;
        }
        getChildAt(0);
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (getChildCount() != 2) {
            return;
        }
        getChildAt(0);
        throw null;
    }
}
