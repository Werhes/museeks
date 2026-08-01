package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC4639e;
import defpackage.AbstractC5087e;
import defpackage.C12927e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C4117e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class TextEncodedStringSizeTerminated extends AbstractString {
    public TextEncodedStringSizeTerminated(TextEncodedStringSizeTerminated textEncodedStringSizeTerminated) {
        super(textEncodedStringSizeTerminated);
    }

    public TextEncodedStringSizeTerminated(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
    }

    public static List<String> splitByNullSeperator(String str) {
        List<String> asList = Arrays.asList(str.split("\\u0000"));
        if (asList.size() != 0) {
            return asList;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(BuildConfig.FLAVOR);
        return arrayList;
    }

    public void addValue(String str) {
        setValue(this.value + "\u0000" + str);
    }

    public void checkTrailingNull(List<String> list, String str) {
        if (C12927e.license().smaato || str.length() <= 0 || str.charAt(str.length() - 1) != 0) {
            return;
        }
        list.set(list.size() - 1, list.get(list.size() - 1) + (char) 0);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextEncodedStringSizeTerminated) && super.equals(obj);
    }

    public int getNumberOfValues() {
        return splitByNullSeperator((String) this.value).size();
    }

    public String getValueAtIndex(int i) {
        return splitByNullSeperator((String) this.value).get(i);
    }

    public String getValueWithoutTrailingNull() {
        Object obj = this.value;
        if (obj == null) {
            InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e).getClass();
            int i = C1724e.ad;
            return BuildConfig.FLAVOR;
        }
        List<String> splitByNullSeperator = splitByNullSeperator((String) obj);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < splitByNullSeperator.size(); i2++) {
            if (i2 != 0) {
                sb.append("\u0000");
            }
            sb.append(splitByNullSeperator.get(i2));
        }
        return sb.toString();
    }

    public List<String> getValues() {
        return splitByNullSeperator((String) this.value);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        try {
            long j = c16151e.f31731e;
            String mo1683e = c16151e.mo1683e(i, peekCorrectDecoder(c16151e));
            if (AbstractC4639e.purchase.equals(getTextEncodingCharSet())) {
                this.value = mo1683e.replace("\ufeff", BuildConfig.FLAVOR).replace("\ufffe", BuildConfig.FLAVOR);
            } else {
                this.value = mo1683e;
            }
            setSize((int) (j - c16151e.f31731e));
        } catch (C4117e e) {
            throw new Exception("Bad charset id", e);
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        ByteBuffer slice;
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i2 = C1724e.ad;
        if (C12927e.license().loadAd) {
            int length = bArr.length - i;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i, bArr2, 0, length);
            slice = ByteBuffer.wrap(bArr2);
        } else {
            slice = ByteBuffer.wrap(bArr, i, bArr.length - i).slice();
        }
        CharBuffer allocate = CharBuffer.allocate(bArr.length - i);
        CharsetDecoder correctDecoder = getCorrectDecoder(slice);
        if (correctDecoder.decode(slice, allocate, true).isError()) {
            InterfaceC4279e interfaceC4279e2 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e2).getClass();
        }
        correctDecoder.flush(allocate);
        allocate.flip();
        if (AbstractC4639e.purchase.equals(getTextEncodingCharSet())) {
            this.value = allocate.toString().replace("\ufeff", BuildConfig.FLAVOR).replace("\ufffe", BuildConfig.FLAVOR);
        } else {
            this.value = allocate.toString();
        }
        setSize(bArr.length - i);
        ((C7936e) AbstractDataType.LOG).getClass();
    }

    public void stripTrailingNull() {
        if (C12927e.license().smaato) {
            String str = (String) this.value;
            if (str.length() <= 0 || str.charAt(str.length() - 1) != 0) {
                return;
            }
            this.value = AbstractC5087e.m1752this(1, 0, str);
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        Charset textEncodingCharSet = getTextEncodingCharSet();
        try {
            stripTrailingNull();
            String str = (String) this.value;
            Charset charset = AbstractC4639e.purchase.equals(textEncodingCharSet) ? C12927e.license().Signature ? AbstractC4639e.appmetrica : AbstractC4639e.license : null;
            ByteBuffer allocate = ByteBuffer.allocate((str.length() + 3) * 3);
            List<String> splitByNullSeperator = splitByNullSeperator(str);
            checkTrailingNull(splitByNullSeperator, str);
            for (int i = 0; i < splitByNullSeperator.size(); i++) {
                String str2 = splitByNullSeperator.get(i);
                if (AbstractC4639e.appmetrica.equals(charset)) {
                    allocate.put(writeStringUTF16LEBOM(str2, i, splitByNullSeperator.size()));
                } else if (AbstractC4639e.license.equals(charset)) {
                    allocate.put(writeStringUTF16BEBOM(str2, i, splitByNullSeperator.size()));
                } else {
                    CharsetEncoder newEncoder = textEncodingCharSet.newEncoder();
                    CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
                    newEncoder.onMalformedInput(codingErrorAction);
                    newEncoder.onUnmappableCharacter(codingErrorAction);
                    allocate.put(writeString(newEncoder, str2, i, splitByNullSeperator.size()));
                }
            }
            allocate.flip();
            int limit = allocate.limit();
            byte[] bArr = new byte[limit];
            allocate.rewind();
            allocate.get(bArr, 0, allocate.limit());
            setSize(limit);
            return bArr;
        } catch (CharacterCodingException e) {
            InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e).getClass();
            int i2 = C1724e.ad;
            throw new RuntimeException(e);
        }
    }

    public ByteBuffer writeString(CharsetEncoder charsetEncoder, String str, int i, int i2) {
        ByteBuffer encode;
        if (i + 1 == i2) {
            encode = charsetEncoder.encode(CharBuffer.wrap(str));
        } else {
            encode = charsetEncoder.encode(CharBuffer.wrap(str + (char) 0));
        }
        encode.rewind();
        return encode;
    }

    public ByteBuffer writeStringUTF16BEBOM(String str, int i, int i2) {
        ByteBuffer encode;
        CharsetEncoder newEncoder = AbstractC4639e.license.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
        newEncoder.onMalformedInput(codingErrorAction);
        newEncoder.onUnmappableCharacter(codingErrorAction);
        if (i + 1 == i2) {
            encode = newEncoder.encode(CharBuffer.wrap("\ufeff" + str));
        } else {
            encode = newEncoder.encode(CharBuffer.wrap("\ufeff" + str + (char) 0));
        }
        encode.rewind();
        return encode;
    }

    public ByteBuffer writeStringUTF16LEBOM(String str, int i, int i2) {
        ByteBuffer encode;
        CharsetEncoder newEncoder = AbstractC4639e.appmetrica.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
        newEncoder.onMalformedInput(codingErrorAction);
        newEncoder.onUnmappableCharacter(codingErrorAction);
        if (i + 1 == i2) {
            encode = newEncoder.encode(CharBuffer.wrap("\ufeff" + str));
        } else {
            encode = newEncoder.encode(CharBuffer.wrap("\ufeff" + str + (char) 0));
        }
        encode.rewind();
        return encode;
    }
}
