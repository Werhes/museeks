package ua.itaysonlab.vkapi2.objects.music;

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
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioTrackJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("artist", "id", "owner_id", "title", "duration", "access_key", "is_explicit", "is_licensed", "track_code", "url", "date", "genre_id", "content_restricted", "album", "lyrics_id", "main_artists", "featured_artists", "subtitle", "track_genre_id", "album_part_number", "is_hq", "is_focus_track", "has_lyrics", "dislike", "podcast_info", "audio_chart_info", "stream_duration", "release_audio_id", "like");
    public final AbstractC13345e adcel;
    public final AbstractC13345e advert;
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e mopub;
    public final AbstractC13345e purchase;
    public final AbstractC13345e startapp;
    public final AbstractC13345e vip;
    public final AbstractC13345e yandex;

    public AudioTrackJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "artist");
        this.metrica = c14172e.vip(Integer.TYPE, c3295e, "id");
        this.license = c14172e.vip(Long.TYPE, c3295e, "owner_id");
        this.appmetrica = c14172e.vip(String.class, c3295e, "access_key");
        this.purchase = c14172e.vip(Boolean.TYPE, c3295e, "is_explicit");
        this.billing = c14172e.vip(Integer.class, c3295e, "genre_id");
        this.yandex = c14172e.vip(AudioAlbum.class, c3295e, "album");
        this.startapp = c14172e.vip(AbstractC18453e.purchase(List.class, MainArtist.class), c3295e, "main_artists");
        this.adcel = c14172e.vip(PodcastInfo.class, c3295e, "podcast_info");
        this.mopub = c14172e.vip(AudioChartInfo.class, c3295e, "audio_chart_info");
        this.advert = c14172e.vip(Boolean.class, c3295e, "like");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioTrack audioTrack = (AudioTrack) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("artist");
        String str = audioTrack.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("id");
        int i = audioTrack.vip;
        AbstractC13345e abstractC13345e2 = this.metrica;
        AbstractC8647e.subs(i, abstractC13345e2, abstractC3442e, "owner_id");
        long j = audioTrack.metrica;
        AbstractC13345e abstractC13345e3 = this.license;
        AbstractC8647e.crashlytics(j, abstractC13345e3, abstractC3442e, "title");
        abstractC13345e.purchase(abstractC3442e, audioTrack.license);
        abstractC3442e.loadAd("duration");
        AbstractC8647e.subs(audioTrack.appmetrica, abstractC13345e2, abstractC3442e, "access_key");
        String str2 = audioTrack.purchase;
        AbstractC13345e abstractC13345e4 = this.appmetrica;
        abstractC13345e4.purchase(abstractC3442e, str2);
        abstractC3442e.loadAd("is_explicit");
        boolean z = audioTrack.billing;
        AbstractC13345e abstractC13345e5 = this.purchase;
        AbstractC8647e.m2459native(z, abstractC13345e5, abstractC3442e, "is_licensed");
        AbstractC8647e.m2459native(audioTrack.yandex, abstractC13345e5, abstractC3442e, "track_code");
        abstractC13345e.purchase(abstractC3442e, audioTrack.startapp);
        abstractC3442e.loadAd("url");
        abstractC13345e.purchase(abstractC3442e, audioTrack.adcel);
        abstractC3442e.loadAd("date");
        AbstractC8647e.crashlytics(audioTrack.mopub, abstractC13345e3, abstractC3442e, "genre_id");
        Integer num = audioTrack.advert;
        AbstractC13345e abstractC13345e6 = this.billing;
        abstractC13345e6.purchase(abstractC3442e, num);
        abstractC3442e.loadAd("content_restricted");
        AbstractC8647e.subs(audioTrack.smaato, abstractC13345e2, abstractC3442e, "album");
        this.yandex.purchase(abstractC3442e, audioTrack.amazon);
        abstractC3442e.loadAd("lyrics_id");
        abstractC13345e6.purchase(abstractC3442e, audioTrack.loadAd);
        abstractC3442e.loadAd("main_artists");
        List list = audioTrack.Signature;
        AbstractC13345e abstractC13345e7 = this.startapp;
        abstractC13345e7.purchase(abstractC3442e, list);
        abstractC3442e.loadAd("featured_artists");
        abstractC13345e7.purchase(abstractC3442e, audioTrack.admob);
        abstractC3442e.loadAd("subtitle");
        abstractC13345e4.purchase(abstractC3442e, audioTrack.subscription);
        abstractC3442e.loadAd("track_genre_id");
        abstractC13345e6.purchase(abstractC3442e, audioTrack.remoteconfig);
        abstractC3442e.loadAd("album_part_number");
        abstractC13345e6.purchase(abstractC3442e, audioTrack.pro);
        abstractC3442e.loadAd("is_hq");
        AbstractC8647e.m2459native(audioTrack.signatures, abstractC13345e5, abstractC3442e, "is_focus_track");
        AbstractC8647e.m2459native(audioTrack.tapsense, abstractC13345e5, abstractC3442e, "has_lyrics");
        AbstractC8647e.m2459native(audioTrack.isVip, abstractC13345e5, abstractC3442e, "dislike");
        AbstractC8647e.m2459native(audioTrack.inmobi, abstractC13345e5, abstractC3442e, "podcast_info");
        this.adcel.purchase(abstractC3442e, audioTrack.isPro);
        abstractC3442e.loadAd("audio_chart_info");
        this.mopub.purchase(abstractC3442e, audioTrack.applovin);
        abstractC3442e.loadAd("stream_duration");
        AbstractC8647e.subs(audioTrack.ads, abstractC13345e2, abstractC3442e, "release_audio_id");
        abstractC13345e4.purchase(abstractC3442e, audioTrack.premium);
        abstractC3442e.loadAd("like");
        this.advert.purchase(abstractC3442e, audioTrack.subs);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioTrack)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0069. Please report as an issue. */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        Set set;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        abstractC17080e.license();
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
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i5 = 0;
        long j = 0;
        long j2 = 0;
        int i6 = -1;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Set set2 = C3295e.f7451e;
        Object obj23 = null;
        while (abstractC17080e.Signature()) {
            Object obj24 = obj20;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.license;
            Object obj25 = obj21;
            AbstractC13345e abstractC13345e2 = this.startapp;
            Object obj26 = obj23;
            AbstractC13345e abstractC13345e3 = this.appmetrica;
            Object obj27 = obj22;
            AbstractC13345e abstractC13345e4 = this.vip;
            Object obj28 = obj7;
            AbstractC13345e abstractC13345e5 = this.billing;
            Object obj29 = obj8;
            AbstractC13345e abstractC13345e6 = this.metrica;
            Object obj30 = obj9;
            AbstractC13345e abstractC13345e7 = this.purchase;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 0:
                    Object vip = abstractC13345e4.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("artist", "artist", abstractC17080e, set2);
                        obj = obj18;
                    } else {
                        set = set2;
                        obj = vip;
                    }
                    i6 &= -2;
                    obj18 = obj;
                    set2 = set;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 1:
                    Object vip2 = abstractC13345e6.vip(abstractC17080e);
                    if (vip2 == null) {
                        set2 = AbstractC0869e.subs("id", "id", abstractC17080e, set2);
                    } else {
                        i2 = ((Number) vip2).intValue();
                    }
                    i6 &= -3;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 2:
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set2 = AbstractC0869e.subs("owner_id", "owner_id", abstractC17080e, set2);
                    } else {
                        j = ((Number) vip3).longValue();
                    }
                    i6 &= -5;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 3:
                    Object vip4 = abstractC13345e4.vip(abstractC17080e);
                    if (vip4 == null) {
                        set2 = AbstractC0869e.subs("title", "title", abstractC17080e, set2);
                    } else {
                        obj19 = vip4;
                    }
                    i6 &= -9;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 4:
                    Object vip5 = abstractC13345e6.vip(abstractC17080e);
                    if (vip5 == null) {
                        set2 = AbstractC0869e.subs("duration", "duration", abstractC17080e, set2);
                    } else {
                        i3 = ((Number) vip5).intValue();
                    }
                    i6 &= -17;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 5:
                    i6 &= -33;
                    obj6 = abstractC13345e3.vip(abstractC17080e);
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 6:
                    Object vip6 = abstractC13345e7.vip(abstractC17080e);
                    if (vip6 == null) {
                        set2 = AbstractC0869e.subs("is_explicit", "is_explicit", abstractC17080e, set2);
                    } else {
                        z = ((Boolean) vip6).booleanValue();
                    }
                    i6 &= -65;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 7:
                    Object vip7 = abstractC13345e7.vip(abstractC17080e);
                    if (vip7 == null) {
                        set2 = AbstractC0869e.subs("is_licensed", "is_licensed", abstractC17080e, set2);
                    } else {
                        z2 = ((Boolean) vip7).booleanValue();
                    }
                    i6 &= -129;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 8:
                    Object vip8 = abstractC13345e4.vip(abstractC17080e);
                    if (vip8 == null) {
                        set2 = AbstractC0869e.subs("track_code", "track_code", abstractC17080e, set2);
                        obj21 = obj25;
                    } else {
                        obj21 = vip8;
                    }
                    i6 &= -257;
                    obj2 = obj24;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 9:
                    Object vip9 = abstractC13345e4.vip(abstractC17080e);
                    if (vip9 == null) {
                        set2 = AbstractC0869e.subs("url", "url", abstractC17080e, set2);
                        obj23 = obj26;
                    } else {
                        obj23 = vip9;
                    }
                    i6 &= -513;
                    obj3 = obj24;
                    obj21 = obj25;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 10:
                    Object vip10 = abstractC13345e.vip(abstractC17080e);
                    if (vip10 == null) {
                        set2 = AbstractC0869e.subs("date", "date", abstractC17080e, set2);
                    } else {
                        j2 = ((Number) vip10).longValue();
                    }
                    i6 &= -1025;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 11:
                    i6 &= -2049;
                    obj22 = abstractC13345e5.vip(abstractC17080e);
                    obj4 = obj24;
                    obj21 = obj25;
                    obj23 = obj26;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 12:
                    Object vip11 = abstractC13345e6.vip(abstractC17080e);
                    if (vip11 == null) {
                        set2 = AbstractC0869e.subs("content_restricted", "content_restricted", abstractC17080e, set2);
                    } else {
                        i4 = ((Number) vip11).intValue();
                    }
                    i6 &= -4097;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 13:
                    i6 &= -8193;
                    obj7 = this.yandex.vip(abstractC17080e);
                    obj5 = obj24;
                    obj21 = obj25;
                    obj23 = obj26;
                    obj22 = obj27;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 14:
                    i6 &= -16385;
                    obj8 = abstractC13345e5.vip(abstractC17080e);
                    obj20 = obj24;
                    obj21 = obj25;
                    obj23 = obj26;
                    obj22 = obj27;
                    obj7 = obj28;
                    obj9 = obj30;
                    break;
                case 15:
                    i6 &= -32769;
                    obj9 = abstractC13345e2.vip(abstractC17080e);
                    obj20 = obj24;
                    obj21 = obj25;
                    obj23 = obj26;
                    obj22 = obj27;
                    obj7 = obj28;
                    obj8 = obj29;
                    break;
                case 16:
                    i6 &= -65537;
                    obj10 = abstractC13345e2.vip(abstractC17080e);
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    i6 &= -131073;
                    obj11 = abstractC13345e3.vip(abstractC17080e);
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    i6 &= -262145;
                    obj12 = abstractC13345e5.vip(abstractC17080e);
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    i6 &= -524289;
                    obj13 = abstractC13345e5.vip(abstractC17080e);
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 20:
                    Object vip12 = abstractC13345e7.vip(abstractC17080e);
                    if (vip12 == null) {
                        set2 = AbstractC0869e.subs("is_hq", "is_hq", abstractC17080e, set2);
                    } else {
                        z3 = ((Boolean) vip12).booleanValue();
                    }
                    i = -1048577;
                    i6 &= i;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 21:
                    Object vip13 = abstractC13345e7.vip(abstractC17080e);
                    if (vip13 == null) {
                        set2 = AbstractC0869e.subs("is_focus_track", "is_focus_track", abstractC17080e, set2);
                    } else {
                        z4 = ((Boolean) vip13).booleanValue();
                    }
                    i = -2097153;
                    i6 &= i;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 22:
                    Object vip14 = abstractC13345e7.vip(abstractC17080e);
                    if (vip14 == null) {
                        set2 = AbstractC0869e.subs("has_lyrics", "has_lyrics", abstractC17080e, set2);
                    } else {
                        z5 = ((Boolean) vip14).booleanValue();
                    }
                    i = -4194305;
                    i6 &= i;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case 23:
                    Object vip15 = abstractC13345e7.vip(abstractC17080e);
                    if (vip15 == null) {
                        set2 = AbstractC0869e.subs("dislike", "dislike", abstractC17080e, set2);
                    } else {
                        z6 = ((Boolean) vip15).booleanValue();
                    }
                    i = -8388609;
                    i6 &= i;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    i6 &= -16777217;
                    obj14 = this.adcel.vip(abstractC17080e);
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    i6 &= -33554433;
                    obj15 = this.mopub.vip(abstractC17080e);
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    Object vip16 = abstractC13345e6.vip(abstractC17080e);
                    if (vip16 == null) {
                        set2 = AbstractC0869e.subs("stream_duration", "stream_duration", abstractC17080e, set2);
                    } else {
                        i5 = ((Number) vip16).intValue();
                    }
                    i = -67108865;
                    i6 &= i;
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    i6 &= -134217729;
                    obj16 = abstractC13345e3.vip(abstractC17080e);
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    i6 &= -268435457;
                    obj17 = this.advert.vip(abstractC17080e);
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
                default:
                    obj6 = obj24;
                    obj21 = obj25;
                    obj2 = obj6;
                    obj23 = obj26;
                    obj3 = obj2;
                    obj22 = obj27;
                    obj4 = obj3;
                    obj7 = obj28;
                    obj5 = obj4;
                    obj8 = obj29;
                    obj20 = obj5;
                    obj9 = obj30;
                    break;
            }
        }
        Object obj31 = obj20;
        Object obj32 = obj21;
        Object obj33 = obj23;
        Object obj34 = obj22;
        Object obj35 = obj7;
        Object obj36 = obj8;
        Object obj37 = obj9;
        abstractC17080e.advert();
        if (set2.size() == 0) {
            return new AudioTrack((String) obj18, i2, j, (String) obj19, i3, (String) obj31, z, z2, (String) obj32, (String) obj33, j2, (Integer) obj34, i4, (AudioAlbum) obj35, (Integer) obj36, (List) obj37, (List) obj10, (String) obj11, (Integer) obj12, (Integer) obj13, z3, z4, z5, z6, (PodcastInfo) obj14, (AudioChartInfo) obj15, i5, (String) obj16, (Boolean) obj17, false, false, false, false, false, i6, -1);
        }
        throw new C14803e(AbstractC13480e.m3608try(set2, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
