package defpackage;

import java.security.SecureRandom;

/* renamed from: eٕؕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15228e extends SecureRandom {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC16186e f30129e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f30130e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public InterfaceC10898e f30131e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC17771e f30132e;

    public C15228e(InterfaceC16186e interfaceC16186e, InterfaceC17771e interfaceC17771e, boolean z) {
        this.f30129e = interfaceC16186e;
        this.f30132e = interfaceC17771e;
        this.f30130e = z;
    }

    public final void ad(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.f30131e == null) {
                    this.f30131e = this.f30132e.Signature(this.f30129e);
                }
                this.f30131e.license(bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom
    public final byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        int i2 = i * 8;
        InterfaceC16186e interfaceC16186e = this.f30129e;
        if (i2 <= interfaceC16186e.entropySize()) {
            System.arraycopy(interfaceC16186e.getEntropy(), 0, bArr, 0, i);
            return bArr;
        }
        int entropySize = interfaceC16186e.entropySize() / 8;
        for (int i3 = 0; i3 < i; i3 += entropySize) {
            byte[] entropy = interfaceC16186e.getEntropy();
            int i4 = i - i3;
            if (entropy.length <= i4) {
                System.arraycopy(entropy, 0, bArr, i3, entropy.length);
            } else {
                System.arraycopy(entropy, 0, bArr, i3, i4);
            }
        }
        return bArr;
    }

    @Override // java.security.SecureRandom
    public final String getAlgorithm() {
        return this.f30132e.getAlgorithm();
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.f30131e == null) {
                    this.f30131e = this.f30132e.Signature(this.f30129e);
                }
                if (this.f30131e.ad(this.f30130e, bArr) < 0) {
                    this.f30131e.license(null);
                    this.f30131e.ad(this.f30130e, bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        synchronized (this) {
        }
    }

    @Override // java.security.SecureRandom
    public final void setSeed(byte[] bArr) {
        synchronized (this) {
        }
    }
}
