package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTPOS extends AbstractFrameBodyNumberTotal implements ID3v23FrameBody, ID3v24FrameBody {
    public FrameBodyTPOS() {
    }

    public FrameBodyTPOS(byte b, Integer num, Integer num2) {
        super(b, num, num2);
    }

    public FrameBodyTPOS(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTPOS(FrameBodyTPOS frameBodyTPOS) {
        super(frameBodyTPOS);
    }

    public FrameBodyTPOS(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTPOS(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public Integer getDiscNo() {
        return getNumber();
    }

    public String getDiscNoAsText() {
        return getNumberAsText();
    }

    public Integer getDiscTotal() {
        return getTotal();
    }

    public String getDiscTotalAsText() {
        return getTotalAsText();
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyNumberTotal, ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TPOS";
    }

    public void setDiscNo(Integer num) {
        setNumber(num);
    }

    public void setDiscNo(String str) {
        setNumber(str);
    }

    public void setDiscTotal(Integer num) {
        setTotal(num);
    }

    public void setDiscTotal(String str) {
        setTotal(str);
    }
}
