package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.loadAd;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۢۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12830e extends AnimatorListenerAdapter {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C11960e appmetrica;
    public final /* synthetic */ View license;
    public final /* synthetic */ ViewPropertyAnimator metrica;
    public final /* synthetic */ C1539e vip;

    public /* synthetic */ C12830e(C11960e c11960e, C1539e c1539e, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.ad = i;
        this.appmetrica = c11960e;
        this.vip = c1539e;
        this.metrica = viewPropertyAnimator;
        this.license = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.ad) {
            case 0:
                this.metrica.setListener(null);
                View view = this.license;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C1539e c1539e = this.vip;
                loadAd loadad = c1539e.ad;
                C11960e c11960e = this.appmetrica;
                c11960e.metrica(loadad);
                c11960e.subscription.remove(c1539e.ad);
                c11960e.startapp();
                return;
            default:
                this.metrica.setListener(null);
                View view2 = this.license;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C1539e c1539e2 = this.vip;
                loadAd loadad2 = c1539e2.vip;
                C11960e c11960e2 = this.appmetrica;
                c11960e2.metrica(loadad2);
                c11960e2.subscription.remove(c1539e2.vip);
                c11960e2.startapp();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.ad) {
            case 0:
                loadAd loadad = this.vip.ad;
                this.appmetrica.getClass();
                return;
            default:
                loadAd loadad2 = this.vip.vip;
                this.appmetrica.getClass();
                return;
        }
    }
}
