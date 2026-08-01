package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyUnsupported extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody, ID3v22FrameBody {
    private String identifier;

    public FrameBodyUnsupported() {
        this.identifier = BuildConfig.FLAVOR;
    }

    public FrameBodyUnsupported(FrameBodyUnsupported frameBodyUnsupported) {
        super(frameBodyUnsupported);
        this.identifier = BuildConfig.FLAVOR;
        this.identifier = frameBodyUnsupported.identifier;
    }

    public FrameBodyUnsupported(C16151e c16151e, int i) {
        super(c16151e, i);
        this.identifier = BuildConfig.FLAVOR;
    }

    public FrameBodyUnsupported(String str) {
        this.identifier = str;
    }

    public FrameBodyUnsupported(String str, byte[] bArr) {
        this.identifier = str;
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    public FrameBodyUnsupported(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
        this.identifier = BuildConfig.FLAVOR;
    }

    public FrameBodyUnsupported(byte[] bArr) {
        this.identifier = BuildConfig.FLAVOR;
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody, defpackage.AbstractC12444e
    public boolean equals(Object obj) {
        return (obj instanceof FrameBodyUnsupported) && this.identifier.equals(((FrameBodyUnsupported) obj).identifier) && super.equals(obj);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }

    @Override // defpackage.AbstractC12444e
    public String toString() {
        return getIdentifier();
    }
}
