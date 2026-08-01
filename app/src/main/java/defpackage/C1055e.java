package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: eؒٓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1055e extends OutputStream {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final OutputStream f3553e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final FilterOutputStream f3554e;

    public C1055e(FilterOutputStream filterOutputStream, OutputStream outputStream) {
        this.f3554e = filterOutputStream;
        this.f3553e = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3554e.close();
        this.f3553e.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f3554e.flush();
        this.f3553e.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f3554e.write(i);
        this.f3553e.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f3554e.write(bArr);
        this.f3553e.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f3554e.write(bArr, i, i2);
        this.f3553e.write(bArr, i, i2);
    }
}
