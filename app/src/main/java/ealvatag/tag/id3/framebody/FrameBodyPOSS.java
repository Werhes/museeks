package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.NumberVariableLength;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyPOSS extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyPOSS() {
    }

    public FrameBodyPOSS(byte b, long j) {
        setObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_POSITION, Long.valueOf(j));
    }

    public FrameBodyPOSS(FrameBodyPOSS frameBodyPOSS) {
        super(frameBodyPOSS);
    }

    public FrameBodyPOSS(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyPOSS(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "POSS";
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TIME_STAMP_FORMAT, this, 1));
        addDataType(new NumberVariableLength(DataTypes.OBJ_POSITION, this, 1));
    }
}
