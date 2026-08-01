package defpackage;

/* renamed from: eً۟ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8236e extends AbstractC17551e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f16728e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f16729e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f16730e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f16731e = 0;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C0462e f16732e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f16733e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f16734e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public byte[] f16735e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public byte[] f16736e;

    public C8236e(C0462e c0462e) {
        super(c0462e);
        this.f16734e = 0;
        this.f16732e = c0462e;
        this.f16733e = 16;
        this.f16729e = 16;
        this.f16728e = new byte[16];
    }

    public /* synthetic */ C8236e(InterfaceC2227e interfaceC2227e) {
        super(interfaceC2227e);
    }

    @Override // defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        switch (this.f16731e) {
            case 0:
                this.f16732e.getClass();
                return "GOST3412_2015/GCTR";
            default:
                this.f16732e.getClass();
                return "GOST3412_2015/OFB";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r7.init(true, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r8 != null) goto L15;
     */
    @Override // defpackage.InterfaceC2227e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void init(boolean r7, defpackage.InterfaceC3894e r8) {
        /*
            r6 = this;
            int r7 = r6.f16731e
            switch(r7) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            eؑٞۛ r7 = r6.f16732e
            int r0 = r6.f16733e
            boolean r1 = r8 instanceof defpackage.C11494e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            eِٟؔ r8 = (defpackage.C11494e) r8
            byte[] r1 = r8.f23095e
            int r4 = r1.length
            if (r4 < r0) goto L32
            int r0 = r1.length
            r6.f16729e = r0
            byte[] r4 = new byte[r0]
            r6.f16728e = r4
            byte[] r0 = new byte[r0]
            r6.f16736e = r0
            byte[] r0 = defpackage.AbstractC12442e.license(r1)
            r6.f16736e = r0
            byte[] r1 = r6.f16728e
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r3, r4)
            eٟؖؖ r8 = r8.f23094e
            if (r8 == 0) goto L4f
            goto L4c
        L32:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Parameter m must blockSize <= m"
            r7.<init>(r8)
            throw r7
        L3a:
            int r0 = r0 * 2
            r6.f16729e = r0
            byte[] r1 = new byte[r0]
            r6.f16728e = r1
            byte[] r0 = new byte[r0]
            r6.f16736e = r0
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r3, r4)
            if (r8 == 0) goto L4f
        L4c:
            r7.init(r2, r8)
        L4f:
            r6.f16730e = r2
            return
        L52:
            int r7 = r6.f16729e
            eؑٞۛ r0 = r6.f16732e
            int r1 = r6.f16733e
            boolean r2 = r8 instanceof defpackage.C11494e
            r3 = 1
            if (r2 == 0) goto L9d
            eِٟؔ r8 = (defpackage.C11494e) r8
            int r2 = r1 / 2
            byte[] r2 = new byte[r2]
            r6.f16736e = r2
            byte[] r2 = new byte[r1]
            r6.f16728e = r2
            byte[] r7 = new byte[r7]
            r6.f16735e = r7
            byte[] r7 = r8.f23095e
            byte[] r7 = defpackage.AbstractC12442e.license(r7)
            r6.f16736e = r7
            int r2 = r7.length
            int r4 = r1 / 2
            if (r2 != r4) goto L95
            byte[] r2 = r6.f16728e
            int r4 = r7.length
            r5 = 0
            java.lang.System.arraycopy(r7, r5, r2, r5, r4)
            byte[] r7 = r6.f16736e
            int r7 = r7.length
        L84:
            if (r7 >= r1) goto L8d
            byte[] r2 = r6.f16728e
            r2[r7] = r5
            int r7 = r7 + 1
            goto L84
        L8d:
            eٟؖؖ r7 = r8.f23094e
            if (r7 == 0) goto Lb0
            r0.init(r3, r7)
            goto Lb0
        L95:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Parameter IV length must be == blockSize/2"
            r7.<init>(r8)
            throw r7
        L9d:
            int r2 = r1 / 2
            byte[] r2 = new byte[r2]
            r6.f16736e = r2
            byte[] r1 = new byte[r1]
            r6.f16728e = r1
            byte[] r7 = new byte[r7]
            r6.f16735e = r7
            if (r8 == 0) goto Lb0
            r0.init(r3, r8)
        Lb0:
            r6.f16730e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8236e.init(boolean, eٟؖؖ):void");
    }

    @Override // defpackage.InterfaceC2227e
    public final int isPro() {
        switch (this.f16731e) {
            case 0:
                return this.f16729e;
            default:
                return this.f16733e;
        }
    }

    @Override // defpackage.InterfaceC2227e
    public final void reset() {
        switch (this.f16731e) {
            case 0:
                if (this.f16730e) {
                    byte[] bArr = this.f16736e;
                    System.arraycopy(bArr, 0, this.f16728e, 0, bArr.length);
                    for (int length = this.f16736e.length; length < this.f16733e; length++) {
                        this.f16728e[length] = 0;
                    }
                    this.f16734e = 0;
                    this.f16732e.getClass();
                    return;
                }
                return;
            default:
                if (this.f16730e) {
                    byte[] bArr2 = this.f16736e;
                    System.arraycopy(bArr2, 0, this.f16728e, 0, bArr2.length);
                    AbstractC12442e.metrica(this.f16735e);
                    this.f16734e = 0;
                    this.f16732e.getClass();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC2227e
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        switch (this.f16731e) {
            case 0:
                processBytes(bArr, i, this.f16729e, bArr2, i2);
                return this.f16729e;
            default:
                processBytes(bArr, i, this.f16733e, bArr2, i2);
                return this.f16733e;
        }
    }

    @Override // defpackage.AbstractC17551e
    public final byte vip(byte b) {
        switch (this.f16731e) {
            case 0:
                int i = this.f16729e;
                if (this.f16734e == 0) {
                    byte[] bArr = this.f16728e;
                    byte[] bArr2 = new byte[bArr.length];
                    this.f16732e.tapsense(0, 0, bArr, bArr2);
                    this.f16735e = AbstractC12442e.Signature(i, bArr2);
                }
                byte[] bArr3 = this.f16735e;
                int i2 = this.f16734e;
                byte b2 = (byte) (b ^ bArr3[i2]);
                int i3 = i2 + 1;
                this.f16734e = i3;
                if (i3 == i) {
                    this.f16734e = 0;
                    byte[] bArr4 = this.f16728e;
                    int length = bArr4.length - 1;
                    bArr4[length] = (byte) (bArr4[length] + 1);
                }
                return b2;
            default:
                int i4 = this.f16733e;
                byte[] bArr5 = this.f16735e;
                if (this.f16734e == 0) {
                    this.f16732e.tapsense(0, 0, AbstractC12442e.Signature(i4, this.f16728e), bArr5);
                }
                int i5 = this.f16734e;
                byte b3 = (byte) (b ^ bArr5[i5]);
                int i6 = i5 + 1;
                this.f16734e = i6;
                if (i6 == i4) {
                    this.f16734e = 0;
                    byte[] bArr6 = this.f16728e;
                    int i7 = this.f16729e - i4;
                    byte[] bArr7 = new byte[i7];
                    System.arraycopy(bArr6, bArr6.length - i7, bArr7, 0, i7);
                    System.arraycopy(bArr7, 0, this.f16728e, 0, i7);
                    System.arraycopy(bArr5, 0, this.f16728e, i7, this.f16729e - i7);
                }
                return b3;
        }
    }
}
