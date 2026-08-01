package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.Channel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٞۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5790e implements ByteChannel, Channel, Closeable, ReadableByteChannel, WritableByteChannel {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f12238e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f12239e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public ByteBuffer f12240e;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12239e = false;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f12239e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f12240e;
        if (!byteBuffer2.hasRemaining() || this.f12238e <= 0) {
            return -1;
        }
        int min = Math.min(Math.min(byteBuffer2.remaining(), byteBuffer.remaining()), this.f12238e);
        ByteBuffer duplicate = byteBuffer2.duplicate();
        int position = byteBuffer2.position() + min;
        duplicate.limit(position);
        byteBuffer2.position(position);
        byteBuffer.put(duplicate);
        this.f12238e = Math.max(this.f12238e, byteBuffer2.position());
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f12240e;
        int min = Math.min(byteBuffer2.remaining(), byteBuffer.remaining());
        ByteBuffer duplicate = byteBuffer.duplicate();
        int position = byteBuffer.position() + min;
        duplicate.limit(position);
        byteBuffer.position(position);
        byteBuffer2.put(duplicate);
        this.f12238e = Math.max(this.f12238e, byteBuffer2.position());
        return min;
    }
}
