package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۨۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1498e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C1498e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public /* synthetic */ C1498e(C8167e c8167e, View view) {
        this.ad = 5;
        this.vip = c8167e;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.ad) {
            case 0:
                C5008e c5008e = (C5008e) this.vip;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!(c5008e.appmetrica && c5008e.license) && floatValue > 0.0f && floatValue < 0.01f) {
                    ((ValueAnimator) c5008e.purchase.yandex()).pause();
                    return;
                }
                return;
            case 1:
                C5008e c5008e2 = (C5008e) ((C12177e) this.vip).f24475e;
                if (c5008e2.adcel.adcel(((Float) valueAnimator.getAnimatedValue()).floatValue(), c5008e2.vip, c5008e2.startapp)) {
                    c5008e2.yandex.invalidate();
                    return;
                }
                return;
            case 2:
                C12801e c12801e = (C12801e) this.vip;
                c12801e.getClass();
                c12801e.license.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                C10867e c10867e = (C10867e) this.vip;
                c10867e.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c10867e.adcel.setAlpha((int) (255.0f * floatValue2));
                c10867e.inmobi = floatValue2;
                return;
            case 4:
                ((C7383e) this.vip).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((View) ((C0573e) ((C8167e) this.vip).f16626e).signatures.getParent()).invalidate();
                return;
        }
    }
}
