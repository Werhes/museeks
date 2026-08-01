package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15797e {
    public final int ad;
    public final String metrica;
    public final String vip;

    public C15797e(String str, int i, String str2) {
        this.ad = i;
        this.vip = str;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15797e)) {
            return false;
        }
        C15797e c15797e = (C15797e) obj;
        return this.ad == c15797e.ad && AbstractC7890e.billing(this.vip, c15797e.vip) && AbstractC7890e.billing(this.metrica, c15797e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC1786e.advert(AbstractC8703e.m2467class(this.ad) * 31, 31, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mix(type=");
        int i = this.ad;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "ByArtist" : "ByTrack" : "ByPlaylist" : "ByAlbum" : "ByTag");
        sb.append(", name=");
        sb.append(this.vip);
        sb.append(", internalApiId=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
