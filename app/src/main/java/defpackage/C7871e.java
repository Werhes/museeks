package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7871e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C12773e ad;
    public final /* synthetic */ View appmetrica;
    public final /* synthetic */ int license;
    public final /* synthetic */ C12948e metrica;
    public final /* synthetic */ C12948e vip;

    public C7871e(C12773e c12773e, C12948e c12948e, C12948e c12948e2, int i, View view) {
        this.ad = c12773e;
        this.vip = c12948e;
        this.metrica = c12948e2;
        this.license = i;
        this.appmetrica = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C12773e c12773e = this.ad;
        AbstractC12564e abstractC12564e = c12773e.ad;
        abstractC12564e.appmetrica(animatedFraction);
        C12948e c12948e = this.vip;
        C2893e c2893e = c12948e.ad;
        float metrica = abstractC12564e.metrica();
        PathInterpolator pathInterpolator = C15892e.appmetrica;
        int i = Build.VERSION.SDK_INT;
        AbstractC17066e c16087e = i >= 36 ? new C16087e(c12948e) : i >= 35 ? new C8443e(c12948e) : i >= 34 ? new C11610e(c12948e) : i >= 31 ? new C16684e(c12948e) : i >= 30 ? new C15829e(c12948e) : i >= 29 ? new C5815e(c12948e) : new C12525e(c12948e);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((this.license & i2) == 0) {
                c16087e.license(i2, c2893e.startapp(i2));
            } else {
                C7088e startapp = c2893e.startapp(i2);
                C7088e startapp2 = this.metrica.ad.startapp(i2);
                float f = 1.0f - metrica;
                c16087e.license(i2, C12948e.appmetrica(startapp, (int) (((startapp.ad - startapp2.ad) * f) + 0.5d), (int) (((startapp.vip - startapp2.vip) * f) + 0.5d), (int) (((startapp.metrica - startapp2.metrica) * f) + 0.5d), (int) (((startapp.license - startapp2.license) * f) + 0.5d)));
            }
        }
        C15892e.yandex(this.appmetrica, c16087e.vip(), Collections.singletonList(c12773e));
    }
}
