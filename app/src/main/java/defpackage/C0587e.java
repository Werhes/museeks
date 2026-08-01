package defpackage;

/* renamed from: eٕؑ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0587e implements InterfaceC6045e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f2777e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f2778e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public InterfaceC4243e f2779e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public byte[] f2780e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f2781e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public InterfaceC0293e f2782e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f2783e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public byte[] f2784e;

    public static void ad(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    @Override // defpackage.InterfaceC6045e
    public final byte[] adcel() {
        int i;
        int i2;
        int i3;
        int i4;
        InterfaceC0293e interfaceC0293e = this.f2782e;
        int digestSize = interfaceC0293e.getDigestSize();
        int i5 = this.f2778e;
        if (i5 == 188) {
            byte[] bArr = this.f2777e;
            i2 = (bArr.length - digestSize) - 1;
            interfaceC0293e.doFinal(bArr, i2);
            this.f2777e[r0.length - 1] = -68;
            i = 8;
        } else {
            byte[] bArr2 = this.f2777e;
            int length = (bArr2.length - digestSize) - 2;
            interfaceC0293e.doFinal(bArr2, length);
            byte[] bArr3 = this.f2777e;
            bArr3[bArr3.length - 2] = (byte) (i5 >>> 8);
            bArr3[bArr3.length - 1] = (byte) i5;
            i = 16;
            i2 = length;
        }
        int i6 = this.f2783e;
        int i7 = ((((digestSize + i6) * 8) + i) + 4) - this.f2781e;
        if (i7 > 0) {
            int i8 = i6 - ((i7 + 7) / 8);
            i3 = i2 - i8;
            System.arraycopy(this.f2784e, 0, this.f2777e, i3, i8);
            this.f2780e = new byte[i8];
            i4 = 96;
        } else {
            i3 = i2 - i6;
            System.arraycopy(this.f2784e, 0, this.f2777e, i3, i6);
            this.f2780e = new byte[this.f2783e];
            i4 = 64;
        }
        int i9 = i3 - 1;
        if (i9 > 0) {
            for (int i10 = i9; i10 != 0; i10--) {
                this.f2777e[i10] = -69;
            }
            byte[] bArr4 = this.f2777e;
            bArr4[i9] = (byte) (bArr4[i9] ^ 1);
            bArr4[0] = 11;
            bArr4[0] = (byte) (i4 | 11);
        } else {
            byte[] bArr5 = this.f2777e;
            bArr5[0] = 10;
            bArr5[0] = (byte) (i4 | 10);
        }
        InterfaceC4243e interfaceC4243e = this.f2779e;
        byte[] bArr6 = this.f2777e;
        byte[] processBlock = interfaceC4243e.processBlock(bArr6, 0, bArr6.length);
        byte[] bArr7 = this.f2784e;
        byte[] bArr8 = this.f2780e;
        System.arraycopy(bArr7, 0, bArr8, 0, bArr8.length);
        this.f2783e = 0;
        ad(this.f2784e);
        ad(this.f2777e);
        return processBlock;
    }

    @Override // defpackage.InterfaceC6045e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        InterfaceC0293e interfaceC0293e = this.f2782e;
        C7362e c7362e = (C7362e) interfaceC3894e;
        this.f2779e.init(z, c7362e);
        int bitLength = c7362e.f15093e.bitLength();
        this.f2781e = bitLength;
        this.f2777e = new byte[(bitLength + 7) / 8];
        if (this.f2778e == 188) {
            this.f2784e = new byte[(r3 - interfaceC0293e.getDigestSize()) - 2];
        } else {
            this.f2784e = new byte[(r3 - interfaceC0293e.getDigestSize()) - 3];
        }
        interfaceC0293e.reset();
        this.f2783e = 0;
        ad(this.f2784e);
        byte[] bArr = this.f2780e;
        if (bArr != null) {
            ad(bArr);
        }
        this.f2780e = null;
    }

    public final void metrica(byte[] bArr) {
        this.f2783e = 0;
        ad(this.f2784e);
        ad(bArr);
    }

    @Override // defpackage.InterfaceC6045e
    public final void update(byte b) {
        this.f2782e.update(b);
        int i = this.f2783e;
        byte[] bArr = this.f2784e;
        if (i < bArr.length) {
            bArr[i] = b;
        }
        this.f2783e = i + 1;
    }

    @Override // defpackage.InterfaceC6045e
    public final void update(byte[] bArr, int i, int i2) {
        while (i2 > 0 && this.f2783e < this.f2784e.length) {
            update(bArr[i]);
            i++;
            i2--;
        }
        this.f2782e.update(bArr, i, i2);
        this.f2783e += i2;
    }

    @Override // defpackage.InterfaceC6045e
    public final boolean vip(byte[] bArr) {
        int i;
        boolean z;
        InterfaceC0293e interfaceC0293e = this.f2782e;
        try {
            byte[] processBlock = this.f2779e.processBlock(bArr, 0, bArr.length);
            if (((processBlock[0] & 192) ^ 64) != 0) {
                metrica(processBlock);
                return false;
            }
            if (((processBlock[processBlock.length - 1] & 15) ^ 12) != 0) {
                metrica(processBlock);
                return false;
            }
            if (((processBlock[processBlock.length - 1] & 255) ^ 188) == 0) {
                i = 1;
            } else {
                i = 2;
                int i2 = ((processBlock[processBlock.length - 2] & 255) << 8) | (processBlock[processBlock.length - 1] & 255);
                Integer num = (Integer) AbstractC14516e.ad.get(interfaceC0293e.getAlgorithmName());
                if (num == null) {
                    throw new IllegalArgumentException("unrecognised hash in signature");
                }
                int intValue = num.intValue();
                if (i2 != intValue && (intValue != 15052 || i2 != 16588)) {
                    throw new IllegalStateException(AbstractC1786e.admob(i2, "signer initialised with wrong digest for trailer "));
                }
            }
            int i3 = 0;
            while (i3 != processBlock.length && ((processBlock[i3] & 15) ^ 10) != 0) {
                i3++;
            }
            int i4 = i3 + 1;
            int digestSize = interfaceC0293e.getDigestSize();
            byte[] bArr2 = new byte[digestSize];
            int length = (processBlock.length - i) - digestSize;
            int i5 = length - i4;
            if (i5 <= 0) {
                metrica(processBlock);
                return false;
            }
            if ((processBlock[0] & 32) != 0) {
                interfaceC0293e.doFinal(bArr2, 0);
                boolean z2 = true;
                for (int i6 = 0; i6 != digestSize; i6++) {
                    int i7 = length + i6;
                    byte b = (byte) (processBlock[i7] ^ bArr2[i6]);
                    processBlock[i7] = b;
                    if (b != 0) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    metrica(processBlock);
                    return false;
                }
                byte[] bArr3 = new byte[i5];
                this.f2780e = bArr3;
                System.arraycopy(processBlock, i4, bArr3, 0, i5);
            } else {
                if (this.f2783e > i5) {
                    metrica(processBlock);
                    return false;
                }
                interfaceC0293e.reset();
                interfaceC0293e.update(processBlock, i4, i5);
                interfaceC0293e.doFinal(bArr2, 0);
                boolean z3 = true;
                for (int i8 = 0; i8 != digestSize; i8++) {
                    int i9 = length + i8;
                    byte b2 = (byte) (processBlock[i9] ^ bArr2[i8]);
                    processBlock[i9] = b2;
                    if (b2 != 0) {
                        z3 = false;
                    }
                }
                if (!z3) {
                    metrica(processBlock);
                    return false;
                }
                byte[] bArr4 = new byte[i5];
                this.f2780e = bArr4;
                System.arraycopy(processBlock, i4, bArr4, 0, i5);
            }
            int i10 = this.f2783e;
            if (i10 != 0) {
                byte[] bArr5 = this.f2784e;
                byte[] bArr6 = this.f2780e;
                if (i10 > bArr5.length) {
                    z = bArr5.length <= bArr6.length;
                    for (int i11 = 0; i11 != this.f2784e.length; i11++) {
                        if (bArr5[i11] != bArr6[i11]) {
                            z = false;
                        }
                    }
                } else {
                    z = i10 == bArr6.length;
                    for (int i12 = 0; i12 != bArr6.length; i12++) {
                        if (bArr5[i12] != bArr6[i12]) {
                            z = false;
                        }
                    }
                }
                if (!z) {
                    metrica(processBlock);
                    return false;
                }
            }
            ad(this.f2784e);
            ad(processBlock);
            this.f2783e = 0;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
