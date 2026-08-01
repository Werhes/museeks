package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9818e extends AbstractC9743e {
    public static final Pattern appmetrica = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder metrica = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder license = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // defpackage.AbstractC9743e
    public final C17750e billing(C16890e c16890e, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.license;
        CharsetDecoder charsetDecoder2 = this.metrica;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new C17750e(new C1259e(null, null, bArr));
        }
        Matcher matcher = appmetrica.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String tapsense = AbstractC3628e.tapsense(group);
                tapsense.getClass();
                if (tapsense.equals("streamurl")) {
                    str3 = group2;
                } else if (tapsense.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new C17750e(new C1259e(str2, str3, bArr));
    }
}
