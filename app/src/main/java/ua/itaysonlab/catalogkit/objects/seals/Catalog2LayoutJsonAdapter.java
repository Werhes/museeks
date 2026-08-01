package ua.itaysonlab.catalogkit.objects.seals;

import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC3820e;
import defpackage.AbstractC9546e;
import defpackage.C0356e;
import defpackage.C0947e;
import defpackage.C10113e;
import defpackage.C10287e;
import defpackage.C11121e;
import defpackage.C11375e;
import defpackage.C11967e;
import defpackage.C12971e;
import defpackage.C13392e;
import defpackage.C13420e;
import defpackage.C13707e;
import defpackage.C14046e;
import defpackage.C14172e;
import defpackage.C14691e;
import defpackage.C14880e;
import defpackage.C15394e;
import defpackage.C15611e;
import defpackage.C15835e;
import defpackage.C1693e;
import defpackage.C17095e;
import defpackage.C1714e;
import defpackage.C17591e;
import defpackage.C17941e;
import defpackage.C17993e;
import defpackage.C1824e;
import defpackage.C2065e;
import defpackage.C3295e;
import defpackage.C4150e;
import defpackage.C4525e;
import defpackage.C5198e;
import defpackage.C5895e;
import defpackage.C6624e;
import defpackage.C6910e;
import defpackage.C7226e;
import defpackage.C7417e;
import defpackage.C7454e;
import defpackage.C7510e;
import defpackage.C7553e;
import defpackage.C7665e;
import defpackage.C9277e;
import defpackage.C9802e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Catalog2LayoutJsonAdapter extends AbstractC13345e {
    public final AbstractC13345e ad;

    public Catalog2LayoutJsonAdapter(C14172e c14172e) {
        List list = Collections.EMPTY_LIST;
        if (list.contains("artist_header")) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("artist_header");
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(C9802e.class);
        C2065e vip = new C2065e(Catalog2Layout.class, "name", arrayList, arrayList2, null).metrica(C14046e.class, "audio_content_card_extended_slider").metrica(Catalog2Layout.AudioStreamMix.class, "audio_stream_mix").metrica(C7454e.class, "audio_stream_mix_interactive").metrica(C1714e.class, "banner").metrica(C14691e.class, "placeholder_big").metrica(C4525e.class, "categories_grid").metrica(C12971e.class, "categories_list").metrica(C7226e.class, "music_chart_large_slider").metrica(C10287e.class, "music_chart_triple_stacked_slider").metrica(Catalog2Layout.CompactHeader.class, "header_compact").metrica(C7553e.class, "compact_list").metrica(C1693e.class, "crop_slider").metrica(C10113e.class, "double_list").metrica(C11967e.class, BuildConfig.FLAVOR).metrica(C17941e.class, "entity_double_grid").metrica(Catalog2Layout.ExtendedHeader.class, "header_extended").metrica(C14880e.class, "placeholder").metrica(Catalog2Layout.Header.class, "header").metrica(Catalog2Layout.HorizontalButtons.class, "horizontal_buttons").metrica(C5198e.class, "in_block_separator").metrica(Catalog2Layout.LargeHeader.class, "header_large").metrica(C15835e.class, "large_list").metrica(C13392e.class, "large_slider").metrica(C5895e.class, "link_snippet").metrica(C17993e.class, "list").metrica(C4150e.class, "listened_list").metrica(C17591e.class, "music_chart_list").metrica(C15394e.class, "music_exclusive_slider").metrica(Catalog2Layout.MusicNewsfeedTitle.class, "music_newsfeed_title").metrica(Catalog2Layout.OwnerCell.class, "owner_cell").metrica(C6910e.class, "playable_item_in_progress").metrica(C6624e.class, "podcast_banners_slider").metrica(C17095e.class, "podcast_category_genre_buttons").metrica(C11121e.class, "podcasts_favorites").metrica(C7665e.class, "promo_banners_slider").metrica(C1824e.class, "recomms_slider").metrica(Catalog2Layout.Separator.class, "separator").metrica(C13420e.class, "slider").metrica(C13707e.class, "small_list").metrica(C15611e.class, "placeholder_small").metrica(C0356e.class, "snippets_banner").metrica(Catalog2Layout.SubsectionTabs.class, "subsection_tabs").metrica(Catalog2Layout.SynthOpenCacheSearch.class, "synth_SynthOpenCacheSearch").metrica(C11375e.class, "text").metrica(C9277e.class, "triple_stacked_slider").vip(C7510e.ad);
        C7417e metrica = c14172e.metrica();
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C9802e.class)), new C0947e(C9802e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C14046e.class)), new C0947e(C14046e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C7454e.class)), new C0947e(C7454e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C1714e.class)), new C0947e(C1714e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C14691e.class)), new C0947e(C14691e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C4525e.class)), new C0947e(C4525e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C12971e.class)), new C0947e(C12971e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C7226e.class)), new C0947e(C7226e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C10287e.class)), new C0947e(C10287e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C7553e.class)), new C0947e(C7553e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C1693e.class)), new C0947e(C1693e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C10113e.class)), new C0947e(C10113e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C11967e.class)), new C0947e(C11967e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C17941e.class)), new C0947e(C17941e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C14880e.class)), new C0947e(C14880e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C5198e.class)), new C0947e(C5198e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C15835e.class)), new C0947e(C15835e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C13392e.class)), new C0947e(C13392e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C5895e.class)), new C0947e(C5895e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C17993e.class)), new C0947e(C17993e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C4150e.class)), new C0947e(C4150e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C17591e.class)), new C0947e(C17591e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C15394e.class)), new C0947e(C15394e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C6910e.class)), new C0947e(C6910e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C6624e.class)), new C0947e(C6624e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C17095e.class)), new C0947e(C17095e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C11121e.class)), new C0947e(C11121e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C7665e.class)), new C0947e(C7665e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C1824e.class)), new C0947e(C1824e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C13420e.class)), new C0947e(C13420e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C13707e.class)), new C0947e(C13707e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C15611e.class)), new C0947e(C15611e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C0356e.class)), new C0947e(C0356e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C11375e.class)), new C0947e(C11375e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C9277e.class)), new C0947e(C9277e.ad));
        this.ad = vip.ad(Catalog2Layout.class, C3295e.f7451e, new C14172e(metrica));
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        this.ad.purchase(abstractC3442e, obj);
    }

    public final String toString() {
        return "GeneratedSealedJsonAdapter(Catalog2Layout)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        return this.ad.vip(abstractC17080e);
    }
}
