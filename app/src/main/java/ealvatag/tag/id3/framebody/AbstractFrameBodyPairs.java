package ealvatag.tag.id3.framebody;

import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.Pair;
import ealvatag.tag.datatype.PairedTextEncodedStringNullTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.StringTokenizer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public abstract class AbstractFrameBodyPairs extends AbstractID3v2FrameBody implements ID3v24FrameBody {
    public AbstractFrameBodyPairs() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
    }

    public AbstractFrameBodyPairs(byte b, String str) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setText(str);
    }

    public AbstractFrameBodyPairs(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public AbstractFrameBodyPairs(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public void addPair(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\u0000");
        if (stringTokenizer.countTokens() == 2) {
            addPair(stringTokenizer.nextToken(), stringTokenizer.nextToken());
        } else {
            addPair(BuildConfig.FLAVOR, str);
        }
    }

    public void addPair(String str, String str2) {
        ((PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT)).getValue().add(str, str2);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public abstract String getIdentifier();

    public String getKeyAtIndex(int i) {
        return ((PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT)).getValue().getMapping().get(i).getKey();
    }

    public int getNumberOfPairs() {
        return ((PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT)).getValue().getNumberOfPairs();
    }

    public PairedTextEncodedStringNullTerminated.ValuePairs getPairing() {
        return (PairedTextEncodedStringNullTerminated.ValuePairs) getObject(DataTypes.OBJ_TEXT).getValue();
    }

    public String getText() {
        PairedTextEncodedStringNullTerminated pairedTextEncodedStringNullTerminated = (PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT);
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Pair pair : pairedTextEncodedStringNullTerminated.getValue().getMapping()) {
            sb.append(pair.getKey() + (char) 0 + pair.getValue());
            if (i != getNumberOfPairs()) {
                sb.append((char) 0);
            }
            i++;
        }
        return sb.toString();
    }

    @Override // defpackage.AbstractC12444e
    public String getUserFriendlyValue() {
        return getText();
    }

    public String getValueAtIndex(int i) {
        return ((PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT)).getValue().getMapping().get(i).getValue();
    }

    public void resetPairs() {
        ((PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT)).getValue().getMapping().clear();
    }

    public void setText(String str) {
        PairedTextEncodedStringNullTerminated.ValuePairs valuePairs = new PairedTextEncodedStringNullTerminated.ValuePairs();
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\u0000");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (stringTokenizer.hasMoreTokens()) {
                valuePairs.add(nextToken, stringTokenizer.nextToken());
            }
        }
        setObjectValue(DataTypes.OBJ_TEXT, valuePairs);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new PairedTextEncodedStringNullTerminated(DataTypes.OBJ_TEXT, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        if (!((PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        super.write(byteArrayOutputStream);
    }
}
