package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ۠ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C7507e extends AbstractC9615e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public ByteBuffer f15296e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C16975e f15297e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public ByteBuffer f15298e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0579e f15299e = new C0579e();

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f15300e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f15301e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f15302e;

    static {
        AbstractC1418e.ad("media3.decoder");
    }

    public C7507e(int i) {
        this.f15300e = i;
    }

    public final ByteBuffer Signature(int i) {
        int i2 = this.f15300e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f15296e;
        throw new IllegalStateException(AbstractC8647e.inmobi(byteBuffer == null ? 0 : byteBuffer.capacity(), i, "Buffer too small (", " < ", ")"));
    }

    public final void admob(int i) {
        ByteBuffer byteBuffer = this.f15296e;
        if (byteBuffer == null) {
            this.f15296e = Signature(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.f15296e = byteBuffer;
            return;
        }
        ByteBuffer Signature = Signature(i2);
        Signature.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            Signature.put(byteBuffer);
        }
        this.f15296e = Signature;
    }

    public void amazon() {
        this.f19062e = 0;
        ByteBuffer byteBuffer = this.f15296e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f15298e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f15302e = false;
    }

    public final void subscription() {
        ByteBuffer byteBuffer = this.f15296e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f15298e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
