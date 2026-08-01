package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C4114e extends CheckBox implements InterfaceC9728e, InterfaceC13405e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C16293e f9074e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C17790e f9075e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C2071e f9076e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14815e f9077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4114e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC7474e.ad(context);
        AbstractC17382e.ad(this, getContext());
        C14815e c14815e = new C14815e(this);
        this.f9077e = c14815e;
        c14815e.license(attributeSet, i);
        C17790e c17790e = new C17790e(this);
        this.f9075e = c17790e;
        c17790e.applovin(attributeSet, i);
        C16293e c16293e = new C16293e(this);
        this.f9074e = c16293e;
        c16293e.purchase(attributeSet, i);
        getEmojiTextViewHelper().vip(attributeSet, i);
    }

    private C2071e getEmojiTextViewHelper() {
        if (this.f9076e == null) {
            this.f9076e = new C2071e(this);
        }
        return this.f9076e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C17790e c17790e = this.f9075e;
        if (c17790e != null) {
            c17790e.license();
        }
        C16293e c16293e = this.f9074e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C17790e c17790e = this.f9075e;
        if (c17790e != null) {
            return c17790e.tapsense();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C17790e c17790e = this.f9075e;
        if (c17790e != null) {
            return c17790e.isPro();
        }
        return null;
    }

    @Override // defpackage.InterfaceC9728e
    public ColorStateList getSupportButtonTintList() {
        C14815e c14815e = this.f9077e;
        if (c14815e != null) {
            return (ColorStateList) c14815e.f29340e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C14815e c14815e = this.f9077e;
        if (c14815e != null) {
            return (PorterDuff.Mode) c14815e.f29338e;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9074e.license();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9074e.appmetrica();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().metrica(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C17790e c17790e = this.f9075e;
        if (c17790e != null) {
            c17790e.subs();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C17790e c17790e = this.f9075e;
        if (c17790e != null) {
            c17790e.m4430interface(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC4628e.purchase(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C14815e c14815e = this.f9077e;
        if (c14815e != null) {
            if (c14815e.f29336e) {
                c14815e.f29336e = false;
            } else {
                c14815e.f29336e = true;
                c14815e.ad();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C16293e c16293e = this.f9074e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C16293e c16293e = this.f9074e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().license(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().ad(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C17790e c17790e = this.f9075e;
        if (c17790e != null) {
            c17790e.m4423break(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C17790e c17790e = this.f9075e;
        if (c17790e != null) {
            c17790e.m4422abstract(mode);
        }
    }

    @Override // defpackage.InterfaceC9728e
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C14815e c14815e = this.f9077e;
        if (c14815e != null) {
            c14815e.f29340e = colorStateList;
            c14815e.f29337e = true;
            c14815e.ad();
        }
    }

    @Override // defpackage.InterfaceC9728e
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C14815e c14815e = this.f9077e;
        if (c14815e != null) {
            c14815e.f29338e = mode;
            c14815e.f29339e = true;
            c14815e.ad();
        }
    }

    @Override // defpackage.InterfaceC13405e
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C16293e c16293e = this.f9074e;
        c16293e.mopub(colorStateList);
        c16293e.vip();
    }

    @Override // defpackage.InterfaceC13405e
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C16293e c16293e = this.f9074e;
        c16293e.advert(mode);
        c16293e.vip();
    }
}
