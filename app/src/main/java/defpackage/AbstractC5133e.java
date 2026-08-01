package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5133e extends ViewGroup {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C14843e f11003e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C9243e f11004e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public IBinder f11005e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f11006e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AbstractC5830e f11007e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f11008e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public WeakReference f11009e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f11010e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Function0 f11011e;

    public AbstractC5133e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC3060e viewOnAttachStateChangeListenerC3060e = new ViewOnAttachStateChangeListenerC3060e(this, 1);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3060e);
        C11691e c11691e = new C11691e(this);
        AbstractC6069e.billing(this).ad.add(c11691e);
        this.f11011e = new C4676e(this, viewOnAttachStateChangeListenerC3060e, c11691e);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(AbstractC5830e abstractC5830e) {
        if (this.f11007e != abstractC5830e) {
            this.f11007e = abstractC5830e;
            if (abstractC5830e != null) {
                this.f11009e = null;
            }
            C9243e c9243e = this.f11004e;
            if (c9243e != null) {
                c9243e.ad();
                this.f11004e = null;
                if (isAttachedToWindow()) {
                    purchase();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f11005e != iBinder) {
            this.f11005e = iBinder;
            this.f11009e = null;
        }
    }

    public abstract void ad(C13770e c13770e, int i);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [eّؖٝ, java.lang.Object] */
    public final AbstractC5830e adcel() {
        C8574e c8574e;
        InterfaceC8850e interfaceC8850e;
        C4886e c4886e;
        AbstractC5830e abstractC5830e = this.f11007e;
        if (abstractC5830e == null) {
            abstractC5830e = AbstractC2830e.ad(this);
            if (abstractC5830e == null) {
                Object parent = getParent();
                while (abstractC5830e == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC5830e = AbstractC2830e.ad(view);
                    parent = AbstractC9110e.appmetrica(view);
                }
            }
            if (abstractC5830e != null) {
                AbstractC5830e abstractC5830e2 = (!(abstractC5830e instanceof C8574e) || ((EnumC18411e) ((C8574e) abstractC5830e).tapsense.getValue()).compareTo(EnumC18411e.f36095e) > 0) ? abstractC5830e : null;
                if (abstractC5830e2 != null) {
                    this.f11009e = new WeakReference(abstractC5830e2);
                }
            } else {
                abstractC5830e = null;
            }
            if (abstractC5830e == null) {
                WeakReference weakReference = this.f11009e;
                if (weakReference == null || (abstractC5830e = (AbstractC5830e) weakReference.get()) == null || ((abstractC5830e instanceof C8574e) && ((EnumC18411e) ((C8574e) abstractC5830e).tapsense.getValue()).compareTo(EnumC18411e.f36095e) <= 0)) {
                    abstractC5830e = null;
                }
                if (abstractC5830e == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC14070e.metrica("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object appmetrica = AbstractC9110e.appmetrica(this);
                    View view2 = this;
                    while (appmetrica instanceof View) {
                        View view3 = (View) appmetrica;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        appmetrica = view3.getParent();
                    }
                    AbstractC5830e ad = AbstractC2830e.ad(view2);
                    if (ad == null) {
                        ((C9523e) AbstractC11393e.ad.get()).getClass();
                        C2693e c2693e = C2693e.f6576e;
                        C5363e c5363e = C4377e.f9525e;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC8850e = (InterfaceC8850e) C4377e.f9525e.getValue();
                        } else {
                            interfaceC8850e = (InterfaceC8850e) C4377e.f9526e.get();
                            if (interfaceC8850e == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        InterfaceC8850e mo394const = interfaceC8850e.mo394const(c2693e);
                        InterfaceC9089e interfaceC9089e = (InterfaceC9089e) mo394const.mo397public(C12575e.f25231e);
                        if (interfaceC9089e != null) {
                            C4886e c4886e2 = new C4886e(interfaceC9089e);
                            C5609e c5609e = (C5609e) c4886e2.f10364e;
                            synchronized (c5609e.f11962e) {
                                c5609e.f11963e = false;
                                Unit unit = Unit.INSTANCE;
                                c4886e = c4886e2;
                            }
                        } else {
                            c4886e = 0;
                        }
                        ?? obj = new Object();
                        InterfaceC8850e interfaceC8850e2 = (InterfaceC17083e) mo394const.mo397public(C5107e.f10971e);
                        if (interfaceC8850e2 == null) {
                            interfaceC8850e2 = new C14835e(view2.getContext().getApplicationContext());
                            obj.f9318e = interfaceC8850e2;
                        }
                        if (c4886e != 0) {
                            c2693e = c4886e;
                        }
                        InterfaceC8850e mo394const2 = mo394const.mo394const(c2693e).mo394const(interfaceC8850e2);
                        C8574e c8574e2 = new C8574e(mo394const2);
                        c8574e2.m2446extends();
                        C14826e ad2 = AbstractC9743e.ad(mo394const2);
                        InterfaceC16400e appmetrica2 = AbstractC0436e.appmetrica(view2);
                        AbstractC0003e vip = appmetrica2 != null ? appmetrica2.vip() : null;
                        if (vip == null) {
                            AbstractC14070e.license("ViewTreeLifecycleOwner not found from " + view2);
                            throw new C14803e(9);
                        }
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13636e(view2, c8574e2));
                        vip.ad(new C13478e(ad2, c4886e, c8574e2, obj));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, c8574e2);
                        C5162e c5162e = C5162e.f11047e;
                        Handler handler = view2.getHandler();
                        int i = AbstractC4953e.ad;
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0544e(5, AbstractC5336e.purchase(c5162e, new C12940e(handler, "windowRecomposer cleanup", false).f25795e, 0, new C7195e(c8574e2, view2, r1, 28), 2)));
                        c8574e = c8574e2;
                    } else {
                        if (!(ad instanceof C8574e)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        c8574e = (C8574e) ad;
                    }
                    r1 = ((EnumC18411e) c8574e.tapsense.getValue()).compareTo(EnumC18411e.f36095e) > 0 ? c8574e : null;
                    if (r1 != null) {
                        this.f11009e = new WeakReference(r1);
                    }
                    return c8574e;
                }
            }
        }
        return abstractC5830e;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        metrica();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        metrica();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        metrica();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        metrica();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        metrica();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        metrica();
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        metrica();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public final void appmetrica() {
        View childAt = getChildAt(0);
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC5014e ? (ViewTreeObserverOnGlobalLayoutListenerC5014e) childAt : null;
        if (viewTreeObserverOnGlobalLayoutListenerC5014e != null && viewTreeObserverOnGlobalLayoutListenerC5014e.f10649e) {
            viewTreeObserverOnGlobalLayoutListenerC5014e.getComposeViewContext().vip();
            viewTreeObserverOnGlobalLayoutListenerC5014e.f10649e = false;
        }
        C9243e c9243e = this.f11004e;
        if (c9243e != null) {
            c9243e.ad();
        }
        this.f11004e = null;
        requestLayout();
    }

    public void billing(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m1761getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        C12351e c12351e = tag instanceof C12351e ? (C12351e) tag : null;
        if (c12351e != null) {
            return c12351e.ad;
        }
        return 1;
    }

    public final C14843e getComposeViewContext$ui() {
        return this.f11003e;
    }

    public final boolean getHasComposition() {
        return this.f11004e != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f11010e;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f11008e || super.isTransitionGroup();
    }

    public final void license() {
        C14843e c14843e;
        View view;
        if (this.f11007e == null && !isAttachedToWindow() && ((c14843e = this.f11003e) == null || (view = c14843e.ad) == null || !view.isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
        purchase();
    }

    public final void metrica() {
        if (this.f11006e) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final C14843e mopub(View view, C14843e c14843e) {
        AbstractC5830e adcel = adcel();
        InterfaceC16400e appmetrica = AbstractC0436e.appmetrica(view);
        InterfaceC0816e license = AbstractC15143e.license(view);
        InterfaceC10998e vip = AbstractC15428e.vip(view);
        AbstractC5830e abstractC5830e = c14843e.vip;
        InterfaceC10998e interfaceC10998e = c14843e.license;
        InterfaceC16400e interfaceC16400e = c14843e.metrica;
        if (adcel == abstractC5830e && appmetrica == interfaceC16400e && license == c14843e.appmetrica && vip == interfaceC10998e) {
            return c14843e;
        }
        if (adcel.adcel() != c14843e.vip.adcel()) {
            appmetrica();
        }
        if (appmetrica == null) {
            appmetrica = interfaceC16400e;
        }
        C14843e c14843e2 = new C14843e(c14843e, view, adcel, appmetrica, vip == null ? interfaceC10998e : vip, license);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c14843e2));
        return c14843e2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0583e c0583e = AbstractC2830e.ad;
        Object appmetrica = AbstractC9110e.appmetrica(this);
        View view = this;
        while (appmetrica instanceof View) {
            View view2 = (View) appmetrica;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            appmetrica = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new RunnableC17584e(0, this));
        } else {
            vip();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        billing(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        purchase();
        yandex(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void purchase() {
        if (this.f11004e == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.f11006e = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    C14843e c14843e = this.f11003e;
                    if (c14843e == null) {
                        c14843e = startapp();
                    }
                    this.f11004e = AbstractC12366e.ad(this, c14843e, new C2892e(1003123809, true, new C1827e(objArr == true ? 1 : 0, this)));
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.f11006e = false;
            }
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1762setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new C12351e(i));
    }

    public final void setComposeViewContext$ui(C14843e c14843e) {
        if (this.f11003e != c14843e) {
            if (c14843e == null) {
                appmetrica();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC5014e ? (ViewTreeObserverOnGlobalLayoutListenerC5014e) childAt : null;
                if (viewTreeObserverOnGlobalLayoutListenerC5014e != null) {
                    if (viewTreeObserverOnGlobalLayoutListenerC5014e.getCoroutineContext() != c14843e.vip.adcel()) {
                        appmetrica();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC5014e.setComposeViewContext(c14843e);
                }
            }
            this.f11003e = c14843e;
        }
    }

    public final void setParentCompositionContext(AbstractC5830e abstractC5830e) {
        setParentContext(abstractC5830e);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f11010e = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5014e) ((InterfaceC16590e) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f11008e = true;
    }

    public final void setViewCompositionStrategy(InterfaceC2581e interfaceC2581e) {
        Function0 function0 = this.f11011e;
        if (function0 != null) {
            function0.invoke();
        }
        this.f11011e = interfaceC2581e.mo357while(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C14843e startapp() {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L1c
        L9:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof defpackage.ViewTreeObserverOnGlobalLayoutListenerC5014e
            if (r2 == 0) goto L15
            eٜؗؗ r0 = (defpackage.ViewTreeObserverOnGlobalLayoutListenerC5014e) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L7
            eٜٔۦ r0 = r0.getComposeViewContext()
        L1c:
            android.view.View r4 = defpackage.AbstractC7023e.license(r9)
            eٜٔۦ r2 = defpackage.AbstractC7023e.appmetrica(r4)
            if (r2 != 0) goto L80
            eؘۖۨ r5 = r9.adcel()
            eْٖٟ r2 = defpackage.AbstractC0436e.appmetrica(r4)
            if (r2 != 0) goto L38
            if (r0 == 0) goto L35
            eْٖٟ r2 = r0.metrica
            goto L36
        L35:
            r2 = r1
        L36:
            if (r2 == 0) goto L3a
        L38:
            r6 = r2
            goto L42
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            r0.<init>(r1)
            throw r0
        L42:
            eُٔؔ r2 = defpackage.AbstractC15428e.vip(r4)
            if (r2 != 0) goto L50
            if (r0 == 0) goto L4d
            eُٔؔ r2 = r0.license
            goto L4e
        L4d:
            r2 = r1
        L4e:
            if (r2 == 0) goto L52
        L50:
            r7 = r2
            goto L5a
        L52:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            r0.<init>(r1)
            throw r0
        L5a:
            eؒؔٓ r2 = defpackage.AbstractC15143e.license(r4)
            if (r2 != 0) goto L66
            if (r0 == 0) goto L64
            eؒؔٓ r1 = r0.appmetrica
        L64:
            r8 = r1
            goto L67
        L66:
            r8 = r2
        L67:
            eٜٔۦ r2 = new eٜٔۦ
            android.view.View r0 = defpackage.AbstractC7023e.license(r4)
            eٜٔۦ r3 = defpackage.AbstractC7023e.appmetrica(r0)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1 = 2131361894(0x7f0a0066, float:1.8343553E38)
            r4.setTag(r1, r0)
            return r2
        L80:
            eٜٔۦ r0 = r9.mopub(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5133e.startapp():eٜٔۦ");
    }

    public final void vip() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f11003e == null) {
                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC5014e) {
                        viewTreeObserverOnGlobalLayoutListenerC5014e = (ViewTreeObserverOnGlobalLayoutListenerC5014e) childAt;
                    }
                }
                if (viewTreeObserverOnGlobalLayoutListenerC5014e != null) {
                    viewTreeObserverOnGlobalLayoutListenerC5014e.setComposeViewContext(mopub(AbstractC7023e.license(this), viewTreeObserverOnGlobalLayoutListenerC5014e.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                purchase();
            }
        }
    }

    public void yandex(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }
}
