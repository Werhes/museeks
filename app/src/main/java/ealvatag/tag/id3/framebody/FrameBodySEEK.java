package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodySEEK extends AbstractID3v2FrameBody implements ID3v24FrameBody {
    public FrameBodySEEK() {
    }

    public FrameBodySEEK(int i) {
        setObjectValue(DataTypes.OBJ_OFFSET, Integer.valueOf(i));
    }

    public FrameBodySEEK(FrameBodySEEK frameBodySEEK) {
        super(frameBodySEEK);
    }

    public FrameBodySEEK(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodySEEK(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "SEEK";
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberFixedLength(DataTypes.OBJ_OFFSET, this, 4));
    }
}
