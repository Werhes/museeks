package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC1786e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UmaArtist;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UmaArtist implements InterfaceC15377e {
    public final String ad;
    public final String adcel;
    public final boolean appmetrica;
    public final Boolean billing;
    public final UmaCover license;
    public final long metrica;
    public final Boolean purchase;
    public final String startapp;
    public final String vip;
    public final List yandex;

    public UmaArtist(String str, String str2, long j, UmaCover umaCover, boolean z, Boolean bool, Boolean bool2, List list, String str3, String str4) {
        this.ad = str;
        this.vip = str2;
        this.metrica = j;
        this.license = umaCover;
        this.appmetrica = z;
        this.purchase = bool;
        this.billing = bool2;
        this.yandex = list;
        this.startapp = str3;
        this.adcel = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UmaArtist)) {
            return false;
        }
        UmaArtist umaArtist = (UmaArtist) obj;
        return AbstractC7890e.billing(this.ad, umaArtist.ad) && AbstractC7890e.billing(this.vip, umaArtist.vip) && this.metrica == umaArtist.metrica && AbstractC7890e.billing(this.license, umaArtist.license) && this.appmetrica == umaArtist.appmetrica && AbstractC7890e.billing(this.purchase, umaArtist.purchase) && AbstractC7890e.billing(this.billing, umaArtist.billing) && AbstractC7890e.billing(this.yandex, umaArtist.yandex) && AbstractC7890e.billing(this.startapp, umaArtist.startapp) && AbstractC7890e.billing(this.adcel, umaArtist.adcel);
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId */
    public final String getAd() {
        return String.valueOf(this.metrica);
    }

    public final int hashCode() {
        String str = this.ad;
        int advert = AbstractC1786e.advert((str == null ? 0 : str.hashCode()) * 31, 31, this.vip);
        long j = this.metrica;
        int hashCode = (((this.license.hashCode() + ((advert + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + (this.appmetrica ? 1231 : 1237)) * 31;
        Boolean bool = this.purchase;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.billing;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.yandex;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.startapp;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adcel;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UmaArtist(shareHash=");
        sb.append(this.ad);
        sb.append(", name=");
        sb.append(this.vip);
        sb.append(", apiId=");
        sb.append(this.metrica);
        sb.append(", avatar=");
        sb.append(this.license);
        sb.append(", isAutoGenCover=");
        sb.append(this.appmetrica);
        sb.append(", isRadioCapable=");
        sb.append(this.purchase);
        sb.append(", isLiked=");
        sb.append(this.billing);
        sb.append(", relevantArtistsNames=");
        sb.append(this.yandex);
        sb.append(", vkId=");
        sb.append(this.startapp);
        sb.append(", umaTags=");
        return AbstractC4653e.applovin(sb, this.adcel, ')');
    }
}
