package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14729e implements InterfaceC12067e {
    public static final C14729e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eٕٔؑ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioAudioDto", obj, 39);
        c4707e.advert("artist", false);
        c4707e.advert("id", false);
        c4707e.advert("owner_id", false);
        c4707e.advert("title", false);
        c4707e.advert("duration", false);
        c4707e.advert("access_key", true);
        c4707e.advert("is_explicit", true);
        c4707e.advert("is_focus_track", true);
        c4707e.advert("is_licensed", true);
        c4707e.advert("track_code", true);
        c4707e.advert("url", true);
        c4707e.advert("date", true);
        c4707e.advert("album_id", true);
        c4707e.advert("has_lyrics", true);
        c4707e.advert("genre_id", true);
        c4707e.advert("no_search", true);
        c4707e.advert("album", true);
        c4707e.advert("release_id", true);
        c4707e.advert("track_id", true);
        c4707e.advert("mstcp_type", true);
        c4707e.advert("track_genre_id", true);
        c4707e.advert("content_restricted", true);
        c4707e.advert("main_artists", true);
        c4707e.advert("featured_artists", true);
        c4707e.advert("subtitle", true);
        c4707e.advert("album_part_number", true);
        c4707e.advert("performer", true);
        c4707e.advert("podcast_info", true);
        c4707e.advert("audio_chart_info", true);
        c4707e.advert("original_sound_video_id", true);
        c4707e.advert("short_videos_allowed", true);
        c4707e.advert("stories_allowed", true);
        c4707e.advert("stories_cover_allowed", true);
        c4707e.advert("in_clips_favorite_allowed", true);
        c4707e.advert("in_clips_favorite", true);
        c4707e.advert("dmca_blocked", true);
        c4707e.advert("kws_skip", true);
        c4707e.advert("is_official", true);
        c4707e.advert("release_audio_id", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C18422e c18422e = (C18422e) obj;
        Integer num = c18422e.applovin;
        String str = c18422e.f36115while;
        Boolean bool = c18422e.f36114throw;
        List list = c18422e.f36109extends;
        Boolean bool2 = c18422e.f36112native;
        Boolean bool3 = c18422e.f36113this;
        Boolean bool4 = c18422e.f36110goto;
        Boolean bool5 = c18422e.f36111interface;
        Boolean bool6 = c18422e.f36108class;
        Boolean bool7 = c18422e.firebase;
        String str2 = c18422e.crashlytics;
        C4742e c4742e = c18422e.subs;
        C9432e c9432e = c18422e.premium;
        String str3 = c18422e.ads;
        String str4 = c18422e.isPro;
        List list2 = c18422e.inmobi;
        List list3 = c18422e.isVip;
        EnumC13802e enumC13802e = c18422e.tapsense;
        EnumC14925e enumC14925e = c18422e.signatures;
        EnumC2057e enumC2057e = c18422e.pro;
        Integer num2 = c18422e.remoteconfig;
        Integer num3 = c18422e.subscription;
        C5442e c5442e = c18422e.admob;
        EnumC6664e enumC6664e = c18422e.Signature;
        EnumC10609e enumC10609e = c18422e.loadAd;
        Boolean bool8 = c18422e.amazon;
        Integer num4 = c18422e.smaato;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C18422e.f36107try;
        String str5 = c18422e.ad;
        Integer num5 = c18422e.advert;
        String str6 = c18422e.mopub;
        String str7 = c18422e.adcel;
        Boolean bool9 = c18422e.startapp;
        Boolean bool10 = c18422e.yandex;
        Boolean bool11 = c18422e.billing;
        String str8 = c18422e.purchase;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.ads(interfaceC9998e, 0, str5);
        abstractC15920e.inmobi(1, c18422e.vip, interfaceC9998e);
        abstractC15920e.applovin(interfaceC9998e, 2, C13980e.ad, new C5655e(c18422e.metrica));
        abstractC15920e.ads(interfaceC9998e, 3, c18422e.license);
        abstractC15920e.inmobi(4, c18422e.appmetrica, interfaceC9998e);
        if (abstractC15920e.subscription() || str8 != null) {
            abstractC15920e.Signature(interfaceC9998e, 5, C9582e.ad, str8);
        }
        if (abstractC15920e.subscription() || bool11 != null) {
            abstractC15920e.Signature(interfaceC9998e, 6, C6266e.ad, bool11);
        }
        if (abstractC15920e.subscription() || bool10 != null) {
            abstractC15920e.Signature(interfaceC9998e, 7, C6266e.ad, bool10);
        }
        if (abstractC15920e.subscription() || bool9 != null) {
            abstractC15920e.Signature(interfaceC9998e, 8, C6266e.ad, bool9);
        }
        if (abstractC15920e.subscription() || str7 != null) {
            abstractC15920e.Signature(interfaceC9998e, 9, C9582e.ad, str7);
        }
        if (abstractC15920e.subscription() || str6 != null) {
            abstractC15920e.Signature(interfaceC9998e, 10, C9582e.ad, str6);
        }
        if (abstractC15920e.subscription() || num5 != null) {
            abstractC15920e.Signature(interfaceC9998e, 11, C13257e.ad, num5);
        }
        if (abstractC15920e.subscription() || num4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 12, C13257e.ad, num4);
        }
        if (abstractC15920e.subscription() || bool8 != null) {
            abstractC15920e.Signature(interfaceC9998e, 13, C6266e.ad, bool8);
        }
        if (abstractC15920e.subscription() || enumC10609e != null) {
            abstractC15920e.Signature(interfaceC9998e, 14, (InterfaceC5372e) interfaceC3477eArr[14].getValue(), enumC10609e);
        }
        if (abstractC15920e.subscription() || enumC6664e != null) {
            abstractC15920e.Signature(interfaceC9998e, 15, (InterfaceC5372e) interfaceC3477eArr[15].getValue(), enumC6664e);
        }
        if (abstractC15920e.subscription() || c5442e != null) {
            abstractC15920e.Signature(interfaceC9998e, 16, C5012e.ad, c5442e);
        }
        if (abstractC15920e.subscription() || num3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 17, C13257e.ad, num3);
        }
        if (abstractC15920e.subscription() || num2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 18, C13257e.ad, num2);
        }
        if (abstractC15920e.subscription() || enumC2057e != null) {
            abstractC15920e.Signature(interfaceC9998e, 19, (InterfaceC5372e) interfaceC3477eArr[19].getValue(), enumC2057e);
        }
        if (abstractC15920e.subscription() || enumC14925e != null) {
            abstractC15920e.Signature(interfaceC9998e, 20, (InterfaceC5372e) interfaceC3477eArr[20].getValue(), enumC14925e);
        }
        if (abstractC15920e.subscription() || enumC13802e != null) {
            abstractC15920e.Signature(interfaceC9998e, 21, (InterfaceC5372e) interfaceC3477eArr[21].getValue(), enumC13802e);
        }
        if (abstractC15920e.subscription() || list3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 22, (InterfaceC5372e) interfaceC3477eArr[22].getValue(), list3);
        }
        if (abstractC15920e.subscription() || list2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 23, (InterfaceC5372e) interfaceC3477eArr[23].getValue(), list2);
        }
        if (abstractC15920e.subscription() || str4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 24, C9582e.ad, str4);
        }
        if (abstractC15920e.subscription() || num != null) {
            abstractC15920e.Signature(interfaceC9998e, 25, C13257e.ad, num);
        }
        if (abstractC15920e.subscription() || str3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 26, C9582e.ad, str3);
        }
        if (abstractC15920e.subscription() || c9432e != null) {
            abstractC15920e.Signature(interfaceC9998e, 27, C3961e.ad, c9432e);
        }
        if (abstractC15920e.subscription() || c4742e != null) {
            abstractC15920e.Signature(interfaceC9998e, 28, C11752e.ad, c4742e);
        }
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 29, C9582e.ad, str2);
        }
        if (abstractC15920e.subscription() || bool7 != null) {
            abstractC15920e.Signature(interfaceC9998e, 30, C6266e.ad, bool7);
        }
        if (abstractC15920e.subscription() || bool6 != null) {
            abstractC15920e.Signature(interfaceC9998e, 31, C6266e.ad, bool6);
        }
        if (abstractC15920e.subscription() || bool5 != null) {
            abstractC15920e.Signature(interfaceC9998e, 32, C6266e.ad, bool5);
        }
        if (abstractC15920e.subscription() || bool4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 33, C6266e.ad, bool4);
        }
        if (abstractC15920e.subscription() || bool3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 34, C6266e.ad, bool3);
        }
        if (abstractC15920e.subscription() || bool2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 35, C6266e.ad, bool2);
        }
        if (abstractC15920e.subscription() || list != null) {
            abstractC15920e.Signature(interfaceC9998e, 36, (InterfaceC5372e) interfaceC3477eArr[36].getValue(), list);
        }
        if (abstractC15920e.subscription() || bool != null) {
            abstractC15920e.Signature(interfaceC9998e, 37, C6266e.ad, bool);
        }
        if (abstractC15920e.subscription() || str != null) {
            abstractC15920e.Signature(interfaceC9998e, 38, C9582e.ad, str);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C18422e.f36107try;
        C9582e c9582e = C9582e.ad;
        C13257e c13257e = C13257e.ad;
        InterfaceC5372e purchase = AbstractC6069e.purchase(c9582e);
        C6266e c6266e = C6266e.ad;
        return new InterfaceC5372e[]{c9582e, c13257e, C13980e.ad, c9582e, c13257e, purchase, AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[14].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[15].getValue()), AbstractC6069e.purchase(C5012e.ad), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[19].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[20].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[21].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[22].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[23].getValue()), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(C3961e.ad), AbstractC6069e.purchase(C11752e.ad), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[36].getValue()), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c9582e)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x005a. Please report as an issue. */
    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        String str;
        String str2;
        C4742e c4742e;
        C4742e c4742e2;
        int i;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C18422e.f36107try;
        Boolean bool = null;
        String str3 = null;
        C4742e c4742e3 = null;
        C9432e c9432e = null;
        List list = null;
        Boolean bool2 = null;
        String str4 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        String str5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        String str6 = null;
        String str7 = null;
        C5655e c5655e = null;
        String str8 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        String str9 = null;
        String str10 = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool11 = null;
        EnumC10609e enumC10609e = null;
        EnumC6664e enumC6664e = null;
        C5442e c5442e = null;
        Integer num3 = null;
        Integer num4 = null;
        EnumC2057e enumC2057e = null;
        EnumC14925e enumC14925e = null;
        EnumC13802e enumC13802e = null;
        List list2 = null;
        List list3 = null;
        String str11 = null;
        Integer num5 = null;
        int i2 = 0;
        boolean z = true;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (z) {
            int i6 = i2;
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    str = str3;
                    str2 = str5;
                    i2 = i6;
                    c4742e = c4742e3;
                    Unit unit = Unit.INSTANCE;
                    z = false;
                    c4742e3 = c4742e;
                    str5 = str2;
                    str3 = str;
                case 0:
                    str = str3;
                    str2 = str5;
                    c4742e = c4742e3;
                    String smaato = metrica.smaato(interfaceC9998e, 0);
                    i2 = i6 | 1;
                    Unit unit2 = Unit.INSTANCE;
                    str6 = smaato;
                    c4742e3 = c4742e;
                    str5 = str2;
                    str3 = str;
                case 1:
                    str = str3;
                    str2 = str5;
                    i4 = metrica.remoteconfig(interfaceC9998e, 1);
                    i2 = i6 | 2;
                    Unit unit3 = Unit.INSTANCE;
                    c4742e3 = c4742e3;
                    str5 = str2;
                    str3 = str;
                case 2:
                    str = str3;
                    str2 = str5;
                    c4742e2 = c4742e3;
                    C5655e c5655e2 = (C5655e) metrica.subscription(interfaceC9998e, 2, C13980e.ad, c5655e);
                    i2 = i6 | 4;
                    Unit unit4 = Unit.INSTANCE;
                    c5655e = c5655e2;
                    c4742e3 = c4742e2;
                    str5 = str2;
                    str3 = str;
                case 3:
                    str = str3;
                    str2 = str5;
                    c4742e2 = c4742e3;
                    String smaato2 = metrica.smaato(interfaceC9998e, 3);
                    i2 = i6 | 8;
                    Unit unit5 = Unit.INSTANCE;
                    str7 = smaato2;
                    c4742e3 = c4742e2;
                    str5 = str2;
                    str3 = str;
                case 4:
                    str = str3;
                    str2 = str5;
                    c4742e2 = c4742e3;
                    i5 = metrica.remoteconfig(interfaceC9998e, 4);
                    i2 = i6 | 16;
                    Unit unit6 = Unit.INSTANCE;
                    c4742e3 = c4742e2;
                    str5 = str2;
                    str3 = str;
                case 5:
                    str = str3;
                    str2 = str5;
                    c4742e2 = c4742e3;
                    String str12 = (String) metrica.inmobi(interfaceC9998e, 5, C9582e.ad, str8);
                    i2 = i6 | 32;
                    Unit unit7 = Unit.INSTANCE;
                    str8 = str12;
                    c4742e3 = c4742e2;
                    str5 = str2;
                    str3 = str;
                case 6:
                    str = str3;
                    str2 = str5;
                    c4742e2 = c4742e3;
                    Boolean bool12 = (Boolean) metrica.inmobi(interfaceC9998e, 6, C6266e.ad, bool8);
                    i2 = i6 | 64;
                    Unit unit8 = Unit.INSTANCE;
                    bool8 = bool12;
                    c4742e3 = c4742e2;
                    str5 = str2;
                    str3 = str;
                case 7:
                    str = str3;
                    str2 = str5;
                    c4742e2 = c4742e3;
                    Boolean bool13 = (Boolean) metrica.inmobi(interfaceC9998e, 7, C6266e.ad, bool9);
                    i2 = i6 | 128;
                    Unit unit9 = Unit.INSTANCE;
                    bool9 = bool13;
                    c4742e3 = c4742e2;
                    str5 = str2;
                    str3 = str;
                case 8:
                    str = str3;
                    str2 = str5;
                    c4742e2 = c4742e3;
                    Boolean bool14 = (Boolean) metrica.inmobi(interfaceC9998e, 8, C6266e.ad, bool10);
                    i2 = i6 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    Unit unit10 = Unit.INSTANCE;
                    bool10 = bool14;
                    c4742e3 = c4742e2;
                    str5 = str2;
                    str3 = str;
                case 9:
                    str = str3;
                    str2 = str5;
                    c4742e2 = c4742e3;
                    String str13 = (String) metrica.inmobi(interfaceC9998e, 9, C9582e.ad, str9);
                    i2 = i6 | AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    Unit unit11 = Unit.INSTANCE;
                    str9 = str13;
                    c4742e3 = c4742e2;
                    str5 = str2;
                    str3 = str;
                case 10:
                    str = str3;
                    str2 = str5;
                    c4742e2 = c4742e3;
                    String str14 = (String) metrica.inmobi(interfaceC9998e, 10, C9582e.ad, str10);
                    i2 = i6 | 1024;
                    Unit unit12 = Unit.INSTANCE;
                    str10 = str14;
                    c4742e3 = c4742e2;
                    str5 = str2;
                    str3 = str;
                case 11:
                    str = str3;
                    str2 = str5;
                    c4742e2 = c4742e3;
                    Integer num6 = (Integer) metrica.inmobi(interfaceC9998e, 11, C13257e.ad, num);
                    i2 = i6 | 2048;
                    Unit unit13 = Unit.INSTANCE;
                    num = num6;
                    c4742e3 = c4742e2;
                    str5 = str2;
                    str3 = str;
                case 12:
                    str = str3;
                    str2 = str5;
                    c4742e2 = c4742e3;
                    Integer num7 = (Integer) metrica.inmobi(interfaceC9998e, 12, C13257e.ad, num2);
                    i2 = i6 | 4096;
                    Unit unit14 = Unit.INSTANCE;
                    num2 = num7;
                    c4742e3 = c4742e2;
                    str5 = str2;
                    str3 = str;
                case 13:
                    str = str3;
                    str2 = str5;
                    c4742e2 = c4742e3;
                    Boolean bool15 = (Boolean) metrica.inmobi(interfaceC9998e, 13, C6266e.ad, bool11);
                    i2 = i6 | 8192;
                    Unit unit15 = Unit.INSTANCE;
                    bool11 = bool15;
                    c4742e3 = c4742e2;
                    str5 = str2;
                    str3 = str;
                case 14:
                    str = str3;
                    str2 = str5;
                    EnumC10609e enumC10609e2 = (EnumC10609e) metrica.inmobi(interfaceC9998e, 14, (InterfaceC5372e) interfaceC3477eArr[14].getValue(), enumC10609e);
                    i2 = i6 | 16384;
                    Unit unit16 = Unit.INSTANCE;
                    enumC10609e = enumC10609e2;
                    str5 = str2;
                    str3 = str;
                case 15:
                    str = str3;
                    str2 = str5;
                    EnumC6664e enumC6664e2 = (EnumC6664e) metrica.inmobi(interfaceC9998e, 15, (InterfaceC5372e) interfaceC3477eArr[15].getValue(), enumC6664e);
                    i2 = i6 | 32768;
                    Unit unit17 = Unit.INSTANCE;
                    enumC6664e = enumC6664e2;
                    str5 = str2;
                    str3 = str;
                case 16:
                    str = str3;
                    str2 = str5;
                    C5442e c5442e2 = (C5442e) metrica.inmobi(interfaceC9998e, 16, C5012e.ad, c5442e);
                    i2 = i6 | 65536;
                    Unit unit18 = Unit.INSTANCE;
                    c5442e = c5442e2;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    str = str3;
                    str2 = str5;
                    Integer num8 = (Integer) metrica.inmobi(interfaceC9998e, 17, C13257e.ad, num3);
                    i2 = i6 | 131072;
                    Unit unit19 = Unit.INSTANCE;
                    num3 = num8;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    str = str3;
                    str2 = str5;
                    Integer num9 = (Integer) metrica.inmobi(interfaceC9998e, 18, C13257e.ad, num4);
                    i2 = i6 | 262144;
                    Unit unit20 = Unit.INSTANCE;
                    num4 = num9;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    str = str3;
                    str2 = str5;
                    EnumC2057e enumC2057e2 = (EnumC2057e) metrica.inmobi(interfaceC9998e, 19, (InterfaceC5372e) interfaceC3477eArr[19].getValue(), enumC2057e);
                    i2 = i6 | 524288;
                    Unit unit21 = Unit.INSTANCE;
                    enumC2057e = enumC2057e2;
                    str5 = str2;
                    str3 = str;
                case 20:
                    str = str3;
                    str2 = str5;
                    EnumC14925e enumC14925e2 = (EnumC14925e) metrica.inmobi(interfaceC9998e, 20, (InterfaceC5372e) interfaceC3477eArr[20].getValue(), enumC14925e);
                    i2 = i6 | 1048576;
                    Unit unit22 = Unit.INSTANCE;
                    enumC14925e = enumC14925e2;
                    str5 = str2;
                    str3 = str;
                case 21:
                    str = str3;
                    str2 = str5;
                    EnumC13802e enumC13802e2 = (EnumC13802e) metrica.inmobi(interfaceC9998e, 21, (InterfaceC5372e) interfaceC3477eArr[21].getValue(), enumC13802e);
                    i2 = i6 | 2097152;
                    Unit unit23 = Unit.INSTANCE;
                    enumC13802e = enumC13802e2;
                    str5 = str2;
                    str3 = str;
                case 22:
                    str = str3;
                    str2 = str5;
                    List list4 = (List) metrica.inmobi(interfaceC9998e, 22, (InterfaceC5372e) interfaceC3477eArr[22].getValue(), list2);
                    i2 = i6 | 4194304;
                    Unit unit24 = Unit.INSTANCE;
                    list2 = list4;
                    str5 = str2;
                    str3 = str;
                case 23:
                    str = str3;
                    str2 = str5;
                    List list5 = (List) metrica.inmobi(interfaceC9998e, 23, (InterfaceC5372e) interfaceC3477eArr[23].getValue(), list3);
                    i2 = i6 | 8388608;
                    Unit unit25 = Unit.INSTANCE;
                    list3 = list5;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    str = str3;
                    str2 = str5;
                    String str15 = (String) metrica.inmobi(interfaceC9998e, 24, C9582e.ad, str11);
                    i2 = i6 | 16777216;
                    Unit unit26 = Unit.INSTANCE;
                    str11 = str15;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    str = str3;
                    str2 = str5;
                    Integer num10 = (Integer) metrica.inmobi(interfaceC9998e, 25, C13257e.ad, num5);
                    i2 = i6 | 33554432;
                    Unit unit27 = Unit.INSTANCE;
                    num5 = num10;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    str = str3;
                    String str16 = (String) metrica.inmobi(interfaceC9998e, 26, C9582e.ad, str5);
                    i2 = i6 | 67108864;
                    Unit unit28 = Unit.INSTANCE;
                    str2 = str16;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    str2 = str5;
                    c9432e = (C9432e) metrica.inmobi(interfaceC9998e, 27, C3961e.ad, c9432e);
                    i = 134217728;
                    i2 = i6 | i;
                    Unit unit29 = Unit.INSTANCE;
                    str = str3;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    str2 = str5;
                    c4742e3 = (C4742e) metrica.inmobi(interfaceC9998e, 28, C11752e.ad, c4742e3);
                    i = 268435456;
                    i2 = i6 | i;
                    Unit unit292 = Unit.INSTANCE;
                    str = str3;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    str2 = str5;
                    str3 = (String) metrica.inmobi(interfaceC9998e, 29, C9582e.ad, str3);
                    i = 536870912;
                    i2 = i6 | i;
                    Unit unit2922 = Unit.INSTANCE;
                    str = str3;
                    str5 = str2;
                    str3 = str;
                case 30:
                    str2 = str5;
                    bool3 = (Boolean) metrica.inmobi(interfaceC9998e, 30, C6266e.ad, bool3);
                    i = 1073741824;
                    i2 = i6 | i;
                    Unit unit29222 = Unit.INSTANCE;
                    str = str3;
                    str5 = str2;
                    str3 = str;
                case 31:
                    str2 = str5;
                    Boolean bool16 = (Boolean) metrica.inmobi(interfaceC9998e, 31, C6266e.ad, bool5);
                    int i7 = i6 | RecyclerView.UNDEFINED_DURATION;
                    Unit unit30 = Unit.INSTANCE;
                    bool5 = bool16;
                    i2 = i7;
                    str = str3;
                    str5 = str2;
                    str3 = str;
                case 32:
                    str2 = str5;
                    Boolean bool17 = (Boolean) metrica.inmobi(interfaceC9998e, 32, C6266e.ad, bool4);
                    i3 |= 1;
                    Unit unit31 = Unit.INSTANCE;
                    str = str3;
                    bool4 = bool17;
                    i2 = i6;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    str2 = str5;
                    Boolean bool18 = (Boolean) metrica.inmobi(interfaceC9998e, 33, C6266e.ad, bool6);
                    i3 |= 2;
                    Unit unit32 = Unit.INSTANCE;
                    str = str3;
                    bool6 = bool18;
                    i2 = i6;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    str2 = str5;
                    Boolean bool19 = (Boolean) metrica.inmobi(interfaceC9998e, 34, C6266e.ad, bool7);
                    i3 |= 4;
                    Unit unit33 = Unit.INSTANCE;
                    str = str3;
                    bool7 = bool19;
                    i2 = i6;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    str2 = str5;
                    bool = (Boolean) metrica.inmobi(interfaceC9998e, 35, C6266e.ad, bool);
                    i3 |= 8;
                    Unit unit34 = Unit.INSTANCE;
                    str = str3;
                    i2 = i6;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    str2 = str5;
                    list = (List) metrica.inmobi(interfaceC9998e, 36, (InterfaceC5372e) interfaceC3477eArr[36].getValue(), list);
                    i3 |= 16;
                    Unit unit342 = Unit.INSTANCE;
                    str = str3;
                    i2 = i6;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    str2 = str5;
                    bool2 = (Boolean) metrica.inmobi(interfaceC9998e, 37, C6266e.ad, bool2);
                    i3 |= 32;
                    Unit unit3422 = Unit.INSTANCE;
                    str = str3;
                    i2 = i6;
                    str5 = str2;
                    str3 = str;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    str2 = str5;
                    str4 = (String) metrica.inmobi(interfaceC9998e, 38, C9582e.ad, str4);
                    i3 |= 64;
                    Unit unit34222 = Unit.INSTANCE;
                    str = str3;
                    i2 = i6;
                    str5 = str2;
                    str3 = str;
                default:
                    throw new C0413e(yandex);
            }
        }
        C4742e c4742e4 = c4742e3;
        String str17 = str5;
        C5655e c5655e3 = c5655e;
        metrica.vip(interfaceC9998e);
        String str18 = str4;
        return new C18422e(i2, i3, str6, i4, c5655e3, str7, i5, str8, bool8, bool9, bool10, str9, str10, num, num2, bool11, enumC10609e, enumC6664e, c5442e, num3, num4, enumC2057e, enumC14925e, enumC13802e, list2, list3, str11, num5, str17, c9432e, c4742e4, str3, bool3, bool5, bool4, bool6, bool7, bool, list, bool2, str18);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
