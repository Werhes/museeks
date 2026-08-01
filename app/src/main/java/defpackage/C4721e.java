package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4721e {
    public final String ad;
    public final String metrica;
    public final String vip;

    public C4721e(String str, String str2, String str3) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4721e)) {
            return false;
        }
        C4721e c4721e = (C4721e) obj;
        return AbstractC7890e.billing(this.ad, c4721e.ad) && AbstractC7890e.billing(this.vip, c4721e.vip) && AbstractC7890e.billing(this.metrica, c4721e.metrica);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
        String str = this.metrica;
        return advert + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackUrl(provider=");
        sb.append(this.ad);
        sb.append(", id=");
        sb.append(this.vip);
        sb.append(", hint=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
