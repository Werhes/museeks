package defpackage;

/* renamed from: eٟٗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17185e extends AbstractC9276e {
    public final Object ad;
    public final int metrica;
    public final int vip;

    public C17185e(InterfaceC0293e interfaceC0293e) {
        this.ad = interfaceC0293e;
        this.vip = interfaceC0293e.getDigestSize();
        this.metrica = ((InterfaceC1196e) interfaceC0293e).getByteLength();
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [eَؑٓ, java.lang.Object] */
    public final byte[] generateDerivedKey(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int i3;
        C17185e c17185e = this;
        int i4 = c17185e.metrica;
        byte[] bArr3 = new byte[i4];
        byte[] bArr4 = new byte[i2];
        int i5 = 0;
        for (int i6 = 0; i6 != i4; i6++) {
            bArr3[i6] = (byte) i;
        }
        byte[] bArr5 = c17185e.salt;
        int i7 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int length = (((bArr5.length + i4) - 1) / i4) * i4;
            bArr = new byte[length];
            for (int i8 = 0; i8 != length; i8++) {
                byte[] bArr6 = c17185e.salt;
                bArr[i8] = bArr6[i8 % bArr6.length];
            }
        }
        byte[] bArr7 = c17185e.password;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int length2 = (((bArr7.length + i4) - 1) / i4) * i4;
            bArr2 = new byte[length2];
            for (int i9 = 0; i9 != length2; i9++) {
                byte[] bArr8 = c17185e.password;
                bArr2[i9] = bArr8[i9 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        byte[] bArr10 = new byte[i4];
        int i10 = c17185e.vip;
        int i11 = ((i2 + i10) - 1) / i10;
        byte[] bArr11 = new byte[i10];
        int i12 = 1;
        while (i12 <= i11) {
            ?? r14 = c17185e.ad;
            r14.update(bArr3, i5, i4);
            r14.update(bArr9, i5, length3);
            r14.doFinal(bArr11, i5);
            int i13 = i7;
            for (int i14 = i13; i14 < c17185e.iterationCount; i14++) {
                r14.update(bArr11, i5, i10);
                r14.doFinal(bArr11, i5);
            }
            for (int i15 = i5; i15 != i4; i15++) {
                bArr10[i15] = bArr11[i15 % i10];
            }
            for (int i16 = i5; i16 != length3 / i4; i16++) {
                int i17 = i16 * i4;
                int i18 = (i17 + i4) - 1;
                int i19 = (bArr10[i4 - 1] & 255) + (bArr9[i18] & 255) + 1;
                bArr9[i18] = (byte) i19;
                int i20 = i19 >>> 8;
                for (int i21 = i4 - 2; i21 >= 0; i21--) {
                    int i22 = i17 + i21;
                    int i23 = (bArr10[i21] & 255) + (bArr9[i22] & 255) + i20;
                    bArr9[i22] = (byte) i23;
                    i20 = i23 >>> 8;
                }
            }
            if (i12 == i11) {
                int i24 = (i12 - 1) * i10;
                i3 = 0;
                System.arraycopy(bArr11, 0, bArr4, i24, i2 - i24);
            } else {
                i3 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i12 - 1) * i10, i10);
            }
            i12++;
            c17185e = this;
            i5 = i3;
            i7 = i13;
        }
        return bArr4;
    }

    @Override // defpackage.AbstractC9276e
    public final InterfaceC3894e generateDerivedMacParameters(int i) {
        int i2 = i / 8;
        return new C14915e(generateDerivedKey(3, i2), 0, i2);
    }

    @Override // defpackage.AbstractC9276e
    public final InterfaceC3894e generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new C14915e(generateDerivedKey(1, i2), 0, i2);
    }

    @Override // defpackage.AbstractC9276e
    public final InterfaceC3894e generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] generateDerivedKey = generateDerivedKey(1, i3);
        return new C11494e(new C14915e(generateDerivedKey, 0, i3), generateDerivedKey(2, i4), 0, i4);
    }
}
