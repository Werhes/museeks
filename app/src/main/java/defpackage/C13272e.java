package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13272e extends TextView implements InterfaceC13405e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f26326e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13391e f26327e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16293e f26328e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C2071e f26329e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17790e f26330e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Future f26331e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C2691e f26332e;

    public C13272e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13272e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC7474e.ad(context);
        this.f26326e = false;
        this.f26332e = null;
        AbstractC17382e.ad(this, getContext());
        C17790e c17790e = new C17790e(this);
        this.f26330e = c17790e;
        c17790e.applovin(attributeSet, i);
        C16293e c16293e = new C16293e(this);
        this.f26328e = c16293e;
        c16293e.purchase(attributeSet, i);
        c16293e.vip();
        C13391e c13391e = new C13391e(6, false);
        c13391e.f26645e = this;
        this.f26327e = c13391e;
        getEmojiTextViewHelper().vip(attributeSet, i);
    }

    private C2071e getEmojiTextViewHelper() {
        if (this.f26329e == null) {
            this.f26329e = new C2071e(this);
        }
        return this.f26329e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C17790e c17790e = this.f26330e;
        if (c17790e != null) {
            c17790e.license();
        }
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC14039e.metrica) {
            return super.getAutoSizeMaxTextSize();
        }
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            return Math.round(c16293e.startapp.appmetrica);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC14039e.metrica) {
            return super.getAutoSizeMinTextSize();
        }
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            return Math.round(c16293e.startapp.license);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC14039e.metrica) {
            return super.getAutoSizeStepGranularity();
        }
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            return Math.round(c16293e.startapp.metrica);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC14039e.metrica) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C16293e c16293e = this.f26328e;
        return c16293e != null ? c16293e.startapp.purchase : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC14039e.metrica) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            return c16293e.startapp.ad;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC12315e.admob(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC11987e getSuperCaller() {
        if (this.f26332e == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f26332e = new C6858e(this);
            } else if (i >= 28) {
                this.f26332e = new C14653e(this);
            } else if (i >= 26) {
                this.f26332e = new C2691e(1, this);
            }
        }
        return this.f26332e;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C17790e c17790e = this.f26330e;
        if (c17790e != null) {
            return c17790e.tapsense();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C17790e c17790e = this.f26330e;
        if (c17790e != null) {
            return c17790e.isPro();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f26328e.license();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f26328e.appmetrica();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f26331e;
        if (future != null) {
            try {
                this.f26331e = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC12315e.metrica(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C13391e c13391e;
        if (Build.VERSION.SDK_INT >= 28 || (c13391e = this.f26327e) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c13391e.f26644e;
        return textClassifier == null ? AbstractC0848e.ad((TextView) c13391e.f26645e) : textClassifier;
    }

    public C15707e getTextMetricsParamsCompat() {
        return AbstractC12315e.metrica(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f26328e.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            AbstractC9468e.purchase(editorInfo, getText());
        }
        AbstractC0207e.yandex(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C16293e c16293e = this.f26328e;
        if (c16293e == null || AbstractC14039e.metrica) {
            return;
        }
        c16293e.startapp.ad();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f26331e;
        if (future != null) {
            try {
                this.f26331e = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC12315e.metrica(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            C13897e c13897e = c16293e.startapp;
            if (AbstractC14039e.metrica || !c13897e.purchase()) {
                return;
            }
            c13897e.ad();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().metrica(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC14039e.metrica) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            c16293e.yandex(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC14039e.metrica) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            c16293e.startapp(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC14039e.metrica) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            c16293e.adcel(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C17790e c17790e = this.f26330e;
        if (c17790e != null) {
            c17790e.subs();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C17790e c17790e = this.f26330e;
        if (c17790e != null) {
            c17790e.m4430interface(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC4628e.purchase(context, i) : null, i2 != 0 ? AbstractC4628e.purchase(context, i2) : null, i3 != 0 ? AbstractC4628e.purchase(context, i3) : null, i4 != 0 ? AbstractC4628e.purchase(context, i4) : null);
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC4628e.purchase(context, i) : null, i2 != 0 ? AbstractC4628e.purchase(context, i2) : null, i3 != 0 ? AbstractC4628e.purchase(context, i3) : null, i4 != 0 ? AbstractC4628e.purchase(context, i4) : null);
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC12315e.subscription(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().license(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().ad(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().subscription(i);
        } else {
            AbstractC12315e.amazon(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().smaato(i);
        } else {
            AbstractC12315e.loadAd(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC12315e.Signature(this, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().signatures(i, f);
        } else if (i2 >= 34) {
            AbstractC5666e.m1959native(this, i, f);
        } else {
            AbstractC12315e.Signature(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(AbstractC3221e abstractC3221e) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC12315e.metrica(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C17790e c17790e = this.f26330e;
        if (c17790e != null) {
            c17790e.m4423break(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C17790e c17790e = this.f26330e;
        if (c17790e != null) {
            c17790e.m4422abstract(mode);
        }
    }

    @Override // defpackage.InterfaceC13405e
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C16293e c16293e = this.f26328e;
        c16293e.mopub(colorStateList);
        c16293e.vip();
    }

    @Override // defpackage.InterfaceC13405e
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C16293e c16293e = this.f26328e;
        c16293e.advert(mode);
        c16293e.vip();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            c16293e.billing(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C13391e c13391e;
        if (Build.VERSION.SDK_INT >= 28 || (c13391e = this.f26327e) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c13391e.f26644e = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC3221e> future) {
        this.f26331e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C15707e c15707e) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c15707e.vip;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(c15707e.ad);
        setBreakStrategy(c15707e.metrica);
        setHyphenationFrequency(c15707e.license);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = AbstractC14039e.metrica;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C16293e c16293e = this.f26328e;
        if (c16293e != null) {
            C13897e c13897e = c16293e.startapp;
            if (z || c13897e.purchase()) {
                return;
            }
            c13897e.billing(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f26326e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            AbstractC15203e abstractC15203e = AbstractC17174e.ad;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f26326e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f26326e = false;
        }
    }
}
