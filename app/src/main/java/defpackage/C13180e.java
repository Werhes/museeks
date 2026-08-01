package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13180e extends AnimatorListenerAdapter implements InterfaceC10190e {
    public final View ad;
    public boolean vip = false;

    public C13180e(View view) {
        this.ad = view;
    }

    @Override // defpackage.InterfaceC10190e
    public final void ad(AbstractC18109e abstractC18109e) {
        throw null;
    }

    @Override // defpackage.InterfaceC10190e
    public final void appmetrica(AbstractC18109e abstractC18109e) {
    }

    @Override // defpackage.InterfaceC10190e
    public final void billing(AbstractC18109e abstractC18109e) {
    }

    @Override // defpackage.InterfaceC10190e
    public final void license(AbstractC18109e abstractC18109e) {
    }

    @Override // defpackage.InterfaceC10190e
    public final void metrica(AbstractC18109e abstractC18109e) {
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC16571e.ad.signatures(this.ad, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.vip;
        View view = this.ad;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C17017e c17017e = AbstractC16571e.ad;
        c17017e.signatures(view, 1.0f);
        c17017e.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.ad;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.vip = true;
            view.setLayerType(2, null);
        }
    }

    @Override // defpackage.InterfaceC10190e
    public final void purchase() {
        this.ad.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.InterfaceC10190e
    public final void vip() {
        View view = this.ad;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC16571e.ad.billing(view) : 0.0f));
    }
}
