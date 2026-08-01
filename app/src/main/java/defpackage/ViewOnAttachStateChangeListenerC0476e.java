package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؑٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0476e implements InterfaceC6357e, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static long f2545e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f2547e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final View f2550e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f2551e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f2552e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final PriorityQueue f2548e = new PriorityQueue(11, new C6575e(0));

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Choreographer f2549e = Choreographer.getInstance();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C14033e f2546e = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eٓٗۢ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnAttachStateChangeListenerC0476e(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f2550e = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            eؙۖٗ r1 = new eؙۖٗ
            r2 = 0
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.f2548e = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f2549e = r0
            eٓٗۢ r0 = new eٓٗۢ
            r0.<init>()
            r4.f2546e = r0
            long r0 = defpackage.ViewOnAttachStateChangeListenerC0476e.f2545e
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4a
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r1 = (float) r1
            float r1 = r1 / r0
            long r0 = (long) r1
            defpackage.ViewOnAttachStateChangeListenerC0476e.f2545e = r0
        L4a:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L56
            r5 = 1
            r4.f2552e = r5
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnAttachStateChangeListenerC0476e.<init>(android.view.View):void");
    }

    @Override // defpackage.InterfaceC6357e
    public final void ad(C5492e c5492e) {
        this.f2548e.add(new C5388e(1, c5492e));
        if (this.f2547e) {
            return;
        }
        this.f2547e = true;
        this.f2550e.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f2552e) {
            this.f2551e = j;
            this.f2550e.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2552e = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2552e = false;
        this.f2550e.removeCallbacks(this);
        this.f2549e.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f2548e;
        if (!priorityQueue.isEmpty() && this.f2547e && this.f2552e) {
            View view = this.f2550e;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (((long) 2) * f2545e) + nanos;
                C14033e c14033e = this.f2546e;
                c14033e.ad = z;
                c14033e.vip = Math.max(this.f2551e, nanos) + f2545e;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (c14033e.ad) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = vip();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = vip();
                    }
                }
                if (z2) {
                    this.f2549e.postFrameCallback(this);
                } else {
                    this.f2547e = false;
                }
                AbstractC14204e.m3773final(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.f2547e = false;
    }

    public final boolean vip() {
        C14033e c14033e = this.f2546e;
        long ad = c14033e.ad();
        AbstractC14204e.m3773final(ad, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (ad > 0) {
            PriorityQueue priorityQueue = this.f2548e;
            if (!((C5388e) priorityQueue.peek()).vip.metrica(c14033e)) {
                priorityQueue.poll();
                z = false;
            }
            c14033e.ad = false;
        }
        return z;
    }
}
