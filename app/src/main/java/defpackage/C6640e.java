package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6640e extends AnimatorListenerAdapter implements InterfaceC10190e {
    public final ViewGroup ad;
    public final /* synthetic */ C15554e appmetrica;
    public boolean license = true;
    public final View metrica;
    public final View vip;

    public C6640e(C15554e c15554e, ViewGroup viewGroup, View view, View view2) {
        this.appmetrica = c15554e;
        this.ad = viewGroup;
        this.vip = view;
        this.metrica = view2;
    }

    @Override // defpackage.InterfaceC10190e
    public final void ad(AbstractC18109e abstractC18109e) {
        abstractC18109e.ads(this);
    }

    @Override // defpackage.InterfaceC10190e
    public final void appmetrica(AbstractC18109e abstractC18109e) {
        abstractC18109e.ads(this);
    }

    @Override // defpackage.InterfaceC10190e
    public final void billing(AbstractC18109e abstractC18109e) {
        if (this.license) {
            yandex();
        }
    }

    @Override // defpackage.InterfaceC10190e
    public final void license(AbstractC18109e abstractC18109e) {
    }

    @Override // defpackage.InterfaceC10190e
    public final void metrica(AbstractC18109e abstractC18109e) {
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yandex();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        yandex();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.ad.getOverlay().remove(this.vip);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.vip;
        if (view.getParent() == null) {
            AbstractC2016e.ad(this.ad, view);
        } else {
            this.appmetrica.metrica();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.metrica;
            View view2 = this.vip;
            view.setTag(R.id.save_overlay_view, view2);
            AbstractC2016e.ad(this.ad, view2);
            this.license = true;
        }
    }

    @Override // defpackage.InterfaceC10190e
    public final void purchase() {
    }

    @Override // defpackage.InterfaceC10190e
    public final void vip() {
    }

    public final void yandex() {
        this.metrica.setTag(R.id.save_overlay_view, null);
        this.ad.getOverlay().remove(this.vip);
        this.license = false;
    }
}
