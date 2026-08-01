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
import defpackage.C2897e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchInProfile_SearchPlaylistResponseJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("items", "profiles", "groups");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public SearchInProfile_SearchPlaylistResponseJsonAdapter(C14172e c14172e) {
        C2897e purchase = AbstractC18453e.purchase(List.class, AudioPlaylist.class);
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(purchase, c3295e, "items");
        this.metrica = c14172e.vip(AbstractC18453e.purchase(List.class, VKProfile.class), c3295e, "profiles");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        SearchInProfile$SearchPlaylistResponse searchInProfile$SearchPlaylistResponse = (SearchInProfile$SearchPlaylistResponse) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("items");
        this.vip.purchase(abstractC3442e, searchInProfile$SearchPlaylistResponse.ad);
        abstractC3442e.loadAd("profiles");
        List list = searchInProfile$SearchPlaylistResponse.vip;
        AbstractC13345e abstractC13345e = this.metrica;
        abstractC13345e.purchase(abstractC3442e, list);
        abstractC3442e.loadAd("groups");
        abstractC13345e.purchase(abstractC3442e, searchInProfile$SearchPlaylistResponse.metrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SearchInProfile.SearchPlaylistResponse)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        List list = null;
        List list2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Set set = C3295e.f7451e;
        List list3 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends != 0) {
                AbstractC13345e abstractC13345e = this.metrica;
                if (mo2308extends == 1) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("profiles", "profiles", abstractC17080e, set);
                        z2 = true;
                    } else {
                        list3 = (List) vip;
                    }
                } else if (mo2308extends == 2) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("groups", "groups", abstractC17080e, set);
                        z3 = true;
                    } else {
                        list2 = (List) vip2;
                    }
                }
            } else {
                Object vip3 = this.vip.vip(abstractC17080e);
                if (vip3 == null) {
                    set = AbstractC0869e.subs("items", "items", abstractC17080e, set);
                    z = true;
                } else {
                    list = (List) vip3;
                }
            }
        }
        abstractC17080e.advert();
        if ((!z) & (list == null)) {
            set = AbstractC0869e.isPro("items", "items", abstractC17080e, set);
        }
        if ((!z2) & (list3 == null)) {
            set = AbstractC0869e.isPro("profiles", "profiles", abstractC17080e, set);
        }
        if ((list2 == null) & (!z3)) {
            set = AbstractC0869e.isPro("groups", "groups", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new SearchInProfile$SearchPlaylistResponse(list, list3, list2);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
