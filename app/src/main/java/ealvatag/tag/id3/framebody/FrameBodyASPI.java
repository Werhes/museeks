package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.NumberFixedLength;
import ealvatag.tag.datatype.NumberVariableLength;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyASPI extends AbstractID3v2FrameBody implements ID3v24FrameBody {
    private static final String BITS_PER_INDEX_POINT = "BitsPerIndexPoint";
    private static final int BITS_PER_INDEX_POINTS_FIELD_SIZE = 1;
    private static final int DATA_LENGTH_FIELD_SIZE = 4;
    private static final int DATA_START_FIELD_SIZE = 4;
    private static final String FRACTION_AT_INDEX = "FractionAtIndex";
    private static final int FRACTION_AT_INDEX_MINIMUM_FIELD_SIZE = 1;
    private static final String INDEXED_DATA_LENGTH = "IndexedDataLength";
    private static final String INDEXED_DATA_START = "IndexedDataStart";
    private static final int NO_OF_INDEX_POINTS_FIELD_SIZE = 2;
    private static final String NUMBER_OF_INDEX_POINTS = "NumberOfIndexPoints";

    public FrameBodyASPI() {
    }

    public FrameBodyASPI(FrameBodyASPI frameBodyASPI) {
        super(frameBodyASPI);
    }

    public FrameBodyASPI(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyASPI(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "ASPI";
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberFixedLength(INDEXED_DATA_START, this, 4));
        addDataType(new NumberFixedLength(INDEXED_DATA_LENGTH, this, 4));
        addDataType(new NumberFixedLength(NUMBER_OF_INDEX_POINTS, this, 2));
        addDataType(new NumberFixedLength(BITS_PER_INDEX_POINT, this, 1));
        addDataType(new NumberVariableLength(FRACTION_AT_INDEX, this, 1));
    }
}
