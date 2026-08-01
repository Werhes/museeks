package defpackage;

/* renamed from: eؘٜۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5966e implements InterfaceC2227e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC2227e f12562e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f12563e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public byte[] f12564e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f12565e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public byte[] f12566e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f12567e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public byte[] f12568e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f12569e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f12570e;

    public final byte ad(byte b, int i) {
        return (byte) (b ^ this.f12563e[i]);
    }

    @Override // defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        StringBuilder sb;
        String str;
        InterfaceC2227e interfaceC2227e = this.f12562e;
        if (this.f12567e) {
            sb = new StringBuilder();
            sb.append(interfaceC2227e.getAlgorithmName());
            str = "/PGPCFBwithIV";
        } else {
            sb = new StringBuilder();
            sb.append(interfaceC2227e.getAlgorithmName());
            str = "/PGPCFB";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC2227e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        InterfaceC2227e interfaceC2227e = this.f12562e;
        byte[] bArr = this.f12568e;
        this.f12565e = z;
        if (!(interfaceC3894e instanceof C11494e)) {
            reset();
            interfaceC2227e.init(true, interfaceC3894e);
            return;
        }
        C11494e c11494e = (C11494e) interfaceC3894e;
        byte[] bArr2 = c11494e.f23095e;
        if (bArr2.length < bArr.length) {
            System.arraycopy(bArr2, 0, bArr, bArr.length - bArr2.length, bArr2.length);
            for (int i = 0; i < bArr.length - bArr2.length; i++) {
                bArr[i] = 0;
            }
        } else {
            System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
        }
        reset();
        interfaceC2227e.init(true, c11494e.f23094e);
    }

    @Override // defpackage.InterfaceC2227e
    public final int isPro() {
        return this.f12562e.isPro();
    }

    @Override // defpackage.InterfaceC2227e
    public final void reset() {
        this.f12570e = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f12564e;
            if (i == bArr.length) {
                this.f12562e.reset();
                return;
            }
            if (this.f12567e) {
                bArr[i] = 0;
            } else {
                bArr[i] = this.f12568e[i];
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC2227e
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3 = this.f12569e;
        byte[] bArr3 = this.f12564e;
        InterfaceC2227e interfaceC2227e = this.f12562e;
        byte[] bArr4 = this.f12563e;
        int i4 = 0;
        if (!this.f12567e) {
            if (this.f12565e) {
                if (i + i3 > bArr.length) {
                    throw new RuntimeException("input buffer too short");
                }
                if (i2 + i3 > bArr2.length) {
                    throw new RuntimeException("output buffer too short");
                }
                interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
                for (int i5 = 0; i5 < i3; i5++) {
                    bArr2[i2 + i5] = ad(bArr[i + i5], i5);
                }
                while (i4 < i3) {
                    bArr3[i4] = bArr2[i2 + i4];
                    i4++;
                }
                return i3;
            }
            if (i + i3 > bArr.length) {
                throw new RuntimeException("input buffer too short");
            }
            if (i2 + i3 > bArr2.length) {
                throw new RuntimeException("output buffer too short");
            }
            interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
            for (int i6 = 0; i6 < i3; i6++) {
                bArr2[i2 + i6] = ad(bArr[i + i6], i6);
            }
            while (i4 < i3) {
                bArr3[i4] = bArr[i + i4];
                i4++;
            }
            return i3;
        }
        if (this.f12565e) {
            byte[] bArr5 = this.f12568e;
            if (i + i3 > bArr.length) {
                throw new RuntimeException("input buffer too short");
            }
            int i7 = this.f12570e;
            if (i7 != 0) {
                if (i7 < i3 + 2) {
                    return i3;
                }
                if (i2 + i3 > bArr2.length) {
                    throw new RuntimeException("output buffer too short");
                }
                interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
                for (int i8 = 0; i8 < i3; i8++) {
                    bArr2[i2 + i8] = ad(bArr[i + i8], i8);
                }
                System.arraycopy(bArr2, i2, bArr3, 0, i3);
                return i3;
            }
            int i9 = i3 * 2;
            if (i9 + i2 + 2 > bArr2.length) {
                throw new RuntimeException("output buffer too short");
            }
            interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
            for (int i10 = 0; i10 < i3; i10++) {
                bArr2[i2 + i10] = ad(bArr5[i10], i10);
            }
            System.arraycopy(bArr2, i2, bArr3, 0, i3);
            interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
            int i11 = i2 + i3;
            bArr2[i11] = ad(bArr5[i3 - 2], 0);
            bArr2[i11 + 1] = ad(bArr5[i3 - 1], 1);
            System.arraycopy(bArr2, i2 + 2, bArr3, 0, i3);
            interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
            for (int i12 = 0; i12 < i3; i12++) {
                bArr2[i11 + 2 + i12] = ad(bArr[i + i12], i12);
            }
            System.arraycopy(bArr2, i11 + 2, bArr3, 0, i3);
            int i13 = i9 + 2;
            this.f12570e += i13;
            return i13;
        }
        byte[] bArr6 = this.f12566e;
        if (i + i3 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 + i3 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        int i14 = this.f12570e;
        if (i14 == 0) {
            for (int i15 = 0; i15 < i3; i15++) {
                bArr3[i15] = bArr[i + i15];
            }
            interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
            this.f12570e += i3;
            return 0;
        }
        if (i14 == i3) {
            System.arraycopy(bArr, i, bArr6, 0, i3);
            int i16 = i3 - 2;
            System.arraycopy(bArr3, 2, bArr3, 0, i16);
            bArr3[i16] = bArr6[0];
            bArr3[i3 - 1] = bArr6[1];
            interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
            for (int i17 = 0; i17 < i16; i17++) {
                bArr2[i2 + i17] = ad(bArr6[i17 + 2], i17);
            }
            System.arraycopy(bArr6, 2, bArr3, 0, i16);
            this.f12570e += 2;
            return i16;
        }
        if (i14 >= i3 + 2) {
            System.arraycopy(bArr, i, bArr6, 0, i3);
            int i18 = i3 - 2;
            bArr2[i2] = ad(bArr6[0], i18);
            bArr2[i2 + 1] = ad(bArr6[1], i3 - 1);
            System.arraycopy(bArr6, 0, bArr3, i18, 2);
            interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
            for (int i19 = 0; i19 < i18; i19++) {
                bArr2[i2 + i19 + 2] = ad(bArr6[i19 + 2], i19);
            }
            System.arraycopy(bArr6, 2, bArr3, 0, i18);
        }
        return i3;
    }
}
