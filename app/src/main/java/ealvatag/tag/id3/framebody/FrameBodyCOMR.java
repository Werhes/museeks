package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringDate;
import ealvatag.tag.datatype.StringNullTerminated;
import ealvatag.tag.datatype.TextEncodedStringNullTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyCOMR extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyCOMR() {
    }

    public FrameBodyCOMR(byte b, String str, String str2, String str3, byte b2, String str4, String str5, String str6, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_PRICE_STRING, str);
        setObjectValue(DataTypes.OBJ_VALID_UNTIL, str2);
        setObjectValue(DataTypes.OBJ_CONTACT_URL, str3);
        setObjectValue(DataTypes.OBJ_RECIEVED_AS, Byte.valueOf(b2));
        setObjectValue(DataTypes.OBJ_SELLER_NAME, str4);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str5);
        setObjectValue(DataTypes.OBJ_MIME_TYPE, str6);
        setObjectValue(DataTypes.OBJ_SELLER_LOGO, bArr);
    }

    public FrameBodyCOMR(FrameBodyCOMR frameBodyCOMR) {
        super(frameBodyCOMR);
    }

    public FrameBodyCOMR(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyCOMR(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "COMR";
    }

    public String getOwner() {
        return (String) getObjectValue(DataTypes.OBJ_OWNER);
    }

    public void getOwner(String str) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringNullTerminated(DataTypes.OBJ_PRICE_STRING, this));
        addDataType(new StringDate(DataTypes.OBJ_VALID_UNTIL, this));
        addDataType(new StringNullTerminated(DataTypes.OBJ_CONTACT_URL, this));
        addDataType(new NumberHashMap(DataTypes.OBJ_RECIEVED_AS, this, 1));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_SELLER_NAME, this));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new StringNullTerminated(DataTypes.OBJ_MIME_TYPE, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_SELLER_LOGO, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        if (!((AbstractString) getObject(DataTypes.OBJ_SELLER_NAME)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        if (!((AbstractString) getObject(DataTypes.OBJ_DESCRIPTION)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        super.write(byteArrayOutputStream);
    }
}
