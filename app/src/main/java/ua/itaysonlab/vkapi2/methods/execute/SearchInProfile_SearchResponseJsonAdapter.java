package ua.itaysonlab.vkapi2.methods.execute;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchInProfile_SearchResponseJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("playlists", "audios");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public SearchInProfile_SearchResponseJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(SearchInProfile$SearchPlaylistResponse.class, c3295e, "playlists");
        this.metrica = c14172e.vip(AbstractC18453e.purchase(List.class, AudioTrack.class), c3295e, "audios");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        SearchInProfile$SearchResponse searchInProfile$SearchResponse = (SearchInProfile$SearchResponse) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("playlists");
        this.vip.purchase(abstractC3442e, searchInProfile$SearchResponse.ad);
        abstractC3442e.loadAd("audios");
        this.metrica.purchase(abstractC3442e, searchInProfile$SearchResponse.vip);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SearchInProfile.SearchResponse)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        SearchInProfile$SearchPlaylistResponse searchInProfile$SearchPlaylistResponse = null;
        boolean z = false;
        boolean z2 = false;
        Set set = C3295e.f7451e;
        List list = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                Object vip = this.vip.vip(abstractC17080e);
                if (vip == null) {
                    set = AbstractC0869e.subs("playlists", "playlists", abstractC17080e, set);
                    z = true;
                } else {
                    searchInProfile$SearchPlaylistResponse = (SearchInProfile$SearchPlaylistResponse) vip;
                }
            } else if (mo2308extends == 1) {
                Object vip2 = this.metrica.vip(abstractC17080e);
                if (vip2 == null) {
                    set = AbstractC0869e.subs("audios", "audios", abstractC17080e, set);
                    z2 = true;
                } else {
                    list = (List) vip2;
                }
            }
        }
        abstractC17080e.advert();
        if ((!z) & (searchInProfile$SearchPlaylistResponse == null)) {
            set = AbstractC0869e.isPro("playlists", "playlists", abstractC17080e, set);
        }
        if ((list == null) & (!z2)) {
            set = AbstractC0869e.isPro("audios", "audios", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new SearchInProfile$SearchResponse(searchInProfile$SearchPlaylistResponse, list);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
