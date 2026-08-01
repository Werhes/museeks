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
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PodcastCoverSizeJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("height", "type", "src", "url", "width");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public PodcastCoverSizeJsonAdapter(C14172e c14172e) {
        Class cls = Integer.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "height");
        this.metrica = c14172e.vip(String.class, c3295e, "type");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        PodcastCoverSize podcastCoverSize = (PodcastCoverSize) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("height");
        int i = podcastCoverSize.ad;
        AbstractC13345e abstractC13345e = this.vip;
        AbstractC8647e.subs(i, abstractC13345e, abstractC3442e, "type");
        String str = podcastCoverSize.vip;
        AbstractC13345e abstractC13345e2 = this.metrica;
        abstractC13345e2.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("src");
        abstractC13345e2.purchase(abstractC3442e, podcastCoverSize.metrica);
        abstractC3442e.loadAd("url");
        abstractC13345e2.purchase(abstractC3442e, podcastCoverSize.license);
        abstractC3442e.loadAd("width");
        abstractC13345e.purchase(abstractC3442e, Integer.valueOf(podcastCoverSize.appmetrica));
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PodcastCoverSize)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        int i = 0;
        int i2 = 0;
        Object obj2 = null;
        Set set = C3295e.f7451e;
        int i3 = -1;
        Object obj3 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends != 0) {
                    AbstractC13345e abstractC13345e2 = this.metrica;
                    if (mo2308extends == 1) {
                        Object vip = abstractC13345e2.vip(abstractC17080e);
                        if (vip == null) {
                            set = AbstractC0869e.subs("type", "type", abstractC17080e, set);
                        } else {
                            obj = vip;
                        }
                        i3 &= -3;
                    } else if (mo2308extends == 2) {
                        Object vip2 = abstractC13345e2.vip(abstractC17080e);
                        if (vip2 == null) {
                            set = AbstractC0869e.subs("src", "src", abstractC17080e, set);
                        } else {
                            obj3 = vip2;
                        }
                        i3 &= -5;
                    } else if (mo2308extends == 3) {
                        Object vip3 = abstractC13345e2.vip(abstractC17080e);
                        if (vip3 == null) {
                            set = AbstractC0869e.subs("url", "url", abstractC17080e, set);
                        } else {
                            obj2 = vip3;
                        }
                        i3 &= -9;
                    } else if (mo2308extends == 4) {
                        Object vip4 = abstractC13345e.vip(abstractC17080e);
                        if (vip4 == null) {
                            set = AbstractC0869e.subs("width", "width", abstractC17080e, set);
                        } else {
                            i2 = ((Number) vip4).intValue();
                        }
                        i3 &= -17;
                    }
                } else {
                    Object vip5 = abstractC13345e.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("height", "height", abstractC17080e, set);
                    } else {
                        i = ((Number) vip5).intValue();
                    }
                    i3 &= -2;
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        if (i3 == -32) {
            return new PodcastCoverSize(i, i2, (String) obj, (String) obj3, (String) obj2);
        }
        return new PodcastCoverSize((i3 & 1) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 2) != 0 ? BuildConfig.FLAVOR : (String) obj, (i3 & 4) != 0 ? BuildConfig.FLAVOR : (String) obj3, (i3 & 8) != 0 ? BuildConfig.FLAVOR : (String) obj2);
    }
}
