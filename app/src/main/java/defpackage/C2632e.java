package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2632e {
    public final String ad;
    public final String metrica;
    public final String vip;

    public C2632e(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2632e) {
            C2632e c2632e = (C2632e) obj;
            String str3 = c2632e.metrica;
            String str4 = c2632e.vip;
            if (this.ad.equals(c2632e.ad) && ((str = this.vip) != null ? str.equals(str4) : str4 == null) && ((str2 = this.metrica) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.ad.hashCode() ^ 1000003) * 1000003;
        String str = this.vip;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.metrica;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.ad);
        sb.append(", firebaseInstallationId=");
        sb.append(this.vip);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC1786e.signatures(sb, this.metrica, "}");
    }
}
