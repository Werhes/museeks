package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12085e extends CheckedTextView implements InterfaceC13405e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C16293e f24220e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C17790e f24221e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C2071e f24222e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14815e f24223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12085e(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            defpackage.AbstractC7474e.ad(r8)
            r6 = 2130968853(0x7f040115, float:1.7546371E38)
            r7.<init>(r8, r9, r6)
            android.content.Context r8 = r7.getContext()
            defpackage.AbstractC17382e.ad(r7, r8)
            eٖ٘ۥ r8 = new eٖ٘ۥ
            r8.<init>(r7)
            r7.f24220e = r8
            r8.purchase(r9, r6)
            r8.vip()
            eٖ٘ؑ r8 = new eٖ٘ؑ
            r8.<init>(r7)
            r7.f24221e = r8
            r8.applovin(r9, r6)
            eٔٛؐ r8 = new eٔٛؐ
            r8.<init>(r7)
            r7.f24223e = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = defpackage.AbstractC6062e.advert
            eؚؒٗ r8 = defpackage.C0912e.advert(r8, r9, r3, r6)
            java.lang.Object r0 = r8.f3331e
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r7.getContext()
            java.lang.Object r1 = r8.f3331e
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r7
            r4 = r9
            defpackage.AbstractC2016e.amazon(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            r3 = 0
            if (r2 == 0) goto L67
            int r9 = r0.getResourceId(r9, r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L67
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            android.graphics.drawable.Drawable r9 = defpackage.AbstractC4628e.purchase(r2, r9)     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            goto L7e
        L64:
            r0 = move-exception
            r9 = r0
            goto Lab
        L67:
            boolean r9 = r0.hasValue(r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L7e
            int r9 = r0.getResourceId(r3, r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L7e
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L64
            android.graphics.drawable.Drawable r9 = defpackage.AbstractC4628e.purchase(r2, r9)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L64
        L7e:
            r9 = 2
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L8c
            android.content.res.ColorStateList r9 = r8.purchase(r9)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkTintList(r9)     // Catch: java.lang.Throwable -> L64
        L8c:
            r9 = 3
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto La0
            r2 = -1
            int r9 = r0.getInt(r9, r2)     // Catch: java.lang.Throwable -> L64
            r0 = 0
            android.graphics.PorterDuff$Mode r9 = defpackage.AbstractC13982e.metrica(r9, r0)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkTintMode(r9)     // Catch: java.lang.Throwable -> L64
        La0:
            r8.amazon()
            eؓۚؖ r8 = r7.getEmojiTextViewHelper()
            r8.vip(r4, r6)
            return
        Lab:
            r8.amazon()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12085e.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C2071e getEmojiTextViewHelper() {
        if (this.f24222e == null) {
            this.f24222e = new C2071e(this);
        }
        return this.f24222e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C16293e c16293e = this.f24220e;
        if (c16293e != null) {
            c16293e.vip();
        }
        C17790e c17790e = this.f24221e;
        if (c17790e != null) {
            c17790e.license();
        }
        C14815e c14815e = this.f24223e;
        if (c14815e != null) {
            c14815e.vip();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC12315e.admob(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C17790e c17790e = this.f24221e;
        if (c17790e != null) {
            return c17790e.tapsense();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C17790e c17790e = this.f24221e;
        if (c17790e != null) {
            return c17790e.isPro();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C14815e c14815e = this.f24223e;
        if (c14815e != null) {
            return (ColorStateList) c14815e.f29340e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C14815e c14815e = this.f24223e;
        if (c14815e != null) {
            return (PorterDuff.Mode) c14815e.f29338e;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f24220e.license();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f24220e.appmetrica();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0207e.yandex(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().metrica(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C17790e c17790e = this.f24221e;
        if (c17790e != null) {
            c17790e.subs();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C17790e c17790e = this.f24221e;
        if (c17790e != null) {
            c17790e.m4430interface(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC4628e.purchase(getContext(), i));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C14815e c14815e = this.f24223e;
        if (c14815e != null) {
            if (c14815e.f29336e) {
                c14815e.f29336e = false;
            } else {
                c14815e.f29336e = true;
                c14815e.vip();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C16293e c16293e = this.f24220e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C16293e c16293e = this.f24220e;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C17790e c17790e = this.f24221e;
        if (c17790e != null) {
            c17790e.m4423break(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C17790e c17790e = this.f24221e;
        if (c17790e != null) {
            c17790e.m4422abstract(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C14815e c14815e = this.f24223e;
        if (c14815e != null) {
            c14815e.f29340e = colorStateList;
            c14815e.f29337e = true;
            c14815e.vip();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C14815e c14815e = this.f24223e;
        if (c14815e != null) {
            c14815e.f29338e = mode;
            c14815e.f29339e = true;
            c14815e.vip();
        }
    }

    @Override // defpackage.InterfaceC13405e
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C16293e c16293e = this.f24220e;
        c16293e.mopub(colorStateList);
        c16293e.vip();
    }

    @Override // defpackage.InterfaceC13405e
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C16293e c16293e = this.f24220e;
        c16293e.advert(mode);
        c16293e.vip();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C16293e c16293e = this.f24220e;
        if (c16293e != null) {
            c16293e.billing(context, i);
        }
    }
}
