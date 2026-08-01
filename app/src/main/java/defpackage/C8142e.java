package defpackage;

/* renamed from: eًۗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8142e extends AbstractC2040e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final int[] f16533e = new int[64];

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int[] f16534e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int[] f16535e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f16536e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f16537e;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            f16533e[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            f16533e[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public C8142e() {
        this(EnumC0300e.f2305e);
    }

    public C8142e(EnumC0300e enumC0300e) {
        super(enumC0300e);
        this.f16534e = new int[8];
        this.f16537e = new int[16];
        this.f16535e = new int[68];
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        reset();
    }

    public C8142e(C8142e c8142e) {
        super(c8142e);
        int[] iArr = new int[8];
        this.f16534e = iArr;
        int[] iArr2 = new int[16];
        this.f16537e = iArr2;
        this.f16535e = new int[68];
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        System.arraycopy(c8142e.f16534e, 0, iArr, 0, iArr.length);
        System.arraycopy(c8142e.f16537e, 0, iArr2, 0, iArr2.length);
        this.f16536e = c8142e.f16536e;
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C8142e(this);
    }

    @Override // defpackage.AbstractC2040e
    public final void billing(long j) {
        int i = this.f16536e;
        int[] iArr = this.f16537e;
        if (i > 14) {
            iArr[i] = 0;
            this.f16536e = i + 1;
            purchase();
        }
        while (true) {
            int i2 = this.f16536e;
            if (i2 >= 14) {
                int i3 = i2 + 1;
                this.f16536e = i3;
                iArr[i2] = (int) (j >>> 32);
                this.f16536e = i2 + 2;
                iArr[i3] = (int) j;
                return;
            }
            iArr[i2] = 0;
            this.f16536e = i2 + 1;
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        appmetrica();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f16534e;
            if (i2 >= iArr.length) {
                reset();
                return 32;
            }
            AbstractC3628e.billing(iArr[i2], i, bArr);
            i += 4;
            i2++;
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "SM3";
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return 32;
    }

    @Override // defpackage.AbstractC2040e
    public final void purchase() {
        int[] iArr;
        int i;
        int[] iArr2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            iArr = this.f16535e;
            i = 16;
            if (i3 >= 16) {
                break;
            }
            iArr[i3] = this.f16537e[i3];
            i3++;
        }
        for (int i4 = 16; i4 < 68; i4++) {
            int i5 = iArr[i4 - 3];
            int i6 = iArr[i4 - 13];
            int i7 = ((i5 >>> 17) | (i5 << 15)) ^ (iArr[i4 - 16] ^ iArr[i4 - 9]);
            iArr[i4] = (((i7 ^ ((i7 << 15) | (i7 >>> 17))) ^ ((i7 << 23) | (i7 >>> 9))) ^ ((i6 >>> 25) | (i6 << 7))) ^ iArr[i4 - 6];
        }
        int[] iArr3 = this.f16534e;
        int i8 = iArr3[0];
        int i9 = iArr3[1];
        int i10 = iArr3[2];
        char c = 3;
        int i11 = iArr3[3];
        char c2 = 4;
        int i12 = iArr3[4];
        char c3 = 5;
        int i13 = iArr3[5];
        int i14 = iArr3[6];
        int i15 = iArr3[7];
        int i16 = 0;
        while (true) {
            iArr2 = f16533e;
            if (i16 >= i) {
                break;
            }
            int i17 = (i8 << 12) | (i8 >>> 20);
            int i18 = i17 + i12 + iArr2[i16];
            int i19 = (i18 << 7) | (i18 >>> 25);
            char c4 = c;
            int i20 = i19 ^ i17;
            char c5 = c2;
            int i21 = iArr[i16];
            int i22 = i2;
            int crashlytics = AbstractC8703e.crashlytics((i8 ^ i9) ^ i10, i11, i20, i21 ^ iArr[i16 + 4]);
            int crashlytics2 = AbstractC8703e.crashlytics((i12 ^ i13) ^ i14, i15, i19, i21);
            int i23 = (i9 << 9) | (i9 >>> 23);
            int i24 = (i13 << 19) | (i13 >>> 13);
            int i25 = (crashlytics2 ^ ((crashlytics2 << 9) | (crashlytics2 >>> 23))) ^ ((crashlytics2 << 17) | (crashlytics2 >>> 15));
            i16++;
            i11 = i10;
            i13 = i12;
            c2 = c5;
            c = c4;
            c3 = c3;
            i12 = i25;
            i10 = i23;
            i15 = i14;
            i = 16;
            i14 = i24;
            i9 = i8;
            i8 = crashlytics;
            i2 = i22;
        }
        int i26 = i2;
        char c6 = c;
        char c7 = c2;
        char c8 = c3;
        int i27 = 16;
        while (i27 < 64) {
            int i28 = (i8 << 12) | (i8 >>> 20);
            int i29 = i28 + i12 + iArr2[i27];
            int i30 = (i29 >>> 25) | (i29 << 7);
            int i31 = iArr[i27];
            int crashlytics3 = AbstractC8703e.crashlytics(((i9 | i10) & i8) | (i9 & i10), i11, i28 ^ i30, iArr[i27 + 4] ^ i31);
            int crashlytics4 = AbstractC8703e.crashlytics((i12 & i13) | ((~i12) & i14), i15, i30, i31);
            int i32 = (i13 << 19) | (i13 >>> 13);
            int i33 = (crashlytics4 ^ ((crashlytics4 << 9) | (crashlytics4 >>> 23))) ^ ((crashlytics4 << 17) | (crashlytics4 >>> 15));
            i27++;
            i11 = i10;
            i13 = i12;
            i12 = i33;
            i10 = (i9 >>> 23) | (i9 << 9);
            i15 = i14;
            i9 = i8;
            i14 = i32;
            i8 = crashlytics3;
        }
        iArr3[i26] = iArr3[i26] ^ i8;
        iArr3[1] = iArr3[1] ^ i9;
        iArr3[2] = iArr3[2] ^ i10;
        iArr3[c6] = iArr3[c6] ^ i11;
        iArr3[c7] = iArr3[c7] ^ i12;
        iArr3[c8] = iArr3[c8] ^ i13;
        iArr3[6] = iArr3[6] ^ i14;
        iArr3[7] = iArr3[7] ^ i15;
        this.f16536e = i26;
    }

    @Override // defpackage.AbstractC2040e, defpackage.InterfaceC0293e
    public final void reset() {
        super.reset();
        int[] iArr = this.f16534e;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.f16536e = 0;
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        C8142e c8142e = (C8142e) interfaceC0554e;
        license(c8142e);
        int[] iArr = c8142e.f16534e;
        int[] iArr2 = this.f16534e;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = c8142e.f16537e;
        int[] iArr4 = this.f16537e;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.f16536e = c8142e.f16536e;
    }

    @Override // defpackage.AbstractC2040e
    public final void yandex(int i, byte[] bArr) {
        int i2 = this.f16536e;
        this.f16536e = i2 + 1;
        this.f16537e[i2] = AbstractC3628e.metrica(i, bArr);
        if (this.f16536e >= 16) {
            purchase();
        }
    }
}
