package defpackage;

import ealvatag.tag.id3.framebody.FrameBodyCOMM;
import ealvatag.tag.id3.framebody.FrameBodyTXXX;
import ealvatag.tag.id3.framebody.FrameBodyUFID;
import ealvatag.tag.id3.framebody.FrameBodyWXXX;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC10791e {
    f21261e("TXX", FrameBodyTXXX.ACOUSTID_FINGERPRINT),
    f21340e("TXX", FrameBodyTXXX.ACOUSTID_ID),
    ALBUM("TAL"),
    ALBUM_ARTIST("TP2"),
    ALBUM_ARTIST_SORT("TS2"),
    f21309e("TXX", FrameBodyTXXX.ALBUM_ARTISTS),
    f21353e("TXX", FrameBodyTXXX.ALBUM_ARTISTS_SORT),
    ALBUM_SORT("TSA"),
    f21323e("TXX", FrameBodyTXXX.AMAZON_ASIN),
    f21257e("IPL", "arranger"),
    f21253e("TXX", FrameBodyTXXX.ARRANGER_SORT),
    ARTIST("TP1"),
    f21295e("TXX", FrameBodyTXXX.ARTISTS),
    f21299e("TXX", FrameBodyTXXX.ARTISTS_SORT),
    ARTIST_SORT("TSP"),
    f21280e("TXX", FrameBodyTXXX.BARCODE),
    BPM("TBP"),
    f21385e("TXX", FrameBodyTXXX.CATALOG_NO),
    f21265e("TXX", FrameBodyTXXX.CHOIR),
    f21329e("TXX", FrameBodyTXXX.CHOIR_SORT),
    f21351e("TXX", FrameBodyTXXX.CLASSICAL_CATALOG),
    f21361e("TXX", FrameBodyTXXX.CLASSICAL_NICKNAME),
    COMMENT("COM"),
    COMPOSER("TCM"),
    COMPOSER_SORT("TSC"),
    CONDUCTOR("TPE"),
    f21306e("TXX", FrameBodyTXXX.CONDUCTOR_SORT),
    f21290e("TXX", FrameBodyTXXX.COUNTRY),
    COVER_ART("PIC"),
    f21288e("COM", FrameBodyCOMM.MM_CUSTOM1),
    f21339e("COM", FrameBodyCOMM.MM_CUSTOM2),
    f21334e("COM", FrameBodyCOMM.MM_CUSTOM3),
    f21298e("COM", FrameBodyCOMM.MM_CUSTOM4),
    f21367e("COM", FrameBodyCOMM.MM_CUSTOM5),
    DISC_NO("TPA"),
    DISC_SUBTITLE("TPS"),
    DISC_TOTAL("TPA"),
    f21283e("IPL", "DJ-mix"),
    ENCODER("TEN"),
    f21293e("IPL", "engineer"),
    f21374e("TXX", FrameBodyTXXX.ENSEMBLE),
    f21347e("TXX", FrameBodyTXXX.ENSEMBLE_SORT),
    f21356e("TXX", FrameBodyTXXX.FBPM),
    GENRE("TCO"),
    GROUPING("TT1"),
    f21300e("TXX", FrameBodyTXXX.MOOD_INSTRUMENTAL),
    INVOLVED_PERSON("IPL"),
    ISRC("TRC"),
    f21394e("TXX", FrameBodyTXXX.IS_CLASSICAL),
    IS_COMPILATION("TCP"),
    f21349e("TXX", FrameBodyTXXX.IS_SOUNDTRACK),
    ITUNES_GROUPING("GP1"),
    KEY("TKE"),
    LANGUAGE("TLA"),
    LYRICIST("TXT"),
    LYRICS("ULT"),
    MEDIA("TMT"),
    f21355e("IPL", "mix"),
    f21302e("TXX", FrameBodyTXXX.MOOD),
    f21343e("TXX", FrameBodyTXXX.MOOD_ACOUSTIC),
    f21384e("TXX", FrameBodyTXXX.MOOD_AGGRESSIVE),
    f21279e("TXX", FrameBodyTXXX.MOOD_AROUSAL),
    f21267e("TXX", FrameBodyTXXX.MOOD_DANCEABILITY),
    f21312e("TXX", FrameBodyTXXX.MOOD_ELECTRONIC),
    f21273e("TXX", FrameBodyTXXX.MOOD_HAPPY),
    f21337e("TXX", FrameBodyTXXX.MOOD_PARTY),
    f21274e("TXX", FrameBodyTXXX.MOOD_RELAXED),
    f21362e("TXX", FrameBodyTXXX.MOOD_SAD),
    f21251e("TXX", FrameBodyTXXX.MOOD_VALENCE),
    MOVEMENT("MVN"),
    MOVEMENT_NO("MVI"),
    MOVEMENT_TOTAL("MVI"),
    f21341e("TXX", FrameBodyTXXX.MUSICBRAINZ_ARTISTID),
    f21391e("TXX", FrameBodyTXXX.MUSICBRAINZ_DISCID),
    f21322e("TXX", FrameBodyTXXX.MUSICBRAINZ_ORIGINAL_ALBUMID),
    f21330e("TXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_ARTISTID),
    f21364e("TXX", FrameBodyTXXX.MUSICBRAINZ_ALBUMID),
    f21246e("TXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_COUNTRY),
    f21259e("TXX", FrameBodyTXXX.MUSICBRAINZ_RELEASE_GROUPID),
    f21291e("TXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_STATUS),
    f21252e("TXX", FrameBodyTXXX.MUSICBRAINZ_RELEASE_TRACKID),
    f21344e("TXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_TYPE),
    f21307e("UFI", FrameBodyUFID.UFID_MUSICBRAINZ),
    f21363e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION),
    f21387e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION_ID),
    f21271e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORKID),
    f21282e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_ID),
    f21365e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_ID),
    f21393e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_ID),
    f21338e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_ID),
    f21286e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_ID),
    f21313e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_ID),
    f21304e("TXX", FrameBodyTXXX.MUSICIP_ID),
    f21296e("COM", FrameBodyCOMM.MM_OCCASION),
    f21278e("TXX", FrameBodyTXXX.OPUS),
    f21368e("TXX", FrameBodyTXXX.ORCHESTRA),
    f21378e("TXX", FrameBodyTXXX.ORCHESTRA_SORT),
    ORIGINAL_ALBUM("TOT"),
    ORIGINAL_ARTIST("TOA"),
    ORIGINAL_LYRICIST("TOL"),
    ORIGINAL_YEAR("TOR"),
    f21308e("TXX", FrameBodyTXXX.PART),
    f21281e("TXX", FrameBodyTXXX.PART_NUMBER),
    f21260e("TXX", FrameBodyTXXX.PART_TYPE),
    PERFORMER("IPL"),
    f21297e("TXX", FrameBodyTXXX.PERFORMER_NAME),
    f21388e("TXX", FrameBodyTXXX.PERFORMER_NAME_SORT),
    f21371e("TXX", FrameBodyTXXX.PERIOD),
    f21272e("IPL", "producer"),
    f21333e("COM", FrameBodyCOMM.MM_QUALITY),
    f21345e("TXX", FrameBodyTXXX.RANKING),
    RATING("POP"),
    RECORD_LABEL("TPB"),
    REMIXER("TP4"),
    f21342e("TXX", FrameBodyTXXX.SCRIPT),
    f21372e("TXX", FrameBodyTXXX.SINGLE_DISC_TRACK_NO),
    SUBTITLE("TT3"),
    f21305e("TXX", FrameBodyTXXX.TAGS),
    f21310e("COM", FrameBodyCOMM.MM_TEMPO),
    f21331e("TXX", FrameBodyTXXX.TIMBRE),
    TITLE("TT2"),
    f21354e("TXX", FrameBodyTXXX.TITLE_MOVEMENT),
    f21285e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK),
    TITLE_SORT("TST"),
    f21292e("TXX", FrameBodyTXXX.TONALITY),
    TRACK("TRK"),
    TRACK_TOTAL("TRK"),
    f21277e("WXX", FrameBodyWXXX.URL_DISCOGS_ARTIST_SITE),
    f21326e("WXX", FrameBodyWXXX.URL_DISCOGS_RELEASE_SITE),
    f21382e("WXX", FrameBodyWXXX.URL_LYRICS_SITE),
    URL_OFFICIAL_ARTIST_SITE("WAR"),
    f21350e("WXX", FrameBodyWXXX.URL_OFFICIAL_RELEASE_SITE),
    f21287e("WXX", FrameBodyWXXX.URL_WIKIPEDIA_ARTIST_SITE),
    f21352e("WXX", FrameBodyWXXX.URL_WIKIPEDIA_RELEASE_SITE),
    f21328e("TXX", FrameBodyTXXX.WORK),
    f21316e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1),
    f21303e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE),
    f21319e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2),
    f21359e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE),
    f21373e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3),
    f21314e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE),
    f21357e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4),
    f21324e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE),
    f21254e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5),
    f21311e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE),
    f21275e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6),
    f21317e("TXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE),
    f21360e("TXX", FrameBodyTXXX.WORK_TYPE),
    YEAR("TYE");


    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f21396e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f21397e;

    static {
        HashMap hashMap = EnumC3587e.f8109e;
        HashMap hashMap2 = EnumC3587e.f8109e;
        HashMap hashMap3 = EnumC3587e.f8109e;
        HashMap hashMap4 = EnumC3587e.f8109e;
        HashMap hashMap5 = EnumC3587e.f8109e;
    }

    EnumC10791e(String str, String str2) {
        this.f21397e = str;
        this.f21396e = str2;
        StringBuilder sb = AbstractC7890e.ad;
        sb.setLength(0);
        sb.append(str);
        sb.append(':');
        sb.append(str2);
        AbstractC2301e.subscription(sb.length() <= 48);
    }

    EnumC10791e(String str) {
        this.f21397e = str;
    }
}
