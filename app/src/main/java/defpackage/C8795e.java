package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٛؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8795e {
    public static final C8795e metrica = new C8795e(-1, -1);
    public final int ad;
    public final int vip;

    static {
        new C8795e(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C8795e(int i, int i2) {
        AbstractC2301e.billing((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.ad = i;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8795e) {
            C8795e c8795e = (C8795e) obj;
            if (this.ad == c8795e.ad && this.vip == c8795e.vip) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.ad;
        return ((i >>> 16) | (i << 16)) ^ this.vip;
    }

    public final String toString() {
        return this.ad + "x" + this.vip;
    }
}
