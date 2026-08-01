package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyEncrypted extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    private String identifier;

    public FrameBodyEncrypted(FrameBodyEncrypted frameBodyEncrypted) {
        super(frameBodyEncrypted);
        this.identifier = null;
    }

    public FrameBodyEncrypted(String str) {
        this.identifier = str;
    }

    public FrameBodyEncrypted(String str, C16151e c16151e, int i) {
        super(c16151e, i);
        this.identifier = str;
    }

    public FrameBodyEncrypted(String str, ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
        this.identifier = str;
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }
}
