package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.PartOfSet;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public abstract class AbstractFrameBodyNumberTotal extends AbstractID3v2FrameBody {
    public AbstractFrameBodyNumberTotal() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, new PartOfSet.PartOfSetValue());
    }

    public AbstractFrameBodyNumberTotal(byte b, Integer num, Integer num2) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_TEXT, new PartOfSet.PartOfSetValue(num, num2));
    }

    public AbstractFrameBodyNumberTotal(byte b, String str) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_TEXT, new PartOfSet.PartOfSetValue(str));
    }

    public AbstractFrameBodyNumberTotal(AbstractFrameBodyNumberTotal abstractFrameBodyNumberTotal) {
        super(abstractFrameBodyNumberTotal);
    }

    public AbstractFrameBodyNumberTotal(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public AbstractFrameBodyNumberTotal(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public abstract String getIdentifier();

    public Integer getNumber() {
        return ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).getCount();
    }

    public String getNumberAsText() {
        return ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).getCountAsText();
    }

    public String getText() {
        return getObjectValue(DataTypes.OBJ_TEXT).toString();
    }

    public Integer getTotal() {
        return ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).getTotal();
    }

    public String getTotalAsText() {
        return ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).getTotalAsText();
    }

    @Override // defpackage.AbstractC12444e
    public String getUserFriendlyValue() {
        return String.valueOf(((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).getCount());
    }

    public void setNumber(Integer num) {
        ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).setCount(num);
    }

    public void setNumber(String str) {
        ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).setCount(str);
    }

    public void setText(String str) {
        setObjectValue(DataTypes.OBJ_TEXT, new PartOfSet.PartOfSetValue(str));
    }

    public void setTotal(Integer num) {
        ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).setTotal(num);
    }

    public void setTotal(String str) {
        ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).setTotal(str);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new PartOfSet(DataTypes.OBJ_TEXT, this));
    }
}
