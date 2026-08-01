package defpackage;

import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6123e implements InterfaceC11578e {
    public final AudioPlaylist ad;
    public final boolean appmetrica;
    public final int license;
    public final String metrica;
    public final String purchase;
    public final InterfaceC8360e vip;

    public C6123e(AudioPlaylist audioPlaylist, InterfaceC8360e interfaceC8360e, String str, int i, boolean z, String str2) {
        this.ad = audioPlaylist;
        this.vip = interfaceC8360e;
        this.metrica = str;
        this.license = i;
        this.appmetrica = z;
        this.purchase = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6123e)) {
            return false;
        }
        C6123e c6123e = (C6123e) obj;
        return AbstractC7890e.billing(this.ad, c6123e.ad) && this.vip.equals(c6123e.vip) && this.metrica.equals(c6123e.metrica) && this.license == c6123e.license && this.appmetrica == c6123e.appmetrica && this.purchase.equals(c6123e.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + ((AbstractC1786e.mopub(this.license, AbstractC1786e.advert((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31, 31, this.metrica), 31) + (this.appmetrica ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ready(playlist=");
        sb.append(this.ad);
        sb.append(", author=");
        sb.append(this.vip);
        sb.append(", coverUrl=");
        sb.append(this.metrica);
        sb.append(", type=");
        int i = this.license;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "LIBRARY" : "PLAYLIST" : "FEAT" : "ONLY_ARTIST" : "COLLECTION");
        sb.append(", typeWithIndexes=");
        sb.append(this.appmetrica);
        sb.append(", subtitle=");
        return AbstractC4653e.applovin(sb, this.purchase, ')');
    }
}
