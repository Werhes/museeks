package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؑؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0653e extends UploadDataProvider {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ByteBuffer f2913e;

    public C0653e(ByteBuffer byteBuffer) {
        this.f2913e = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f2913e.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f2913e;
        if (remaining >= byteBuffer2.remaining()) {
            byteBuffer.put(byteBuffer2);
        } else {
            int limit = byteBuffer2.limit();
            byteBuffer.put(byteBuffer2);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindSucceeded();
    }
}
