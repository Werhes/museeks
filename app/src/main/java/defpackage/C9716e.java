package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9716e {
    public final String ad;
    public final C12796e appmetrica;
    public final String billing;
    public final long license;
    public final int metrica;
    public final String purchase;
    public final String vip;

    public C9716e(String str, String str2, int i, long j, C12796e c12796e, String str3, String str4) {
        this.ad = str;
        this.vip = str2;
        this.metrica = i;
        this.license = j;
        this.appmetrica = c12796e;
        this.purchase = str3;
        this.billing = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9716e)) {
            return false;
        }
        C9716e c9716e = (C9716e) obj;
        return AbstractC7890e.billing(this.ad, c9716e.ad) && AbstractC7890e.billing(this.vip, c9716e.vip) && this.metrica == c9716e.metrica && this.license == c9716e.license && AbstractC7890e.billing(this.appmetrica, c9716e.appmetrica) && AbstractC7890e.billing(this.purchase, c9716e.purchase) && AbstractC7890e.billing(this.billing, c9716e.billing);
    }

    public final int hashCode() {
        int advert = (AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip) + this.metrica) * 31;
        long j = this.license;
        return this.billing.hashCode() + AbstractC1786e.advert((this.appmetrica.hashCode() + ((advert + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31, this.purchase);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.ad);
        sb.append(", firstSessionId=");
        sb.append(this.vip);
        sb.append(", sessionIndex=");
        sb.append(this.metrica);
        sb.append(", eventTimestampUs=");
        sb.append(this.license);
        sb.append(", dataCollectionStatus=");
        sb.append(this.appmetrica);
        sb.append(", firebaseInstallationId=");
        sb.append(this.purchase);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC4653e.applovin(sb, this.billing, ')');
    }
}
