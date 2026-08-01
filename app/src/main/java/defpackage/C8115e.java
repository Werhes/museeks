package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8115e extends C10792e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C14271e f16472e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public ColorStateList f16473e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public ColorStateList f16474e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f16475e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f16476e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final float f16477e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Rect f16478e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AccessibilityManager f16479e;

    public C8115e(Context context, AttributeSet attributeSet) {
        super(AbstractC14436e.purchase(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f16478e = new Rect();
        Context context2 = getContext();
        TypedArray purchase = AbstractC15787e.purchase(context2, attributeSet, AbstractC11408e.admob, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (purchase.hasValue(0) && purchase.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f16475e = purchase.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f16477e = purchase.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (purchase.hasValue(2)) {
            this.f16474e = ColorStateList.valueOf(purchase.getColor(2, 0));
        }
        this.f16476e = purchase.getColor(4, 0);
        this.f16473e = AbstractC2774e.license(context2, purchase, 5);
        this.f16479e = (AccessibilityManager) context2.getSystemService("accessibility");
        C14271e c14271e = new C14271e(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f16472e = c14271e;
        c14271e.f28229e = true;
        c14271e.f28227e.setFocusable(true);
        c14271e.f28224e = this;
        c14271e.f28227e.setInputMethodMode(2);
        c14271e.Signature(getAdapter());
        c14271e.f28225e = new C5813e(1, this);
        if (purchase.hasValue(6)) {
            setSimpleItems(purchase.getResourceId(6, 0));
        }
        purchase.recycle();
    }

    public static void ad(C8115e c8115e, Object obj) {
        c8115e.setText(c8115e.convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (metrica()) {
            this.f16472e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f16474e;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout vip = vip();
        return (vip == null || !vip.f1000e) ? super.getHint() : vip.getHint();
    }

    public float getPopupElevation() {
        return this.f16477e;
    }

    public int getSimpleItemSelectedColor() {
        return this.f16476e;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f16473e;
    }

    public final boolean metrica() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f16479e;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout vip = vip();
        if (vip != null && vip.f1000e && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : BuildConfig.FLAVOR).equals("meizu")) {
                setHint(BuildConfig.FLAVOR);
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16472e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout vip = vip();
            int i3 = 0;
            if (adapter != null && vip != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C14271e c14271e = this.f16472e;
                int min = Math.min(adapter.getCount(), Math.max(0, !c14271e.f28227e.isShowing() ? -1 : c14271e.f28217e.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, vip);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = c14271e.f28227e.getBackground();
                if (background != null) {
                    Rect rect = this.f16478e;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = vip.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (metrica()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f16472e.Signature(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C14271e c14271e = this.f16472e;
        if (c14271e != null) {
            c14271e.startapp(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f16474e = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C11252e) {
            ((C11252e) dropDownBackground).advert(this.f16474e);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f16472e.f28223e = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout vip = vip();
        if (vip != null) {
            vip.remoteconfig();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f16476e = i;
        if (getAdapter() instanceof C7225e) {
            ((C7225e) getAdapter()).ad();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f16473e = colorStateList;
        if (getAdapter() instanceof C7225e) {
            ((C7225e) getAdapter()).ad();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C7225e(this, getContext(), this.f16475e, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (metrica()) {
            this.f16472e.purchase();
        } else {
            super.showDropDown();
        }
    }

    public final TextInputLayout vip() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }
}
