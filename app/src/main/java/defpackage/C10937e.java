package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10937e extends LinearLayout {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final /* synthetic */ int f21658e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C2032e f21659e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public ImageView f21660e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f21661e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public TextView f21662e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public ImageView f21663e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ TabLayout f21664e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public View f21665e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Drawable f21666e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C8811e f21667e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public TextView f21668e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public View f21669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10937e(TabLayout tabLayout, Context context) {
        super(context);
        this.f21664e = tabLayout;
        this.f21661e = 2;
        appmetrica(context);
        int i = tabLayout.f906e;
        int i2 = tabLayout.f950e;
        int i3 = tabLayout.f949e;
        int i4 = tabLayout.f926e;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!tabLayout.f925e ? 1 : 0);
        setClickable(true);
        int i5 = 19;
        AbstractC2016e.admob(this, Build.VERSION.SDK_INT >= 24 ? new C17974e(i5, AbstractC12026e.amazon(getContext())) : new C17974e(i5, (Object) null));
    }

    private C2032e getBadge() {
        return this.f21659e;
    }

    private C2032e getOrCreateBadge() {
        if (this.f21659e == null) {
            this.f21659e = new C2032e(getContext());
        }
        vip();
        C2032e c2032e = this.f21659e;
        if (c2032e != null) {
            return c2032e;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void ad() {
        if (this.f21659e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f21665e;
            if (view != null) {
                C2032e c2032e = this.f21659e;
                if (c2032e != null) {
                    if (c2032e.license() != null) {
                        c2032e.license().setForeground(null);
                    } else {
                        view.getOverlay().remove(c2032e);
                    }
                }
                this.f21665e = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [eُُٔ, android.view.View] */
    public final void appmetrica(Context context) {
        TabLayout tabLayout = this.f21664e;
        int i = tabLayout.f935e;
        if (i != 0) {
            Drawable purchase = AbstractC4628e.purchase(context, i);
            this.f21666e = purchase;
            if (purchase != null && purchase.isStateful()) {
                this.f21666e.setState(getDrawableState());
            }
        } else {
            this.f21666e = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.f913e != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList ad = AbstractC16058e.ad(tabLayout.f913e);
            boolean z = tabLayout.f936e;
            if (z) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(ad, gradientDrawable, z ? null : gradientDrawable2);
        }
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        setBackground(gradientDrawable);
        tabLayout.invalidate();
    }

    public final void billing(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        C8811e c8811e = this.f21667e;
        CharSequence charSequence = c8811e != null ? c8811e.ad : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (isEmpty) {
                z2 = false;
            } else {
                this.f21667e.getClass();
                z2 = true;
            }
            textView.setText(!isEmpty ? charSequence : null);
            textView.setVisibility(z2 ? 0 : 8);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int vip = (z2 && imageView.getVisibility() == 0) ? (int) AbstractC6286e.vip(getContext(), 8) : 0;
            if (this.f21664e.f925e) {
                if (vip != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(vip);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (vip != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = vip;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        if (Build.VERSION.SDK_INT > 23) {
            AbstractC1284e.billing(this, isEmpty ? null : charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f21666e;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f21666e.setState(drawableState)) {
            invalidate();
            this.f21664e.invalidate();
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.f21662e, this.f21660e, this.f21669e};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return i - i2;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f21662e, this.f21660e, this.f21669e};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                i = z ? Math.max(i, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return i - i2;
    }

    public C8811e getTab() {
        return this.f21667e;
    }

    public final void license() {
        boolean z;
        purchase();
        C8811e c8811e = this.f21667e;
        if (c8811e != null) {
            TabLayout tabLayout = c8811e.license;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == c8811e.vip) {
                z = true;
                setSelected(z);
            }
        }
        z = false;
        setSelected(z);
    }

    public final void metrica(View view) {
        C2032e c2032e = this.f21659e;
        if (c2032e == null || view != this.f21665e) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c2032e.setBounds(rect);
        c2032e.startapp(view, null);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C2032e c2032e = this.f21659e;
        if (c2032e != null && c2032e.isVisible()) {
            accessibilityNodeInfo.setContentDescription(this.f21659e.metrica());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C5216e.ad(isSelected(), 0, 1, this.f21667e.vip, 1).ad);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C3614e.appmetrica.ad);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.f21664e;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.f951e, RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i2);
        if (this.f21662e != null) {
            float f = tabLayout.f920e;
            int i3 = this.f21661e;
            ImageView imageView = this.f21660e;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f21662e;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.f914e;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.f21662e.getTextSize();
            int lineCount = this.f21662e.getLineCount();
            int maxLines = this.f21662e.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.f934e == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.f21662e.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f21662e.setTextSize(0, f);
                this.f21662e.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f21667e == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        C8811e c8811e = this.f21667e;
        TabLayout tabLayout = c8811e.license;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.purchase(c8811e, true);
        return true;
    }

    public final void purchase() {
        int i;
        ViewParent parent;
        C8811e c8811e = this.f21667e;
        View view = c8811e != null ? c8811e.metrica : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f21669e;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f21669e);
                }
                addView(view);
            }
            this.f21669e = view;
            TextView textView = this.f21662e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f21660e;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f21660e.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
            this.f21668e = textView2;
            if (textView2 != null) {
                this.f21661e = textView2.getMaxLines();
            }
            this.f21663e = (ImageView) view.findViewById(android.R.id.icon);
        } else {
            View view3 = this.f21669e;
            if (view3 != null) {
                removeView(view3);
                this.f21669e = null;
            }
            this.f21668e = null;
            this.f21663e = null;
        }
        if (this.f21669e == null) {
            if (this.f21660e == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f21660e = imageView2;
                addView(imageView2, 0);
            }
            if (this.f21662e == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f21662e = textView3;
                addView(textView3);
                this.f21661e = this.f21662e.getMaxLines();
            }
            TextView textView4 = this.f21662e;
            TabLayout tabLayout = this.f21664e;
            textView4.setTextAppearance(tabLayout.f941e);
            if (!isSelected() || (i = tabLayout.f929e) == -1) {
                this.f21662e.setTextAppearance(tabLayout.f911e);
            } else {
                this.f21662e.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.f909e;
            if (colorStateList != null) {
                this.f21662e.setTextColor(colorStateList);
            }
            billing(this.f21662e, this.f21660e, true);
            vip();
            ImageView imageView3 = this.f21660e;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC10917e(this, imageView3, 1));
            }
            TextView textView5 = this.f21662e;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC10917e(this, textView5, 1));
            }
        } else {
            TextView textView6 = this.f21668e;
            if (textView6 != null || this.f21663e != null) {
                billing(textView6, this.f21663e, false);
            }
        }
        if (c8811e == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.f21662e;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f21660e;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f21669e;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C8811e c8811e) {
        if (c8811e != this.f21667e) {
            this.f21667e = c8811e;
            license();
        }
    }

    public final void vip() {
        if (this.f21659e != null) {
            if (this.f21669e != null) {
                ad();
                return;
            }
            TextView textView = this.f21662e;
            if (textView == null || this.f21667e == null) {
                ad();
                return;
            }
            if (this.f21665e == textView) {
                metrica(textView);
                return;
            }
            ad();
            TextView textView2 = this.f21662e;
            if (this.f21659e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            C2032e c2032e = this.f21659e;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            c2032e.setBounds(rect);
            c2032e.startapp(textView2, null);
            if (c2032e.license() != null) {
                c2032e.license().setForeground(c2032e);
            } else {
                textView2.getOverlay().add(c2032e);
            }
            this.f21665e = textView2;
        }
    }
}
