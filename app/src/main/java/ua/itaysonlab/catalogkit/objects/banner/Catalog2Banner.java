package ua.itaysonlab.catalogkit.objects.banner;

import defpackage.AbstractC17861e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/banner/Catalog2Banner;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Catalog2Banner implements InterfaceC15377e {
    public final int ad;
    public final String appmetrica;
    public final String billing;
    public final List license;
    public final List metrica;
    public final String purchase;
    public final Catalog2BannerClickActionRoot vip;
    public final String yandex;

    public Catalog2Banner(int i, Catalog2BannerClickActionRoot catalog2BannerClickActionRoot, List list, List list2, String str, String str2, String str3, String str4) {
        this.ad = i;
        this.vip = catalog2BannerClickActionRoot;
        this.metrica = list;
        this.license = list2;
        this.appmetrica = str;
        this.purchase = str2;
        this.billing = str3;
        this.yandex = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2Banner)) {
            return false;
        }
        Catalog2Banner catalog2Banner = (Catalog2Banner) obj;
        return this.ad == catalog2Banner.ad && AbstractC7890e.billing(this.vip, catalog2Banner.vip) && AbstractC7890e.billing(this.metrica, catalog2Banner.metrica) && AbstractC7890e.billing(this.license, catalog2Banner.license) && AbstractC7890e.billing(this.appmetrica, catalog2Banner.appmetrica) && AbstractC7890e.billing(this.purchase, catalog2Banner.purchase) && AbstractC7890e.billing(this.billing, catalog2Banner.billing) && AbstractC7890e.billing(this.yandex, catalog2Banner.yandex);
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId */
    public final String getAd() {
        return String.valueOf(this.ad);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        Catalog2BannerClickActionRoot catalog2BannerClickActionRoot = this.vip;
        int hashCode = (i + (catalog2BannerClickActionRoot == null ? 0 : catalog2BannerClickActionRoot.ad.hashCode())) * 31;
        List list = this.metrica;
        int billing = AbstractC17861e.billing((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.license);
        String str = this.appmetrica;
        int hashCode2 = (billing + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.purchase;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billing;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.yandex;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog2Banner(id=");
        sb.append(this.ad);
        sb.append(", click_action=");
        sb.append(this.vip);
        sb.append(", buttons=");
        sb.append(this.metrica);
        sb.append(", images=");
        sb.append(this.license);
        sb.append(", text=");
        sb.append(this.appmetrica);
        sb.append(", title=");
        sb.append(this.purchase);
        sb.append(", subtext=");
        sb.append(this.billing);
        sb.append(", image_mode=");
        return AbstractC4653e.applovin(sb, this.yandex, ')');
    }
}
