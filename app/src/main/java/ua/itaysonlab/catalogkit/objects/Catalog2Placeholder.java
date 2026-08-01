package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2Placeholder;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Catalog2Placeholder implements InterfaceC15377e {
    public final String ad;
    public final List appmetrica;
    public final List license;
    public final String metrica;
    public final String vip;

    public Catalog2Placeholder(String str, String str2, String str3, List list, List list2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = list;
        this.appmetrica = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2Placeholder)) {
            return false;
        }
        Catalog2Placeholder catalog2Placeholder = (Catalog2Placeholder) obj;
        return AbstractC7890e.billing(this.ad, catalog2Placeholder.ad) && AbstractC7890e.billing(this.vip, catalog2Placeholder.vip) && AbstractC7890e.billing(this.metrica, catalog2Placeholder.metrica) && AbstractC7890e.billing(this.license, catalog2Placeholder.license) && AbstractC7890e.billing(this.appmetrica, catalog2Placeholder.appmetrica);
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId, reason: from getter */
    public final String getAd() {
        return this.ad;
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
        StringBuilder sb = new StringBuilder("Catalog2Placeholder(id=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", text=");
        sb.append(this.metrica);
        sb.append(", icons=");
        sb.append(this.license);
        sb.append(", buttons=");
        return AbstractC1786e.tapsense(sb, this.appmetrica, ')');
    }
}
