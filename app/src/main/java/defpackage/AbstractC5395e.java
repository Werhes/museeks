package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5395e extends AbstractC8786e {
    public boolean appmetrica;
    public int billing;
    public OverScroller license;
    public RunnableC11666e metrica;
    public int purchase;
    public VelocityTracker startapp;
    public int yandex;

    @Override // defpackage.AbstractC1802e
    public final boolean billing(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int findPointerIndex;
        if (this.yandex < 0) {
            this.yandex = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.appmetrica) {
            int i = this.purchase;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y - this.billing) > this.yandex) {
                    this.billing = y;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.purchase = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).amazon;
            boolean z = (weakReference == null || !((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.loadAd(view, x, y2);
            this.appmetrica = z;
            if (z) {
                this.billing = y2;
                this.purchase = motionEvent.getPointerId(0);
                if (this.startapp == null) {
                    this.startapp = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.license;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.license.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.startapp;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public final void isVip(CoordinatorLayout coordinatorLayout, View view, int i) {
        tapsense(coordinatorLayout, view, i, RecyclerView.UNDEFINED_DURATION, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public abstract int signatures();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f7  */
    @Override // defpackage.AbstractC1802e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean subscription(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5395e.subscription(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int tapsense(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);
}
