package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2527e extends FilterInputStream {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f6375e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f6376e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2527e(InputStream inputStream, int i) {
        super(inputStream);
        this.f6377e = i;
        switch (i) {
            case 1:
                super(inputStream);
                this.f6376e = 0L;
                this.f6375e = 0L;
                return;
            default:
                this.f6375e = -1L;
                this.f6376e = 1048577L;
                return;
        }
    }

    private final synchronized void advert() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f6375e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f6376e = this.f6375e;
    }

    private final synchronized void license(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f6375e = this.f6376e;
    }

    private final synchronized void loadAd() {
        super.reset();
        synchronized (this) {
            this.f6375e = this.f6376e;
        }
    }

    private final synchronized void purchase(int i) {
        super.mark(i);
        this.f6376e = this.f6375e;
    }

    public synchronized void ad(long j) {
        if (j >= 0) {
            this.f6375e += j;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.f6377e) {
            case 0:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f6376e);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        switch (this.f6377e) {
            case 0:
                license(i);
                return;
            default:
                purchase(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.f6377e) {
            case 0:
                if (this.f6376e == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read();
                if (read != -1) {
                    this.f6376e--;
                }
                return read;
            default:
                int read2 = super.read();
                ad(1L);
                return read2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.f6377e) {
            case 0:
                long j = this.f6376e;
                if (j == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                if (read != -1) {
                    this.f6376e -= read;
                }
                return read;
            default:
                int read2 = super.read(bArr, i, i2);
                ad(read2);
                return read2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        switch (this.f6377e) {
            case 0:
                advert();
                return;
            default:
                loadAd();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        switch (this.f6377e) {
            case 0:
                long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f6376e));
                this.f6376e -= skip;
                return skip;
            default:
                long skip2 = super.skip(j);
                ad(skip2);
                return skip2;
        }
    }
}
