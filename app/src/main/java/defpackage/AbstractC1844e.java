package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1844e extends AbstractC0268e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f4936e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f4937e;

    public abstract void adcel(C4955e c4955e, int i, int i2);

    @Override // defpackage.AbstractC0268e
    public final void appmetrica(ConstraintLayout constraintLayout) {
        license(constraintLayout);
    }

    @Override // defpackage.AbstractC0268e
    public void billing(AttributeSet attributeSet) {
        super.billing(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC15320e.vip);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f4936e = true;
                } else if (index == 22) {
                    this.f4937e = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.AbstractC0268e, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4936e || this.f4937e) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f2261e; i++) {
                    View view = (View) constraintLayout.f361e.get(this.f2263e[i]);
                    if (view != null) {
                        if (this.f4936e) {
                            view.setVisibility(visibility);
                        }
                        if (this.f4937e && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        license((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        license((ConstraintLayout) parent);
    }
}
