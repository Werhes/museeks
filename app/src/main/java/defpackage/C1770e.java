package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770e extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C1770e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.ad) {
            case 2:
                C11296e c11296e = (C11296e) this.vip;
                c11296e.startapp = motionEvent.getX();
                c11296e.adcel = motionEvent.getY();
                c11296e.mopub = 1;
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.ad) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.ad) {
            case 0:
                C6530e c6530e = (C6530e) this.vip;
                if (c6530e.f13448e || c6530e.f13454e || !c6530e.f13450e || f2 < 1200.0f) {
                    return false;
                }
                c6530e.f13454e = false;
                c6530e.getChildAt(1).dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                c6530e.f13448e = false;
                c6530e.f13450e = false;
                c6530e.f13454e = true;
                c6530e.f13447e.purchase();
                return true;
            case 1:
                C1059e c1059e = (C1059e) this.vip;
                if (c1059e.f3579e || c1059e.f3581e || !c1059e.f3569e || c1059e.f3564e == null || f < 600.0f) {
                    return false;
                }
                c1059e.f3581e = false;
                c1059e.f3582e = null;
                c1059e.vip();
                c1059e.purchase(true, false);
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018c  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onScroll(android.view.MotionEvent r24, android.view.MotionEvent r25, float r26, float r27) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1770e.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
