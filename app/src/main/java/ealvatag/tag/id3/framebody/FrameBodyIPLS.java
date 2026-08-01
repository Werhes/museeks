package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.Pair;
import ealvatag.tag.datatype.PairedTextEncodedStringNullTerminated;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyIPLS extends AbstractFrameBodyPairs implements ID3v23FrameBody {
    public FrameBodyIPLS() {
    }

    public FrameBodyIPLS(byte b, String str) {
        super(b, str);
    }

    public FrameBodyIPLS(byte b, List<Pair> list) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        PairedTextEncodedStringNullTerminated.ValuePairs valuePairs = new PairedTextEncodedStringNullTerminated.ValuePairs();
        Iterator<Pair> it = list.iterator();
        while (it.hasNext()) {
            valuePairs.add(it.next());
        }
        setObjectValue(DataTypes.OBJ_TEXT, valuePairs);
    }

    public FrameBodyIPLS(FrameBodyIPLS frameBodyIPLS) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyIPLS.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyIPLS.getPairing());
    }

    public FrameBodyIPLS(FrameBodyTIPL frameBodyTIPL) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyTIPL.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyTIPL.getPairing());
    }

    public FrameBodyIPLS(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyIPLS(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyPairs, ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "IPLS";
    }
}
