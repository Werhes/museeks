package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۘۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8175e {
    public static final byte ad = Byte.parseByte("01110000", 2);
    public static final byte vip = Byte.parseByte("00001111", 2);

    public static String ad() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b = array[0];
        array[16] = b;
        array[0] = (byte) ((b & vip) | ad);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
