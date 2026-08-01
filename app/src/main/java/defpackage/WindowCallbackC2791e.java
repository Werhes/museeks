package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class WindowCallbackC2791e implements Window.Callback {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C8158e f6717e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f6718e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f6719e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f6720e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Window.Callback f6721e;

    public WindowCallbackC2791e(LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e, Window.Callback callback) {
        this.f6717e = layoutInflaterFactory2C8158e;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f6721e = callback;
    }

    public final void ad(Window.Callback callback) {
        try {
            this.f6719e = true;
            callback.onContentChanged();
        } finally {
            this.f6719e = false;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6721e.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f6718e;
        Window.Callback callback = this.f6721e;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f6717e.isVip(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f6721e
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            eًۣۗ r2 = r6.f6717e
            r2.crashlytics()
            eؑۜٔ r3 = r2.f16578e
            r4 = 0
            if (r3 == 0) goto L3d
            eؘؘۣ r3 = r3.applovin
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            eٌۙؖ r3 = r3.f12639e
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            eِٗ٘ r0 = r2.f16561e
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.m2383this(r0, r3, r7)
            if (r0 == 0) goto L52
            eِٗ٘ r7 = r2.f16561e
            if (r7 == 0) goto L3b
            r7.advert = r1
            goto L3b
        L52:
            eِٗ٘ r0 = r2.f16561e
            if (r0 != 0) goto L6a
            eِٗ٘ r0 = r2.subs(r4)
            r2.m2382native(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.m2383this(r0, r3, r7)
            r0.mopub = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WindowCallbackC2791e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f6721e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6721e.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6721e.dispatchTrackballEvent(motionEvent);
    }

    public final void license(List list, Menu menu, int i) {
        AbstractC11517e.ad(this.f6721e, list, menu, i);
    }

    public final void metrica(int i, Menu menu) {
        this.f6721e.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6721e.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6721e.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f6721e.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f6719e) {
            this.f6721e.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC8939e)) {
            return this.f6721e.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f6721e.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f6721e.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f6721e.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        vip(i, menu);
        if (i == 108) {
            LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = this.f6717e;
            layoutInflaterFactory2C8158e.crashlytics();
            C0573e c0573e = layoutInflaterFactory2C8158e.f16578e;
            if (c0573e != null) {
                ArrayList arrayList = c0573e.crashlytics;
                if (true != c0573e.subs) {
                    c0573e.subs = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f6720e) {
            this.f6721e.onPanelClosed(i, menu);
            return;
        }
        metrica(i, menu);
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = this.f6717e;
        if (i != 108) {
            if (i == 0) {
                C16951e subs = layoutInflaterFactory2C8158e.subs(i);
                if (subs.smaato) {
                    layoutInflaterFactory2C8158e.signatures(subs, false);
                    return;
                }
                return;
            }
            return;
        }
        layoutInflaterFactory2C8158e.crashlytics();
        C0573e c0573e = layoutInflaterFactory2C8158e.f16578e;
        if (c0573e != null) {
            ArrayList arrayList = c0573e.crashlytics;
            if (c0573e.subs) {
                c0573e.subs = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC4152e.ad(this.f6721e, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC8939e menuC8939e = menu instanceof MenuC8939e ? (MenuC8939e) menu : null;
        if (i == 0 && menuC8939e == null) {
            return false;
        }
        if (menuC8939e != null) {
            menuC8939e.f17944e = true;
        }
        boolean onPreparePanel = this.f6721e.onPreparePanel(i, view, menu);
        if (menuC8939e != null) {
            menuC8939e.f17944e = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC8939e menuC8939e = this.f6717e.subs(0).yandex;
        if (menuC8939e != null) {
            license(list, menuC8939e, i);
        } else {
            license(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f6721e.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC18385e.ad(this.f6721e, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6721e.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f6721e.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [eٌّٕ, java.lang.Object, eٍۧٗ, e٘ۢۧ] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        if (i != 0) {
            return AbstractC18385e.vip(this.f6721e, callback, i);
        }
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = this.f6717e;
        Context context = layoutInflaterFactory2C8158e.f16587e;
        C11106e c11106e = new C11106e(context, callback);
        AbstractC12364e abstractC12364e = layoutInflaterFactory2C8158e.f16565e;
        if (abstractC12364e != null) {
            abstractC12364e.vip();
        }
        C18540e c18540e = new C18540e(layoutInflaterFactory2C8158e, c11106e, false, 6);
        layoutInflaterFactory2C8158e.crashlytics();
        C0573e c0573e = layoutInflaterFactory2C8158e.f16578e;
        int i2 = 1;
        if (c0573e != null) {
            C5999e c5999e = c0573e.applovin;
            if (c5999e != null) {
                c5999e.vip();
            }
            c0573e.pro.setHideOnContentScrollEnabled(false);
            c0573e.isVip.appmetrica();
            C5999e c5999e2 = new C5999e(c0573e, c0573e.isVip.getContext(), c18540e);
            MenuC8939e menuC8939e = c5999e2.f12639e;
            menuC8939e.isVip();
            try {
                if (((C11106e) c5999e2.f12637e.f36383e).m3012instanceof(c5999e2, menuC8939e)) {
                    c0573e.applovin = c5999e2;
                    c5999e2.startapp();
                    c0573e.isVip.metrica(c5999e2);
                    c0573e.appmetrica(true);
                } else {
                    c5999e2 = null;
                }
                layoutInflaterFactory2C8158e.f16565e = c5999e2;
            } finally {
                menuC8939e.tapsense();
            }
        }
        if (layoutInflaterFactory2C8158e.f16565e == null) {
            C14712e c14712e = layoutInflaterFactory2C8158e.f16588e;
            if (c14712e != null) {
                c14712e.vip();
            }
            AbstractC12364e abstractC12364e2 = layoutInflaterFactory2C8158e.f16565e;
            if (abstractC12364e2 != null) {
                abstractC12364e2.vip();
            }
            if (layoutInflaterFactory2C8158e.f16589e == null) {
                if (layoutInflaterFactory2C8158e.f16579e) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C4411e c4411e = new C4411e(context, 0);
                        c4411e.getTheme().setTo(newTheme);
                        context = c4411e;
                    }
                    layoutInflaterFactory2C8158e.f16589e = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C8158e.f16599e = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    layoutInflaterFactory2C8158e.f16599e.setContentView(layoutInflaterFactory2C8158e.f16589e);
                    layoutInflaterFactory2C8158e.f16599e.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C8158e.f16589e.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C8158e.f16599e.setHeight(-2);
                    layoutInflaterFactory2C8158e.f16601e = new RunnableC17898e(layoutInflaterFactory2C8158e, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C8158e.f16585e.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C8158e.crashlytics();
                        C0573e c0573e2 = layoutInflaterFactory2C8158e.f16578e;
                        Context purchase = c0573e2 != null ? c0573e2.purchase() : null;
                        if (purchase != null) {
                            context = purchase;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C8158e.f16589e = (ActionBarContextView) viewStubCompat.ad();
                    }
                }
            }
            if (layoutInflaterFactory2C8158e.f16589e != null) {
                C14712e c14712e2 = layoutInflaterFactory2C8158e.f16588e;
                if (c14712e2 != null) {
                    c14712e2.vip();
                }
                layoutInflaterFactory2C8158e.f16589e.appmetrica();
                Context context2 = layoutInflaterFactory2C8158e.f16589e.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C8158e.f16589e;
                ?? obj = new Object();
                obj.f19624e = context2;
                obj.f19626e = actionBarContextView;
                obj.f19623e = c18540e;
                MenuC8939e menuC8939e2 = new MenuC8939e(actionBarContextView.getContext());
                menuC8939e2.f17927e = 1;
                obj.f19625e = menuC8939e2;
                menuC8939e2.f17925e = obj;
                if (c11106e.m3012instanceof(obj, menuC8939e2)) {
                    obj.startapp();
                    layoutInflaterFactory2C8158e.f16589e.metrica(obj);
                    layoutInflaterFactory2C8158e.f16565e = obj;
                    if (layoutInflaterFactory2C8158e.f16584e && (viewGroup = layoutInflaterFactory2C8158e.f16585e) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C8158e.f16589e.setAlpha(0.0f);
                        C14712e vip = AbstractC2016e.vip(layoutInflaterFactory2C8158e.f16589e);
                        vip.ad(1.0f);
                        layoutInflaterFactory2C8158e.f16588e = vip;
                        vip.license(new C4575e(i2, layoutInflaterFactory2C8158e));
                    } else {
                        layoutInflaterFactory2C8158e.f16589e.setAlpha(1.0f);
                        layoutInflaterFactory2C8158e.f16589e.setVisibility(0);
                        if (layoutInflaterFactory2C8158e.f16589e.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C8158e.f16589e.getParent();
                            WeakHashMap weakHashMap = AbstractC2016e.ad;
                            view.requestApplyInsets();
                        }
                    }
                    if (layoutInflaterFactory2C8158e.f16599e != null) {
                        layoutInflaterFactory2C8158e.f16563e.getDecorView().post(layoutInflaterFactory2C8158e.f16601e);
                    }
                } else {
                    layoutInflaterFactory2C8158e.f16565e = null;
                }
            }
            layoutInflaterFactory2C8158e.m2384throw();
            layoutInflaterFactory2C8158e.f16565e = layoutInflaterFactory2C8158e.f16565e;
        }
        layoutInflaterFactory2C8158e.m2384throw();
        AbstractC12364e abstractC12364e3 = layoutInflaterFactory2C8158e.f16565e;
        if (abstractC12364e3 != null) {
            return c11106e.subs(abstractC12364e3);
        }
        return null;
    }

    public final boolean vip(int i, Menu menu) {
        return this.f6721e.onMenuOpened(i, menu);
    }
}
