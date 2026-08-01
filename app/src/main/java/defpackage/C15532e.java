package defpackage;

import java.util.zip.Inflater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15532e implements InterfaceC2537e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f30671e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Inflater f30672e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f30673e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC4895e f30674e;

    public C15532e(InterfaceC4895e interfaceC4895e, Inflater inflater) {
        this.f30674e = interfaceC4895e;
        this.f30672e = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f30673e) {
            return;
        }
        this.f30672e.end();
        this.f30673e = true;
        this.f30674e.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[SYNTHETIC] */
    @Override // defpackage.InterfaceC2537e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long signatures(defpackage.C16151e r11, long r12) {
        /*
            r10 = this;
        L0:
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto Lae
            boolean r3 = r10.f30673e
            if (r3 != 0) goto La6
            eؗٔۙ r3 = r10.f30674e
            java.util.zip.Inflater r4 = r10.f30672e
            if (r2 != 0) goto L11
            goto L7a
        L11:
            r2 = 1
            eٖۣؗ r2 = r11.m4130implements(r2)     // Catch: java.util.zip.DataFormatException -> L69
            int r5 = r2.metrica     // Catch: java.util.zip.DataFormatException -> L69
            int r5 = 8192 - r5
            long r5 = (long) r5     // Catch: java.util.zip.DataFormatException -> L69
            long r5 = java.lang.Math.min(r12, r5)     // Catch: java.util.zip.DataFormatException -> L69
            int r5 = (int) r5     // Catch: java.util.zip.DataFormatException -> L69
            boolean r6 = r4.needsInput()     // Catch: java.util.zip.DataFormatException -> L69
            if (r6 != 0) goto L27
            goto L40
        L27:
            boolean r6 = r3.yandex()     // Catch: java.util.zip.DataFormatException -> L69
            if (r6 == 0) goto L2e
            goto L40
        L2e:
            eِٖۢ r6 = r3.metrica()     // Catch: java.util.zip.DataFormatException -> L69
            eٖۣؗ r6 = r6.f31732e     // Catch: java.util.zip.DataFormatException -> L69
            int r7 = r6.metrica     // Catch: java.util.zip.DataFormatException -> L69
            int r8 = r6.vip     // Catch: java.util.zip.DataFormatException -> L69
            int r7 = r7 - r8
            r10.f30671e = r7     // Catch: java.util.zip.DataFormatException -> L69
            byte[] r6 = r6.ad     // Catch: java.util.zip.DataFormatException -> L69
            r4.setInput(r6, r8, r7)     // Catch: java.util.zip.DataFormatException -> L69
        L40:
            byte[] r6 = r2.ad     // Catch: java.util.zip.DataFormatException -> L69
            int r7 = r2.metrica     // Catch: java.util.zip.DataFormatException -> L69
            int r5 = r4.inflate(r6, r7, r5)     // Catch: java.util.zip.DataFormatException -> L69
            int r6 = r10.f30671e     // Catch: java.util.zip.DataFormatException -> L69
            if (r6 != 0) goto L4d
            goto L5b
        L4d:
            int r7 = r4.getRemaining()     // Catch: java.util.zip.DataFormatException -> L69
            int r6 = r6 - r7
            int r7 = r10.f30671e     // Catch: java.util.zip.DataFormatException -> L69
            int r7 = r7 - r6
            r10.f30671e = r7     // Catch: java.util.zip.DataFormatException -> L69
            long r6 = (long) r6     // Catch: java.util.zip.DataFormatException -> L69
            r3.skip(r6)     // Catch: java.util.zip.DataFormatException -> L69
        L5b:
            if (r5 <= 0) goto L6b
            int r6 = r2.metrica     // Catch: java.util.zip.DataFormatException -> L69
            int r6 = r6 + r5
            r2.metrica = r6     // Catch: java.util.zip.DataFormatException -> L69
            long r6 = r11.f31731e     // Catch: java.util.zip.DataFormatException -> L69
            long r8 = (long) r5     // Catch: java.util.zip.DataFormatException -> L69
            long r6 = r6 + r8
            r11.f31731e = r6     // Catch: java.util.zip.DataFormatException -> L69
            goto L7b
        L69:
            r11 = move-exception
            goto La0
        L6b:
            int r5 = r2.vip     // Catch: java.util.zip.DataFormatException -> L69
            int r6 = r2.metrica     // Catch: java.util.zip.DataFormatException -> L69
            if (r5 != r6) goto L7a
            eٖۣؗ r5 = r2.ad()     // Catch: java.util.zip.DataFormatException -> L69
            r11.f31732e = r5     // Catch: java.util.zip.DataFormatException -> L69
            defpackage.AbstractC11279e.ad(r2)     // Catch: java.util.zip.DataFormatException -> L69
        L7a:
            r8 = r0
        L7b:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L80
            return r8
        L80:
            boolean r0 = r4.finished()
            if (r0 != 0) goto L9d
            boolean r0 = r4.needsDictionary()
            if (r0 == 0) goto L8d
            goto L9d
        L8d:
            boolean r0 = r3.yandex()
            if (r0 != 0) goto L95
            goto L0
        L95:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r12 = "source exhausted prematurely"
            r11.<init>(r12)
            throw r11
        L9d:
            r11 = -1
            return r11
        La0:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            throw r12
        La6:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "closed"
            r11.<init>(r12)
            throw r11
        Lae:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r11 = defpackage.AbstractC0869e.isVip(r12, r11)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15532e.signatures(eِٖۢ, long):long");
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return this.f30674e.startapp();
    }
}
