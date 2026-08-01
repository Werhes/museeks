package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۢؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2930e {
    public static final Charset ad = Charset.forName("UTF-8");
    public static final byte[] vip;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        vip = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C10561e(bArr, 0, 0, false).appmetrica(0);
        } catch (C11690e e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void ad(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int vip(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
