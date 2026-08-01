package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import defpackage.EnumC3587e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.Pair;
import ealvatag.tag.datatype.PairedTextEncodedStringNullTerminated;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTIPL extends AbstractFrameBodyPairs implements ID3v24FrameBody {
    public static final String ARRANGER;
    public static final String DJMIXER;
    public static final String ENGINEER;
    public static final String MIXER;
    public static final String PRODUCER;

    static {
        HashMap hashMap = EnumC3587e.f8109e;
        ENGINEER = "engineer";
        HashMap hashMap2 = EnumC3587e.f8109e;
        MIXER = "mix";
        HashMap hashMap3 = EnumC3587e.f8109e;
        DJMIXER = "DJ-mix";
        HashMap hashMap4 = EnumC3587e.f8109e;
        PRODUCER = "producer";
        HashMap hashMap5 = EnumC3587e.f8109e;
        ARRANGER = "arranger";
    }

    public FrameBodyTIPL() {
    }

    public FrameBodyTIPL(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTIPL(byte b, List<Pair> list) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        PairedTextEncodedStringNullTerminated.ValuePairs valuePairs = new PairedTextEncodedStringNullTerminated.ValuePairs();
        Iterator<Pair> it = list.iterator();
        while (it.hasNext()) {
            valuePairs.add(it.next());
        }
        setObjectValue(DataTypes.OBJ_TEXT, valuePairs);
    }

    public FrameBodyTIPL(FrameBodyIPLS frameBodyIPLS) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyIPLS.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyIPLS.getPairing());
    }

    public FrameBodyTIPL(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTIPL(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyPairs, ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TIPL";
    }
}
