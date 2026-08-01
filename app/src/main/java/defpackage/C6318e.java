package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6318e extends AnimatorListenerAdapter {
    public final /* synthetic */ int ad = 1;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public C6318e(C12773e c12773e, View view) {
        this.vip = c12773e;
        this.metrica = view;
    }

    public C6318e(AbstractC18109e abstractC18109e, C2271e c2271e) {
        this.metrica = abstractC18109e;
        this.vip = c2271e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.ad) {
            case 0:
                ((C2271e) this.vip).remove(animator);
                ((AbstractC18109e) this.metrica).f35514e.remove(animator);
                return;
            default:
                C12773e c12773e = (C12773e) this.vip;
                c12773e.ad.appmetrica(1.0f);
                C15892e.purchase(c12773e, (View) this.metrica);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.ad) {
            case 0:
                ((AbstractC18109e) this.metrica).f35514e.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
