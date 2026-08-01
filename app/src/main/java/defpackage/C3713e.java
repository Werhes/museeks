package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3713e implements InterfaceC2537e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f8297e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ByteBuffer f8298e;

    public C3713e(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        this.f8298e = slice;
        this.f8297e = slice.capacity();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        ByteBuffer byteBuffer = this.f8298e;
        int position = byteBuffer.position();
        int i = this.f8297e;
        if (position == i) {
            return -1L;
        }
        int position2 = (int) (byteBuffer.position() + j);
        if (position2 <= i) {
            i = position2;
        }
        byteBuffer.limit(i);
        return c16151e.write(byteBuffer);
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return C1930e.license;
    }
}
