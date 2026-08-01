package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16779e extends FrameLayout implements InterfaceC5259e, InterfaceC12807e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final /* synthetic */ int f32868e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public View f32869e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public Paint f32870e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public Rect f32871e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f32872e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Float f32873e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f32874e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f32875e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public billing f32876e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public View f32877e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public AbstractC13859e f32878e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C10512e f32879e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f32880e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f32881e;

    /* JADX WARN: Multi-variable type inference failed */
    public final View ad(AbstractC13859e abstractC13859e) {
        View view = null;
        view = null;
        view = null;
        if (abstractC13859e instanceof InterfaceC12650e) {
            InterfaceC12650e interfaceC12650e = (InterfaceC12650e) abstractC13859e;
            if (((AbstractC10716e) interfaceC12650e).m2916implements()) {
                interfaceC12650e.getClass();
                AbstractC10716e abstractC10716e = (AbstractC10716e) interfaceC12650e;
                if ((abstractC10716e.m2916implements() ? abstractC10716e.f21117e : null) == null) {
                    AbstractC18491e abstractC18491e = abstractC10716e.f21116e;
                    if (abstractC18491e == null) {
                        abstractC18491e = null;
                    }
                    View purchase = abstractC18491e.purchase(getContext(), this);
                    abstractC10716e.f21117e = purchase;
                    AppBarLayout appBarLayout = purchase instanceof AppBarLayout ? (AppBarLayout) purchase : null;
                    if (appBarLayout != null) {
                        StateListAnimator stateListAnimator = new StateListAnimator();
                        stateListAnimator.addState(new int[]{0}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f));
                        appBarLayout.setStateListAnimator(stateListAnimator);
                    }
                    Object obj = abstractC10716e.f21116e;
                    if (obj == null) {
                        obj = null;
                    }
                    InterfaceC11370e interfaceC11370e = obj instanceof InterfaceC11370e ? (InterfaceC11370e) obj : null;
                    if (interfaceC11370e != null) {
                        interfaceC11370e.ad(0.0f);
                    }
                    abstractC10716e.mo573catch();
                    view = purchase;
                } else if (abstractC10716e.m2916implements()) {
                    view = abstractC10716e.f21117e;
                }
                if (!view.hasOnClickListeners()) {
                    view.setOnClickListener(new ViewOnClickListenerC17360e(1));
                }
            }
        }
        return view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC16400e interfaceC16400e = this.f32878e;
        if (interfaceC16400e == null || !(interfaceC16400e instanceof InterfaceC12650e)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (((AbstractC10716e) ((InterfaceC12650e) interfaceC16400e)).m2915default() == -1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getActionBarSize() {
        return this.f32881e;
    }

    public Float getCrossOverrideVal() {
        return this.f32873e;
    }

    public C10512e getMenuDrawable() {
        return this.f32879e;
    }

    public int getMenuDrawablePadding() {
        return this.f32875e;
    }

    public int getStatusbarHeight() {
        return this.f32880e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void metrica(billing billingVar, AbstractC13859e abstractC13859e, AbstractC13859e abstractC13859e2, float f) {
        C10512e c10512e = this.f32879e;
        this.f32876e = billingVar;
        float f2 = 1.0f - f;
        View view = this.f32877e;
        if (view != null) {
            if (abstractC13859e == 0) {
                f2 = 0.0f;
            }
            if (billingVar == null) {
                view.setAlpha(1.0f - f2);
                if (this.f32869e == null) {
                    this.f32877e.setTranslationX(getWidth() * f2);
                } else {
                    this.f32877e.setTranslationX(getWidth() * f2 * 0.5f);
                }
            }
            if (abstractC13859e2 != 0) {
            }
        }
        View view2 = this.f32869e;
        if (view2 != null) {
            if (billingVar == null) {
                view2.setAlpha(f2);
                float width = getWidth();
                this.f32869e.setTranslationX((-(width - (width * f2))) * 0.4f);
            }
            if (abstractC13859e != 0) {
            }
        }
        if (billingVar != null) {
            View view3 = this.f32869e;
            View view4 = this.f32877e;
            float intValue = billingVar.ad(getContext()).intValue();
            if (view3 != null) {
                view3.setTranslationX((1.0f - f2) * (-intValue));
                view3.setAlpha(f2);
            }
            if (view4 != null) {
                view4.setTranslationX(intValue * f2);
                view4.setAlpha(1.0f - f2);
            }
        }
        Float f3 = this.f32873e;
        if (f3 != null) {
            c10512e.purchase(2, f3.floatValue());
        } else {
            c10512e.setAlpha(0);
            c10512e.f20758e = false;
            c10512e.invalidateSelf();
        }
        invalidate();
        InterfaceC16400e interfaceC16400e = this.f32878e;
        if (interfaceC16400e instanceof InterfaceC12650e) {
            ((InterfaceC12650e) interfaceC16400e).getClass();
        }
        int ad = AbstractC15933e.ad(R.attr.colorAccent);
        c10512e.f20750e.setColor(ad);
        c10512e.f20751e.setColor(ad);
        c10512e.invalidateSelf();
        invalidate();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        this.f32881e = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f32870e;
        Rect rect = this.f32871e;
        super.onDraw(canvas);
        billing billingVar = this.f32876e;
        if (billingVar == null) {
            View view = this.f32869e;
            if (view == null && this.f32877e == null) {
                return;
            }
            if (view == null) {
                int width = (int) (1.0f * getWidth());
                rect.set(width, 0, getWidth() + width, getHeight());
                paint.setAlpha(255);
            } else if (this.f32877e == null) {
                rect.set(0, 0, (int) (0.0f * getWidth()), getHeight());
                paint.setAlpha(255);
            } else {
                rect.set(0, 0, getWidth(), getHeight());
                paint.setAlpha((int) 0.0f);
            }
            canvas.drawRect(rect, paint);
            return;
        }
        View view2 = this.f32869e;
        View view3 = this.f32877e;
        billingVar.getClass();
        float intValue = billingVar.ad(getContext()).intValue();
        if (view2 == null && view3 == null) {
            return;
        }
        if (view2 == null) {
            int i = (int) (1.0f * intValue);
            rect.set(i, 0, getWidth() + i, getHeight());
            paint.setAlpha(((int) 0.0f) * 255);
        } else if (view3 == null) {
            rect.set(0, 0, (int) (intValue * 0.0f), getHeight());
            paint.setAlpha(((int) 0.0f) * 255);
        } else {
            paint.setAlpha((int) 0.0f);
        }
        canvas.drawRect(rect, paint);
    }

    @Override // defpackage.InterfaceC12807e
    public final void refreshTheme() {
        this.f32870e.setColor(AbstractC15933e.ad(R.attr.windowBackground));
        InterfaceC16400e interfaceC16400e = this.f32878e;
        if (interfaceC16400e instanceof InterfaceC12650e) {
            ((InterfaceC12650e) interfaceC16400e).getClass();
        }
        C10512e c10512e = this.f32879e;
        int ad = AbstractC15933e.ad(R.attr.colorAccent);
        c10512e.f20750e.setColor(ad);
        c10512e.f20751e.setColor(ad);
        c10512e.invalidateSelf();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCrossOverrideVal(java.lang.Float r6) {
        /*
            r5 = this;
            r5.f32873e = r6
            if (r6 == 0) goto L56
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            eًٓۧ r1 = r5.f32878e
            boolean r2 = r1 instanceof defpackage.InterfaceC12650e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L18
            eّٟٗ r1 = (defpackage.InterfaceC12650e) r1
            r1.getClass()
            r1 = r4
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 == 0) goto L2e
            int r1 = defpackage.AbstractC8703e.m2467class(r1)
            r2 = 3
            r4 = 2
            if (r1 == r3) goto L30
            int r1 = defpackage.AbstractC8703e.m2467class(r2)
            if (r1 == r4) goto L2e
            if (r1 == r2) goto L2c
            goto L3f
        L2c:
            r3 = 5
            goto L3f
        L2e:
            r3 = r4
            goto L3f
        L30:
            int r1 = defpackage.AbstractC8703e.m2467class(r2)
            if (r1 == r4) goto L3e
            if (r1 == r2) goto L3c
            r0.set(r3)
            goto L3f
        L3c:
            r3 = 4
            goto L3f
        L3e:
            r3 = r2
        L3f:
            eًَۚ r1 = r5.f32879e
            boolean r0 = r0.get()
            if (r0 == 0) goto L4f
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6.floatValue()
            float r0 = r0 - r6
            goto L53
        L4f:
            float r0 = r6.floatValue()
        L53:
            r1.purchase(r3, r0)
        L56:
            r5.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16779e.setCrossOverrideVal(java.lang.Float):void");
    }

    public void setStatusbarHeight(int i) {
        this.f32880e = i;
        setPadding(0, i, 0, 0);
        requestLayout();
    }

    public final void vip(AbstractC13859e abstractC13859e, AbstractC13859e abstractC13859e2) {
        this.f32878e = abstractC13859e2;
        if (abstractC13859e == null || abstractC13859e.f27448e != this.f32872e || abstractC13859e2 == null || abstractC13859e2.f27448e != this.f32874e) {
            this.f32874e = abstractC13859e2 != null ? abstractC13859e2.f27448e : -1;
            this.f32872e = abstractC13859e != null ? abstractC13859e.f27448e : -1;
            removeAllViews();
            this.f32869e = null;
            this.f32877e = null;
            View ad = ad(abstractC13859e);
            this.f32869e = ad;
            if (ad != null) {
                if (ad.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) this.f32869e.getLayoutParams()).gravity = 16;
                }
                addView(this.f32869e);
            }
            View ad2 = ad(abstractC13859e2);
            this.f32877e = ad2;
            if (ad2 != null) {
                if (ad2.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) this.f32877e.getLayoutParams()).gravity = 16;
                }
                this.f32877e.setAlpha(0.0f);
                addView(this.f32877e);
            }
            requestLayout();
        }
    }
}
