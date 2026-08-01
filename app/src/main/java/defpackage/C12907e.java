package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۧ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12907e extends AbstractC17581e {
    public final AbstractC12460e ad;
    public final long license;
    public final String metrica;
    public final String vip;

    public C12907e(C15373e c15373e, String str, String str2, long j) {
        this.ad = c15373e;
        this.vip = str;
        this.metrica = str2;
        this.license = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17581e) {
            C12907e c12907e = (C12907e) ((AbstractC17581e) obj);
            if (this.ad.equals(c12907e.ad) && this.vip.equals(c12907e.vip) && this.metrica.equals(c12907e.metrica) && this.license == c12907e.license) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode()) * 1000003;
        long j = this.license;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.ad);
        sb.append(", parameterKey=");
        sb.append(this.vip);
        sb.append(", parameterValue=");
        sb.append(this.metrica);
        sb.append(", templateVersion=");
        return AbstractC5087e.m1750native(this.license, "}", sb);
    }
}
