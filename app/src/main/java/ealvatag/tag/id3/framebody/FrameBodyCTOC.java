package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyCTOC extends AbstractID3v2FrameBody implements ID3v2ChapterFrameBody, ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyCTOC() {
    }

    public FrameBodyCTOC(FrameBodyCTOC frameBodyCTOC) {
        super(frameBodyCTOC);
    }

    public FrameBodyCTOC(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyCTOC(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "CTOC";
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }
}
