package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10792e extends AutoCompleteTextView implements InterfaceC13405e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final int[] f21398e = {R.attr.popupBackground};

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C16911e f21399e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16293e f21400e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17790e f21401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10792e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ua.itaysonlab.vkx.R.attr.autoCompleteTextViewStyle);
        AbstractC7474e.ad(context);
        AbstractC17382e.ad(this, getContext());
        C0912e advert = C0912e.advert(getContext(), attributeSet, f21398e, ua.itaysonlab.vkx.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) advert.f3331e).hasValue(0)) {
            setDropDownBackgroundDrawable(advert.yandex(0));
        }
        advert.amazon();
        C17790e c17790e = new C17790e(this);
        this.f21401e = c17790e;
        c17790e.applovin(attributeSet, ua.itaysonlab.vkx.R.attr.autoCompleteTextViewStyle);
        C16293e c16293e = new C16293e(this);
        this.f21400e = c16293e;
        c16293e.purchase(attributeSet, ua.itaysonlab.vkx.R.attr.autoCompleteTextViewStyle);
        c16293e.vip();
        C16911e c16911e = new C16911e((EditText) this);
        this.f21399e = c16911e;
        c16911e.crashlytics(attributeSet, ua.itaysonlab.vkx.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener isPro = c16911e.isPro(keyListener);
        if (isPro == keyListener) {
            return;
        }
        super.setKeyListener(isPro);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C17790e c17790e = this.f21401e;
        if (c17790e != null) {
            c17790e.license();
        }
        C16293e c16293e = this.f21400e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC12315e.admob(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C17790e c17790e = this.f21401e;
        if (c17790e != null) {
            return c17790e.tapsense();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C17790e c17790e = this.f21401e;
        if (c17790e != null) {
            return c17790e.isPro();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21400e.license();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21400e.appmetrica();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0207e.yandex(onCreateInputConnection, editorInfo, this);
        return this.f21399e.m4214class(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C17790e c17790e = this.f21401e;
        if (c17790e != null) {
            c17790e.subs();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C17790e c17790e = this.f21401e;
        if (c17790e != null) {
            c17790e.m4430interface(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C16293e c16293e = this.f21400e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C16293e c16293e = this.f21400e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC12315e.subscription(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC4628e.purchase(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f21399e.m4221throw(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f21399e.isPro(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C17790e c17790e = this.f21401e;
        if (c17790e != null) {
            c17790e.m4423break(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C17790e c17790e = this.f21401e;
        if (c17790e != null) {
            c17790e.m4422abstract(mode);
        }
    }

    @Override // defpackage.InterfaceC13405e
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C16293e c16293e = this.f21400e;
        c16293e.mopub(colorStateList);
        c16293e.vip();
    }

    @Override // defpackage.InterfaceC13405e
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C16293e c16293e = this.f21400e;
        c16293e.advert(mode);
        c16293e.vip();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C16293e c16293e = this.f21400e;
        if (c16293e != null) {
            c16293e.billing(context, i);
        }
    }
}
