package defpackage;

/* renamed from: e٘ۘۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17968e extends AbstractC2040e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f35214e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f35215e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f35216e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int[] f35217e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f35218e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f35219e;

    public C17968e() {
        super(EnumC0300e.f2305e);
        this.f35217e = new int[16];
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        reset();
    }

    public C17968e(C17968e c17968e) {
        super(c17968e);
        this.f35217e = new int[16];
        mopub(c17968e);
    }

    public static int adcel(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    public static int startapp(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C17968e(this);
    }

    @Override // defpackage.AbstractC2040e
    public final void billing(long j) {
        if (this.f35215e > 14) {
            purchase();
        }
        int[] iArr = this.f35217e;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        appmetrica();
        AbstractC3628e.yandex(this.f35214e, i, bArr);
        AbstractC3628e.yandex(this.f35219e, i + 4, bArr);
        AbstractC3628e.yandex(this.f35218e, i + 8, bArr);
        AbstractC3628e.yandex(this.f35216e, i + 12, bArr);
        reset();
        return 16;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "MD5";
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return 16;
    }

    public final void mopub(C17968e c17968e) {
        license(c17968e);
        this.f35214e = c17968e.f35214e;
        this.f35219e = c17968e.f35219e;
        this.f35218e = c17968e.f35218e;
        this.f35216e = c17968e.f35216e;
        int[] iArr = c17968e.f35217e;
        System.arraycopy(iArr, 0, this.f35217e, 0, iArr.length);
        this.f35215e = c17968e.f35215e;
    }

    @Override // defpackage.AbstractC2040e
    public final void purchase() {
        int i = this.f35214e;
        int i2 = this.f35219e;
        int i3 = this.f35218e;
        int i4 = this.f35216e;
        int startapp = startapp(i2, i3, i4) + i;
        int[] iArr = this.f35217e;
        int firebase = AbstractC5087e.firebase(startapp, iArr[0], -680876936, 7, i2);
        int firebase2 = AbstractC5087e.firebase(startapp(firebase, i2, i3) + i4, iArr[1], -389564586, 12, firebase);
        int firebase3 = AbstractC5087e.firebase(startapp(firebase2, firebase, i2) + i3, iArr[2], 606105819, 17, firebase2);
        int firebase4 = AbstractC5087e.firebase(startapp(firebase3, firebase2, firebase) + i2, iArr[3], -1044525330, 22, firebase3);
        int firebase5 = AbstractC5087e.firebase(startapp(firebase4, firebase3, firebase2) + firebase, iArr[4], -176418897, 7, firebase4);
        int firebase6 = AbstractC5087e.firebase(startapp(firebase5, firebase4, firebase3) + firebase2, iArr[5], 1200080426, 12, firebase5);
        int firebase7 = AbstractC5087e.firebase(startapp(firebase6, firebase5, firebase4) + firebase3, iArr[6], -1473231341, 17, firebase6);
        int firebase8 = AbstractC5087e.firebase(startapp(firebase7, firebase6, firebase5) + firebase4, iArr[7], -45705983, 22, firebase7);
        int firebase9 = AbstractC5087e.firebase(startapp(firebase8, firebase7, firebase6) + firebase5, iArr[8], 1770035416, 7, firebase8);
        int firebase10 = AbstractC5087e.firebase(startapp(firebase9, firebase8, firebase7) + firebase6, iArr[9], -1958414417, 12, firebase9);
        int firebase11 = AbstractC5087e.firebase(startapp(firebase10, firebase9, firebase8) + firebase7, iArr[10], -42063, 17, firebase10);
        int firebase12 = AbstractC5087e.firebase(startapp(firebase11, firebase10, firebase9) + firebase8, iArr[11], -1990404162, 22, firebase11);
        int firebase13 = AbstractC5087e.firebase(startapp(firebase12, firebase11, firebase10) + firebase9, iArr[12], 1804603682, 7, firebase12);
        int firebase14 = AbstractC5087e.firebase(startapp(firebase13, firebase12, firebase11) + firebase10, iArr[13], -40341101, 12, firebase13);
        int firebase15 = AbstractC5087e.firebase(startapp(firebase14, firebase13, firebase12) + firebase11, iArr[14], -1502002290, 17, firebase14);
        int firebase16 = AbstractC5087e.firebase(startapp(firebase15, firebase14, firebase13) + firebase12, iArr[15], 1236535329, 22, firebase15);
        int firebase17 = AbstractC5087e.firebase(adcel(firebase16, firebase15, firebase14) + firebase13, iArr[1], -165796510, 5, firebase16);
        int firebase18 = AbstractC5087e.firebase(adcel(firebase17, firebase16, firebase15) + firebase14, iArr[6], -1069501632, 9, firebase17);
        int firebase19 = AbstractC5087e.firebase(adcel(firebase18, firebase17, firebase16) + firebase15, iArr[11], 643717713, 14, firebase18);
        int firebase20 = AbstractC5087e.firebase(adcel(firebase19, firebase18, firebase17) + firebase16, iArr[0], -373897302, 20, firebase19);
        int firebase21 = AbstractC5087e.firebase(adcel(firebase20, firebase19, firebase18) + firebase17, iArr[5], -701558691, 5, firebase20);
        int firebase22 = AbstractC5087e.firebase(adcel(firebase21, firebase20, firebase19) + firebase18, iArr[10], 38016083, 9, firebase21);
        int firebase23 = AbstractC5087e.firebase(adcel(firebase22, firebase21, firebase20) + firebase19, iArr[15], -660478335, 14, firebase22);
        int firebase24 = AbstractC5087e.firebase(adcel(firebase23, firebase22, firebase21) + firebase20, iArr[4], -405537848, 20, firebase23);
        int firebase25 = AbstractC5087e.firebase(adcel(firebase24, firebase23, firebase22) + firebase21, iArr[9], 568446438, 5, firebase24);
        int firebase26 = AbstractC5087e.firebase(adcel(firebase25, firebase24, firebase23) + firebase22, iArr[14], -1019803690, 9, firebase25);
        int firebase27 = AbstractC5087e.firebase(adcel(firebase26, firebase25, firebase24) + firebase23, iArr[3], -187363961, 14, firebase26);
        int firebase28 = AbstractC5087e.firebase(adcel(firebase27, firebase26, firebase25) + firebase24, iArr[8], 1163531501, 20, firebase27);
        int firebase29 = AbstractC5087e.firebase(adcel(firebase28, firebase27, firebase26) + firebase25, iArr[13], -1444681467, 5, firebase28);
        int firebase30 = AbstractC5087e.firebase(adcel(firebase29, firebase28, firebase27) + firebase26, iArr[2], -51403784, 9, firebase29);
        int firebase31 = AbstractC5087e.firebase(adcel(firebase30, firebase29, firebase28) + firebase27, iArr[7], 1735328473, 14, firebase30);
        int firebase32 = AbstractC5087e.firebase(adcel(firebase31, firebase30, firebase29) + firebase28, iArr[12], -1926607734, 20, firebase31);
        int firebase33 = AbstractC5087e.firebase(firebase29 + ((firebase32 ^ firebase31) ^ firebase30), iArr[5], -378558, 4, firebase32);
        int firebase34 = AbstractC5087e.firebase(firebase30 + ((firebase33 ^ firebase32) ^ firebase31), iArr[8], -2022574463, 11, firebase33);
        int firebase35 = AbstractC5087e.firebase(firebase31 + ((firebase34 ^ firebase33) ^ firebase32), iArr[11], 1839030562, 16, firebase34);
        int firebase36 = AbstractC5087e.firebase(firebase32 + ((firebase35 ^ firebase34) ^ firebase33), iArr[14], -35309556, 23, firebase35);
        int firebase37 = AbstractC5087e.firebase(firebase33 + ((firebase36 ^ firebase35) ^ firebase34), iArr[1], -1530992060, 4, firebase36);
        int firebase38 = AbstractC5087e.firebase(firebase34 + ((firebase37 ^ firebase36) ^ firebase35), iArr[4], 1272893353, 11, firebase37);
        int firebase39 = AbstractC5087e.firebase(firebase35 + ((firebase38 ^ firebase37) ^ firebase36), iArr[7], -155497632, 16, firebase38);
        int firebase40 = AbstractC5087e.firebase(firebase36 + ((firebase39 ^ firebase38) ^ firebase37), iArr[10], -1094730640, 23, firebase39);
        int firebase41 = AbstractC5087e.firebase(firebase37 + ((firebase40 ^ firebase39) ^ firebase38), iArr[13], 681279174, 4, firebase40);
        int firebase42 = AbstractC5087e.firebase(firebase38 + ((firebase41 ^ firebase40) ^ firebase39), iArr[0], -358537222, 11, firebase41);
        int firebase43 = AbstractC5087e.firebase(firebase39 + ((firebase42 ^ firebase41) ^ firebase40), iArr[3], -722521979, 16, firebase42);
        int firebase44 = AbstractC5087e.firebase(firebase40 + ((firebase43 ^ firebase42) ^ firebase41), iArr[6], 76029189, 23, firebase43);
        int firebase45 = AbstractC5087e.firebase(firebase41 + ((firebase44 ^ firebase43) ^ firebase42), iArr[9], -640364487, 4, firebase44);
        int firebase46 = AbstractC5087e.firebase(firebase42 + ((firebase45 ^ firebase44) ^ firebase43), iArr[12], -421815835, 11, firebase45);
        int firebase47 = AbstractC5087e.firebase(firebase43 + ((firebase46 ^ firebase45) ^ firebase44), iArr[15], 530742520, 16, firebase46);
        int firebase48 = AbstractC5087e.firebase(firebase44 + ((firebase47 ^ firebase46) ^ firebase45), iArr[2], -995338651, 23, firebase47);
        int firebase49 = AbstractC5087e.firebase(firebase45 + (((~firebase46) | firebase48) ^ firebase47), iArr[0], -198630844, 6, firebase48);
        int firebase50 = AbstractC5087e.firebase(firebase46 + (((~firebase47) | firebase49) ^ firebase48), iArr[7], 1126891415, 10, firebase49);
        int firebase51 = AbstractC5087e.firebase(firebase47 + (((~firebase48) | firebase50) ^ firebase49), iArr[14], -1416354905, 15, firebase50);
        int firebase52 = AbstractC5087e.firebase(firebase48 + (((~firebase49) | firebase51) ^ firebase50), iArr[5], -57434055, 21, firebase51);
        int firebase53 = AbstractC5087e.firebase(firebase49 + (((~firebase50) | firebase52) ^ firebase51), iArr[12], 1700485571, 6, firebase52);
        int firebase54 = AbstractC5087e.firebase(firebase50 + (((~firebase51) | firebase53) ^ firebase52), iArr[3], -1894986606, 10, firebase53);
        int firebase55 = AbstractC5087e.firebase(firebase51 + (((~firebase52) | firebase54) ^ firebase53), iArr[10], -1051523, 15, firebase54);
        int firebase56 = AbstractC5087e.firebase(firebase52 + (((~firebase53) | firebase55) ^ firebase54), iArr[1], -2054922799, 21, firebase55);
        int firebase57 = AbstractC5087e.firebase(firebase53 + (((~firebase54) | firebase56) ^ firebase55), iArr[8], 1873313359, 6, firebase56);
        int firebase58 = AbstractC5087e.firebase(firebase54 + (((~firebase55) | firebase57) ^ firebase56), iArr[15], -30611744, 10, firebase57);
        int firebase59 = AbstractC5087e.firebase(firebase55 + (((~firebase56) | firebase58) ^ firebase57), iArr[6], -1560198380, 15, firebase58);
        int firebase60 = AbstractC5087e.firebase(firebase56 + (((~firebase57) | firebase59) ^ firebase58), iArr[13], 1309151649, 21, firebase59);
        int firebase61 = AbstractC5087e.firebase(firebase57 + (((~firebase58) | firebase60) ^ firebase59), iArr[4], -145523070, 6, firebase60);
        int firebase62 = AbstractC5087e.firebase(firebase58 + (((~firebase59) | firebase61) ^ firebase60), iArr[11], -1120210379, 10, firebase61);
        int firebase63 = AbstractC5087e.firebase(firebase59 + (((~firebase60) | firebase62) ^ firebase61), iArr[2], 718787259, 15, firebase62);
        int firebase64 = AbstractC5087e.firebase(firebase60 + (((~firebase61) | firebase63) ^ firebase62), iArr[9], -343485551, 21, firebase63);
        this.f35214e += firebase61;
        this.f35219e += firebase64;
        this.f35218e += firebase63;
        this.f35216e += firebase62;
        this.f35215e = 0;
        for (int i5 = 0; i5 != iArr.length; i5++) {
            iArr[i5] = 0;
        }
    }

    @Override // defpackage.AbstractC2040e, defpackage.InterfaceC0293e
    public final void reset() {
        super.reset();
        this.f35214e = 1732584193;
        this.f35219e = -271733879;
        this.f35218e = -1732584194;
        this.f35216e = 271733878;
        this.f35215e = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f35217e;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        mopub((C17968e) interfaceC0554e);
    }

    @Override // defpackage.AbstractC2040e
    public final void yandex(int i, byte[] bArr) {
        int i2 = this.f35215e;
        this.f35215e = i2 + 1;
        this.f35217e[i2] = AbstractC3628e.advert(i, bArr);
        if (this.f35215e == 16) {
            purchase();
        }
    }
}
