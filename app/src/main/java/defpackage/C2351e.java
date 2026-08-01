package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2351e {
    public static final String appmetrica;
    public static final String billing;
    public static final C2351e license = new C2351e(0, 0);
    public static final String purchase;
    public final int ad;
    public final float metrica;
    public final int vip;

    static {
        String str = AbstractC9413e.ad;
        appmetrica = Integer.toString(0, 36);
        purchase = Integer.toString(1, 36);
        billing = Integer.toString(3, 36);
    }

    public C2351e(int i, float f, int i2) {
        this.ad = i;
        this.vip = i2;
        this.metrica = f;
    }

    public C2351e(int i, int i2) {
        this(i, 1.0f, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2351e) {
            C2351e c2351e = (C2351e) obj;
            if (this.ad == c2351e.ad && this.vip == c2351e.vip && this.metrica == c2351e.metrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.metrica) + ((((217 + this.ad) * 31) + this.vip) * 31);
    }
}
