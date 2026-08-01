package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2ReplacementOption;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Catalog2ReplacementOption {
    public final String ad;
    public final Integer license;
    public final String metrica;
    public final String vip;

    public Catalog2ReplacementOption(String str, String str2, String str3, Integer num) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2ReplacementOption)) {
            return false;
        }
        Catalog2ReplacementOption catalog2ReplacementOption = (Catalog2ReplacementOption) obj;
        return AbstractC7890e.billing(this.ad, catalog2ReplacementOption.ad) && AbstractC7890e.billing(this.vip, catalog2ReplacementOption.vip) && AbstractC7890e.billing(this.metrica, catalog2ReplacementOption.metrica) && AbstractC7890e.billing(this.license, catalog2ReplacementOption.license);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
        String str = this.metrica;
        int hashCode = (advert + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.license;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Catalog2ReplacementOption(replacement_id=" + this.ad + ", text=" + this.vip + ", icon=" + this.metrica + ", selected=" + this.license + ')';
    }
}
