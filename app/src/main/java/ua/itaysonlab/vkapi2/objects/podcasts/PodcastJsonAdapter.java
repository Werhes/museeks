package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PodcastJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("podcast_title", "owner_id", "id", "playlist_id", "subtitle", "thumbs");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public PodcastJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "podcast_title");
        this.metrica = c14172e.vip(Long.TYPE, c3295e, "owner_id");
        this.license = c14172e.vip(Integer.TYPE, c3295e, "id");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, PodcastCover.class), c3295e, "thumbs");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        Podcast podcast = (Podcast) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("podcast_title");
        String str = podcast.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("owner_id");
        AbstractC8647e.crashlytics(podcast.vip, this.metrica, abstractC3442e, "id");
        int i = podcast.metrica;
        AbstractC13345e abstractC13345e2 = this.license;
        AbstractC8647e.subs(i, abstractC13345e2, abstractC3442e, "playlist_id");
        AbstractC8647e.subs(podcast.license, abstractC13345e2, abstractC3442e, "subtitle");
        abstractC13345e.purchase(abstractC3442e, podcast.appmetrica);
        abstractC3442e.loadAd("thumbs");
        this.appmetrica.purchase(abstractC3442e, podcast.purchase);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Podcast)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0044. Please report as an issue. */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Long l = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        List list = null;
        Set set = C3295e.f7451e;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        Integer num2 = null;
        while (true) {
            Long l2 = l;
            Integer num3 = num2;
            Integer num4 = num;
            String str3 = str;
            boolean z7 = z;
            if (!abstractC17080e.Signature()) {
                boolean z8 = z2;
                boolean z9 = z3;
                abstractC17080e.advert();
                if ((!z7) & (str3 == null)) {
                    set = AbstractC0869e.isPro("podcast_title", "podcast_title", abstractC17080e, set);
                }
                if ((!z8) & (l2 == null)) {
                    set = AbstractC0869e.isPro("owner_id", "owner_id", abstractC17080e, set);
                }
                if ((!z9) & (num3 == null)) {
                    set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
                }
                if ((!z4) & (num4 == null)) {
                    set = AbstractC0869e.isPro("playlist_id", "playlist_id", abstractC17080e, set);
                }
                if ((!z5) & (str2 == null)) {
                    set = AbstractC0869e.isPro("subtitle", "subtitle", abstractC17080e, set);
                }
                if ((!z6) & (list == null)) {
                    set = AbstractC0869e.isPro("thumbs", "thumbs", abstractC17080e, set);
                }
                if (set.size() == 0) {
                    return new Podcast(str3, l2.longValue(), num3.intValue(), num4.intValue(), str2, list);
                }
                throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
            }
            boolean z10 = z2;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.license;
            boolean z11 = z3;
            AbstractC13345e abstractC13345e2 = this.vip;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    z2 = z10;
                    l = l2;
                    num2 = num3;
                    num = num4;
                    str = str3;
                    z = z7;
                    z3 = z11;
                    break;
                case 0:
                    Object vip = abstractC13345e2.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("podcast_title", "podcast_title", abstractC17080e, set);
                        z2 = z10;
                        l = l2;
                        num2 = num3;
                        num = num4;
                        str = str3;
                        z = true;
                        z3 = z11;
                        break;
                    } else {
                        str = (String) vip;
                        z2 = z10;
                        l = l2;
                        num2 = num3;
                        num = num4;
                        z = z7;
                        z3 = z11;
                    }
                case 1:
                    Object vip2 = this.metrica.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("owner_id", "owner_id", abstractC17080e, set);
                        l = l2;
                        num2 = num3;
                        num = num4;
                        str = str3;
                        z = z7;
                        z2 = true;
                        z3 = z11;
                        break;
                    } else {
                        l = (Long) vip2;
                        z2 = z10;
                        num2 = num3;
                        num = num4;
                        str = str3;
                        z = z7;
                        z3 = z11;
                    }
                case 2:
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 != null) {
                        num2 = (Integer) vip3;
                        z2 = z10;
                        l = l2;
                        num = num4;
                        str = str3;
                        z = z7;
                        z3 = z11;
                        break;
                    } else {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        z2 = z10;
                        l = l2;
                        num2 = num3;
                        num = num4;
                        str = str3;
                        z = z7;
                        z3 = true;
                        break;
                    }
                case 3:
                    Object vip4 = abstractC13345e.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("playlist_id", "playlist_id", abstractC17080e, set);
                        z2 = z10;
                        l = l2;
                        num2 = num3;
                        num = num4;
                        str = str3;
                        z = z7;
                        z4 = true;
                        z3 = z11;
                        break;
                    } else {
                        num = (Integer) vip4;
                        z2 = z10;
                        l = l2;
                        num2 = num3;
                        str = str3;
                        z = z7;
                        z3 = z11;
                    }
                case 4:
                    Object vip5 = abstractC13345e2.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("subtitle", "subtitle", abstractC17080e, set);
                        z2 = z10;
                        l = l2;
                        num2 = num3;
                        num = num4;
                        str = str3;
                        z = z7;
                        z5 = true;
                        z3 = z11;
                        break;
                    } else {
                        str2 = (String) vip5;
                        z2 = z10;
                        l = l2;
                        num2 = num3;
                        num = num4;
                        str = str3;
                        z = z7;
                        z3 = z11;
                    }
                case 5:
                    Object vip6 = this.appmetrica.vip(abstractC17080e);
                    if (vip6 == null) {
                        set = AbstractC0869e.subs("thumbs", "thumbs", abstractC17080e, set);
                        z2 = z10;
                        l = l2;
                        num2 = num3;
                        num = num4;
                        str = str3;
                        z = z7;
                        z6 = true;
                        z3 = z11;
                        break;
                    } else {
                        list = (List) vip6;
                        z2 = z10;
                        l = l2;
                        num2 = num3;
                        num = num4;
                        str = str3;
                        z = z7;
                        z3 = z11;
                    }
                default:
                    z2 = z10;
                    l = l2;
                    num2 = num3;
                    num = num4;
                    str = str3;
                    z = z7;
                    z3 = z11;
                    break;
            }
        }
    }
}
