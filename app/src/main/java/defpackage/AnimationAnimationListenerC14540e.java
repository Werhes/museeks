package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.license;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class AnimationAnimationListenerC14540e implements Animation.AnimationListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ AnimationAnimationListenerC14540e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    private final void ad(Animation animation) {
    }

    private final void appmetrica(Animation animation) {
    }

    private final void license(Animation animation) {
    }

    private final void metrica(Animation animation) {
    }

    private final void vip(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.ad) {
            case 0:
                ((C9394e) this.vip).f18686e = null;
                return;
            case 1:
                ((license) this.vip).amazon(true);
                return;
            default:
                DialogC1747e dialogC1747e = ((C3654e) this.vip).f8213e;
                dialogC1747e.f4767e = false;
                dialogC1747e.subscription();
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.ad;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.ad) {
            case 0:
            case 1:
                return;
            default:
                ((C3654e) this.vip).f8213e.f4767e = true;
                return;
        }
    }
}
