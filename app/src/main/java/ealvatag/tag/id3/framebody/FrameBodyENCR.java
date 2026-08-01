package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyENCR extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyENCR() {
        setObjectValue(DataTypes.OBJ_OWNER, BuildConfig.FLAVOR);
        setObjectValue(DataTypes.OBJ_METHOD_SYMBOL, (byte) 0);
        setObjectValue(DataTypes.OBJ_ENCRYPTION_INFO, new byte[0]);
    }

    public FrameBodyENCR(FrameBodyENCR frameBodyENCR) {
        super(frameBodyENCR);
    }

    public FrameBodyENCR(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyENCR(String str, byte b, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
        setObjectValue(DataTypes.OBJ_METHOD_SYMBOL, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_ENCRYPTION_INFO, bArr);
    }

    public FrameBodyENCR(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "ENCR";
    }

    public String getOwner() {
        return (String) getObjectValue(DataTypes.OBJ_OWNER);
    }

    public void setOwner(String str) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new StringNullTerminated(DataTypes.OBJ_OWNER, this));
        addDataType(new NumberFixedLength(DataTypes.OBJ_METHOD_SYMBOL, this, 1));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_ENCRYPTION_INFO, this));
    }
}
