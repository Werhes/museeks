package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13377e implements Animator.AnimatorListener {
    public final /* synthetic */ C1511e ad;

    public C13377e(C1511e c1511e) {
        this.ad = c1511e;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1511e c1511e = this.ad;
        ValueAnimator valueAnimator = c1511e.yandex;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.removeAllListeners();
        C18464e c18464e = c1511e.ad;
        AbstractC11130e abstractC11130e = (AbstractC11130e) c18464e.f36189e;
        if (abstractC11130e != null) {
            Iterator it = ((ArrayList) c18464e.f36192e).iterator();
            while (it.hasNext()) {
                InterfaceC8524e interfaceC8524e = (InterfaceC8524e) it.next();
                ((AbstractC11130e) c18464e.f36191e).mo2121e(interfaceC8524e);
                abstractC11130e.mo2133protected(interfaceC8524e);
            }
            ((AbstractC11130e) c18464e.f36191e).mo2139this();
            ((AbstractC11130e) c18464e.f36191e).stop();
            c18464e.f36191e = abstractC11130e;
            c18464e.f36189e = null;
        }
        c1511e.startapp = false;
        c1511e.adcel = false;
        c1511e.appmetrica = !c1511e.appmetrica;
        c1511e.license.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
