package defpackage;

import java.math.BigInteger;

/* renamed from: eَّۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12759e implements InterfaceC6045e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f25525e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C7362e f25526e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public InterfaceC4243e f25527e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f25528e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public InterfaceC0293e f25529e;

    public final void ad(int i) {
        int i2;
        InterfaceC0293e interfaceC0293e = this.f25529e;
        int digestSize = interfaceC0293e.getDigestSize();
        if (i == 188) {
            byte[] bArr = this.f25525e;
            i2 = (bArr.length - digestSize) - 1;
            interfaceC0293e.doFinal(bArr, i2);
            this.f25525e[r5.length - 1] = -68;
        } else {
            byte[] bArr2 = this.f25525e;
            int length = (bArr2.length - digestSize) - 2;
            interfaceC0293e.doFinal(bArr2, length);
            byte[] bArr3 = this.f25525e;
            bArr3[bArr3.length - 2] = (byte) (i >>> 8);
            bArr3[bArr3.length - 1] = (byte) i;
            i2 = length;
        }
        this.f25525e[0] = 107;
        for (int i3 = i2 - 2; i3 != 0; i3--) {
            this.f25525e[i3] = -69;
        }
        this.f25525e[i2 - 1] = -70;
    }

    @Override // defpackage.InterfaceC6045e
    public final byte[] adcel() {
        ad(this.f25528e);
        InterfaceC4243e interfaceC4243e = this.f25527e;
        byte[] bArr = this.f25525e;
        BigInteger bigInteger = new BigInteger(1, interfaceC4243e.processBlock(bArr, 0, bArr.length));
        byte[] bArr2 = this.f25525e;
        for (int i = 0; i != bArr2.length; i++) {
            bArr2[i] = 0;
        }
        return AbstractC5907e.ad(AbstractC5907e.billing(this.f25526e.f15093e), bigInteger.min(this.f25526e.f15093e.subtract(bigInteger)));
    }

    @Override // defpackage.InterfaceC6045e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        C7362e c7362e = (C7362e) interfaceC3894e;
        this.f25526e = c7362e;
        this.f25527e.init(z, c7362e);
        this.f25525e = new byte[(this.f25526e.f15093e.bitLength() + 7) / 8];
        this.f25529e.reset();
    }

    @Override // defpackage.InterfaceC6045e
    public final void update(byte b) {
        this.f25529e.update(b);
    }

    @Override // defpackage.InterfaceC6045e
    public final void update(byte[] bArr, int i, int i2) {
        this.f25529e.update(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if ((r6.intValue() & 15) == 12) goto L9;
     */
    @Override // defpackage.InterfaceC6045e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vip(byte[] r6) {
        /*
            r5 = this;
            int r0 = r5.f25528e
            r1 = 0
            eؖٝؗ r2 = r5.f25527e     // Catch: java.lang.Exception -> L67
            int r3 = r6.length     // Catch: java.lang.Exception -> L67
            byte[] r6 = r2.processBlock(r6, r1, r3)     // Catch: java.lang.Exception -> L67
            r5.f25525e = r6     // Catch: java.lang.Exception -> L67
            java.math.BigInteger r6 = new java.math.BigInteger
            byte[] r2 = r5.f25525e
            r3 = 1
            r6.<init>(r3, r2)
            int r2 = r6.intValue()
            r2 = r2 & 15
            r3 = 12
            if (r2 != r3) goto L1f
            goto L2f
        L1f:
            eؚۖٚ r2 = r5.f25526e
            java.math.BigInteger r2 = r2.f15093e
            java.math.BigInteger r6 = r2.subtract(r6)
            int r2 = r6.intValue()
            r2 = r2 & 15
            if (r2 != r3) goto L67
        L2f:
            r5.ad(r0)
            byte[] r2 = r5.f25525e
            int r2 = r2.length
            byte[] r6 = defpackage.AbstractC5907e.ad(r2, r6)
            byte[] r2 = r5.f25525e
            boolean r2 = defpackage.AbstractC12442e.loadAd(r2, r6)
            r3 = 15052(0x3acc, float:2.1092E-41)
            if (r0 != r3) goto L52
            if (r2 != 0) goto L52
            byte[] r0 = r5.f25525e
            int r2 = r0.length
            int r2 = r2 + (-2)
            r3 = 64
            r0[r2] = r3
            boolean r2 = defpackage.AbstractC12442e.loadAd(r0, r6)
        L52:
            byte[] r0 = r5.f25525e
            r3 = r1
        L55:
            int r4 = r0.length
            if (r3 == r4) goto L5d
            r0[r3] = r1
            int r3 = r3 + 1
            goto L55
        L5d:
            r0 = r1
        L5e:
            int r3 = r6.length
            if (r0 == r3) goto L66
            r6[r0] = r1
            int r0 = r0 + 1
            goto L5e
        L66:
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12759e.vip(byte[]):boolean");
    }
}
