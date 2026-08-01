package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1338e extends AbstractC1111e {
    public final long ad;
    public final String license;
    public final String metrica;
    public final long vip;

    public C1338e(long j, long j2, String str, String str2) {
        this.ad = j;
        this.vip = j2;
        this.metrica = str;
        this.license = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1111e) {
            C1338e c1338e = (C1338e) ((AbstractC1111e) obj);
            String str2 = c1338e.license;
            if (this.ad == c1338e.ad && this.vip == c1338e.vip && this.metrica.equals(c1338e.metrica) && ((str = this.license) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.metrica.hashCode()) * 1000003;
        String str = this.license;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.ad);
        sb.append(", size=");
        sb.append(this.vip);
        sb.append(", name=");
        sb.append(this.metrica);
        sb.append(", uuid=");
        return AbstractC1786e.signatures(sb, this.license, "}");
    }
}
