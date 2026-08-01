package ua.itaysonlab.vkapi2.objects.music.playlist;

import defpackage.AbstractC10672e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.AbstractC8703e;
import defpackage.C13664e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioChartInfo;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.AudioPlaylistMeta;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.FollowedMetadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.music.restriction.MusicDynamicRestriction;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/AudioPlaylist;", "Leَۦۛ;", "Leُٕؓ;", "AlbumMeta", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioPlaylist extends AbstractC10672e implements InterfaceC15377e {

    /* renamed from: abstract, reason: not valid java name */
    public final AlbumThumb f36500abstract;
    public final String ads;
    public final long applovin;

    /* renamed from: break, reason: not valid java name */
    public final OriginalPlaylist f36501break;

    /* renamed from: case, reason: not valid java name */
    public final Boolean f36502case;

    /* renamed from: catch, reason: not valid java name */
    public final String f36503catch;

    /* renamed from: class, reason: not valid java name */
    public final int f36504class;
    public final String crashlytics;

    /* renamed from: default, reason: not valid java name */
    public final List f36505default;

    /* renamed from: extends, reason: not valid java name */
    public final Boolean f36506extends;

    /* renamed from: final, reason: not valid java name */
    public final List f36507final;
    public final int firebase;

    /* renamed from: goto, reason: not valid java name */
    public final long f36508goto;

    /* renamed from: implements, reason: not valid java name */
    public final String f36509implements;

    /* renamed from: import, reason: not valid java name */
    public final String f36510import;

    /* renamed from: instanceof, reason: not valid java name */
    public final transient boolean f36511instanceof;

    /* renamed from: interface, reason: not valid java name */
    public final int f36512interface;
    public final int isPro;

    /* renamed from: native, reason: not valid java name */
    public final List f36513native;

    /* renamed from: new, reason: not valid java name */
    public final boolean f36514new;

    /* renamed from: package, reason: not valid java name */
    public final MusicDynamicRestriction f36515package;
    public final AlbumMeta premium;

    /* renamed from: private, reason: not valid java name */
    public final AudioPlaylistMeta f36516private;

    /* renamed from: protected, reason: not valid java name */
    public final FollowedMetadata f36517protected;

    /* renamed from: return, reason: not valid java name */
    public final transient boolean f36518return;

    /* renamed from: static, reason: not valid java name */
    public final transient String f36519static;

    /* renamed from: strictfp, reason: not valid java name */
    public final AudioChartInfo f36520strictfp;
    public final String subs;

    /* renamed from: super, reason: not valid java name */
    public final boolean f36521super;

    /* renamed from: synchronized, reason: not valid java name */
    public final transient boolean f36522synchronized;

    /* renamed from: this, reason: not valid java name */
    public final Long f36523this;

    /* renamed from: throw, reason: not valid java name */
    public final Boolean f36524throw;

    /* renamed from: transient, reason: not valid java name */
    public final AudioPlaylistPermissions f36525transient;

    /* renamed from: try, reason: not valid java name */
    public final int f36526try;

    /* renamed from: while, reason: not valid java name */
    public final List f36527while;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/AudioPlaylist$AlbumMeta;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class AlbumMeta {
        public final String ad;
        public final String vip;

        public AlbumMeta(String str, String str2) {
            this.ad = str;
            this.vip = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlbumMeta)) {
                return false;
            }
            AlbumMeta albumMeta = (AlbumMeta) obj;
            return AbstractC7890e.billing(this.ad, albumMeta.ad) && AbstractC7890e.billing(this.vip, albumMeta.vip);
        }

        public final int hashCode() {
            return this.vip.hashCode() + (this.ad.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AlbumMeta(type=");
            sb.append(this.ad);
            sb.append(", view=");
            return AbstractC4653e.applovin(sb, this.vip, ')');
        }
    }

    public AudioPlaylist(int i, long j, String str, AlbumMeta albumMeta, String str2, String str3, int i2, int i3, int i4, long j2, Long l, List list, Boolean bool, Boolean bool2, List list2, int i5, FollowedMetadata followedMetadata, OriginalPlaylist originalPlaylist, AlbumThumb albumThumb, List list3, String str4, Boolean bool3, String str5, List list4, boolean z, boolean z2, AudioChartInfo audioChartInfo, AudioPlaylistMeta audioPlaylistMeta, MusicDynamicRestriction musicDynamicRestriction, AudioPlaylistPermissions audioPlaylistPermissions, String str6, boolean z3, String str7, boolean z4, boolean z5) {
        this.isPro = i;
        this.applovin = j;
        this.ads = str;
        this.premium = albumMeta;
        this.subs = str2;
        this.crashlytics = str3;
        this.firebase = i2;
        this.f36504class = i3;
        this.f36512interface = i4;
        this.f36508goto = j2;
        this.f36523this = l;
        this.f36513native = list;
        this.f36506extends = bool;
        this.f36524throw = bool2;
        this.f36527while = list2;
        this.f36526try = i5;
        this.f36517protected = followedMetadata;
        this.f36501break = originalPlaylist;
        this.f36500abstract = albumThumb;
        this.f36505default = list3;
        this.f36509implements = str4;
        this.f36502case = bool3;
        this.f36503catch = str5;
        this.f36507final = list4;
        this.f36521super = z;
        this.f36514new = z2;
        this.f36520strictfp = audioChartInfo;
        this.f36516private = audioPlaylistMeta;
        this.f36515package = musicDynamicRestriction;
        this.f36525transient = audioPlaylistPermissions;
        this.f36510import = str6;
        this.f36511instanceof = z3;
        this.f36519static = str7;
        this.f36522synchronized = z4;
        this.f36518return = z5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AudioPlaylist(int r37, long r38, java.lang.String r40, ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist.AlbumMeta r41, java.lang.String r42, java.lang.String r43, int r44, int r45, int r46, long r47, java.lang.Long r49, java.util.List r50, java.lang.Boolean r51, java.lang.Boolean r52, java.util.List r53, int r54, ua.itaysonlab.vkapi2.objects.music.playlist.metadata.FollowedMetadata r55, ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist r56, ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb r57, java.util.List r58, java.lang.String r59, java.lang.Boolean r60, java.lang.String r61, java.util.List r62, boolean r63, boolean r64, ua.itaysonlab.vkapi2.objects.music.AudioChartInfo r65, ua.itaysonlab.vkapi2.objects.music.playlist.metadata.AudioPlaylistMeta r66, ua.itaysonlab.vkapi2.objects.music.restriction.MusicDynamicRestriction r67, ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylistPermissions r68, java.lang.String r69, boolean r70, java.lang.String r71, boolean r72, boolean r73, int r74, int r75) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist.<init>(int, long, java.lang.String, ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist$AlbumMeta, java.lang.String, java.lang.String, int, int, int, long, java.lang.Long, java.util.List, java.lang.Boolean, java.lang.Boolean, java.util.List, int, ua.itaysonlab.vkapi2.objects.music.playlist.metadata.FollowedMetadata, ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist, ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb, java.util.List, java.lang.String, java.lang.Boolean, java.lang.String, java.util.List, boolean, boolean, ua.itaysonlab.vkapi2.objects.music.AudioChartInfo, ua.itaysonlab.vkapi2.objects.music.playlist.metadata.AudioPlaylistMeta, ua.itaysonlab.vkapi2.objects.music.restriction.MusicDynamicRestriction, ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylistPermissions, java.lang.String, boolean, java.lang.String, boolean, boolean, int, int):void");
    }

    public static AudioPlaylist startapp(AudioPlaylist audioPlaylist, List list, int i) {
        FollowedMetadata followedMetadata;
        OriginalPlaylist originalPlaylist;
        OriginalPlaylist originalPlaylist2;
        List list2;
        String str;
        String str2;
        List list3;
        int i2 = audioPlaylist.isPro;
        long j = audioPlaylist.applovin;
        String str3 = audioPlaylist.ads;
        AlbumMeta albumMeta = audioPlaylist.premium;
        String str4 = (i & 16) != 0 ? audioPlaylist.subs : BuildConfig.FLAVOR;
        String str5 = audioPlaylist.crashlytics;
        int i3 = audioPlaylist.firebase;
        int i4 = audioPlaylist.f36504class;
        int i5 = audioPlaylist.f36512interface;
        long j2 = audioPlaylist.f36508goto;
        Long l = audioPlaylist.f36523this;
        List list4 = audioPlaylist.f36513native;
        Boolean bool = audioPlaylist.f36506extends;
        Boolean bool2 = audioPlaylist.f36524throw;
        List list5 = audioPlaylist.f36527while;
        int i6 = audioPlaylist.f36526try;
        FollowedMetadata followedMetadata2 = audioPlaylist.f36517protected;
        AlbumThumb albumThumb = null;
        if ((i & 131072) != 0) {
            followedMetadata = followedMetadata2;
            originalPlaylist = audioPlaylist.f36501break;
        } else {
            followedMetadata = followedMetadata2;
            originalPlaylist = null;
        }
        if ((i & 262144) != 0) {
            originalPlaylist2 = originalPlaylist;
            albumThumb = audioPlaylist.f36500abstract;
        } else {
            originalPlaylist2 = originalPlaylist;
        }
        List list6 = (i & 524288) != 0 ? audioPlaylist.f36505default : C13664e.f27089e;
        if ((i & 1048576) != 0) {
            list2 = list6;
            str = audioPlaylist.f36509implements;
        } else {
            list2 = list6;
            str = "cacheAlbum";
        }
        String str6 = str;
        Boolean bool3 = audioPlaylist.f36502case;
        String str7 = audioPlaylist.f36503catch;
        if ((i & 8388608) != 0) {
            str2 = str7;
            list3 = audioPlaylist.f36507final;
        } else {
            str2 = str7;
            list3 = list;
        }
        List list7 = list3;
        boolean z = (i & 16777216) != 0 ? audioPlaylist.f36521super : true;
        boolean z2 = audioPlaylist.f36514new;
        AudioChartInfo audioChartInfo = audioPlaylist.f36520strictfp;
        AudioPlaylistMeta audioPlaylistMeta = audioPlaylist.f36516private;
        MusicDynamicRestriction musicDynamicRestriction = audioPlaylist.f36515package;
        AudioPlaylistPermissions audioPlaylistPermissions = audioPlaylist.f36525transient;
        String str8 = audioPlaylist.f36510import;
        boolean z3 = audioPlaylist.f36511instanceof;
        String str9 = audioPlaylist.f36519static;
        boolean z4 = audioPlaylist.f36522synchronized;
        boolean z5 = audioPlaylist.f36518return;
        audioPlaylist.getClass();
        return new AudioPlaylist(i2, j, str3, albumMeta, str4, str5, i3, i4, i5, j2, l, list4, bool, bool2, list5, i6, followedMetadata, originalPlaylist2, albumThumb, list2, str6, bool3, str2, list7, z, z2, audioChartInfo, audioPlaylistMeta, musicDynamicRestriction, audioPlaylistPermissions, str8, z3, str9, z4, z5);
    }

    public final int adcel() {
        String str;
        String str2;
        if (AbstractC7890e.billing(this.ads, "ugc")) {
            return 4;
        }
        AlbumMeta albumMeta = this.premium;
        if (albumMeta == null || (str = albumMeta.vip) == null) {
            str = "collection";
        }
        for (int i : AbstractC8703e.m2468interface(5)) {
            if (i == 1) {
                str2 = "collection";
            } else if (i == 2) {
                str2 = "main_only";
            } else if (i == 3) {
                str2 = "main_feat";
            } else if (i == 4) {
                str2 = "playlist";
            } else {
                if (i != 5) {
                    throw null;
                }
                str2 = "synth_library";
            }
            if (str2.equals(str)) {
                return i;
            }
        }
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AudioPlaylist.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AudioPlaylist audioPlaylist = (AudioPlaylist) obj;
        return this.isPro == audioPlaylist.isPro && this.applovin == audioPlaylist.applovin;
    }

    @Override // defpackage.InterfaceC15377e
    public final String getItemId() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.applovin);
        sb.append('_');
        sb.append(this.isPro);
        return sb.toString();
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.isPro), Long.valueOf(this.applovin));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlaylist(id=");
        sb.append(this.isPro);
        sb.append(", owner_id=");
        sb.append(this.applovin);
        sb.append(", newType=");
        sb.append(this.ads);
        sb.append(", newAlbumMeta=");
        sb.append(this.premium);
        sb.append(", title=");
        sb.append(this.subs);
        sb.append(", description=");
        sb.append(this.crashlytics);
        sb.append(", count=");
        sb.append(this.firebase);
        sb.append(", followers=");
        sb.append(this.f36504class);
        sb.append(", plays=");
        sb.append(this.f36512interface);
        sb.append(", create_time=");
        sb.append(this.f36508goto);
        sb.append(", update_time=");
        sb.append(this.f36523this);
        sb.append(", genres=");
        sb.append(this.f36513native);
        sb.append(", is_following=");
        sb.append(this.f36506extends);
        sb.append(", is_curator=");
        sb.append(this.f36524throw);
        sb.append(", audios=");
        sb.append(this.f36527while);
        sb.append(", year=");
        sb.append(this.f36526try);
        sb.append(", followed=");
        sb.append(this.f36517protected);
        sb.append(", original=");
        sb.append(this.f36501break);
        sb.append(", photo=");
        sb.append(this.f36500abstract);
        sb.append(", thumbs=");
        sb.append(this.f36505default);
        sb.append(", access_key=");
        sb.append(this.f36509implements);
        sb.append(", is_explicit=");
        sb.append(this.f36502case);
        sb.append(", subtitle=");
        sb.append(this.f36503catch);
        sb.append(", main_artists=");
        sb.append(this.f36507final);
        sb.append(", subtitle_badge=");
        sb.append(this.f36521super);
        sb.append(", no_discover=");
        sb.append(this.f36514new);
        sb.append(", audio_chart_info=");
        sb.append(this.f36520strictfp);
        sb.append(", meta=");
        sb.append(this.f36516private);
        sb.append(", restriction=");
        sb.append(this.f36515package);
        sb.append(", permissions=");
        sb.append(this.f36525transient);
        sb.append(", main_color=");
        sb.append(this.f36510import);
        sb.append(", isCached=");
        sb.append(this.f36511instanceof);
        sb.append(", ownerName=");
        sb.append(this.f36519static);
        sb.append(", isAvailableOffline=");
        sb.append(this.f36522synchronized);
        sb.append(", isLegacyCachedArtwork=");
        return AbstractC1786e.isVip(sb, this.f36518return, ')');
    }
}
