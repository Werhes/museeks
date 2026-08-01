package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringNullTerminated;
import ealvatag.tag.datatype.TextEncodedStringNullTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyGEOB extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyGEOB() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_MIME_TYPE, BuildConfig.FLAVOR);
        setObjectValue(DataTypes.OBJ_FILENAME, BuildConfig.FLAVOR);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, BuildConfig.FLAVOR);
        setObjectValue(DataTypes.OBJ_DATA, new byte[0]);
    }

    public FrameBodyGEOB(byte b, String str, String str2, String str3, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_MIME_TYPE, str);
        setObjectValue(DataTypes.OBJ_FILENAME, str2);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str3);
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    public FrameBodyGEOB(FrameBodyGEOB frameBodyGEOB) {
        super(frameBodyGEOB);
    }

    public FrameBodyGEOB(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyGEOB(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public String getDescription() {
        return (String) getObjectValue(DataTypes.OBJ_DESCRIPTION);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "GEOB";
    }

    public void setDescription(String str) {
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringNullTerminated(DataTypes.OBJ_MIME_TYPE, this));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_FILENAME, this));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        if (!((AbstractString) getObject(DataTypes.OBJ_FILENAME)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        if (!((AbstractString) getObject(DataTypes.OBJ_DESCRIPTION)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        super.write(byteArrayOutputStream);
    }
}
