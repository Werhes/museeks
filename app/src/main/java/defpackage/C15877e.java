package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕۨ */
/* loaded from: classes.dex */
public final class C15877e extends View {

    /* renamed from: eّؑؑ */
    public C14515e f31308e;

    /* renamed from: eًؔؐ */
    public Long f31309e;

    /* renamed from: eؘٙؓ */
    public Boolean f31310e;

    /* renamed from: eؙِٖ */
    public RunnableC2783e f31311e;

    /* renamed from: eّٖۦ */
    public C14428e f31312e;

    /* renamed from: eٗۚۖ */
    public static final int[] f31307e = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: eؘَٗ */
    public static final int[] f31306e = new int[0];

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f31311e;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f31309e;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? f31307e : f31306e;
            C14428e c14428e = this.f31312e;
            if (c14428e != null) {
                c14428e.setState(iArr);
            }
        } else {
            RunnableC2783e runnableC2783e = new RunnableC2783e(29, this);
            this.f31311e = runnableC2783e;
            postDelayed(runnableC2783e, 50L);
        }
        this.f31309e = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$1(C15877e c15877e) {
        C14428e c14428e = c15877e.f31312e;
        if (c14428e != null) {
            c14428e.setState(f31306e);
        }
        c15877e.f31311e = null;
    }

    public final void appmetrica(long j, int i, long j2, float f) {
        C14428e c14428e = this.f31312e;
        if (c14428e == null) {
            return;
        }
        if (c14428e.getRadius() != i) {
            c14428e.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long vip = C3618e.vip(f, j2);
        C3618e c3618e = c14428e.f28529e;
        if (!(c3618e == null ? false : C3618e.metrica(c3618e.ad, vip))) {
            c14428e.f28529e = new C3618e(vip);
            c14428e.setColor(ColorStateList.valueOf(AbstractC6532e.m2193extends(vip)));
        }
        Rect rect = new Rect(0, 0, AbstractC1561e.appmetrica(C2108e.purchase(j)), AbstractC1561e.appmetrica(C2108e.metrica(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c14428e.setBounds(rect);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            metrica();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C14515e c14515e = this.f31308e;
        if (c14515e != null) {
            c14515e.invoke();
        }
    }

    public final void license() {
        setRippleState(false);
    }

    public final void metrica() {
        this.f31308e = null;
        RunnableC2783e runnableC2783e = this.f31311e;
        if (runnableC2783e != null) {
            removeCallbacks(runnableC2783e);
            this.f31311e.run();
        } else {
            C14428e c14428e = this.f31312e;
            if (c14428e != null) {
                c14428e.setState(f31306e);
            }
        }
        C14428e c14428e2 = this.f31312e;
        if (c14428e2 == null) {
            return;
        }
        c14428e2.setVisible(false, false);
        unscheduleDrawable(c14428e2);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    public final void vip(C17612e c17612e, boolean z, long j, int i, long j2, float f, C14515e c14515e) {
        if (this.f31312e == null || !Boolean.valueOf(z).equals(this.f31310e)) {
            C14428e c14428e = new C14428e(z);
            setBackground(c14428e);
            this.f31312e = c14428e;
            this.f31310e = Boolean.valueOf(z);
        }
        C14428e c14428e2 = this.f31312e;
        this.f31308e = c14515e;
        appmetrica(j, i, j2, f);
        if (z) {
            c14428e2.setHotspot(C2152e.appmetrica(c17612e.ad), C2152e.purchase(c17612e.ad));
        } else {
            c14428e2.setHotspot(c14428e2.getBounds().centerX(), c14428e2.getBounds().centerY());
        }
        setRippleState(true);
    }
}
