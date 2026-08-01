package defpackage;

import java.math.BigInteger;

/* renamed from: eٖؖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4145e implements InterfaceC4243e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public BigInteger f9142e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f9143e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f9144e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f9145e = 0;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC4243e f9146e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final BigInteger f9141e = BigInteger.valueOf(16);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final BigInteger f9140e = BigInteger.valueOf(6);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final byte[] f9138e = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final byte[] f9139e = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};

    public C4145e(InterfaceC4243e interfaceC4243e) {
        this.f9146e = interfaceC4243e;
    }

    @Override // defpackage.InterfaceC4243e
    public final int getInputBlockSize() {
        int inputBlockSize = this.f9146e.getInputBlockSize();
        return this.f9144e ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // defpackage.InterfaceC4243e
    public final int getOutputBlockSize() {
        int outputBlockSize = this.f9146e.getOutputBlockSize();
        return this.f9144e ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    @Override // defpackage.InterfaceC4243e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        C7362e c7362e = interfaceC3894e instanceof C12219e ? (C7362e) ((C12219e) interfaceC3894e).f24537e : (C7362e) interfaceC3894e;
        this.f9146e.init(z, interfaceC3894e);
        BigInteger bigInteger = c7362e.f15093e;
        this.f9142e = bigInteger;
        this.f9143e = bigInteger.bitLength();
        this.f9144e = z;
    }

    @Override // defpackage.InterfaceC4243e
    public final byte[] processBlock(byte[] bArr, int i, int i2) {
        if (this.f9144e) {
            int i3 = this.f9143e;
            int i4 = (i3 + 7) / 8;
            byte[] bArr2 = new byte[i4];
            int i5 = 1;
            int i6 = this.f9145e + 1;
            int i7 = (i3 + 13) / 16;
            int i8 = 0;
            while (i8 < i7) {
                if (i8 > i7 - i2) {
                    int i9 = i7 - i8;
                    System.arraycopy(bArr, (i + i2) - i9, bArr2, i4 - i7, i9);
                } else {
                    System.arraycopy(bArr, i, bArr2, i4 - (i8 + i2), i2);
                }
                i8 += i2;
            }
            for (int i10 = i4 - (i7 * 2); i10 != i4; i10 += 2) {
                byte b = bArr2[(i10 / 2) + (i4 - i7)];
                byte[] bArr3 = f9138e;
                bArr2[i10] = (byte) ((bArr3[(b & 255) >>> 4] << 4) | bArr3[b & 15]);
                bArr2[i10 + 1] = b;
            }
            int i11 = i4 - (i2 * 2);
            bArr2[i11] = (byte) (bArr2[i11] ^ i6);
            int i12 = i4 - 1;
            bArr2[i12] = (byte) ((bArr2[i12] << 4) | 6);
            int i13 = 8 - ((this.f9143e - 1) % 8);
            if (i13 != 8) {
                byte b2 = (byte) (bArr2[0] & (255 >>> i13));
                bArr2[0] = b2;
                bArr2[0] = (byte) ((128 >>> i13) | b2);
                i5 = 0;
            } else {
                bArr2[0] = 0;
                bArr2[1] = (byte) (bArr2[1] | 128);
            }
            return this.f9146e.processBlock(bArr2, i5, i4 - i5);
        }
        byte[] processBlock = this.f9146e.processBlock(bArr, i, i2);
        int i14 = (this.f9143e + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, processBlock);
        BigInteger bigInteger2 = f9141e;
        BigInteger mod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = f9140e;
        if (!mod.equals(bigInteger3)) {
            if (!this.f9142e.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                throw new Exception("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.f9142e.subtract(bigInteger);
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr4 = new byte[length];
            System.arraycopy(byteArray, 1, bArr4, 0, length);
            byteArray = bArr4;
        }
        if ((byteArray[byteArray.length - 1] & 15) != 6) {
            throw new Exception("invalid forcing byte in block");
        }
        byteArray[byteArray.length - 1] = (byte) (((byteArray[byteArray.length - 1] & 255) >>> 4) | (f9139e[(byteArray[byteArray.length - 2] & 255) >> 4] << 4));
        byte b3 = byteArray[1];
        byte[] bArr5 = f9138e;
        byteArray[0] = (byte) (bArr5[b3 & 15] | (bArr5[(b3 & 255) >>> 4] << 4));
        int i15 = 0;
        boolean z = false;
        int i16 = 1;
        for (int length2 = byteArray.length - 1; length2 >= byteArray.length - (i14 * 2); length2 -= 2) {
            byte b4 = byteArray[length2];
            int i17 = length2 - 1;
            int i18 = ((bArr5[b4 & 15] | (bArr5[(b4 & 255) >>> 4] << 4)) ^ byteArray[i17]) & 255;
            if (i18 != 0) {
                if (z) {
                    throw new Exception("invalid tsums in block");
                }
                z = true;
                i16 = i18;
                i15 = i17;
            }
        }
        byteArray[i15] = 0;
        int length3 = (byteArray.length - i15) / 2;
        byte[] bArr6 = new byte[length3];
        for (int i19 = 0; i19 < length3; i19++) {
            bArr6[i19] = byteArray[(i19 * 2) + i15 + 1];
        }
        this.f9145e = i16 - 1;
        return bArr6;
    }
}
