package ua.itaysonlab.vkapi2.methods.podcasts;

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
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PodcastGetProfilePage_PodcastPageJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("info", "popular", "recent");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public PodcastGetProfilePage_PodcastPageJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(PodcastGetProfilePage$PodcastPageInfo.class, c3295e, "info");
        this.metrica = c14172e.vip(AbstractC18453e.purchase(VKResponseWithItems.class, AbstractC18453e.purchase(List.class, AudioTrack.class)), c3295e, "popular");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        PodcastGetProfilePage$PodcastPage podcastGetProfilePage$PodcastPage = (PodcastGetProfilePage$PodcastPage) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("info");
        this.vip.purchase(abstractC3442e, podcastGetProfilePage$PodcastPage.ad);
        abstractC3442e.loadAd("popular");
        VKResponseWithItems vKResponseWithItems = podcastGetProfilePage$PodcastPage.vip;
        AbstractC13345e abstractC13345e = this.metrica;
        abstractC13345e.purchase(abstractC3442e, vKResponseWithItems);
        abstractC3442e.loadAd("recent");
        abstractC13345e.purchase(abstractC3442e, podcastGetProfilePage$PodcastPage.metrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PodcastGetProfilePage.PodcastPage)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        Object obj2 = null;
        Set set = C3295e.f7451e;
        int i = -1;
        Object obj3 = null;
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
                        set = AbstractC0869e.subs("popular", "popular", abstractC17080e, set);
                    } else {
                        obj3 = vip;
                    }
                    i &= -3;
                } else if (mo2308extends == 2) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("recent", "recent", abstractC17080e, set);
                    } else {
                        obj2 = vip2;
                    }
                    i &= -5;
                }
            } else {
                Object vip3 = this.vip.vip(abstractC17080e);
                if (vip3 == null) {
                    set = AbstractC0869e.subs("info", "info", abstractC17080e, set);
                } else {
                    obj = vip3;
                }
                i &= -2;
            }
        }
        abstractC17080e.advert();
        if (set.size() == 0) {
            return i == -8 ? new PodcastGetProfilePage$PodcastPage((PodcastGetProfilePage$PodcastPageInfo) obj, (VKResponseWithItems) obj3, (VKResponseWithItems) obj2) : new PodcastGetProfilePage$PodcastPage((PodcastGetProfilePage$PodcastPageInfo) obj, (VKResponseWithItems) obj3, (VKResponseWithItems) obj2, i);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
