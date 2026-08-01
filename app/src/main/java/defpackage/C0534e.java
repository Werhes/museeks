package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۙۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534e extends InputStream {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2435e f2691e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC9660e f2693e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f2692e = false;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f2689e = false;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f2690e = new byte[1];

    public C0534e(InterfaceC9660e interfaceC9660e, C2435e c2435e) {
        this.f2693e = interfaceC9660e;
        this.f2691e = c2435e;
    }

    public final void ad() {
        if (this.f2692e) {
            return;
        }
        this.f2693e.metrica(this.f2691e);
        this.f2692e = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2689e) {
            return;
        }
        this.f2693e.close();
        this.f2689e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f2690e;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        AbstractC2301e.subscription(!this.f2689e);
        ad();
        int read = this.f2693e.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
