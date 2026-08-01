package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4194e {
    public static final String appmetrica;
    public static final C4194e license = new C4194e(1.0f);
    public static final String purchase;
    public final float ad;
    public final int metrica;
    public final float vip;

    static {
        String str = AbstractC9413e.ad;
        appmetrica = Integer.toString(0, 36);
        purchase = Integer.toString(1, 36);
    }

    public C4194e(float f) {
        this(f, 1.0f);
    }

    public C4194e(float f, float f2) {
        AbstractC2301e.billing(f > 0.0f);
        AbstractC2301e.billing(f2 > 0.0f);
        this.ad = f;
        this.vip = f2;
        this.metrica = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4194e.class == obj.getClass()) {
            C4194e c4194e = (C4194e) obj;
            if (this.ad == c4194e.ad && this.vip == c4194e.vip) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.vip) + ((Float.floatToRawIntBits(this.ad) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.ad), Float.valueOf(this.vip)};
        String str = AbstractC9413e.ad;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
