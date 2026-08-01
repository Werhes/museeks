package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9380e extends AnimatorListenerAdapter {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C9380e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public C9380e(InterfaceC18180e interfaceC18180e, View view) {
        this.ad = 9;
        this.vip = interfaceC18180e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.ad) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.vip;
                actionBarOverlayLayout.f144e = null;
                actionBarOverlayLayout.f127e = false;
                return;
            case 4:
                ((AbstractC10517e) this.vip).license();
                return;
            case 9:
                ((InterfaceC18180e) this.vip).ad();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.ad) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.vip;
                actionBarOverlayLayout.f144e = null;
                actionBarOverlayLayout.f127e = false;
                return;
            case 1:
                C0497e c0497e = (C0497e) this.vip;
                ArrayList arrayList = new ArrayList(c0497e.f2570e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC8715e) arrayList.get(i)).ad(c0497e);
                }
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((C13665e) this.vip).invoke();
                return;
            case 3:
                C12801e c12801e = (C12801e) this.vip;
                c12801e.Signature();
                c12801e.subscription.start();
                return;
            case 4:
                ((AbstractC10517e) this.vip).appmetrica();
                return;
            case 5:
                ((HideBottomViewOnScrollBehavior) this.vip).yandex = null;
                return;
            case 6:
                C10512e c10512e = (C10512e) this.vip;
                c10512e.f20747e = false;
                c10512e.appmetrica(c10512e.f20754e);
                return;
            case 7:
                AbstractC15933e.ad.postDelayed((RunnableC2623e) this.vip, 100L);
                return;
            case 8:
                ((AbstractC18109e) this.vip).amazon();
                animator.removeListener(this);
                return;
            default:
                ((InterfaceC18180e) this.vip).metrica();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.ad) {
            case 1:
                C0497e c0497e = (C0497e) this.vip;
                ArrayList arrayList = new ArrayList(c0497e.f2570e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC8715e) arrayList.get(i)).vip(c0497e);
                }
                return;
            case 4:
                ((AbstractC10517e) this.vip).purchase(animator);
                return;
            case 9:
                ((InterfaceC18180e) this.vip).vip();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
