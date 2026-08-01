package defpackage;

import android.animation.ValueAnimator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14750e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C10438e metrica;
    public final /* synthetic */ int vip;

    public C14750e(C10438e c10438e, int i, int i2) {
        this.metrica = c10438e;
        this.ad = i;
        this.vip = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C10438e c10438e = this.metrica;
        int metrica = AbstractC16664e.metrica(c10438e.f20612e, animatedFraction, this.ad);
        int metrica2 = AbstractC16664e.metrica(c10438e.f20615e, animatedFraction, this.vip);
        if (metrica == c10438e.f20608e && metrica2 == c10438e.f20618e) {
            return;
        }
        c10438e.f20608e = metrica;
        c10438e.f20618e = metrica2;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        c10438e.postInvalidateOnAnimation();
    }
}
