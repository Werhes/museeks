package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۘۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7408e extends FilterInputStream {
    public C7408e(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int read = super.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            }
            if (read == -1) {
                throw new IOException((i2 - i3) + " more bytes expected.");
            }
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int i = 0;
        long j2 = 0;
        while (j2 < j) {
            long skip = super.skip(j - j2);
            if (skip == 0 && (i = i + 1) == 2) {
                break;
            }
            j2 += skip;
        }
        return j2;
    }
}
