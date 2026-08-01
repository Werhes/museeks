package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C7327e.class)
/* renamed from: eؒۨۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1502e extends AbstractC5554e implements Comparable<C1502e> {
    public static final C0785e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final double f4365e;

    public C1502e(double d) {
        this.f4365e = d;
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1502e c1502e) {
        return Double.compare(this.f4365e, c1502e.f4365e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        return AbstractC7890e.billing(c12232e.vip(C1502e.class), c12232e.vip(obj.getClass())) && this.f4365e == ((C1502e) obj).f4365e;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f4365e);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return "BsonDouble(value=" + this.f4365e + ')';
    }
}
