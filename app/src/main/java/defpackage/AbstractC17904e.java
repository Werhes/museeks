package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٞٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17904e {
    public static final byte[] ad;

    static {
        byte[] bArr = new byte[0];
        ad = bArr;
        ByteBuffer.wrap(bArr);
        int i = 0 + 0;
        try {
            if (i < 0) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            if (i > Integer.MAX_VALUE) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } catch (C10895e e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int ad(int i, int i2, int i3, byte[] bArr) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
