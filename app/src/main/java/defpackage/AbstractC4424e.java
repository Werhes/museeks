package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ۠ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4424e {
    public static final long ad = C9268e.ad(0.0f, 0.0f);
    public static final float vip = 3.1415927f;

    public static final long ad(float f, float f2) {
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (sqrt > 0.0f) {
            return C9268e.ad(f / sqrt, f2 / sqrt);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static long license(float f, float f2) {
        double d = f2;
        return AbstractC11613e.isVip(AbstractC11613e.isPro(f, C9268e.ad((float) Math.cos(d), (float) Math.sin(d))), ad);
    }

    public static final float metrica(float f) {
        return ((f % 1.0f) + 1.0f) % 1.0f;
    }

    public static final float vip(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }
}
