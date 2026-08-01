package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؒؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0846e {
    public static final C7936e ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        ad = new C7936e(2);
    }

    public static ByteBuffer ad(String str, String str2, ByteBuffer byteBuffer, int i, int i2) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = ad;
        c7936e.getClass();
        int i3 = C1724e.ad;
        byte[] bArr = new byte[i];
        byte[] bArr2 = new byte[i2];
        int position = byteBuffer.position();
        byteBuffer.get(bArr2, 0, i2);
        byteBuffer.position(position);
        Inflater inflater = new Inflater();
        inflater.setInput(bArr2);
        try {
            inflater.inflate(bArr);
            c7936e.getClass();
            inflater.end();
            return ByteBuffer.wrap(bArr);
        } catch (DataFormatException e) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i4 = C1724e.ad;
            byteBuffer.position(byteBuffer.position() + i2);
            Locale.getDefault();
            throw new Exception(AbstractC17861e.admob("Unable to decompress frame ", str, " in file ", str2), e);
        }
    }
}
