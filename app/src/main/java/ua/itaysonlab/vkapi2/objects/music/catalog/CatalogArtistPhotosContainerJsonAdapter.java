package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogArtistPhotosContainerJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("type", "photo");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public CatalogArtistPhotosContainerJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "type");
        this.metrica = c14172e.vip(AbstractC18453e.purchase(List.class, CustomCatalogBlockItemPhoto.class), c3295e, "photo");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        CatalogArtistPhotosContainer catalogArtistPhotosContainer = (CatalogArtistPhotosContainer) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("type");
        this.vip.purchase(abstractC3442e, catalogArtistPhotosContainer.ad);
        abstractC3442e.loadAd("photo");
        this.metrica.purchase(abstractC3442e, catalogArtistPhotosContainer.vip);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CatalogArtistPhotosContainer)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        String str = null;
        List list = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                str = (String) this.vip.vip(abstractC17080e);
            } else if (mo2308extends == 1) {
                list = (List) this.metrica.vip(abstractC17080e);
            }
        }
        abstractC17080e.advert();
        return new CatalogArtistPhotosContainer(str, list);
    }
}
