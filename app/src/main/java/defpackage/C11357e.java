package defpackage;

/* renamed from: eُۣؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11357e extends AbstractC2040e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f22853e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f22854e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f22855e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int[] f22856e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f22857e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f22858e;

    public C11357e() {
        super(EnumC0300e.f2305e);
        this.f22856e = new int[16];
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        reset();
    }

    public C11357e(C11357e c11357e) {
        super(c11357e.f5319e);
        this.f22856e = new int[16];
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        mopub(c11357e);
    }

    public static int adcel(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    public static int advert(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public static int startapp(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C11357e(this);
    }

    @Override // defpackage.AbstractC2040e
    public final void billing(long j) {
        if (this.f22854e > 14) {
            purchase();
        }
        int[] iArr = this.f22856e;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        appmetrica();
        AbstractC3628e.yandex(this.f22853e, i, bArr);
        AbstractC3628e.yandex(this.f22858e, i + 4, bArr);
        AbstractC3628e.yandex(this.f22857e, i + 8, bArr);
        AbstractC3628e.yandex(this.f22855e, i + 12, bArr);
        reset();
        return 16;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "MD4";
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return 16;
    }

    public final void mopub(C11357e c11357e) {
        license(c11357e);
        this.f22853e = c11357e.f22853e;
        this.f22858e = c11357e.f22858e;
        this.f22857e = c11357e.f22857e;
        this.f22855e = c11357e.f22855e;
        int[] iArr = c11357e.f22856e;
        System.arraycopy(iArr, 0, this.f22856e, 0, iArr.length);
        this.f22854e = c11357e.f22854e;
    }

    @Override // defpackage.AbstractC2040e
    public final void purchase() {
        int i = this.f22853e;
        int i2 = this.f22858e;
        int i3 = this.f22857e;
        int i4 = this.f22855e;
        int startapp = startapp(i2, i3, i4) + i;
        int[] iArr = this.f22856e;
        int advert = advert(startapp + iArr[0], 3);
        int advert2 = advert(startapp(advert, i2, i3) + i4 + iArr[1], 7);
        int advert3 = advert(startapp(advert2, advert, i2) + i3 + iArr[2], 11);
        int advert4 = advert(startapp(advert3, advert2, advert) + i2 + iArr[3], 19);
        int advert5 = advert(startapp(advert4, advert3, advert2) + advert + iArr[4], 3);
        int advert6 = advert(startapp(advert5, advert4, advert3) + advert2 + iArr[5], 7);
        int advert7 = advert(startapp(advert6, advert5, advert4) + advert3 + iArr[6], 11);
        int advert8 = advert(startapp(advert7, advert6, advert5) + advert4 + iArr[7], 19);
        int advert9 = advert(startapp(advert8, advert7, advert6) + advert5 + iArr[8], 3);
        int advert10 = advert(startapp(advert9, advert8, advert7) + advert6 + iArr[9], 7);
        int advert11 = advert(startapp(advert10, advert9, advert8) + advert7 + iArr[10], 11);
        int advert12 = advert(startapp(advert11, advert10, advert9) + advert8 + iArr[11], 19);
        int advert13 = advert(startapp(advert12, advert11, advert10) + advert9 + iArr[12], 3);
        int advert14 = advert(startapp(advert13, advert12, advert11) + advert10 + iArr[13], 7);
        int advert15 = advert(startapp(advert14, advert13, advert12) + advert11 + iArr[14], 11);
        int advert16 = advert(startapp(advert15, advert14, advert13) + advert12 + iArr[15], 19);
        int crashlytics = AbstractC5087e.crashlytics(adcel(advert16, advert15, advert14) + advert13, iArr[0], 1518500249, 3);
        int crashlytics2 = AbstractC5087e.crashlytics(adcel(crashlytics, advert16, advert15) + advert14, iArr[4], 1518500249, 5);
        int crashlytics3 = AbstractC5087e.crashlytics(adcel(crashlytics2, crashlytics, advert16) + advert15, iArr[8], 1518500249, 9);
        int crashlytics4 = AbstractC5087e.crashlytics(adcel(crashlytics3, crashlytics2, crashlytics) + advert16, iArr[12], 1518500249, 13);
        int crashlytics5 = AbstractC5087e.crashlytics(adcel(crashlytics4, crashlytics3, crashlytics2) + crashlytics, iArr[1], 1518500249, 3);
        int crashlytics6 = AbstractC5087e.crashlytics(adcel(crashlytics5, crashlytics4, crashlytics3) + crashlytics2, iArr[5], 1518500249, 5);
        int crashlytics7 = AbstractC5087e.crashlytics(adcel(crashlytics6, crashlytics5, crashlytics4) + crashlytics3, iArr[9], 1518500249, 9);
        int crashlytics8 = AbstractC5087e.crashlytics(adcel(crashlytics7, crashlytics6, crashlytics5) + crashlytics4, iArr[13], 1518500249, 13);
        int crashlytics9 = AbstractC5087e.crashlytics(adcel(crashlytics8, crashlytics7, crashlytics6) + crashlytics5, iArr[2], 1518500249, 3);
        int crashlytics10 = AbstractC5087e.crashlytics(adcel(crashlytics9, crashlytics8, crashlytics7) + crashlytics6, iArr[6], 1518500249, 5);
        int crashlytics11 = AbstractC5087e.crashlytics(adcel(crashlytics10, crashlytics9, crashlytics8) + crashlytics7, iArr[10], 1518500249, 9);
        int crashlytics12 = AbstractC5087e.crashlytics(adcel(crashlytics11, crashlytics10, crashlytics9) + crashlytics8, iArr[14], 1518500249, 13);
        int crashlytics13 = AbstractC5087e.crashlytics(adcel(crashlytics12, crashlytics11, crashlytics10) + crashlytics9, iArr[3], 1518500249, 3);
        int crashlytics14 = AbstractC5087e.crashlytics(adcel(crashlytics13, crashlytics12, crashlytics11) + crashlytics10, iArr[7], 1518500249, 5);
        int crashlytics15 = AbstractC5087e.crashlytics(adcel(crashlytics14, crashlytics13, crashlytics12) + crashlytics11, iArr[11], 1518500249, 9);
        int crashlytics16 = AbstractC5087e.crashlytics(adcel(crashlytics15, crashlytics14, crashlytics13) + crashlytics12, iArr[15], 1518500249, 13);
        int crashlytics17 = AbstractC5087e.crashlytics(crashlytics13 + ((crashlytics16 ^ crashlytics15) ^ crashlytics14), iArr[0], 1859775393, 3);
        int crashlytics18 = AbstractC5087e.crashlytics(crashlytics14 + ((crashlytics17 ^ crashlytics16) ^ crashlytics15), iArr[8], 1859775393, 9);
        int crashlytics19 = AbstractC5087e.crashlytics(crashlytics15 + ((crashlytics18 ^ crashlytics17) ^ crashlytics16), iArr[4], 1859775393, 11);
        int crashlytics20 = AbstractC5087e.crashlytics(crashlytics16 + ((crashlytics19 ^ crashlytics18) ^ crashlytics17), iArr[12], 1859775393, 15);
        int crashlytics21 = AbstractC5087e.crashlytics(crashlytics17 + ((crashlytics20 ^ crashlytics19) ^ crashlytics18), iArr[2], 1859775393, 3);
        int crashlytics22 = AbstractC5087e.crashlytics(crashlytics18 + ((crashlytics21 ^ crashlytics20) ^ crashlytics19), iArr[10], 1859775393, 9);
        int crashlytics23 = AbstractC5087e.crashlytics(crashlytics19 + ((crashlytics22 ^ crashlytics21) ^ crashlytics20), iArr[6], 1859775393, 11);
        int crashlytics24 = AbstractC5087e.crashlytics(crashlytics20 + ((crashlytics23 ^ crashlytics22) ^ crashlytics21), iArr[14], 1859775393, 15);
        int crashlytics25 = AbstractC5087e.crashlytics(crashlytics21 + ((crashlytics24 ^ crashlytics23) ^ crashlytics22), iArr[1], 1859775393, 3);
        int crashlytics26 = AbstractC5087e.crashlytics(crashlytics22 + ((crashlytics25 ^ crashlytics24) ^ crashlytics23), iArr[9], 1859775393, 9);
        int crashlytics27 = AbstractC5087e.crashlytics(crashlytics23 + ((crashlytics26 ^ crashlytics25) ^ crashlytics24), iArr[5], 1859775393, 11);
        int crashlytics28 = AbstractC5087e.crashlytics(crashlytics24 + ((crashlytics27 ^ crashlytics26) ^ crashlytics25), iArr[13], 1859775393, 15);
        int crashlytics29 = AbstractC5087e.crashlytics(crashlytics25 + ((crashlytics28 ^ crashlytics27) ^ crashlytics26), iArr[3], 1859775393, 3);
        int crashlytics30 = AbstractC5087e.crashlytics(crashlytics26 + ((crashlytics29 ^ crashlytics28) ^ crashlytics27), iArr[11], 1859775393, 9);
        int crashlytics31 = AbstractC5087e.crashlytics(crashlytics27 + ((crashlytics30 ^ crashlytics29) ^ crashlytics28), iArr[7], 1859775393, 11);
        int crashlytics32 = AbstractC5087e.crashlytics(crashlytics28 + ((crashlytics31 ^ crashlytics30) ^ crashlytics29), iArr[15], 1859775393, 15);
        this.f22853e += crashlytics29;
        this.f22858e += crashlytics32;
        this.f22857e += crashlytics31;
        this.f22855e += crashlytics30;
        this.f22854e = 0;
        for (int i5 = 0; i5 != iArr.length; i5++) {
            iArr[i5] = 0;
        }
    }

    @Override // defpackage.AbstractC2040e, defpackage.InterfaceC0293e
    public final void reset() {
        super.reset();
        this.f22853e = 1732584193;
        this.f22858e = -271733879;
        this.f22857e = -1732584194;
        this.f22855e = 271733878;
        this.f22854e = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f22856e;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        mopub((C11357e) interfaceC0554e);
    }

    @Override // defpackage.AbstractC2040e
    public final void yandex(int i, byte[] bArr) {
        int i2 = this.f22854e;
        this.f22854e = i2 + 1;
        this.f22856e[i2] = AbstractC3628e.advert(i, bArr);
        if (this.f22854e == 16) {
            purchase();
        }
    }
}
