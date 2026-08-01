package defpackage;

/* renamed from: eِؕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11509e extends C13806e {
    public static void yandex(int[] iArr, int[] iArr2) {
        int i = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
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
        int i11 = 8;
        int i12 = iArr[8];
        int i13 = iArr[9];
        int i14 = iArr[10];
        int i15 = iArr[11];
        int i16 = iArr[12];
        int i17 = iArr[13];
        int i18 = iArr[14];
        int i19 = iArr[15];
        int i20 = 20;
        while (i20 > 0) {
            int i21 = i2 + i6;
            char c5 = c;
            int rotateLeft = Integer.rotateLeft(i16 ^ i21, i);
            int i22 = i12 + rotateLeft;
            int rotateLeft2 = Integer.rotateLeft(i6 ^ i22, 12);
            int i23 = i21 + rotateLeft2;
            int rotateLeft3 = Integer.rotateLeft(rotateLeft ^ i23, i11);
            int i24 = i22 + rotateLeft3;
            int rotateLeft4 = Integer.rotateLeft(rotateLeft2 ^ i24, i9);
            int i25 = i3 + i7;
            char c6 = c2;
            int rotateLeft5 = Integer.rotateLeft(i17 ^ i25, i);
            int i26 = i13 + rotateLeft5;
            int rotateLeft6 = Integer.rotateLeft(i7 ^ i26, 12);
            int i27 = i25 + rotateLeft6;
            int rotateLeft7 = Integer.rotateLeft(rotateLeft5 ^ i27, i11);
            int i28 = i26 + rotateLeft7;
            int rotateLeft8 = Integer.rotateLeft(rotateLeft6 ^ i28, i9);
            int i29 = i4 + i8;
            char c7 = c3;
            int rotateLeft9 = Integer.rotateLeft(i18 ^ i29, i);
            int i30 = i14 + rotateLeft9;
            char c8 = c4;
            int rotateLeft10 = Integer.rotateLeft(i8 ^ i30, 12);
            int i31 = i29 + rotateLeft10;
            int rotateLeft11 = Integer.rotateLeft(rotateLeft9 ^ i31, i11);
            int i32 = i30 + rotateLeft11;
            int rotateLeft12 = Integer.rotateLeft(rotateLeft10 ^ i32, i9);
            int i33 = i5 + i10;
            int rotateLeft13 = Integer.rotateLeft(i19 ^ i33, i);
            int i34 = i15 + rotateLeft13;
            int rotateLeft14 = Integer.rotateLeft(i10 ^ i34, 12);
            int i35 = i33 + rotateLeft14;
            int rotateLeft15 = Integer.rotateLeft(rotateLeft13 ^ i35, i11);
            int i36 = i34 + rotateLeft15;
            int rotateLeft16 = Integer.rotateLeft(rotateLeft14 ^ i36, 7);
            int i37 = i23 + rotateLeft8;
            int rotateLeft17 = Integer.rotateLeft(rotateLeft15 ^ i37, 16);
            int i38 = i32 + rotateLeft17;
            int rotateLeft18 = Integer.rotateLeft(rotateLeft8 ^ i38, 12);
            i2 = i37 + rotateLeft18;
            i19 = Integer.rotateLeft(rotateLeft17 ^ i2, 8);
            i14 = i38 + i19;
            i7 = Integer.rotateLeft(rotateLeft18 ^ i14, 7);
            int i39 = i27 + rotateLeft12;
            int rotateLeft19 = Integer.rotateLeft(rotateLeft3 ^ i39, 16);
            int i40 = i36 + rotateLeft19;
            int rotateLeft20 = Integer.rotateLeft(rotateLeft12 ^ i40, 12);
            i3 = i39 + rotateLeft20;
            i16 = Integer.rotateLeft(rotateLeft19 ^ i3, 8);
            i15 = i40 + i16;
            i8 = Integer.rotateLeft(rotateLeft20 ^ i15, 7);
            int i41 = i31 + rotateLeft16;
            int rotateLeft21 = Integer.rotateLeft(rotateLeft7 ^ i41, 16);
            int i42 = i24 + rotateLeft21;
            int rotateLeft22 = Integer.rotateLeft(rotateLeft16 ^ i42, 12);
            i4 = i41 + rotateLeft22;
            i17 = Integer.rotateLeft(rotateLeft21 ^ i4, 8);
            i12 = i42 + i17;
            i10 = Integer.rotateLeft(rotateLeft22 ^ i12, 7);
            int i43 = i35 + rotateLeft4;
            int rotateLeft23 = Integer.rotateLeft(rotateLeft11 ^ i43, 16);
            int i44 = i28 + rotateLeft23;
            int rotateLeft24 = Integer.rotateLeft(rotateLeft4 ^ i44, 12);
            i5 = i43 + rotateLeft24;
            i18 = Integer.rotateLeft(rotateLeft23 ^ i5, 8);
            i13 = i44 + i18;
            i6 = Integer.rotateLeft(rotateLeft24 ^ i13, 7);
            i20 -= 2;
            i = 16;
            c = c5;
            c2 = c6;
            c3 = c7;
            c4 = c8;
            i9 = 7;
            i11 = 8;
        }
        char c9 = c;
        char c10 = c2;
        char c11 = c3;
        char c12 = c4;
        iArr2[0] = i2 + iArr[0];
        iArr2[1] = i3 + iArr[1];
        iArr2[2] = i4 + iArr[2];
        iArr2[c9] = i5 + iArr[c9];
        iArr2[c10] = i6 + iArr[c10];
        iArr2[c11] = i7 + iArr[c11];
        iArr2[c12] = i8 + iArr[c12];
        iArr2[7] = i10 + iArr[7];
        iArr2[8] = i12 + iArr[8];
        iArr2[9] = i13 + iArr[9];
        iArr2[10] = i14 + iArr[10];
        iArr2[11] = i15 + iArr[11];
        iArr2[12] = i16 + iArr[12];
        iArr2[13] = i17 + iArr[13];
        iArr2[14] = i18 + iArr[14];
        iArr2[15] = i19 + iArr[15];
    }

    @Override // defpackage.C13806e
    public final void ad() {
        int[] iArr = this.f27367e;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // defpackage.C13806e
    public final void appmetrica() {
        int[] iArr = this.f27367e;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // defpackage.C13806e
    public final void billing(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f27367e;
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException("ChaCha20 requires 128 bit or 256 bit key");
            }
            C13806e.license(iArr, bArr.length);
            AbstractC3628e.amazon(bArr, 0, iArr, 4, 4);
            AbstractC3628e.amazon(bArr, bArr.length - 16, iArr, 8, 4);
        }
        AbstractC3628e.amazon(bArr2, 0, iArr, 14, 2);
    }

    @Override // defpackage.C13806e, defpackage.InterfaceC14556e
    public final String getAlgorithmName() {
        return "ChaCha20";
    }

    @Override // defpackage.C13806e
    public final void vip(byte[] bArr) {
        int[] iArr = this.f27367e;
        int[] iArr2 = this.f27366e;
        yandex(iArr, iArr2);
        AbstractC3628e.startapp(bArr, iArr2);
    }
}
