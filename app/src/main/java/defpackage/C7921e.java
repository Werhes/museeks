package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7921e {
    public final String ad;
    public final int appmetrica;
    public final C10974e license;
    public final String metrica;
    public final String vip;

    public C7921e(String str, String str2, String str3, C10974e c10974e, int i) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = c10974e;
        this.appmetrica = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7921e)) {
            return false;
        }
        C7921e c7921e = (C7921e) obj;
        int i = c7921e.appmetrica;
        C10974e c10974e = c7921e.license;
        String str = c7921e.metrica;
        String str2 = c7921e.vip;
        String str3 = c7921e.ad;
        String str4 = this.ad;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.vip;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.metrica;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        C10974e c10974e2 = this.license;
        if (c10974e2 == null) {
            if (c10974e != null) {
                return false;
            }
        } else if (!c10974e2.equals(c10974e)) {
            return false;
        }
        int i2 = this.appmetrica;
        return i2 == 0 ? i == 0 : AbstractC8703e.adcel(i2, i);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.vip;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.metrica;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C10974e c10974e = this.license;
        int hashCode4 = (hashCode3 ^ (c10974e == null ? 0 : c10974e.hashCode())) * 1000003;
        int i = this.appmetrica;
        return (i != 0 ? AbstractC8703e.m2467class(i) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.ad);
        sb.append(", fid=");
        sb.append(this.vip);
        sb.append(", refreshToken=");
        sb.append(this.metrica);
        sb.append(", authToken=");
        sb.append(this.license);
        sb.append(", responseCode=");
        int i = this.appmetrica;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
