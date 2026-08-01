package defpackage;

import ealvatag.tag.id3.framebody.FrameBodyCOMM;
import ealvatag.tag.id3.framebody.FrameBodyTXXX;
import ealvatag.tag.id3.framebody.FrameBodyUFID;
import ealvatag.tag.id3.framebody.FrameBodyWXXX;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC2372e {
    f5953e("TXXX", FrameBodyTXXX.ACOUSTID_FINGERPRINT),
    f6032e("TXXX", FrameBodyTXXX.ACOUSTID_ID),
    ALBUM("TALB"),
    ALBUM_ARTIST("TPE2"),
    ALBUM_ARTIST_SORT("TSO2"),
    f6001e("TXXX", FrameBodyTXXX.ALBUM_ARTISTS),
    f6045e("TXXX", FrameBodyTXXX.ALBUM_ARTISTS_SORT),
    ALBUM_SORT("TSOA"),
    f6015e("TXXX", FrameBodyTXXX.AMAZON_ASIN),
    f5949e("IPLS", "arranger"),
    f5945e("TXXX", FrameBodyTXXX.ARRANGER_SORT),
    ARTIST("TPE1"),
    f5987e("TXXX", FrameBodyTXXX.ARTISTS),
    f5991e("TXXX", FrameBodyTXXX.ARTISTS_SORT),
    ARTIST_SORT("TSOP"),
    f5972e("TXXX", FrameBodyTXXX.BARCODE),
    BPM("TBPM"),
    f6077e("TXXX", FrameBodyTXXX.CATALOG_NO),
    f5957e("TXXX", FrameBodyTXXX.CHOIR),
    f6021e("TXXX", FrameBodyTXXX.CHOIR_SORT),
    f6043e("TXXX", FrameBodyTXXX.CLASSICAL_CATALOG),
    f6053e("TXXX", FrameBodyTXXX.CLASSICAL_NICKNAME),
    COMMENT("COMM"),
    COMPOSER("TCOM"),
    COMPOSER_SORT("TSOC"),
    CONDUCTOR("TPE3"),
    f5998e("TXXX", FrameBodyTXXX.CONDUCTOR_SORT),
    f5982e("TXXX", FrameBodyTXXX.COUNTRY),
    COVER_ART("APIC"),
    f5980e("COMM", FrameBodyCOMM.MM_CUSTOM1),
    f6031e("COMM", FrameBodyCOMM.MM_CUSTOM2),
    f6026e("COMM", FrameBodyCOMM.MM_CUSTOM3),
    f5990e("COMM", FrameBodyCOMM.MM_CUSTOM4),
    f6059e("COMM", FrameBodyCOMM.MM_CUSTOM5),
    DISC_NO("TPOS"),
    DISC_SUBTITLE("TSST"),
    DISC_TOTAL("TPOS"),
    f5975e("IPLS", "DJ-mix"),
    ENCODER("TENC"),
    f5985e("IPLS", "engineer"),
    f6066e("TXXX", FrameBodyTXXX.ENSEMBLE),
    f6039e("TXXX", FrameBodyTXXX.ENSEMBLE_SORT),
    f6048e("TXXX", FrameBodyTXXX.FBPM),
    GENRE("TCON"),
    GROUPING("TIT1"),
    INVOLVED_PERSON("IPLS"),
    ISRC("TSRC"),
    f6061e("TXXX", FrameBodyTXXX.IS_CLASSICAL),
    IS_COMPILATION("TCMP"),
    f6058e("TXXX", FrameBodyTXXX.IS_SOUNDTRACK),
    ITUNES_GROUPING("GRP1"),
    KEY("TKEY"),
    LANGUAGE("TLAN"),
    LYRICIST("TEXT"),
    LYRICS("USLT"),
    MEDIA("TMED"),
    f5968e("IPLS", "mix"),
    f6047e("TXXX", FrameBodyTXXX.MOOD),
    f5994e("TXXX", FrameBodyTXXX.MOOD_ACOUSTIC),
    f6035e("TXXX", FrameBodyTXXX.MOOD_AGGRESSIVE),
    f6076e("TXXX", FrameBodyTXXX.MOOD_AROUSAL),
    f5971e("TXXX", FrameBodyTXXX.MOOD_DANCEABILITY),
    f5959e("TXXX", FrameBodyTXXX.MOOD_ELECTRONIC),
    f6004e("TXXX", FrameBodyTXXX.MOOD_HAPPY),
    f5965e("TXXX", FrameBodyTXXX.MOOD_INSTRUMENTAL),
    f6029e("TXXX", FrameBodyTXXX.MOOD_PARTY),
    f5966e("TXXX", FrameBodyTXXX.MOOD_RELAXED),
    f6054e("TXXX", FrameBodyTXXX.MOOD_SAD),
    f5943e("TXXX", FrameBodyTXXX.MOOD_VALENCE),
    MOVEMENT("MVNM"),
    MOVEMENT_NO("MVIN"),
    MOVEMENT_TOTAL("MVIN"),
    f6033e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ARTISTID),
    f6083e("TXXX", FrameBodyTXXX.MUSICBRAINZ_DISCID),
    f6014e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ORIGINAL_ALBUMID),
    f6022e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_ARTISTID),
    f6056e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUMID),
    f5938e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_COUNTRY),
    f5951e("TXXX", FrameBodyTXXX.MUSICBRAINZ_RELEASE_GROUPID),
    f5983e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_STATUS),
    f5944e("TXXX", FrameBodyTXXX.MUSICBRAINZ_RELEASE_TRACKID),
    f6036e("TXXX", FrameBodyTXXX.MUSICBRAINZ_ALBUM_TYPE),
    f5999e("UFID", FrameBodyUFID.UFID_MUSICBRAINZ),
    f6055e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION),
    f6079e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_COMPOSITION_ID),
    f5963e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORKID),
    f5974e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_ID),
    f6057e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_ID),
    f6085e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_ID),
    f6030e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_ID),
    f5978e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_ID),
    f6005e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_ID),
    f5996e("TXXX", FrameBodyTXXX.MUSICIP_ID),
    f5988e("COMM", FrameBodyCOMM.MM_OCCASION),
    f5970e("TXXX", FrameBodyTXXX.OPUS),
    f6060e("TXXX", FrameBodyTXXX.ORCHESTRA),
    f6070e("TXXX", FrameBodyTXXX.ORCHESTRA_SORT),
    ORIGINAL_ALBUM("TOAL"),
    ORIGINAL_ARTIST("TOPE"),
    ORIGINAL_LYRICIST("TOLY"),
    ORIGINAL_YEAR("TORY"),
    f6000e("TXXX", FrameBodyTXXX.PART),
    f5973e("TXXX", FrameBodyTXXX.PART_NUMBER),
    f5952e("TXXX", FrameBodyTXXX.PART_TYPE),
    PERFORMER("IPLS"),
    f5989e("TXXX", FrameBodyTXXX.PERFORMER_NAME),
    f6080e("TXXX", FrameBodyTXXX.PERFORMER_NAME_SORT),
    f6063e("TXXX", FrameBodyTXXX.PERIOD),
    f5964e("IPLS", "producer"),
    f6025e("COMM", FrameBodyCOMM.MM_QUALITY),
    f6037e("TXXX", FrameBodyTXXX.RANKING),
    RATING("POPM"),
    RECORD_LABEL("TPUB"),
    REMIXER("TPE4"),
    f6034e("TXXX", FrameBodyTXXX.SCRIPT),
    f6064e("TXXX", FrameBodyTXXX.SINGLE_DISC_TRACK_NO),
    SUBTITLE("TIT3"),
    f5997e("TXXX", FrameBodyTXXX.TAGS),
    f6002e("COMM", FrameBodyCOMM.MM_TEMPO),
    f6023e("TXXX", FrameBodyTXXX.TIMBRE),
    TITLE("TIT2"),
    f6046e("TXXX", FrameBodyTXXX.TITLE_MOVEMENT),
    f5977e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK),
    TITLE_SORT("TSOT"),
    f5984e("TXXX", FrameBodyTXXX.TONALITY),
    TRACK("TRCK"),
    TRACK_TOTAL("TRCK"),
    f5969e("WXXX", FrameBodyWXXX.URL_DISCOGS_ARTIST_SITE),
    f6018e("WXXX", FrameBodyWXXX.URL_DISCOGS_RELEASE_SITE),
    f6074e("WXXX", FrameBodyWXXX.URL_LYRICS_SITE),
    URL_OFFICIAL_ARTIST_SITE("WOAR"),
    f6042e("WXXX", FrameBodyWXXX.URL_OFFICIAL_RELEASE_SITE),
    f5979e("WXXX", FrameBodyWXXX.URL_WIKIPEDIA_ARTIST_SITE),
    f6044e("WXXX", FrameBodyWXXX.URL_WIKIPEDIA_RELEASE_SITE),
    f6020e("TXXX", FrameBodyTXXX.WORK),
    f6008e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1),
    f5995e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE),
    f6011e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2),
    f6051e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE),
    f6065e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3),
    f6006e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE),
    f6049e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4),
    f6016e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE),
    f5946e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5),
    f6003e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE),
    f5967e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6),
    f6009e("TXXX", FrameBodyTXXX.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE),
    f6052e("TXXX", FrameBodyTXXX.WORK_TYPE),
    YEAR("TYER");


    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f6088e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f6089e;

    static {
        HashMap hashMap = EnumC3587e.f8109e;
        HashMap hashMap2 = EnumC3587e.f8109e;
        HashMap hashMap3 = EnumC3587e.f8109e;
        HashMap hashMap4 = EnumC3587e.f8109e;
        HashMap hashMap5 = EnumC3587e.f8109e;
    }

    EnumC2372e(String str, String str2) {
        this.f6089e = str;
        this.f6088e = str2;
        StringBuilder sb = AbstractC10558e.ad;
        sb.setLength(0);
        sb.append(str);
        sb.append(':');
        sb.append(str2);
        AbstractC2301e.subscription(sb.length() <= 48);
    }

    EnumC2372e(String str) {
        this.f6089e = str;
    }
}
