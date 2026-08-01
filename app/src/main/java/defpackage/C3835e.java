package defpackage;

import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: eؖؒۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3835e implements InterfaceC6045e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public SecureRandom f8459e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final byte f8460e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public byte[] f8461e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC0293e f8462e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final byte[] f8463e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC0293e f8464e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f8465e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final byte[] f8466e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC4243e f8467e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f8468e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC0293e f8469e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f8470e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f8471e;

    public C3835e(InterfaceC4243e interfaceC4243e, InterfaceC0293e interfaceC0293e, InterfaceC0293e interfaceC0293e2, int i, byte b) {
        this.f8467e = interfaceC4243e;
        this.f8469e = interfaceC0293e;
        this.f8464e = interfaceC0293e;
        this.f8462e = interfaceC0293e2;
        int digestSize = interfaceC0293e.getDigestSize();
        this.f8471e = digestSize;
        this.f8470e = interfaceC0293e2.getDigestSize();
        this.f8465e = i;
        this.f8463e = new byte[i];
        this.f8466e = new byte[i + 8 + digestSize];
        this.f8460e = b;
    }

    public static void ad(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    public static void metrica(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    @Override // defpackage.InterfaceC6045e
    public final byte[] adcel() {
        InterfaceC0293e interfaceC0293e = this.f8469e;
        int digestSize = interfaceC0293e.getDigestSize();
        int i = this.f8471e;
        if (digestSize != i) {
            throw new IllegalStateException();
        }
        byte[] bArr = this.f8466e;
        int length = bArr.length - i;
        int i2 = this.f8465e;
        interfaceC0293e.doFinal(bArr, length - i2);
        byte[] bArr2 = this.f8463e;
        if (i2 != 0) {
            this.f8459e.nextBytes(bArr2);
            System.arraycopy(bArr2, 0, bArr, bArr.length - i2, i2);
        }
        byte[] bArr3 = new byte[i];
        int length2 = bArr.length;
        InterfaceC0293e interfaceC0293e2 = this.f8464e;
        interfaceC0293e2.update(bArr, 0, length2);
        interfaceC0293e2.doFinal(bArr3, 0);
        byte[] bArr4 = this.f8461e;
        bArr4[(((bArr4.length - i2) - 1) - i) - 1] = 1;
        System.arraycopy(bArr2, 0, bArr4, ((bArr4.length - i2) - i) - 1, i2);
        byte[] license = license(0, i, (this.f8461e.length - i) - 1, bArr3);
        for (int i3 = 0; i3 != license.length; i3++) {
            byte[] bArr5 = this.f8461e;
            bArr5[i3] = (byte) (bArr5[i3] ^ license[i3]);
        }
        byte[] bArr6 = this.f8461e;
        System.arraycopy(bArr3, 0, bArr6, (bArr6.length - i) - 1, i);
        byte[] bArr7 = this.f8461e;
        bArr7[0] = (byte) ((255 >>> ((bArr7.length * 8) - this.f8468e)) & bArr7[0]);
        bArr7[bArr7.length - 1] = this.f8460e;
        byte[] processBlock = this.f8467e.processBlock(bArr7, 0, bArr7.length);
        metrica(this.f8461e);
        return processBlock;
    }

    @Override // defpackage.InterfaceC6045e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        if (interfaceC3894e instanceof C12219e) {
            C12219e c12219e = (C12219e) interfaceC3894e;
            InterfaceC3894e interfaceC3894e2 = c12219e.f24537e;
            this.f8459e = c12219e.f24538e;
            interfaceC3894e = interfaceC3894e2;
        } else if (z) {
            this.f8459e = AbstractC9915e.vip();
        }
        this.f8467e.init(z, interfaceC3894e);
        int bitLength = ((C7362e) interfaceC3894e).f15093e.bitLength();
        int i = bitLength - 1;
        this.f8468e = i;
        if (i < (this.f8465e * 8) + (this.f8471e * 8) + 9) {
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        }
        this.f8461e = new byte[(bitLength + 6) / 8];
        this.f8469e.reset();
    }

    public final byte[] license(int i, int i2, int i3, byte[] bArr) {
        InterfaceC0293e interfaceC0293e = this.f8462e;
        if (interfaceC0293e instanceof InterfaceC6931e) {
            byte[] bArr2 = new byte[i3];
            interfaceC0293e.update(bArr, i, i2);
            ((InterfaceC6931e) interfaceC0293e).metrica(0, i3, bArr2);
            return bArr2;
        }
        byte[] bArr3 = new byte[i3];
        int i4 = this.f8470e;
        byte[] bArr4 = new byte[i4];
        byte[] bArr5 = new byte[4];
        interfaceC0293e.reset();
        int i5 = 0;
        while (i5 < i3 / i4) {
            ad(i5, bArr5);
            interfaceC0293e.update(bArr, i, i2);
            interfaceC0293e.update(bArr5, 0, 4);
            interfaceC0293e.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, i5 * i4, i4);
            i5++;
        }
        int i6 = i4 * i5;
        if (i6 < i3) {
            ad(i5, bArr5);
            interfaceC0293e.update(bArr, i, i2);
            interfaceC0293e.update(bArr5, 0, 4);
            interfaceC0293e.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, i6, i3 - i6);
        }
        return bArr3;
    }

    @Override // defpackage.InterfaceC6045e
    public final void update(byte b) {
        this.f8469e.update(b);
    }

    @Override // defpackage.InterfaceC6045e
    public final void update(byte[] bArr, int i, int i2) {
        this.f8469e.update(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC6045e
    public final boolean vip(byte[] bArr) {
        byte[] bArr2;
        int length;
        byte b;
        InterfaceC0293e interfaceC0293e = this.f8469e;
        int digestSize = interfaceC0293e.getDigestSize();
        int i = this.f8471e;
        if (digestSize != i) {
            throw new IllegalStateException();
        }
        byte[] bArr3 = this.f8466e;
        int length2 = bArr3.length - i;
        int i2 = this.f8465e;
        interfaceC0293e.doFinal(bArr3, length2 - i2);
        try {
            byte[] processBlock = this.f8467e.processBlock(bArr, 0, bArr.length);
            byte[] bArr4 = this.f8461e;
            Arrays.fill(bArr4, 0, bArr4.length - processBlock.length, (byte) 0);
            byte[] bArr5 = this.f8461e;
            System.arraycopy(processBlock, 0, bArr5, bArr5.length - processBlock.length, processBlock.length);
            bArr2 = this.f8461e;
            length = 255 >>> ((bArr2.length * 8) - this.f8468e);
            b = bArr2[0];
        } catch (Exception unused) {
        }
        if ((b & 255) != (b & length) || bArr2[bArr2.length - 1] != this.f8460e) {
            metrica(bArr2);
            return false;
        }
        byte[] license = license((bArr2.length - i) - 1, i, (bArr2.length - i) - 1, bArr2);
        for (int i3 = 0; i3 != license.length; i3++) {
            byte[] bArr6 = this.f8461e;
            bArr6[i3] = (byte) (bArr6[i3] ^ license[i3]);
        }
        byte[] bArr7 = this.f8461e;
        bArr7[0] = (byte) (length & bArr7[0]);
        int i4 = 0;
        while (true) {
            byte[] bArr8 = this.f8461e;
            if (i4 == ((bArr8.length - i) - i2) - 2) {
                if (bArr8[((bArr8.length - i) - i2) - 2] != 1) {
                    metrica(bArr8);
                    return false;
                }
                System.arraycopy(bArr8, ((bArr8.length - i2) - i) - 1, bArr3, bArr3.length - i2, i2);
                int length3 = bArr3.length;
                InterfaceC0293e interfaceC0293e2 = this.f8464e;
                interfaceC0293e2.update(bArr3, 0, length3);
                interfaceC0293e2.doFinal(bArr3, bArr3.length - i);
                int length4 = (this.f8461e.length - i) - 1;
                for (int length5 = bArr3.length - i; length5 != bArr3.length; length5++) {
                    if ((this.f8461e[length4] ^ bArr3[length5]) != 0) {
                        metrica(bArr3);
                        metrica(this.f8461e);
                        return false;
                    }
                    length4++;
                }
                metrica(bArr3);
                metrica(this.f8461e);
                return true;
            }
            if (bArr8[i4] != 0) {
                metrica(bArr8);
                return false;
            }
            i4++;
        }
    }
}
