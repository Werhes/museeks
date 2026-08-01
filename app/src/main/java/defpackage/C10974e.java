package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10974e {
    public final String ad;
    public final int metrica;
    public final long vip;

    public C10974e(long j, int i, String str) {
        this.ad = str;
        this.vip = j;
        this.metrica = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10974e)) {
            return false;
        }
        C10974e c10974e = (C10974e) obj;
        int i = c10974e.metrica;
        String str = c10974e.ad;
        String str2 = this.ad;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.vip != c10974e.vip) {
            return false;
        }
        int i2 = this.metrica;
        return i2 == 0 ? i == 0 : AbstractC8703e.adcel(i2, i);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.vip;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i2 = this.metrica;
        return (i2 != 0 ? AbstractC8703e.m2467class(i2) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.ad);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.vip);
        sb.append(", responseCode=");
        int i = this.metrica;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
