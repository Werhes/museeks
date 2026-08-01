package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8480e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C1935e ad;
    public final /* synthetic */ C8266e vip;

    public C8480e(C8266e c8266e, C1935e c1935e) {
        this.vip = c8266e;
        this.ad = c1935e;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1935e c1935e = this.ad;
        C8266e.license(floatValue, c1935e);
        C8266e c8266e = this.vip;
        c8266e.ad(floatValue, c1935e, false);
        c8266e.invalidateSelf();
    }
}
