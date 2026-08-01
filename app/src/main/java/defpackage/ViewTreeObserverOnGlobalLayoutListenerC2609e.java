package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import androidx.mediarouter.app.license;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2609e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f6465e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6466e;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2609e(int i, Object obj) {
        this.f6466e = i;
        this.f6465e = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f6466e) {
            case 0:
                C16972e c16972e = (C16972e) this.f6465e;
                if (!c16972e.getInternalPopup().ad()) {
                    c16972e.f33234e.amazon(c16972e.getTextDirection(), c16972e.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c16972e.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 1:
                C10920e c10920e = (C10920e) this.f6465e;
                C16972e c16972e2 = c10920e.f21630e;
                c10920e.getClass();
                if (!c16972e2.isAttachedToWindow() || !c16972e2.getGlobalVisibleRect(c10920e.f21627e)) {
                    c10920e.dismiss();
                    return;
                } else {
                    c10920e.remoteconfig();
                    c10920e.purchase();
                    return;
                }
            case 2:
                ViewOnKeyListenerC8330e viewOnKeyListenerC8330e = (ViewOnKeyListenerC8330e) this.f6465e;
                ArrayList arrayList = viewOnKeyListenerC8330e.f17040e;
                if (!viewOnKeyListenerC8330e.ad() || arrayList.size() <= 0 || ((C6712e) arrayList.get(0)).ad.f28229e) {
                    return;
                }
                View view = viewOnKeyListenerC8330e.f17038e;
                if (view == null || !view.isShown()) {
                    viewOnKeyListenerC8330e.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C6712e) it.next()).ad.purchase();
                }
                return;
            case 3:
                license licenseVar = (license) this.f6465e;
                licenseVar.f489e.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = licenseVar.f495e;
                if (hashSet == null || hashSet.size() == 0) {
                    licenseVar.amazon(true);
                    return;
                }
                AnimationAnimationListenerC14540e animationAnimationListenerC14540e = new AnimationAnimationListenerC14540e(1, licenseVar);
                int firstVisiblePosition = licenseVar.f489e.getFirstVisiblePosition();
                boolean z = false;
                for (int i = 0; i < licenseVar.f489e.getChildCount(); i++) {
                    View childAt = licenseVar.f489e.getChildAt(i);
                    if (licenseVar.f495e.contains((C6541e) licenseVar.f514e.getItem(firstVisiblePosition + i))) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(licenseVar.f515e);
                        alphaAnimation.setFillEnabled(true);
                        alphaAnimation.setFillAfter(true);
                        if (!z) {
                            alphaAnimation.setAnimationListener(animationAnimationListenerC14540e);
                            z = true;
                        }
                        childAt.clearAnimation();
                        childAt.startAnimation(alphaAnimation);
                    }
                }
                return;
            default:
                ViewOnKeyListenerC14494e viewOnKeyListenerC14494e = (ViewOnKeyListenerC14494e) this.f6465e;
                C2434e c2434e = viewOnKeyListenerC14494e.f28669e;
                if (!viewOnKeyListenerC14494e.ad() || c2434e.f28229e) {
                    return;
                }
                View view2 = viewOnKeyListenerC14494e.f28659e;
                if (view2 == null || !view2.isShown()) {
                    viewOnKeyListenerC14494e.dismiss();
                    return;
                } else {
                    c2434e.purchase();
                    return;
                }
        }
    }
}
