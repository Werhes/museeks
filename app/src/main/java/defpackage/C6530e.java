package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٝٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6530e extends FrameLayout {

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C10621e f13446e = C10621e.ad(55.0d, 10.0d);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public AbstractC5004e f13447e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f13448e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C2691e f13449e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f13450e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Rect f13451e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f13452e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f13453e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f13454e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f13455e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public float f13456e;

    public C6530e(Context context) {
        super(context);
        this.f13451e = new Rect();
        this.f13449e = new C2691e(getContext(), new C1770e(0, this));
        this.f13455e = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public static boolean license(View view, MotionEvent motionEvent, Rect rect) {
        view.getGlobalVisibleRect(rect);
        if (view.getVisibility() == 0 && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return view.canScrollVertically(-1);
        }
        return false;
    }

    public static boolean metrica(ViewGroup viewGroup, MotionEvent motionEvent, Rect rect) {
        if (viewGroup == null) {
            return false;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (license(childAt, motionEvent, rect)) {
                    return true;
                }
                if ((childAt instanceof ViewGroup) && childAt.getVisibility() == 0 && metrica((ViewGroup) childAt, motionEvent, rect)) {
                    return true;
                }
            }
        }
        return license(viewGroup, motionEvent, rect);
    }

    public final void ad() {
        this.f13454e = true;
        C9412e admob = this.f13447e.f10585e.admob();
        C10621e c10621e = f13446e;
        if (c10621e == null) {
            throw new IllegalArgumentException("springConfig is required");
        }
        admob.ad = c10621e;
        admob.adcel.add(new C2475e(this));
        admob.metrica(this.f13456e);
        admob.license(0.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f13447e != null) {
            int action = motionEvent.getAction() & 255;
            if (!this.f13454e) {
                if (!((GestureDetector) this.f13449e.f6570e).onTouchEvent(motionEvent)) {
                    if (action != 0) {
                        if (action == 1 || action == 3) {
                            if (this.f13450e) {
                                this.f13448e = false;
                                this.f13450e = false;
                                this.f13454e = false;
                                if (this.f13456e <= 0.5f) {
                                    ad();
                                } else {
                                    this.f13454e = true;
                                    this.f13447e.purchase();
                                }
                            } else if (this.f13448e) {
                                this.f13448e = false;
                                this.f13450e = false;
                                this.f13454e = false;
                            }
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (motionEvent.getAction() & 255) == 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            this.f13448e = true;
            this.f13450e = false;
            if (this.f13456e > 0.0f) {
                ad();
            }
        }
    }

    public void setCurrentProgress(float f) {
        this.f13456e = f;
        vip();
    }

    public void setSheetHeight(int i) {
        this.f13453e = i;
    }

    public final void vip() {
        getChildAt(0).setAlpha(1.0f - this.f13456e);
        AbstractC5004e abstractC5004e = this.f13447e;
        if (abstractC5004e != null) {
            float f = this.f13456e;
            boolean z = abstractC5004e.f10592e;
            abstractC5004e.f10586e = f;
            boolean z2 = f <= 0.5f;
            if (abstractC5004e.f10588e != z2 && !z) {
                abstractC5004e.f10588e = z2;
                ComponentCallbacks2 componentCallbacks2 = abstractC5004e.f10582e;
                if (componentCallbacks2 instanceof InterfaceC13018e) {
                    AppActivity appActivity = (AppActivity) ((InterfaceC13018e) componentCallbacks2);
                    appActivity.getClass();
                    if (AbstractC15933e.appmetrica.license) {
                        if (z2) {
                            C1731e m4677class = appActivity.m4677class();
                            m4677class.vip(false);
                            m4677class.ad(false);
                        } else {
                            C1731e m4677class2 = appActivity.m4677class();
                            m4677class2.vip(true);
                            m4677class2.ad(true);
                        }
                    }
                }
            }
            int measuredHeight = abstractC5004e.f10584e.getMeasuredHeight();
            int i = z ? 0 : AbstractC5004e.f10578e + abstractC5004e.f10589e;
            View view = abstractC5004e.f10584e;
            if (view != null) {
                view.setTranslationY(measuredHeight - ((1.0f - f) * (measuredHeight - i)));
            }
            View view2 = abstractC5004e.f10584e;
            if (view2 != null) {
                view2.invalidateOutline();
            }
        }
    }
}
