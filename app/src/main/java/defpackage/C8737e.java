package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8737e extends AnimatorListenerAdapter {
    public final /* synthetic */ int ad;
    public final /* synthetic */ AbstractC5682e vip;

    public /* synthetic */ C8737e(AbstractC5682e abstractC5682e, int i) {
        this.ad = i;
        this.vip = abstractC5682e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.ad) {
            case 1:
                super.onAnimationEnd(animator);
                AbstractC5682e abstractC5682e = this.vip;
                AbstractC5682e.ad(abstractC5682e);
                ArrayList arrayList = abstractC5682e.f12070e;
                if (arrayList == null || abstractC5682e.f12069e) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC8715e) it.next()).ad(abstractC5682e);
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.ad) {
            case 0:
                super.onAnimationStart(animator);
                AbstractC5682e abstractC5682e = this.vip;
                ArrayList arrayList = abstractC5682e.f12070e;
                if (arrayList == null || abstractC5682e.f12069e) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC8715e) it.next()).vip(abstractC5682e);
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
