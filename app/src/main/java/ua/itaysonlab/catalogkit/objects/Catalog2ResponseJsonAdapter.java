package ua.itaysonlab.catalogkit.objects;

import androidx.car.app.navigation.model.Maneuver;
import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;
import ua.itaysonlab.vkapi2.objects.music.AudioBookPerson;
import ua.itaysonlab.vkapi2.objects.music.AudioContentCard;
import ua.itaysonlab.vkapi2.objects.music.AudioFollowingsUpdateInfo;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.SmartSuggestion;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.RecommendedPlaylist;
import ua.itaysonlab.vkapi2.objects.podcasts.Podcast;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogLongread;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogSliderItem;
import ua.itaysonlab.vkapi2.objects.radio.RadioStation;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkapi2.objects.video.VKVideo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Catalog2ResponseJsonAdapter extends AbstractC13345e {
    public final AbstractC13345e Signature;
    public final C16911e ad = C16911e.firebase("catalog", "section", "block", "replacements", "profiles", "groups", "artist_videos", "videos", "links", "audios", "playlists", "artists", "suggestions", "catalog_banners", "curators", "texts", "podcast_episodes", "podcast_slider_items", "longreads", "placeholders", "recommended_playlists", "music_owners", "audio_followings_update_info", "podcasts", "radio_stations", "audio_books", "audio_stream_mixes", "audio_books_persons", "audio_content_cards");
    public final AbstractC13345e adcel;
    public final AbstractC13345e admob;
    public final AbstractC13345e advert;
    public final AbstractC13345e amazon;
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e inmobi;
    public final AbstractC13345e isPro;
    public final AbstractC13345e isVip;
    public final AbstractC13345e license;
    public final AbstractC13345e loadAd;
    public final AbstractC13345e metrica;
    public final AbstractC13345e mopub;
    public final AbstractC13345e pro;
    public final AbstractC13345e purchase;
    public final AbstractC13345e remoteconfig;
    public final AbstractC13345e signatures;
    public final AbstractC13345e smaato;
    public final AbstractC13345e startapp;
    public final AbstractC13345e subscription;
    public final AbstractC13345e tapsense;
    public final AbstractC13345e vip;
    public final AbstractC13345e yandex;

    public Catalog2ResponseJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(Catalog2Root.class, c3295e, "catalog");
        this.metrica = c14172e.vip(Catalog2Section.class, c3295e, "section");
        this.license = c14172e.vip(Catalog2Block.class, c3295e, "block");
        this.appmetrica = c14172e.vip(Catalog2Replacements.class, c3295e, "replacements");
        this.purchase = c14172e.vip(AbstractC18453e.purchase(List.class, VKProfile.class), c3295e, "profiles");
        this.billing = c14172e.vip(AbstractC18453e.purchase(List.class, VKVideo.class), c3295e, "artist_videos");
        this.yandex = c14172e.vip(AbstractC18453e.purchase(List.class, CustomCatalogBlockItem.class), c3295e, "links");
        this.startapp = c14172e.vip(AbstractC18453e.purchase(List.class, AudioTrack.class), c3295e, "audios");
        this.adcel = c14172e.vip(AbstractC18453e.purchase(List.class, AudioPlaylist.class), c3295e, "playlists");
        this.mopub = c14172e.vip(AbstractC18453e.purchase(List.class, CatalogArtist.class), c3295e, "artists");
        this.advert = c14172e.vip(AbstractC18453e.purchase(List.class, SmartSuggestion.class), c3295e, "suggestions");
        this.smaato = c14172e.vip(AbstractC18453e.purchase(List.class, Catalog2Banner.class), c3295e, "catalog_banners");
        this.amazon = c14172e.vip(AbstractC18453e.purchase(List.class, Catalog2Text.class), c3295e, "texts");
        this.loadAd = c14172e.vip(AbstractC18453e.purchase(List.class, PodcastCatalogSliderItem.class), c3295e, "podcast_slider_items");
        this.Signature = c14172e.vip(AbstractC18453e.purchase(List.class, PodcastCatalogLongread.class), c3295e, "longreads");
        this.admob = c14172e.vip(AbstractC18453e.purchase(List.class, Catalog2Placeholder.class), c3295e, "placeholders");
        this.subscription = c14172e.vip(AbstractC18453e.purchase(List.class, RecommendedPlaylist.class), c3295e, "recommended_playlists");
        this.remoteconfig = c14172e.vip(AbstractC18453e.purchase(List.class, AudioFollowingsUpdateInfo.class), c3295e, "audio_followings_update_info");
        this.pro = c14172e.vip(AbstractC18453e.purchase(List.class, Podcast.class), c3295e, "podcasts");
        this.signatures = c14172e.vip(AbstractC18453e.purchase(List.class, RadioStation.class), c3295e, "radio_stations");
        this.tapsense = c14172e.vip(AbstractC18453e.purchase(List.class, AudioBook.class), c3295e, "audio_books");
        this.isVip = c14172e.vip(AbstractC18453e.purchase(List.class, AudioStreamMix.class), c3295e, "audio_stream_mixes");
        this.inmobi = c14172e.vip(AbstractC18453e.purchase(List.class, AudioBookPerson.class), c3295e, "audio_books_persons");
        this.isPro = c14172e.vip(AbstractC18453e.purchase(List.class, AudioContentCard.class), c3295e, "audio_content_cards");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        Catalog2Response catalog2Response = (Catalog2Response) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("catalog");
        this.vip.purchase(abstractC3442e, catalog2Response.ad);
        abstractC3442e.loadAd("section");
        this.metrica.purchase(abstractC3442e, catalog2Response.vip);
        abstractC3442e.loadAd("block");
        this.license.purchase(abstractC3442e, catalog2Response.metrica);
        abstractC3442e.loadAd("replacements");
        this.appmetrica.purchase(abstractC3442e, catalog2Response.license);
        abstractC3442e.loadAd("profiles");
        List list = catalog2Response.appmetrica;
        AbstractC13345e abstractC13345e = this.purchase;
        abstractC13345e.purchase(abstractC3442e, list);
        abstractC3442e.loadAd("groups");
        abstractC13345e.purchase(abstractC3442e, catalog2Response.purchase);
        abstractC3442e.loadAd("artist_videos");
        List list2 = catalog2Response.billing;
        AbstractC13345e abstractC13345e2 = this.billing;
        abstractC13345e2.purchase(abstractC3442e, list2);
        abstractC3442e.loadAd("videos");
        abstractC13345e2.purchase(abstractC3442e, catalog2Response.yandex);
        abstractC3442e.loadAd("links");
        List list3 = catalog2Response.startapp;
        AbstractC13345e abstractC13345e3 = this.yandex;
        abstractC13345e3.purchase(abstractC3442e, list3);
        abstractC3442e.loadAd("audios");
        List list4 = catalog2Response.adcel;
        AbstractC13345e abstractC13345e4 = this.startapp;
        abstractC13345e4.purchase(abstractC3442e, list4);
        abstractC3442e.loadAd("playlists");
        this.adcel.purchase(abstractC3442e, catalog2Response.mopub);
        abstractC3442e.loadAd("artists");
        this.mopub.purchase(abstractC3442e, catalog2Response.advert);
        abstractC3442e.loadAd("suggestions");
        this.advert.purchase(abstractC3442e, catalog2Response.smaato);
        abstractC3442e.loadAd("catalog_banners");
        this.smaato.purchase(abstractC3442e, catalog2Response.amazon);
        abstractC3442e.loadAd("curators");
        abstractC13345e.purchase(abstractC3442e, catalog2Response.loadAd);
        abstractC3442e.loadAd("texts");
        this.amazon.purchase(abstractC3442e, catalog2Response.Signature);
        abstractC3442e.loadAd("podcast_episodes");
        abstractC13345e4.purchase(abstractC3442e, catalog2Response.admob);
        abstractC3442e.loadAd("podcast_slider_items");
        this.loadAd.purchase(abstractC3442e, catalog2Response.subscription);
        abstractC3442e.loadAd("longreads");
        this.Signature.purchase(abstractC3442e, catalog2Response.remoteconfig);
        abstractC3442e.loadAd("placeholders");
        this.admob.purchase(abstractC3442e, catalog2Response.pro);
        abstractC3442e.loadAd("recommended_playlists");
        this.subscription.purchase(abstractC3442e, catalog2Response.signatures);
        abstractC3442e.loadAd("music_owners");
        abstractC13345e3.purchase(abstractC3442e, catalog2Response.tapsense);
        abstractC3442e.loadAd("audio_followings_update_info");
        this.remoteconfig.purchase(abstractC3442e, catalog2Response.isVip);
        abstractC3442e.loadAd("podcasts");
        this.pro.purchase(abstractC3442e, catalog2Response.inmobi);
        abstractC3442e.loadAd("radio_stations");
        this.signatures.purchase(abstractC3442e, catalog2Response.isPro);
        abstractC3442e.loadAd("audio_books");
        this.tapsense.purchase(abstractC3442e, catalog2Response.applovin);
        abstractC3442e.loadAd("audio_stream_mixes");
        this.isVip.purchase(abstractC3442e, catalog2Response.ads);
        abstractC3442e.loadAd("audio_books_persons");
        this.inmobi.purchase(abstractC3442e, catalog2Response.premium);
        abstractC3442e.loadAd("audio_content_cards");
        this.isPro.purchase(abstractC3442e, catalog2Response.subs);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Response)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0056. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        Catalog2Section catalog2Section;
        int i;
        Catalog2Block catalog2Block;
        Catalog2Section catalog2Section2;
        abstractC17080e.license();
        Catalog2Block catalog2Block2 = null;
        Catalog2Replacements catalog2Replacements = null;
        ?? r6 = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        Object obj25 = null;
        int i2 = -1;
        Catalog2Section catalog2Section3 = null;
        while (abstractC17080e.Signature()) {
            Catalog2Section catalog2Section4 = catalog2Section3;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.billing;
            Catalog2Block catalog2Block3 = catalog2Block2;
            AbstractC13345e abstractC13345e2 = this.startapp;
            Catalog2Replacements catalog2Replacements2 = catalog2Replacements;
            AbstractC13345e abstractC13345e3 = this.yandex;
            Object obj26 = r6;
            AbstractC13345e abstractC13345e4 = this.purchase;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 0:
                    obj25 = this.vip.vip(abstractC17080e);
                    i2 &= -2;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 1:
                    i2 &= -3;
                    catalog2Section2 = this.metrica.vip(abstractC17080e);
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 2:
                    i2 &= -5;
                    catalog2Section = catalog2Section4;
                    catalog2Block = this.license.vip(abstractC17080e);
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 3:
                    i2 &= -9;
                    catalog2Section3 = catalog2Section4;
                    catalog2Block2 = catalog2Block3;
                    catalog2Replacements = this.appmetrica.vip(abstractC17080e);
                    r6 = obj26;
                    break;
                case 4:
                    r6 = abstractC13345e4.vip(abstractC17080e);
                    i2 &= -17;
                    catalog2Section3 = catalog2Section4;
                    catalog2Block2 = catalog2Block3;
                    catalog2Replacements = catalog2Replacements2;
                    break;
                case 5:
                    obj = abstractC13345e4.vip(abstractC17080e);
                    i2 &= -33;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 6:
                    obj2 = abstractC13345e.vip(abstractC17080e);
                    i2 &= -65;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 7:
                    obj3 = abstractC13345e.vip(abstractC17080e);
                    i2 &= -129;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 8:
                    obj4 = abstractC13345e3.vip(abstractC17080e);
                    i2 &= -257;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 9:
                    obj5 = abstractC13345e2.vip(abstractC17080e);
                    i2 &= -513;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 10:
                    obj6 = this.adcel.vip(abstractC17080e);
                    i2 &= -1025;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 11:
                    obj7 = this.mopub.vip(abstractC17080e);
                    i2 &= -2049;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 12:
                    obj8 = this.advert.vip(abstractC17080e);
                    i2 &= -4097;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 13:
                    obj9 = this.smaato.vip(abstractC17080e);
                    i2 &= -8193;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 14:
                    obj10 = abstractC13345e4.vip(abstractC17080e);
                    i2 &= -16385;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 15:
                    obj11 = this.amazon.vip(abstractC17080e);
                    i = -32769;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 16:
                    obj12 = abstractC13345e2.vip(abstractC17080e);
                    i = -65537;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    obj13 = this.loadAd.vip(abstractC17080e);
                    i = -131073;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    obj14 = this.Signature.vip(abstractC17080e);
                    i = -262145;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    obj15 = this.admob.vip(abstractC17080e);
                    i = -524289;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 20:
                    obj16 = this.subscription.vip(abstractC17080e);
                    i = -1048577;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 21:
                    obj17 = abstractC13345e3.vip(abstractC17080e);
                    i = -2097153;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 22:
                    obj18 = this.remoteconfig.vip(abstractC17080e);
                    i = -4194305;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case 23:
                    obj19 = this.pro.vip(abstractC17080e);
                    i = -8388609;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    obj20 = this.signatures.vip(abstractC17080e);
                    i = -16777217;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    obj21 = this.tapsense.vip(abstractC17080e);
                    i = -33554433;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    obj22 = this.isVip.vip(abstractC17080e);
                    i = -67108865;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    obj23 = this.inmobi.vip(abstractC17080e);
                    i = -134217729;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    obj24 = this.isPro.vip(abstractC17080e);
                    i = -268435457;
                    i2 &= i;
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
                default:
                    catalog2Section2 = catalog2Section4;
                    catalog2Block = catalog2Block3;
                    catalog2Section = catalog2Section2;
                    catalog2Replacements = catalog2Replacements2;
                    catalog2Section3 = catalog2Section;
                    catalog2Block2 = catalog2Block;
                    r6 = obj26;
                    break;
            }
        }
        Catalog2Section catalog2Section5 = catalog2Section3;
        Catalog2Block catalog2Block4 = catalog2Block2;
        Catalog2Replacements catalog2Replacements3 = catalog2Replacements;
        List list = r6;
        abstractC17080e.advert();
        return i2 == -536870912 ? new Catalog2Response((Catalog2Root) obj25, catalog2Section5, catalog2Block4, catalog2Replacements3, list, (List) obj, (List) obj2, (List) obj3, (List) obj4, (List) obj5, (List) obj6, (List) obj7, (List) obj8, (List) obj9, (List) obj10, (List) obj11, (List) obj12, (List) obj13, (List) obj14, (List) obj15, (List) obj16, (List) obj17, (List) obj18, (List) obj19, (List) obj20, (List) obj21, (List) obj22, (List) obj23, (List) obj24) : new Catalog2Response((Catalog2Root) obj25, catalog2Section5, catalog2Block4, catalog2Replacements3, list, (List) obj, (List) obj2, (List) obj3, (List) obj4, (List) obj5, (List) obj6, (List) obj7, (List) obj8, (List) obj9, (List) obj10, (List) obj11, (List) obj12, (List) obj13, (List) obj14, (List) obj15, (List) obj16, (List) obj17, (List) obj18, (List) obj19, (List) obj20, (List) obj21, (List) obj22, (List) obj23, (List) obj24, i2);
    }
}
