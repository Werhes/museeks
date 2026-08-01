package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٛٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13368e extends AnimatorListenerAdapter implements InterfaceC10190e {
    public final View ad;
    public boolean appmetrica;
    public final ViewGroup metrica;
    public final int vip;
    public boolean purchase = false;
    public final boolean license = true;

    public C13368e(View view, int i) {
        this.ad = view;
        this.vip = i;
        this.metrica = (ViewGroup) view.getParent();
        yandex(true);
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
        this.purchase = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.purchase) {
            AbstractC16571e.vip(this.ad, this.vip);
            ViewGroup viewGroup = this.metrica;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        yandex(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.purchase) {
            AbstractC16571e.vip(this.ad, this.vip);
            ViewGroup viewGroup = this.metrica;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        yandex(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            AbstractC16571e.vip(this.ad, 0);
            ViewGroup viewGroup = this.metrica;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // defpackage.InterfaceC10190e
    public final void purchase() {
        yandex(true);
        if (this.purchase) {
            return;
        }
        AbstractC16571e.vip(this.ad, 0);
    }

    @Override // defpackage.InterfaceC10190e
    public final void vip() {
        yandex(false);
        if (this.purchase) {
            return;
        }
        AbstractC16571e.vip(this.ad, this.vip);
    }

    public final void yandex(boolean z) {
        ViewGroup viewGroup;
        if (!this.license || this.appmetrica == z || (viewGroup = this.metrica) == null) {
            return;
        }
        this.appmetrica = z;
        AbstractC8141e.yandex(viewGroup, z);
    }
}
