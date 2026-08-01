package defpackage;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: eًؙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7741e extends OutputStream {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f15711e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15712e;

    public /* synthetic */ C7741e(int i) {
        this.f15712e = i;
    }

    public C7741e(C9674e c9674e) {
        this.f15712e = 3;
        this.f15711e = c9674e;
    }

    public /* synthetic */ C7741e(Closeable closeable, int i) {
        this.f15712e = i;
        this.f15711e = closeable;
    }

    private final void ad() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f15712e) {
            case 3:
                ((C9674e) this.f15711e).close();
                return;
            case 4:
            default:
                super.close();
                return;
            case 5:
                return;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        switch (this.f15712e) {
            case 3:
                C9674e c9674e = (C9674e) this.f15711e;
                if (c9674e.f19171e) {
                    return;
                }
                c9674e.flush();
                return;
            case 4:
            default:
                super.flush();
                return;
            case 5:
                ((FileOutputStream) this.f15711e).flush();
                return;
        }
    }

    public String toString() {
        switch (this.f15712e) {
            case 3:
                return ((C9674e) this.f15711e) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.f15712e) {
            case 0:
                ((C12013e) this.f15711e).update((byte) i);
                return;
            case 1:
                ((C10398e) this.f15711e).update((byte) i);
                return;
            case 2:
                ((RandomAccessFile) this.f15711e).write(i);
                return;
            case 3:
                C9674e c9674e = (C9674e) this.f15711e;
                if (c9674e.f19171e) {
                    throw new IOException("closed");
                }
                c9674e.f19172e.m4128final((byte) i);
                c9674e.ad();
                return;
            case 4:
                try {
                    ((Signature) this.f15711e).update((byte) i);
                    return;
                } catch (SignatureException e) {
                    throw AbstractC15890e.metrica(e.getMessage(), e);
                }
            default:
                ((FileOutputStream) this.f15711e).write(i);
                return;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.f15712e) {
            case 4:
                try {
                    ((Signature) this.f15711e).update(bArr);
                    return;
                } catch (SignatureException e) {
                    throw AbstractC15890e.metrica(e.getMessage(), e);
                }
            case 5:
                ((FileOutputStream) this.f15711e).write(bArr);
                return;
            default:
                super.write(bArr);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        switch (this.f15712e) {
            case 0:
                ((C12013e) this.f15711e).update(bArr, i, i2);
                return;
            case 1:
                ((C10398e) this.f15711e).update(bArr, i, i2);
                return;
            case 2:
                ((RandomAccessFile) this.f15711e).write(bArr, i, i2);
                return;
            case 3:
                C9674e c9674e = (C9674e) this.f15711e;
                if (c9674e.f19171e) {
                    throw new IOException("closed");
                }
                c9674e.f19172e.write(bArr, i, i2);
                c9674e.ad();
                return;
            case 4:
                try {
                    ((Signature) this.f15711e).update(bArr, i, i2);
                    return;
                } catch (SignatureException e) {
                    throw AbstractC15890e.metrica(e.getMessage(), e);
                }
            default:
                ((FileOutputStream) this.f15711e).write(bArr, i, i2);
                return;
        }
    }
}
