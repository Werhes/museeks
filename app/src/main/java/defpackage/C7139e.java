package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7139e {
    public final int ad;
    public final int vip;
    public static final C7139e metrica = new C7139e(0, 0);
    public static final C7139e license = new C7139e(2, 0);
    public static final C7139e appmetrica = new C7139e(0, 1);
    public static final C7139e purchase = new C7139e(1, 1);

    public C7139e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7139e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C7139e c7139e = (C7139e) obj;
        return this.ad == c7139e.ad && this.vip == c7139e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + this.vip;
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) C2782e.vip(this.ad)) + ", vertical=" + ((Object) C13692e.vip(this.vip)) + ')';
    }
}
