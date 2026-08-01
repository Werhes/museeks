package ealvatag.tag.id3.framebody;

import defpackage.AbstractC4141e;
import defpackage.C12927e;
import defpackage.C16151e;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringNullTerminated;
import ealvatag.tag.datatype.TextEncodedStringNullTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyAPIC extends AbstractArtworkFrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public static final String IMAGE_IS_URL = "-->";

    public FrameBodyAPIC() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
    }

    public FrameBodyAPIC(byte b, String str, byte b2, String str2, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setMimeType(str);
        setPictureType(b2);
        setDescription(str2);
        setImageData(bArr);
    }

    public FrameBodyAPIC(FrameBodyAPIC frameBodyAPIC) {
        super(frameBodyAPIC);
    }

    public FrameBodyAPIC(FrameBodyPIC frameBodyPIC) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyPIC.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_MIME_TYPE, (String) AbstractC4141e.ad.get((String) frameBodyPIC.getObjectValue(DataTypes.OBJ_IMAGE_FORMAT)));
        setObjectValue(DataTypes.OBJ_PICTURE_TYPE, frameBodyPIC.getObjectValue(DataTypes.OBJ_PICTURE_TYPE));
        setObjectValue(DataTypes.OBJ_DESCRIPTION, frameBodyPIC.getDescription());
        setObjectValue(DataTypes.OBJ_PICTURE_DATA, frameBodyPIC.getObjectValue(DataTypes.OBJ_PICTURE_DATA));
    }

    public FrameBodyAPIC(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyAPIC(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public String getDescription() {
        return (String) getObjectValue(DataTypes.OBJ_DESCRIPTION);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "APIC";
    }

    @Override // ealvatag.tag.id3.framebody.AbstractArtworkFrameBody
    public byte[] getImageData() {
        return (byte[]) getObjectValue(DataTypes.OBJ_PICTURE_DATA);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractArtworkFrameBody
    public String getMimeType() {
        return (String) getObjectValue(DataTypes.OBJ_MIME_TYPE);
    }

    @Override // defpackage.AbstractC12444e
    public String getUserFriendlyValue() {
        if (getImageData() == null) {
            return getMimeType() + ":" + getDescription() + ":0";
        }
        return getMimeType() + ":" + getDescription() + ":" + getImageData().length;
    }

    @Override // ealvatag.tag.id3.framebody.AbstractArtworkFrameBody
    public boolean isImageUrl() {
        return getMimeType() != null && getMimeType().equals("-->");
    }

    public void setDescription(String str) {
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
    }

    public void setImageData(byte[] bArr) {
        setObjectValue(DataTypes.OBJ_PICTURE_DATA, bArr);
    }

    public void setMimeType(String str) {
        setObjectValue(DataTypes.OBJ_MIME_TYPE, str);
    }

    public void setPictureType(byte b) {
        setObjectValue(DataTypes.OBJ_PICTURE_TYPE, Byte.valueOf(b));
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringNullTerminated(DataTypes.OBJ_MIME_TYPE, this));
        addDataType(new NumberHashMap(DataTypes.OBJ_PICTURE_TYPE, this, 1));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_PICTURE_DATA, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        C12927e.license();
        if (!((AbstractString) getObject(DataTypes.OBJ_DESCRIPTION)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        super.write(byteArrayOutputStream);
    }
}
