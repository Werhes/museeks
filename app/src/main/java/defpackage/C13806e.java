package defpackage;

/* renamed from: eؘٖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C13806e implements InterfaceC14556e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final int[] f27364e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f27368e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f27371e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f27372e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f27370e = 0;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int[] f27367e = new int[16];

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int[] f27366e = new int[16];

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f27369e = new byte[64];

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f27365e = false;

    static {
        byte[] metrica = AbstractC1433e.metrica("expand 16-byte kexpand 32-byte k");
        int[] iArr = new int[8];
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = AbstractC3628e.advert(i, metrica);
            i += 4;
        }
        f27364e = iArr;
        AbstractC1433e.metrica("expand 32-byte k");
        AbstractC1433e.metrica("expand 16-byte k");
    }

    public static void license(int[] iArr, int i) {
        int i2 = (i - 16) / 4;
        int[] iArr2 = f27364e;
        iArr[0] = iArr2[i2];
        iArr[1] = iArr2[i2 + 1];
        iArr[2] = iArr2[i2 + 2];
        iArr[3] = iArr2[i2 + 3];
    }

    public static void purchase(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        char c = 3;
        int i5 = iArr[3];
        char c2 = 4;
        int i6 = iArr[4];
        char c3 = 5;
        int i7 = iArr[5];
        char c4 = 6;
        int i8 = iArr[6];
        int i9 = 7;
        int i10 = iArr[7];
        int i11 = iArr[8];
        int i12 = 9;
        int i13 = iArr[9];
        int i14 = iArr[10];
        int i15 = iArr[11];
        int i16 = iArr[12];
        int i17 = 13;
        int i18 = iArr[13];
        int i19 = iArr[14];
        int i20 = iArr[15];
        int i21 = i19;
        int i22 = i18;
        int i23 = i16;
        int i24 = i15;
        int i25 = i14;
        int i26 = i13;
        int i27 = i11;
        int i28 = i10;
        int i29 = i8;
        int i30 = i7;
        int i31 = i6;
        int i32 = i5;
        int i33 = i4;
        int i34 = i3;
        int i35 = i2;
        int i36 = i;
        while (i36 > 0) {
            char c5 = c;
            int rotateLeft = Integer.rotateLeft(i35 + i23, i9) ^ i31;
            int rotateLeft2 = i27 ^ Integer.rotateLeft(rotateLeft + i35, i12);
            char c6 = c2;
            int rotateLeft3 = i23 ^ Integer.rotateLeft(rotateLeft2 + rotateLeft, i17);
            char c7 = c3;
            char c8 = c4;
            int rotateLeft4 = i35 ^ Integer.rotateLeft(rotateLeft3 + rotateLeft2, 18);
            int rotateLeft5 = i26 ^ Integer.rotateLeft(i30 + i34, i9);
            int rotateLeft6 = i22 ^ Integer.rotateLeft(rotateLeft5 + i30, i12);
            int rotateLeft7 = Integer.rotateLeft(rotateLeft6 + rotateLeft5, i17) ^ i34;
            int rotateLeft8 = Integer.rotateLeft(rotateLeft7 + rotateLeft6, 18) ^ i30;
            int rotateLeft9 = i21 ^ Integer.rotateLeft(i25 + i29, 7);
            int rotateLeft10 = i33 ^ Integer.rotateLeft(rotateLeft9 + i25, 9);
            int rotateLeft11 = i29 ^ Integer.rotateLeft(rotateLeft10 + rotateLeft9, 13);
            int rotateLeft12 = i25 ^ Integer.rotateLeft(rotateLeft11 + rotateLeft10, 18);
            int rotateLeft13 = i32 ^ Integer.rotateLeft(i20 + i24, 7);
            int rotateLeft14 = i28 ^ Integer.rotateLeft(rotateLeft13 + i20, 9);
            int rotateLeft15 = i24 ^ Integer.rotateLeft(rotateLeft14 + rotateLeft13, 13);
            int rotateLeft16 = i20 ^ Integer.rotateLeft(rotateLeft15 + rotateLeft14, 18);
            int rotateLeft17 = rotateLeft7 ^ Integer.rotateLeft(rotateLeft4 + rotateLeft13, 7);
            int rotateLeft18 = Integer.rotateLeft(rotateLeft17 + rotateLeft4, 9) ^ rotateLeft10;
            int rotateLeft19 = rotateLeft13 ^ Integer.rotateLeft(rotateLeft18 + rotateLeft17, 13);
            i35 = rotateLeft4 ^ Integer.rotateLeft(rotateLeft19 + rotateLeft18, 18);
            int rotateLeft20 = Integer.rotateLeft(rotateLeft8 + rotateLeft, 7) ^ rotateLeft11;
            int rotateLeft21 = Integer.rotateLeft(rotateLeft20 + rotateLeft8, 9) ^ rotateLeft14;
            int rotateLeft22 = rotateLeft ^ Integer.rotateLeft(rotateLeft21 + rotateLeft20, 13);
            i30 = rotateLeft8 ^ Integer.rotateLeft(rotateLeft22 + rotateLeft21, 18);
            i24 = rotateLeft15 ^ Integer.rotateLeft(rotateLeft12 + rotateLeft5, 7);
            int rotateLeft23 = Integer.rotateLeft(i24 + rotateLeft12, 9) ^ rotateLeft2;
            int rotateLeft24 = Integer.rotateLeft(rotateLeft23 + i24, 13) ^ rotateLeft5;
            i25 = rotateLeft12 ^ Integer.rotateLeft(rotateLeft24 + rotateLeft23, 18);
            i23 = rotateLeft3 ^ Integer.rotateLeft(rotateLeft16 + rotateLeft9, 7);
            i22 = rotateLeft6 ^ Integer.rotateLeft(i23 + rotateLeft16, 9);
            i21 = rotateLeft9 ^ Integer.rotateLeft(i22 + i23, 13);
            i20 = rotateLeft16 ^ Integer.rotateLeft(i21 + i22, 18);
            i36 -= 2;
            i27 = rotateLeft23;
            i34 = rotateLeft17;
            i29 = rotateLeft20;
            i31 = rotateLeft22;
            i28 = rotateLeft21;
            i26 = rotateLeft24;
            c = c5;
            c2 = c6;
            c3 = c7;
            c4 = c8;
            i9 = 7;
            i33 = rotateLeft18;
            i32 = rotateLeft19;
            i12 = 9;
            i17 = 13;
        }
        char c9 = c;
        char c10 = c2;
        char c11 = c3;
        char c12 = c4;
        iArr2[0] = i35 + iArr[0];
        iArr2[1] = i34 + iArr[1];
        iArr2[2] = i33 + iArr[2];
        iArr2[c9] = i32 + iArr[c9];
        iArr2[c10] = i31 + iArr[c10];
        iArr2[c11] = i30 + iArr[c11];
        iArr2[c12] = i29 + iArr[c12];
        iArr2[7] = i28 + iArr[7];
        iArr2[8] = i27 + iArr[8];
        iArr2[9] = i26 + iArr[9];
        iArr2[10] = i25 + iArr[10];
        iArr2[11] = i24 + iArr[11];
        iArr2[12] = i23 + iArr[12];
        iArr2[13] = i22 + iArr[13];
        iArr2[14] = i21 + iArr[14];
        iArr2[15] = i20 + iArr[15];
    }

    public void ad() {
        int[] iArr = this.f27367e;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    public void appmetrica() {
        int[] iArr = this.f27367e;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    public void billing(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f27367e;
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr2 = f27364e;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            AbstractC3628e.amazon(bArr, 0, iArr, 1, 4);
            AbstractC3628e.amazon(bArr, bArr.length - 16, iArr, 11, 4);
        }
        AbstractC3628e.amazon(bArr2, 0, iArr, 6, 2);
    }

    @Override // defpackage.InterfaceC14556e
    public String getAlgorithmName() {
        return "Salsa20";
    }

    @Override // defpackage.InterfaceC14556e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        if (!(interfaceC3894e instanceof C11494e)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
        }
        C11494e c11494e = (C11494e) interfaceC3894e;
        byte[] bArr = c11494e.f23095e;
        if (bArr == null || bArr.length != metrica()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + metrica() + " bytes of IV");
        }
        InterfaceC3894e interfaceC3894e2 = c11494e.f23094e;
        if (interfaceC3894e2 == null) {
            if (!this.f27365e) {
                throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            billing(null, bArr);
        } else {
            if (!(interfaceC3894e2 instanceof C14915e)) {
                throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            byte[] bArr2 = ((C14915e) interfaceC3894e2).f29591e;
            billing(bArr2, bArr);
            getAlgorithmName();
            int length = bArr2.length;
            if (interfaceC3894e instanceof EnumC0300e) {
                throw new IllegalArgumentException("params should not be CryptoServicePurpose");
            }
            ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
        }
        reset();
        this.f27365e = true;
    }

    public int metrica() {
        return 8;
    }

    @Override // defpackage.InterfaceC14556e
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f27365e) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i + i2 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        int i4 = this.f27372e + i2;
        this.f27372e = i4;
        if (i4 < i2 && i4 >= 0) {
            int i5 = this.f27371e + 1;
            this.f27371e = i5;
            if (i5 == 0) {
                int i6 = this.f27368e + 1;
                this.f27368e = i6;
                if ((i6 & 32) != 0) {
                    throw new RuntimeException("2^70 byte limit per IV would be exceeded; Change IV");
                }
            }
        }
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = this.f27370e;
            byte[] bArr3 = this.f27369e;
            bArr2[i7 + i3] = (byte) (bArr3[i8] ^ bArr[i7 + i]);
            int i9 = (i8 + 1) & 63;
            this.f27370e = i9;
            if (i9 == 0) {
                ad();
                vip(bArr3);
            }
        }
        return i2;
    }

    @Override // defpackage.InterfaceC14556e
    public final void reset() {
        this.f27370e = 0;
        this.f27372e = 0;
        this.f27371e = 0;
        this.f27368e = 0;
        appmetrica();
        vip(this.f27369e);
    }

    public void vip(byte[] bArr) {
        int[] iArr = this.f27367e;
        int[] iArr2 = this.f27366e;
        purchase(20, iArr, iArr2);
        AbstractC3628e.startapp(bArr, iArr2);
    }
}
