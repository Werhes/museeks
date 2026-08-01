package ru.utkacraft.liquidnavigation.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RadioButton;
import defpackage.AbstractC15933e;
import defpackage.InterfaceC12807e;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class NoTouchRadioButton extends RadioButton implements InterfaceC12807e {
    public NoTouchRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.InterfaceC12807e
    public final void refreshTheme() {
        setButtonTintList(ColorStateList.valueOf(AbstractC15933e.ad(R.attr.colorAccent)));
    }
}
