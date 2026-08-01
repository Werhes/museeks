package defpackage;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3280e extends FilterInputStream {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f7436e;

    public C3280e(ByteArrayInputStream byteArrayInputStream, int i) {
        super(byteArrayInputStream);
        this.f7436e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f7436e);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f7436e <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f7436e--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f7436e;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            this.f7436e -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(Math.min(j, this.f7436e));
        if (skip >= 0) {
            this.f7436e = (int) (this.f7436e - skip);
        }
        return skip;
    }
}
