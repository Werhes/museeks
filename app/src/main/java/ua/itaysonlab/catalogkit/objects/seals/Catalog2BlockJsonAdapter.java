package ua.itaysonlab.catalogkit.objects.seals;

import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C2065e;
import defpackage.C3295e;
import defpackage.C4772e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Catalog2BlockJsonAdapter extends AbstractC13345e {
    public final AbstractC13345e ad;

    public Catalog2BlockJsonAdapter(C14172e c14172e) {
        List list = Collections.EMPTY_LIST;
        if (list.contains("action")) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("action");
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(Catalog2Block.ActionsBlock.class);
        this.ad = new C2065e(Catalog2Block.class, "data_type", arrayList, arrayList2, null).metrica(Catalog2Block.ArtistBannerBlock.class, "artist").metrica(Catalog2Block.ArtistVideosBlock.class, "artist_videos").metrica(Catalog2Block.AudioBooksBlock.class, "audio_books").metrica(Catalog2Block.AudioBooksPersonsBlock.class, "audio_books_persons").metrica(Catalog2Block.AudioContentCardsBlock.class, "audio_content_cards").metrica(Catalog2Block.AudioFollowingsUpdateInfoBlock.class, "audio_followings_update_info").metrica(Catalog2Block.AudioStreamMixesBlock.class, "audio_stream_mixes").metrica(Catalog2Block.CatalogBannersBlock.class, "catalog_banners").metrica(Catalog2Block.CuratorBannerBlock.class, "curator").metrica(Catalog2Block.CuratorGroupBlock.class, "groups").metrica(Catalog2Block.EmptyBlock.class, "empty").metrica(Catalog2Block.LinksBlock.class, "links").metrica(Catalog2Block.LongreadsBlock.class, "longreads").metrica(Catalog2Block.MusicAudiosBlock.class, "music_audios").metrica(Catalog2Block.MusicOwnersBlock.class, "music_owners").metrica(Catalog2Block.MusicPlaylistsBlock.class, "music_playlists").metrica(Catalog2Block.NoDataBlock.class, "none").metrica(Catalog2Block.PlaceholdersBlock.class, "placeholder").metrica(Catalog2Block.PodcastEpisodesBlock.class, "podcast_episodes").metrica(Catalog2Block.PodcastSliderItemsBlock.class, "podcast_slider_items").metrica(Catalog2Block.PodcastsBlock.class, "podcasts").metrica(Catalog2Block.RadioStationsBlock.class, "radiostations").metrica(Catalog2Block.RecommendedPlaylistsBlock.class, "music_recommended_playlists").metrica(Catalog2Block.SearchSuggestionsBlock.class, "search_suggestions").metrica(Catalog2Block.TextsBlock.class, "texts").metrica(Catalog2Block.VideosBlock.class, "videos").vip(C4772e.ad).ad(Catalog2Block.class, C3295e.f7451e, c14172e);
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        this.ad.purchase(abstractC3442e, obj);
    }

    public final String toString() {
        return "GeneratedSealedJsonAdapter(Catalog2Block)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        return this.ad.vip(abstractC17080e);
    }
}
