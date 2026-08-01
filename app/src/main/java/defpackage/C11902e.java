package defpackage;

import javax.crypto.Cipher;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11902e implements InterfaceC2537e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f23844e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f23845e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Cipher f23846e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C16151e f23847e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13197e f23848e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f23849e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِٖۢ, java.lang.Object] */
    public C11902e(C13197e c13197e, Cipher cipher) {
        this.f23848e = c13197e;
        this.f23846e = cipher;
        int blockSize = cipher.getBlockSize();
        this.f23845e = blockSize;
        this.f23847e = new Object();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23849e = true;
        this.f23848e.close();
    }

    @Override // defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        C16151e c16151e2;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount < 0: ").toString());
        }
        if (this.f23849e) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        while (true) {
            c16151e2 = this.f23847e;
            if (c16151e2.f31731e != 0 || this.f23844e) {
                break;
            }
            C13197e c13197e = this.f23848e;
            boolean yandex = c13197e.yandex();
            Cipher cipher = this.f23846e;
            if (yandex) {
                this.f23844e = true;
                int outputSize = cipher.getOutputSize(0);
                if (outputSize != 0) {
                    C16592e m4130implements = c16151e2.m4130implements(outputSize);
                    int doFinal = cipher.doFinal(m4130implements.ad, m4130implements.vip);
                    int i = m4130implements.metrica + doFinal;
                    m4130implements.metrica = i;
                    c16151e2.f31731e += doFinal;
                    if (m4130implements.vip == i) {
                        c16151e2.f31732e = m4130implements.ad();
                        AbstractC11279e.ad(m4130implements);
                    }
                }
            } else {
                C16592e c16592e = c13197e.f26204e.f31732e;
                int i2 = c16592e.metrica - c16592e.vip;
                int outputSize2 = cipher.getOutputSize(i2);
                int i3 = i2;
                while (true) {
                    if (outputSize2 > 8192) {
                        int i4 = this.f23845e;
                        if (i3 <= i4) {
                            this.f23844e = true;
                            c16151e2.m4136write(cipher.doFinal(c13197e.mo1688interface()));
                            break;
                        }
                        i3 -= i4;
                        outputSize2 = cipher.getOutputSize(i3);
                    } else {
                        C16592e m4130implements2 = c16151e2.m4130implements(outputSize2);
                        int update = this.f23846e.update(c16592e.ad, c16592e.vip, i3, m4130implements2.ad, m4130implements2.vip);
                        c13197e.skip(i3);
                        int i5 = m4130implements2.metrica + update;
                        m4130implements2.metrica = i5;
                        c16151e2.f31731e += update;
                        if (m4130implements2.vip == i5) {
                            c16151e2.f31732e = m4130implements2.ad();
                            AbstractC11279e.ad(m4130implements2);
                        }
                    }
                }
            }
        }
        return c16151e2.signatures(c16151e, j);
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return this.f23848e.f26205e.startapp();
    }
}
