package ealvatag.tag.id3.framebody;

import defpackage.AbstractC12042e;
import defpackage.C16151e;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringDate;
import ealvatag.tag.datatype.StringNullTerminated;
import ealvatag.tag.datatype.TextEncodedStringSizeTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyOWNE extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyOWNE() {
    }

    public FrameBodyOWNE(byte b, String str, String str2, String str3) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_PRICE_PAID, str);
        setObjectValue(DataTypes.OBJ_PURCHASE_DATE, str2);
        setObjectValue(DataTypes.OBJ_SELLER_NAME, str3);
    }

    public FrameBodyOWNE(FrameBodyOWNE frameBodyOWNE) {
        super(frameBodyOWNE);
    }

    public FrameBodyOWNE(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyOWNE(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "OWNE";
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringNullTerminated(DataTypes.OBJ_PRICE_PAID, this));
        addDataType(new StringDate(DataTypes.OBJ_PURCHASE_DATE, this));
        addDataType(new TextEncodedStringSizeTerminated(DataTypes.OBJ_SELLER_NAME, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        setTextEncoding(AbstractC12042e.ad(getHeader(), getTextEncoding()));
        if (!((AbstractString) getObject(DataTypes.OBJ_SELLER_NAME)).canBeEncoded()) {
            setTextEncoding(AbstractC12042e.vip(getHeader()));
        }
        super.write(byteArrayOutputStream);
    }
}
