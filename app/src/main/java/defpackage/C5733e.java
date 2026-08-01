package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5733e extends LinearLayout {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public ColorStateList f12134e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public CharSequence f12135e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f12136e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C13272e f12137e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public ImageView.ScaleType f12138e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final CheckableImageButton f12139e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public View.OnLongClickListener f12140e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final TextInputLayout f12141e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f12142e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public PorterDuff.Mode f12143e;

    public C5733e(TextInputLayout textInputLayout, C0912e c0912e) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f12141e = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f12139e = checkableImageButton;
        C13272e c13272e = new C13272e(getContext(), null);
        this.f12137e = c13272e;
        if (AbstractC2774e.billing(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f12140e;
        checkableImageButton.setOnClickListener(null);
        AbstractC4340e.purchase(checkableImageButton, onLongClickListener);
        this.f12140e = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC4340e.purchase(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0912e.f3331e;
        if (typedArray.hasValue(69)) {
            this.f12134e = AbstractC2774e.metrica(getContext(), c0912e, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f12143e = AbstractC6286e.advert(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            vip(c0912e.yandex(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f12142e) {
            this.f12142e = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType vip = AbstractC4340e.vip(typedArray.getInt(68, -1));
            this.f12138e = vip;
            checkableImageButton.setScaleType(vip);
        }
        c13272e.setVisibility(8);
        c13272e.setId(R.id.textinput_prefix_text);
        c13272e.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        c13272e.setAccessibilityLiveRegion(1);
        c13272e.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c13272e.setTextColor(c0912e.purchase(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f12135e = TextUtils.isEmpty(text2) ? null : text2;
        c13272e.setText(text2);
        appmetrica();
        addView(checkableImageButton);
        addView(c13272e);
    }

    public final int ad() {
        int i;
        CheckableImageButton checkableImageButton = this.f12139e;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        return this.f12137e.getPaddingStart() + getPaddingStart() + i;
    }

    public final void appmetrica() {
        int i = (this.f12135e == null || this.f12136e) ? 8 : 0;
        setVisibility((this.f12139e.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f12137e.setVisibility(i);
        this.f12141e.admob();
    }

    public final void license() {
        int paddingStart;
        EditText editText = this.f12141e.f1006e;
        if (editText == null) {
            return;
        }
        if (this.f12139e.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC2016e.ad;
        this.f12137e.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void metrica(boolean z) {
        CheckableImageButton checkableImageButton = this.f12139e;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            license();
            appmetrica();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        license();
    }

    public final void vip(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f12139e;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f12134e;
            PorterDuff.Mode mode = this.f12143e;
            TextInputLayout textInputLayout = this.f12141e;
            AbstractC4340e.ad(textInputLayout, checkableImageButton, colorStateList, mode);
            metrica(true);
            AbstractC4340e.appmetrica(textInputLayout, checkableImageButton, this.f12134e);
            return;
        }
        metrica(false);
        View.OnLongClickListener onLongClickListener = this.f12140e;
        checkableImageButton.setOnClickListener(null);
        AbstractC4340e.purchase(checkableImageButton, onLongClickListener);
        this.f12140e = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC4340e.purchase(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }
}
