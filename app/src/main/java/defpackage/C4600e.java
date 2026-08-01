package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libvkmusic.objects.SilentCreds;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.vkapi2.methods.auth.RefreshToken$RTToken;
import ua.itaysonlab.vkapi2.methods.execute.SearchInProfile$SearchResponse;
import ua.itaysonlab.vkapi2.methods.podcasts.PodcastGetProfilePage$PodcastPage;
import ua.itaysonlab.vkapi2.objects.message.Conversation;
import ua.itaysonlab.vkapi2.objects.message.ConversationAudioElement;
import ua.itaysonlab.vkapi2.objects.message.ConversationElement;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedItem;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedList;
import ua.itaysonlab.vkapi2.objects.newsfeed.ProtoNewsfeedItem;
import ua.itaysonlab.vkapi2.objects.privacy.PrivacySetting;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkapi2.upload.BaseDataUploader$UploadUrlResult;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؓؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4600e extends AbstractC18406e {
    public final String billing;
    public final /* synthetic */ int purchase;
    public final String yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(byte b, int i) {
        super(String.class);
        this.purchase = i;
        switch (i) {
            case 3:
                super(PrivacySetting.class);
                this.billing = "execute";
                this.yandex = BuildConfig.FLAVOR;
                amazon("code", "var settings = API.account.getPrivacySettings();\nvar i = 0;\n\nwhile (i != settings.settings.length) { \n    if (settings.settings[i].key == \"audios\") {\n        return settings.settings[i];\n    };\n\n    i = i + 1;\n};\n\nreturn null;");
                return;
            case 10:
                super(BaseDataUploader$UploadUrlResult.class);
                this.billing = "audio";
                this.yandex = "getUploadServer";
                return;
            case 11:
                super(Catalog2Response.class);
                this.billing = "catalog";
                this.yandex = "getAudioAuto";
                smaato(1, "need_blocks");
                return;
            case 22:
                super(AbstractC18453e.purchase(List.class, NewsfeedList.class));
                this.billing = "newsfeed";
                this.yandex = "getLists";
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                super(AudioTrack.class);
                this.billing = "podcasts";
                this.yandex = "getRandomEpisode";
                return;
            default:
                this.billing = "captcha";
                this.yandex = "force";
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(int i, int i2) {
        super(AbstractC18453e.purchase(List.class, ConversationElement.class));
        this.purchase = 13;
        this.billing = "messages";
        this.yandex = "getConversations";
        smaato(Integer.valueOf(i2), "offset");
        smaato(Integer.valueOf(i), "count");
        smaato(1, "extended");
        amazon("fields", "first_name,last_name,name,photo_100,photo_200");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(int i, int i2, byte b) {
        super(AbstractC18453e.purchase(List.class, VKProfile.class));
        this.purchase = i2;
        switch (i2) {
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                super(AbstractC18453e.purchase(List.class, VKProfile.class));
                this.billing = "groups";
                this.yandex = "get";
                smaato(1, "extended");
                smaato(Integer.valueOf(i), "offset");
                smaato(40, "count");
                return;
            default:
                this.billing = "friends";
                this.yandex = "get";
                amazon("fields", "photo_100");
                amazon("order", "name");
                smaato(Integer.valueOf(i), "offset");
                smaato(40, "count");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(int i, long j) {
        super(BaseDataUploader$UploadUrlResult.class);
        this.purchase = 9;
        this.billing = "photos";
        this.yandex = "getAudioPlaylistCoverUploadServer";
        smaato(Integer.valueOf(i), "playlist_id");
        Signature("owner_id", Long.valueOf(j));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(int i, Integer num) {
        super(Catalog2Response.class);
        this.purchase = 6;
        this.billing = "catalog";
        this.yandex = num != null ? "getPersonAudioBooks" : "getAudioBooksPerson";
        smaato(1, "need_blocks");
        smaato(Integer.valueOf(i), "person_id");
        smaato(num, "genre_id");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(int i, Integer num, String str) {
        super(AbstractC18453e.purchase(List.class, NewsfeedItem.class));
        this.purchase = 20;
        this.billing = "newsfeed";
        this.yandex = "get";
        smaato(Integer.valueOf(i), "count");
        smaato(1, "extended");
        amazon("start_from", str);
        if (num == null) {
            amazon("filters", "audio,audio_playlist");
            return;
        }
        amazon("source_ids", "list" + num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(int i, String str) {
        super(AbstractC18453e.purchase(List.class, ProtoNewsfeedItem.class));
        this.purchase = 21;
        this.billing = "newsfeed";
        this.yandex = "getDiscoverCustom";
        smaato(Integer.valueOf(i), "count");
        smaato(1, "extended");
        amazon("start_from", str);
        amazon("discover_id", "discover_category_full/16");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(int i, String str, String str2, boolean z) {
        super(Catalog2Response.class);
        this.purchase = 16;
        str2 = (i & 4) != 0 ? null : str2;
        boolean z2 = (i & 8) != 0;
        z = (i & 16) != 0 ? false : z;
        this.billing = "catalog";
        this.yandex = "getAudioSearch";
        loadAd("need_blocks", z2);
        loadAd("show_suggests", z);
        amazon("query", str);
        amazon("requested_section_id", str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(long j) {
        super(PodcastGetProfilePage$PodcastPage.class);
        this.purchase = 24;
        this.billing = "execute";
        this.yandex = "getPodcastEpisodesWithInfo";
        Signature("owner_id", Long.valueOf(j));
        smaato(100, "count");
        smaato(0, "offset");
        smaato(4, "func_v");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(long j, int i) {
        super(AudioTrack.class);
        this.purchase = 23;
        this.billing = "podcasts";
        this.yandex = "getEpisode";
        Signature("owner_id", Long.valueOf(j));
        smaato(Integer.valueOf(i), "episode_id");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(long j, int i, String str) {
        super(AbstractC18453e.purchase(List.class, ConversationAudioElement.class));
        this.purchase = 8;
        this.billing = "messages";
        this.yandex = "getHistoryAttachments";
        amazon("start_from", str);
        smaato(Integer.valueOf(i), "count");
        amazon("peer_id", String.valueOf(j));
        amazon("media_type", "audio");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(long j, String str) {
        super(SearchInProfile$SearchResponse.class);
        this.purchase = 28;
        this.billing = "execute";
        Signature("owner_id", Long.valueOf(j));
        amazon("query", str);
        smaato(10, "p_count");
        smaato(30, "a_count");
        amazon("code", "return {\"playlists\": API.audio.searchPlaylists({\"owner_id\": Args.owner_id, \"q\": Args.query, \"count\": Args.p_count, \"filters\": \"owned\", \"extended\": 1}), \"audios\": API.audio.search({\"search_own\": 1, \"owner_id\": Args.owner_id, \"q\": Args.query, \"count\": Args.a_count}).items};");
        this.yandex = BuildConfig.FLAVOR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(Integer num) {
        super(Catalog2Response.class);
        this.purchase = 5;
        this.billing = "catalog";
        this.yandex = "getAudioBooks";
        smaato(1, "need_blocks");
        smaato(num, "genre_id");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(String str, int i) {
        super(Catalog2Response.class);
        this.purchase = i;
        switch (i) {
            case 4:
                super(Catalog2Response.class);
                this.billing = "catalog";
                this.yandex = "getAudioArtist";
                smaato(1, "need_blocks");
                amazon("artist_id", str);
                return;
            case 7:
                super(Catalog2Response.class);
                this.billing = "catalog";
                this.yandex = "getAudio";
                smaato(1, "need_blocks");
                amazon("url", str);
                return;
            case 12:
                super(Catalog2Response.class);
                this.billing = "catalog";
                this.yandex = "getSection";
                smaato(1, "need_blocks");
                amazon("section_id", str);
                return;
            case 14:
                super(AbstractC18453e.purchase(List.class, SilentCreds.class));
                this.billing = "auth";
                this.yandex = "getCredentialsForService";
                amazon("uuid", str);
                amazon("timestamp", String.valueOf(System.currentTimeMillis()));
                amazon("digest_hash", "2D0D1nXbs2cX1/Q8wFkyv93NHts=");
                amazon("package", "com.uma.musicvk");
                smaato(6767438, "app_id");
                amazon("app_secret", "ppBOmwQYYOMGulmaiPyK");
                return;
            case 15:
                super(Catalog2Response.class);
                this.billing = "catalog";
                this.yandex = "getAudioCurator";
                smaato(1, "need_blocks");
                amazon("curator_id", str);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                super(Catalog2Response.class);
                this.billing = "catalog";
                this.yandex = "getPodcasts";
                smaato(1, "need_blocks");
                amazon("category_id", str);
                C14027e.ad.getClass();
                Signature("owner_id", Long.valueOf(C14027e.metrica()));
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                super(RefreshToken$RTToken.class);
                this.billing = "auth";
                this.yandex = "refreshToken";
                amazon("receipt", str);
                C5363e c5363e = C0353e.startapp;
                amazon("receipt2", AbstractC15792e.billing().metrica.pro());
                amazon("timestamp", String.valueOf(System.currentTimeMillis()));
                long currentTimeMillis = System.currentTimeMillis();
                byte[] bArr = new byte[16];
                new C1909e((int) currentTimeMillis, (int) (currentTimeMillis >> 32)).vip(16, bArr);
                int length = bArr.length;
                AbstractC7844e.startapp(bArr.length, 0, length);
                amazon("nonce", ad.ad(AbstractC1660e.remoteconfig(0, length, bArr), ad.vip));
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                super(AbstractC18453e.purchase(List.class, Conversation.class));
                this.billing = "messages";
                this.yandex = "searchConversations";
                amazon("q", str);
                smaato(40, "count");
                smaato(1, "extended");
                amazon("fields", "first_name,last_name,name,photo_100,photo_200");
                return;
            default:
                this.billing = "catalog";
                this.yandex = "replaceSections";
                amazon("replacement_id", str);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(String str, int i, String str2) {
        super(Catalog2Response.class);
        this.purchase = 29;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        this.billing = "catalog";
        this.yandex = "getAudioSearch";
        amazon("context", str);
        amazon("query", str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600e(String[] strArr) {
        super(Catalog2Response.class);
        this.purchase = 0;
        this.billing = "catalog";
        this.yandex = "replaceBlocks";
        amazon("replacement_ids", AbstractC1660e.m669goto(strArr, ",", null, null, null, 62));
    }

    @Override // defpackage.AbstractC18406e
    public final String adcel() {
        switch (this.purchase) {
            case 0:
                return this.billing;
            case 1:
                return this.billing;
            case 2:
                return this.billing;
            case 3:
                return this.billing;
            case 4:
                return this.billing;
            case 5:
                return this.billing;
            case 6:
                return this.billing;
            case 7:
                return this.billing;
            case 8:
                return this.billing;
            case 9:
                return this.billing;
            case 10:
                return this.billing;
            case 11:
                return this.billing;
            case 12:
                return this.billing;
            case 13:
                return this.billing;
            case 14:
                return this.billing;
            case 15:
                return this.billing;
            case 16:
                return this.billing;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return this.billing;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return this.billing;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return this.billing;
            case 20:
                return this.billing;
            case 21:
                return this.billing;
            case 22:
                return this.billing;
            case 23:
                return this.billing;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return this.billing;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return this.billing;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return this.billing;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return this.billing;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return this.billing;
            default:
                return this.billing;
        }
    }

    @Override // defpackage.AbstractC18406e
    public final String mopub() {
        switch (this.purchase) {
            case 0:
                return this.yandex;
            case 1:
                return this.yandex;
            case 2:
                return this.yandex;
            case 3:
                return this.yandex;
            case 4:
                return this.yandex;
            case 5:
                return this.yandex;
            case 6:
                return this.yandex;
            case 7:
                return this.yandex;
            case 8:
                return this.yandex;
            case 9:
                return this.yandex;
            case 10:
                return this.yandex;
            case 11:
                return this.yandex;
            case 12:
                return this.yandex;
            case 13:
                return this.yandex;
            case 14:
                return this.yandex;
            case 15:
                return this.yandex;
            case 16:
                return this.yandex;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return this.yandex;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return this.yandex;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return this.yandex;
            case 20:
                return this.yandex;
            case 21:
                return this.yandex;
            case 22:
                return this.yandex;
            case 23:
                return this.yandex;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return this.yandex;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return this.yandex;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return this.yandex;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return this.yandex;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return this.yandex;
            default:
                return this.yandex;
        }
    }
}
