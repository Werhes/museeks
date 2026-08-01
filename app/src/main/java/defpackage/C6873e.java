package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6873e extends UploadDataProvider {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f14116e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC2556e f14117e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public volatile FileChannel f14118e;

    public C6873e(InterfaceC2556e interfaceC2556e) {
        this.f14117e = interfaceC2556e;
    }

    public final FileChannel ad() {
        if (this.f14118e == null) {
            synchronized (this.f14116e) {
                try {
                    if (this.f14118e == null) {
                        this.f14118e = this.f14117e.adcel();
                    }
                } finally {
                }
            }
        }
        return this.f14118e;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileChannel fileChannel = this.f14118e;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return ad().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel ad = ad();
        int i = 0;
        while (i == 0) {
            int read = ad.read(byteBuffer);
            if (read == -1) {
                break;
            } else {
                i += read;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        ad().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
