package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18234e {
    public final String ad;
    public final long appmetrica;
    public final boolean billing;
    public final long license;
    public final long metrica;
    public final int purchase;
    public final String vip;

    public C18234e(String str, String str2, long j, long j2, long j3, int i) {
        this.ad = str;
        this.vip = str2;
        this.metrica = j;
        this.license = j2;
        this.appmetrica = j3;
        this.purchase = i;
        this.billing = (i & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18234e) {
            C18234e c18234e = (C18234e) obj;
            if (AbstractC7890e.billing(this.ad, c18234e.ad) && AbstractC7890e.billing(this.vip, c18234e.vip) && this.metrica == c18234e.metrica && this.license == c18234e.license && this.appmetrica == c18234e.appmetrica && this.purchase == c18234e.purchase) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
        long j = this.metrica;
        int i = (advert + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.license;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.appmetrica;
        return ((((int) (j3 ^ (j3 >>> 32))) + i2) * 31) + this.purchase;
    }

    public final String toString() {
        String ad = C10484e.ad(this.appmetrica);
        StringBuilder tapsense = AbstractC17861e.tapsense("ClassInfo(name=", this.ad, ", primaryKey=", this.vip, ", numProperties=");
        tapsense.append(this.metrica);
        tapsense.append(", numComputedProperties=");
        tapsense.append(this.license);
        tapsense.append(", key=");
        tapsense.append(ad);
        tapsense.append(", flags=");
        tapsense.append(this.purchase);
        tapsense.append(")");
        return tapsense.toString();
    }
}
