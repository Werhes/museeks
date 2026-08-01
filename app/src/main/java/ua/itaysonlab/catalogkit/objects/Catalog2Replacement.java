package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2Replacement;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Catalog2Replacement {
    public final List ad;
    public final List vip;

    public Catalog2Replacement(List list, List list2) {
        this.ad = list;
        this.vip = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2Replacement)) {
            return false;
        }
        Catalog2Replacement catalog2Replacement = (Catalog2Replacement) obj;
        return AbstractC7890e.billing(this.ad, catalog2Replacement.ad) && AbstractC7890e.billing(this.vip, catalog2Replacement.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog2Replacement(from_block_ids=");
        sb.append(this.ad);
        sb.append(", to_blocks=");
        return AbstractC1786e.tapsense(sb, this.vip, ')');
    }
}
