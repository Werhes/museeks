package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.BooleanByte;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyRBUF extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    private static int BUFFER_FIELD_SIZE = 3;
    private static int EMBED_FLAG_BIT_POSITION = 1;
    private static int OFFSET_FIELD_SIZE = 4;

    public FrameBodyRBUF() {
        setObjectValue(DataTypes.OBJ_BUFFER_SIZE, (byte) 0);
        setObjectValue(DataTypes.OBJ_EMBED_FLAG, Boolean.FALSE);
        setObjectValue(DataTypes.OBJ_OFFSET, (byte) 0);
    }

    public FrameBodyRBUF(byte b, boolean z, byte b2) {
        setObjectValue(DataTypes.OBJ_BUFFER_SIZE, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_EMBED_FLAG, Boolean.valueOf(z));
        setObjectValue(DataTypes.OBJ_OFFSET, Byte.valueOf(b2));
    }

    public FrameBodyRBUF(FrameBodyRBUF frameBodyRBUF) {
        super(frameBodyRBUF);
    }

    public FrameBodyRBUF(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyRBUF(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "RBUF";
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberFixedLength(DataTypes.OBJ_BUFFER_SIZE, this, BUFFER_FIELD_SIZE));
        addDataType(new BooleanByte(DataTypes.OBJ_EMBED_FLAG, this, (byte) EMBED_FLAG_BIT_POSITION));
        addDataType(new NumberFixedLength(DataTypes.OBJ_OFFSET, this, OFFSET_FIELD_SIZE));
    }
}
