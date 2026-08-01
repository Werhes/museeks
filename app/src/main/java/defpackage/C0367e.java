package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0367e extends C4114e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final LinkedHashSet f2400e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public Drawable f2401e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public Drawable f2402e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f2403e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public CharSequence f2404e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f2405e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public int f2406e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public PorterDuff.Mode f2407e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public ColorStateList f2408e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public ColorStateList f2409e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f2410e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public CharSequence f2411e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f2412e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public int[] f2413e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0497e f2414e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f2415e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C1681e f2416e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public ColorStateList f2417e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final LinkedHashSet f2418e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public boolean f2419e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final int[] f2398e = {R.attr.state_indeterminate};

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public static final int[] f2396e = {R.attr.state_error};

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public static final int[][] f2397e = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public static final int f2399e = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX WARN: Removed duplicated region for block: B:13:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0367e(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0367e.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i = this.f2406e;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2417e == null) {
            int advert = AbstractC9546e.advert(this, R.attr.colorControlActivated);
            int advert2 = AbstractC9546e.advert(this, R.attr.colorError);
            int advert3 = AbstractC9546e.advert(this, R.attr.colorSurface);
            int advert4 = AbstractC9546e.advert(this, R.attr.colorOnSurface);
            this.f2417e = new ColorStateList(f2397e, new int[]{AbstractC9546e.admob(advert3, 1.0f, advert2), AbstractC9546e.admob(advert3, 1.0f, advert), AbstractC9546e.admob(advert3, 0.54f, advert4), AbstractC9546e.admob(advert3, 0.38f, advert4), AbstractC9546e.admob(advert3, 0.38f, advert4)});
        }
        return this.f2417e;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f2408e;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void ad() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C9380e c9380e;
        Drawable drawable = this.f2402e;
        ColorStateList colorStateList3 = this.f2408e;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.f2402e = drawable;
        Drawable drawable2 = this.f2401e;
        ColorStateList colorStateList4 = this.f2409e;
        PorterDuff.Mode mode = this.f2407e;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.f2401e = drawable2;
        if (this.f2405e) {
            C0497e c0497e = this.f2414e;
            if (c0497e != null) {
                C3008e c3008e = c0497e.f2572e;
                C1681e c1681e = this.f2416e;
                if (c1681e != null) {
                    Drawable drawable3 = c0497e.f11478e;
                    if (drawable3 != null) {
                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                        if (c1681e.ad == null) {
                            c1681e.ad = new C6974e(c1681e);
                        }
                        AbstractC5009e.metrica(animatedVectorDrawable, c1681e.ad);
                    }
                    ArrayList arrayList = c0497e.f2570e;
                    if (arrayList != null) {
                        arrayList.remove(c1681e);
                        if (c0497e.f2570e.size() == 0 && (c9380e = c0497e.f2573e) != null) {
                            c3008e.vip.removeListener(c9380e);
                            c0497e.f2573e = null;
                        }
                    }
                }
                if (c1681e != null) {
                    Drawable drawable4 = c0497e.f11478e;
                    if (drawable4 != null) {
                        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                        if (c1681e.ad == null) {
                            c1681e.ad = new C6974e(c1681e);
                        }
                        AbstractC5009e.vip(animatedVectorDrawable2, c1681e.ad);
                    } else {
                        if (c0497e.f2570e == null) {
                            c0497e.f2570e = new ArrayList();
                        }
                        if (!c0497e.f2570e.contains(c1681e)) {
                            c0497e.f2570e.add(c1681e);
                            if (c0497e.f2573e == null) {
                                c0497e.f2573e = new C9380e(1, c0497e);
                            }
                            c3008e.vip.addListener(c0497e.f2573e);
                        }
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable5 = this.f2402e;
                if ((drawable5 instanceof AnimatedStateListDrawable) && c0497e != null) {
                    ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0497e, false);
                    ((AnimatedStateListDrawable) this.f2402e).addTransition(R.id.indeterminate, R.id.unchecked, c0497e, false);
                }
            }
        }
        Drawable drawable6 = this.f2402e;
        if (drawable6 != null && (colorStateList2 = this.f2408e) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.f2401e;
        if (drawable7 != null && (colorStateList = this.f2409e) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.f2402e;
        Drawable drawable9 = this.f2401e;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f2402e;
    }

    public Drawable getButtonIconDrawable() {
        return this.f2401e;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f2409e;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f2407e;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f2408e;
    }

    public int getCheckedState() {
        return this.f2406e;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f2411e;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f2406e == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2410e && this.f2408e == null && this.f2409e == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f2398e);
        }
        if (this.f2403e) {
            View.mergeDrawableStates(onCreateDrawableState, f2396e);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.f2413e = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f2415e || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (AbstractC6286e.mopub(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f2403e) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f2411e));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0572e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0572e c0572e = (C0572e) parcelable;
        super.onRestoreInstanceState(c0572e.getSuperState());
        setCheckedState(c0572e.f2752e);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, eؑۜٓ] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f2752e = getCheckedState();
        return baseSavedState;
    }

    @Override // defpackage.C4114e, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC4628e.purchase(getContext(), i));
    }

    @Override // defpackage.C4114e, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f2402e = drawable;
        this.f2405e = false;
        ad();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f2401e = drawable;
        ad();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC4628e.purchase(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f2409e == colorStateList) {
            return;
        }
        this.f2409e = colorStateList;
        ad();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f2407e == mode) {
            return;
        }
        this.f2407e = mode;
        ad();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f2408e == colorStateList) {
            return;
        }
        this.f2408e = colorStateList;
        ad();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        ad();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f2415e = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager appmetrica;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f2406e != i) {
            this.f2406e = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.f2404e == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f2419e) {
                return;
            }
            this.f2419e = true;
            LinkedHashSet linkedHashSet = this.f2418e;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC5087e.m1747goto(it);
                }
            }
            if (this.f2406e != 2 && (onCheckedChangeListener = this.f2412e) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (appmetrica = C12885e.appmetrica(getContext().getSystemService(C12885e.startapp()))) != null) {
                appmetrica.notifyValueChanged(this);
            }
            this.f2419e = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f2411e = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f2403e == z) {
            return;
        }
        this.f2403e = z;
        refreshDrawableState();
        Iterator it = this.f2400e.iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2412e = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f2404e = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f2410e = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }
}
