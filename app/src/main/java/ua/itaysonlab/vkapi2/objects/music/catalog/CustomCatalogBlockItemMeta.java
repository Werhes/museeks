package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/catalog/CustomCatalogBlockItemMeta;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CustomCatalogBlockItemMeta {
    public final String ad;
    public final String vip;

    public CustomCatalogBlockItemMeta(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomCatalogBlockItemMeta)) {
            return false;
        }
        CustomCatalogBlockItemMeta customCatalogBlockItemMeta = (CustomCatalogBlockItemMeta) obj;
        return AbstractC7890e.billing(this.ad, customCatalogBlockItemMeta.ad) && AbstractC7890e.billing(this.vip, customCatalogBlockItemMeta.vip);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vip;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomCatalogBlockItemMeta(icon=");
        sb.append(this.ad);
        sb.append(", content_type=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
