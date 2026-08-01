package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14064e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View ad;
    public final /* synthetic */ C18425e metrica;
    public final /* synthetic */ View vip;

    public C14064e(C18425e c18425e, View view, View view2) {
        this.metrica = c18425e;
        this.ad = view;
        this.vip = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.metrica.metrica(this.ad, this.vip, valueAnimator.getAnimatedFraction());
    }
}
