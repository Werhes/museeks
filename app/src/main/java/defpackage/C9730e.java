package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9730e extends LinearLayout {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public PorterDuff.Mode f19226e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f19227e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public PorterDuff.Mode f19228e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final CheckableImageButton f19229e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final LinkedHashSet f19230e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C0211e f19231e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public ImageView.ScaleType f19232e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f19233e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final FrameLayout f19234e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C13272e f19235e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public View.OnLongClickListener f19236e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public CharSequence f19237e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C9831e f19238e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public ColorStateList f19239e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0932e f19240e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public EditText f19241e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public ColorStateList f19242e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f19243e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final TextInputLayout f19244e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final CheckableImageButton f19245e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public View.OnLongClickListener f19246e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final AccessibilityManager f19247e;

    public C9730e(TextInputLayout textInputLayout, C0912e c0912e) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f19243e = 0;
        this.f19230e = new LinkedHashSet();
        this.f19240e = new C0932e(this);
        C2736e c2736e = new C2736e(this);
        this.f19247e = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f19244e = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f19234e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton ad = ad(this, from, R.id.text_input_error_icon);
        this.f19229e = ad;
        CheckableImageButton ad2 = ad(frameLayout, from, R.id.text_input_end_icon);
        this.f19245e = ad2;
        this.f19238e = new C9831e(this, c0912e);
        C13272e c13272e = new C13272e(getContext(), null);
        this.f19235e = c13272e;
        TypedArray typedArray = (TypedArray) c0912e.f3331e;
        if (typedArray.hasValue(38)) {
            this.f19242e = AbstractC2774e.metrica(getContext(), c0912e, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f19226e = AbstractC6286e.advert(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            startapp(c0912e.yandex(37));
        }
        ad.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        ad.setImportantForAccessibility(2);
        ad.setClickable(false);
        ad.setPressable(false);
        ad.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f19239e = AbstractC2774e.metrica(getContext(), c0912e, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f19228e = AbstractC6286e.advert(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            billing(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && ad2.getContentDescription() != (text = typedArray.getText(27))) {
                ad2.setContentDescription(text);
            }
            ad2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f19239e = AbstractC2774e.metrica(getContext(), c0912e, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f19228e = AbstractC6286e.advert(typedArray.getInt(55, -1), null);
            }
            billing(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (ad2.getContentDescription() != text2) {
                ad2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f19227e) {
            this.f19227e = dimensionPixelSize;
            ad2.setMinimumWidth(dimensionPixelSize);
            ad2.setMinimumHeight(dimensionPixelSize);
            ad.setMinimumWidth(dimensionPixelSize);
            ad.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType vip = AbstractC4340e.vip(typedArray.getInt(31, -1));
            this.f19232e = vip;
            ad2.setScaleType(vip);
            ad.setScaleType(vip);
        }
        c13272e.setVisibility(8);
        c13272e.setId(R.id.textinput_suffix_text);
        c13272e.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c13272e.setAccessibilityLiveRegion(1);
        c13272e.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c13272e.setTextColor(c0912e.purchase(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f19237e = TextUtils.isEmpty(text3) ? null : text3;
        c13272e.setText(text3);
        amazon();
        frameLayout.addView(ad2);
        addView(c13272e);
        addView(frameLayout);
        addView(ad);
        textInputLayout.f1011e.add(c2736e);
        if (textInputLayout.f1006e != null) {
            c2736e.ad(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0544e(2, this));
    }

    public final CheckableImageButton ad(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC2774e.billing(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final void adcel(AbstractC7483e abstractC7483e) {
        if (this.f19241e == null) {
            return;
        }
        if (abstractC7483e.appmetrica() != null) {
            this.f19241e.setOnFocusChangeListener(abstractC7483e.appmetrica());
        }
        if (abstractC7483e.billing() != null) {
            this.f19245e.setOnFocusChangeListener(abstractC7483e.billing());
        }
    }

    public final void advert() {
        CheckableImageButton checkableImageButton = this.f19229e;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f19244e;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f964e.admob && textInputLayout.smaato()) ? 0 : 8);
        mopub();
        smaato();
        if (this.f19243e != 0) {
            return;
        }
        textInputLayout.admob();
    }

    public final void amazon() {
        C13272e c13272e = this.f19235e;
        int visibility = c13272e.getVisibility();
        int i = (this.f19237e == null || this.f19233e) ? 8 : 0;
        if (visibility != i) {
            vip().loadAd(i == 0);
        }
        mopub();
        c13272e.setVisibility(i);
        this.f19244e.admob();
    }

    public final boolean appmetrica() {
        return this.f19229e.getVisibility() == 0;
    }

    public final void billing(int i) {
        if (this.f19243e == i) {
            return;
        }
        AbstractC7483e vip = vip();
        C0211e c0211e = this.f19231e;
        AccessibilityManager accessibilityManager = this.f19247e;
        if (c0211e != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC17512e(c0211e));
        }
        this.f19231e = null;
        vip.subscription();
        this.f19243e = i;
        Iterator it = this.f19230e.iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
        yandex(i != 0);
        AbstractC7483e vip2 = vip();
        int i2 = this.f19238e.vip;
        if (i2 == 0) {
            i2 = vip2.license();
        }
        Drawable purchase = i2 != 0 ? AbstractC4628e.purchase(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f19245e;
        checkableImageButton.setImageDrawable(purchase);
        TextInputLayout textInputLayout = this.f19244e;
        if (purchase != null) {
            AbstractC4340e.ad(textInputLayout, checkableImageButton, this.f19239e, this.f19228e);
            AbstractC4340e.appmetrica(textInputLayout, checkableImageButton, this.f19239e);
        }
        int metrica = vip2.metrica();
        CharSequence text = metrica != 0 ? getResources().getText(metrica) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(vip2.adcel());
        if (!vip2.startapp(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        vip2.admob();
        C0211e yandex = vip2.yandex();
        this.f19231e = yandex;
        if (yandex != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC17512e(this.f19231e));
            }
        }
        View.OnClickListener purchase2 = vip2.purchase();
        View.OnLongClickListener onLongClickListener = this.f19236e;
        checkableImageButton.setOnClickListener(purchase2);
        AbstractC4340e.purchase(checkableImageButton, onLongClickListener);
        EditText editText = this.f19241e;
        if (editText != null) {
            vip2.advert(editText);
            adcel(vip2);
        }
        AbstractC4340e.ad(textInputLayout, checkableImageButton, this.f19239e, this.f19228e);
        purchase(true);
    }

    public final boolean license() {
        return this.f19234e.getVisibility() == 0 && this.f19245e.getVisibility() == 0;
    }

    public final int metrica() {
        int marginStart;
        if (license() || appmetrica()) {
            CheckableImageButton checkableImageButton = this.f19245e;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        return this.f19235e.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final void mopub() {
        this.f19234e.setVisibility((this.f19245e.getVisibility() != 0 || appmetrica()) ? 8 : 0);
        setVisibility((license() || appmetrica() || !((this.f19237e == null || this.f19233e) ? 8 : false)) ? 0 : 8);
    }

    public final void purchase(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        AbstractC7483e vip = vip();
        boolean adcel = vip.adcel();
        CheckableImageButton checkableImageButton = this.f19245e;
        boolean z4 = true;
        if (!adcel || (z3 = checkableImageButton.f887e) == vip.mopub()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(vip instanceof C12801e) || (isActivated = checkableImageButton.isActivated()) == ((C12801e) vip).advert) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            AbstractC4340e.appmetrica(this.f19244e, checkableImageButton, this.f19239e);
        }
    }

    public final void smaato() {
        int i;
        TextInputLayout textInputLayout = this.f19244e;
        if (textInputLayout.f1006e == null) {
            return;
        }
        if (license() || appmetrica()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.f1006e;
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f1006e.getPaddingTop();
        int paddingBottom = textInputLayout.f1006e.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC2016e.ad;
        this.f19235e.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void startapp(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f19229e;
        checkableImageButton.setImageDrawable(drawable);
        advert();
        AbstractC4340e.ad(this.f19244e, checkableImageButton, this.f19242e, this.f19226e);
    }

    public final AbstractC7483e vip() {
        AbstractC7483e c2466e;
        int i = this.f19243e;
        C9831e c9831e = this.f19238e;
        SparseArray sparseArray = (SparseArray) c9831e.license;
        AbstractC7483e abstractC7483e = (AbstractC7483e) sparseArray.get(i);
        if (abstractC7483e != null) {
            return abstractC7483e;
        }
        C9730e c9730e = (C9730e) c9831e.appmetrica;
        if (i == -1) {
            c2466e = new C2466e(c9730e, 0);
        } else if (i == 0) {
            c2466e = new C2466e(c9730e, 1);
        } else if (i == 1) {
            c2466e = new C4462e(c9730e, c9831e.metrica);
        } else if (i == 2) {
            c2466e = new C15624e(c9730e);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC1786e.admob(i, "Invalid end icon mode: "));
            }
            c2466e = new C12801e(c9730e);
        }
        sparseArray.append(i, c2466e);
        return c2466e;
    }

    public final void yandex(boolean z) {
        if (license() != z) {
            this.f19245e.setVisibility(z ? 0 : 8);
            mopub();
            smaato();
            this.f19244e.admob();
        }
    }
}
