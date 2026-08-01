package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۧۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC6077e implements Animation.AnimationListener {
    public final /* synthetic */ C14635e ad;
    public final /* synthetic */ C9784e license;
    public final /* synthetic */ View metrica;
    public final /* synthetic */ ViewGroup vip;

    public AnimationAnimationListenerC6077e(C14635e c14635e, ViewGroup viewGroup, View view, C9784e c9784e) {
        this.ad = c14635e;
        this.vip = viewGroup;
        this.metrica = view;
        this.license = c9784e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.vip;
        viewGroup.post(new RunnableC4904e(9, viewGroup, this.metrica, this.license));
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.ad + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.ad + " has reached onAnimationStart.");
        }
    }
}
