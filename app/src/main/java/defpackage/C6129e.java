package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C6129e extends EditText implements InterfaceC8253e, InterfaceC13405e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C16911e f12874e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13391e f12875e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16293e f12876e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C14634e f12877e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17790e f12878e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C7793e f12879e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, eَٔ] */
    public C6129e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC7474e.ad(context);
        AbstractC17382e.ad(this, getContext());
        C17790e c17790e = new C17790e(this);
        this.f12878e = c17790e;
        c17790e.applovin(attributeSet, R.attr.editTextStyle);
        C16293e c16293e = new C16293e(this);
        this.f12876e = c16293e;
        c16293e.purchase(attributeSet, R.attr.editTextStyle);
        c16293e.vip();
        C13391e c13391e = new C13391e(6, false);
        c13391e.f26645e = this;
        this.f12875e = c13391e;
        this.f12877e = new Object();
        C16911e c16911e = new C16911e((EditText) this);
        this.f12874e = c16911e;
        c16911e.crashlytics(attributeSet, R.attr.editTextStyle);
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

    private C7793e getSuperCaller() {
        if (this.f12879e == null) {
            this.f12879e = new C7793e(this);
        }
        return this.f12879e;
    }

    @Override // defpackage.InterfaceC8253e
    public final C4278e ad(C4278e c4278e) {
        return this.f12877e.ad(this, c4278e);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C17790e c17790e = this.f12878e;
        if (c17790e != null) {
            c17790e.license();
        }
        C16293e c16293e = this.f12876e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC12315e.admob(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C17790e c17790e = this.f12878e;
        if (c17790e != null) {
            return c17790e.tapsense();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C17790e c17790e = this.f12878e;
        if (c17790e != null) {
            return c17790e.isPro();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12876e.license();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12876e.appmetrica();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C13391e c13391e;
        if (Build.VERSION.SDK_INT >= 28 || (c13391e = this.f12875e) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c13391e.f26644e;
        return textClassifier == null ? AbstractC0848e.ad((TextView) c13391e.f26645e) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] yandex;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f12876e.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            AbstractC9468e.purchase(editorInfo, getText());
        }
        AbstractC0207e.yandex(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && i <= 30 && (yandex = AbstractC2016e.yandex(this)) != null) {
            AbstractC9468e.appmetrica(editorInfo, yandex);
            onCreateInputConnection = AbstractC8178e.metrica(onCreateInputConnection, editorInfo, new C17687e(11, this));
        }
        return this.f12874e.m4214class(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && AbstractC2016e.yandex(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = AbstractC2941e.ad(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC1016e interfaceC1016e;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || AbstractC2016e.yandex(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC1016e = new C7407e(primaryClip, 1);
            } else {
                C13911e c13911e = new C13911e();
                c13911e.vip = primaryClip;
                c13911e.metrica = 1;
                interfaceC1016e = c13911e;
            }
            interfaceC1016e.vip(i == 16908322 ? 0 : 1);
            AbstractC2016e.mopub(this, interfaceC1016e.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C17790e c17790e = this.f12878e;
        if (c17790e != null) {
            c17790e.subs();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C17790e c17790e = this.f12878e;
        if (c17790e != null) {
            c17790e.m4430interface(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C16293e c16293e = this.f12876e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C16293e c16293e = this.f12876e;
        if (c16293e != null) {
            c16293e.vip();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC12315e.subscription(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f12874e.m4221throw(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f12874e.isPro(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C17790e c17790e = this.f12878e;
        if (c17790e != null) {
            c17790e.m4423break(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C17790e c17790e = this.f12878e;
        if (c17790e != null) {
            c17790e.m4422abstract(mode);
        }
    }

    @Override // defpackage.InterfaceC13405e
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C16293e c16293e = this.f12876e;
        c16293e.mopub(colorStateList);
        c16293e.vip();
    }

    @Override // defpackage.InterfaceC13405e
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C16293e c16293e = this.f12876e;
        c16293e.advert(mode);
        c16293e.vip();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C16293e c16293e = this.f12876e;
        if (c16293e != null) {
            c16293e.billing(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C13391e c13391e;
        if (Build.VERSION.SDK_INT >= 28 || (c13391e = this.f12875e) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c13391e.f26644e = textClassifier;
        }
    }
}
