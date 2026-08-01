package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9008e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C9008e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.ad) {
            case 0:
                ((C5856e) this.vip).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C11252e c11252e = ((BottomSheetBehavior) this.vip).startapp;
                if (c11252e != null) {
                    c11252e.smaato(floatValue);
                    return;
                }
                return;
            case 2:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C7187e c7187e = (C7187e) this.vip;
                c7187e.metrica.setAlpha(floatValue2);
                c7187e.license.setAlpha(floatValue2);
                c7187e.remoteconfig.invalidate();
                return;
            case 3:
                ((C11616e) this.vip).smaato = valueAnimator.getAnimatedFraction();
                return;
            case 4:
                ((TabLayout) this.vip).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            default:
                ((TextInputLayout) this.vip).f959e.mopub(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
