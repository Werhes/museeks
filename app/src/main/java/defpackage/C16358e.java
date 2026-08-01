package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16358e extends OutputStream {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f32153e = false;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final FileOutputStream f32154e;

    public C16358e(File file) {
        this.f32154e = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.f32154e;
        if (this.f32153e) {
            return;
        }
        this.f32153e = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e) {
            AbstractC2803e.amazon("AtomicFile", "Failed to sync file descriptor:", e);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f32154e.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f32154e.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f32154e.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f32154e.write(bArr, i, i2);
    }
}
