package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.loadAd;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٛ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9583e implements InterfaceC13463e {
    public final /* synthetic */ C1246e ad;

    public C9583e(C1246e c1246e) {
        this.ad = c1246e;
    }

    @Override // defpackage.InterfaceC13463e
    public final void ad(MotionEvent motionEvent) {
        C1246e c1246e = this.ad;
        RunnableC12991e runnableC12991e = c1246e.remoteconfig;
        c1246e.inmobi.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c1246e.pro;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c1246e.advert == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(c1246e.advert);
        if (findPointerIndex >= 0) {
            c1246e.yandex(actionMasked, findPointerIndex, motionEvent);
        }
        loadAd loadad = c1246e.metrica;
        if (loadad == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    c1246e.admob(c1246e.loadAd, findPointerIndex, motionEvent);
                    c1246e.amazon(loadad);
                    c1246e.subscription.removeCallbacks(runnableC12991e);
                    runnableC12991e.run();
                    c1246e.subscription.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c1246e.advert) {
                    c1246e.advert = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c1246e.admob(c1246e.loadAd, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c1246e.pro;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c1246e.Signature(null, 0);
        c1246e.advert = -1;
    }

    @Override // defpackage.InterfaceC13463e
    public final void metrica(boolean z) {
        if (z) {
            this.ad.Signature(null, 0);
        }
    }

    @Override // defpackage.InterfaceC13463e
    public final boolean vip(MotionEvent motionEvent) {
        int findPointerIndex;
        C1246e c1246e = this.ad;
        c1246e.inmobi.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C11616e c11616e = null;
        if (actionMasked == 0) {
            c1246e.advert = motionEvent.getPointerId(0);
            c1246e.license = motionEvent.getX();
            c1246e.appmetrica = motionEvent.getY();
            VelocityTracker velocityTracker = c1246e.pro;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c1246e.pro = VelocityTracker.obtain();
            if (c1246e.metrica == null) {
                ArrayList arrayList = c1246e.Signature;
                if (!arrayList.isEmpty()) {
                    View mopub = c1246e.mopub(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C11616e c11616e2 = (C11616e) arrayList.get(size);
                        if (c11616e2.appmetrica.ad == mopub) {
                            c11616e = c11616e2;
                            break;
                        }
                        size--;
                    }
                }
                if (c11616e != null) {
                    loadAd loadad = c11616e.appmetrica;
                    c1246e.license -= c11616e.startapp;
                    c1246e.appmetrica -= c11616e.adcel;
                    c1246e.adcel(loadad, true);
                    if (c1246e.ad.remove(loadad.ad)) {
                        c1246e.smaato.ad(loadad);
                    }
                    c1246e.Signature(loadad, c11616e.purchase);
                    c1246e.admob(c1246e.loadAd, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c1246e.advert = -1;
            c1246e.Signature(null, 0);
        } else {
            int i = c1246e.advert;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c1246e.yandex(actionMasked, findPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c1246e.pro;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c1246e.metrica != null;
    }
}
