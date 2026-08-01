package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2Replacements;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Catalog2Replacements {
    public final List ad;
    public final String vip;

    public Catalog2Replacements(List list, String str) {
        this.ad = list;
        this.vip = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2Replacements)) {
            return false;
        }
        Catalog2Replacements catalog2Replacements = (Catalog2Replacements) obj;
        return AbstractC7890e.billing(this.ad, catalog2Replacements.ad) && AbstractC7890e.billing(this.vip, catalog2Replacements.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog2Replacements(replacements=");
        sb.append(this.ad);
        sb.append(", new_next_from=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
