package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9574e extends AbstractC17162e {
    public final String ad;
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final String purchase;
    public final String vip;

    public C9574e(String str, String str2, String str3, String str4, String str5, String str6) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = str5;
        this.purchase = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17162e) {
            C9574e c9574e = (C9574e) ((AbstractC17162e) obj);
            String str5 = c9574e.purchase;
            String str6 = c9574e.appmetrica;
            String str7 = c9574e.license;
            String str8 = c9574e.metrica;
            if (this.ad.equals(c9574e.ad) && this.vip.equals(c9574e.vip) && ((str = this.metrica) != null ? str.equals(str8) : str8 == null) && ((str2 = this.license) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.appmetrica) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.purchase) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003;
        String str = this.metrica;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.license;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.appmetrica;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.purchase;
        return hashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.ad);
        sb.append(", version=");
        sb.append(this.vip);
        sb.append(", displayVersion=");
        sb.append(this.metrica);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.license);
        sb.append(", developmentPlatform=");
        sb.append(this.appmetrica);
        sb.append(", developmentPlatformVersion=");
        return AbstractC1786e.signatures(sb, this.purchase, "}");
    }
}
