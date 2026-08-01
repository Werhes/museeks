package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17044e {
    public final InputStream ad;
    public char appmetrica;
    public boolean license;
    public final ByteBuffer metrica;
    public final CharsetDecoder vip;

    public C17044e(InputStream inputStream, Charset charset) {
        this.ad = inputStream;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.vip = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer wrap = ByteBuffer.wrap(C13708e.metrica.metrica(8196));
        this.metrica = wrap;
        wrap.flip();
    }

    public final int ad(char[] cArr, int i, int i2) {
        int i3;
        CharsetDecoder charsetDecoder;
        char c;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0 || i >= cArr.length || i2 < 0 || i + i2 > cArr.length) {
            StringBuilder pro = AbstractC17861e.pro(i, i2, "Unexpected arguments: ", ", ", ", ");
            pro.append(cArr.length);
            throw new IllegalArgumentException(pro.toString().toString());
        }
        boolean z = true;
        if (this.license) {
            cArr[i] = this.appmetrica;
            i++;
            i2--;
            this.license = false;
            if (i2 == 0) {
                return 1;
            }
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 == 1) {
            if (this.license) {
                this.license = false;
                c = this.appmetrica;
            } else {
                char[] cArr2 = new char[2];
                int ad = ad(cArr2, 0, 2);
                if (ad == -1) {
                    c = 65535;
                } else if (ad == 1) {
                    c = cArr2[0];
                } else {
                    if (ad != 2) {
                        throw new IllegalStateException(("Unreachable state: " + ad).toString());
                    }
                    this.appmetrica = cArr2[1];
                    this.license = true;
                    c = cArr2[0];
                }
            }
            if (c != 65535) {
                cArr[i] = c;
                return i3 + 1;
            }
            if (i3 == 0) {
                return -1;
            }
            return i3;
        }
        CharBuffer wrap = CharBuffer.wrap(cArr, i, i2);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        CharBuffer charBuffer = wrap;
        boolean z2 = false;
        while (true) {
            charsetDecoder = this.vip;
            ByteBuffer byteBuffer = this.metrica;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z2);
            if (decode.isUnderflow()) {
                if (z2 || !charBuffer.hasRemaining()) {
                    break;
                }
                byteBuffer.compact();
                try {
                    int limit = byteBuffer.limit();
                    int position = byteBuffer.position();
                    int read = this.ad.read(byteBuffer.array(), byteBuffer.arrayOffset() + position, position <= limit ? limit - position : 0);
                    if (read >= 0) {
                        byteBuffer.position(position + read);
                        byteBuffer.flip();
                        read = byteBuffer.remaining();
                    }
                    if (read < 0) {
                        if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                            break;
                        }
                        charsetDecoder.reset();
                        z2 = true;
                    } else {
                        continue;
                    }
                } finally {
                    byteBuffer.flip();
                }
            } else {
                if (decode.isOverflow()) {
                    charBuffer.position();
                    break;
                }
                decode.throwException();
            }
        }
        z = z2;
        if (z) {
            charsetDecoder.reset();
        }
        return (charBuffer.position() != 0 ? charBuffer.position() : -1) + i3;
    }
}
