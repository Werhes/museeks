package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؒٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1059e extends ViewGroup implements InterfaceC11572e {

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public static VKXApplication f3557e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC10178e f3560e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final ArrayList f3561e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public InterfaceC10956e f3562e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f3563e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public InterfaceC10817e f3564e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final int f3565e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final Rect f3566e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public float f3567e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public InterfaceC10817e f3568e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f3569e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f3570e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C2691e f3571e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Stack f3572e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public int f3573e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final int[] f3574e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public float f3575e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public int f3576e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public EnumC9210e f3577e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final int[] f3578e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f3579e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Runnable f3580e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f3581e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C15024e f3582e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final View f3583e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public InterfaceC17022e f3584e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Stack f3585e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Stack f3586e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public EnumC9210e[] f3587e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public static InterfaceC9488e f3556e = new C17424e(3);

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public static float f3558e = 45.0f;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public static InterfaceC17022e f3555e = InterfaceC17022e.f33346e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public static InterfaceC10817e f3559e = InterfaceC10817e.f21454e;

    public C1059e(Context context) {
        super(context);
        this.f3586e = new Stack();
        this.f3585e = new Stack();
        this.f3572e = new Stack();
        this.f3575e = 0.0f;
        this.f3561e = new ArrayList();
        this.f3566e = new Rect();
        new Rect();
        this.f3587e = new EnumC9210e[0];
        this.f3576e = 0;
        this.f3573e = 0;
        this.f3574e = new int[4];
        this.f3578e = new int[4];
        View view = new View(getContext());
        this.f3583e = view;
        view.setBackgroundColor(352321536);
        this.f3571e = new C2691e(getContext(), new C1770e(1, this));
        this.f3565e = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        this.f3570e = getLayoutDirection() == 1;
    }

    public static void ad(View view) {
        int[] iArr;
        if (view == null || (iArr = (int[]) view.getTag(R.id.insets_tag)) == null || iArr.length != 4) {
            return;
        }
        view.setTranslationX(view.getTranslationX() + iArr[0]);
        view.setTranslationY(view.getTranslationY() + iArr[1]);
    }

    public static Activity billing(Context context) {
        Activity billing;
        if ((context instanceof ContextWrapper) && (billing = billing(((ContextWrapper) context).getBaseContext())) != null) {
            return billing;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static Context getAppContext() {
        return f3557e;
    }

    public static InterfaceC10817e getDefaultTouchTransformer() {
        return f3559e;
    }

    public static InterfaceC17022e getDefaultTransformer() {
        return f3555e;
    }

    public static InterfaceC9488e getSpringModule() {
        return f3556e;
    }

    public static void setDefaultTouchTransformer(InterfaceC10817e interfaceC10817e) {
        f3559e = interfaceC10817e;
    }

    public static void setDefaultTransformer(InterfaceC17022e interfaceC17022e) {
        f3555e = interfaceC17022e;
    }

    public static void setSpringModule(InterfaceC9488e interfaceC9488e) {
        f3556e = interfaceC9488e;
    }

    public static void setTriggerAngle(float f) {
        f3558e = f;
    }

    public final boolean adcel(View view, MotionEvent motionEvent, EnumC9210e enumC9210e, Rect rect) {
        view.getGlobalVisibleRect(rect);
        if (view.getVisibility() != 0 || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        if (view instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) view;
            return (enumC9210e.vip(this.f3570e) && viewPager.getCurrentItem() != 0) || !(viewPager.getAdapter() == null || viewPager.getCurrentItem() == viewPager.getAdapter().vip() - 1 || !enumC9210e.metrica(this.f3570e));
        }
        if (enumC9210e.ad()) {
            return view.canScrollHorizontally(enumC9210e.vip(this.f3570e) ? -1 : 1);
        }
        return view.canScrollVertically(enumC9210e == EnumC9210e.f18397e ? -1 : 1);
    }

    public final boolean advert(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f3581e) {
            return true;
        }
        if (((GestureDetector) this.f3571e.f6570e).onTouchEvent(motionEvent) || !(action == 1 || action == 3)) {
            return this.f3569e;
        }
        if (!this.f3569e) {
            if (!this.f3579e) {
                return false;
            }
            vip();
            return false;
        }
        vip();
        if (this.f3575e < 0.5f) {
            this.f3581e = false;
            this.f3582e = null;
            purchase(true, false);
            return false;
        }
        if (this.f3581e) {
            return false;
        }
        this.f3581e = true;
        AbstractC13859e abstractC13859e = (AbstractC13859e) this.f3585e.peek();
        AbstractC13859e abstractC13859e2 = (AbstractC13859e) this.f3585e.get(r1.size() - 2);
        this.f3582e = new C15024e(abstractC13859e2, abstractC13859e, abstractC13859e2.remoteconfig());
        Iterator it = this.f3561e.iterator();
        while (it.hasNext()) {
            ((C16779e) ((InterfaceC5259e) it.next())).vip(abstractC13859e2, abstractC13859e);
        }
        View frontView = getFrontView();
        View backView = getBackView();
        ((InterfaceC17022e) this.f3582e.f29787e).getClass();
        C17424e c17424e = (C17424e) f3556e;
        C9142e m2229throws = ((C6594e) c17424e.f34142e).m2229throws((C14391e) c17424e.f34141e);
        RunnableC7410e runnableC7410e = new RunnableC7410e(this, m2229throws, backView, frontView);
        float f = this.f3575e;
        C18051e c18051e = (C18051e) m2229throws.vip;
        if (c18051e.purchase) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
            }
            if (c18051e.purchase) {
                c18051e.ad(true);
            }
        }
        c18051e.vip = f;
        c18051e.metrica = true;
        C2326e c2326e = c18051e.smaato;
        m2229throws.ad = f;
        c2326e.startapp = f;
        Iterator it2 = ((ArrayList) m2229throws.appmetrica).iterator();
        while (it2.hasNext()) {
            ((InterfaceC7781e) it2.next()).ad(m2229throws);
        }
        m2229throws.ad(new C9044e(this, 0));
        ((ArrayList) m2229throws.license).add(new C1977e(this, runnableC7410e));
        if (this.f3575e < 0.99d) {
            m2229throws.license();
            return false;
        }
        this.f3575e = 1.0f;
        yandex();
        post(runnableC7410e);
        return false;
    }

    public final void amazon(Stack stack, boolean z) {
        this.f3572e = new Stack();
        int i = 0;
        while (true) {
            if (i >= stack.size()) {
                break;
            }
            this.f3572e.push(null);
            i++;
        }
        Stack stack2 = this.f3586e;
        if (z) {
            stack2.clear();
            Iterator it = this.f3585e.iterator();
            while (it.hasNext()) {
                ((AbstractC13859e) it.next()).applovin();
            }
        }
        this.f3585e = stack;
        if (z) {
            removeAllViews();
            stack2.clear();
            Iterator it2 = this.f3585e.iterator();
            while (it2.hasNext()) {
                ((AbstractC13859e) it2.next()).m3686interface(this);
            }
            for (int i2 = 0; i2 < this.f3585e.size(); i2++) {
                AbstractC13859e abstractC13859e = (AbstractC13859e) this.f3585e.get(i2);
                if (abstractC13859e.f27446e != null) {
                    abstractC13859e.applovin();
                }
                View appmetrica = appmetrica(abstractC13859e);
                if (i2 >= this.f3585e.size() - 2) {
                    addView(appmetrica);
                } else {
                    stack2.push(appmetrica);
                }
                abstractC13859e.mo1847class(appmetrica);
            }
            vip();
            yandex();
            int size = this.f3585e.size();
            AbstractC13859e abstractC13859e2 = size > 0 ? (AbstractC13859e) this.f3585e.peek() : null;
            AbstractC13859e abstractC13859e3 = size > 1 ? (AbstractC13859e) this.f3585e.get(size - 2) : null;
            Iterator it3 = this.f3561e.iterator();
            while (it3.hasNext()) {
                C16779e c16779e = (C16779e) ((InterfaceC5259e) it3.next());
                c16779e.vip(abstractC13859e3, abstractC13859e2);
                c16779e.metrica(null, abstractC13859e3, abstractC13859e2, 1.0f);
            }
            this.f3581e = false;
            if (this.f3585e.size() > 1) {
                C1059e c1059e = abstractC13859e3.f27447e;
                InterfaceC10817e instanceDefaultTouchTransformer = c1059e != null ? c1059e.getInstanceDefaultTouchTransformer() : null;
                if (instanceDefaultTouchTransformer == null) {
                    instanceDefaultTouchTransformer = getDefaultTouchTransformer();
                }
                this.f3564e = instanceDefaultTouchTransformer;
                ((C14595e) instanceDefaultTouchTransformer).getClass();
                this.f3587e = new EnumC9210e[]{EnumC9210e.f18400e};
            }
            if (getBackView() != null) {
                getBackView().setVisibility(8);
            }
        }
    }

    public final View appmetrica(AbstractC13859e abstractC13859e) {
        View view = abstractC13859e.f27446e;
        if (view != null) {
            abstractC13859e.m3686interface(this);
            AbstractC9019e abstractC9019e = (AbstractC9019e) abstractC13859e;
            abstractC9019e.mo2515native(this.f3576e);
            abstractC9019e.mo1393this(this.f3573e);
            abstractC13859e.premium();
            return view;
        }
        abstractC13859e.m3686interface(this);
        abstractC13859e.isVip();
        View isPro = abstractC13859e.isPro(this);
        if (isPro == null) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(abstractC13859e.getClass().getName());
            sb.append("#");
            throw new NullPointerException(AbstractC17861e.smaato(abstractC13859e.f27448e, " returned null view!", sb));
        }
        isPro.setTag(R.id.fragment_tag, abstractC13859e);
        abstractC13859e.mo1847class(isPro);
        AbstractC9019e abstractC9019e2 = (AbstractC9019e) abstractC13859e;
        abstractC9019e2.mo2515native(this.f3576e);
        abstractC9019e2.mo1393this(this.f3573e);
        abstractC13859e.premium();
        return isPro;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View frontView = getFrontView();
        View backView = getBackView();
        long drawingTime = getDrawingTime();
        if (backView != null && backView.getVisibility() == 0) {
            int save = canvas.save();
            C15024e c15024e = this.f3582e;
            if (c15024e != null) {
                ((InterfaceC17022e) c15024e.f29787e).getClass();
            }
            drawChild(canvas, backView, drawingTime);
            canvas.restoreToCount(save);
        }
        View view = this.f3583e;
        if (view != null && view.getVisibility() == 0) {
            float f = this.f3575e;
            if (f != 0.0f && f != 1.0f) {
                drawChild(canvas, view, drawingTime);
            }
        }
        if (frontView == null || frontView.getVisibility() != 0) {
            return;
        }
        int save2 = canvas.save();
        C15024e c15024e2 = this.f3582e;
        if (c15024e2 != null) {
            ((InterfaceC17022e) c15024e2.f29787e).getClass();
        }
        drawChild(canvas, frontView, drawingTime);
        canvas.restoreToCount(save2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f3563e) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 4 && keyCode != 111) {
            return false;
        }
        if (getFragmentStack().size() > 1) {
            purchase(true, true);
            return true;
        }
        Runnable runnable = this.f3580e;
        if (runnable != null) {
            runnable.run();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (advert(motionEvent)) {
            return true;
        }
        if (getChildCount() < 1 || getFrontView() == null) {
            return false;
        }
        View frontView = getFrontView();
        if (((AbstractC13859e) frontView.getTag(R.id.fragment_tag)).f27450e != null) {
            motionEvent.offsetLocation(-r3[0], -r3[1]);
        }
        boolean dispatchTouchEvent = frontView.dispatchTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (dispatchTouchEvent || actionMasked != 0) {
            return dispatchTouchEvent;
        }
        return true;
    }

    public View getBackView() {
        if (this.f3585e.size() <= 1 || getChildCount() < 1) {
            return null;
        }
        return getChildAt(0);
    }

    /* renamed from: getCurrentFragment, reason: merged with bridge method [inline-methods] */
    public AbstractC13859e m461getCurrentFragment() {
        if (this.f3585e.isEmpty()) {
            return null;
        }
        return (AbstractC13859e) this.f3585e.peek();
    }

    public Stack<View> getDestroyedViews() {
        return this.f3586e;
    }

    public AbstractC1801e getDrawerLayout() {
        return null;
    }

    public Stack<AbstractC13859e> getFragmentStack() {
        return this.f3585e;
    }

    public View getFrontView() {
        if (this.f3585e.isEmpty()) {
            return null;
        }
        return getChildAt(getChildCount() - 1);
    }

    public InterfaceC10178e getInsetExtension() {
        return this.f3560e;
    }

    public InterfaceC10817e getInstanceDefaultTouchTransformer() {
        return this.f3568e;
    }

    public InterfaceC17022e getInstanceDefaultTransitionTransformer() {
        return this.f3584e;
    }

    public EnumC9210e getScrollSide() {
        return this.f3577e;
    }

    public List<InterfaceC5259e> getSharedTransformListeners() {
        return this.f3561e;
    }

    public final void license(int i) {
        this.f3576e = i;
        Iterator it = this.f3585e.iterator();
        while (it.hasNext()) {
            ((AbstractC9019e) ((AbstractC13859e) it.next())).mo2515native(i);
        }
    }

    public final void metrica(int i) {
        this.f3573e = i;
        Iterator it = this.f3585e.iterator();
        while (it.hasNext()) {
            ((AbstractC9019e) ((AbstractC13859e) it.next())).mo1393this(i);
        }
    }

    public final void mopub() {
        C15024e c15024e = this.f3582e;
        if (c15024e != null && ((InterfaceC17022e) c15024e.f29787e) != null) {
            getFrontView();
            getBackView();
            ((InterfaceC17022e) this.f3582e.f29787e).getClass();
        }
        AbstractC13859e abstractC13859e = (AbstractC13859e) this.f3585e.pop();
        this.f3572e.pop();
        View frontView = getFrontView();
        if (frontView != null) {
            frontView.setVisibility(8);
            removeView(frontView);
        }
        abstractC13859e.applovin();
        this.f3582e = null;
        this.f3575e = 0.0f;
        yandex();
        InterfaceC10956e interfaceC10956e = this.f3562e;
        if (interfaceC10956e != null) {
            ((AbstractActivityC17704e) interfaceC10956e).tapsense();
        }
        if (getChildCount() < 2) {
            Stack stack = this.f3586e;
            if (!stack.isEmpty() && this.f3585e.size() > 1) {
                View view = (View) stack.pop();
                view.setVisibility(8);
                addView(view, 0);
                Stack stack2 = this.f3585e;
                ((AbstractC13859e) stack2.get(stack2.size() - 2)).crashlytics();
            }
        }
        if (this.f3585e.size() > 1) {
            Stack stack3 = this.f3585e;
            AbstractC13859e abstractC13859e2 = (AbstractC13859e) stack3.get(stack3.size() - 2);
            C1059e c1059e = abstractC13859e2.f27447e;
            InterfaceC10817e instanceDefaultTouchTransformer = c1059e != null ? c1059e.getInstanceDefaultTouchTransformer() : null;
            if (instanceDefaultTouchTransformer == null) {
                instanceDefaultTouchTransformer = getDefaultTouchTransformer();
            }
            this.f3564e = instanceDefaultTouchTransformer;
            ((C14595e) instanceDefaultTouchTransformer).getClass();
            this.f3587e = new EnumC9210e[]{EnumC9210e.f18400e};
        }
        int size = this.f3585e.size();
        AbstractC13859e abstractC13859e3 = size > 0 ? (AbstractC13859e) this.f3585e.peek() : null;
        AbstractC13859e abstractC13859e4 = size > 1 ? (AbstractC13859e) this.f3585e.get(size - 2) : null;
        Iterator it = this.f3561e.iterator();
        while (it.hasNext()) {
            C16779e c16779e = (C16779e) ((InterfaceC5259e) it.next());
            c16779e.vip(abstractC13859e4, abstractC13859e3);
            this.f3575e = 1.0f;
            c16779e.metrica(null, abstractC13859e4, abstractC13859e3, 1.0f);
        }
        this.f3581e = false;
        vip();
        if (getBackView() != null) {
            getBackView().setVisibility(8);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        this.f3570e = getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3569e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        char c;
        char c2;
        int[] iArr;
        int paddingLeft = getPaddingLeft() + i;
        int paddingTop = getPaddingTop() + i2;
        int paddingRight = i3 - getPaddingRight();
        int paddingBottom = i4 - getPaddingBottom();
        if (getChildCount() > 0) {
            View frontView = getFrontView();
            View backView = getBackView();
            int[] iArr2 = this.f3578e;
            if (backView != null) {
                AbstractC13859e abstractC13859e = (AbstractC13859e) backView.getTag(R.id.fragment_tag);
                iArr = abstractC13859e != null ? abstractC13859e.f27450e : iArr2;
                c2 = 3;
                c = 2;
                backView.layout(iArr[0] + paddingLeft, iArr[1] + paddingTop, paddingRight + iArr[2], paddingBottom + iArr[3]);
            } else {
                c = 2;
                c2 = 3;
                iArr = iArr2;
            }
            this.f3583e.layout(iArr[0] + paddingLeft, iArr[1] + paddingTop, iArr[c] + paddingRight, iArr[c2] + paddingBottom);
            if (frontView != null) {
                AbstractC13859e abstractC13859e2 = (AbstractC13859e) frontView.getTag(R.id.fragment_tag);
                if (abstractC13859e2 != null) {
                    iArr2 = abstractC13859e2.f27450e;
                }
                frontView.layout(paddingLeft + iArr2[0], paddingTop + iArr2[1], paddingRight - iArr2[c], paddingBottom - iArr2[c2]);
            }
        }
        InterfaceC10956e interfaceC10956e = this.f3562e;
        if (interfaceC10956e != null) {
            interfaceC10956e.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            AbstractC13859e abstractC13859e = (AbstractC13859e) childAt.getTag(R.id.fragment_tag);
            int[] iArr = this.f3574e;
            Arrays.fill(iArr, 0);
            if (abstractC13859e != 0) {
                InterfaceC10178e interfaceC10178e = this.f3560e;
                if (interfaceC10178e != null) {
                    C16779e c16779e = (C16779e) ((C2007e) interfaceC10178e).f5254e;
                    if (abstractC13859e instanceof InterfaceC12650e) {
                        c16779e.getClass();
                        int m2915default = ((AbstractC10716e) ((InterfaceC12650e) abstractC13859e)).m2915default();
                        iArr[1] = m2915default != -1 ? m2915default + c16779e.f32880e : 0;
                    } else {
                        iArr[1] = c16779e.f32880e;
                    }
                }
                int[] iArr2 = abstractC13859e.f27450e;
                System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            }
            int paddingLeft = getPaddingLeft() + iArr[0];
            int paddingTop = getPaddingTop() + iArr[1];
            int paddingRight = getPaddingRight() + iArr[2];
            int paddingBottom = getPaddingBottom() + iArr[3];
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - paddingLeft) - paddingRight, View.MeasureSpec.getMode(i));
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - paddingTop) - paddingBottom, View.MeasureSpec.getMode(i2));
            childAt.getLayoutParams();
            childAt.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        this.f3583e.measure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        advert(motionEvent);
        return true;
    }

    public final void purchase(boolean z, boolean z2) {
        View view;
        if (this.f3582e != null || this.f3581e || this.f3569e) {
            return;
        }
        if (this.f3585e.size() <= 1) {
            Runnable runnable = this.f3580e;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (!z) {
            mopub();
            view = this.f3585e.size() > 1 ? (View) this.f3572e.get(this.f3585e.size() - 2) : null;
            if (view != null) {
                view.requestFocus();
                return;
            }
            return;
        }
        this.f3581e = true;
        AbstractC13859e abstractC13859e = (AbstractC13859e) this.f3585e.peek();
        AbstractC13859e abstractC13859e2 = (AbstractC13859e) this.f3585e.get(r2.size() - 2);
        this.f3582e = new C15024e(abstractC13859e2, abstractC13859e, abstractC13859e2.remoteconfig());
        Iterator it = this.f3561e.iterator();
        while (it.hasNext()) {
            ((C16779e) ((InterfaceC5259e) it.next())).vip(abstractC13859e2, abstractC13859e);
        }
        if (getBackView() != null) {
            getBackView().setVisibility(0);
            view = this.f3585e.size() > 1 ? (View) this.f3572e.get(this.f3585e.size() - 2) : null;
            if (view != null) {
                view.requestFocus();
            }
        }
        getFrontView();
        getBackView();
        ((InterfaceC17022e) this.f3582e.f29787e).getClass();
        C17424e c17424e = (C17424e) f3556e;
        C9142e m2229throws = ((C6594e) c17424e.f34142e).m2229throws((C14391e) c17424e.f34141e);
        if (z2) {
            this.f3575e = 1.0f;
        }
        final float f = this.f3575e;
        final float f2 = 1.0f - f;
        m2229throws.ad(new InterfaceC7781e() { // from class: eٔ۠ۨ
            @Override // defpackage.InterfaceC7781e
            public final void ad(C9142e c9142e) {
                C1059e c1059e = C1059e.this;
                c1059e.f3575e = (float) (1.0d - ((c9142e.ad * f) + f2));
                c1059e.yandex();
                if (c1059e.f3575e == 0.0f) {
                    c9142e.vip();
                    c1059e.mopub();
                }
            }
        });
        m2229throws.license();
    }

    public void setAnimationInProgress(boolean z) {
        this.f3581e = z;
    }

    public void setDrawerLayout(AbstractC1801e abstractC1801e) {
    }

    public void setFragmentStack(Stack<AbstractC13859e> stack) {
        amazon(stack, true);
    }

    public void setInsetExtension(InterfaceC10178e interfaceC10178e) {
        this.f3560e = interfaceC10178e;
    }

    public void setInstanceDefaultTouchTransformer(InterfaceC10817e interfaceC10817e) {
        this.f3568e = interfaceC10817e;
    }

    public void setInstanceDefaultTransitionTransformer(InterfaceC17022e interfaceC17022e) {
        this.f3584e = interfaceC17022e;
    }

    public void setListenForBackPress(boolean z) {
        this.f3563e = z;
    }

    public void setNavigationListener(InterfaceC10956e interfaceC10956e) {
        this.f3562e = interfaceC10956e;
    }

    public void setOnBackPressCloseCallback(Runnable runnable) {
        this.f3580e = runnable;
    }

    public final void smaato(AbstractC13859e abstractC13859e) {
        if (this.f3582e != null || this.f3581e || this.f3569e) {
            return;
        }
        if (!this.f3585e.isEmpty()) {
            this.f3581e = true;
            this.f3572e.set(this.f3585e.size() - 1, m461getCurrentFragment().f27446e.findFocus());
        }
        this.f3575e = 0.0f;
        AbstractC13859e abstractC13859e2 = this.f3585e.isEmpty() ? null : (AbstractC13859e) this.f3585e.peek();
        this.f3582e = new C15024e(abstractC13859e2, abstractC13859e, this.f3585e.isEmpty() ? InterfaceC17022e.f33348e : abstractC13859e2.remoteconfig());
        View appmetrica = appmetrica(abstractC13859e);
        appmetrica.setVisibility(8);
        addView(appmetrica);
        this.f3585e.push(abstractC13859e);
        this.f3572e.push(null);
        Iterator it = this.f3561e.iterator();
        while (it.hasNext()) {
            ((C16779e) ((InterfaceC5259e) it.next())).vip(abstractC13859e2, abstractC13859e);
        }
        if (getChildCount() > 2) {
            View childAt = getChildAt(0);
            removeView(childAt);
            this.f3586e.push(childAt);
            ((AbstractC13859e) this.f3585e.get(r0.size() - 3)).ads();
        }
        View frontView = getFrontView();
        View backView = getBackView();
        ((InterfaceC17022e) this.f3582e.f29787e).getClass();
        this.f3585e.size();
        C6594e c6594e = (C6594e) ((C17424e) f3556e).f34142e;
        ((InterfaceC17022e) this.f3582e.f29787e).getClass();
        C9142e m2229throws = c6594e.m2229throws((C14391e) ((C17424e) f3556e).f34141e);
        ((ArrayList) m2229throws.license).add(new C5378e(this, appmetrica, backView, frontView, abstractC13859e));
        m2229throws.ad(new C9044e(this, 1));
        m2229throws.license();
    }

    public final boolean startapp(ViewGroup viewGroup, MotionEvent motionEvent, EnumC9210e enumC9210e, Rect rect) {
        if (viewGroup == null) {
            return false;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (adcel(childAt, motionEvent, enumC9210e, rect)) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && startapp((ViewGroup) childAt, motionEvent, enumC9210e, rect)) {
                return true;
            }
        }
        return adcel(viewGroup, motionEvent, enumC9210e, rect);
    }

    public final void vip() {
        this.f3579e = false;
        this.f3569e = false;
        this.f3581e = false;
    }

    public final void yandex() {
        AbstractC13859e abstractC13859e;
        View frontView = getFrontView();
        View backView = getBackView();
        if (backView == null) {
            this.f3575e = 0.0f;
        }
        C15024e c15024e = this.f3582e;
        if (c15024e != null) {
            this.f3583e.setAlpha(((InterfaceC17022e) c15024e.f29787e).metrica() ? this.f3575e : 0.0f);
        }
        C15024e c15024e2 = this.f3582e;
        if (c15024e2 != null) {
            if (backView != null) {
                ((InterfaceC17022e) c15024e2.f29787e).vip(this, backView, 1, this.f3575e);
            }
            ((InterfaceC17022e) this.f3582e.f29787e).vip(this, frontView, 2, this.f3575e);
        } else {
            if (backView != null) {
                backView.setTranslationX(0.0f);
                backView.setTranslationY(0.0f);
                backView.setScaleY(1.0f);
                backView.setScaleX(1.0f);
            }
            if (frontView != null) {
                frontView.setTranslationX(0.0f);
                frontView.setTranslationY(0.0f);
                frontView.setScaleY(1.0f);
                frontView.setScaleX(1.0f);
            }
        }
        ad(frontView);
        ad(backView);
        float f = this.f3575e;
        if (getChildCount() > 0) {
            C15024e c15024e3 = this.f3582e;
            ArrayList arrayList = this.f3561e;
            if (c15024e3 != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC5259e interfaceC5259e = (InterfaceC5259e) it.next();
                    C15024e c15024e4 = this.f3582e;
                    C16779e c16779e = (C16779e) interfaceC5259e;
                    c16779e.getClass();
                    AbstractC13859e abstractC13859e2 = (AbstractC13859e) c15024e4.f29788e;
                    AbstractC13859e abstractC13859e3 = (AbstractC13859e) c15024e4.f29789e;
                    InterfaceC17022e interfaceC17022e = (InterfaceC17022e) c15024e4.f29787e;
                    c16779e.metrica(interfaceC17022e instanceof billing ? (billing) interfaceC17022e : null, abstractC13859e3, abstractC13859e2, f);
                }
            } else if (!this.f3585e.isEmpty()) {
                AbstractC13859e abstractC13859e4 = (AbstractC13859e) this.f3585e.peek();
                if (this.f3585e.size() > 1) {
                    Stack stack = this.f3585e;
                    abstractC13859e = (AbstractC13859e) stack.get(stack.size() - 2);
                } else {
                    abstractC13859e = null;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C16779e c16779e2 = (C16779e) ((InterfaceC5259e) it2.next());
                    c16779e2.getClass();
                    c16779e2.metrica(null, abstractC13859e, abstractC13859e4, f);
                }
            }
        }
        invalidate();
    }
}
