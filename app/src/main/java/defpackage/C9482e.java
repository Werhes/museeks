package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: eٍِٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9482e extends AbstractC9907e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final byte[] f18830e = new byte[0];

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f18831e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f18832e;

    public C9482e(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            ad();
        }
        this.f18831e = i;
        this.f18832e = i;
    }

    public final byte[] license() {
        int i = this.f18832e;
        if (i == 0) {
            return f18830e;
        }
        int i2 = this.f19544e;
        if (i >= i2) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f18832e + " >= " + i2);
        }
        byte[] bArr = new byte[i];
        int license = i - AbstractC9460e.license(this.f19545e, bArr, 0, i);
        this.f18832e = license;
        if (license == 0) {
            ad();
            return bArr;
        }
        throw new EOFException("DEF length " + this.f18831e + " object truncated by " + this.f18832e);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f18832e == 0) {
            return -1;
        }
        int read = this.f19545e.read();
        if (read >= 0) {
            int i = this.f18832e - 1;
            this.f18832e = i;
            if (i == 0) {
                ad();
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f18831e + " object truncated by " + this.f18832e);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f18832e;
        if (i3 == 0) {
            return -1;
        }
        int read = this.f19545e.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.f18832e - read;
            this.f18832e = i4;
            if (i4 == 0) {
                ad();
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f18831e + " object truncated by " + this.f18832e);
    }
}
