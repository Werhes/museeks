package defpackage;

import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: eُْٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13193e extends FilterInputStream {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f26196e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f26197e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f26198e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f26199e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cipher f26200e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f26201e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f26202e;

    public C13193e(DataInputStream dataInputStream, Cipher cipher) {
        super(dataInputStream);
        this.f26198e = new byte[AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE];
        this.f26197e = false;
        this.f26199e = false;
        this.f26200e = cipher;
    }

    public final byte[] ad() {
        try {
            if (!this.f26199e) {
                license();
            }
            if (this.f26197e) {
                return null;
            }
            this.f26197e = true;
            return this.f26200e.doFinal();
        } catch (GeneralSecurityException e) {
            throw new Cclass("Error finalising cipher", e, 2);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return this.f26202e - this.f26201e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterInputStream) this).in.close();
            this.f26201e = 0;
            this.f26202e = 0;
        } finally {
            if (!this.f26197e) {
                ad();
            }
        }
    }

    public final int license() {
        if (!this.f26197e) {
            this.f26199e = true;
            this.f26201e = 0;
            this.f26202e = 0;
            while (true) {
                int i = this.f26202e;
                if (i != 0) {
                    return i;
                }
                int read = ((FilterInputStream) this).in.read(this.f26198e);
                if (read == -1) {
                    byte[] ad = ad();
                    this.f26196e = ad;
                    if (ad != null && ad.length != 0) {
                        int length = ad.length;
                        this.f26202e = length;
                        return length;
                    }
                } else {
                    byte[] update = this.f26200e.update(this.f26198e, 0, read);
                    this.f26196e = update;
                    if (update != null) {
                        this.f26202e = update.length;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f26201e >= this.f26202e && license() < 0) {
            return -1;
        }
        byte[] bArr = this.f26196e;
        int i = this.f26201e;
        this.f26201e = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f26201e >= this.f26202e && license() < 0) {
            return -1;
        }
        int min = Math.min(i2, available());
        System.arraycopy(this.f26196e, this.f26201e, bArr, i, min);
        this.f26201e += min;
        return min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        int min = (int) Math.min(j, available());
        this.f26201e += min;
        return min;
    }
}
