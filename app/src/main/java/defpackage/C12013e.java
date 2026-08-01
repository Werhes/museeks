package defpackage;

/* renamed from: eِ۟ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12013e extends AbstractC2040e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f24027e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int[] f24028e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f24029e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f24030e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f24031e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f24032e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f24033e;

    public C12013e() {
        this(EnumC0300e.f2305e);
    }

    public C12013e(EnumC0300e enumC0300e) {
        super(enumC0300e);
        this.f24028e = new int[80];
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        reset();
    }

    public C12013e(C12013e c12013e) {
        super(c12013e);
        this.f24028e = new int[80];
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        startapp(c12013e);
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C12013e(this);
    }

    @Override // defpackage.AbstractC2040e
    public final void billing(long j) {
        if (this.f24030e > 14) {
            purchase();
        }
        int[] iArr = this.f24028e;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        appmetrica();
        AbstractC3628e.billing(this.f24027e, i, bArr);
        AbstractC3628e.billing(this.f24033e, i + 4, bArr);
        AbstractC3628e.billing(this.f24032e, i + 8, bArr);
        AbstractC3628e.billing(this.f24029e, i + 12, bArr);
        AbstractC3628e.billing(this.f24031e, i + 16, bArr);
        reset();
        return 20;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return 20;
    }

    @Override // defpackage.AbstractC2040e
    public final void purchase() {
        int[] iArr;
        int i = 16;
        while (true) {
            iArr = this.f24028e;
            if (i >= 80) {
                break;
            }
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
            i++;
        }
        int i3 = this.f24027e;
        int i4 = this.f24033e;
        int i5 = this.f24032e;
        int i6 = this.f24029e;
        int i7 = this.f24031e;
        int i8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            int crashlytics = AbstractC8703e.crashlytics(((i4 & i5) | ((~i4) & i6)) + ((i3 << 5) | (i3 >>> 27)), iArr[i8], 1518500249, i7);
            int i10 = (i4 >>> 2) | (i4 << 30);
            int crashlytics2 = AbstractC8703e.crashlytics(((i3 & i10) | ((~i3) & i5)) + ((crashlytics << 5) | (crashlytics >>> 27)), iArr[i8 + 1], 1518500249, i6);
            int i11 = (i3 >>> 2) | (i3 << 30);
            int crashlytics3 = AbstractC8703e.crashlytics(((crashlytics & i11) | ((~crashlytics) & i10)) + ((crashlytics2 << 5) | (crashlytics2 >>> 27)), iArr[i8 + 2], 1518500249, i5);
            i7 = (crashlytics >>> 2) | (crashlytics << 30);
            int i12 = i8 + 4;
            i4 = AbstractC8703e.crashlytics(((crashlytics2 & i7) | ((~crashlytics2) & i11)) + ((crashlytics3 << 5) | (crashlytics3 >>> 27)), iArr[i8 + 3], 1518500249, i10);
            i6 = (crashlytics2 >>> 2) | (crashlytics2 << 30);
            i8 += 5;
            i3 = AbstractC8703e.crashlytics(((crashlytics3 & i6) | ((~crashlytics3) & i7)) + ((i4 << 5) | (i4 >>> 27)), iArr[i12], 1518500249, i11);
            i5 = (crashlytics3 >>> 2) | (crashlytics3 << 30);
        }
        for (int i13 = 0; i13 < 4; i13++) {
            int crashlytics4 = AbstractC8703e.crashlytics(((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6), iArr[i8], 1859775393, i7);
            int i14 = (i4 >>> 2) | (i4 << 30);
            int crashlytics5 = AbstractC8703e.crashlytics(((crashlytics4 << 5) | (crashlytics4 >>> 27)) + ((i3 ^ i14) ^ i5), iArr[i8 + 1], 1859775393, i6);
            int i15 = (i3 >>> 2) | (i3 << 30);
            int crashlytics6 = AbstractC8703e.crashlytics(((crashlytics5 << 5) | (crashlytics5 >>> 27)) + ((crashlytics4 ^ i15) ^ i14), iArr[i8 + 2], 1859775393, i5);
            i7 = (crashlytics4 >>> 2) | (crashlytics4 << 30);
            int i16 = i8 + 4;
            i4 = AbstractC8703e.crashlytics(((crashlytics6 << 5) | (crashlytics6 >>> 27)) + ((crashlytics5 ^ i7) ^ i15), iArr[i8 + 3], 1859775393, i14);
            i6 = (crashlytics5 >>> 2) | (crashlytics5 << 30);
            i8 += 5;
            i3 = AbstractC8703e.crashlytics(((i4 << 5) | (i4 >>> 27)) + ((crashlytics6 ^ i6) ^ i7), iArr[i16], 1859775393, i15);
            i5 = (crashlytics6 >>> 2) | (crashlytics6 << 30);
        }
        for (int i17 = 0; i17 < 4; i17++) {
            int crashlytics7 = AbstractC8703e.crashlytics((((i5 | i6) & i4) | (i5 & i6)) + ((i3 << 5) | (i3 >>> 27)), iArr[i8], -1894007588, i7);
            int i18 = (i4 >>> 2) | (i4 << 30);
            int crashlytics8 = AbstractC8703e.crashlytics((((i18 | i5) & i3) | (i18 & i5)) + ((crashlytics7 << 5) | (crashlytics7 >>> 27)), iArr[i8 + 1], -1894007588, i6);
            int i19 = (i3 >>> 2) | (i3 << 30);
            int crashlytics9 = AbstractC8703e.crashlytics((((i19 | i18) & crashlytics7) | (i19 & i18)) + ((crashlytics8 << 5) | (crashlytics8 >>> 27)), iArr[i8 + 2], -1894007588, i5);
            i7 = (crashlytics7 >>> 2) | (crashlytics7 << 30);
            int i20 = i8 + 4;
            i4 = AbstractC8703e.crashlytics((((i7 | i19) & crashlytics8) | (i7 & i19)) + ((crashlytics9 << 5) | (crashlytics9 >>> 27)), iArr[i8 + 3], -1894007588, i18);
            i6 = (crashlytics8 >>> 2) | (crashlytics8 << 30);
            i8 += 5;
            i3 = AbstractC8703e.crashlytics((((i6 | i7) & crashlytics9) | (i6 & i7)) + ((i4 << 5) | (i4 >>> 27)), iArr[i20], -1894007588, i19);
            i5 = (crashlytics9 >>> 2) | (crashlytics9 << 30);
        }
        for (int i21 = 0; i21 <= 3; i21++) {
            int crashlytics10 = AbstractC8703e.crashlytics(((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6), iArr[i8], -899497514, i7);
            int i22 = (i4 >>> 2) | (i4 << 30);
            int crashlytics11 = AbstractC8703e.crashlytics(((crashlytics10 << 5) | (crashlytics10 >>> 27)) + ((i3 ^ i22) ^ i5), iArr[i8 + 1], -899497514, i6);
            int i23 = (i3 >>> 2) | (i3 << 30);
            int crashlytics12 = AbstractC8703e.crashlytics(((crashlytics11 << 5) | (crashlytics11 >>> 27)) + ((crashlytics10 ^ i23) ^ i22), iArr[i8 + 2], -899497514, i5);
            i7 = (crashlytics10 >>> 2) | (crashlytics10 << 30);
            int i24 = i8 + 4;
            i4 = AbstractC8703e.crashlytics(((crashlytics12 << 5) | (crashlytics12 >>> 27)) + ((crashlytics11 ^ i7) ^ i23), iArr[i8 + 3], -899497514, i22);
            i6 = (crashlytics11 >>> 2) | (crashlytics11 << 30);
            i8 += 5;
            i3 = AbstractC8703e.crashlytics(((i4 << 5) | (i4 >>> 27)) + ((crashlytics12 ^ i6) ^ i7), iArr[i24], -899497514, i23);
            i5 = (crashlytics12 >>> 2) | (crashlytics12 << 30);
        }
        this.f24027e += i3;
        this.f24033e += i4;
        this.f24032e += i5;
        this.f24029e += i6;
        this.f24031e += i7;
        this.f24030e = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            iArr[i25] = 0;
        }
    }

    @Override // defpackage.AbstractC2040e, defpackage.InterfaceC0293e
    public final void reset() {
        super.reset();
        this.f24027e = 1732584193;
        this.f24033e = -271733879;
        this.f24032e = -1732584194;
        this.f24029e = 271733878;
        this.f24031e = -1009589776;
        this.f24030e = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f24028e;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public final void startapp(C12013e c12013e) {
        this.f24027e = c12013e.f24027e;
        this.f24033e = c12013e.f24033e;
        this.f24032e = c12013e.f24032e;
        this.f24029e = c12013e.f24029e;
        this.f24031e = c12013e.f24031e;
        int[] iArr = c12013e.f24028e;
        System.arraycopy(iArr, 0, this.f24028e, 0, iArr.length);
        this.f24030e = c12013e.f24030e;
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        C12013e c12013e = (C12013e) interfaceC0554e;
        license(c12013e);
        startapp(c12013e);
    }

    @Override // defpackage.AbstractC2040e
    public final void yandex(int i, byte[] bArr) {
        this.f24028e[this.f24030e] = AbstractC3628e.metrica(i, bArr);
        int i2 = this.f24030e + 1;
        this.f24030e = i2;
        if (i2 == 16) {
            purchase();
        }
    }
}
