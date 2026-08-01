package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyWPUB extends AbstractFrameBodyUrlLink implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyWPUB() {
    }

    public FrameBodyWPUB(FrameBodyWPUB frameBodyWPUB) {
        super(frameBodyWPUB);
    }

    public FrameBodyWPUB(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyWPUB(String str) {
        super(str);
    }

    public FrameBodyWPUB(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "WPUB";
    }
}
