package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8065e {
    public final float ad;

    public final boolean equals(Object obj) {
        if (obj instanceof C8065e) {
            return Float.compare(this.ad, ((C8065e) obj).ad) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.ad);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.ad + ')';
    }
}
