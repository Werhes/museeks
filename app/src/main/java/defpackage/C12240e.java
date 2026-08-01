package defpackage;

import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12240e implements ReadableByteChannel {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f24570e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f24571e = new ArrayList();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10312e f24572e;

    public C12240e(C10312e c10312e) {
        this.f24572e = c10312e;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24570e = true;
        this.f24571e.clear();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f24570e && ((C5790e) this.f24572e.f20361e).f12239e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        r3 = (java.nio.ByteBuffer) r2.get(0);
        r4 = java.lang.Math.min(r8.remaining(), r3.remaining());
        r5 = r3.duplicate();
        r6 = r3.position() + r4;
        r5.limit(r6);
        r3.position(r6);
        r8.put(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r3.hasRemaining() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r2.remove(0);
     */
    @Override // java.nio.channels.ReadableByteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r8.hasRemaining()
            if (r2 == 0) goto L6f
        L8:
            java.util.ArrayList r2 = r7.f24571e
            int r3 = r2.size()
            if (r3 != 0) goto L40
            eَٗٞ r2 = r7.f24572e
            java.lang.Object r3 = r2.f20361e
            eؘٞۖ r3 = (defpackage.C5790e) r3
            eٓٚؒ r3 = defpackage.C10312e.premium(r3)
            if (r3 != 0) goto L21
            if (r1 <= 0) goto L1f
            goto L6f
        L1f:
            r8 = -1
            return r8
        L21:
            java.lang.Object r2 = r2.f20360e
            java.util.HashMap r2 = (java.util.HashMap) r2
            int r4 = r3.f27819e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.get(r4)
            eّؔۤ r2 = (defpackage.C12240e) r2
            if (r2 == 0) goto L8
            boolean r4 = r2.f24570e
            if (r4 == 0) goto L38
            goto L8
        L38:
            java.util.ArrayList r2 = r2.f24571e
            java.nio.ByteBuffer r3 = r3.f27820e
            r2.add(r3)
            goto L8
        L40:
            java.lang.Object r3 = r2.get(r0)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r4 = r8.remaining()
            int r5 = r3.remaining()
            int r4 = java.lang.Math.min(r4, r5)
            java.nio.ByteBuffer r5 = r3.duplicate()
            int r6 = r3.position()
            int r6 = r6 + r4
            r5.limit(r6)
            r3.position(r6)
            r8.put(r5)
            boolean r3 = r3.hasRemaining()
            if (r3 != 0) goto L6d
            r2.remove(r0)
        L6d:
            int r1 = r1 + r4
            goto L2
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12240e.read(java.nio.ByteBuffer):int");
    }
}
