package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC14494e extends AbstractC7413e implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f28658e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public View f28659e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public View f28660e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final MenuC8939e f28661e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC0544e f28662e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public InterfaceC17386e f28663e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public int f28664e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Context f28665e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f28666e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public ViewTreeObserver f28667e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f28668e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C2434e f28669e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f28670e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public int f28671e = 0;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C13856e f28672e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2609e f28673e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f28674e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f28675e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public boolean f28676e;

    /* JADX WARN: Type inference failed for: r7v1, types: [eؚؔۛ, eٓ۟ۡ] */
    public ViewOnKeyListenerC14494e(Context context, MenuC8939e menuC8939e, View view, int i, boolean z) {
        int i2 = 4;
        this.f28673e = new ViewTreeObserverOnGlobalLayoutListenerC2609e(i2, this);
        this.f28662e = new ViewOnAttachStateChangeListenerC0544e(i2, this);
        this.f28665e = context;
        this.f28661e = menuC8939e;
        this.f28658e = z;
        this.f28672e = new C13856e(menuC8939e, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f28674e = i;
        Resources resources = context.getResources();
        this.f28675e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f28660e = view;
        this.f28669e = new C14271e(context, null, i, 0);
        menuC8939e.vip(this, context);
    }

    @Override // defpackage.AbstractC7413e
    public final void Signature(int i) {
        this.f28671e = i;
    }

    @Override // defpackage.InterfaceC13836e
    public final boolean ad() {
        return !this.f28668e && this.f28669e.f28227e.isShowing();
    }

    @Override // defpackage.InterfaceC13836e
    public final C15703e adcel() {
        return this.f28669e.f28217e;
    }

    @Override // defpackage.AbstractC7413e
    public final void admob(int i) {
        this.f28669e.f28238e = i;
    }

    @Override // defpackage.AbstractC7413e
    public final void advert(MenuC8939e menuC8939e) {
    }

    @Override // defpackage.AbstractC7413e
    public final void amazon(View view) {
        this.f28660e = view;
    }

    @Override // defpackage.InterfaceC17868e
    public final void billing(InterfaceC17386e interfaceC17386e) {
        this.f28663e = interfaceC17386e;
    }

    @Override // defpackage.InterfaceC13836e
    public final void dismiss() {
        if (ad()) {
            this.f28669e.dismiss();
        }
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean license() {
        return false;
    }

    @Override // defpackage.AbstractC7413e
    public final void loadAd(boolean z) {
        this.f28672e.f27439e = z;
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean metrica(SubMenuC1355e subMenuC1355e) {
        boolean z;
        if (subMenuC1355e.hasVisibleItems()) {
            C13048e c13048e = new C13048e(this.f28665e, subMenuC1355e, this.f28659e, this.f28658e, this.f28674e, 0);
            InterfaceC17386e interfaceC17386e = this.f28663e;
            c13048e.yandex = interfaceC17386e;
            AbstractC7413e abstractC7413e = c13048e.startapp;
            if (abstractC7413e != null) {
                abstractC7413e.billing(interfaceC17386e);
            }
            int size = subMenuC1355e.f17947e.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC1355e.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c13048e.billing = z;
            AbstractC7413e abstractC7413e2 = c13048e.startapp;
            if (abstractC7413e2 != null) {
                abstractC7413e2.loadAd(z);
            }
            c13048e.adcel = this.f28670e;
            this.f28670e = null;
            this.f28661e.metrica(false);
            C2434e c2434e = this.f28669e;
            int i2 = c2434e.f28238e;
            int loadAd = c2434e.loadAd();
            if ((Gravity.getAbsoluteGravity(this.f28671e, this.f28660e.getLayoutDirection()) & 7) == 5) {
                i2 += this.f28660e.getWidth();
            }
            if (!c13048e.vip()) {
                if (c13048e.appmetrica != null) {
                    c13048e.license(i2, loadAd, true, true);
                }
            }
            InterfaceC17386e interfaceC17386e2 = this.f28663e;
            if (interfaceC17386e2 != null) {
                interfaceC17386e2.smaato(subMenuC1355e);
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f28668e = true;
        this.f28661e.metrica(true);
        ViewTreeObserver viewTreeObserver = this.f28667e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f28667e = this.f28659e.getViewTreeObserver();
            }
            this.f28667e.removeGlobalOnLayoutListener(this.f28673e);
            this.f28667e = null;
        }
        this.f28659e.removeOnAttachStateChangeListener(this.f28662e);
        PopupWindow.OnDismissListener onDismissListener = this.f28670e;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.AbstractC7413e
    public final void pro(int i) {
        this.f28669e.advert(i);
    }

    @Override // defpackage.InterfaceC13836e
    public final void purchase() {
        View view;
        if (ad()) {
            return;
        }
        if (this.f28668e || (view = this.f28660e) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f28659e = view;
        C2434e c2434e = this.f28669e;
        C16235e c16235e = c2434e.f28227e;
        C16235e c16235e2 = c2434e.f28227e;
        c16235e.setOnDismissListener(this);
        c2434e.f28225e = this;
        c2434e.f28229e = true;
        c16235e2.setFocusable(true);
        View view2 = this.f28659e;
        boolean z = this.f28667e == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f28667e = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f28673e);
        }
        view2.addOnAttachStateChangeListener(this.f28662e);
        c2434e.f28224e = view2;
        c2434e.f28216e = this.f28671e;
        boolean z2 = this.f28666e;
        Context context = this.f28665e;
        C13856e c13856e = this.f28672e;
        if (!z2) {
            this.f28664e = AbstractC7413e.smaato(c13856e, context, this.f28675e);
            this.f28666e = true;
        }
        c2434e.subscription(this.f28664e);
        c16235e2.setInputMethodMode(2);
        Rect rect = this.f15178e;
        c2434e.f28235e = rect != null ? new Rect(rect) : null;
        c2434e.purchase();
        C15703e c15703e = c2434e.f28217e;
        c15703e.setOnKeyListener(this);
        if (this.f28676e) {
            MenuC8939e menuC8939e = this.f28661e;
            if (menuC8939e.f17926e != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c15703e, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC8939e.f17926e);
                }
                frameLayout.setEnabled(false);
                c15703e.addHeaderView(frameLayout, null, false);
            }
        }
        c2434e.Signature(c13856e);
        c2434e.purchase();
    }

    @Override // defpackage.AbstractC7413e
    public final void remoteconfig(boolean z) {
        this.f28676e = z;
    }

    @Override // defpackage.InterfaceC17868e
    public final void startapp() {
        this.f28666e = false;
        C13856e c13856e = this.f28672e;
        if (c13856e != null) {
            c13856e.notifyDataSetChanged();
        }
    }

    @Override // defpackage.AbstractC7413e
    public final void subscription(PopupWindow.OnDismissListener onDismissListener) {
        this.f28670e = onDismissListener;
    }

    @Override // defpackage.InterfaceC17868e
    public final void vip(MenuC8939e menuC8939e, boolean z) {
        if (menuC8939e != this.f28661e) {
            return;
        }
        dismiss();
        InterfaceC17386e interfaceC17386e = this.f28663e;
        if (interfaceC17386e != null) {
            interfaceC17386e.vip(menuC8939e, z);
        }
    }
}
