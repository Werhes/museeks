package defpackage;

/* renamed from: eؑۥؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0683e implements InterfaceC11306e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f2957e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f2958e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f2959e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f2960e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f2961e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public int f2962e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f2963e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public int f2964e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f2965e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int f2966e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f2967e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final byte[] f2968e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f2969e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f2970e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public int f2971e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public int f2972e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f2973e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f2974e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC2227e f2975e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f2976e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f2977e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public int f2978e;

    public C0683e() {
        this.f2965e = new byte[1];
        this.f2968e = new byte[16];
        this.f2966e = 0;
        this.f2975e = null;
    }

    public C0683e(InterfaceC2227e interfaceC2227e) {
        this.f2965e = new byte[1];
        this.f2968e = new byte[16];
        this.f2966e = 0;
        if (interfaceC2227e.isPro() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.f2975e = interfaceC2227e;
    }

    public static final long ad(int i, int i2) {
        return (i & 4294967295L) * i2;
    }

    @Override // defpackage.InterfaceC11306e
    public final int doFinal(byte[] bArr, int i) {
        if (16 > bArr.length) {
            throw new RuntimeException("Output buffer is too short.");
        }
        if (this.f2966e > 0) {
            vip();
        }
        int i2 = this.f2972e;
        int i3 = this.f2964e;
        int i4 = i2 + (i3 >>> 26);
        int i5 = this.f2978e + (i4 >>> 26);
        int i6 = this.f2962e + (i5 >>> 26);
        int i7 = i5 & 67108863;
        int i8 = this.f2971e + (i6 >>> 26);
        int i9 = i6 & 67108863;
        int i10 = ((i8 >>> 26) * 5) + (i3 & 67108863);
        int i11 = i8 & 67108863;
        int i12 = (i4 & 67108863) + (i10 >>> 26);
        int i13 = i10 & 67108863;
        int i14 = i13 + 5;
        int i15 = (i14 >>> 26) + i12;
        int i16 = (i15 >>> 26) + i7;
        int i17 = (i16 >>> 26) + i9;
        int i18 = 67108863 & i17;
        int i19 = ((i17 >>> 26) + i11) - 67108864;
        int i20 = (i19 >>> 31) - 1;
        int i21 = ~i20;
        this.f2964e = (i13 & i21) | (i14 & 67108863 & i20);
        this.f2972e = (i12 & i21) | (i15 & 67108863 & i20);
        this.f2978e = (i7 & i21) | (i16 & 67108863 & i20);
        this.f2962e = (i18 & i20) | (i9 & i21);
        this.f2971e = (i11 & i21) | (i19 & i20);
        long j = (((r2 << 26) | r8) & 4294967295L) + (this.f2959e & 4294967295L);
        long j2 = (((r6 >>> 12) | (r5 << 14)) & 4294967295L) + (this.f2963e & 4294967295L);
        AbstractC3628e.yandex((int) j, 0, bArr);
        long j3 = (((r2 >>> 6) | (r6 << 20)) & 4294967295L) + (this.f2958e & 4294967295L) + (j >>> 32);
        AbstractC3628e.yandex((int) j3, 4, bArr);
        long j4 = j2 + (j3 >>> 32);
        AbstractC3628e.yandex((int) j4, 8, bArr);
        AbstractC3628e.yandex((int) ((((r5 >>> 18) | (r4 << 8)) & 4294967295L) + (this.f2967e & 4294967295L) + (j4 >>> 32)), 12, bArr);
        reset();
        return 16;
    }

    @Override // defpackage.InterfaceC11306e
    public final String getAlgorithmName() {
        InterfaceC2227e interfaceC2227e = this.f2975e;
        if (interfaceC2227e == null) {
            return "Poly1305";
        }
        return "Poly1305-" + interfaceC2227e.getAlgorithmName();
    }

    @Override // defpackage.InterfaceC11306e
    public final int getMacSize() {
        return 16;
    }

    @Override // defpackage.InterfaceC11306e
    public final void init(InterfaceC3894e interfaceC3894e) {
        byte[] bArr;
        InterfaceC2227e interfaceC2227e = this.f2975e;
        if (interfaceC2227e == null) {
            bArr = null;
        } else {
            if (!(interfaceC3894e instanceof C11494e)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            C11494e c11494e = (C11494e) interfaceC3894e;
            bArr = c11494e.f23095e;
            interfaceC3894e = c11494e.f23094e;
        }
        if (!(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        byte[] bArr2 = ((C14915e) interfaceC3894e).f29591e;
        if (bArr2.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i = 16;
        if (interfaceC2227e != null && (bArr == null || bArr.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int advert = AbstractC3628e.advert(0, bArr2);
        int advert2 = AbstractC3628e.advert(4, bArr2);
        int advert3 = AbstractC3628e.advert(8, bArr2);
        int advert4 = AbstractC3628e.advert(12, bArr2);
        this.f2960e = 67108863 & advert;
        int i2 = ((advert >>> 26) | (advert2 << 6)) & 67108611;
        this.f2973e = i2;
        int i3 = ((advert2 >>> 20) | (advert3 << 12)) & 67092735;
        this.f2957e = i3;
        int i4 = ((advert3 >>> 14) | (advert4 << 18)) & 66076671;
        this.f2977e = i4;
        int i5 = (advert4 >>> 8) & 1048575;
        this.f2976e = i5;
        this.f2969e = i2 * 5;
        this.f2974e = i3 * 5;
        this.f2961e = i4 * 5;
        this.f2970e = i5 * 5;
        if (interfaceC2227e != null) {
            byte[] bArr3 = new byte[16];
            interfaceC2227e.init(true, new C14915e(bArr2, 16, 16));
            interfaceC2227e.tapsense(0, 0, bArr, bArr3);
            i = 0;
            bArr2 = bArr3;
        }
        this.f2959e = AbstractC3628e.advert(i, bArr2);
        this.f2958e = AbstractC3628e.advert(i + 4, bArr2);
        this.f2963e = AbstractC3628e.advert(i + 8, bArr2);
        this.f2967e = AbstractC3628e.advert(i + 12, bArr2);
        reset();
    }

    @Override // defpackage.InterfaceC11306e
    public final void reset() {
        this.f2966e = 0;
        this.f2971e = 0;
        this.f2962e = 0;
        this.f2978e = 0;
        this.f2972e = 0;
        this.f2964e = 0;
    }

    @Override // defpackage.InterfaceC11306e
    public final void update(byte b) {
        byte[] bArr = this.f2965e;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    @Override // defpackage.InterfaceC11306e
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i2 > i3) {
            if (this.f2966e == 16) {
                vip();
                this.f2966e = 0;
            }
            int min = Math.min(i2 - i3, 16 - this.f2966e);
            System.arraycopy(bArr, i3 + i, this.f2968e, this.f2966e, min);
            i3 += min;
            this.f2966e += min;
        }
    }

    public final void vip() {
        int i = this.f2966e;
        byte[] bArr = this.f2968e;
        if (i < 16) {
            bArr[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                bArr[i2] = 0;
            }
        }
        long advert = AbstractC3628e.advert(0, bArr);
        long j = advert & 4294967295L;
        long advert2 = AbstractC3628e.advert(4, bArr) & 4294967295L;
        long advert3 = AbstractC3628e.advert(8, bArr) & 4294967295L;
        long advert4 = 4294967295L & AbstractC3628e.advert(12, bArr);
        int i3 = (int) (this.f2964e + (advert & 67108863));
        this.f2964e = i3;
        this.f2972e = (int) (this.f2972e + ((((advert2 << 32) | j) >>> 26) & 67108863));
        this.f2978e = (int) (this.f2978e + ((((advert3 << 32) | advert2) >>> 20) & 67108863));
        this.f2962e = (int) (this.f2962e + ((((advert4 << 32) | advert3) >>> 14) & 67108863));
        int i4 = (int) (this.f2971e + (advert4 >>> 8));
        this.f2971e = i4;
        if (this.f2966e == 16) {
            this.f2971e = i4 + 16777216;
        }
        long ad = ad(this.f2971e, this.f2969e) + ad(this.f2962e, this.f2974e) + ad(this.f2978e, this.f2961e) + ad(this.f2972e, this.f2970e) + ad(i3, this.f2960e);
        long ad2 = ad(this.f2971e, this.f2974e) + ad(this.f2962e, this.f2961e) + ad(this.f2978e, this.f2970e) + ad(this.f2972e, this.f2960e) + ad(this.f2964e, this.f2973e);
        long ad3 = ad(this.f2971e, this.f2961e) + ad(this.f2962e, this.f2970e) + ad(this.f2978e, this.f2960e) + ad(this.f2972e, this.f2973e) + ad(this.f2964e, this.f2957e);
        long ad4 = ad(this.f2971e, this.f2970e) + ad(this.f2962e, this.f2960e) + ad(this.f2978e, this.f2973e) + ad(this.f2972e, this.f2957e) + ad(this.f2964e, this.f2977e);
        long ad5 = ad(this.f2971e, this.f2960e) + ad(this.f2962e, this.f2973e) + ad(this.f2978e, this.f2957e) + ad(this.f2972e, this.f2977e) + ad(this.f2964e, this.f2976e);
        long j2 = ad2 + (ad >>> 26);
        long j3 = ad3 + (j2 >>> 26);
        this.f2978e = ((int) j3) & 67108863;
        long j4 = ad4 + (j3 >>> 26);
        this.f2962e = ((int) j4) & 67108863;
        long j5 = ad5 + (j4 >>> 26);
        this.f2971e = ((int) j5) & 67108863;
        int i5 = (((int) (j5 >>> 26)) * 5) + (((int) ad) & 67108863);
        this.f2972e = (((int) j2) & 67108863) + (i5 >>> 26);
        this.f2964e = i5 & 67108863;
    }
}
