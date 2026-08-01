package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.loadAd;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11616e implements Animator.AnimatorListener {
    public final /* synthetic */ C1246e Signature;
    public final float ad;
    public float adcel;
    public final /* synthetic */ int amazon;
    public final loadAd appmetrica;
    public final ValueAnimator billing;
    public final float license;
    public final /* synthetic */ loadAd loadAd;
    public final float metrica;
    public final int purchase;
    public float smaato;
    public float startapp;
    public final float vip;
    public boolean yandex;
    public boolean mopub = false;
    public boolean advert = false;

    public C11616e(C1246e c1246e, loadAd loadad, int i, float f, float f2, float f3, float f4, int i2, loadAd loadad2) {
        this.Signature = c1246e;
        this.amazon = i2;
        this.loadAd = loadad2;
        this.purchase = i;
        this.appmetrica = loadad;
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.billing = ofFloat;
        ofFloat.addUpdateListener(new C9008e(3, this));
        ofFloat.setTarget(loadad.ad);
        ofFloat.addListener(this);
        this.smaato = 0.0f;
    }

    public final void ad(Animator animator) {
        if (!this.advert) {
            this.appmetrica.Signature(true);
        }
        this.advert = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.smaato = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ad(animator);
        if (this.mopub) {
            return;
        }
        int i = this.amazon;
        loadAd loadad = this.loadAd;
        C1246e c1246e = this.Signature;
        if (i <= 0) {
            c1246e.smaato.ad(loadad);
        } else {
            c1246e.ad.add(loadad.ad);
            this.yandex = true;
            if (i > 0) {
                c1246e.subscription.post(new RunnableC17144e(c1246e, this, i));
            }
        }
        View view = c1246e.isVip;
        View view2 = loadad.ad;
        if (view == view2) {
            c1246e.loadAd(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
