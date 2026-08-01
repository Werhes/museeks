package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۘؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC5850e implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public RunnableC10043e f12320e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f12321e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f12322e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f12323e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final View f12324e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int[] f12325e = new int[2];

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f12326e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f12327e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public RunnableC10043e f12328e;

    public AbstractViewOnTouchListenerC5850e(View view) {
        this.f12324e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f12326e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f12322e = tapTimeout;
        this.f12321e = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void ad() {
        RunnableC10043e runnableC10043e = this.f12328e;
        View view = this.f12324e;
        if (runnableC10043e != null) {
            view.removeCallbacks(runnableC10043e);
        }
        RunnableC10043e runnableC10043e2 = this.f12320e;
        if (runnableC10043e2 != null) {
            view.removeCallbacks(runnableC10043e2);
        }
    }

    public boolean license() {
        InterfaceC13836e vip = vip();
        if (vip == null || !vip.ad()) {
            return true;
        }
        vip.dismiss();
        return true;
    }

    public abstract boolean metrica();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractViewOnTouchListenerC5850e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f12327e = false;
        this.f12323e = -1;
        RunnableC10043e runnableC10043e = this.f12320e;
        if (runnableC10043e != null) {
            this.f12324e.removeCallbacks(runnableC10043e);
        }
    }

    public abstract InterfaceC13836e vip();
}
