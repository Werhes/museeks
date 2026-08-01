package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC16028e implements Interpolator {
    public final float[] ad;
    public final float vip;

    public AbstractInterpolatorC16028e(float[] fArr) {
        this.ad = fArr;
        this.vip = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.ad;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.vip;
        float f3 = (f - (min * f2)) / f2;
        float f4 = fArr[min];
        return AbstractC1634e.billing(fArr[min + 1], f4, f3, f4);
    }
}
