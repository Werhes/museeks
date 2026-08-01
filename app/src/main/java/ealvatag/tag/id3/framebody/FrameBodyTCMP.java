package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTCMP extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
    static String IS_COMPILATION = "1\u0000";

    public FrameBodyTCMP() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, IS_COMPILATION);
    }

    public FrameBodyTCMP(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTCMP(FrameBodyTCMP frameBodyTCMP) {
        super(frameBodyTCMP);
    }

    public FrameBodyTCMP(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTCMP(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TCMP";
    }

    public boolean isCompilation() {
        return getText().equals(IS_COMPILATION);
    }
}
