package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTORY extends AbstractFrameBodyTextInfo implements ID3v23FrameBody {
    private static final int NUMBER_OF_DIGITS_IN_YEAR = 4;

    public FrameBodyTORY() {
    }

    public FrameBodyTORY(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTORY(FrameBodyTDOR frameBodyTDOR) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyTDOR.getText().length() > 4 ? frameBodyTDOR.getText().substring(0, 4) : frameBodyTDOR.getText());
    }

    public FrameBodyTORY(FrameBodyTORY frameBodyTORY) {
        super(frameBodyTORY);
    }

    public FrameBodyTORY(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTORY(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TORY";
    }
}
