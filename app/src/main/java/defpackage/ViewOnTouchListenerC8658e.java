package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC8658e implements View.OnTouchListener {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final int f17473e = ViewConfiguration.getTapTimeout();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final float[] f17474e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f17475e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f17476e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C15703e f17477e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final float[] f17478e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f17479e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AccelerateInterpolator f17480e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C15703e f17481e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f17482e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f17483e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f17484e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final float[] f17485e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public RunnableC12991e f17486e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final float[] f17487e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4810e f17488e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f17489e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final float[] f17490e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِؗؓ, java.lang.Object] */
    public ViewOnTouchListenerC8658e(C15703e c15703e) {
        ?? obj = new Object();
        obj.appmetrica = Long.MIN_VALUE;
        obj.billing = -1L;
        obj.purchase = 0L;
        this.f17488e = obj;
        this.f17480e = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f17474e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f17490e = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f17487e = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f17478e = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f17485e = fArr5;
        this.f17477e = c15703e;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f17489e = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f17484e = f17473e;
        obj.ad = 500;
        obj.vip = 500;
        this.f17481e = c15703e;
    }

    public static float vip(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float ad(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f17474e
            r0 = r0[r7]
            float[] r1 = r3.f17490e
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = vip(r0, r2, r1)
            float r1 = r3.metrica(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.metrica(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f17480e
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = vip(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f17487e
            r0 = r0[r7]
            float[] r1 = r3.f17478e
            r1 = r1[r7]
            float[] r2 = r3.f17485e
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = vip(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = vip(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnTouchListenerC8658e.ad(float, float, float, int):float");
    }

    public final boolean appmetrica() {
        C15703e c15703e;
        int count;
        C4810e c4810e = this.f17488e;
        float f = c4810e.license;
        int abs = (int) (f / Math.abs(f));
        Math.abs(c4810e.metrica);
        if (abs != 0 && (count = (c15703e = this.f17481e).getCount()) != 0) {
            int childCount = c15703e.getChildCount();
            int firstVisiblePosition = c15703e.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && c15703e.getChildAt(0).getTop() >= 0)) : !(i >= count && c15703e.getChildAt(childCount - 1).getBottom() <= c15703e.getHeight())) {
                return true;
            }
        }
        return false;
    }

    public final void license() {
        int i = 0;
        if (this.f17475e) {
            this.f17482e = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C4810e c4810e = this.f17488e;
        int i2 = (int) (currentAnimationTimeMillis - c4810e.appmetrica);
        int i3 = c4810e.vip;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c4810e.startapp = i;
        c4810e.yandex = c4810e.ad(currentAnimationTimeMillis);
        c4810e.billing = currentAnimationTimeMillis;
    }

    public final float metrica(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f17489e;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f17482e && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f17483e
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.license()
            return r1
        L1b:
            r7.f17479e = r2
            r7.f17476e = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            eؙٕۚ r4 = r7.f17477e
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.ad(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.ad(r9, r8, r3, r2)
            eِؗؓ r9 = r7.f17488e
            r9.metrica = r0
            r9.license = r8
            boolean r8 = r7.f17482e
            if (r8 != 0) goto L7c
            boolean r8 = r7.appmetrica()
            if (r8 == 0) goto L7c
            eْؓ r8 = r7.f17486e
            if (r8 != 0) goto L60
            eْؓ r8 = new eْؓ
            r8.<init>(r2, r7)
            r7.f17486e = r8
        L60:
            r7.f17482e = r2
            r7.f17475e = r2
            boolean r8 = r7.f17476e
            if (r8 != 0) goto L75
            int r8 = r7.f17484e
            if (r8 <= 0) goto L75
            eْؓ r9 = r7.f17486e
            long r5 = (long) r8
            java.util.WeakHashMap r8 = defpackage.AbstractC2016e.ad
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            eْؓ r8 = r7.f17486e
            r8.run()
        L7a:
            r7.f17476e = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnTouchListenerC8658e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
