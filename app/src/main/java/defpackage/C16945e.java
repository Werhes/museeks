package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16945e extends AbstractC8589e {
    public final double ad;

    public C16945e(double d) {
        this.ad = d;
    }

    @Override // defpackage.AbstractC8589e
    public final Object ad() {
        return Double.valueOf(this.ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16945e) && Double.compare(this.ad, ((C16945e) obj).ad) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.ad);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
