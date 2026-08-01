package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9784e extends AbstractC11025e {
    public final C2310e metrica;

    public C9784e(C2310e c2310e) {
        this.metrica = c2310e;
    }

    @Override // defpackage.AbstractC11025e
    public final void ad(ViewGroup viewGroup) {
        C2310e c2310e = this.metrica;
        C14635e c14635e = (C14635e) c2310e.f36443e;
        View view = c14635e.metrica.f35098e;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((C14635e) c2310e.f36443e).metrica(this);
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Animation from operation " + c14635e + " has been cancelled.");
        }
    }

    @Override // defpackage.AbstractC11025e
    public final void vip(ViewGroup viewGroup) {
        C2310e c2310e = this.metrica;
        C14635e c14635e = (C14635e) c2310e.f36443e;
        if (c2310e.m4626e()) {
            c14635e.metrica(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = c14635e.metrica.f35098e;
        C17424e m804e = c2310e.m804e(context);
        if (m804e == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) m804e.f34142e;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (c14635e.ad != 1) {
            view.startAnimation(animation);
            c14635e.metrica(this);
            return;
        }
        viewGroup.startViewTransition(view);
        RunnableC14206e runnableC14206e = new RunnableC14206e(animation, viewGroup, view);
        runnableC14206e.setAnimationListener(new AnimationAnimationListenerC6077e(c14635e, viewGroup, view, this));
        view.startAnimation(runnableC14206e);
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Animation from operation " + c14635e + " has started.");
        }
    }
}
