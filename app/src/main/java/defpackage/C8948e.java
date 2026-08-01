package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۙ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8948e implements TypeEvaluator {
    public C13773e[] ad;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C13773e[] c13773eArr = (C13773e[]) obj;
        C13773e[] c13773eArr2 = (C13773e[]) obj2;
        if (!AbstractC18491e.vip(c13773eArr, c13773eArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC18491e.vip(this.ad, c13773eArr)) {
            this.ad = AbstractC18491e.billing(c13773eArr);
        }
        for (int i = 0; i < c13773eArr.length; i++) {
            C13773e c13773e = this.ad[i];
            C13773e c13773e2 = c13773eArr[i];
            C13773e c13773e3 = c13773eArr2[i];
            c13773e.getClass();
            c13773e.ad = c13773e2.ad;
            int i2 = 0;
            while (true) {
                float[] fArr = c13773e2.vip;
                if (i2 < fArr.length) {
                    c13773e.vip[i2] = (c13773e3.vip[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
        }
        return this.ad;
    }
}
