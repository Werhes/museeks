package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC0257e implements GestureDetector.OnGestureListener {
    public final /* synthetic */ C0381e ad;

    public GestureDetectorOnGestureListenerC0257e(C0381e c0381e) {
        this.ad = c0381e;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C0381e c0381e = this.ad;
        C3049e c3049e = (C3049e) c0381e.license;
        if (!c0381e.metrica) {
            int i = c0381e.vip;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    ((C8212e) c3049e.f7109e.getFocusOwner()).billing(f > 0.0f ? 1 : 2, false);
                    Unit unit = Unit.INSTANCE;
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                ((C8212e) c3049e.f7109e.getFocusOwner()).billing(f2 > 0.0f ? 1 : 2, false);
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
