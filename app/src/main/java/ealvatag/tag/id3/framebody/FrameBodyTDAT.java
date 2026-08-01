package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTDAT extends AbstractFrameBodyTextInfo implements ID3v23FrameBody {
    public static final int DATA_SIZE = 4;
    public static final int DAY_END = 2;
    public static final int DAY_START = 0;
    public static final int MONTH_END = 4;
    public static final int MONTH_START = 2;
    private boolean monthOnly;

    public FrameBodyTDAT() {
    }

    public FrameBodyTDAT(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTDAT(FrameBodyTDAT frameBodyTDAT) {
        super(frameBodyTDAT);
    }

    public FrameBodyTDAT(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTDAT(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TDAT";
    }

    public boolean isMonthOnly() {
        return this.monthOnly;
    }

    public void setMonthOnly(boolean z) {
        this.monthOnly = z;
    }
}
