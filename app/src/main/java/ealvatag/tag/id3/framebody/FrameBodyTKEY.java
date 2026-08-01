package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import defpackage.EnumC5130e;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTKEY extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyTKEY() {
    }

    public FrameBodyTKEY(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTKEY(FrameBodyTKEY frameBodyTKEY) {
        super(frameBodyTKEY);
    }

    public FrameBodyTKEY(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTKEY(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TKEY";
    }

    public boolean isValid() {
        String firstTextValue = getFirstTextValue();
        EnumC5130e enumC5130e = EnumC5130e.FLAT;
        return firstTextValue != null && firstTextValue.length() <= 3 && firstTextValue.length() != 0 && ((firstTextValue.length() == 1 && firstTextValue.equals("o")) || (EnumC5130e.f10996e.containsKey(firstTextValue.substring(0, 1)) && ((!(firstTextValue.length() == 2 || firstTextValue.length() == 3) || EnumC5130e.f11001e.containsKey(firstTextValue.substring(1, 2))) && (firstTextValue.length() != 3 || firstTextValue.substring(2, 3).equals("m")))));
    }
}
