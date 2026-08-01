package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17979e {
    public static final float license;
    public static final float metrica;
    public static final float vip;
    public final float ad;

    static {
        ad(0.0f);
        ad(0.5f);
        vip = 0.5f;
        ad(-1.0f);
        metrica = -1.0f;
        ad(1.0f);
        license = 1.0f;
    }

    public static void ad(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            AbstractC5525e.vip("topRatio should be in [0..1] range or -1");
        }
    }

    public static String vip(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == vip) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == metrica) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == license) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17979e) {
            return Float.compare(this.ad, ((C17979e) obj).ad) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.ad);
    }

    public final String toString() {
        return vip(this.ad);
    }
}
