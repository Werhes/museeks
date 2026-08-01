package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.loadAd;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902e extends AnimatorListenerAdapter {
    public final /* synthetic */ int ad = 1;
    public final /* synthetic */ C11960e appmetrica;
    public final /* synthetic */ ViewPropertyAnimator license;
    public final /* synthetic */ View metrica;
    public final /* synthetic */ loadAd vip;

    public C0902e(C11960e c11960e, loadAd loadad, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.appmetrica = c11960e;
        this.vip = loadad;
        this.metrica = view;
        this.license = viewPropertyAnimator;
    }

    public C0902e(C11960e c11960e, loadAd loadad, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.appmetrica = c11960e;
        this.vip = loadad;
        this.license = viewPropertyAnimator;
        this.metrica = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.ad) {
            case 1:
                this.metrica.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.ad) {
            case 0:
                this.license.setListener(null);
                this.metrica.setAlpha(1.0f);
                C11960e c11960e = this.appmetrica;
                loadAd loadad = this.vip;
                c11960e.metrica(loadad);
                c11960e.admob.remove(loadad);
                c11960e.startapp();
                return;
            default:
                this.license.setListener(null);
                C11960e c11960e2 = this.appmetrica;
                loadAd loadad2 = this.vip;
                c11960e2.metrica(loadad2);
                c11960e2.loadAd.remove(loadad2);
                c11960e2.startapp();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.ad) {
            case 0:
                this.appmetrica.getClass();
                return;
            default:
                this.appmetrica.getClass();
                return;
        }
    }
}
