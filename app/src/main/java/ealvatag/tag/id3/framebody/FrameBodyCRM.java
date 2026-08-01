package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyCRM extends AbstractID3v2FrameBody implements ID3v22FrameBody {
    public FrameBodyCRM() {
    }

    public FrameBodyCRM(FrameBodyCRM frameBodyCRM) {
        super(frameBodyCRM);
    }

    public FrameBodyCRM(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyCRM(String str, String str2, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str2);
        setObjectValue(DataTypes.OBJ_ENCRYPTED_DATABLOCK, bArr);
    }

    public FrameBodyCRM(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "CRM";
    }

    public String getOwner() {
        return (String) getObjectValue(DataTypes.OBJ_OWNER);
    }

    public void getOwner(String str) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new StringNullTerminated(DataTypes.OBJ_OWNER, this));
        addDataType(new StringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_ENCRYPTED_DATABLOCK, this));
    }
}
