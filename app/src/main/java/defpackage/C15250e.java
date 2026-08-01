package defpackage;

import android.animation.AnimatorSet;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15250e extends AbstractC11025e {
    public AnimatorSet license;
    public final C2310e metrica;

    public C15250e(C2310e c2310e) {
        this.metrica = c2310e;
    }

    @Override // defpackage.AbstractC11025e
    public final void ad(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.license;
        C2310e c2310e = this.metrica;
        if (animatorSet == null) {
            ((C14635e) c2310e.f36443e).metrica(this);
            return;
        }
        C14635e c14635e = (C14635e) c2310e.f36443e;
        if (!c14635e.billing) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C16878e.ad.ad(animatorSet);
        }
        if (AbstractC15958e.m4045native(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(c14635e);
            sb.append(" has been canceled");
            sb.append(c14635e.billing ? " with seeking." : ".");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // defpackage.AbstractC11025e
    public final void license(ViewGroup viewGroup) {
        C15250e c15250e;
        C2310e c2310e = this.metrica;
        if (c2310e.m4626e()) {
            return;
        }
        C17424e m804e = c2310e.m804e(viewGroup.getContext());
        this.license = m804e != null ? (AnimatorSet) m804e.f34141e : null;
        C14635e c14635e = (C14635e) c2310e.f36443e;
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c14635e.metrica;
        boolean z = c14635e.ad == 3;
        View view = abstractComponentCallbacksC17875e.f35098e;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.license;
        if (animatorSet != null) {
            c15250e = this;
            animatorSet.addListener(new C17164e(viewGroup, view, z, c14635e, c15250e));
        } else {
            c15250e = this;
        }
        AnimatorSet animatorSet2 = c15250e.license;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // defpackage.AbstractC11025e
    public final void metrica(C0419e c0419e) {
        C14635e c14635e = (C14635e) this.metrica.f36443e;
        AnimatorSet animatorSet = this.license;
        if (animatorSet == null) {
            c14635e.metrica(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !c14635e.metrica.f35070e) {
            return;
        }
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + c14635e);
        }
        long ad = C17724e.ad.ad(animatorSet);
        long j = c0419e.metrica * ((float) ad);
        if (j == 0) {
            j = 1;
        }
        if (j == ad) {
            j = ad - 1;
        }
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + c14635e);
        }
        C16878e.ad.vip(animatorSet, j);
    }

    @Override // defpackage.AbstractC11025e
    public final void vip(ViewGroup viewGroup) {
        C14635e c14635e = (C14635e) this.metrica.f36443e;
        AnimatorSet animatorSet = this.license;
        if (animatorSet == null) {
            c14635e.metrica(this);
            return;
        }
        animatorSet.start();
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Animator from operation " + c14635e + " has started.");
        }
    }
}
