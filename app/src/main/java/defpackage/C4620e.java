package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4620e extends InputStream {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f9947e = 1073741824;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InputStream f9948e;

    public C4620e(InputStream inputStream) {
        this.f9948e = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f9947e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9948e.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f9948e.read();
        if (read == -1) {
            this.f9947e = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.f9948e.read(bArr);
        if (read == -1) {
            this.f9947e = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f9948e.read(bArr, i, i2);
        if (read == -1) {
            this.f9947e = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f9948e.skip(j);
    }
}
