package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۘٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5856e extends HorizontalScrollView implements InterfaceC12807e {

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public static final C17876e f12335e = new C17876e(16);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f12336e;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public ViewPager f12337e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final int f12338e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final int f12339e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final TextPaint f12340e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C10438e f12341e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final float f12342e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final int f12343e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public ColorStateList f12344e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public AbstractC2817e f12345e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public boolean f12346e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public int f12347e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final TextPaint f12348e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public C0407e f12349e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public ColorStateList f12350e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final int f12351e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public InterfaceC13146e f12352e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public ColorStateList f12353e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public C0288e f12354e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public final int f12355e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C18305e f12356e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final int f12357e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final int f12358e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final int f12359e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final int f12360e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final int f12361e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public int f12362e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public boolean f12363e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public int f12364e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public Drawable f12365e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public boolean f12366e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f12367e;

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public boolean f12368e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public int f12369e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final RectF f12370e;

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public final C16966e f12371e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final int f12372e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final ArrayList f12373e;

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public C9665e f12374e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Paint f12375e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public ValueAnimator f12376e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public C3875e f12377e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final ArrayList f12378e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Path f12379e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final float f12380e;

    public C5856e(Activity activity) {
        super(AbstractC14436e.purchase(activity, null, R.attr.tabStyle, R.style.Widget_Design_TabLayout), null, R.attr.tabStyle);
        Paint paint = new Paint(1);
        this.f12375e = paint;
        this.f12348e = new TextPaint(1);
        this.f12340e = new TextPaint(1);
        this.f12379e = new Path();
        this.f12378e = new ArrayList();
        this.f12370e = new RectF();
        this.f12369e = Alert.DURATION_SHOW_INDEFINITELY;
        this.f12373e = new ArrayList();
        this.f12371e = new C16966e(12);
        this.f12367e = (int) TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics());
        this.f12336e = (int) TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        setBackgroundColor(0);
        Context context = getContext();
        setHorizontalScrollBarEnabled(false);
        C10438e c10438e = new C10438e(this, context);
        this.f12341e = c10438e;
        super.addView(c10438e, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray purchase = AbstractC15787e.purchase(context, null, AbstractC11408e.f22940this, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C11252e c11252e = new C11252e();
            c11252e.advert(ColorStateList.valueOf(colorDrawable.getColor()));
            c11252e.adcel(context);
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            c11252e.mopub(getElevation());
            setBackground(c11252e);
        }
        int dimensionPixelSize = purchase.getDimensionPixelSize(11, -1);
        if (c10438e.f20616e != dimensionPixelSize) {
            c10438e.f20616e = dimensionPixelSize;
            WeakHashMap weakHashMap2 = AbstractC2016e.ad;
            c10438e.postInvalidateOnAnimation();
        }
        int color = purchase.getColor(8, 0);
        Paint paint2 = c10438e.f20611e;
        if (paint2.getColor() != color) {
            paint2.setColor(color);
            WeakHashMap weakHashMap3 = AbstractC2016e.ad;
            c10438e.postInvalidateOnAnimation();
        }
        setSelectedTabIndicator(AbstractC2774e.purchase(context, purchase, 5));
        setSelectedTabIndicatorGravity(purchase.getInt(10, 0));
        setTabIndicatorFullWidth(purchase.getBoolean(9, true));
        int dimensionPixelSize2 = purchase.getDimensionPixelSize(16, 0);
        this.f12343e = dimensionPixelSize2;
        this.f12338e = dimensionPixelSize2;
        this.f12339e = dimensionPixelSize2;
        this.f12359e = dimensionPixelSize2;
        this.f12359e = purchase.getDimensionPixelSize(19, dimensionPixelSize2);
        this.f12339e = purchase.getDimensionPixelSize(20, dimensionPixelSize2);
        this.f12338e = purchase.getDimensionPixelSize(18, dimensionPixelSize2);
        this.f12343e = purchase.getDimensionPixelSize(17, dimensionPixelSize2);
        int resourceId = purchase.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f12351e = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, AbstractC6062e.isVip);
        try {
            this.f12380e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f12353e = AbstractC2774e.license(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (purchase.hasValue(25)) {
                this.f12353e = AbstractC2774e.license(context, purchase, 25);
            }
            if (purchase.hasValue(23)) {
                this.f12353e = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{purchase.getColor(23, 0), this.f12353e.getDefaultColor()});
            }
            this.f12350e = AbstractC2774e.license(context, purchase, 3);
            AbstractC6286e.advert(purchase.getInt(4, -1), null);
            this.f12344e = AbstractC2774e.license(context, purchase, 21);
            this.f12355e = purchase.getInt(6, 300);
            this.f12372e = purchase.getDimensionPixelSize(14, -1);
            this.f12360e = purchase.getDimensionPixelSize(13, -1);
            this.f12361e = purchase.getResourceId(0, 0);
            this.f12358e = purchase.getDimensionPixelSize(1, 0);
            this.f12362e = purchase.getInt(15, 1);
            this.f12364e = purchase.getInt(2, 0);
            this.f12346e = purchase.getBoolean(12, false);
            this.f12363e = purchase.getBoolean(26, false);
            purchase.recycle();
            Resources resources = getResources();
            this.f12342e = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f12357e = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            vip();
            setSelectedTabIndicatorColor(0);
            setTabRippleColor(null);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f12378e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f12372e;
        if (i != -1) {
            return i;
        }
        int i2 = this.f12362e;
        if (i2 == 0 || i2 == 2) {
            return this.f12357e;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f12341e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        C10438e c10438e = this.f12341e;
        int childCount = c10438e.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = c10438e.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public final void ad(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            if (isLaidOut()) {
                C10438e c10438e = this.f12341e;
                int childCount = c10438e.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (c10438e.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int metrica = metrica(i, 0.0f);
                if (scrollX != metrica) {
                    license();
                    this.f12376e.setIntValues(scrollX, metrica);
                    this.f12376e.start();
                }
                ValueAnimator valueAnimator = c10438e.f20617e;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c10438e.f20617e.cancel();
                }
                c10438e.license(i, this.f12355e, true);
                return;
            }
        }
        yandex(i, 0.0f, true, true);
    }

    public final void adcel(boolean z) {
        int i = 0;
        while (true) {
            C10438e c10438e = this.f12341e;
            if (i >= c10438e.getChildCount()) {
                return;
            }
            View childAt = c10438e.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f12362e == 1 && this.f12364e == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [eۖۤ, java.lang.Object] */
    public final void appmetrica() {
        C16966e c16966e;
        C18305e c18305e;
        C17876e c17876e;
        int currentItem;
        C10438e c10438e = this.f12341e;
        int childCount = c10438e.getChildCount() - 1;
        while (true) {
            c16966e = this.f12371e;
            c18305e = null;
            if (childCount < 0) {
                break;
            }
            C13495e c13495e = (C13495e) c10438e.getChildAt(childCount);
            c10438e.removeViewAt(childCount);
            if (c13495e != null) {
                c13495e.setTab(null);
                c13495e.setSelected(false);
                c16966e.metrica(c13495e);
            }
            requestLayout();
            childCount--;
        }
        ArrayList arrayList = this.f12378e;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c17876e = f12335e;
            if (!hasNext) {
                break;
            }
            C18305e c18305e2 = (C18305e) it.next();
            it.remove();
            c18305e2.license = null;
            c18305e2.appmetrica = null;
            c18305e2.ad = null;
            c18305e2.vip = -1;
            c18305e2.metrica = null;
            c17876e.metrica(c18305e2);
        }
        this.f12356e = null;
        AbstractC2817e abstractC2817e = this.f12345e;
        if (abstractC2817e != null) {
            int vip = abstractC2817e.vip();
            for (int i = 0; i < vip; i++) {
                C18305e c18305e3 = (C18305e) c17876e.ad();
                C18305e c18305e4 = c18305e3;
                if (c18305e3 == null) {
                    ?? obj = new Object();
                    obj.vip = -1;
                    c18305e4 = obj;
                }
                c18305e4.license = this;
                C13495e c13495e2 = c16966e != null ? (C13495e) c16966e.ad() : null;
                if (c13495e2 == null) {
                    c13495e2 = new C13495e(this, getContext());
                }
                c13495e2.setTab(c18305e4);
                c13495e2.setFocusable(true);
                c13495e2.setMinimumWidth(getTabMinWidth());
                if (TextUtils.isEmpty(null)) {
                    c13495e2.setContentDescription(c18305e4.ad);
                } else {
                    c13495e2.setContentDescription(null);
                }
                c18305e4.appmetrica = c13495e2;
                CharSequence metrica = this.f12345e.metrica(i);
                if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(metrica)) {
                    c18305e4.appmetrica.setContentDescription(metrica);
                }
                c18305e4.ad = metrica;
                C13495e c13495e3 = c18305e4.appmetrica;
                if (c13495e3 != null) {
                    c13495e3.appmetrica();
                }
                int size = arrayList.size();
                if (c18305e4.license != this) {
                    throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
                }
                c18305e4.vip = size;
                arrayList.add(size, c18305e4);
                int size2 = arrayList.size();
                for (int i2 = size + 1; i2 < size2; i2++) {
                    ((C18305e) arrayList.get(i2)).vip = i2;
                }
                C13495e c13495e4 = c18305e4.appmetrica;
                c13495e4.setSelected(false);
                c13495e4.setActivated(false);
                int i3 = c18305e4.vip;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (this.f12362e == 1 && this.f12364e == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                c10438e.addView(c13495e4, i3, layoutParams);
            }
            ViewPager viewPager = this.f12337e;
            if (viewPager == null || vip <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            if (currentItem >= 0 && currentItem < getTabCount()) {
                c18305e = (C18305e) arrayList.get(currentItem);
            }
            purchase(c18305e, true);
        }
    }

    public final void billing(AbstractC2817e abstractC2817e, boolean z) {
        C0288e c0288e;
        AbstractC2817e abstractC2817e2 = this.f12345e;
        if (abstractC2817e2 != null && (c0288e = this.f12354e) != null) {
            abstractC2817e2.ad.unregisterObserver(c0288e);
        }
        this.f12345e = abstractC2817e;
        if (z && abstractC2817e != null) {
            if (this.f12354e == null) {
                this.f12354e = new C0288e(0, this);
            }
            abstractC2817e.ad.registerObserver(this.f12354e);
        }
        appmetrica();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C18305e c18305e = this.f12356e;
        if (c18305e != null) {
            return c18305e.vip;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f12378e.size();
    }

    public int getTabGravity() {
        return this.f12364e;
    }

    public ColorStateList getTabIconTint() {
        return this.f12350e;
    }

    public int getTabIndicatorGravity() {
        return this.f12347e;
    }

    public int getTabMaxWidth() {
        return this.f12369e;
    }

    public int getTabMode() {
        return this.f12362e;
    }

    public ColorStateList getTabRippleColor() {
        return this.f12344e;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f12365e;
    }

    public ColorStateList getTabTextColors() {
        return this.f12353e;
    }

    public final void license() {
        if (this.f12376e == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f12376e = valueAnimator;
            valueAnimator.setInterpolator(AbstractC16664e.vip);
            this.f12376e.setDuration(this.f12355e);
            this.f12376e.addUpdateListener(new C9008e(0, this));
        }
    }

    public final int metrica(int i, float f) {
        int i2 = this.f12362e;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        C10438e c10438e = this.f12341e;
        View childAt = c10438e.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < c10438e.getChildCount() ? c10438e.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC7754e.yandex(this);
        if (this.f12337e == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                startapp((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f12368e) {
            setupWithViewPager(null);
            this.f12368e = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C13495e c13495e;
        Drawable drawable;
        int i = 0;
        while (true) {
            C10438e c10438e = this.f12341e;
            if (i >= c10438e.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = c10438e.getChildAt(i);
            if ((childAt instanceof C13495e) && (drawable = (c13495e = (C13495e) childAt).f26769e) != null) {
                drawable.setBounds(c13495e.getLeft(), c13495e.getTop(), c13495e.getRight(), c13495e.getBottom());
                c13495e.f26769e.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C6594e.m2213finally(1, getTabCount(), 1).f13613e);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int round = Math.round(AbstractC6286e.vip(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.f12360e;
            if (i3 <= 0) {
                i3 = (int) (size - AbstractC6286e.vip(getContext(), 56));
            }
            this.f12369e = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.f12362e;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    public final void purchase(C18305e c18305e, boolean z) {
        C18305e c18305e2 = this.f12356e;
        ArrayList arrayList = this.f12373e;
        if (c18305e2 == c18305e) {
            if (c18305e2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((InterfaceC13146e) arrayList.get(size)).getClass();
                }
                ad(c18305e.vip);
                return;
            }
            return;
        }
        int i = c18305e != null ? c18305e.vip : -1;
        if (z) {
            if ((c18305e2 == null || c18305e2.vip == -1) && i != -1) {
                yandex(i, 0.0f, true, true);
            } else {
                ad(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.f12356e = c18305e;
        if (c18305e2 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC13146e) arrayList.get(size2)).getClass();
            }
        }
        if (c18305e != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((C3875e) ((InterfaceC13146e) arrayList.get(size3))).ad.setCurrentItem(c18305e.vip);
            }
        }
    }

    @Override // defpackage.InterfaceC12807e
    public final void refreshTheme() {
        this.f12375e.setColor(AbstractC15933e.ad(R.attr.global_accent));
        int ad = AbstractC15933e.ad(R.attr.text_primary);
        TextPaint textPaint = this.f12348e;
        textPaint.setColor(ad);
        int startapp = AbstractC3898e.startapp(ad, 85);
        TextPaint textPaint2 = this.f12340e;
        textPaint2.setColor(startapp);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textPaint.setTypeface(typeface);
        textPaint2.setTypeface(typeface);
        textPaint2.setTextSize(TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
        textPaint.setTextSize(TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        AbstractC7754e.purchase(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f12346e == z) {
            return;
        }
        this.f12346e = z;
        int i = 0;
        while (true) {
            C10438e c10438e = this.f12341e;
            if (i >= c10438e.getChildCount()) {
                vip();
                return;
            }
            View childAt = c10438e.getChildAt(i);
            if (childAt instanceof C13495e) {
                C13495e c13495e = (C13495e) childAt;
                c13495e.setOrientation(!c13495e.f26767e.f12346e ? 1 : 0);
                TextView textView = c13495e.f26771e;
                if (textView == null && c13495e.f26766e == null) {
                    c13495e.billing(c13495e.f26765e, c13495e.f26763e);
                } else {
                    c13495e.billing(textView, c13495e.f26766e);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC13146e interfaceC13146e) {
        InterfaceC13146e interfaceC13146e2 = this.f12352e;
        ArrayList arrayList = this.f12373e;
        if (interfaceC13146e2 != null) {
            arrayList.remove(interfaceC13146e2);
        }
        this.f12352e = interfaceC13146e;
        if (interfaceC13146e == null || arrayList.contains(interfaceC13146e)) {
            return;
        }
        arrayList.add(interfaceC13146e);
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC14372e interfaceC14372e) {
        setOnTabSelectedListener((InterfaceC13146e) interfaceC14372e);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        license();
        this.f12376e.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(AbstractC4628e.purchase(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f12365e != drawable) {
            this.f12365e = drawable;
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            this.f12341e.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        C10438e c10438e = this.f12341e;
        Paint paint = c10438e.f20611e;
        if (paint.getColor() != i) {
            paint.setColor(i);
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            c10438e.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f12347e != i) {
            this.f12347e = i;
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            this.f12341e.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        C10438e c10438e = this.f12341e;
        if (c10438e.f20616e != i) {
            c10438e.f20616e = i;
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            c10438e.postInvalidateOnAnimation();
        }
    }

    public void setTabGravity(int i) {
        if (this.f12364e != i) {
            this.f12364e = i;
            vip();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f12350e != colorStateList) {
            this.f12350e = colorStateList;
            ArrayList arrayList = this.f12378e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C13495e c13495e = ((C18305e) arrayList.get(i)).appmetrica;
                if (c13495e != null) {
                    c13495e.appmetrica();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(AbstractC10077e.amazon(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f12366e = z;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        this.f12341e.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.f12362e) {
            this.f12362e = i;
            vip();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f12344e == colorStateList) {
            return;
        }
        this.f12344e = colorStateList;
        int i = 0;
        while (true) {
            C10438e c10438e = this.f12341e;
            if (i >= c10438e.getChildCount()) {
                return;
            }
            View childAt = c10438e.getChildAt(i);
            if (childAt instanceof C13495e) {
                Context context = getContext();
                int i2 = C13495e.f26761e;
                ((C13495e) childAt).purchase(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(AbstractC10077e.amazon(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f12353e != colorStateList) {
            this.f12353e = colorStateList;
            ArrayList arrayList = this.f12378e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C13495e c13495e = ((C18305e) arrayList.get(i)).appmetrica;
                if (c13495e != null) {
                    c13495e.appmetrica();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC2817e abstractC2817e) {
        billing(abstractC2817e, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f12363e == z) {
            return;
        }
        this.f12363e = z;
        int i = 0;
        while (true) {
            C10438e c10438e = this.f12341e;
            if (i >= c10438e.getChildCount()) {
                return;
            }
            View childAt = c10438e.getChildAt(i);
            if (childAt instanceof C13495e) {
                Context context = getContext();
                int i2 = C13495e.f26761e;
                ((C13495e) childAt).purchase(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        startapp(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void startapp(ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.f12337e;
        if (viewPager2 != null) {
            C0407e c0407e = this.f12349e;
            if (c0407e != null) {
                viewPager2.removeOnPageChangeListener(c0407e);
            }
            C9665e c9665e = this.f12374e;
            if (c9665e != null) {
                this.f12337e.removeOnAdapterChangeListener(c9665e);
            }
        }
        C3875e c3875e = this.f12377e;
        ArrayList arrayList = this.f12373e;
        if (c3875e != null) {
            arrayList.remove(c3875e);
            this.f12377e = null;
        }
        if (viewPager != null) {
            this.f12337e = viewPager;
            if (this.f12349e == null) {
                this.f12349e = new C0407e(this);
            }
            C0407e c0407e2 = this.f12349e;
            c0407e2.license = 0;
            c0407e2.metrica = 0;
            viewPager.addOnPageChangeListener(c0407e2);
            C3875e c3875e2 = new C3875e(viewPager);
            this.f12377e = c3875e2;
            if (!arrayList.contains(c3875e2)) {
                arrayList.add(c3875e2);
            }
            AbstractC2817e adapter = viewPager.getAdapter();
            if (adapter != null) {
                billing(adapter, true);
            }
            if (this.f12374e == null) {
                this.f12374e = new C9665e(this, 0);
            }
            C9665e c9665e2 = this.f12374e;
            c9665e2.vip = true;
            viewPager.addOnAdapterChangeListener(c9665e2);
            yandex(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f12337e = null;
            billing(null, false);
        }
        this.f12368e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip() {
        /*
            r5 = this;
            int r0 = r5.f12362e
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r5.f12358e
            int r3 = r5.f12359e
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap r3 = defpackage.AbstractC2016e.ad
            eَٟۧ r3 = r5.f12341e
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r5.f12362e
            java.lang.String r2 = "TabLayout"
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 == r4) goto L27
            if (r0 == r1) goto L27
            goto L4c
        L27:
            int r0 = r5.f12364e
            if (r0 != r1) goto L30
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L30:
            r3.setGravity(r4)
            goto L4c
        L34:
            int r0 = r5.f12364e
            if (r0 == 0) goto L41
            if (r0 == r4) goto L3d
            if (r0 == r1) goto L46
            goto L4c
        L3d:
            r3.setGravity(r4)
            goto L4c
        L41:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L46:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L4c:
            r5.adcel(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5856e.vip():void");
    }

    public final void yandex(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round >= 0) {
            C10438e c10438e = this.f12341e;
            if (round >= c10438e.getChildCount()) {
                return;
            }
            if (z2) {
                ValueAnimator valueAnimator = c10438e.f20617e;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c10438e.f20617e.cancel();
                }
                c10438e.f20609e = i;
                c10438e.f20614e = f;
                c10438e.metrica();
            }
            ValueAnimator valueAnimator2 = this.f12376e;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f12376e.cancel();
            }
            scrollTo(metrica(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }
}
