package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.loadAd;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9986e extends GestureDetector.SimpleOnGestureListener {
    public boolean ad = true;
    public final /* synthetic */ C1246e vip;

    public C9986e(C1246e c1246e) {
        this.vip = c1246e;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View mopub;
        loadAd childViewHolder;
        C1246e c1246e = this.vip;
        C11294e c11294e = c1246e.smaato;
        if (!this.ad || (mopub = c1246e.mopub(motionEvent)) == null || (childViewHolder = c1246e.subscription.getChildViewHolder(mopub)) == null) {
            return;
        }
        if ((C11294e.vip(c11294e.license(childViewHolder), c1246e.subscription.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = c1246e.advert;
            if (pointerId == i) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                c1246e.license = x;
                c1246e.appmetrica = y;
                c1246e.startapp = 0.0f;
                c1246e.yandex = 0.0f;
                c11294e.getClass();
                c1246e.Signature(childViewHolder, 2);
            }
        }
    }
}
