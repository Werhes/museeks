package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۢؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2931e extends AppCompatImageView implements InterfaceC13064e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C13631e f6919e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2931e(C13631e c13631e, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f6919e = c13631e;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC1284e.billing(this, getContentDescription());
        setOnTouchListener(new C8785e(this, this));
    }

    @Override // defpackage.InterfaceC13064e
    public final boolean ad() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f6919e.advert();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }

    @Override // defpackage.InterfaceC13064e
    public final boolean vip() {
        return false;
    }
}
