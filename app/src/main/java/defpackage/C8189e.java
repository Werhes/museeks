package defpackage;

/* renamed from: eًۙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8189e extends C0462e {

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final int[] f16672e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final int[] f16673e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final int[] f16674e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final int[] f16675e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final int[] f16676e;

    public C8189e() {
        super(1);
        this.f16675e = new int[48];
        this.f16676e = new int[48];
        this.f16674e = new int[192];
        this.f16672e = new int[192];
        this.f16673e = new int[8];
    }

    @Override // defpackage.C0462e
    public final int admob(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        int[] iArr;
        int[] iArr2;
        int metrica = C0462e.metrica(i, bArr);
        int metrica2 = C0462e.metrica(i + 4, bArr);
        int metrica3 = C0462e.metrica(i + 8, bArr);
        int metrica4 = C0462e.metrica(i + 12, bArr);
        int i4 = 0;
        while (true) {
            iArr = this.f16675e;
            iArr2 = this.f16676e;
            if (i4 >= 6) {
                break;
            }
            int i5 = (11 - i4) * 4;
            metrica3 ^= C0462e.license(metrica4, iArr2[i5], iArr[i5]);
            int i6 = i5 + 1;
            metrica2 ^= C0462e.appmetrica(metrica3, iArr2[i6], iArr[i6]);
            int i7 = i5 + 2;
            metrica ^= C0462e.purchase(metrica2, iArr2[i7], iArr[i7]);
            int i8 = i5 + 3;
            metrica4 ^= C0462e.license(metrica, iArr2[i8], iArr[i8]);
            i4++;
        }
        for (i3 = 6; i3 < 12; i3++) {
            int i9 = (11 - i3) * 4;
            int i10 = i9 + 3;
            metrica4 ^= C0462e.license(metrica, iArr2[i10], iArr[i10]);
            int i11 = i9 + 2;
            metrica ^= C0462e.purchase(metrica2, iArr2[i11], iArr[i11]);
            int i12 = i9 + 1;
            metrica2 ^= C0462e.appmetrica(metrica3, iArr2[i12], iArr[i12]);
            metrica3 ^= C0462e.license(metrica4, iArr2[i9], iArr[i9]);
        }
        int[] iArr3 = {metrica, metrica2, metrica3, metrica4};
        C0462e.ad(iArr3[0], i2, bArr2);
        C0462e.ad(iArr3[1], i2 + 4, bArr2);
        C0462e.ad(iArr3[2], i2 + 8, bArr2);
        C0462e.ad(iArr3[3], i2 + 12, bArr2);
        return 16;
    }

    @Override // defpackage.C0462e
    public final void crashlytics(byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i = 1518500249;
        int i2 = 19;
        boolean z = false;
        int i3 = 0;
        while (true) {
            iArr = this.f16674e;
            iArr2 = this.f16672e;
            if (i3 >= 24) {
                break;
            }
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = (i3 * 8) + i4;
                iArr2[i5] = i;
                i += 1859775393;
                iArr[i5] = i2;
                i2 = (i2 + 17) & 31;
            }
            i3++;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i6 = 0;
        while (true) {
            iArr3 = this.f16673e;
            if (i6 >= 8) {
                break;
            }
            iArr3[i6] = C0462e.metrica(i6 * 4, bArr2);
            i6++;
        }
        int i7 = 0;
        while (i7 < 12) {
            int i8 = i7 * 16;
            int license = iArr3[6] ^ C0462e.license(iArr3[7], iArr2[i8], iArr[i8]);
            iArr3[6] = license;
            int i9 = i8 + 1;
            int appmetrica = C0462e.appmetrica(license, iArr2[i9], iArr[i9]) ^ iArr3[5];
            iArr3[5] = appmetrica;
            int i10 = i8 + 2;
            boolean z2 = z;
            int purchase = C0462e.purchase(appmetrica, iArr2[i10], iArr[i10]) ^ iArr3[4];
            iArr3[4] = purchase;
            int i11 = i8 + 3;
            int license2 = C0462e.license(purchase, iArr2[i11], iArr[i11]) ^ iArr3[3];
            iArr3[3] = license2;
            int i12 = i8 + 4;
            int appmetrica2 = C0462e.appmetrica(license2, iArr2[i12], iArr[i12]) ^ iArr3[2];
            iArr3[2] = appmetrica2;
            int i13 = i8 + 5;
            int purchase2 = C0462e.purchase(appmetrica2, iArr2[i13], iArr[i13]) ^ iArr3[1];
            iArr3[1] = purchase2;
            int i14 = i8 + 6;
            int license3 = C0462e.license(purchase2, iArr2[i14], iArr[i14]) ^ iArr3[z2 ? 1 : 0];
            iArr3[z2 ? 1 : 0] = license3;
            int i15 = i8 + 7;
            int appmetrica3 = C0462e.appmetrica(license3, iArr2[i15], iArr[i15]) ^ iArr3[7];
            iArr3[7] = appmetrica3;
            int i16 = ((i7 * 2) + 1) * 8;
            int license4 = C0462e.license(appmetrica3, iArr2[i16], iArr[i16]) ^ iArr3[6];
            iArr3[6] = license4;
            int i17 = i16 + 1;
            int appmetrica4 = C0462e.appmetrica(license4, iArr2[i17], iArr[i17]) ^ iArr3[5];
            iArr3[5] = appmetrica4;
            int i18 = i16 + 2;
            int purchase3 = C0462e.purchase(appmetrica4, iArr2[i18], iArr[i18]) ^ iArr3[4];
            iArr3[4] = purchase3;
            int i19 = i16 + 3;
            int license5 = C0462e.license(purchase3, iArr2[i19], iArr[i19]) ^ iArr3[3];
            iArr3[3] = license5;
            int i20 = i16 + 4;
            int appmetrica5 = C0462e.appmetrica(license5, iArr2[i20], iArr[i20]) ^ iArr3[2];
            iArr3[2] = appmetrica5;
            int i21 = i16 + 5;
            int purchase4 = C0462e.purchase(appmetrica5, iArr2[i21], iArr[i21]) ^ iArr3[1];
            iArr3[1] = purchase4;
            int i22 = i16 + 6;
            int license6 = C0462e.license(purchase4, iArr2[i22], iArr[i22]) ^ iArr3[z2 ? 1 : 0];
            iArr3[z2 ? 1 : 0] = license6;
            int i23 = i16 + 7;
            iArr3[7] = C0462e.appmetrica(license6, iArr2[i23], iArr[i23]) ^ iArr3[7];
            int i24 = i7 * 4;
            int i25 = iArr3[z2 ? 1 : 0] & 31;
            int[] iArr4 = this.f16675e;
            iArr4[i24] = i25;
            int i26 = i24 + 1;
            iArr4[i26] = iArr3[2] & 31;
            int i27 = i24 + 2;
            iArr4[i27] = iArr3[4] & 31;
            int i28 = i24 + 3;
            iArr4[i28] = iArr3[6] & 31;
            int i29 = iArr3[7];
            int[] iArr5 = this.f16676e;
            iArr5[i24] = i29;
            iArr5[i26] = iArr3[5];
            iArr5[i27] = iArr3[3];
            iArr5[i28] = iArr3[1];
            i7++;
            z = z2 ? 1 : 0;
        }
    }

    @Override // defpackage.C0462e, defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        return "CAST6";
    }

    @Override // defpackage.C0462e, defpackage.InterfaceC2227e
    public final int isPro() {
        return 16;
    }

    @Override // defpackage.C0462e, defpackage.InterfaceC2227e
    public final void reset() {
    }

    @Override // defpackage.C0462e
    public final int subscription(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        int[] iArr;
        int[] iArr2;
        int metrica = C0462e.metrica(i, bArr);
        int metrica2 = C0462e.metrica(i + 4, bArr);
        int metrica3 = C0462e.metrica(i + 8, bArr);
        int metrica4 = C0462e.metrica(i + 12, bArr);
        int i4 = 0;
        while (true) {
            iArr = this.f16675e;
            iArr2 = this.f16676e;
            if (i4 >= 6) {
                break;
            }
            int i5 = i4 * 4;
            metrica3 ^= C0462e.license(metrica4, iArr2[i5], iArr[i5]);
            int i6 = i5 + 1;
            metrica2 ^= C0462e.appmetrica(metrica3, iArr2[i6], iArr[i6]);
            int i7 = i5 + 2;
            metrica ^= C0462e.purchase(metrica2, iArr2[i7], iArr[i7]);
            int i8 = i5 + 3;
            metrica4 ^= C0462e.license(metrica, iArr2[i8], iArr[i8]);
            i4++;
        }
        for (i3 = 6; i3 < 12; i3++) {
            int i9 = i3 * 4;
            int i10 = i9 + 3;
            metrica4 ^= C0462e.license(metrica, iArr2[i10], iArr[i10]);
            int i11 = i9 + 2;
            metrica ^= C0462e.purchase(metrica2, iArr2[i11], iArr[i11]);
            int i12 = i9 + 1;
            metrica2 ^= C0462e.appmetrica(metrica3, iArr2[i12], iArr[i12]);
            metrica3 ^= C0462e.license(metrica4, iArr2[i9], iArr[i9]);
        }
        int[] iArr3 = {metrica, metrica2, metrica3, metrica4};
        C0462e.ad(iArr3[0], i2, bArr2);
        C0462e.ad(iArr3[1], i2 + 4, bArr2);
        C0462e.ad(iArr3[2], i2 + 8, bArr2);
        C0462e.ad(iArr3[3], i2 + 12, bArr2);
        return 16;
    }
}
