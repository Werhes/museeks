package defpackage;

/* renamed from: eؙؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2408e implements InterfaceC2227e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int[] f6146e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int[] f6147e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final byte[] f6144e = {-42, -112, -23, -2, -52, -31, 61, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, Byte.MIN_VALUE, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, -95, -32, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, 13, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, -68, Byte.MAX_VALUE, 17, -39, 92, 65, 31, 16, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final int[] f6145e = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final int[] f6143e = {-1548633402, 1453994832, 1736282519, -1301273892};

    public C2408e(int i) {
        switch (i) {
            case 1:
                this.f6147e = new int[10];
                this.f6146e = new int[10];
                return;
            default:
                this.f6147e = new int[4];
                return;
        }
    }

    public static int ad(int i) {
        int license = license(i);
        return metrica(license, 24) ^ (((metrica(license, 2) ^ license) ^ metrica(license, 10)) ^ metrica(license, 18));
    }

    public static int license(int i) {
        byte[] bArr = f6144e;
        return (bArr[i & 255] & 255) | ((bArr[(i >> 24) & 255] & 255) << 24) | ((bArr[(i >> 16) & 255] & 255) << 16) | ((bArr[(i >> 8) & 255] & 255) << 8);
    }

    public static int metrica(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static int vip(int i) {
        int license = license(i);
        return metrica(license, 23) ^ (metrica(license, 13) ^ license);
    }

    @Override // defpackage.InterfaceC2227e
    public String getAlgorithmName() {
        return "SM4";
    }

    @Override // defpackage.InterfaceC2227e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        if (!(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to SM4 init - ", interfaceC3894e));
        }
        byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
        if (bArr.length != 16) {
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        int[] iArr = new int[32];
        int[] iArr2 = {AbstractC3628e.metrica(0, bArr), AbstractC3628e.metrica(4, bArr), AbstractC3628e.metrica(8, bArr), AbstractC3628e.metrica(12, bArr)};
        int i = iArr2[0];
        int[] iArr3 = f6143e;
        int[] iArr4 = {i ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        int[] iArr5 = f6145e;
        if (z) {
            int vip = iArr4[0] ^ vip(((iArr4[1] ^ iArr4[2]) ^ iArr4[3]) ^ iArr5[0]);
            iArr[0] = vip;
            int vip2 = vip((vip ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[1] = vip2;
            int vip3 = vip((vip2 ^ (iArr4[3] ^ iArr[0])) ^ iArr5[2]) ^ iArr4[2];
            iArr[2] = vip3;
            iArr[3] = vip((vip3 ^ (iArr[0] ^ iArr[1])) ^ iArr5[3]) ^ iArr4[3];
            for (int i2 = 4; i2 < 32; i2++) {
                iArr[i2] = iArr[i2 - 4] ^ vip(((iArr[i2 - 3] ^ iArr[i2 - 2]) ^ iArr[i2 - 1]) ^ iArr5[i2]);
            }
        } else {
            int vip4 = iArr4[0] ^ vip(((iArr4[1] ^ iArr4[2]) ^ iArr4[3]) ^ iArr5[0]);
            iArr[31] = vip4;
            int vip5 = vip((vip4 ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[30] = vip5;
            int vip6 = vip((vip5 ^ (iArr4[3] ^ iArr[31])) ^ iArr5[2]) ^ iArr4[2];
            iArr[29] = vip6;
            iArr[28] = vip((vip6 ^ (iArr[31] ^ iArr[30])) ^ iArr5[3]) ^ iArr4[3];
            for (int i3 = 27; i3 >= 0; i3--) {
                iArr[i3] = iArr[i3 + 4] ^ vip(((iArr[i3 + 3] ^ iArr[i3 + 2]) ^ iArr[i3 + 1]) ^ iArr5[31 - i3]);
            }
        }
        this.f6146e = iArr;
        if (interfaceC3894e instanceof EnumC0300e) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC2227e
    public int isPro() {
        return 16;
    }

    @Override // defpackage.InterfaceC2227e
    public void reset() {
    }

    @Override // defpackage.InterfaceC2227e
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (this.f6146e == null) {
            throw new IllegalStateException("SM4 not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        int metrica = AbstractC3628e.metrica(i, bArr);
        int[] iArr = this.f6147e;
        iArr[0] = metrica;
        iArr[1] = AbstractC3628e.metrica(i + 4, bArr);
        iArr[2] = AbstractC3628e.metrica(i + 8, bArr);
        iArr[3] = AbstractC3628e.metrica(i + 12, bArr);
        for (int i3 = 0; i3 < 32; i3 += 4) {
            int ad = ad(this.f6146e[i3] ^ ((iArr[1] ^ iArr[2]) ^ iArr[3])) ^ iArr[0];
            iArr[0] = ad;
            int ad2 = ad((ad ^ (iArr[2] ^ iArr[3])) ^ this.f6146e[i3 + 1]) ^ iArr[1];
            iArr[1] = ad2;
            int ad3 = ad((ad2 ^ (iArr[3] ^ iArr[0])) ^ this.f6146e[i3 + 2]) ^ iArr[2];
            iArr[2] = ad3;
            iArr[3] = ad((ad3 ^ (iArr[0] ^ iArr[1])) ^ this.f6146e[i3 + 3]) ^ iArr[3];
        }
        AbstractC3628e.billing(iArr[3], i2, bArr2);
        AbstractC3628e.billing(iArr[2], i2 + 4, bArr2);
        AbstractC3628e.billing(iArr[1], i2 + 8, bArr2);
        AbstractC3628e.billing(iArr[0], i2 + 12, bArr2);
        return 16;
    }
}
