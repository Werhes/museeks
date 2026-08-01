package defpackage;

import ealvatag.tag.id3.framebody.FrameBodyCOMM;
import ealvatag.tag.id3.framebody.FrameBodyTXXX;
import ealvatag.tag.id3.framebody.FrameBodyUFID;
import ealvatag.tag.id3.framebody.FrameBodyWXXX;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۤٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC5247e {
    f11180e("TXXX", FrameBodyTXXX.ACOUSTID_FINGERPRINT),
    f11259e("TXXX", FrameBodyTXXX.ACOUSTID_ID),
    ALBUM("TALB"),
    ALBUM_ARTIST("TPE2"),
    ALBUM_ARTIST_SORT("TSO2"),
    f11228e("TXXX", FrameBodyTXXX.ALBUM_ARTISTS),
    f11272e("TXXX", FrameBodyTXXX.ALBUM_ARTISTS_SORT),
    ALBUM_SORT("TSOA"),
    f11242e("TXXX", FrameBodyTXXX.AMAZON_ASIN),
    f11176e("TIPL", "arranger"),
    f11172e("TXXX", FrameBodyTXXX.ARRANGER_SORT),
    ARTIST("TPE1"),
    f11214e("TXXX", FrameBodyTXXX.ARTISTS),
    f11218e("TXXX", FrameBodyTXXX.ARTISTS_SORT),
    ARTIST_SORT("TSOP"),
    f11199e("TXXX", FrameBodyTXXX.BARCODE),
    BPM("TBPM"),
    f11304e("TXXX", FrameBodyTXXX.CATALOG_NO),
    f11184e("TXXX", FrameBodyTXXX.CHOIR),
    f11248e("TXXX", FrameBodyTXXX.CHOIR_SORT),
    f11270e("TXXX", FrameBodyTXXX.CLASSICAL_CATALOG),
    f11280e("TXXX", FrameBodyTXXX.CLASSICAL_NICKNAME),
    COMMENT("COMM"),
    COMPOSER("TCOM"),
    COMPOSER_SORT("TSOC"),
    CONDUCTOR("TPE3"),
    f11225e("TXXX", FrameBodyTXXX.CONDUCTOR_SORT),
    f11209e("TXXX", FrameBodyTXXX.COUNTRY),
    COVER_ART("APIC"),
    f11207e("COMM", FrameBodyCOMM.MM_CUSTOM1),
    f11258e("COMM", FrameBodyCOMM.MM_CUSTOM2),
    f11253e("COMM", FrameBodyCOMM.MM_CUSTOM3),
    f11217e("COMM", FrameBodyCOMM.MM_CUSTOM4),
    f11286e("COMM", FrameBodyCOMM.MM_CUSTOM5),
    DISC_NO("TPOS"),
    DISC_SUBTITLE("TSST"),
    DISC_TOTAL("TPOS"),
    f11202e("TIPL", "DJ-mix"),
    ENCODER("TENC"),
    f11212e("TIPL", "engineer"),
    f11293e("TXXX", FrameBodyTXXX.ENSEMBLE),
    f11266e("TXXX", FrameBodyTXXX.ENSEMBLE_SORT),
    f11275e("TXXX", FrameBodyTXXX.FBPM),
    GENRE("TCON"),
    GROUPING("TIT1"),
    INVOLVED_PERSON("TIPL"),
    ISRC("TSRC"),
    f11288e("TXXX", FrameBodyTXXX.IS_CLASSICAL),
    IS_COMPILATION("TCMP"),
    f11285e("TXXX", FrameBodyTXXX.IS_SOUNDTRACK),
    ITUNES_GROUPING("GRP1"),
    KEY("TKEY"),
    LANGUAGE("TLAN"),
    LYRICIST("TEXT"),
    LYRICS("USLT"),
    MEDIA("TMED"),
    f11195e("TIPL", "mix"),
    MOOD("TMOO"),
    f11221e("TXXX", FrameBodyTXXX.MOOD_ACOUSTIC),
    f11262e("TXXX", FrameBodyTXXX.MOOD_AGGRESSIVE),
    f11303e("TXXX", FrameBodyTXXX.MOOD_AROUSAL),
    f11198e("TXXX", FrameBodyTXXX.MOOD_DANCEABILITY),
    f11186e("TXXX", FrameBodyTXXX.MOOD_ELECTRONIC),
    f11231e("TXXX", FrameBodyTXXX.MOOD_HAPPY),
    f11192e("TXXX", FrameBodyTXXX.MOOD_INSTRUMENTAL),
    f11256e("TXXX", FrameBodyTXXX.MOOD_PARTY),
    f11193e("TXXX", FrameBodyTXXX.MOOD_RELAXED),
    f11281e("TXXX", FrameBodyTXXX.MOOD_SAD),
    f11170e("TXXX", FrameBodyTXXX.MOOD_VALENCE),
    MOVEMENT("MVNM"),
    MOVEMENT_NO("MVIN"),
    MOVEMENT_TOTAL("MVIN"),
    f11260e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ARTISTID),
    f11310e("TXXX", FrameBodyTXXX.MUSICBRAINZ_DISCID),
    f11241e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ORIGINAL_ALBUMID),
    f11249e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_ARTISTID),
    f11283e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUMID),
    f11165e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_COUNTRY),
    f11178e("TXXX", FrameBodyTXXX.MUSICBRAINZ_RELEASE_GROUPID),
    f11210e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_STATUS),
    f11171e("TXXX", FrameBodyTXXX.MUSICBRAINZ_RELEASE_TRACKID),
    f11263e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_TYPE),
    f11226e("UFID", FrameBodyUFID.UFID_MUSICBRAINZ),
    f11282e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION_ID),
    f11306e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORKID),
    f11190e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_ID),
    f11201e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_ID),
    f11284e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_ID),
    f11312e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_ID),
    f11257e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_ID),
    f11205e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_ID),
    f11232e("TXXX", FrameBodyTXXX.MUSICIP_ID),
    f11223e("COMM", FrameBodyCOMM.MM_OCCASION),
    f11215e("TXXX", FrameBodyTXXX.OPUS),
    f11197e("TXXX", FrameBodyTXXX.ORCHESTRA),
    f11287e("TXXX", FrameBodyTXXX.ORCHESTRA_SORT),
    ORIGINAL_ALBUM("TOAL"),
    ORIGINAL_ARTIST("TOPE"),
    ORIGINAL_LYRICIST("TOLY"),
    ORIGINAL_YEAR("TDOR"),
    f11246e("TXXX", FrameBodyTXXX.PART),
    f11227e("TXXX", FrameBodyTXXX.PART_NUMBER),
    f11200e("TXXX", FrameBodyTXXX.PART_TYPE),
    PERFORMER("TMCL"),
    f11314e("TXXX", FrameBodyTXXX.PERFORMER_NAME),
    f11216e("TXXX", FrameBodyTXXX.PERFORMER_NAME_SORT),
    f11307e("TXXX", FrameBodyTXXX.PERIOD),
    f11290e("TIPL", "producer"),
    f11191e("COMM", FrameBodyCOMM.MM_QUALITY),
    f11252e("TXXX", FrameBodyTXXX.RANKING),
    RATING("POPM"),
    RECORD_LABEL("TPUB"),
    REMIXER("TPE4"),
    f11305e("TXXX", FrameBodyTXXX.SCRIPT),
    f11261e("TXXX", FrameBodyTXXX.SINGLE_DISC_TRACK_NO),
    SUBTITLE("TIT3"),
    f11166e("TXXX", FrameBodyTXXX.TAGS),
    f11224e("COMM", FrameBodyCOMM.MM_TEMPO),
    f11229e("TXXX", FrameBodyTXXX.TIMBRE),
    TITLE("TIT2"),
    f11177e("TXXX", FrameBodyTXXX.TITLE_MOVEMENT),
    f11273e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK),
    TITLE_SORT("TSOT"),
    f11298e("TXXX", FrameBodyTXXX.TONALITY),
    TRACK("TRCK"),
    TRACK_TOTAL("TRCK"),
    f11234e("WXXX", FrameBodyWXXX.URL_DISCOGS_ARTIST_SITE),
    f11196e("WXXX", FrameBodyWXXX.URL_DISCOGS_RELEASE_SITE),
    f11245e("WXXX", FrameBodyWXXX.URL_LYRICS_SITE),
    URL_OFFICIAL_ARTIST_SITE("WOAR"),
    f11189e("WXXX", FrameBodyWXXX.URL_OFFICIAL_RELEASE_SITE),
    f11269e("WXXX", FrameBodyWXXX.URL_WIKIPEDIA_ARTIST_SITE),
    f11206e("WXXX", FrameBodyWXXX.URL_WIKIPEDIA_RELEASE_SITE),
    f11271e("TXXX", FrameBodyTXXX.WORK),
    f11247e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION),
    f11235e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE),
    f11222e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1),
    f11238e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE),
    f11278e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2),
    f11292e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE),
    f11233e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3),
    f11276e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4),
    f11243e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE),
    f11173e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5),
    f11230e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE),
    f11194e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6),
    f11236e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE),
    f11279e("TXXX", FrameBodyTXXX.WORK_TYPE),
    YEAR("TDRC");


    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f11315e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f11316e;

    static {
        HashMap hashMap = EnumC3587e.f8109e;
        HashMap hashMap2 = EnumC3587e.f8109e;
        HashMap hashMap3 = EnumC3587e.f8109e;
        HashMap hashMap4 = EnumC3587e.f8109e;
        HashMap hashMap5 = EnumC3587e.f8109e;
    }

    EnumC5247e(String str, String str2) {
        this.f11316e = str;
        this.f11315e = str2;
        StringBuilder sb = AbstractC10509e.ad;
        sb.setLength(0);
        sb.append(str);
        sb.append(':');
        sb.append(str2);
        AbstractC2301e.subscription(sb.length() <= 48);
    }

    EnumC5247e(String str) {
        this.f11316e = str;
    }
}
