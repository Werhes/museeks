package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyUFID extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public static final String UFID_ID3TEST = "http://www.id3.com/dummy/ufid.html";
    public static final String UFID_MUSICBRAINZ = "http://musicbrainz.com";

    public FrameBodyUFID() {
        setOwner(BuildConfig.FLAVOR);
        setUniqueIdentifier(new byte[0]);
    }

    public FrameBodyUFID(FrameBodyUFID frameBodyUFID) {
        super(frameBodyUFID);
    }

    public FrameBodyUFID(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyUFID(String str, byte[] bArr) {
        setOwner(str);
        setUniqueIdentifier(bArr);
    }

    public FrameBodyUFID(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "UFID";
    }

    public String getOwner() {
        return (String) getObjectValue(DataTypes.OBJ_OWNER);
    }

    public byte[] getUniqueIdentifier() {
        return (byte[]) getObjectValue(DataTypes.OBJ_DATA);
    }

    public void setOwner(String str) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
    }

    public void setUniqueIdentifier(byte[] bArr) {
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new StringNullTerminated(DataTypes.OBJ_OWNER, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }
}
