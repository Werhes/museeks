package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.loadAd;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۦٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15100e extends AnimatorListenerAdapter {
    public final /* synthetic */ loadAd ad;
    public final /* synthetic */ ViewPropertyAnimator appmetrica;
    public final /* synthetic */ int license;
    public final /* synthetic */ View metrica;
    public final /* synthetic */ C11960e purchase;
    public final /* synthetic */ int vip;

    public C15100e(C11960e c11960e, loadAd loadad, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.purchase = c11960e;
        this.ad = loadad;
        this.vip = i;
        this.metrica = view;
        this.license = i2;
        this.appmetrica = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.vip;
        View view = this.metrica;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.license != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.appmetrica.setListener(null);
        C11960e c11960e = this.purchase;
        loadAd loadad = this.ad;
        c11960e.metrica(loadad);
        c11960e.Signature.remove(loadad);
        c11960e.startapp();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.purchase.getClass();
    }
}
