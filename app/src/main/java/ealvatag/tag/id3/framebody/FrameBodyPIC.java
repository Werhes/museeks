package ealvatag.tag.id3.framebody;

import defpackage.AbstractC4141e;
import defpackage.AbstractC4639e;
import defpackage.C16151e;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringFixedLength;
import ealvatag.tag.datatype.StringNullTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyPIC extends AbstractArtworkFrameBody implements ID3v22FrameBody {
    public static final String IMAGE_IS_URL = "-->";

    public FrameBodyPIC() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
    }

    public FrameBodyPIC(byte b, String str, byte b2, String str2, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_IMAGE_FORMAT, str);
        setPictureType(b2);
        setDescription(str2);
        setImageData(bArr);
    }

    public FrameBodyPIC(FrameBodyAPIC frameBodyAPIC) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyAPIC.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_IMAGE_FORMAT, (String) AbstractC4141e.vip.get((String) frameBodyAPIC.getObjectValue(DataTypes.OBJ_MIME_TYPE)));
        setObjectValue(DataTypes.OBJ_PICTURE_DATA, frameBodyAPIC.getObjectValue(DataTypes.OBJ_PICTURE_DATA));
        setDescription(frameBodyAPIC.getDescription());
        setImageData(frameBodyAPIC.getImageData());
    }

    public FrameBodyPIC(FrameBodyPIC frameBodyPIC) {
        super(frameBodyPIC);
    }

    public FrameBodyPIC(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyPIC(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public String getDescription() {
        return (String) getObjectValue(DataTypes.OBJ_DESCRIPTION);
    }

    public String getFormatType() {
        return (String) getObjectValue(DataTypes.OBJ_IMAGE_FORMAT);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "PIC";
    }

    @Override // ealvatag.tag.id3.framebody.AbstractArtworkFrameBody
    public byte[] getImageData() {
        return (byte[]) getObjectValue(DataTypes.OBJ_PICTURE_DATA);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractArtworkFrameBody
    public String getImageUrl() {
        return isImageUrl() ? new String((byte[]) getObjectValue(DataTypes.OBJ_PICTURE_DATA), 0, ((byte[]) getObjectValue(DataTypes.OBJ_PICTURE_DATA)).length, AbstractC4639e.vip) : BuildConfig.FLAVOR;
    }

    @Override // ealvatag.tag.id3.framebody.AbstractArtworkFrameBody
    public String getMimeType() {
        return (String) AbstractC4141e.ad.get(getFormatType());
    }

    @Override // ealvatag.tag.id3.framebody.AbstractArtworkFrameBody
    public boolean isImageUrl() {
        return getFormatType() != null && getFormatType().equals("-->");
    }

    public void setDescription(String str) {
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
    }

    public void setImageData(byte[] bArr) {
        setObjectValue(DataTypes.OBJ_PICTURE_DATA, bArr);
    }

    public void setPictureType(byte b) {
        setObjectValue(DataTypes.OBJ_PICTURE_TYPE, Byte.valueOf(b));
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringFixedLength(DataTypes.OBJ_IMAGE_FORMAT, this, 3));
        addDataType(new NumberHashMap(DataTypes.OBJ_PICTURE_TYPE, this, 1));
        addDataType(new StringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_PICTURE_DATA, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        if (!((AbstractString) getObject(DataTypes.OBJ_DESCRIPTION)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        super.write(byteArrayOutputStream);
    }
}
