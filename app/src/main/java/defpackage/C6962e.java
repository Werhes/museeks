package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6962e extends AbstractC11130e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f14259e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f14260e;

    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public final void m2263e(int i) {
        ((ByteBuffer) this.f22046e).rewind();
        ByteBuffer byteBuffer = (ByteBuffer) this.f22046e;
        byteBuffer.position(byteBuffer.position() + 8);
        for (int i2 = 0; i2 < this.f14260e; i2++) {
            int i3 = ((ByteBuffer) this.f22046e).getInt() + i;
            ((ByteBuffer) this.f22046e).position(r2.position() - 4);
            ((ByteBuffer) this.f22046e).putInt(i3);
        }
    }
}
