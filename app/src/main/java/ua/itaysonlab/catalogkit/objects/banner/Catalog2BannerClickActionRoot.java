package ua.itaysonlab.catalogkit.objects.banner;

import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/banner/Catalog2BannerClickActionRoot;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Catalog2BannerClickActionRoot {
    public final Catalog2ButtonAction ad;

    public Catalog2BannerClickActionRoot(Catalog2ButtonAction catalog2ButtonAction) {
        this.ad = catalog2ButtonAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Catalog2BannerClickActionRoot) && AbstractC7890e.billing(this.ad, ((Catalog2BannerClickActionRoot) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "Catalog2BannerClickActionRoot(action=" + this.ad + ')';
    }
}
