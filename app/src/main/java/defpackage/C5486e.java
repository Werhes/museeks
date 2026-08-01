package defpackage;

/* renamed from: eؘؙۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5486e extends AbstractC2040e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final int[] f11762e = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f11763e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final int[] f11764e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f11765e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f11766e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f11767e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f11768e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f11769e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f11770e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f11771e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f11772e;

    public C5486e() {
        this(EnumC0300e.f2305e);
    }

    public C5486e(EnumC0300e enumC0300e) {
        super(enumC0300e);
        this.f11764e = new int[64];
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        reset();
    }

    public C5486e(C5486e c5486e) {
        super(c5486e);
        this.f11764e = new int[64];
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        smaato(c5486e);
    }

    public static int adcel(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    public static int advert(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    public static int mopub(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    public static int startapp(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C5486e(this);
    }

    @Override // defpackage.AbstractC2040e
    public final void billing(long j) {
        if (this.f11767e > 14) {
            purchase();
        }
        int[] iArr = this.f11764e;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        appmetrica();
        AbstractC3628e.billing(this.f11763e, i, bArr);
        AbstractC3628e.billing(this.f11772e, i + 4, bArr);
        AbstractC3628e.billing(this.f11771e, i + 8, bArr);
        AbstractC3628e.billing(this.f11768e, i + 12, bArr);
        AbstractC3628e.billing(this.f11770e, i + 16, bArr);
        AbstractC3628e.billing(this.f11766e, i + 20, bArr);
        AbstractC3628e.billing(this.f11769e, i + 24, bArr);
        reset();
        return 28;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "SHA-224";
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return 28;
    }

    @Override // defpackage.AbstractC2040e
    public final void purchase() {
        int[] iArr;
        int i = 16;
        while (true) {
            iArr = this.f11764e;
            if (i > 63) {
                break;
            }
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
            i++;
        }
        int i5 = this.f11763e;
        int i6 = this.f11772e;
        int i7 = this.f11771e;
        int i8 = this.f11768e;
        int i9 = this.f11770e;
        int i10 = this.f11766e;
        int i11 = this.f11769e;
        int i12 = this.f11765e;
        int i13 = 0;
        for (int i14 = 0; i14 < 8; i14++) {
            int startapp = startapp(i9, i10, i11) + advert(i9);
            int[] iArr2 = f11762e;
            int i15 = startapp + iArr2[i13] + iArr[i13] + i12;
            int i16 = i8 + i15;
            int adcel = adcel(i5, i6, i7) + mopub(i5) + i15;
            int i17 = i13 + 1;
            int startapp2 = startapp(i16, i9, i10) + advert(i16) + iArr2[i17] + iArr[i17] + i11;
            int i18 = i7 + startapp2;
            int adcel2 = adcel(adcel, i5, i6) + mopub(adcel) + startapp2;
            int i19 = i13 + 2;
            int startapp3 = startapp(i18, i16, i9) + advert(i18) + iArr2[i19] + iArr[i19] + i10;
            int i20 = i6 + startapp3;
            int adcel3 = adcel(adcel2, adcel, i5) + mopub(adcel2) + startapp3;
            int i21 = i13 + 3;
            int startapp4 = startapp(i20, i18, i16) + advert(i20) + iArr2[i21] + iArr[i21] + i9;
            int i22 = i5 + startapp4;
            int adcel4 = adcel(adcel3, adcel2, adcel) + mopub(adcel3) + startapp4;
            int i23 = i13 + 4;
            int startapp5 = startapp(i22, i20, i18) + advert(i22) + iArr2[i23] + iArr[i23] + i16;
            i12 = adcel + startapp5;
            i8 = adcel(adcel4, adcel3, adcel2) + mopub(adcel4) + startapp5;
            int i24 = i13 + 5;
            int startapp6 = startapp(i12, i22, i20) + advert(i12) + iArr2[i24] + iArr[i24] + i18;
            i11 = adcel2 + startapp6;
            i7 = adcel(i8, adcel4, adcel3) + mopub(i8) + startapp6;
            int i25 = i13 + 6;
            int startapp7 = startapp(i11, i12, i22) + advert(i11) + iArr2[i25] + iArr[i25] + i20;
            i10 = adcel3 + startapp7;
            i6 = adcel(i7, i8, adcel4) + mopub(i7) + startapp7;
            int i26 = i13 + 7;
            int startapp8 = startapp(i10, i11, i12) + advert(i10) + iArr2[i26] + iArr[i26] + i22;
            i9 = adcel4 + startapp8;
            i5 = adcel(i6, i7, i8) + mopub(i6) + startapp8;
            i13 += 8;
        }
        this.f11763e += i5;
        this.f11772e += i6;
        this.f11771e += i7;
        this.f11768e += i8;
        this.f11770e += i9;
        this.f11766e += i10;
        this.f11769e += i11;
        this.f11765e += i12;
        this.f11767e = 0;
        for (int i27 = 0; i27 < 16; i27++) {
            iArr[i27] = 0;
        }
    }

    @Override // defpackage.AbstractC2040e, defpackage.InterfaceC0293e
    public final void reset() {
        super.reset();
        this.f11763e = -1056596264;
        this.f11772e = 914150663;
        this.f11771e = 812702999;
        this.f11768e = -150054599;
        this.f11770e = -4191439;
        this.f11766e = 1750603025;
        this.f11769e = 1694076839;
        this.f11765e = -1090891868;
        this.f11767e = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f11764e;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public final void smaato(C5486e c5486e) {
        license(c5486e);
        this.f11763e = c5486e.f11763e;
        this.f11772e = c5486e.f11772e;
        this.f11771e = c5486e.f11771e;
        this.f11768e = c5486e.f11768e;
        this.f11770e = c5486e.f11770e;
        this.f11766e = c5486e.f11766e;
        this.f11769e = c5486e.f11769e;
        this.f11765e = c5486e.f11765e;
        int[] iArr = c5486e.f11764e;
        System.arraycopy(iArr, 0, this.f11764e, 0, iArr.length);
        this.f11767e = c5486e.f11767e;
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        smaato((C5486e) interfaceC0554e);
    }

    @Override // defpackage.AbstractC2040e
    public final void yandex(int i, byte[] bArr) {
        this.f11764e[this.f11767e] = AbstractC3628e.metrica(i, bArr);
        int i2 = this.f11767e + 1;
        this.f11767e = i2;
        if (i2 == 16) {
            purchase();
        }
    }
}
