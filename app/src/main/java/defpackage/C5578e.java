package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5578e extends AbstractC0453e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f11930e;

    public C5578e() {
        super(2048);
        this.f11930e = 4098;
    }

    @Override // defpackage.AbstractC0453e
    public final Object ad(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @Override // defpackage.AbstractC0453e
    public final void advert(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (byteBuffer.capacity() != this.f11930e) {
            throw new IllegalStateException("Check failed.");
        }
        if (byteBuffer.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // defpackage.AbstractC0453e
    public final Object license() {
        return ByteBuffer.allocate(this.f11930e);
    }
}
