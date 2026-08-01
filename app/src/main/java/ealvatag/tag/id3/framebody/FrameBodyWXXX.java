package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringSizeTerminated;
import ealvatag.tag.datatype.TextEncodedStringNullTerminated;
import ealvatag.tag.datatype.TextEncodedStringSizeTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyWXXX extends AbstractFrameBodyUrlLink implements ID3v24FrameBody, ID3v23FrameBody {
    public static final String URL_DISCOGS_ARTIST_SITE = "DISCOGS_ARTIST";
    public static final String URL_DISCOGS_RELEASE_SITE = "DISCOGS_RELEASE";
    public static final String URL_LYRICS_SITE = "LYRICS_SITE";
    public static final String URL_OFFICIAL_RELEASE_SITE = "OFFICIAL_RELEASE";
    public static final String URL_WIKIPEDIA_ARTIST_SITE = "WIKIPEDIA_ARTIST";
    public static final String URL_WIKIPEDIA_RELEASE_SITE = "WIKIPEDIA_RELEASE";

    public FrameBodyWXXX() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, BuildConfig.FLAVOR);
        setObjectValue(DataTypes.OBJ_URLLINK, BuildConfig.FLAVOR);
    }

    public FrameBodyWXXX(byte b, String str, String str2) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
        setObjectValue(DataTypes.OBJ_URLLINK, str2);
    }

    public FrameBodyWXXX(FrameBodyWXXX frameBodyWXXX) {
        super(frameBodyWXXX);
    }

    public FrameBodyWXXX(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyWXXX(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public void addUrlLink(String str) {
        ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_URLLINK)).addValue(str);
    }

    public String getDescription() {
        return (String) getObjectValue(DataTypes.OBJ_DESCRIPTION);
    }

    public String getFirstUrlLink() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_URLLINK)).getValueAtIndex(0);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "WXXX";
    }

    public String getUrlLinkAtIndex(int i) {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_URLLINK)).getValueAtIndex(i);
    }

    public String getUrlLinkWithoutTrailingNulls() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_URLLINK)).getValueWithoutTrailingNull();
    }

    public List<String> getUrlLinks() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_URLLINK)).getValues();
    }

    public void setDescription(String str) {
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyUrlLink, defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new StringSizeTerminated(DataTypes.OBJ_URLLINK, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyUrlLink, ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        if (!((AbstractString) getObject(DataTypes.OBJ_DESCRIPTION)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        super.write(byteArrayOutputStream);
    }
}
