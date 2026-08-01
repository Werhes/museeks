package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberVariableLength;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyPCNT extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    private static final int COUNTER_MINIMUM_FIELD_SIZE = 4;

    public FrameBodyPCNT() {
        setObjectValue(DataTypes.OBJ_NUMBER, 0L);
    }

    public FrameBodyPCNT(long j) {
        setObjectValue(DataTypes.OBJ_NUMBER, Long.valueOf(j));
    }

    public FrameBodyPCNT(FrameBodyPCNT frameBodyPCNT) {
        super(frameBodyPCNT);
    }

    public FrameBodyPCNT(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyPCNT(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public long getCounter() {
        return ((Number) getObjectValue(DataTypes.OBJ_NUMBER)).longValue();
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "PCNT";
    }

    public void setCounter(long j) {
        setObjectValue(DataTypes.OBJ_NUMBER, Long.valueOf(j));
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberVariableLength(DataTypes.OBJ_NUMBER, this, 4));
    }
}
