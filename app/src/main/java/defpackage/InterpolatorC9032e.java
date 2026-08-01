package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ۠ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC9032e implements Interpolator {
    public final /* synthetic */ int ad;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.ad) {
            case 0:
                return f * f * f * f * f;
            case 1:
            case 2:
            case 3:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }
}
