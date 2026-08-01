package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC4639e;
import defpackage.C12927e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class TextEncodedStringNullTerminated extends AbstractString {
    private static final byte NULL_BYTE = 0;

    public TextEncodedStringNullTerminated(TextEncodedStringNullTerminated textEncodedStringNullTerminated) {
        super(textEncodedStringNullTerminated);
    }

    public TextEncodedStringNullTerminated(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
    }

    public TextEncodedStringNullTerminated(String str, AbstractC12444e abstractC12444e, String str2) {
        super(str, abstractC12444e, str2);
    }

    private static long getNullEvenIndex(C16151e c16151e, long j) {
        long isVip = c16151e.isVip((byte) 0, j, Long.MAX_VALUE);
        while (-1 != isVip && !isEven(isVip)) {
            isVip = c16151e.isVip((byte) 0, isVip + 1, Long.MAX_VALUE);
        }
        return isVip;
    }

    public static int getNullIndex(C16151e c16151e, boolean z) {
        try {
            if (z) {
                return (int) c16151e.isVip((byte) 0, 0L, Long.MAX_VALUE);
            }
            long nullEvenIndex = getNullEvenIndex(c16151e, 0L);
            long j = -1;
            while (-1 == j && -1 != nullEvenIndex) {
                long j2 = 1 + nullEvenIndex;
                if (c16151e.Signature(j2) == 0) {
                    j = j2;
                } else {
                    nullEvenIndex = getNullEvenIndex(c16151e, nullEvenIndex + 2);
                }
            }
            return (int) j;
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1;
        }
    }

    private static boolean isEven(long j) {
        return j % 2 == 0;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof TextEncodedStringNullTerminated) && super.equals(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[Catch: eؖٔۥ -> 0x000f, TryCatch #0 {eؖٔۥ -> 0x000f, blocks: (B:2:0x0000, B:4:0x0008, B:8:0x0012, B:10:0x0018, B:13:0x0022, B:15:0x002e, B:19:0x0020, B:20:0x0032, B:21:0x0039), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032 A[Catch: eؖٔۥ -> 0x000f, TryCatch #0 {eؖٔۥ -> 0x000f, blocks: (B:2:0x0000, B:4:0x0008, B:8:0x0012, B:10:0x0018, B:13:0x0022, B:15:0x002e, B:19:0x0020, B:20:0x0032, B:21:0x0039), top: B:1:0x0000 }] */
    @Override // ealvatag.tag.datatype.AbstractDataType
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void read(defpackage.C16151e r4, int r5) {
        /*
            r3 = this;
            java.nio.charset.Charset r5 = r3.getTextEncodingCharSet()     // Catch: defpackage.C4117e -> Lf
            java.nio.charset.Charset r0 = defpackage.AbstractC4639e.vip     // Catch: defpackage.C4117e -> Lf
            if (r0 == r5) goto L11
            java.nio.charset.Charset r0 = defpackage.AbstractC4639e.metrica     // Catch: defpackage.C4117e -> Lf
            if (r0 != r5) goto Ld
            goto L11
        Ld:
            r0 = 0
            goto L12
        Lf:
            r4 = move-exception
            goto L3a
        L11:
            r0 = 1
        L12:
            int r1 = getNullIndex(r4, r0)     // Catch: defpackage.C4117e -> Lf
            if (r1 < 0) goto L32
            int r2 = r1 + 1
            r3.setSize(r2)     // Catch: defpackage.C4117e -> Lf
            if (r0 == 0) goto L20
            goto L22
        L20:
            int r1 = r1 + (-1)
        L22:
            long r1 = (long) r1     // Catch: defpackage.C4117e -> Lf
            java.lang.String r5 = r4.mo1683e(r1, r5)     // Catch: defpackage.C4117e -> Lf
            r3.value = r5     // Catch: defpackage.C4117e -> Lf
            r4.readByte()     // Catch: defpackage.C4117e -> Lf
            if (r0 != 0) goto L31
            r4.readByte()     // Catch: defpackage.C4117e -> Lf
        L31:
            return
        L32:
            eُؙؓ r4 = new eُؙؓ     // Catch: defpackage.C4117e -> Lf
            java.lang.String r5 = "Can't find null string terminator"
            r4.<init>(r5)     // Catch: defpackage.C4117e -> Lf
            throw r4     // Catch: defpackage.C4117e -> Lf
        L3a:
            eُؙؓ r5 = new eُؙؓ
            java.lang.String r0 = "Bad charset Id"
            r5.<init>(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ealvatag.tag.datatype.TextEncodedStringNullTerminated.read(eِٖۢ, int):void");
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        int i2;
        int position;
        if (i >= bArr.length) {
            throw new Exception("Unable to find null terminated string");
        }
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i3 = C1724e.ad;
        Charset textEncodingCharSet = getTextEncodingCharSet();
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, bArr.length - i);
        boolean z = false;
        boolean z2 = AbstractC4639e.vip == textEncodingCharSet || AbstractC4639e.metrica == textEncodingCharSet;
        while (wrap.hasRemaining()) {
            if (wrap.get() == 0) {
                if (z2) {
                    wrap.mark();
                    wrap.reset();
                    position = wrap.position() - 1;
                    InterfaceC4279e interfaceC4279e2 = AbstractDataType.LOG;
                    EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                    ((C7936e) interfaceC4279e2).getClass();
                    int i4 = C1724e.ad;
                } else if (!wrap.hasRemaining()) {
                    wrap.mark();
                    wrap.reset();
                    position = wrap.position() - 1;
                    InterfaceC4279e interfaceC4279e3 = AbstractDataType.LOG;
                    EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                    ((C7936e) interfaceC4279e3).getClass();
                    int i5 = C1724e.ad;
                } else if (wrap.get() == 0) {
                    wrap.mark();
                    wrap.reset();
                    position = wrap.position() - 2;
                    InterfaceC4279e interfaceC4279e4 = AbstractDataType.LOG;
                    EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                    ((C7936e) interfaceC4279e4).getClass();
                    int i6 = C1724e.ad;
                }
                i2 = position;
                z = true;
                break;
            }
            if (!z2 && wrap.hasRemaining()) {
                wrap.get();
            }
        }
        i2 = 0;
        if (!z) {
            throw new Exception("Unable to find null terminated string");
        }
        InterfaceC4279e interfaceC4279e5 = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e5).getClass();
        int i7 = C1724e.ad;
        int i8 = i2 - i;
        int i9 = i8 + 1;
        if (!z2) {
            i9 = i8 + 2;
        }
        setSize(i9);
        ((C7936e) AbstractDataType.LOG).getClass();
        if (i8 == 0) {
            this.value = BuildConfig.FLAVOR;
        } else {
            ByteBuffer slice = ByteBuffer.wrap(bArr, i, i8).slice();
            CharBuffer allocate = CharBuffer.allocate(i8);
            CharsetDecoder correctDecoder = getCorrectDecoder(slice);
            CoderResult decode = correctDecoder.decode(slice, allocate, true);
            if (decode.isError()) {
                InterfaceC4279e interfaceC4279e6 = AbstractDataType.LOG;
                EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
                decode.toString();
                ((C7936e) interfaceC4279e6).getClass();
            }
            correctDecoder.flush(allocate);
            allocate.flip();
            this.value = allocate.toString();
        }
        InterfaceC4279e interfaceC4279e7 = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e7).getClass();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArr;
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i = C1724e.ad;
        Charset textEncodingCharSet = getTextEncodingCharSet();
        try {
            if (!AbstractC4639e.purchase.equals(textEncodingCharSet)) {
                CharsetEncoder newEncoder = textEncodingCharSet.newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.IGNORE;
                newEncoder.onMalformedInput(codingErrorAction);
                newEncoder.onUnmappableCharacter(codingErrorAction);
                ByteBuffer encode = newEncoder.encode(CharBuffer.wrap(((String) this.value) + (char) 0));
                bArr = new byte[encode.limit()];
                encode.get(bArr, 0, encode.limit());
            } else if (C12927e.license().Signature) {
                CharsetEncoder newEncoder2 = AbstractC4639e.appmetrica.newEncoder();
                CodingErrorAction codingErrorAction2 = CodingErrorAction.IGNORE;
                newEncoder2.onMalformedInput(codingErrorAction2);
                newEncoder2.onUnmappableCharacter(codingErrorAction2);
                ByteBuffer encode2 = newEncoder2.encode(CharBuffer.wrap("\ufeff" + ((String) this.value) + (char) 0));
                bArr = new byte[encode2.limit()];
                encode2.get(bArr, 0, encode2.limit());
            } else {
                CharsetEncoder newEncoder3 = AbstractC4639e.license.newEncoder();
                CodingErrorAction codingErrorAction3 = CodingErrorAction.IGNORE;
                newEncoder3.onMalformedInput(codingErrorAction3);
                newEncoder3.onUnmappableCharacter(codingErrorAction3);
                ByteBuffer encode3 = newEncoder3.encode(CharBuffer.wrap("\ufeff" + ((String) this.value) + (char) 0));
                bArr = new byte[encode3.limit()];
                encode3.get(bArr, 0, encode3.limit());
            }
            setSize(bArr.length);
            return bArr;
        } catch (CharacterCodingException e) {
            InterfaceC4279e interfaceC4279e2 = AbstractDataType.LOG;
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e2).getClass();
            int i2 = C1724e.ad;
            throw new RuntimeException(e);
        }
    }
}
