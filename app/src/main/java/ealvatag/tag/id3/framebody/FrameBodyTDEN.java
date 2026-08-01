package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTDEN extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
    public FrameBodyTDEN() {
    }

    public FrameBodyTDEN(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTDEN(FrameBodyTDEN frameBodyTDEN) {
        super(frameBodyTDEN);
    }

    public FrameBodyTDEN(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTDEN(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TDEN";
    }
}
