package ua.itaysonlab.vkapi2.objects.music.playlist;

import androidx.car.app.navigation.model.Maneuver;
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
import ua.itaysonlab.vkapi2.objects.music.AudioChartInfo;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.Genre;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.AudioPlaylistMeta;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.FollowedMetadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.music.restriction.MusicDynamicRestriction;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioPlaylistJsonAdapter extends AbstractC13345e {
    public final AbstractC13345e Signature;
    public final C16911e ad = C16911e.firebase("id", "owner_id", "type", "album", "title", "description", "count", "followers", "plays", "create_time", "update_time", "genres", "is_following", "is_curator", "audios", "year", "followed", "original", "photo", "thumbs", "access_key", "is_explicit", "subtitle", "main_artists", "subtitle_badge", "no_discover", "audio_chart_info", "meta", "restriction", "permissions", "main_color");
    public final AbstractC13345e adcel;
    public final AbstractC13345e admob;
    public final AbstractC13345e advert;
    public final AbstractC13345e amazon;
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e license;
    public final AbstractC13345e loadAd;
    public final AbstractC13345e metrica;
    public final AbstractC13345e mopub;
    public final AbstractC13345e pro;
    public final AbstractC13345e purchase;
    public final AbstractC13345e remoteconfig;
    public final AbstractC13345e smaato;
    public final AbstractC13345e startapp;
    public final AbstractC13345e subscription;
    public final AbstractC13345e vip;
    public final AbstractC13345e yandex;

    public AudioPlaylistJsonAdapter(C14172e c14172e) {
        Class cls = Integer.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "id");
        this.metrica = c14172e.vip(Long.TYPE, c3295e, "owner_id");
        this.license = c14172e.vip(String.class, c3295e, "newType");
        this.appmetrica = c14172e.vip(AudioPlaylist.AlbumMeta.class, c3295e, "newAlbumMeta");
        this.purchase = c14172e.vip(String.class, c3295e, "description");
        this.billing = c14172e.vip(Long.class, c3295e, "update_time");
        this.yandex = c14172e.vip(AbstractC18453e.purchase(List.class, Genre.class), c3295e, "genres");
        this.startapp = c14172e.vip(Boolean.class, c3295e, "is_following");
        this.adcel = c14172e.vip(AbstractC18453e.purchase(List.class, AudioTrack.class), c3295e, "audios");
        this.mopub = c14172e.vip(FollowedMetadata.class, c3295e, "followed");
        this.advert = c14172e.vip(OriginalPlaylist.class, c3295e, "original");
        this.smaato = c14172e.vip(AlbumThumb.class, c3295e, "photo");
        this.amazon = c14172e.vip(AbstractC18453e.purchase(List.class, AlbumThumb.class), c3295e, "thumbs");
        this.loadAd = c14172e.vip(AbstractC18453e.purchase(List.class, MainArtist.class), c3295e, "main_artists");
        this.Signature = c14172e.vip(Boolean.TYPE, c3295e, "subtitle_badge");
        this.admob = c14172e.vip(AudioChartInfo.class, c3295e, "audio_chart_info");
        this.subscription = c14172e.vip(AudioPlaylistMeta.class, c3295e, "meta");
        this.remoteconfig = c14172e.vip(MusicDynamicRestriction.class, c3295e, "restriction");
        this.pro = c14172e.vip(AudioPlaylistPermissions.class, c3295e, "permissions");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioPlaylist audioPlaylist = (AudioPlaylist) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        int i = audioPlaylist.isPro;
        AbstractC13345e abstractC13345e = this.vip;
        AbstractC8647e.subs(i, abstractC13345e, abstractC3442e, "owner_id");
        long j = audioPlaylist.applovin;
        AbstractC13345e abstractC13345e2 = this.metrica;
        AbstractC8647e.crashlytics(j, abstractC13345e2, abstractC3442e, "type");
        String str = audioPlaylist.ads;
        AbstractC13345e abstractC13345e3 = this.license;
        abstractC13345e3.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("album");
        this.appmetrica.purchase(abstractC3442e, audioPlaylist.premium);
        abstractC3442e.loadAd("title");
        abstractC13345e3.purchase(abstractC3442e, audioPlaylist.subs);
        abstractC3442e.loadAd("description");
        String str2 = audioPlaylist.crashlytics;
        AbstractC13345e abstractC13345e4 = this.purchase;
        abstractC13345e4.purchase(abstractC3442e, str2);
        abstractC3442e.loadAd("count");
        AbstractC8647e.subs(audioPlaylist.firebase, abstractC13345e, abstractC3442e, "followers");
        AbstractC8647e.subs(audioPlaylist.f36504class, abstractC13345e, abstractC3442e, "plays");
        AbstractC8647e.subs(audioPlaylist.f36512interface, abstractC13345e, abstractC3442e, "create_time");
        AbstractC8647e.crashlytics(audioPlaylist.f36508goto, abstractC13345e2, abstractC3442e, "update_time");
        this.billing.purchase(abstractC3442e, audioPlaylist.f36523this);
        abstractC3442e.loadAd("genres");
        this.yandex.purchase(abstractC3442e, audioPlaylist.f36513native);
        abstractC3442e.loadAd("is_following");
        Boolean bool = audioPlaylist.f36506extends;
        AbstractC13345e abstractC13345e5 = this.startapp;
        abstractC13345e5.purchase(abstractC3442e, bool);
        abstractC3442e.loadAd("is_curator");
        abstractC13345e5.purchase(abstractC3442e, audioPlaylist.f36524throw);
        abstractC3442e.loadAd("audios");
        this.adcel.purchase(abstractC3442e, audioPlaylist.f36527while);
        abstractC3442e.loadAd("year");
        AbstractC8647e.subs(audioPlaylist.f36526try, abstractC13345e, abstractC3442e, "followed");
        this.mopub.purchase(abstractC3442e, audioPlaylist.f36517protected);
        abstractC3442e.loadAd("original");
        this.advert.purchase(abstractC3442e, audioPlaylist.f36501break);
        abstractC3442e.loadAd("photo");
        this.smaato.purchase(abstractC3442e, audioPlaylist.f36500abstract);
        abstractC3442e.loadAd("thumbs");
        this.amazon.purchase(abstractC3442e, audioPlaylist.f36505default);
        abstractC3442e.loadAd("access_key");
        abstractC13345e4.purchase(abstractC3442e, audioPlaylist.f36509implements);
        abstractC3442e.loadAd("is_explicit");
        abstractC13345e5.purchase(abstractC3442e, audioPlaylist.f36502case);
        abstractC3442e.loadAd("subtitle");
        abstractC13345e4.purchase(abstractC3442e, audioPlaylist.f36503catch);
        abstractC3442e.loadAd("main_artists");
        this.loadAd.purchase(abstractC3442e, audioPlaylist.f36507final);
        abstractC3442e.loadAd("subtitle_badge");
        boolean z = audioPlaylist.f36521super;
        AbstractC13345e abstractC13345e6 = this.Signature;
        AbstractC8647e.m2459native(z, abstractC13345e6, abstractC3442e, "no_discover");
        AbstractC8647e.m2459native(audioPlaylist.f36514new, abstractC13345e6, abstractC3442e, "audio_chart_info");
        this.admob.purchase(abstractC3442e, audioPlaylist.f36520strictfp);
        abstractC3442e.loadAd("meta");
        this.subscription.purchase(abstractC3442e, audioPlaylist.f36516private);
        abstractC3442e.loadAd("restriction");
        this.remoteconfig.purchase(abstractC3442e, audioPlaylist.f36515package);
        abstractC3442e.loadAd("permissions");
        this.pro.purchase(abstractC3442e, audioPlaylist.f36525transient);
        abstractC3442e.loadAd("main_color");
        abstractC13345e4.purchase(abstractC3442e, audioPlaylist.f36510import);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioPlaylist)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0069. Please report as an issue. */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        abstractC17080e.license();
        Object obj5 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        long j = 0;
        long j2 = 0;
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
        Set set = C3295e.f7451e;
        int i7 = -1;
        Object obj25 = null;
        Object obj26 = null;
        while (abstractC17080e.Signature()) {
            Object obj27 = obj6;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.license;
            Object obj28 = obj5;
            AbstractC13345e abstractC13345e2 = this.metrica;
            Object obj29 = obj25;
            AbstractC13345e abstractC13345e3 = this.Signature;
            Object obj30 = obj26;
            AbstractC13345e abstractC13345e4 = this.startapp;
            Object obj31 = obj7;
            AbstractC13345e abstractC13345e5 = this.purchase;
            int i8 = i2;
            AbstractC13345e abstractC13345e6 = this.vip;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 0:
                    Object vip = abstractC13345e6.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        i2 = i8;
                    } else {
                        i2 = ((Number) vip).intValue();
                    }
                    i7 &= -2;
                    obj6 = obj27;
                    obj5 = obj28;
                    obj25 = obj29;
                    obj26 = obj30;
                    obj7 = obj31;
                    break;
                case 1:
                    Object vip2 = abstractC13345e2.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("owner_id", "owner_id", abstractC17080e, set);
                    } else {
                        j = ((Number) vip2).longValue();
                    }
                    i7 &= -3;
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 2:
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("newType", "type", abstractC17080e, set);
                        obj5 = obj28;
                    } else {
                        obj5 = vip3;
                    }
                    i7 &= -5;
                    obj = obj27;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 3:
                    i7 &= -9;
                    obj23 = this.appmetrica.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 4:
                    Object vip4 = abstractC13345e.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("title", "title", abstractC17080e, set);
                    } else {
                        obj24 = vip4;
                    }
                    i7 &= -17;
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 5:
                    i7 &= -33;
                    obj4 = abstractC13345e5.vip(abstractC17080e);
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 6:
                    Object vip5 = abstractC13345e6.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("count", "count", abstractC17080e, set);
                    } else {
                        i3 = ((Number) vip5).intValue();
                    }
                    i7 &= -65;
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 7:
                    Object vip6 = abstractC13345e6.vip(abstractC17080e);
                    if (vip6 == null) {
                        set = AbstractC0869e.subs("followers", "followers", abstractC17080e, set);
                    } else {
                        i4 = ((Number) vip6).intValue();
                    }
                    i7 &= -129;
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 8:
                    Object vip7 = abstractC13345e6.vip(abstractC17080e);
                    if (vip7 == null) {
                        set = AbstractC0869e.subs("plays", "plays", abstractC17080e, set);
                    } else {
                        i5 = ((Number) vip7).intValue();
                    }
                    i7 &= -257;
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 9:
                    Object vip8 = abstractC13345e2.vip(abstractC17080e);
                    if (vip8 == null) {
                        set = AbstractC0869e.subs("create_time", "create_time", abstractC17080e, set);
                    } else {
                        j2 = ((Number) vip8).longValue();
                    }
                    i7 &= -513;
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 10:
                    i7 &= -1025;
                    obj25 = this.billing.vip(abstractC17080e);
                    obj2 = obj27;
                    obj5 = obj28;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 11:
                    Object vip9 = this.yandex.vip(abstractC17080e);
                    if (vip9 == null) {
                        set = AbstractC0869e.subs("genres", "genres", abstractC17080e, set);
                        obj26 = obj30;
                    } else {
                        obj26 = vip9;
                    }
                    i7 &= -2049;
                    obj3 = obj27;
                    obj5 = obj28;
                    obj25 = obj29;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 12:
                    i7 &= -4097;
                    obj7 = abstractC13345e4.vip(abstractC17080e);
                    obj6 = obj27;
                    obj5 = obj28;
                    obj25 = obj29;
                    obj26 = obj30;
                    i2 = i8;
                    break;
                case 13:
                    i7 &= -8193;
                    obj8 = abstractC13345e4.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 14:
                    Object vip10 = this.adcel.vip(abstractC17080e);
                    if (vip10 == null) {
                        set = AbstractC0869e.subs("audios", "audios", abstractC17080e, set);
                    } else {
                        obj9 = vip10;
                    }
                    i7 &= -16385;
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 15:
                    Object vip11 = abstractC13345e6.vip(abstractC17080e);
                    if (vip11 == null) {
                        set = AbstractC0869e.subs("year", "year", abstractC17080e, set);
                    } else {
                        i6 = ((Number) vip11).intValue();
                    }
                    i = -32769;
                    i7 &= i;
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 16:
                    i7 &= -65537;
                    obj10 = this.mopub.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    i7 &= -131073;
                    obj11 = this.advert.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    i7 &= -262145;
                    obj12 = this.smaato.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    Object vip12 = this.amazon.vip(abstractC17080e);
                    if (vip12 == null) {
                        set = AbstractC0869e.subs("thumbs", "thumbs", abstractC17080e, set);
                    } else {
                        obj13 = vip12;
                    }
                    i = -524289;
                    i7 &= i;
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 20:
                    i7 &= -1048577;
                    obj14 = abstractC13345e5.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 21:
                    i7 &= -2097153;
                    obj15 = abstractC13345e4.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 22:
                    i7 &= -4194305;
                    obj16 = abstractC13345e5.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 23:
                    Object vip13 = this.loadAd.vip(abstractC17080e);
                    if (vip13 == null) {
                        set = AbstractC0869e.subs("main_artists", "main_artists", abstractC17080e, set);
                    } else {
                        obj17 = vip13;
                    }
                    i = -8388609;
                    i7 &= i;
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    Object vip14 = abstractC13345e3.vip(abstractC17080e);
                    if (vip14 == null) {
                        set = AbstractC0869e.subs("subtitle_badge", "subtitle_badge", abstractC17080e, set);
                    } else {
                        z = ((Boolean) vip14).booleanValue();
                    }
                    i = -16777217;
                    i7 &= i;
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    Object vip15 = abstractC13345e3.vip(abstractC17080e);
                    if (vip15 == null) {
                        set = AbstractC0869e.subs("no_discover", "no_discover", abstractC17080e, set);
                    } else {
                        z2 = ((Boolean) vip15).booleanValue();
                    }
                    i = -33554433;
                    i7 &= i;
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    i7 &= -67108865;
                    obj18 = this.admob.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    i7 &= -134217729;
                    obj19 = this.subscription.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    i7 &= -268435457;
                    obj20 = this.remoteconfig.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    i7 &= -536870913;
                    obj21 = this.pro.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                case 30:
                    i7 &= -1073741825;
                    obj22 = abstractC13345e5.vip(abstractC17080e);
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
                default:
                    obj4 = obj27;
                    obj5 = obj28;
                    obj = obj4;
                    obj25 = obj29;
                    obj2 = obj;
                    obj26 = obj30;
                    obj3 = obj2;
                    obj7 = obj31;
                    obj6 = obj3;
                    i2 = i8;
                    break;
            }
        }
        Object obj32 = obj6;
        Object obj33 = obj5;
        Object obj34 = obj25;
        Object obj35 = obj26;
        Object obj36 = obj7;
        int i9 = i2;
        abstractC17080e.advert();
        if (set.size() == 0) {
            return new AudioPlaylist(i9, j, (String) obj33, (AudioPlaylist.AlbumMeta) obj23, (String) obj24, (String) obj32, i3, i4, i5, j2, (Long) obj34, (List) obj35, (Boolean) obj36, (Boolean) obj8, (List) obj9, i6, (FollowedMetadata) obj10, (OriginalPlaylist) obj11, (AlbumThumb) obj12, (List) obj13, (String) obj14, (Boolean) obj15, (String) obj16, (List) obj17, z, z2, (AudioChartInfo) obj18, (AudioPlaylistMeta) obj19, (MusicDynamicRestriction) obj20, (AudioPlaylistPermissions) obj21, (String) obj22, false, null, false, false, i7, -1);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
