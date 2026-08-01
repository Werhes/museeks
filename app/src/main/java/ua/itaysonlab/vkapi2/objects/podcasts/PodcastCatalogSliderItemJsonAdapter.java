package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C2065e;
import defpackage.C3295e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogSliderItem;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PodcastCatalogSliderItemJsonAdapter extends AbstractC13345e {
    public final AbstractC13345e ad;

    public PodcastCatalogSliderItemJsonAdapter(C14172e c14172e) {
        List list = Collections.EMPTY_LIST;
        if (list.contains("episode")) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("episode");
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(PodcastCatalogSliderItem.EpisodeItem.class);
        this.ad = new C2065e(PodcastCatalogSliderItem.class, "slider_type", arrayList, arrayList2, null).metrica(PodcastCatalogSliderItem.RandomButtonItem.class, "random_button").ad(PodcastCatalogSliderItem.class, C3295e.f7451e, c14172e);
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        this.ad.purchase(abstractC3442e, obj);
    }

    public final String toString() {
        return "GeneratedSealedJsonAdapter(PodcastCatalogSliderItem)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        return this.ad.vip(abstractC17080e);
    }
}
