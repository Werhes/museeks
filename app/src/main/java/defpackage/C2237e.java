package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۦ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2237e {
    public static final InterpolatorC9032e tapsense = new InterpolatorC9032e(3);
    public final OverScroller Signature;
    public int ad;
    public int[] adcel;
    public final AbstractC7214e admob;
    public VelocityTracker advert;
    public final float amazon;
    public float[] appmetrica;
    public float[] billing;
    public float[] license;
    public final int loadAd;
    public int mopub;
    public final CoordinatorLayout pro;
    public float[] purchase;
    public boolean remoteconfig;
    public final float smaato;
    public int[] startapp;
    public View subscription;
    public final int vip;
    public int[] yandex;
    public int metrica = -1;
    public final RunnableC16721e signatures = new RunnableC16721e(1, this);

    public C2237e(Context context, CoordinatorLayout coordinatorLayout, AbstractC7214e abstractC7214e) {
        if (abstractC7214e == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.pro = coordinatorLayout;
        this.admob = abstractC7214e;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.loadAd = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.vip = viewConfiguration.getScaledTouchSlop();
        this.smaato = viewConfiguration.getScaledMaximumFlingVelocity();
        this.amazon = viewConfiguration.getScaledMinimumFlingVelocity();
        this.Signature = new OverScroller(context, tapsense);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Signature(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2237e.Signature(android.view.MotionEvent):boolean");
    }

    public final void ad() {
        this.metrica = -1;
        float[] fArr = this.license;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.appmetrica, 0.0f);
            Arrays.fill(this.purchase, 0.0f);
            Arrays.fill(this.billing, 0.0f);
            Arrays.fill(this.yandex, 0);
            Arrays.fill(this.startapp, 0);
            Arrays.fill(this.adcel, 0);
            this.mopub = 0;
        }
        VelocityTracker velocityTracker = this.advert;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.advert = null;
        }
    }

    public final void adcel(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            ad();
        }
        if (this.advert == null) {
            this.advert = VelocityTracker.obtain();
        }
        this.advert.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View billing = billing((int) x, (int) y);
            advert(x, y, pointerId);
            admob(billing, pointerId);
            int i3 = this.yandex[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.ad == 1) {
                mopub();
            }
            ad();
            return;
        }
        AbstractC7214e abstractC7214e = this.admob;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.ad == 1) {
                    this.remoteconfig = true;
                    abstractC7214e.mopub(this.subscription, 0.0f, 0.0f);
                    this.remoteconfig = false;
                    if (this.ad == 1) {
                        amazon(0);
                    }
                }
                ad();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                advert(x2, y2, pointerId2);
                if (this.ad == 0) {
                    admob(billing((int) x2, (int) y2), pointerId2);
                    int i4 = this.yandex[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.subscription;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    admob(this.subscription, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.ad == 1 && pointerId3 == this.metrica) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.metrica) {
                        View billing2 = billing((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.subscription;
                        if (billing2 == view2 && admob(view2, pointerId4)) {
                            i = this.metrica;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    mopub();
                }
            }
            license(pointerId3);
            return;
        }
        if (this.ad == 1) {
            if (startapp(this.metrica)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.metrica);
                float x3 = motionEvent.getX(findPointerIndex);
                float y3 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.purchase;
                int i7 = this.metrica;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y3 - this.billing[i7]);
                int left = this.subscription.getLeft() + i8;
                int top = this.subscription.getTop() + i9;
                int left2 = this.subscription.getLeft();
                int top2 = this.subscription.getTop();
                if (i8 != 0) {
                    left = abstractC7214e.vip(this.subscription, left);
                    WeakHashMap weakHashMap = AbstractC2016e.ad;
                    this.subscription.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = abstractC7214e.metrica(this.subscription, top);
                    WeakHashMap weakHashMap2 = AbstractC2016e.ad;
                    this.subscription.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    abstractC7214e.adcel(this.subscription, left, top);
                }
                smaato(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (startapp(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y4 = motionEvent.getY(i2);
                float f = x4 - this.license[pointerId5];
                float f2 = y4 - this.appmetrica[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i10 = this.yandex[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i11 = this.yandex[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.yandex[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.yandex[pointerId5];
                if (this.ad != 1) {
                    View billing3 = billing((int) x4, (int) y4);
                    if (metrica(billing3, f, f2) && admob(billing3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        smaato(motionEvent);
    }

    public final boolean admob(View view, int i) {
        if (view == this.subscription && this.metrica == i) {
            return true;
        }
        if (view == null || !this.admob.loadAd(view, i)) {
            return false;
        }
        this.metrica = i;
        vip(view, i);
        return true;
    }

    public final void advert(float f, float f2, int i) {
        float[] fArr = this.license;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.appmetrica;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.purchase;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.billing;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.yandex;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.startapp;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.adcel;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.license = fArr2;
            this.appmetrica = fArr3;
            this.purchase = fArr4;
            this.billing = fArr5;
            this.yandex = iArr;
            this.startapp = iArr2;
            this.adcel = iArr3;
        }
        float[] fArr9 = this.license;
        this.purchase[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.appmetrica;
        this.billing[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.yandex;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.pro;
        int left = coordinatorLayout.getLeft();
        int i5 = this.loadAd;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.mopub |= 1 << i;
    }

    public final void amazon(int i) {
        this.pro.removeCallbacks(this.signatures);
        if (this.ad != i) {
            this.ad = i;
            this.admob.startapp(i);
            if (this.ad == 0) {
                this.subscription = null;
            }
        }
    }

    public final int appmetrica(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.pro.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final View billing(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.pro;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.admob.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void license(int i) {
        float[] fArr = this.license;
        if (fArr != null) {
            int i2 = this.mopub;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.appmetrica[i] = 0.0f;
                this.purchase[i] = 0.0f;
                this.billing[i] = 0.0f;
                this.yandex[i] = 0;
                this.startapp[i] = 0;
                this.adcel[i] = 0;
                this.mopub = (~i3) & i2;
            }
        }
    }

    public final boolean loadAd(int i, int i2) {
        if (this.remoteconfig) {
            return yandex(i, i2, (int) this.advert.getXVelocity(this.metrica), (int) this.advert.getYVelocity(this.metrica));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean metrica(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            eؚٗۖ r1 = r3.admob
            int r4 = r1.appmetrica(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.purchase()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.vip
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.vip
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.vip
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2237e.metrica(android.view.View, float, float):boolean");
    }

    public final void mopub() {
        VelocityTracker velocityTracker = this.advert;
        float f = this.smaato;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.advert.getXVelocity(this.metrica);
        float abs = Math.abs(xVelocity);
        float f2 = this.amazon;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.advert.getYVelocity(this.metrica);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f2) {
            f = 0.0f;
        } else if (abs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.remoteconfig = true;
        this.admob.mopub(this.subscription, xVelocity, f);
        this.remoteconfig = false;
        if (this.ad == 1) {
            amazon(0);
        }
    }

    public final boolean purchase() {
        if (this.ad == 2) {
            OverScroller overScroller = this.Signature;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.subscription.getLeft();
            int top = currY - this.subscription.getTop();
            if (left != 0) {
                View view = this.subscription;
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.subscription;
                WeakHashMap weakHashMap2 = AbstractC2016e.ad;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.admob.adcel(this.subscription, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.pro.post(this.signatures);
            }
        }
        return this.ad == 2;
    }

    public final void smaato(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (startapp(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.purchase[pointerId] = x;
                this.billing[pointerId] = y;
            }
        }
    }

    public final boolean startapp(int i) {
        if ((this.mopub & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void vip(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.pro;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.subscription = view;
        this.metrica = i;
        this.admob.yandex(view, i);
        amazon(1);
    }

    public final boolean yandex(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.subscription.getLeft();
        int top = this.subscription.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.Signature;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            amazon(0);
            return false;
        }
        View view = this.subscription;
        int i7 = (int) this.amazon;
        int i8 = (int) this.smaato;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int abs2 = Math.abs(i4);
        if (abs2 < i7) {
            i4 = 0;
        } else if (abs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i9 = abs5 + abs6;
        int i10 = abs3 + abs4;
        if (i3 != 0) {
            f = abs5;
            f2 = i9;
        } else {
            f = abs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = abs6;
            f4 = i9;
        } else {
            f3 = abs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        AbstractC7214e abstractC7214e = this.admob;
        overScroller.startScroll(left, top, i5, i6, (int) ((appmetrica(i6, i4, abstractC7214e.purchase()) * f6) + (appmetrica(i5, i3, abstractC7214e.appmetrica(view)) * f5)));
        amazon(2);
        return true;
    }
}
