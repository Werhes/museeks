package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.StringFixedLength;
import ealvatag.tag.datatype.StringNullTerminated;
import ealvatag.tag.datatype.StringSizeTerminated;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyLINK extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyLINK() {
    }

    public FrameBodyLINK(FrameBodyLINK frameBodyLINK) {
        super(frameBodyLINK);
    }

    public FrameBodyLINK(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyLINK(String str, String str2, String str3) {
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
        setObjectValue(DataTypes.OBJ_URL, str2);
        setObjectValue(DataTypes.OBJ_ID, str3);
    }

    public FrameBodyLINK(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public String getAdditionalData() {
        return (String) getObjectValue(DataTypes.OBJ_ID);
    }

    public void getAdditionalData(String str) {
        setObjectValue(DataTypes.OBJ_ID, str);
    }

    public String getFrameIdentifier() {
        return (String) getObjectValue(DataTypes.OBJ_DESCRIPTION);
    }

    public void getFrameIdentifier(String str) {
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "LINK";
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new StringFixedLength(DataTypes.OBJ_DESCRIPTION, this, 4));
        addDataType(new StringNullTerminated(DataTypes.OBJ_URL, this));
        addDataType(new StringSizeTerminated(DataTypes.OBJ_ID, this));
    }
}
