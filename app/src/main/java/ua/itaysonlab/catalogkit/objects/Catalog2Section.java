package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2Section;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Catalog2Section {
    public final String ad;
    public final List appmetrica;
    public List license;
    public final String metrica;
    public final String vip;

    public Catalog2Section(String str, String str2, String str3, List list, List list2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = list;
        this.appmetrica = list2;
    }

    public /* synthetic */ Catalog2Section(String str, String str2, String str3, List list, List list2, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2);
    }

    public static Catalog2Section ad(Catalog2Section catalog2Section, List list) {
        String str = catalog2Section.ad;
        String str2 = catalog2Section.vip;
        String str3 = catalog2Section.metrica;
        List list2 = catalog2Section.appmetrica;
        catalog2Section.getClass();
        return new Catalog2Section(str, str2, str3, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2Section)) {
            return false;
        }
        Catalog2Section catalog2Section = (Catalog2Section) obj;
        return AbstractC7890e.billing(this.ad, catalog2Section.ad) && AbstractC7890e.billing(this.vip, catalog2Section.vip) && AbstractC7890e.billing(this.metrica, catalog2Section.metrica) && AbstractC7890e.billing(this.license, catalog2Section.license) && AbstractC7890e.billing(this.appmetrica, catalog2Section.appmetrica);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
        String str = this.metrica;
        int hashCode = (advert + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.license;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.appmetrica;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog2Section(id=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", next_from=");
        sb.append(this.metrica);
        sb.append(", blocks=");
        sb.append(this.license);
        sb.append(", actions=");
        return AbstractC1786e.tapsense(sb, this.appmetrica, ')');
    }
}
