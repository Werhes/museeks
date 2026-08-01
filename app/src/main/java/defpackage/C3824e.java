package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؒؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3824e {
    public final String ad;
    public final int appmetrica;
    public final int billing;
    public final boolean license;
    public final int metrica;
    public final String purchase;
    public final String vip;

    public C3824e(int i, int i2, String str, String str2, String str3, boolean z) {
        this.ad = str;
        this.vip = str2;
        this.license = z;
        this.appmetrica = i;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i3 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i3 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.metrica = i3;
        this.purchase = str3;
        this.billing = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C3824e.class != obj.getClass()) {
                return false;
            }
            C3824e c3824e = (C3824e) obj;
            int i = c3824e.billing;
            String str = c3824e.purchase;
            if (this.appmetrica != c3824e.appmetrica || !this.ad.equals(c3824e.ad) || this.license != c3824e.license) {
                return false;
            }
            String str2 = this.purchase;
            int i2 = this.billing;
            if (i2 == 1 && i == 2 && str2 != null && !str2.equals(str)) {
                return false;
            }
            if (i2 == 2 && i == 1 && str != null && !str.equals(str2)) {
                return false;
            }
            if (i2 != 0 && i2 == i) {
                if (str2 != null) {
                    if (!str2.equals(str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.metrica != c3824e.metrica) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.ad.hashCode() * 31) + this.metrica) * 31) + (this.license ? 1231 : 1237)) * 31) + this.appmetrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.ad);
        sb.append("', type='");
        sb.append(this.vip);
        sb.append("', affinity='");
        sb.append(this.metrica);
        sb.append("', notNull=");
        sb.append(this.license);
        sb.append(", primaryKeyPosition=");
        sb.append(this.appmetrica);
        sb.append(", defaultValue='");
        return AbstractC1786e.signatures(sb, this.purchase, "'}");
    }
}
