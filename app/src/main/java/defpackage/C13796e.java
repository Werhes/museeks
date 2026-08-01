package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13796e implements InterfaceC6641e {
    public final String ad;
    public final String appmetrica;
    public final long license;
    public final int metrica;
    public final String purchase;
    public final int vip;

    public C13796e(int i, int i2, long j, String str, String str2, String str3) {
        this.ad = str;
        this.vip = i;
        this.metrica = i2;
        this.license = j;
        this.appmetrica = str2;
        this.purchase = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13796e)) {
            return false;
        }
        C13796e c13796e = (C13796e) obj;
        return AbstractC7890e.billing(this.ad, c13796e.ad) && this.vip == c13796e.vip && this.metrica == c13796e.metrica && this.license == c13796e.license && AbstractC7890e.billing(this.appmetrica, c13796e.appmetrica) && AbstractC7890e.billing(this.purchase, c13796e.purchase);
    }

    public final int hashCode() {
        int hashCode = ((((this.ad.hashCode() * 31) + this.vip) * 31) + this.metrica) * 31;
        long j = this.license;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.appmetrica;
        int hashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.purchase;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenPlaylist(thumbnailUrl=");
        sb.append(this.ad);
        sb.append(", apiMainColor=");
        sb.append(this.vip);
        sb.append(", id=");
        sb.append(this.metrica);
        sb.append(", ownerId=");
        sb.append(this.license);
        sb.append(", accessKey=");
        sb.append(this.appmetrica);
        sb.append(", title=");
        return AbstractC4653e.applovin(sb, this.purchase, ')');
    }
}
