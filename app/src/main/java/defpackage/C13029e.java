package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;
import ua.itaysonlab.vkapi2.methods.audio.playlist.AudioAddAudiosToPlaylist$UpdatedPlaylistResponse;
import ua.itaysonlab.vkapi2.methods.audio.playlist.AudioCreatePlaylist$NewPlaylistResponse;
import ua.itaysonlab.vkapi2.methods.audio.playlist.AudioGetPlaylist$PlaylistResponse;
import ua.itaysonlab.vkapi2.objects.music.AudioLyricsContainer;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.AudioWidgetItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.FollowedMetadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13029e extends AbstractC18406e {
    public final String billing;
    public final /* synthetic */ int purchase;
    public final String yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e() {
        super(AbstractC18453e.purchase(List.class, AudioSnippetEntry.class));
        this.purchase = 16;
        this.billing = "audio";
        this.yandex = "getSnippets";
        smaato(3, "count");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(int i, int i2, int i3, long j, String str) {
        super(AudioGetPlaylist$PlaylistResponse.class);
        this.purchase = 13;
        this.billing = "execute";
        this.yandex = BuildConfig.FLAVOR;
        amazon("code", "var owner_id = Args.owner_id;\nvar playlist_id = Args.playlist_id;\nvar access_key = Args.access_key;\nvar count = Args.count;\nvar offset = Args.offset;\nvar fields = Args.fields;\n\nvar res = {};\n\nif (offset == 0) {\n    res.playlist = API.audio.getPlaylistById({\n        owner_id: owner_id,\n        playlist_id: playlist_id,\n        access_key: access_key,\n        ref: Args.ref\n    });\n    \n    if (res.playlist.type == \"ugc\") {\n        if (owner_id < 0) {\n            res.owner = API.groups.getById({ group_ids: -owner_id, fields: fields }).groups[0];\n        } else {\n            res.owner = API.users.get({ user_ids: owner_id, fields: fields })[0];\n        }\n    }\n    if (res.playlist.original != null) {\n        if (res.playlist.original.owner_id < 0) {\n            res.owner = API.groups.getById({ group_ids: -res.playlist.original.owner_id, fields: fields }).groups[0];\n        } else {\n            res.owner = API.users.get({ user_ids: res.playlist.original.owner_id, fields: fields })[0];\n        }\n    }\n}\n\nres.audios = API.audio.get({ owner_id: owner_id, playlist_id: playlist_id, access_key: access_key, count: count, offset: offset, ref: Args.ref }).items;\nreturn res;\n");
        smaato(Integer.valueOf(i), "playlist_id");
        Signature("owner_id", Long.valueOf(j));
        amazon("access_key", str);
        smaato(Integer.valueOf(i2), "offset");
        smaato(Integer.valueOf(i3), "count");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(int i, int i2, long j, String str) {
        super(AbstractC18453e.purchase(List.class, AudioTrack.class));
        this.purchase = 15;
        this.billing = "audio";
        this.yandex = "getRecommendations";
        smaato(Integer.valueOf(i), "offset");
        smaato(Integer.valueOf(i2), "count");
        Signature("user_id", Long.valueOf(j));
        amazon("target_audio", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(int i, int i2, Integer num) {
        super(AbstractC18453e.purchase(List.class, AudioTrack.class));
        this.purchase = 14;
        this.billing = "audio";
        this.yandex = "getPopular";
        smaato(Integer.valueOf(i), "offset");
        smaato(Integer.valueOf(i2), "count");
        smaato(num, "genre_id");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(int i, long j, int i2) {
        super(AbstractC18453e.purchase(List.class, AudioTrack.class));
        this.purchase = 9;
        this.billing = "audio";
        this.yandex = "get";
        Signature("owner_id", Long.valueOf(j));
        smaato(Integer.valueOf(i2), "count");
        smaato(Integer.valueOf(i), "offset");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(int i, long j, String str, List list) {
        super(AudioAddAudiosToPlaylist$UpdatedPlaylistResponse.class);
        this.purchase = 0;
        this.billing = "audio";
        this.yandex = "addToPlaylist";
        smaato(Integer.valueOf(i), "playlist_id");
        Signature("owner_id", Long.valueOf(j));
        amazon("access_key", str);
        amazon("audio_ids", AbstractC13480e.m3608try(list, ",", null, null, new C14099e(20), 30));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(long j, int i) {
        super(AudioPlaylist.class);
        this.purchase = 25;
        this.billing = "audio";
        this.yandex = "savePlaylistAsCopy";
        smaato(Integer.valueOf(i), "playlist_id");
        Signature("owner_id", Long.valueOf(j));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(long j, int i, byte b) {
        super(Unit.class);
        this.purchase = i;
        switch (i) {
            case 7:
                super(Unit.class);
                this.billing = "audio";
                this.yandex = "followOwner";
                Signature("owner_id", Long.valueOf(j));
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                super(Unit.class);
                this.billing = "audio";
                this.yandex = "unfollowCurator";
                C14027e.ad.getClass();
                Signature("user_id", Long.valueOf(C14027e.metrica()));
                Signature("curator_id", Long.valueOf(j));
                return;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                super(Unit.class);
                this.billing = "audio";
                this.yandex = "unfollowOwner";
                Signature("owner_id", Long.valueOf(j));
                return;
            default:
                this.billing = "audio";
                this.yandex = "followCurator";
                C14027e.ad.getClass();
                Signature("user_id", Long.valueOf(C14027e.metrica()));
                Signature("curator_id", Long.valueOf(j));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(Integer num, Long l, String str, Integer num2, Integer num3, String str2, String str3, List list, List list2) {
        super(AudioCreatePlaylist$NewPlaylistResponse.class);
        this.purchase = 1;
        this.billing = "execute";
        this.yandex = BuildConfig.FLAVOR;
        amazon("code", "var playlist_id = Args.playlist_id;\nvar owner_id = Args.owner_id;\nvar chat_id = Args.chat_id;\nvar access_key = Args.access_key;\n\nif (playlist_id) {\n    var success = API.audio.editPlaylist(Args);\n    \n    if (success > 0 && Args.delete_cover > 0) {\n        success = API.audio.deletePlaylistCoverPhoto({owner_id: owner_id, playlist_id: playlist_id});\n    }\n    \n    if (success > 0 && Args.actions.length > 0) {\n        success = API.audio.reorderInPlaylist(Args);\n    }\n    \n    if (!success) {\n        return {};\n    }\n} else {\n    if (chat_id) {\n        var playlist = API.audio.createChatPlaylist(Args);\n        playlist_id = playlist.id;\n        owner_id = playlist.owner_id;\n        access_key = playlist.access_key;\n    } else {\n        playlist_id = API.audio.createPlaylist(Args).id;\n    }\n}\n\nvar res = {};\nif (owner_id < 0) {\n    res.group = API.groups.getById({ group_ids: -owner_id }).groups[0];\n} else {\n    res.user = API.users.get({ user_ids: owner_id })[0];\n}\n\nvar playlist_args = {};\nplaylist_args.owner_id = owner_id;\nplaylist_args.playlist_id = playlist_id;\nplaylist_args.track_count = 3;\nif (access_key) {\n    playlist_args.access_key = access_key;\n}\nres.playlist = API.audio.getPlaylistById(playlist_args);\n\nif (Args.delete_cover) {\n    res.playlist.photo = null;\n}\n\nreturn res;");
        smaato(num, "playlist_id");
        Signature("owner_id", l);
        amazon("access_key", str);
        smaato(num2, "delete_cover");
        smaato(num3, "no_discover");
        amazon("title", str2);
        amazon("description", str3);
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C9653e c9653e = (C9653e) it.next();
                arrayList.add(new JSONArray().put(c9653e.vip).put(c9653e.ad).put(c9653e.metrica));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                jSONArray.put((JSONArray) it2.next());
            }
            Unit unit = Unit.INSTANCE;
            amazon("actions", jSONArray.toString());
        }
        if (list2 != null) {
            amazon("audio_ids", AbstractC13480e.m3608try(list2, ",", null, null, null, 62));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(String str, int i) {
        super(AbstractC18453e.purchase(List.class, MainArtist.class));
        this.purchase = i;
        switch (i) {
            case 5:
                super(Unit.class);
                this.billing = "audio";
                this.yandex = "followArtist";
                C14027e.ad.getClass();
                Signature("user_id", Long.valueOf(C14027e.metrica()));
                amazon("artist_id", str);
                amazon("ref", "banner");
                return;
            case 12:
                super(AudioLyricsContainer.class);
                this.billing = "audio";
                this.yandex = "getLyrics";
                amazon("audio_id", str);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                super(Unit.class);
                this.billing = "audio";
                this.yandex = "unfollowArtist";
                C14027e.ad.getClass();
                Signature("user_id", Long.valueOf(C14027e.metrica()));
                amazon("artist_id", str);
                amazon("ref", "banner");
                return;
            default:
                this.billing = "audio";
                this.yandex = "finishRecomsOnboarding";
                amazon("artist_ids", str);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(String str, int i, String str2) {
        super(AbstractC18453e.purchase(List.class, AudioTrack.class));
        this.purchase = 10;
        this.billing = "audio";
        this.yandex = "getAudiosByArtist";
        amazon("artist_id", str);
        amazon("type", str2);
        smaato(100, "count");
        smaato(Integer.valueOf(i), "offset");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(String str, String str2) {
        super(AbstractC18453e.purchase(List.class, AudioWidgetItem.class));
        this.purchase = 18;
        this.billing = "audio";
        this.yandex = "getWidgetElements";
        amazon("size", str);
        amazon("type", str2);
        C14027e.ad.getClass();
        Signature("user_id", Long.valueOf(C14027e.metrica()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(String str, String str2, String str3, String str4, String str5) {
        super(AudioTrack.class);
        this.purchase = 24;
        this.billing = "audio";
        this.yandex = "save";
        amazon("audio", str);
        amazon("server", str2);
        amazon("hash", str3);
        amazon("artist", str4);
        amazon("title", str5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(String str, Map map, boolean z, String str2) {
        super(AbstractC18453e.purchase(List.class, AudioTrack.class));
        this.purchase = 17;
        this.billing = "audio";
        this.yandex = "getStreamMixAudios";
        amazon("mix_id", str);
        amazon("entity_id", str2);
        smaato(5, "count");
        loadAd("append", z);
        if (map.isEmpty()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), new JSONArray().put(entry.getValue()));
        }
        amazon("options", jSONObject.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(ArrayList arrayList) {
        super(Unit.class);
        this.purchase = 20;
        this.billing = "execute";
        String str = BuildConfig.FLAVOR;
        this.yandex = BuildConfig.FLAVOR;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            String str2 = (String) next;
            if (i <= 20) {
                List m1869private = AbstractC5304e.m1869private(str2, new String[]{"_"}, 6);
                StringBuilder isPro = AbstractC8703e.isPro(str, "API.audio.delete({\"audio_id\": ");
                isPro.append((String) m1869private.get(1));
                isPro.append(", \"owner_id\": ");
                str = AbstractC1786e.signatures(isPro, (String) m1869private.get(0), "});\n");
            }
            i = i2;
        }
        amazon("code", str + "return true;");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(AudioTrack audioTrack, int i) {
        super(Unit.class);
        this.purchase = i;
        switch (i) {
            case 21:
                super(Unit.class);
                this.billing = "audio";
                this.yandex = "removeListenedAudio";
                smaato(Integer.valueOf(audioTrack.vip), "audio_id");
                Signature("owner_id", Long.valueOf(audioTrack.metrica));
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                super(Unit.class);
                this.billing = "audio";
                this.yandex = "setBroadcast";
                amazon("audio", audioTrack != null ? AbstractC6914e.billing(audioTrack) : null);
                loadAd("enabled", audioTrack != null);
                C14027e.ad.getClass();
                Signature("target_ids", Long.valueOf(C14027e.metrica()));
                return;
            default:
                this.billing = "audio";
                this.yandex = "delete";
                smaato(Integer.valueOf(audioTrack.vip), "audio_id");
                Signature("owner_id", Long.valueOf(audioTrack.metrica));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(AudioTrack audioTrack, Integer num, Integer num2, int i) {
        super(Integer.TYPE);
        this.purchase = 22;
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        this.billing = "audio";
        this.yandex = "reorder";
        smaato(num, "before");
        smaato(Integer.valueOf(audioTrack.vip), "audio_id");
        Signature("owner_id", Long.valueOf(audioTrack.metrica));
        smaato(num2, "after");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(AudioTrack audioTrack, String str, String str2) {
        super(Unit.class);
        this.purchase = 3;
        this.billing = "audio";
        this.yandex = "edit";
        smaato(Integer.valueOf(audioTrack.vip), "audio_id");
        Signature("owner_id", Long.valueOf(audioTrack.metrica));
        amazon("title", str);
        amazon("artist", str2);
        amazon("no_search", "true");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(AudioPlaylist audioPlaylist, int i) {
        super(Integer.TYPE);
        this.purchase = i;
        switch (i) {
            case 8:
                int i2 = audioPlaylist.isPro;
                long j = audioPlaylist.applovin;
                String str = audioPlaylist.f36509implements;
                super(Integer.TYPE);
                this.billing = "audio";
                this.yandex = "followPlaylist";
                smaato(Integer.valueOf(i2), "playlist_id");
                Signature("owner_id", Long.valueOf(j));
                amazon("access_key", str);
                return;
            default:
                FollowedMetadata followedMetadata = audioPlaylist.f36517protected;
                int i3 = followedMetadata != null ? followedMetadata.ad : audioPlaylist.isPro;
                long j2 = followedMetadata != null ? followedMetadata.vip : audioPlaylist.applovin;
                this.billing = "audio";
                this.yandex = "deletePlaylist";
                smaato(Integer.valueOf(i3), "playlist_id");
                Signature("owner_id", Long.valueOf(j2));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(AudioPlaylist audioPlaylist, Integer num, Integer num2, int i) {
        super(Integer.TYPE);
        this.purchase = 23;
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        this.billing = "audio";
        this.yandex = "reorderPlaylists";
        smaato(Integer.valueOf(audioPlaylist.isPro), "playlist_id");
        Signature("owner_id", Long.valueOf(audioPlaylist.applovin));
        smaato(num, "before");
        smaato(num2, "after");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029e(String[] strArr) {
        super(AbstractC18453e.purchase(List.class, AudioTrack.class));
        this.purchase = 11;
        this.billing = "audio";
        this.yandex = "getById";
        amazon("audios", AbstractC1660e.m669goto(strArr, ",", null, null, null, 62));
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
