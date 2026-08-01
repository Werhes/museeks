package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC4639e;
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
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class StringFixedLength extends AbstractString {
    public StringFixedLength(StringFixedLength stringFixedLength) {
        super(stringFixedLength);
        this.size = stringFixedLength.size;
    }

    public StringFixedLength(String str, AbstractC12444e abstractC12444e, int i) {
        super(str, abstractC12444e);
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "size is less than zero: "));
        }
        setSize(i);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof StringFixedLength) && this.size == ((StringFixedLength) obj).size && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        try {
            this.value = c16151e.mo1683e(this.size, getTextEncodingCharSet());
        } catch (C4117e e) {
            throw new Exception("Bad charset Id", e);
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        CharsetDecoder newDecoder;
        int length;
        int i2;
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i3 = C1724e.ad;
        try {
            newDecoder = getTextEncodingCharSet().newDecoder();
            InterfaceC4279e interfaceC4279e2 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            int length2 = bArr.length;
            ((C7936e) interfaceC4279e2).getClass();
            length = bArr.length - i;
            i2 = this.size;
        } catch (CharacterCodingException unused) {
            InterfaceC4279e interfaceC4279e3 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e3).getClass();
            int i4 = C1724e.ad;
            this.value = BuildConfig.FLAVOR;
        }
        if (length < i2) {
            throw new Exception("byte array is to small to retrieve string of declared length:" + this.size);
        }
        this.value = newDecoder.decode(ByteBuffer.wrap(bArr, i, i2)).toString();
        InterfaceC4279e interfaceC4279e4 = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e4).getClass();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        int i = 0;
        if (this.value == null) {
            InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e).getClass();
            int i2 = C1724e.ad;
            byte[] bArr = new byte[this.size];
            while (i < this.size) {
                bArr[i] = 32;
                i++;
            }
            return bArr;
        }
        try {
            Charset textEncodingCharSet = getTextEncodingCharSet();
            ByteBuffer encode = AbstractC4639e.purchase.equals(textEncodingCharSet) ? AbstractC4639e.appmetrica.newEncoder().encode(CharBuffer.wrap("\ufeff" + ((String) this.value))) : textEncodingCharSet.newEncoder().encode(CharBuffer.wrap((String) this.value));
            if (encode == null) {
                InterfaceC4279e interfaceC4279e2 = AbstractDataType.LOG;
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                ((C7936e) interfaceC4279e2).getClass();
                int i3 = C1724e.ad;
                byte[] bArr2 = new byte[this.size];
                while (i < this.size) {
                    bArr2[i] = 32;
                    i++;
                }
                return bArr2;
            }
            if (encode.limit() == this.size) {
                byte[] bArr3 = new byte[encode.limit()];
                encode.get(bArr3, 0, encode.limit());
                return bArr3;
            }
            if (encode.limit() > this.size) {
                InterfaceC4279e interfaceC4279e3 = AbstractDataType.LOG;
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                encode.limit();
                ((C7936e) interfaceC4279e3).getClass();
                int i4 = C1724e.ad;
                int i5 = this.size;
                byte[] bArr4 = new byte[i5];
                encode.get(bArr4, 0, i5);
                return bArr4;
            }
            InterfaceC4279e interfaceC4279e4 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            encode.limit();
            ((C7936e) interfaceC4279e4).getClass();
            int i6 = C1724e.ad;
            byte[] bArr5 = new byte[this.size];
            encode.get(bArr5, 0, encode.limit());
            for (int limit = encode.limit(); limit < this.size; limit++) {
                bArr5[limit] = 32;
            }
            return bArr5;
        } catch (CharacterCodingException unused) {
            InterfaceC4279e interfaceC4279e5 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e5).getClass();
            int i7 = C1724e.ad;
            byte[] bArr6 = new byte[this.size];
            while (i < this.size) {
                bArr6[i] = 32;
                i++;
            }
            return bArr6;
        }
    }
}
