package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/catalog/CatalogArtist;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogArtist implements InterfaceC15377e {
    public final String ad;
    public final List appmetrica;
    public final boolean billing;
    public final List license;
    public final String metrica;
    public final List purchase;
    public final boolean startapp;
    public final String vip;
    public boolean yandex;

    public CatalogArtist(String str, String str2, String str3, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = list;
        this.appmetrica = list2;
        this.purchase = list3;
        this.billing = z;
        this.yandex = z2;
        this.startapp = z3;
    }

    public static String vip(List list) {
        String str = BuildConfig.FLAVOR;
        if (list != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto = (CustomCatalogBlockItemPhoto) it.next();
                int i2 = customCatalogBlockItemPhoto.metrica;
                if (i2 > i) {
                    str = customCatalogBlockItemPhoto.vip;
                    i = i2;
                }
            }
        }
        return str;
    }

    public final String ad() {
        List list = this.appmetrica;
        if (list == null || list.isEmpty()) {
            return vip(this.license);
        }
        List list2 = ((CatalogArtistPhotosContainer) list.get(0)).vip;
        if (list2 != null) {
            return vip(list2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogArtist)) {
            return false;
        }
        CatalogArtist catalogArtist = (CatalogArtist) obj;
        return AbstractC7890e.billing(this.ad, catalogArtist.ad) && AbstractC7890e.billing(this.vip, catalogArtist.vip) && AbstractC7890e.billing(this.metrica, catalogArtist.metrica) && AbstractC7890e.billing(this.license, catalogArtist.license) && AbstractC7890e.billing(this.appmetrica, catalogArtist.appmetrica) && AbstractC7890e.billing(this.purchase, catalogArtist.purchase) && this.billing == catalogArtist.billing && this.yandex == catalogArtist.yandex && this.startapp == catalogArtist.startapp;
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId, reason: from getter */
    public final String getAppmetrica() {
        return this.vip;
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
        String str = this.metrica;
        int hashCode = (advert + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.license;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.appmetrica;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.purchase;
        return ((((((hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31) + (this.billing ? 1231 : 1237)) * 31) + (this.yandex ? 1231 : 1237)) * 31) + (this.startapp ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogArtist(name=");
        sb.append(this.ad);
        sb.append(", id=");
        sb.append(this.vip);
        sb.append(", domain=");
        sb.append(this.metrica);
        sb.append(", photo=");
        sb.append(this.license);
        sb.append(", photos=");
        sb.append(this.appmetrica);
        sb.append(", genres=");
        sb.append(this.purchase);
        sb.append(", is_album_cover=");
        sb.append(this.billing);
        sb.append(", is_followed=");
        sb.append(this.yandex);
        sb.append(", can_follow=");
        return AbstractC1786e.isVip(sb, this.startapp, ')');
    }
}
