package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PodcastInfoJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("cover", "plays", "is_favorite", "description", "position");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;

    public PodcastInfoJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(PodcastCover.class, c3295e, "cover");
        this.metrica = c14172e.vip(Integer.TYPE, c3295e, "plays");
        this.license = c14172e.vip(Boolean.class, c3295e, "is_favorite");
        this.appmetrica = c14172e.vip(String.class, c3295e, "description");
        this.purchase = c14172e.vip(Integer.class, c3295e, "position");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        PodcastInfo podcastInfo = (PodcastInfo) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("cover");
        this.vip.purchase(abstractC3442e, podcastInfo.ad);
        abstractC3442e.loadAd("plays");
        AbstractC8647e.subs(podcastInfo.vip, this.metrica, abstractC3442e, "is_favorite");
        this.license.purchase(abstractC3442e, podcastInfo.metrica);
        abstractC3442e.loadAd("description");
        this.appmetrica.purchase(abstractC3442e, podcastInfo.license);
        abstractC3442e.loadAd("position");
        this.purchase.purchase(abstractC3442e, podcastInfo.appmetrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PodcastInfo)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Integer num = null;
        Set set = C3295e.f7451e;
        PodcastCover podcastCover = null;
        Boolean bool = null;
        String str = null;
        Integer num2 = null;
        boolean z = false;
        boolean z2 = false;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                Object vip = this.vip.vip(abstractC17080e);
                if (vip == null) {
                    set = AbstractC0869e.subs("cover", "cover", abstractC17080e, set);
                    z = true;
                } else {
                    podcastCover = (PodcastCover) vip;
                }
            } else if (mo2308extends == 1) {
                Object vip2 = this.metrica.vip(abstractC17080e);
                if (vip2 == null) {
                    set = AbstractC0869e.subs("plays", "plays", abstractC17080e, set);
                    z2 = true;
                } else {
                    num = (Integer) vip2;
                }
            } else if (mo2308extends == 2) {
                bool = (Boolean) this.license.vip(abstractC17080e);
            } else if (mo2308extends == 3) {
                str = (String) this.appmetrica.vip(abstractC17080e);
            } else if (mo2308extends == 4) {
                num2 = (Integer) this.purchase.vip(abstractC17080e);
            }
        }
        abstractC17080e.advert();
        if ((!z) & (podcastCover == null)) {
            set = AbstractC0869e.isPro("cover", "cover", abstractC17080e, set);
        }
        if ((num == null) & (!z2)) {
            set = AbstractC0869e.isPro("plays", "plays", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new PodcastInfo(podcastCover, num.intValue(), bool, str, num2);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
