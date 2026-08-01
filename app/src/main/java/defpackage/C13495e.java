package defpackage;

import android.R;
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
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13495e extends LinearLayout {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final /* synthetic */ int f26761e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C2032e f26762e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public ImageView f26763e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f26764e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public TextView f26765e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public ImageView f26766e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C5856e f26767e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public View f26768e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Drawable f26769e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C18305e f26770e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public TextView f26771e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public View f26772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13495e(C5856e c5856e, Context context) {
        super(context);
        this.f26767e = c5856e;
        this.f26764e = 2;
        purchase(context);
        int i = c5856e.f12359e;
        int i2 = c5856e.f12339e;
        int i3 = c5856e.f12338e;
        int i4 = c5856e.f12343e;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!c5856e.f12346e ? 1 : 0);
        setClickable(true);
        int i5 = 19;
        AbstractC2016e.admob(this, Build.VERSION.SDK_INT >= 24 ? new C17974e(i5, AbstractC12026e.amazon(getContext())) : new C17974e(i5, (Object) null));
    }

    private C2032e getBadge() {
        return this.f26762e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getContentWidth() {
        View[] viewArr = {this.f26765e, this.f26763e, this.f26772e};
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

    private C2032e getOrCreateBadge() {
        if (this.f26762e == null) {
            this.f26762e = new C2032e(getContext());
        }
        metrica();
        C2032e c2032e = this.f26762e;
        if (c2032e != null) {
            return c2032e;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void appmetrica() {
        C18305e c18305e = this.f26770e;
        View view = c18305e != null ? c18305e.metrica : null;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.f26772e = view;
            TextView textView = this.f26765e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f26763e;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f26763e.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f26771e = textView2;
            if (textView2 != null) {
                this.f26764e = textView2.getMaxLines();
            }
            this.f26766e = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view2 = this.f26772e;
            if (view2 != null) {
                removeView(view2);
                this.f26772e = null;
            }
            this.f26771e = null;
            this.f26766e = null;
        }
        boolean z = false;
        if (this.f26772e == null) {
            if (this.f26763e == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(ua.itaysonlab.vkx.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f26763e = imageView2;
                addView(imageView2, 0);
            }
            if (this.f26765e == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(ua.itaysonlab.vkx.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f26765e = textView3;
                addView(textView3);
                this.f26764e = this.f26765e.getMaxLines();
            }
            TextView textView4 = this.f26765e;
            C5856e c5856e = this.f26767e;
            textView4.setTextAppearance(c5856e.f12351e);
            ColorStateList colorStateList = c5856e.f12353e;
            if (colorStateList != null) {
                this.f26765e.setTextColor(colorStateList);
            }
            billing(this.f26765e, this.f26763e);
            metrica();
            ImageView imageView3 = this.f26763e;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC10917e(this, imageView3, 0));
            }
            TextView textView5 = this.f26765e;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC10917e(this, textView5, 0));
            }
        } else {
            TextView textView6 = this.f26771e;
            if (textView6 != null || this.f26766e != null) {
                billing(textView6, this.f26766e);
            }
        }
        if (c18305e != null && !TextUtils.isEmpty(null)) {
            setContentDescription(null);
        }
        if (c18305e != null) {
            C5856e c5856e2 = c18305e.license;
            if (c5856e2 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            if (c5856e2.getSelectedTabPosition() == c18305e.vip) {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void billing(TextView textView, ImageView imageView) {
        C18305e c18305e = this.f26770e;
        CharSequence charSequence = c18305e != null ? c18305e.ad : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (isEmpty) {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            } else {
                textView.setText(charSequence);
                this.f26770e.getClass();
                textView.setVisibility(0);
                setVisibility(0);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int vip = (isEmpty || imageView.getVisibility() != 0) ? 0 : (int) AbstractC6286e.vip(getContext(), 8);
            if (this.f26767e.f12346e) {
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
        AbstractC1284e.billing(this, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f26769e;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f26769e.setState(drawableState)) {
            invalidate();
            this.f26767e.invalidate();
        }
    }

    public C18305e getTab() {
        return this.f26770e;
    }

    public final void license(View view) {
        C2032e c2032e = this.f26762e;
        if (c2032e == null || view != this.f26768e) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c2032e.setBounds(rect);
        c2032e.startapp(view, null);
    }

    public final void metrica() {
        if (this.f26762e != null) {
            if (this.f26772e != null) {
                vip();
                return;
            }
            TextView textView = this.f26765e;
            if (textView == null || this.f26770e == null) {
                vip();
                return;
            }
            if (this.f26768e == textView) {
                license(textView);
                return;
            }
            vip();
            TextView textView2 = this.f26765e;
            if (this.f26762e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            C2032e c2032e = this.f26762e;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            c2032e.setBounds(rect);
            c2032e.startapp(textView2, null);
            if (c2032e.license() != null) {
                c2032e.license().setForeground(c2032e);
            } else {
                textView2.getOverlay().add(c2032e);
            }
            this.f26768e = textView2;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C2032e c2032e = this.f26762e;
        if (c2032e != null && c2032e.isVisible()) {
            accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f26762e.metrica()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C5216e.ad(isSelected(), 0, 1, this.f26770e.vip, 1).ad);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C3614e.appmetrica.ad);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", "Tab");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        C5856e c5856e = this.f26767e;
        int tabMaxWidth = c5856e.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(c5856e.f12369e, RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i2);
        if (this.f26765e != null) {
            float f = c5856e.f12380e;
            int i3 = this.f26764e;
            ImageView imageView = this.f26763e;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f26765e;
                if (textView != null && textView.getLineCount() > 1) {
                    f = c5856e.f12342e;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.f26765e.getTextSize();
            int lineCount = this.f26765e.getLineCount();
            int maxLines = this.f26765e.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (c5856e.f12362e == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.f26765e.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f26765e.setTextSize(0, f);
                this.f26765e.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f26770e == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        C18305e c18305e = this.f26770e;
        C5856e c5856e = c18305e.license;
        if (c5856e == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        c5856e.purchase(c18305e, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, eْۚۗ] */
    public final void purchase(Context context) {
        C5856e c5856e = this.f26767e;
        int i = c5856e.f12361e;
        if (i != 0) {
            Drawable purchase = AbstractC4628e.purchase(context, i);
            this.f26769e = purchase;
            if (purchase != null && purchase.isStateful()) {
                this.f26769e.setState(getDrawableState());
            }
        } else {
            this.f26769e = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (c5856e.f12344e != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList ad = AbstractC16058e.ad(c5856e.f12344e);
            boolean z = c5856e.f12363e;
            if (z) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(ad, gradientDrawable, z ? null : gradientDrawable2);
        }
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        setBackground(gradientDrawable);
        c5856e.invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.f26765e;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f26763e;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f26772e;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C18305e c18305e) {
        if (c18305e != this.f26770e) {
            this.f26770e = c18305e;
            appmetrica();
        }
    }

    public final void vip() {
        if (this.f26762e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f26768e;
            if (view != null) {
                C2032e c2032e = this.f26762e;
                if (c2032e != null) {
                    if (c2032e.license() != null) {
                        c2032e.license().setForeground(null);
                    } else {
                        view.getOverlay().remove(c2032e);
                    }
                }
                this.f26768e = null;
            }
        }
    }
}
