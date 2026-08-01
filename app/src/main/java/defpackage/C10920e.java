package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10920e extends C14271e implements InterfaceC15202e {

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public final Rect f21627e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public CharSequence f21628e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public C16670e f21629e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public final /* synthetic */ C16972e f21630e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public int f21631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10920e(C16972e c16972e, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f21630e = c16972e;
        this.f21627e = new Rect();
        this.f28224e = c16972e;
        this.f28229e = true;
        this.f28227e.setFocusable(true);
        this.f28225e = new C5813e(0, this);
    }

    @Override // defpackage.C14271e, defpackage.InterfaceC15202e
    public final void Signature(ListAdapter listAdapter) {
        super.Signature(listAdapter);
        this.f21629e = (C16670e) listAdapter;
    }

    @Override // defpackage.InterfaceC15202e
    public final void amazon(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C16235e c16235e = this.f28227e;
        boolean isShowing = c16235e.isShowing();
        remoteconfig();
        c16235e.setInputMethodMode(2);
        purchase();
        C15703e c15703e = this.f28217e;
        c15703e.setChoiceMode(1);
        c15703e.setTextDirection(i);
        c15703e.setTextAlignment(i2);
        C16972e c16972e = this.f21630e;
        int selectedItemPosition = c16972e.getSelectedItemPosition();
        C15703e c15703e2 = this.f28217e;
        if (c16235e.isShowing() && c15703e2 != null) {
            c15703e2.setListSelectionHidden(false);
            c15703e2.setSelection(selectedItemPosition);
            if (c15703e2.getChoiceMode() != 0) {
                c15703e2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c16972e.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC2609e viewTreeObserverOnGlobalLayoutListenerC2609e = new ViewTreeObserverOnGlobalLayoutListenerC2609e(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2609e);
        c16235e.setOnDismissListener(new C1417e(this, viewTreeObserverOnGlobalLayoutListenerC2609e));
    }

    @Override // defpackage.InterfaceC15202e
    public final CharSequence appmetrica() {
        return this.f21628e;
    }

    public final void remoteconfig() {
        int i;
        C16972e c16972e = this.f21630e;
        Rect rect = c16972e.f33230e;
        C16235e c16235e = this.f28227e;
        Drawable background = c16235e.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z = AbstractC14039e.ad;
            i = c16972e.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c16972e.getPaddingLeft();
        int paddingRight = c16972e.getPaddingRight();
        int width = c16972e.getWidth();
        int i2 = c16972e.f33233e;
        if (i2 == -2) {
            int ad = c16972e.ad(this.f21629e, c16235e.getBackground());
            int i3 = (c16972e.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (ad > i3) {
                ad = i3;
            }
            subscription(Math.max(ad, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            subscription((width - paddingLeft) - paddingRight);
        } else {
            subscription(i2);
        }
        boolean z2 = AbstractC14039e.ad;
        this.f28238e = c16972e.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f28214e) - this.f21631e) + i : paddingLeft + this.f21631e + i;
    }

    @Override // defpackage.InterfaceC15202e
    public final void smaato(int i) {
        this.f21631e = i;
    }

    @Override // defpackage.InterfaceC15202e
    public final void yandex(CharSequence charSequence) {
        this.f21628e = charSequence;
    }
}
