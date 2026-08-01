package defpackage;

import java.util.Arrays;

/* renamed from: e٘ۧۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18161e implements InterfaceC1196e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f35571e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f35572e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f35573e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f35574e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int[] f35575e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f35576e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f35577e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f35578e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public byte[] f35579e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int[] f35580e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public byte[] f35581e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f35582e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f35583e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f35584e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f35585e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final int[] f35570e = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final byte[][] f35569e = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}};

    public C18161e(int i) {
        this.f35583e = 32;
        this.f35577e = 0;
        this.f35574e = null;
        this.f35581e = null;
        this.f35571e = null;
        this.f35585e = 1;
        this.f35584e = 1;
        this.f35579e = null;
        this.f35582e = 0;
        this.f35575e = new int[16];
        this.f35580e = null;
        this.f35573e = 0;
        this.f35572e = 0;
        this.f35576e = 0;
        this.f35578e = 0;
        if (i < 8 || i > 256 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.f35583e = i / 8;
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        license(null, null, null);
    }

    public C18161e(C18161e c18161e) {
        this.f35583e = 32;
        this.f35577e = 0;
        this.f35574e = null;
        this.f35581e = null;
        this.f35571e = null;
        this.f35585e = 1;
        this.f35584e = 1;
        this.f35579e = null;
        this.f35582e = 0;
        this.f35575e = new int[16];
        this.f35580e = null;
        this.f35573e = 0;
        this.f35572e = 0;
        this.f35576e = 0;
        this.f35578e = 0;
        this.f35582e = c18161e.f35582e;
        this.f35579e = AbstractC12442e.license(c18161e.f35579e);
        this.f35577e = c18161e.f35577e;
        this.f35571e = AbstractC12442e.license(c18161e.f35571e);
        this.f35583e = c18161e.f35583e;
        this.f35575e = AbstractC12442e.appmetrica(c18161e.f35575e);
        this.f35580e = AbstractC12442e.appmetrica(c18161e.f35580e);
        this.f35573e = c18161e.f35573e;
        this.f35572e = c18161e.f35572e;
        this.f35576e = c18161e.f35576e;
        this.f35574e = AbstractC12442e.license(c18161e.f35574e);
        this.f35581e = AbstractC12442e.license(c18161e.f35581e);
        this.f35585e = c18161e.f35585e;
        this.f35584e = c18161e.f35584e;
    }

    public final void ad(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.f35575e;
        int i7 = iArr[i3] + iArr[i4] + i;
        iArr[i3] = i7;
        int rotateRight = Integer.rotateRight(iArr[i6] ^ i7, 16);
        iArr[i6] = rotateRight;
        int i8 = iArr[i5] + rotateRight;
        iArr[i5] = i8;
        int rotateRight2 = Integer.rotateRight(iArr[i4] ^ i8, 12);
        iArr[i4] = rotateRight2;
        int i9 = iArr[i3] + rotateRight2 + i2;
        iArr[i3] = i9;
        int rotateRight3 = Integer.rotateRight(iArr[i6] ^ i9, 8);
        iArr[i6] = rotateRight3;
        int i10 = iArr[i5] + rotateRight3;
        iArr[i5] = i10;
        iArr[i4] = Integer.rotateRight(iArr[i4] ^ i10, 7);
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = this.f35583e;
        if (i > length - i2) {
            throw new RuntimeException("output buffer too short");
        }
        this.f35576e = -1;
        int i3 = this.f35573e;
        int i4 = this.f35582e;
        int i5 = i3 + i4;
        this.f35573e = i5;
        if (i5 < 0 && i4 > (-i5)) {
            this.f35572e++;
        }
        vip(0, this.f35579e);
        Arrays.fill(this.f35579e, (byte) 0);
        Arrays.fill(this.f35575e, 0);
        int i6 = i2 >>> 2;
        int i7 = i2 & 3;
        int[] iArr = this.f35580e;
        int i8 = i;
        for (int i9 = 0; i9 < i6; i9++) {
            AbstractC3628e.yandex(iArr[i9], i8, bArr);
            i8 += 4;
        }
        if (i7 > 0) {
            byte[] bArr2 = new byte[4];
            AbstractC3628e.yandex(this.f35580e[i6], 0, bArr2);
            System.arraycopy(bArr2, 0, bArr, (i + i2) - i7, i7);
        }
        Arrays.fill(this.f35580e, 0);
        reset();
        return i2;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "BLAKE2s";
    }

    @Override // defpackage.InterfaceC1196e
    public final int getByteLength() {
        return 64;
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return this.f35583e;
    }

    public final void license(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f35579e = new byte[64];
        if (bArr3 != null && bArr3.length > 0) {
            int length = bArr3.length;
            this.f35577e = length;
            if (length > 32) {
                throw new IllegalArgumentException("Keys > 32 bytes are not supported");
            }
            byte[] bArr4 = new byte[length];
            this.f35571e = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, length);
            System.arraycopy(bArr3, 0, this.f35579e, 0, this.f35577e);
            this.f35582e = 64;
        }
        if (this.f35580e == null) {
            this.f35580e = r0;
            int[] iArr = f35570e;
            int[] iArr2 = {iArr[0] ^ (((this.f35577e << 8) | this.f35583e) | ((this.f35585e << 16) | (this.f35584e << 24))), iArr[1], ((int) 0) ^ iArr[2], iArr[3] ^ ((int) 0), iArr[4], iArr[5]};
            if (bArr != null) {
                if (bArr.length != 8) {
                    throw new IllegalArgumentException("Salt length must be exactly 8 bytes");
                }
                byte[] bArr5 = new byte[8];
                this.f35574e = bArr5;
                System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                int[] iArr3 = this.f35580e;
                iArr3[4] = iArr3[4] ^ AbstractC3628e.advert(0, bArr);
                int[] iArr4 = this.f35580e;
                iArr4[5] = AbstractC3628e.advert(4, bArr) ^ iArr4[5];
            }
            int[] iArr5 = this.f35580e;
            iArr5[6] = iArr[6];
            iArr5[7] = iArr[7];
            if (bArr2 != null) {
                if (bArr2.length != 8) {
                    throw new IllegalArgumentException("Personalization length must be exactly 8 bytes");
                }
                byte[] bArr6 = new byte[8];
                this.f35581e = bArr6;
                System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                int[] iArr6 = this.f35580e;
                iArr6[6] = iArr6[6] ^ AbstractC3628e.advert(0, bArr2);
                int[] iArr7 = this.f35580e;
                iArr7[7] = AbstractC3628e.advert(4, bArr2) ^ iArr7[7];
            }
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final void reset() {
        this.f35582e = 0;
        this.f35576e = 0;
        this.f35578e = 0;
        this.f35573e = 0;
        this.f35572e = 0;
        this.f35580e = null;
        Arrays.fill(this.f35579e, (byte) 0);
        byte[] bArr = this.f35571e;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f35579e, 0, bArr.length);
            this.f35582e = 64;
        }
        license(this.f35574e, this.f35581e, this.f35571e);
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        int i = this.f35582e;
        if (64 - i != 0) {
            this.f35579e[i] = b;
            this.f35582e = i + 1;
            return;
        }
        int i2 = this.f35573e + 64;
        this.f35573e = i2;
        if (i2 == 0) {
            this.f35572e++;
        }
        vip(0, this.f35579e);
        Arrays.fill(this.f35579e, (byte) 0);
        this.f35579e[0] = b;
        this.f35582e = 1;
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        int i4 = this.f35582e;
        if (i4 != 0) {
            i3 = 64 - i4;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, this.f35579e, i4, i2);
                this.f35582e += i2;
            }
            System.arraycopy(bArr, i, this.f35579e, i4, i3);
            int i5 = this.f35573e + 64;
            this.f35573e = i5;
            if (i5 == 0) {
                this.f35572e++;
            }
            vip(0, this.f35579e);
            this.f35582e = 0;
            Arrays.fill(this.f35579e, (byte) 0);
        } else {
            i3 = 0;
        }
        int i6 = i2 + i;
        int i7 = i6 - 64;
        int i8 = i + i3;
        while (i8 < i7) {
            int i9 = this.f35573e + 64;
            this.f35573e = i9;
            if (i9 == 0) {
                this.f35572e++;
            }
            vip(i8, bArr);
            i8 += 64;
        }
        i2 = i6 - i8;
        System.arraycopy(bArr, i8, this.f35579e, 0, i2);
        this.f35582e += i2;
    }

    public final void vip(int i, byte[] bArr) {
        C18161e c18161e = this;
        int[] iArr = c18161e.f35580e;
        int length = iArr.length;
        int i2 = 0;
        int[] iArr2 = c18161e.f35575e;
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int length2 = c18161e.f35580e.length;
        int[] iArr3 = f35570e;
        System.arraycopy(iArr3, 0, iArr2, length2, 4);
        iArr2[12] = c18161e.f35573e ^ iArr3[4];
        iArr2[13] = c18161e.f35572e ^ iArr3[5];
        iArr2[14] = c18161e.f35576e ^ iArr3[6];
        iArr2[15] = c18161e.f35578e ^ iArr3[7];
        int[] iArr4 = new int[16];
        AbstractC3628e.smaato(i, bArr, iArr4);
        int i3 = 0;
        while (i3 < 10) {
            byte[][] bArr2 = f35569e;
            byte[] bArr3 = bArr2[i3];
            int[] iArr5 = iArr4;
            int i4 = i3;
            c18161e.ad(iArr4[bArr3[0]], iArr4[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i4];
            ad(iArr5[bArr4[2]], iArr5[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i4];
            ad(iArr5[bArr5[4]], iArr5[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i4];
            ad(iArr5[bArr6[6]], iArr5[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i4];
            ad(iArr5[bArr7[8]], iArr5[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i4];
            ad(iArr5[bArr8[10]], iArr5[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i4];
            ad(iArr5[bArr9[12]], iArr5[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i4];
            int i5 = iArr5[bArr10[14]];
            int i6 = iArr5[bArr10[15]];
            c18161e = this;
            c18161e.ad(i5, i6, 3, 4, 9, 14);
            i3 = i4 + 1;
            iArr4 = iArr5;
        }
        while (true) {
            int[] iArr6 = c18161e.f35580e;
            if (i2 >= iArr6.length) {
                return;
            }
            iArr6[i2] = (iArr6[i2] ^ iArr2[i2]) ^ iArr2[i2 + 8];
            i2++;
        }
    }
}
