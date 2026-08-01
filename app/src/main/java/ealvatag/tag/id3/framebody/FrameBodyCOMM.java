package ealvatag.tag.id3.framebody;

import defpackage.AbstractC12042e;
import defpackage.AbstractC5542e;
import defpackage.C16151e;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringHashMap;
import ealvatag.tag.datatype.TextEncodedStringNullTerminated;
import ealvatag.tag.datatype.TextEncodedStringSizeTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyCOMM extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public static final String MM_CUSTOM1 = "Songs-DB_Custom1";
    public static final String MM_CUSTOM2 = "Songs-DB_Custom2";
    public static final String MM_CUSTOM3 = "Songs-DB_Custom3";
    public static final String MM_CUSTOM4 = "Songs-DB_Custom4";
    public static final String MM_CUSTOM5 = "Songs-DB_Custom5";
    public static final String MM_OCCASION = "Songs-DB_Occasion";
    private static final String MM_PREFIX = "Songs-DB";
    public static final String MM_QUALITY = "Songs-DB_Preference";
    public static final String MM_TEMPO = "Songs-DB_Tempo";

    public FrameBodyCOMM() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_LANGUAGE, "eng");
        setObjectValue(DataTypes.OBJ_DESCRIPTION, BuildConfig.FLAVOR);
        setObjectValue(DataTypes.OBJ_TEXT, BuildConfig.FLAVOR);
    }

    public FrameBodyCOMM(byte b, String str, String str2, String str3) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_LANGUAGE, str);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str2);
        setObjectValue(DataTypes.OBJ_TEXT, str3);
    }

    public FrameBodyCOMM(FrameBodyCOMM frameBodyCOMM) {
        super(frameBodyCOMM);
    }

    public FrameBodyCOMM(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyCOMM(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public String getDescription() {
        return (String) getObjectValue(DataTypes.OBJ_DESCRIPTION);
    }

    public String getFirstTextValue() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getValueAtIndex(0);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "COMM";
    }

    public String getLanguage() {
        return (String) getObjectValue(DataTypes.OBJ_LANGUAGE);
    }

    public String getText() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getValueAtIndex(0);
    }

    @Override // defpackage.AbstractC12444e
    public String getUserFriendlyValue() {
        return getText();
    }

    public String getValueAtIndex(int i) {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getValueAtIndex(i);
    }

    public List<String> getValues() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getValues();
    }

    public boolean isMediaMonkeyFrame() {
        String description = getDescription();
        return (description == null || description.length() == 0 || !description.startsWith(MM_PREFIX)) ? false : true;
    }

    public void setDescription(String str) {
        AbstractC5542e.metrica(str);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
    }

    public void setLanguage(String str) {
        setObjectValue(DataTypes.OBJ_LANGUAGE, str);
    }

    public void setText(String str) {
        AbstractC5542e.metrica(str);
        setObjectValue(DataTypes.OBJ_TEXT, str);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringHashMap(DataTypes.OBJ_LANGUAGE, this, 3));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new TextEncodedStringSizeTerminated(DataTypes.OBJ_TEXT, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        setTextEncoding(AbstractC12042e.ad(getHeader(), getTextEncoding()));
        if (!((AbstractString) getObject(DataTypes.OBJ_TEXT)).canBeEncoded()) {
            setTextEncoding(AbstractC12042e.vip(getHeader()));
        }
        if (!((AbstractString) getObject(DataTypes.OBJ_DESCRIPTION)).canBeEncoded()) {
            setTextEncoding(AbstractC12042e.vip(getHeader()));
        }
        super.write(byteArrayOutputStream);
    }
}
