package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13191e {
    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
    }

    public static ByteBuffer ad(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining + 1];
        byteBuffer.get(bArr, 0, remaining);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (i < remaining) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (z || b != 0) {
                bArr[i2] = b;
                i2++;
            }
            z = (b & 255) != 255;
            i = i3;
        }
        return ByteBuffer.wrap(bArr, 0, i2);
    }
}
