package defpackage;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: eؕۢٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3704e extends AbstractC9907e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f8289e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f8290e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f8291e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f8292e;

    public C3704e(InputStream inputStream, int i) {
        super(inputStream, i);
        this.f8289e = false;
        this.f8292e = true;
        this.f8290e = inputStream.read();
        int read = inputStream.read();
        this.f8291e = read;
        if (read < 0) {
            throw new EOFException();
        }
        license();
    }

    public final boolean license() {
        if (!this.f8289e && this.f8292e && this.f8290e == 0 && this.f8291e == 0) {
            this.f8289e = true;
            ad();
        }
        return this.f8289e;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (license()) {
            return -1;
        }
        int read = this.f19545e.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i = this.f8290e;
        this.f8290e = this.f8291e;
        this.f8291e = read;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f8292e || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f8289e) {
            return -1;
        }
        InputStream inputStream = this.f19545e;
        int read = inputStream.read(bArr, i + 2, i2 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.f8290e;
        bArr[i + 1] = (byte) this.f8291e;
        this.f8290e = inputStream.read();
        int read2 = inputStream.read();
        this.f8291e = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new EOFException();
    }
}
