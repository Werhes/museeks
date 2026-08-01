package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringHashMap;
import ealvatag.tag.datatype.StringSizeTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyUSER extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyUSER() {
    }

    public FrameBodyUSER(byte b, String str, String str2) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_LANGUAGE, str);
        setObjectValue(DataTypes.OBJ_TEXT, str2);
    }

    public FrameBodyUSER(FrameBodyUSER frameBodyUSER) {
        super(frameBodyUSER);
    }

    public FrameBodyUSER(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyUSER(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "USER";
    }

    public String getLanguage() {
        return (String) getObjectValue(DataTypes.OBJ_LANGUAGE);
    }

    public void setOwner(String str) {
        setObjectValue(DataTypes.OBJ_LANGUAGE, str);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringHashMap(DataTypes.OBJ_LANGUAGE, this, 3));
        addDataType(new StringSizeTerminated(DataTypes.OBJ_TEXT, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        if (!((AbstractString) getObject(DataTypes.OBJ_TEXT)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        super.write(byteArrayOutputStream);
    }
}
