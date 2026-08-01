package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12258e extends AbstractC15737e {
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final long purchase;
    public final String vip;

    public C12258e(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.vip = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.metrica = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.license = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.appmetrica = str4;
        this.purchase = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC15737e) {
            C12258e c12258e = (C12258e) ((AbstractC15737e) obj);
            if (this.vip.equals(c12258e.vip) && this.metrica.equals(c12258e.metrica) && this.license.equals(c12258e.license) && this.appmetrica.equals(c12258e.appmetrica) && this.purchase == c12258e.purchase) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.vip.hashCode() ^ 1000003) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license.hashCode()) * 1000003) ^ this.appmetrica.hashCode()) * 1000003;
        long j = this.purchase;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.vip);
        sb.append(", parameterKey=");
        sb.append(this.metrica);
        sb.append(", parameterValue=");
        sb.append(this.license);
        sb.append(", variantId=");
        sb.append(this.appmetrica);
        sb.append(", templateVersion=");
        return AbstractC5087e.m1750native(this.purchase, "}", sb);
    }
}
