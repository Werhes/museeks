package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۜ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10551e {
    public long appmetrica;
    public long license;
    public final ByteBuffer ad = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    public final int vip = 16;
    public final int metrica = 16;
    public int purchase = 0;

    public C10551e() {
        long j = 0;
        this.license = j;
        this.appmetrica = j;
    }

    public final void ad() {
        ByteBuffer byteBuffer = this.ad;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.metrica) {
            vip(byteBuffer);
        }
        byteBuffer.compact();
    }

    public final C10551e metrica(byte[] bArr) {
        ByteBuffer order = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int remaining = order.remaining();
        ByteBuffer byteBuffer = this.ad;
        if (remaining <= byteBuffer.remaining()) {
            byteBuffer.put(order);
            if (byteBuffer.remaining() < 8) {
                ad();
            }
            return this;
        }
        int position = this.vip - byteBuffer.position();
        for (int i = 0; i < position; i++) {
            byteBuffer.put(order.get());
        }
        ad();
        while (order.remaining() >= this.metrica) {
            vip(order);
        }
        byteBuffer.put(order);
        return this;
    }

    public final void vip(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long rotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.license;
        this.license = rotateLeft;
        long rotateLeft2 = Long.rotateLeft(rotateLeft, 27);
        long j3 = this.appmetrica;
        this.license = ((rotateLeft2 + j3) * 5) + 1390208809;
        long rotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.appmetrica = rotateLeft3;
        this.appmetrica = ((Long.rotateLeft(rotateLeft3, 31) + this.license) * 5) + 944331445;
        this.purchase += 16;
    }
}
