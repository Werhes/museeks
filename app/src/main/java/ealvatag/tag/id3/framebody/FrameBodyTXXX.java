package ealvatag.tag.id3.framebody;

import defpackage.AbstractC12042e;
import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.TextEncodedStringNullTerminated;
import ealvatag.tag.datatype.TextEncodedStringSizeTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTXXX extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
    public static final String ACOUSTID_FINGERPRINT = "Acoustid Fingerprint";
    public static final String ACOUSTID_ID = "Acoustid Id";
    public static final String ALBUM_ARTIST = "ALBUM ARTIST";
    public static final String ALBUM_ARTISTS = "ALBUM_ARTISTS";
    public static final String ALBUM_ARTISTS_SORT = "ALBUM_ARTISTS_SORT";
    public static final String AMAZON_ASIN = "ASIN";
    public static final String ARRANGER_SORT = "ARRANGER_SORT";
    public static final String ARTISTS = "ARTISTS";
    public static final String ARTISTS_SORT = "ARTISTS_SORT";
    public static final String BARCODE = "BARCODE";
    public static final String CATALOG_NO = "CATALOGNUMBER";
    public static final String CHOIR = "CHOIR";
    public static final String CHOIR_SORT = "CHOIR_SORT";
    public static final String CLASSICAL_CATALOG = "CLASSICAL_CATALOG";
    public static final String CLASSICAL_NICKNAME = "CLASSICAL_NICKNAME";
    public static final String CONDUCTOR_SORT = "CONDUCTOR_SORT";
    public static final String COUNTRY = "Country";
    public static final String ENSEMBLE = "ENSEMBLE";
    public static final String ENSEMBLE_SORT = "ENSEMBLE_SORT";
    public static final String FBPM = "FBPM";
    public static final String IS_CLASSICAL = "IS_CLASSICAL";
    public static final String IS_SOUNDTRACK = "IS_SOUNDTRACK";
    public static final String MOOD = "MOOD";
    public static final String MOOD_ACOUSTIC = "MOOD_ACOUSTIC";
    public static final String MOOD_AGGRESSIVE = "MOOD_AGGRESSIVE";
    public static final String MOOD_AROUSAL = "MOOD_AROUSAL";
    public static final String MOOD_DANCEABILITY = "MOOD_DANCEABILITY";
    public static final String MOOD_ELECTRONIC = "MOOD_ELECTRONIC";
    public static final String MOOD_HAPPY = "MOOD_HAPPY";
    public static final String MOOD_INSTRUMENTAL = "MOOD_INSTRUMENTAL";
    public static final String MOOD_PARTY = "MOOD_PARTY";
    public static final String MOOD_RELAXED = "MOOD_RELAXED";
    public static final String MOOD_SAD = "MOOD_SAD";
    public static final String MOOD_VALENCE = "MOOD_VALENCE";
    public static final String MUSICBRAINZ_ALBUMID = "MusicBrainz Album Id";
    public static final String MUSICBRAINZ_ALBUM_ARTISTID = "MusicBrainz Album Artist Id";
    public static final String MUSICBRAINZ_ALBUM_COUNTRY = "MusicBrainz Album Release Country";
    public static final String MUSICBRAINZ_ALBUM_STATUS = "MusicBrainz Album Status";
    public static final String MUSICBRAINZ_ALBUM_TYPE = "MusicBrainz Album Type";
    public static final String MUSICBRAINZ_ARTISTID = "MusicBrainz Artist Id";
    public static final String MUSICBRAINZ_DISCID = "MusicBrainz Disc Id";
    public static final String MUSICBRAINZ_ORIGINAL_ALBUMID = "MusicBrainz Original Album Id";
    public static final String MUSICBRAINZ_RELEASE_GROUPID = "MusicBrainz Release Group Id";
    public static final String MUSICBRAINZ_RELEASE_TRACKID = "MusicBrainz Release Track Id";
    public static final String MUSICBRAINZ_WORK = "MUSICBRAINZ_WORK";
    public static final String MUSICBRAINZ_WORKID = "MusicBrainz Work Id";
    public static final String MUSICBRAINZ_WORK_COMPOSITION = "MUSICBRAINZ_WORK_COMPOSITION";
    public static final String MUSICBRAINZ_WORK_COMPOSITION_ID = "MUSICBRAINZ_WORK_COMPOSITION_ID";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL1 = "MUSICBRAINZ_WORK_PART_LEVEL1";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL1_ID = "MUSICBRAINZ_WORK_PART_LEVEL1_ID";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL1_TYPE = "MUSICBRAINZ_WORK_PART_LEVEL1_TYPE";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL2 = "MUSICBRAINZ_WORK_PART_LEVEL2";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL2_ID = "MUSICBRAINZ_WORK_PART_LEVEL2_ID";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL2_TYPE = "MUSICBRAINZ_WORK_PART_LEVEL2_TYPE";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL3 = "MUSICBRAINZ_WORK_PART_LEVEL3";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL3_ID = "MUSICBRAINZ_WORK_PART_LEVEL3_ID";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL3_TYPE = "MUSICBRAINZ_WORK_PART_LEVEL3_TYPE";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL4 = "MUSICBRAINZ_WORK_PART_LEVEL4";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL4_ID = "MUSICBRAINZ_WORK_PART_LEVEL4_ID";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL4_TYPE = "MUSICBRAINZ_WORK_PART_LEVEL4_TYPE";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL5 = "MUSICBRAINZ_WORK_PART_LEVEL5";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL5_ID = "MUSICBRAINZ_WORK_PART_LEVEL5_ID";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL5_TYPE = "MUSICBRAINZ_WORK_PART_LEVEL5_TYPE";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL6 = "MUSICBRAINZ_WORK_PART_LEVEL6";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL6_ID = "MUSICBRAINZ_WORK_PART_LEVEL6_ID";
    public static final String MUSICBRAINZ_WORK_PART_LEVEL6_TYPE = "MUSICBRAINZ_WORK_PART_LEVEL6_TYPE";
    public static final String MUSICIP_ID = "MusicIP PUID";
    public static final String OPUS = "OPUS";
    public static final String ORCHESTRA = "ORCHESTRA";
    public static final String ORCHESTRA_SORT = "ORCHESTRA_SORT";
    public static final String PART = "PART";
    public static final String PART_NUMBER = "PARTNUMBER";
    public static final String PART_TYPE = "PART_TYPE";
    public static final String PERFORMER_NAME = "PERFORMER_NAME";
    public static final String PERFORMER_NAME_SORT = "PERFORMER_NAME_SORT";
    public static final String PERIOD = "PERIOD";
    public static final String RANKING = "RANKING";
    public static final String SCRIPT = "Script";
    public static final String SINGLE_DISC_TRACK_NO = "SINGLE_DISC_TRACK_NO";
    public static final String TAGS = "TAGS";
    public static final String TIMBRE = "TIMBRE_BRIGHTNESS";
    public static final String TITLE_MOVEMENT = "TITLE_MOVEMENT";
    public static final String TONALITY = "TONALITY";
    public static final String WORK = "WORK";
    public static final String WORK_TYPE = "WORK_TYPE";

    public FrameBodyTXXX() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, BuildConfig.FLAVOR);
        setObjectValue(DataTypes.OBJ_TEXT, BuildConfig.FLAVOR);
    }

    public FrameBodyTXXX(byte b, String str, String str2) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
        setObjectValue(DataTypes.OBJ_TEXT, str2);
    }

    public FrameBodyTXXX(FrameBodyTMOO frameBodyTMOO) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyTMOO.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, MOOD);
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyTMOO.getText());
    }

    public FrameBodyTXXX(FrameBodyTXXX frameBodyTXXX) {
        super(frameBodyTXXX);
    }

    public FrameBodyTXXX(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTXXX(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public String getDescription() {
        return (String) getObjectValue(DataTypes.OBJ_DESCRIPTION);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TXXX";
    }

    public void setDescription(String str) {
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyTextInfo, defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new TextEncodedStringSizeTerminated(DataTypes.OBJ_TEXT, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyTextInfo, ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        setTextEncoding(AbstractC12042e.ad(getHeader(), getTextEncoding()));
        if (!((TextEncodedStringNullTerminated) getObject(DataTypes.OBJ_DESCRIPTION)).canBeEncoded()) {
            setTextEncoding(AbstractC12042e.vip(getHeader()));
        }
        super.write(byteArrayOutputStream);
    }
}
