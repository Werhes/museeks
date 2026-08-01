package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4827e extends AbstractC11369e {
    public final long ad;
    public final String appmetrica;
    public final Integer license;
    public final C11928e metrica;
    public final ArrayList purchase;
    public final long vip;

    public C4827e(long j, long j2, C11928e c11928e, Integer num, String str, ArrayList arrayList) {
        EnumC15543e enumC15543e = EnumC15543e.f30691e;
        this.ad = j;
        this.vip = j2;
        this.metrica = c11928e;
        this.license = num;
        this.appmetrica = str;
        this.purchase = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11369e)) {
            return false;
        }
        C4827e c4827e = (C4827e) ((AbstractC11369e) obj);
        Object obj2 = EnumC15543e.f30691e;
        ArrayList arrayList = c4827e.purchase;
        String str = c4827e.appmetrica;
        Integer num = c4827e.license;
        C11928e c11928e = c4827e.metrica;
        if (this.ad != c4827e.ad || this.vip != c4827e.vip || !this.metrica.equals(c11928e)) {
            return false;
        }
        Integer num2 = this.license;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.appmetrica;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.purchase.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.metrica.hashCode()) * 1000003;
        Integer num = this.license;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.appmetrica;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.purchase.hashCode()) * 1000003) ^ EnumC15543e.f30691e.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.ad + ", requestUptimeMs=" + this.vip + ", clientInfo=" + this.metrica + ", logSource=" + this.license + ", logSourceName=" + this.appmetrica + ", logEvents=" + this.purchase + ", qosTier=" + EnumC15543e.f30691e + "}";
    }
}
