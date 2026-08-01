package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C6878e extends SeekBar {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5078e f14122e;

    public C6878e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC17382e.ad(this, getContext());
        C5078e c5078e = new C5078e(this);
        this.f14122e = c5078e;
        c5078e.mo1733catch(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5078e c5078e = this.f14122e;
        C6878e c6878e = c5078e.f10913e;
        Drawable drawable = c5078e.f10910e;
        if (drawable != null && drawable.isStateful() && drawable.setState(c6878e.getDrawableState())) {
            c6878e.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14122e.f10910e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f14122e.m1734else(canvas);
    }
}
