package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTSOT extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyTSOT() {
    }

    public FrameBodyTSOT(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTSOT(FrameBodyTSOT frameBodyTSOT) {
        super(frameBodyTSOT);
    }

    public FrameBodyTSOT(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTSOT(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TSOT";
    }
}
