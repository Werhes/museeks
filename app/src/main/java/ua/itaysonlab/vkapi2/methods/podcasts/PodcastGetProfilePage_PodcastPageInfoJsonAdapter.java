package ua.itaysonlab.vkapi2.methods.podcasts;

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
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PodcastGetProfilePage_PodcastPageInfoJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("category", "friends_text", "podcast_description", "name", "owner_id", "podcast_cover", "can_subscribe_podcasts", "is_subscribed_podcasts", "can_subscribe", "friends", "trailer", "url");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;

    public PodcastGetProfilePage_PodcastPageInfoJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "category");
        this.metrica = c14172e.vip(Long.TYPE, c3295e, "owner_id");
        this.license = c14172e.vip(PodcastCover.class, c3295e, "podcast_cover");
        this.appmetrica = c14172e.vip(Boolean.TYPE, c3295e, "can_subscribe_podcasts");
        this.purchase = c14172e.vip(AbstractC18453e.purchase(List.class, VKProfile.class), c3295e, "friends");
        this.billing = c14172e.vip(AudioTrack.class, c3295e, "trailer");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        PodcastGetProfilePage$PodcastPageInfo podcastGetProfilePage$PodcastPageInfo = (PodcastGetProfilePage$PodcastPageInfo) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("category");
        String str = podcastGetProfilePage$PodcastPageInfo.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("friends_text");
        abstractC13345e.purchase(abstractC3442e, podcastGetProfilePage$PodcastPageInfo.vip);
        abstractC3442e.loadAd("podcast_description");
        abstractC13345e.purchase(abstractC3442e, podcastGetProfilePage$PodcastPageInfo.metrica);
        abstractC3442e.loadAd("name");
        abstractC13345e.purchase(abstractC3442e, podcastGetProfilePage$PodcastPageInfo.license);
        abstractC3442e.loadAd("owner_id");
        AbstractC8647e.crashlytics(podcastGetProfilePage$PodcastPageInfo.appmetrica, this.metrica, abstractC3442e, "podcast_cover");
        this.license.purchase(abstractC3442e, podcastGetProfilePage$PodcastPageInfo.purchase);
        abstractC3442e.loadAd("can_subscribe_podcasts");
        boolean z = podcastGetProfilePage$PodcastPageInfo.billing;
        AbstractC13345e abstractC13345e2 = this.appmetrica;
        AbstractC8647e.m2459native(z, abstractC13345e2, abstractC3442e, "is_subscribed_podcasts");
        AbstractC8647e.m2459native(podcastGetProfilePage$PodcastPageInfo.yandex, abstractC13345e2, abstractC3442e, "can_subscribe");
        AbstractC8647e.m2459native(podcastGetProfilePage$PodcastPageInfo.startapp, abstractC13345e2, abstractC3442e, "friends");
        this.purchase.purchase(abstractC3442e, podcastGetProfilePage$PodcastPageInfo.adcel);
        abstractC3442e.loadAd("trailer");
        this.billing.purchase(abstractC3442e, podcastGetProfilePage$PodcastPageInfo.mopub);
        abstractC3442e.loadAd("url");
        abstractC13345e.purchase(abstractC3442e, podcastGetProfilePage$PodcastPageInfo.advert);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PodcastGetProfilePage.PodcastPageInfo)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Set set = C3295e.f7451e;
        int i = -1;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.appmetrica;
            AbstractC13345e abstractC13345e2 = this.vip;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    break;
                case 0:
                    Object vip = abstractC13345e2.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("category", "category", abstractC17080e, set);
                    } else {
                        obj = vip;
                    }
                    i &= -2;
                    break;
                case 1:
                    Object vip2 = abstractC13345e2.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("friends_text", "friends_text", abstractC17080e, set);
                    } else {
                        obj4 = vip2;
                    }
                    i &= -3;
                    break;
                case 2:
                    Object vip3 = abstractC13345e2.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("podcast_description", "podcast_description", abstractC17080e, set);
                    } else {
                        obj5 = vip3;
                    }
                    i &= -5;
                    break;
                case 3:
                    Object vip4 = abstractC13345e2.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("name", "name", abstractC17080e, set);
                    } else {
                        obj6 = vip4;
                    }
                    i &= -9;
                    break;
                case 4:
                    Object vip5 = this.metrica.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("owner_id", "owner_id", abstractC17080e, set);
                    } else {
                        j = ((Number) vip5).longValue();
                    }
                    i &= -17;
                    break;
                case 5:
                    Object vip6 = this.license.vip(abstractC17080e);
                    if (vip6 == null) {
                        set = AbstractC0869e.subs("podcast_cover", "podcast_cover", abstractC17080e, set);
                    } else {
                        obj7 = vip6;
                    }
                    i &= -33;
                    break;
                case 6:
                    Object vip7 = abstractC13345e.vip(abstractC17080e);
                    if (vip7 == null) {
                        set = AbstractC0869e.subs("can_subscribe_podcasts", "can_subscribe_podcasts", abstractC17080e, set);
                    } else {
                        z = ((Boolean) vip7).booleanValue();
                    }
                    i &= -65;
                    break;
                case 7:
                    Object vip8 = abstractC13345e.vip(abstractC17080e);
                    if (vip8 == null) {
                        set = AbstractC0869e.subs("is_subscribed_podcasts", "is_subscribed_podcasts", abstractC17080e, set);
                    } else {
                        z2 = ((Boolean) vip8).booleanValue();
                    }
                    i &= -129;
                    break;
                case 8:
                    Object vip9 = abstractC13345e.vip(abstractC17080e);
                    if (vip9 == null) {
                        set = AbstractC0869e.subs("can_subscribe", "can_subscribe", abstractC17080e, set);
                    } else {
                        z3 = ((Boolean) vip9).booleanValue();
                    }
                    i &= -257;
                    break;
                case 9:
                    Object vip10 = this.purchase.vip(abstractC17080e);
                    if (vip10 == null) {
                        set = AbstractC0869e.subs("friends", "friends", abstractC17080e, set);
                    } else {
                        obj8 = vip10;
                    }
                    i &= -513;
                    break;
                case 10:
                    obj2 = this.billing.vip(abstractC17080e);
                    i &= -1025;
                    break;
                case 11:
                    Object vip11 = abstractC13345e2.vip(abstractC17080e);
                    if (vip11 == null) {
                        set = AbstractC0869e.subs("url", "url", abstractC17080e, set);
                    } else {
                        obj3 = vip11;
                    }
                    i &= -2049;
                    break;
            }
        }
        abstractC17080e.advert();
        if (set.size() == 0) {
            return i == -4096 ? new PodcastGetProfilePage$PodcastPageInfo((String) obj, (String) obj4, (String) obj5, (String) obj6, j, (PodcastCover) obj7, z, z2, z3, (List) obj8, (AudioTrack) obj2, (String) obj3) : new PodcastGetProfilePage$PodcastPageInfo((String) obj, (String) obj4, (String) obj5, (String) obj6, j, (PodcastCover) obj7, z, z2, z3, (List) obj8, (AudioTrack) obj2, (String) obj3, i);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
