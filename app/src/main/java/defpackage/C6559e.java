package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6559e extends ViewGroup implements InterfaceC11975e, InterfaceC10856e, InterfaceC16573e {

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public static final int[] f13495e = {R.attr.enabled};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public float f13496e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final int f13497e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f13498e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f13499e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int[] f13500e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public int f13501e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f13502e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public int f13503e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public int f13504e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public C11792e f13505e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public InterfaceC11414e f13506e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f13507e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public float f13508e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public final C4606e f13509e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public float f13510e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public C11792e f13511e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C18418e f13512e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C8266e f13513e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public C4606e f13514e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final int[] f13515e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public int f13516e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public int f13517e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public boolean f13518e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public final AnimationAnimationListenerC11022e f13519e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public C4606e f13520e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final DecelerateInterpolator f13521e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public boolean f13522e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f13523e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final int f13524e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int[] f13525e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final int f13526e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final C4606e f13527e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public View f13528e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C12434e f13529e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public float f13530e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C13606e f13531e;

    /* JADX WARN: Type inference failed for: r3v11, types: [eَْۤ, android.widget.ImageView, android.view.View] */
    public C6559e(Activity activity) {
        super(activity, null);
        this.f13499e = false;
        this.f13496e = -1.0f;
        this.f13525e = new int[2];
        this.f13500e = new int[2];
        this.f13515e = new int[2];
        this.f13503e = -1;
        this.f13501e = -1;
        this.f13519e = new AnimationAnimationListenerC11022e(this, 0);
        this.f13509e = new C4606e(this, 2);
        this.f13527e = new C4606e(this, 3);
        this.f13523e = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.f13497e = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f13521e = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f13504e = (int) (displayMetrics.density * 40.0f);
        ?? imageView = new ImageView(getContext());
        float f = imageView.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(AbstractC11695e.ad);
        imageView.f26990e = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        imageView.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(imageView.f26990e);
        imageView.setBackground(shapeDrawable);
        this.f13531e = imageView;
        C8266e c8266e = new C8266e(getContext());
        this.f13513e = c8266e;
        c8266e.metrica(1);
        this.f13531e.setImageDrawable(this.f13513e);
        this.f13531e.setVisibility(8);
        addView(this.f13531e);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f13526e = i;
        this.f13496e = i;
        this.f13529e = new C12434e((byte) 0, 7);
        this.f13512e = new C18418e(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f13504e;
        this.f13502e = i2;
        this.f13524e = i2;
        mopub(1.0f);
        TypedArray obtainStyledAttributes2 = activity.obtainStyledAttributes((AttributeSet) null, f13495e);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f13531e.getBackground().setAlpha(i);
        this.f13513e.setAlpha(i);
    }

    public final boolean ad() {
        View view = this.f13528e;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void adcel(float f) {
        C11792e c11792e;
        C11792e c11792e2;
        C8266e c8266e = this.f13513e;
        C1935e c1935e = c8266e.f16785e;
        if (!c1935e.amazon) {
            c1935e.amazon = true;
        }
        c8266e.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.f13496e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f13496e;
        int i = this.f13516e;
        if (i <= 0) {
            i = this.f13526e;
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f13524e + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f13531e.getVisibility() != 0) {
            this.f13531e.setVisibility(0);
        }
        this.f13531e.setScaleX(1.0f);
        this.f13531e.setScaleY(1.0f);
        if (f < this.f13496e) {
            if (this.f13513e.f16785e.pro > 76 && ((c11792e2 = this.f13511e) == null || !c11792e2.hasStarted() || c11792e2.hasEnded())) {
                C11792e c11792e3 = new C11792e(this, this.f13513e.f16785e.pro, 76);
                c11792e3.setDuration(300L);
                C13606e c13606e = this.f13531e;
                c13606e.f26991e = null;
                c13606e.clearAnimation();
                this.f13531e.startAnimation(c11792e3);
                this.f13511e = c11792e3;
            }
        } else if (this.f13513e.f16785e.pro < 255 && ((c11792e = this.f13505e) == null || !c11792e.hasStarted() || c11792e.hasEnded())) {
            C11792e c11792e4 = new C11792e(this, this.f13513e.f16785e.pro, 255);
            c11792e4.setDuration(300L);
            C13606e c13606e2 = this.f13531e;
            c13606e2.f26991e = null;
            c13606e2.clearAnimation();
            this.f13531e.startAnimation(c11792e4);
            this.f13505e = c11792e4;
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        C8266e c8266e2 = this.f13513e;
        C1935e c1935e2 = c8266e2.f16785e;
        c1935e2.appmetrica = 0.0f;
        c1935e2.purchase = min2;
        c8266e2.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        C8266e c8266e3 = this.f13513e;
        C1935e c1935e3 = c8266e3.f16785e;
        if (min3 != c1935e3.Signature) {
            c1935e3.Signature = min3;
        }
        c8266e3.invalidateSelf();
        C8266e c8266e4 = this.f13513e;
        c8266e4.f16785e.billing = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        c8266e4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f13502e);
    }

    public final void advert() {
        this.f13531e.clearAnimation();
        this.f13513e.stop();
        this.f13531e.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f13524e - this.f13502e);
        this.f13502e = this.f13531e.getTop();
    }

    public final void amazon(boolean z, boolean z2) {
        if (!z || this.f13499e == z) {
            smaato(z, false);
            return;
        }
        this.f13499e = z;
        setTargetOffsetTopAndBottom((this.f13526e + this.f13524e) - this.f13502e);
        this.f13518e = z2;
        this.f13531e.setVisibility(0);
        this.f13513e.setAlpha(255);
        C4606e c4606e = new C4606e(this, 0);
        this.f13514e = c4606e;
        c4606e.setDuration(this.f13497e);
        AnimationAnimationListenerC11022e animationAnimationListenerC11022e = this.f13519e;
        if (animationAnimationListenerC11022e != null) {
            this.f13531e.f26991e = animationAnimationListenerC11022e;
        }
        this.f13531e.clearAnimation();
        this.f13531e.startAnimation(this.f13514e);
    }

    @Override // defpackage.InterfaceC10856e
    public final boolean appmetrica(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // defpackage.InterfaceC10856e
    public final void billing(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        amazon(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f13512e.ad(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f13512e.vip(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f13512e.metrica(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f13512e.license(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f13501e;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C12434e c12434e = this.f13529e;
        return c12434e.f24873e | c12434e.f24874e;
    }

    public int getProgressCircleDiameter() {
        return this.f13504e;
    }

    public int getProgressViewEndOffset() {
        return this.f13526e;
    }

    public int getProgressViewStartOffset() {
        return this.f13524e;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f13512e.purchase(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f13512e.license;
    }

    @Override // defpackage.InterfaceC10856e
    public final void license(View view, int i, int i2, int i3, int i4, int i5) {
        metrica(view, i, i2, i3, i4, i5, this.f13515e);
    }

    public final void loadAd(float f) {
        float f2 = this.f13510e;
        float f3 = f - f2;
        float f4 = this.f13523e;
        if (f3 <= f4 || this.f13507e) {
            return;
        }
        this.f13508e = f2 + f4;
        this.f13507e = true;
        this.f13513e.setAlpha(76);
    }

    @Override // defpackage.InterfaceC11975e
    public final void metrica(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.f13512e.license(i, i2, i3, i4, this.f13500e, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        if ((i7 == 0 ? i4 + this.f13500e[1] : i7) >= 0 || ad()) {
            return;
        }
        float abs = this.f13530e + Math.abs(r14);
        this.f13530e = abs;
        adcel(abs);
        iArr[1] = iArr[1] + i7;
    }

    public final void mopub(float f) {
        setTargetOffsetTopAndBottom((this.f13517e + ((int) ((this.f13524e - r0) * f))) - this.f13531e.getTop());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        advert();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vip();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !ad() && !this.f13499e && !this.f13498e) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int i = this.f13503e;
                        if (i == -1) {
                            Log.e("eؙٟٓ", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        if (findPointerIndex >= 0) {
                            loadAd(motionEvent.getY(findPointerIndex));
                        }
                    } else if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f13503e) {
                                this.f13503e = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            }
                        }
                    }
                    return this.f13507e;
                }
                this.f13507e = false;
                this.f13503e = -1;
                return this.f13507e;
            }
            setTargetOffsetTopAndBottom(this.f13524e - this.f13531e.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f13503e = pointerId;
            this.f13507e = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.f13510e = motionEvent.getY(findPointerIndex2);
                return this.f13507e;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f13528e == null) {
            vip();
        }
        View view = this.f13528e;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f13531e.getMeasuredWidth();
        int measuredHeight2 = this.f13531e.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f13502e;
        this.f13531e.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f13528e == null) {
            vip();
        }
        View view = this.f13528e;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f13531e.measure(View.MeasureSpec.makeMeasureSpec(this.f13504e, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f13504e, 1073741824));
        this.f13501e = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f13531e) {
                this.f13501e = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f13512e.ad(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f13512e.vip(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f13530e;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f13530e = 0.0f;
                } else {
                    this.f13530e = f - f2;
                    iArr[1] = i2;
                }
                adcel(this.f13530e);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.f13525e;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        metrica(view, i, i2, i3, i4, 0, this.f13515e);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f13529e.f24874e = i;
        startNestedScroll(i & 2);
        this.f13530e = 0.0f;
        this.f13498e = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C10690e c10690e = (C10690e) parcelable;
        super.onRestoreInstanceState(c10690e.getSuperState());
        setRefreshing(c10690e.f21056e);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new C10690e(super.onSaveInstanceState(), this.f13499e);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f13499e || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f13529e.f24874e = 0;
        this.f13498e = false;
        float f = this.f13530e;
        if (f > 0.0f) {
            startapp(f);
            this.f13530e = 0.0f;
        } else {
            post(new RunnableC1352e(6, this));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !ad() && !this.f13499e && !this.f13498e) {
            if (actionMasked == 0) {
                this.f13503e = motionEvent.getPointerId(0);
                this.f13507e = false;
                return true;
            }
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f13503e);
                if (findPointerIndex < 0) {
                    Log.e("eؙٟٓ", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f13507e) {
                    float y = (motionEvent.getY(findPointerIndex) - this.f13508e) * 0.5f;
                    this.f13507e = false;
                    startapp(y);
                }
                this.f13503e = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f13503e);
                if (findPointerIndex2 < 0) {
                    Log.e("eؙٟٓ", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                loadAd(y2);
                if (this.f13507e) {
                    float f = (y2 - this.f13508e) * 0.5f;
                    if (f > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        adcel(f);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f13503e) {
                            this.f13503e = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("eؙٟٓ", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f13503e = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC10856e
    public final void purchase(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.f13522e && (view = this.f13528e) != null) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.f13531e.setScaleX(f);
        this.f13531e.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        vip();
        C8266e c8266e = this.f13513e;
        C1935e c1935e = c8266e.f16785e;
        c1935e.startapp = iArr;
        c1935e.ad(0);
        c1935e.ad(0);
        c8266e.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f13496e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        advert();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f13522e = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C18418e c18418e = this.f13512e;
        if (c18418e.license) {
            ViewGroup viewGroup = c18418e.metrica;
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            viewGroup.stopNestedScroll();
        }
        c18418e.license = z;
    }

    public void setOnChildScrollUpCallback(InterfaceC6921e interfaceC6921e) {
    }

    public void setOnRefreshListener(InterfaceC11414e interfaceC11414e) {
        this.f13506e = interfaceC11414e;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f13531e.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        amazon(z, false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f13504e = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f13504e = (int) (displayMetrics.density * 40.0f);
            }
            this.f13531e.setImageDrawable(null);
            this.f13513e.metrica(i);
            this.f13531e.setImageDrawable(this.f13513e);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f13516e = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        C13606e c13606e = this.f13531e;
        c13606e.bringToFront();
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        c13606e.offsetTopAndBottom(i);
        this.f13502e = c13606e.getTop();
    }

    public final void smaato(boolean z, boolean z2) {
        if (this.f13499e != z) {
            this.f13518e = z2;
            vip();
            this.f13499e = z;
            AnimationAnimationListenerC11022e animationAnimationListenerC11022e = this.f13519e;
            if (!z) {
                C4606e c4606e = new C4606e(this, 1);
                this.f13520e = c4606e;
                c4606e.setDuration(150L);
                C13606e c13606e = this.f13531e;
                c13606e.f26991e = animationAnimationListenerC11022e;
                c13606e.clearAnimation();
                this.f13531e.startAnimation(this.f13520e);
                return;
            }
            this.f13517e = this.f13502e;
            C4606e c4606e2 = this.f13509e;
            c4606e2.reset();
            c4606e2.setDuration(200L);
            c4606e2.setInterpolator(this.f13521e);
            if (animationAnimationListenerC11022e != null) {
                this.f13531e.f26991e = animationAnimationListenerC11022e;
            }
            this.f13531e.clearAnimation();
            this.f13531e.startAnimation(c4606e2);
        }
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f13512e.billing(i, 0);
    }

    public final void startapp(float f) {
        if (f > this.f13496e) {
            smaato(true, true);
            return;
        }
        this.f13499e = false;
        C8266e c8266e = this.f13513e;
        C1935e c1935e = c8266e.f16785e;
        c1935e.appmetrica = 0.0f;
        c1935e.purchase = 0.0f;
        c8266e.invalidateSelf();
        AnimationAnimationListenerC11022e animationAnimationListenerC11022e = new AnimationAnimationListenerC11022e(this, 1);
        this.f13517e = this.f13502e;
        C4606e c4606e = this.f13527e;
        c4606e.reset();
        c4606e.setDuration(200L);
        c4606e.setInterpolator(this.f13521e);
        C13606e c13606e = this.f13531e;
        c13606e.f26991e = animationAnimationListenerC11022e;
        c13606e.clearAnimation();
        this.f13531e.startAnimation(c4606e);
        C8266e c8266e2 = this.f13513e;
        C1935e c1935e2 = c8266e2.f16785e;
        if (c1935e2.amazon) {
            c1935e2.amazon = false;
        }
        c8266e2.invalidateSelf();
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f13512e.yandex(0);
    }

    public final void vip() {
        if (this.f13528e == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f13531e)) {
                    this.f13528e = childAt;
                    return;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC10856e
    public final void yandex(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }
}
