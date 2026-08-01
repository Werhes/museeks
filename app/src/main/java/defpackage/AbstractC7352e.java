package defpackage;

import java.nio.ByteBuffer;
import java.util.zip.Checksum;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7352e {
    static {
        new C5621e("encoder-deflate-writer");
        new C5621e("encoder-deflate-reader");
    }

    public static final void ad(Checksum checksum, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed");
        }
        checksum.update(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }
}
