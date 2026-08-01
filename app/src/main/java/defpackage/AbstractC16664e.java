package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۧٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16664e {
    public static final LinearInterpolator ad = new LinearInterpolator();
    public static final C17633e vip = new C17633e(1);
    public static final C17633e metrica = new C17633e(0);
    public static final C17633e license = new AbstractInterpolatorC16028e(C17633e.appmetrica);
    public static final DecelerateInterpolator appmetrica = new DecelerateInterpolator();

    public static float ad(float f, float f2, float f3) {
        return AbstractC1634e.billing(f2, f, f3, f);
    }

    public static int metrica(int i, float f, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }

    public static float vip(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : ad(f, f2, (f5 - f3) / (f4 - f3));
    }
}
