package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.PartOfSet;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTRCK extends AbstractFrameBodyNumberTotal implements ID3v23FrameBody, ID3v24FrameBody {
    public FrameBodyTRCK() {
    }

    public FrameBodyTRCK(byte b, Integer num, Integer num2) {
        super(b, num, num2);
    }

    public FrameBodyTRCK(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTRCK(FrameBodyTRCK frameBodyTRCK) {
        super(frameBodyTRCK);
    }

    public FrameBodyTRCK(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTRCK(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyNumberTotal, ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TRCK";
    }

    public Integer getTrackNo() {
        return getNumber();
    }

    public String getTrackNoAsText() {
        return getNumberAsText();
    }

    public Integer getTrackTotal() {
        return getTotal();
    }

    public String getTrackTotalAsText() {
        return getTotalAsText();
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyNumberTotal
    public void setText(String str) {
        setObjectValue(DataTypes.OBJ_TEXT, new PartOfSet.PartOfSetValue(str));
    }

    public void setTrackNo(Integer num) {
        setNumber(num);
    }

    public void setTrackNo(String str) {
        setNumber(str);
    }

    public void setTrackTotal(Integer num) {
        setTotal(num);
    }

    public void setTrackTotal(String str) {
        setTotal(str);
    }
}
