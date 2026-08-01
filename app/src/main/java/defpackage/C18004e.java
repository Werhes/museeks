package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۛؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18004e extends MediaDataSource {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16660e f35298e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f35299e;

    public C18004e(C16660e c16660e) {
        this.f35298e = c16660e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.f35299e;
            C16660e c16660e = this.f35298e;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + c16660e.f10263e.available()) {
                    return -1;
                }
                c16660e.license(j);
                this.f35299e = j;
            }
            if (i2 > c16660e.f10263e.available()) {
                i2 = c16660e.f10263e.available();
            }
            int read = c16660e.read(bArr, i, i2);
            if (read >= 0) {
                this.f35299e += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f35299e = -1L;
        return -1;
    }
}
