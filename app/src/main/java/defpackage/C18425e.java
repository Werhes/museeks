package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18425e extends LinearLayout {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ int f36123e = 0;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ TabLayout f36124e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public ValueAnimator f36125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18425e(TabLayout tabLayout, Context context) {
        super(context);
        this.f36124e = tabLayout;
        setWillNotDraw(false);
    }

    public final void ad(int i) {
        TabLayout tabLayout = this.f36124e;
        if (tabLayout.f952e == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i);
            C10068e c10068e = tabLayout.f933e;
            Drawable drawable = tabLayout.f921e;
            c10068e.getClass();
            RectF license = C10068e.license(tabLayout, childAt);
            drawable.setBounds((int) license.left, drawable.getBounds().top, (int) license.right, drawable.getBounds().bottom);
            tabLayout.f946e = i;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f36124e;
        int height2 = tabLayout.f921e.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.f921e.getIntrinsicHeight();
        }
        int i = tabLayout.f928e;
        if (i == 0) {
            height = getHeight() - height2;
            height2 = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                height2 = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - height2) / 2;
            height2 = (getHeight() + height2) / 2;
        }
        if (tabLayout.f921e.getBounds().width() > 0) {
            Rect bounds = tabLayout.f921e.getBounds();
            tabLayout.f921e.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.f921e.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void license(int i, int i2, boolean z) {
        TabLayout tabLayout = this.f36124e;
        if (tabLayout.f946e == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            ad(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f946e = i;
        C14064e c14064e = new C14064e(this, childAt, childAt2);
        if (!z) {
            this.f36125e.removeAllUpdateListeners();
            this.f36125e.addUpdateListener(c14064e);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f36125e = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.f922e);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(c14064e);
        valueAnimator.start();
    }

    public final void metrica(View view, View view2, float f) {
        TabLayout tabLayout = this.f36124e;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f921e;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f921e.getBounds().bottom);
        } else {
            tabLayout.f933e.billing(tabLayout, view, view2, f, tabLayout.f921e);
        }
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        postInvalidateOnAnimation();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f36125e;
        TabLayout tabLayout = this.f36124e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            license(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f946e == -1) {
            tabLayout.f946e = tabLayout.getSelectedTabPosition();
        }
        ad(tabLayout.f946e);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f36124e;
        boolean z = true;
        if (tabLayout.f930e == 1 || tabLayout.f934e == 2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (((int) AbstractC6286e.vip(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i3;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                tabLayout.f930e = 0;
                tabLayout.adcel(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }

    public final void vip(int i) {
        TabLayout tabLayout = this.f36124e;
        Rect bounds = tabLayout.f921e.getBounds();
        tabLayout.f921e.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }
}
