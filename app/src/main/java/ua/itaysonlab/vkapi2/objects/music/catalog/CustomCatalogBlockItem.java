package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/catalog/CustomCatalogBlockItem;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CustomCatalogBlockItem implements InterfaceC15377e {
    public final String ad;
    public final String appmetrica;
    public final String license;
    public final List metrica;
    public final CustomCatalogBlockItemMeta purchase;
    public final String vip;

    public CustomCatalogBlockItem(String str, String str2, List list, String str3, String str4, CustomCatalogBlockItemMeta customCatalogBlockItemMeta) {
        this.ad = str;
        this.vip = str2;
        this.metrica = list;
        this.license = str3;
        this.appmetrica = str4;
        this.purchase = customCatalogBlockItemMeta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomCatalogBlockItem)) {
            return false;
        }
        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj;
        return AbstractC7890e.billing(this.ad, customCatalogBlockItem.ad) && AbstractC7890e.billing(this.vip, customCatalogBlockItem.vip) && AbstractC7890e.billing(this.metrica, customCatalogBlockItem.metrica) && AbstractC7890e.billing(this.license, customCatalogBlockItem.license) && AbstractC7890e.billing(this.appmetrica, customCatalogBlockItem.appmetrica) && AbstractC7890e.billing(this.purchase, customCatalogBlockItem.purchase);
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId, reason: from getter */
    public final String getAppmetrica() {
        return this.appmetrica;
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
        List list = this.metrica;
        int advert2 = AbstractC1786e.advert(AbstractC1786e.advert((advert + (list == null ? 0 : list.hashCode())) * 31, 31, this.license), 31, this.appmetrica);
        CustomCatalogBlockItemMeta customCatalogBlockItemMeta = this.purchase;
        return advert2 + (customCatalogBlockItemMeta != null ? customCatalogBlockItemMeta.hashCode() : 0);
    }

    public final String toString() {
        return "CustomCatalogBlockItem(title=" + this.ad + ", subtitle=" + this.vip + ", image=" + this.metrica + ", url=" + this.license + ", id=" + this.appmetrica + ", meta=" + this.purchase + ')';
    }
}
