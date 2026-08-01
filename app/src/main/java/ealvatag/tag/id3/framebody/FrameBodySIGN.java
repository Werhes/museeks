package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodySIGN extends AbstractID3v2FrameBody implements ID3v24FrameBody {
    public FrameBodySIGN() {
    }

    public FrameBodySIGN(byte b, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_GROUP_SYMBOL, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_SIGNATURE, bArr);
    }

    public FrameBodySIGN(FrameBodySIGN frameBodySIGN) {
        super(frameBodySIGN);
    }

    public FrameBodySIGN(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public byte getGroupSymbol() {
        if (getObjectValue(DataTypes.OBJ_GROUP_SYMBOL) != null) {
            return ((Byte) getObjectValue(DataTypes.OBJ_GROUP_SYMBOL)).byteValue();
        }
        return (byte) 0;
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "SIGN";
    }

    public byte[] getSignature() {
        return (byte[]) getObjectValue(DataTypes.OBJ_SIGNATURE);
    }

    public void setGroupSymbol(byte b) {
        setObjectValue(DataTypes.OBJ_GROUP_SYMBOL, Byte.valueOf(b));
    }

    public void setSignature(byte[] bArr) {
        setObjectValue(DataTypes.OBJ_SIGNATURE, bArr);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberFixedLength(DataTypes.OBJ_GROUP_SYMBOL, this, 1));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_SIGNATURE, this));
    }
}
