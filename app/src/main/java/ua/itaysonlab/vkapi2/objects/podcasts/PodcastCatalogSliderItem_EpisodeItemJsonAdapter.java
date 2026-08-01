package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogSliderItem;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PodcastCatalogSliderItem_EpisodeItemJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("item_id", "episode");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public PodcastCatalogSliderItem_EpisodeItemJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "item_id");
        this.metrica = c14172e.vip(AudioTrack.class, c3295e, "episode");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        PodcastCatalogSliderItem.EpisodeItem episodeItem = (PodcastCatalogSliderItem.EpisodeItem) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("item_id");
        this.vip.purchase(abstractC3442e, episodeItem.ad);
        abstractC3442e.loadAd("episode");
        this.metrica.purchase(abstractC3442e, episodeItem.vip);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PodcastCatalogSliderItem.EpisodeItem)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        String str = null;
        boolean z = false;
        boolean z2 = false;
        Set set = C3295e.f7451e;
        AudioTrack audioTrack = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                Object vip = this.vip.vip(abstractC17080e);
                if (vip == null) {
                    set = AbstractC0869e.subs("item_id", "item_id", abstractC17080e, set);
                    z = true;
                } else {
                    str = (String) vip;
                }
            } else if (mo2308extends == 1) {
                Object vip2 = this.metrica.vip(abstractC17080e);
                if (vip2 == null) {
                    set = AbstractC0869e.subs("episode", "episode", abstractC17080e, set);
                    z2 = true;
                } else {
                    audioTrack = (AudioTrack) vip2;
                }
            }
        }
        abstractC17080e.advert();
        if ((!z) & (str == null)) {
            set = AbstractC0869e.isPro("item_id", "item_id", abstractC17080e, set);
        }
        if ((audioTrack == null) & (!z2)) {
            set = AbstractC0869e.isPro("episode", "episode", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new PodcastCatalogSliderItem.EpisodeItem(str, audioTrack);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
