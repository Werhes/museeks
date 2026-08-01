package defpackage;

/* renamed from: eُٔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10997e extends AbstractC2040e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f21778e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final int[] f21779e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f21780e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f21781e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f21782e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f21783e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f21784e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f21785e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f21786e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f21787e;

    public C10997e() {
        super(EnumC0300e.f2305e);
        this.f21779e = new int[16];
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        reset();
    }

    public C10997e(C10997e c10997e) {
        super(c10997e.f5319e);
        this.f21779e = new int[16];
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        subscription(c10997e);
    }

    public static int Signature(int i, int i2, int i3, int i4, int i5, int i6) {
        return admob(((i2 & i4) | (i3 & (~i4))) + i + i5 + 1352829926, i6);
    }

    public static int adcel(int i, int i2, int i3, int i4, int i5, int i6) {
        return admob((((~i2) & i4) | (i3 & i2)) + i + i5 + 1518500249, i6);
    }

    public static int admob(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public static int advert(int i, int i2, int i3, int i4, int i5, int i6) {
        return admob(((((i2 & i4) | (i3 & (~i4))) + i) + i5) - 1894007588, i6);
    }

    public static int amazon(int i, int i2, int i3, int i4, int i5, int i6) {
        return admob((((~i2) & i4) | (i3 & i2)) + i + i5 + 1836072691, i6);
    }

    public static int loadAd(int i, int i2, int i3, int i4, int i5, int i6) {
        return admob(i + ((i2 | (~i3)) ^ i4) + i5 + 1548603684, i6);
    }

    public static int mopub(int i, int i2, int i3, int i4, int i5, int i6) {
        return admob(i + ((i2 | (~i3)) ^ i4) + i5 + 1859775393, i6);
    }

    public static int smaato(int i, int i2, int i3, int i4, int i5, int i6) {
        return admob(i + ((i2 ^ i3) ^ i4) + i5, i6);
    }

    public static int startapp(int i, int i2, int i3, int i4, int i5, int i6) {
        return admob(i + ((i2 ^ i3) ^ i4) + i5, i6);
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C10997e(this);
    }

    @Override // defpackage.AbstractC2040e
    public final void billing(long j) {
        if (this.f21782e > 14) {
            purchase();
        }
        int[] iArr = this.f21779e;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        appmetrica();
        AbstractC3628e.yandex(this.f21778e, i, bArr);
        AbstractC3628e.yandex(this.f21787e, i + 4, bArr);
        AbstractC3628e.yandex(this.f21786e, i + 8, bArr);
        AbstractC3628e.yandex(this.f21783e, i + 12, bArr);
        AbstractC3628e.yandex(this.f21785e, i + 16, bArr);
        AbstractC3628e.yandex(this.f21781e, i + 20, bArr);
        AbstractC3628e.yandex(this.f21784e, i + 24, bArr);
        AbstractC3628e.yandex(this.f21780e, i + 28, bArr);
        reset();
        return 32;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "RIPEMD256";
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return 32;
    }

    @Override // defpackage.AbstractC2040e
    public final void purchase() {
        int i = this.f21778e;
        int i2 = this.f21787e;
        int i3 = this.f21786e;
        int i4 = this.f21783e;
        int i5 = this.f21785e;
        int i6 = this.f21781e;
        int i7 = this.f21784e;
        int i8 = this.f21780e;
        int[] iArr = this.f21779e;
        int startapp = startapp(i, i2, i3, i4, iArr[0], 11);
        int startapp2 = startapp(i4, startapp, i2, i3, iArr[1], 14);
        int startapp3 = startapp(i3, startapp2, startapp, i2, iArr[2], 15);
        int startapp4 = startapp(i2, startapp3, startapp2, startapp, iArr[3], 12);
        int startapp5 = startapp(startapp, startapp4, startapp3, startapp2, iArr[4], 5);
        int startapp6 = startapp(startapp2, startapp5, startapp4, startapp3, iArr[5], 8);
        int startapp7 = startapp(startapp3, startapp6, startapp5, startapp4, iArr[6], 7);
        int startapp8 = startapp(startapp4, startapp7, startapp6, startapp5, iArr[7], 9);
        int startapp9 = startapp(startapp5, startapp8, startapp7, startapp6, iArr[8], 11);
        int startapp10 = startapp(startapp6, startapp9, startapp8, startapp7, iArr[9], 13);
        int startapp11 = startapp(startapp7, startapp10, startapp9, startapp8, iArr[10], 14);
        int startapp12 = startapp(startapp8, startapp11, startapp10, startapp9, iArr[11], 15);
        int startapp13 = startapp(startapp9, startapp12, startapp11, startapp10, iArr[12], 6);
        int startapp14 = startapp(startapp10, startapp13, startapp12, startapp11, iArr[13], 7);
        int startapp15 = startapp(startapp11, startapp14, startapp13, startapp12, iArr[14], 9);
        int startapp16 = startapp(startapp12, startapp15, startapp14, startapp13, iArr[15], 8);
        int Signature = Signature(i5, i6, i7, i8, iArr[5], 8);
        int Signature2 = Signature(i8, Signature, i6, i7, iArr[14], 9);
        int Signature3 = Signature(i7, Signature2, Signature, i6, iArr[7], 9);
        int Signature4 = Signature(i6, Signature3, Signature2, Signature, iArr[0], 11);
        int Signature5 = Signature(Signature, Signature4, Signature3, Signature2, iArr[9], 13);
        int Signature6 = Signature(Signature2, Signature5, Signature4, Signature3, iArr[2], 15);
        int Signature7 = Signature(Signature3, Signature6, Signature5, Signature4, iArr[11], 15);
        int Signature8 = Signature(Signature4, Signature7, Signature6, Signature5, iArr[4], 5);
        int Signature9 = Signature(Signature5, Signature8, Signature7, Signature6, iArr[13], 7);
        int Signature10 = Signature(Signature6, Signature9, Signature8, Signature7, iArr[6], 7);
        int Signature11 = Signature(Signature7, Signature10, Signature9, Signature8, iArr[15], 8);
        int Signature12 = Signature(Signature8, Signature11, Signature10, Signature9, iArr[8], 11);
        int Signature13 = Signature(Signature9, Signature12, Signature11, Signature10, iArr[1], 14);
        int Signature14 = Signature(Signature10, Signature13, Signature12, Signature11, iArr[10], 14);
        int Signature15 = Signature(Signature11, Signature14, Signature13, Signature12, iArr[3], 12);
        int Signature16 = Signature(Signature12, Signature15, Signature14, Signature13, iArr[12], 6);
        int adcel = adcel(Signature13, startapp16, startapp15, startapp14, iArr[7], 7);
        int adcel2 = adcel(startapp14, adcel, startapp16, startapp15, iArr[4], 6);
        int adcel3 = adcel(startapp15, adcel2, adcel, startapp16, iArr[13], 8);
        int adcel4 = adcel(startapp16, adcel3, adcel2, adcel, iArr[1], 13);
        int adcel5 = adcel(adcel, adcel4, adcel3, adcel2, iArr[10], 11);
        int adcel6 = adcel(adcel2, adcel5, adcel4, adcel3, iArr[6], 9);
        int adcel7 = adcel(adcel3, adcel6, adcel5, adcel4, iArr[15], 7);
        int adcel8 = adcel(adcel4, adcel7, adcel6, adcel5, iArr[3], 15);
        int adcel9 = adcel(adcel5, adcel8, adcel7, adcel6, iArr[12], 7);
        int adcel10 = adcel(adcel6, adcel9, adcel8, adcel7, iArr[0], 12);
        int adcel11 = adcel(adcel7, adcel10, adcel9, adcel8, iArr[9], 15);
        int adcel12 = adcel(adcel8, adcel11, adcel10, adcel9, iArr[5], 9);
        int adcel13 = adcel(adcel9, adcel12, adcel11, adcel10, iArr[2], 11);
        int adcel14 = adcel(adcel10, adcel13, adcel12, adcel11, iArr[14], 7);
        int adcel15 = adcel(adcel11, adcel14, adcel13, adcel12, iArr[11], 13);
        int adcel16 = adcel(adcel12, adcel15, adcel14, adcel13, iArr[8], 12);
        int loadAd = loadAd(startapp13, Signature16, Signature15, Signature14, iArr[6], 9);
        int loadAd2 = loadAd(Signature14, loadAd, Signature16, Signature15, iArr[11], 13);
        int loadAd3 = loadAd(Signature15, loadAd2, loadAd, Signature16, iArr[3], 15);
        int loadAd4 = loadAd(Signature16, loadAd3, loadAd2, loadAd, iArr[7], 7);
        int loadAd5 = loadAd(loadAd, loadAd4, loadAd3, loadAd2, iArr[0], 12);
        int loadAd6 = loadAd(loadAd2, loadAd5, loadAd4, loadAd3, iArr[13], 8);
        int loadAd7 = loadAd(loadAd3, loadAd6, loadAd5, loadAd4, iArr[5], 9);
        int loadAd8 = loadAd(loadAd4, loadAd7, loadAd6, loadAd5, iArr[10], 11);
        int loadAd9 = loadAd(loadAd5, loadAd8, loadAd7, loadAd6, iArr[14], 7);
        int loadAd10 = loadAd(loadAd6, loadAd9, loadAd8, loadAd7, iArr[15], 7);
        int loadAd11 = loadAd(loadAd7, loadAd10, loadAd9, loadAd8, iArr[8], 12);
        int loadAd12 = loadAd(loadAd8, loadAd11, loadAd10, loadAd9, iArr[12], 7);
        int loadAd13 = loadAd(loadAd9, loadAd12, loadAd11, loadAd10, iArr[4], 6);
        int loadAd14 = loadAd(loadAd10, loadAd13, loadAd12, loadAd11, iArr[9], 15);
        int loadAd15 = loadAd(loadAd11, loadAd14, loadAd13, loadAd12, iArr[1], 13);
        int loadAd16 = loadAd(loadAd12, loadAd15, loadAd14, loadAd13, iArr[2], 11);
        int mopub = mopub(adcel13, loadAd16, adcel15, adcel14, iArr[3], 11);
        int mopub2 = mopub(adcel14, mopub, loadAd16, adcel15, iArr[10], 13);
        int mopub3 = mopub(adcel15, mopub2, mopub, loadAd16, iArr[14], 6);
        int mopub4 = mopub(loadAd16, mopub3, mopub2, mopub, iArr[4], 7);
        int mopub5 = mopub(mopub, mopub4, mopub3, mopub2, iArr[9], 14);
        int mopub6 = mopub(mopub2, mopub5, mopub4, mopub3, iArr[15], 9);
        int mopub7 = mopub(mopub3, mopub6, mopub5, mopub4, iArr[8], 13);
        int mopub8 = mopub(mopub4, mopub7, mopub6, mopub5, iArr[1], 15);
        int mopub9 = mopub(mopub5, mopub8, mopub7, mopub6, iArr[2], 14);
        int mopub10 = mopub(mopub6, mopub9, mopub8, mopub7, iArr[7], 8);
        int mopub11 = mopub(mopub7, mopub10, mopub9, mopub8, iArr[0], 13);
        int mopub12 = mopub(mopub8, mopub11, mopub10, mopub9, iArr[6], 6);
        int mopub13 = mopub(mopub9, mopub12, mopub11, mopub10, iArr[13], 5);
        int mopub14 = mopub(mopub10, mopub13, mopub12, mopub11, iArr[11], 12);
        int mopub15 = mopub(mopub11, mopub14, mopub13, mopub12, iArr[5], 7);
        int mopub16 = mopub(mopub12, mopub15, mopub14, mopub13, iArr[12], 5);
        int amazon = amazon(loadAd13, adcel16, loadAd15, loadAd14, iArr[15], 9);
        int amazon2 = amazon(loadAd14, amazon, adcel16, loadAd15, iArr[5], 7);
        int amazon3 = amazon(loadAd15, amazon2, amazon, adcel16, iArr[1], 15);
        int amazon4 = amazon(adcel16, amazon3, amazon2, amazon, iArr[3], 11);
        int amazon5 = amazon(amazon, amazon4, amazon3, amazon2, iArr[7], 8);
        int amazon6 = amazon(amazon2, amazon5, amazon4, amazon3, iArr[14], 6);
        int amazon7 = amazon(amazon3, amazon6, amazon5, amazon4, iArr[6], 6);
        int amazon8 = amazon(amazon4, amazon7, amazon6, amazon5, iArr[9], 14);
        int amazon9 = amazon(amazon5, amazon8, amazon7, amazon6, iArr[11], 12);
        int amazon10 = amazon(amazon6, amazon9, amazon8, amazon7, iArr[8], 13);
        int amazon11 = amazon(amazon7, amazon10, amazon9, amazon8, iArr[12], 5);
        int amazon12 = amazon(amazon8, amazon11, amazon10, amazon9, iArr[2], 14);
        int amazon13 = amazon(amazon9, amazon12, amazon11, amazon10, iArr[10], 13);
        int amazon14 = amazon(amazon10, amazon13, amazon12, amazon11, iArr[0], 13);
        int amazon15 = amazon(amazon11, amazon14, amazon13, amazon12, iArr[4], 7);
        int amazon16 = amazon(amazon12, amazon15, amazon14, amazon13, iArr[13], 5);
        int advert = advert(mopub13, mopub16, amazon15, mopub14, iArr[1], 11);
        int advert2 = advert(mopub14, advert, mopub16, amazon15, iArr[9], 12);
        int advert3 = advert(amazon15, advert2, advert, mopub16, iArr[11], 14);
        int advert4 = advert(mopub16, advert3, advert2, advert, iArr[10], 15);
        int advert5 = advert(advert, advert4, advert3, advert2, iArr[0], 14);
        int advert6 = advert(advert2, advert5, advert4, advert3, iArr[8], 15);
        int advert7 = advert(advert3, advert6, advert5, advert4, iArr[12], 9);
        int advert8 = advert(advert4, advert7, advert6, advert5, iArr[4], 8);
        int advert9 = advert(advert5, advert8, advert7, advert6, iArr[13], 9);
        int advert10 = advert(advert6, advert9, advert8, advert7, iArr[3], 14);
        int advert11 = advert(advert7, advert10, advert9, advert8, iArr[7], 5);
        int advert12 = advert(advert8, advert11, advert10, advert9, iArr[15], 6);
        int advert13 = advert(advert9, advert12, advert11, advert10, iArr[14], 8);
        int advert14 = advert(advert10, advert13, advert12, advert11, iArr[5], 6);
        int advert15 = advert(advert11, advert14, advert13, advert12, iArr[6], 5);
        int advert16 = advert(advert12, advert15, advert14, advert13, iArr[2], 12);
        int smaato = smaato(amazon13, amazon16, mopub15, amazon14, iArr[8], 15);
        int smaato2 = smaato(amazon14, smaato, amazon16, mopub15, iArr[6], 5);
        int smaato3 = smaato(mopub15, smaato2, smaato, amazon16, iArr[4], 8);
        int smaato4 = smaato(amazon16, smaato3, smaato2, smaato, iArr[1], 11);
        int smaato5 = smaato(smaato, smaato4, smaato3, smaato2, iArr[3], 14);
        int smaato6 = smaato(smaato2, smaato5, smaato4, smaato3, iArr[11], 14);
        int smaato7 = smaato(smaato3, smaato6, smaato5, smaato4, iArr[15], 6);
        int smaato8 = smaato(smaato4, smaato7, smaato6, smaato5, iArr[0], 14);
        int smaato9 = smaato(smaato5, smaato8, smaato7, smaato6, iArr[5], 6);
        int smaato10 = smaato(smaato6, smaato9, smaato8, smaato7, iArr[12], 9);
        int smaato11 = smaato(smaato7, smaato10, smaato9, smaato8, iArr[2], 12);
        int smaato12 = smaato(smaato8, smaato11, smaato10, smaato9, iArr[13], 9);
        int smaato13 = smaato(smaato9, smaato12, smaato11, smaato10, iArr[9], 12);
        int smaato14 = smaato(smaato10, smaato13, smaato12, smaato11, iArr[7], 5);
        int smaato15 = smaato(smaato11, smaato14, smaato13, smaato12, iArr[10], 15);
        int smaato16 = smaato(smaato12, smaato15, smaato14, smaato13, iArr[14], 8);
        this.f21778e += advert13;
        this.f21787e += advert16;
        this.f21786e += advert15;
        this.f21783e += smaato14;
        this.f21785e += smaato13;
        this.f21781e += smaato16;
        this.f21784e += smaato15;
        this.f21780e += advert14;
        this.f21782e = 0;
        for (int i9 = 0; i9 != iArr.length; i9++) {
            iArr[i9] = 0;
        }
    }

    @Override // defpackage.AbstractC2040e, defpackage.InterfaceC0293e
    public final void reset() {
        super.reset();
        this.f21778e = 1732584193;
        this.f21787e = -271733879;
        this.f21786e = -1732584194;
        this.f21783e = 271733878;
        this.f21785e = 1985229328;
        this.f21781e = -19088744;
        this.f21784e = -1985229329;
        this.f21780e = 19088743;
        this.f21782e = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f21779e;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public final void subscription(C10997e c10997e) {
        license(c10997e);
        this.f21778e = c10997e.f21778e;
        this.f21787e = c10997e.f21787e;
        this.f21786e = c10997e.f21786e;
        this.f21783e = c10997e.f21783e;
        this.f21785e = c10997e.f21785e;
        this.f21781e = c10997e.f21781e;
        this.f21784e = c10997e.f21784e;
        this.f21780e = c10997e.f21780e;
        int[] iArr = c10997e.f21779e;
        System.arraycopy(iArr, 0, this.f21779e, 0, iArr.length);
        this.f21782e = c10997e.f21782e;
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        subscription((C10997e) interfaceC0554e);
    }

    @Override // defpackage.AbstractC2040e
    public final void yandex(int i, byte[] bArr) {
        int i2 = this.f21782e;
        this.f21782e = i2 + 1;
        this.f21779e[i2] = AbstractC3628e.advert(i, bArr);
        if (this.f21782e == 16) {
            purchase();
        }
    }
}
