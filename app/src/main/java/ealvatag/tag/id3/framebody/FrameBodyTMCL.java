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
public class FrameBodyTMCL extends AbstractFrameBodyPairs implements ID3v24FrameBody {
    public FrameBodyTMCL() {
    }

    public FrameBodyTMCL(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTMCL(byte b, List<Pair> list) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        PairedTextEncodedStringNullTerminated.ValuePairs valuePairs = new PairedTextEncodedStringNullTerminated.ValuePairs();
        Iterator<Pair> it = list.iterator();
        while (it.hasNext()) {
            valuePairs.add(it.next());
        }
        setObjectValue(DataTypes.OBJ_TEXT, valuePairs);
    }

    public FrameBodyTMCL(FrameBodyIPLS frameBodyIPLS) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyIPLS.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyIPLS.getPairing());
    }

    public FrameBodyTMCL(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTMCL(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyPairs, ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TMCL";
    }
}
