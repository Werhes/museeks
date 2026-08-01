package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ۠ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12796e {
    public final EnumC13608e ad;
    public final double metrica;
    public final EnumC13608e vip;

    public C12796e(EnumC13608e enumC13608e, EnumC13608e enumC13608e2, double d) {
        this.ad = enumC13608e;
        this.vip = enumC13608e2;
        this.metrica = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12796e)) {
            return false;
        }
        C12796e c12796e = (C12796e) obj;
        return this.ad == c12796e.ad && this.vip == c12796e.vip && Double.compare(this.metrica, c12796e.metrica) == 0;
    }

    public final int hashCode() {
        int hashCode = (this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.metrica);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.ad + ", crashlytics=" + this.vip + ", sessionSamplingRate=" + this.metrica + ')';
    }
}
