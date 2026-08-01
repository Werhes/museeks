package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًٌٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8688e {
    public static final C10633e Companion = new Object();
    public final Boolean ad;
    public final Long appmetrica;
    public final Integer license;
    public final Integer metrica;
    public final Double vip;

    public /* synthetic */ C8688e(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            AbstractC5756e.billing(i, 31, C10174e.ad.appmetrica());
            throw null;
        }
        this.ad = bool;
        this.vip = d;
        this.metrica = num;
        this.license = num2;
        this.appmetrica = l;
    }

    public C8688e(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.ad = bool;
        this.vip = d;
        this.metrica = num;
        this.license = num2;
        this.appmetrica = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8688e)) {
            return false;
        }
        C8688e c8688e = (C8688e) obj;
        return AbstractC7890e.billing(this.ad, c8688e.ad) && AbstractC7890e.billing(this.vip, c8688e.vip) && AbstractC7890e.billing(this.metrica, c8688e.metrica) && AbstractC7890e.billing(this.license, c8688e.license) && AbstractC7890e.billing(this.appmetrica, c8688e.appmetrica);
    }

    public final int hashCode() {
        Boolean bool = this.ad;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.vip;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.metrica;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.license;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.appmetrica;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.ad + ", sessionSamplingRate=" + this.vip + ", sessionTimeoutSeconds=" + this.metrica + ", cacheDurationSeconds=" + this.license + ", cacheUpdatedTimeSeconds=" + this.appmetrica + ')';
    }
}
