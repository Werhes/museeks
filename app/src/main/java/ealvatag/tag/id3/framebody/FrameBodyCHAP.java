package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyCHAP extends AbstractID3v2FrameBody implements ID3v2ChapterFrameBody, ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyCHAP() {
    }

    public FrameBodyCHAP(FrameBodyCHAP frameBodyCHAP) {
        super(frameBodyCHAP);
    }

    public FrameBodyCHAP(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyCHAP(String str, int i, int i2, int i3, int i4) {
        setObjectValue(DataTypes.OBJ_ELEMENT_ID, str);
        setObjectValue(DataTypes.OBJ_START_TIME, Integer.valueOf(i));
        setObjectValue(DataTypes.OBJ_END_TIME, Integer.valueOf(i2));
        setObjectValue(DataTypes.OBJ_START_OFFSET, Integer.valueOf(i3));
        setObjectValue(DataTypes.OBJ_END_OFFSET, Integer.valueOf(i4));
    }

    public FrameBodyCHAP(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "CHAP";
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new StringNullTerminated(DataTypes.OBJ_ELEMENT_ID, this));
        addDataType(new NumberFixedLength(DataTypes.OBJ_START_TIME, this, 4));
        addDataType(new NumberFixedLength(DataTypes.OBJ_END_TIME, this, 4));
        addDataType(new NumberFixedLength(DataTypes.OBJ_START_OFFSET, this, 4));
        addDataType(new NumberFixedLength(DataTypes.OBJ_END_OFFSET, this, 4));
    }
}
