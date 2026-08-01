package ealvatag.tag.id3.framebody;

import defpackage.AbstractC12042e;
import defpackage.AbstractC5542e;
import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.TextEncodedStringSizeTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public abstract class AbstractFrameBodyTextInfo extends AbstractID3v2FrameBody {
    public AbstractFrameBodyTextInfo() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, BuildConfig.FLAVOR);
    }

    public AbstractFrameBodyTextInfo(byte b, String str) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_TEXT, str);
    }

    public AbstractFrameBodyTextInfo(AbstractFrameBodyTextInfo abstractFrameBodyTextInfo) {
        super(abstractFrameBodyTextInfo);
    }

    public AbstractFrameBodyTextInfo(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public AbstractFrameBodyTextInfo(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public void addTextValue(String str) {
        ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).addValue(str);
    }

    public String getFirstTextValue() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getValueAtIndex(0);
    }

    public int getNumberOfValues() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getNumberOfValues();
    }

    public String getText() {
        return (String) getObjectValue(DataTypes.OBJ_TEXT);
    }

    public String getTextWithoutTrailingNulls() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getValueWithoutTrailingNull();
    }

    @Override // defpackage.AbstractC12444e
    public String getUserFriendlyValue() {
        return getTextWithoutTrailingNulls();
    }

    public String getValueAtIndex(int i) {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getValueAtIndex(i);
    }

    public List<String> getValues() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getValues();
    }

    public void setText(String str) {
        AbstractC5542e.metrica(str);
        setObjectValue(DataTypes.OBJ_TEXT, str);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new TextEncodedStringSizeTerminated(DataTypes.OBJ_TEXT, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        setTextEncoding(AbstractC12042e.ad(getHeader(), getTextEncoding()));
        if (!((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).canBeEncoded()) {
            setTextEncoding(AbstractC12042e.vip(getHeader()));
        }
        super.write(byteArrayOutputStream);
    }
}
