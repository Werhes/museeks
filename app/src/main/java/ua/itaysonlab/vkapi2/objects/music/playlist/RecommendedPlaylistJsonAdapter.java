package ua.itaysonlab.vkapi2.objects.music.playlist;

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
public final class RecommendedPlaylistJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "owner_id", "percentage", "percentage_title", "audios", "cover");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;

    public RecommendedPlaylistJsonAdapter(C14172e c14172e) {
        Class cls = Integer.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "id");
        this.metrica = c14172e.vip(Long.TYPE, c3295e, "owner_id");
        this.license = c14172e.vip(Float.class, c3295e, "percentage");
        this.appmetrica = c14172e.vip(String.class, c3295e, "percentage_title");
        this.purchase = c14172e.vip(AbstractC18453e.purchase(List.class, String.class), c3295e, "audios");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        RecommendedPlaylist recommendedPlaylist = (RecommendedPlaylist) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        AbstractC8647e.subs(recommendedPlaylist.ad, this.vip, abstractC3442e, "owner_id");
        AbstractC8647e.crashlytics(recommendedPlaylist.vip, this.metrica, abstractC3442e, "percentage");
        this.license.purchase(abstractC3442e, recommendedPlaylist.metrica);
        abstractC3442e.loadAd("percentage_title");
        String str = recommendedPlaylist.license;
        AbstractC13345e abstractC13345e = this.appmetrica;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("audios");
        this.purchase.purchase(abstractC3442e, recommendedPlaylist.appmetrica);
        abstractC3442e.loadAd("cover");
        abstractC13345e.purchase(abstractC3442e, recommendedPlaylist.purchase);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(RecommendedPlaylist)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Integer num = null;
        Float f = null;
        String str = null;
        List list = null;
        String str2 = null;
        Set set = C3295e.f7451e;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Long l = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            Integer num2 = num;
            AbstractC13345e abstractC13345e = this.appmetrica;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    break;
                case 0:
                    Object vip = this.vip.vip(abstractC17080e);
                    if (vip != null) {
                        num = (Integer) vip;
                        break;
                    } else {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        z = true;
                        break;
                    }
                case 1:
                    Object vip2 = this.metrica.vip(abstractC17080e);
                    if (vip2 != null) {
                        l = (Long) vip2;
                        break;
                    } else {
                        set = AbstractC0869e.subs("owner_id", "owner_id", abstractC17080e, set);
                        z2 = true;
                        break;
                    }
                case 2:
                    f = (Float) this.license.vip(abstractC17080e);
                    break;
                case 3:
                    str = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 4:
                    Object vip3 = this.purchase.vip(abstractC17080e);
                    if (vip3 != null) {
                        list = (List) vip3;
                        break;
                    } else {
                        set = AbstractC0869e.subs("audios", "audios", abstractC17080e, set);
                        z3 = true;
                        break;
                    }
                case 5:
                    str2 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
            }
            num = num2;
        }
        Integer num3 = num;
        abstractC17080e.advert();
        if ((!z) & (num3 == null)) {
            set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
        }
        if ((!z2) & (l == null)) {
            set = AbstractC0869e.isPro("owner_id", "owner_id", abstractC17080e, set);
        }
        if ((!z3) & (list == null)) {
            set = AbstractC0869e.isPro("audios", "audios", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new RecommendedPlaylist(num3.intValue(), l.longValue(), f, str, list, str2);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
