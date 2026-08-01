package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyPRIV extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyPRIV() {
        setObjectValue(DataTypes.OBJ_OWNER, BuildConfig.FLAVOR);
        setObjectValue(DataTypes.OBJ_DATA, new byte[0]);
    }

    public FrameBodyPRIV(FrameBodyPRIV frameBodyPRIV) {
        super(frameBodyPRIV);
    }

    public FrameBodyPRIV(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyPRIV(String str, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    public FrameBodyPRIV(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public byte[] getData() {
        return (byte[]) getObjectValue(DataTypes.OBJ_DATA);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "PRIV";
    }

    public String getOwner() {
        return (String) getObjectValue(DataTypes.OBJ_OWNER);
    }

    public void setData(byte[] bArr) {
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    public void setOwner(String str) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new StringNullTerminated(DataTypes.OBJ_OWNER, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }
}
