package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import defpackage.C18540e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.TCONString;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyTCON extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyTCON() {
    }

    public FrameBodyTCON(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTCON(FrameBodyTCON frameBodyTCON) {
        super(frameBodyTCON);
    }

    public FrameBodyTCON(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyTCON(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    private static String bracketWrap(Object obj) {
        return "(" + obj + ')';
    }

    private static String checkBracketed(String str) {
        String replace = str.replace("(", BuildConfig.FLAVOR).replace(")", BuildConfig.FLAVOR);
        try {
            int parseInt = Integer.parseInt(replace);
            return parseInt <= 191 ? C18540e.m4564default().getValue(parseInt) : replace;
        } catch (NumberFormatException unused) {
            return replace.equalsIgnoreCase("RX") ? "Remix" : replace.equalsIgnoreCase("CR") ? "Cover" : replace;
        }
    }

    public static String convertGenericToID3v22Genre(String str) {
        return convertGenericToID3v23Genre(str);
    }

    public static String convertGenericToID3v23Genre(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt <= 191 ? bracketWrap(String.valueOf(parseInt)) : str;
        } catch (NumberFormatException unused) {
            Integer m4566abstract = C18540e.m4564default().m4566abstract(str);
            return (m4566abstract == null || m4566abstract.intValue() > 125) ? str.equalsIgnoreCase("Remix") ? bracketWrap("RX") : str.equalsIgnoreCase("Cover") ? bracketWrap("CR") : str.equalsIgnoreCase("RX") ? bracketWrap("RX") : str.equalsIgnoreCase("CR") ? bracketWrap("CR") : str : bracketWrap(String.valueOf(m4566abstract));
        }
    }

    public static String convertGenericToID3v24Genre(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt <= 191 ? String.valueOf(parseInt) : str;
        } catch (NumberFormatException unused) {
            Integer m4566abstract = C18540e.m4564default().m4566abstract(str);
            if (m4566abstract != null && m4566abstract.intValue() <= 125) {
                return String.valueOf(m4566abstract);
            }
            if (!str.equalsIgnoreCase("Remix")) {
                if (!str.equalsIgnoreCase("Cover")) {
                    if (!str.equalsIgnoreCase("RX")) {
                        if (!str.equalsIgnoreCase("CR")) {
                            return str;
                        }
                    }
                }
                return "CR";
            }
            return "RX";
        }
    }

    public static String convertID3v22GenreToGeneric(String str) {
        return convertID3v23GenreToGeneric(str);
    }

    public static String convertID3v23GenreToGeneric(String str) {
        if (!str.contains(")") || str.lastIndexOf(41) >= str.length() - 1) {
            return checkBracketed(str);
        }
        return checkBracketed(str.substring(0, str.lastIndexOf(41))) + ' ' + str.substring(str.lastIndexOf(41) + 1);
    }

    public static String convertID3v24GenreToGeneric(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt <= 191 ? C18540e.m4564default().getValue(parseInt) : str;
        } catch (NumberFormatException unused) {
            return str.equalsIgnoreCase("RX") ? "Remix" : str.equalsIgnoreCase("CR") ? "Cover" : str;
        }
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TCON";
    }

    public void setV23Format() {
        ((TCONString) getObject(DataTypes.OBJ_TEXT)).setNullSeparateMultipleValues(false);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyTextInfo, defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new TCONString(DataTypes.OBJ_TEXT, this));
    }
}
