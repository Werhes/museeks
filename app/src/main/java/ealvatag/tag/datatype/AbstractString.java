package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC4639e;
import defpackage.C16089e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public abstract class AbstractString extends AbstractDataType {
    public AbstractString(AbstractString abstractString) {
        super(abstractString);
    }

    public AbstractString(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
    }

    public AbstractString(String str, AbstractC12444e abstractC12444e, String str2) {
        super(str, abstractC12444e, str2);
    }

    private int getShort(C16151e c16151e) {
        return (c16151e.Signature(1L) & 255) | ((c16151e.Signature(0L) & 255) << 8);
    }

    public boolean canBeEncoded() {
        if (C16089e.premium().admob(getBody().getTextEncoding()).newEncoder().canEncode((String) this.value)) {
            return true;
        }
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i = C1724e.ad;
        return false;
    }

    public CharsetDecoder getCorrectDecoder(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 2) {
            CharsetDecoder newDecoder = getTextEncodingCharSet().newDecoder();
            newDecoder.reset();
            return newDecoder;
        }
        if (getTextEncodingCharSet() != AbstractC4639e.purchase) {
            CharsetDecoder newDecoder2 = getTextEncodingCharSet().newDecoder();
            newDecoder2.reset();
            return newDecoder2;
        }
        if (byteBuffer.getChar(0) == 65534 || byteBuffer.getChar(0) == 65279) {
            CharsetDecoder newDecoder3 = getTextEncodingCharSet().newDecoder();
            newDecoder3.reset();
            return newDecoder3;
        }
        if (byteBuffer.get(0) == 0) {
            CharsetDecoder newDecoder4 = AbstractC4639e.license.newDecoder();
            newDecoder4.reset();
            return newDecoder4;
        }
        CharsetDecoder newDecoder5 = AbstractC4639e.appmetrica.newDecoder();
        newDecoder5.reset();
        return newDecoder5;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return this.size;
    }

    public Charset getTextEncodingCharSet() {
        try {
            return C16089e.premium().admob(getBody().getTextEncoding());
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Bad Charset Id ", e);
        }
    }

    public Charset peekCorrectDecoder(C16151e c16151e) {
        Charset charset;
        Charset textEncodingCharSet = getTextEncodingCharSet();
        if (c16151e.f31731e <= 2 || textEncodingCharSet != (charset = AbstractC4639e.purchase)) {
            return textEncodingCharSet;
        }
        int i = getShort(c16151e);
        return (i == 65534 || i == 65279) ? charset : c16151e.Signature(0L) == 0 ? AbstractC4639e.license : AbstractC4639e.appmetrica;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public String toString() {
        return (String) this.value;
    }
}
