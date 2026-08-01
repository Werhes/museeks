package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTMOO extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
    public FrameBodyTMOO() {
    }

    public FrameBodyTMOO(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTMOO(FrameBodyTMOO frameBodyTMOO) {
        super(frameBodyTMOO);
    }

    public FrameBodyTMOO(FrameBodyTXXX frameBodyTXXX) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyTXXX.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyTXXX.getText());
    }

    public FrameBodyTMOO(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTMOO(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TMOO";
    }
}
