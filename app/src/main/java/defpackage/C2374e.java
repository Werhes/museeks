package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2374e implements InterfaceC4977e {
    public final String ad;
    public final String license;
    public final String metrica;
    public final String vip;

    public C2374e(String str, String str2, String str3, String str4) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2374e)) {
            return false;
        }
        C2374e c2374e = (C2374e) obj;
        return AbstractC7890e.billing(this.ad, c2374e.ad) && AbstractC7890e.billing(this.vip, c2374e.vip) && AbstractC7890e.billing(this.metrica, c2374e.metrica) && AbstractC7890e.billing(this.license, c2374e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaceholderWeb(iconUrl=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", text=");
        sb.append(this.metrica);
        sb.append(", reload=");
        return AbstractC4653e.applovin(sb, this.license, ')');
    }
}
