package defpackage;

import android.view.animation.Animation;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC11022e implements Animation.AnimationListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C6559e vip;

    public /* synthetic */ AnimationAnimationListenerC11022e(C6559e c6559e, int i) {
        this.ad = i;
        this.vip = c6559e;
    }

    private final void ad(Animation animation) {
    }

    private final void license(Animation animation) {
    }

    private final void metrica(Animation animation) {
    }

    private final void vip(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC11414e interfaceC11414e;
        switch (this.ad) {
            case 0:
                C6559e c6559e = this.vip;
                if (!c6559e.f13499e) {
                    c6559e.advert();
                    return;
                }
                c6559e.f13513e.setAlpha(255);
                c6559e.f13513e.start();
                if (c6559e.f13518e && (interfaceC11414e = c6559e.f13506e) != null) {
                    ((AbstractC3655e) ((C17687e) interfaceC11414e).f34647e).mo1388instanceof();
                }
                c6559e.f13502e = c6559e.f13531e.getTop();
                return;
            default:
                C6559e c6559e2 = this.vip;
                C4606e c4606e = new C4606e(c6559e2, 1);
                c6559e2.f13520e = c4606e;
                c4606e.setDuration(150L);
                C13606e c13606e = c6559e2.f13531e;
                c13606e.f26991e = null;
                c13606e.clearAnimation();
                c6559e2.f13531e.startAnimation(c6559e2.f13520e);
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.ad;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.ad;
    }
}
