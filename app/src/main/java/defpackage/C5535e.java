package defpackage;

import java.lang.reflect.Array;

/* renamed from: eٍؘؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5535e implements InterfaceC1196e, InterfaceC0554e {

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final byte[] f11836e = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f11837e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final byte[] f11838e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final byte[] f11839e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f11840e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C15460e f11841e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final short[] f11842e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public byte[] f11843e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f11844e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final byte[] f11845e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final short[] f11846e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final byte[] f11847e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f11848e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public byte[] f11849e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final byte[] f11850e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f11851e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f11852e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EnumC0300e f11853e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final byte[] f11854e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[][] f11855e;

    public C5535e() {
        this(EnumC0300e.f2305e);
    }

    public C5535e(EnumC0300e enumC0300e) {
        this.f11844e = new byte[32];
        this.f11840e = new byte[32];
        this.f11851e = new byte[32];
        this.f11837e = new byte[32];
        this.f11855e = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.f11854e = new byte[32];
        C15460e c15460e = new C15460e();
        this.f11841e = c15460e;
        this.f11839e = new byte[32];
        this.f11838e = new byte[8];
        this.f11842e = new short[16];
        this.f11846e = new short[16];
        this.f11847e = new byte[32];
        this.f11845e = new byte[32];
        this.f11843e = new byte[32];
        this.f11850e = new byte[32];
        this.f11853e = enumC0300e;
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        byte[] license = C15460e.license("D-A");
        this.f11849e = license;
        c15460e.init(true, new C1794e(null, license));
        reset();
    }

    public C5535e(C5535e c5535e) {
        this.f11844e = new byte[32];
        this.f11840e = new byte[32];
        this.f11851e = new byte[32];
        this.f11837e = new byte[32];
        this.f11855e = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.f11854e = new byte[32];
        this.f11841e = new C15460e();
        this.f11839e = new byte[32];
        this.f11838e = new byte[8];
        this.f11842e = new short[16];
        this.f11846e = new short[16];
        this.f11847e = new byte[32];
        this.f11845e = new byte[32];
        this.f11843e = new byte[32];
        this.f11850e = new byte[32];
        this.f11853e = c5535e.f11853e;
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        vip(c5535e);
    }

    public C5535e(byte[] bArr) {
        this.f11844e = new byte[32];
        this.f11840e = new byte[32];
        this.f11851e = new byte[32];
        this.f11837e = new byte[32];
        this.f11855e = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.f11854e = new byte[32];
        C15460e c15460e = new C15460e();
        this.f11841e = c15460e;
        this.f11839e = new byte[32];
        this.f11838e = new byte[8];
        this.f11842e = new short[16];
        this.f11846e = new short[16];
        this.f11847e = new byte[32];
        this.f11845e = new byte[32];
        this.f11843e = new byte[32];
        this.f11850e = new byte[32];
        this.f11853e = EnumC0300e.f2305e;
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        byte[] license = AbstractC12442e.license(bArr);
        this.f11849e = license;
        c15460e.init(true, new C1794e(null, license));
        reset();
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C5535e(this);
    }

    public final byte[] appmetrica(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = this.f11839e;
            if (i >= 8) {
                return bArr2;
            }
            int i2 = i * 4;
            bArr2[i2] = bArr[i];
            bArr2[i2 + 1] = bArr[i + 8];
            bArr2[i2 + 2] = bArr[i + 16];
            bArr2[i2 + 3] = bArr[i + 24];
            i++;
        }
    }

    public final void billing(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3 = this.f11851e;
        System.arraycopy(bArr, 0, bArr3, 0, 32);
        byte[] bArr4 = this.f11844e;
        byte[] bArr5 = this.f11845e;
        System.arraycopy(bArr4, 0, bArr5, 0, 32);
        System.arraycopy(bArr3, 0, this.f11843e, 0, 32);
        int i = 0;
        while (true) {
            bArr2 = this.f11850e;
            if (i >= 32) {
                break;
            }
            bArr2[i] = (byte) (bArr5[i] ^ this.f11843e[i]);
            i++;
        }
        C14915e c14915e = new C14915e(appmetrica(bArr2));
        C15460e c15460e = this.f11841e;
        c15460e.init(true, c14915e);
        byte[] bArr6 = this.f11847e;
        c15460e.tapsense(0, 0, bArr4, bArr6);
        for (int i2 = 1; i2 < 4; i2++) {
            license(bArr5);
            for (int i3 = 0; i3 < 32; i3++) {
                bArr5[i3] = (byte) (bArr5[i3] ^ this.f11855e[i2][i3]);
            }
            byte[] bArr7 = this.f11843e;
            license(bArr7);
            license(bArr7);
            this.f11843e = bArr7;
            for (int i4 = 0; i4 < 32; i4++) {
                bArr2[i4] = (byte) (bArr5[i4] ^ this.f11843e[i4]);
            }
            int i5 = i2 * 8;
            c15460e.init(true, new C14915e(appmetrica(bArr2)));
            c15460e.tapsense(i5, i5, bArr4, bArr6);
        }
        for (int i6 = 0; i6 < 12; i6++) {
            purchase(bArr6);
        }
        for (int i7 = 0; i7 < 32; i7++) {
            bArr6[i7] = (byte) (bArr6[i7] ^ bArr3[i7]);
        }
        purchase(bArr6);
        for (int i8 = 0; i8 < 32; i8++) {
            bArr6[i8] = (byte) (bArr4[i8] ^ bArr6[i8]);
        }
        for (int i9 = 0; i9 < 61; i9++) {
            purchase(bArr6);
        }
        System.arraycopy(bArr6, 0, bArr4, 0, bArr4.length);
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        long j = this.f11852e * 8;
        byte[] bArr2 = this.f11840e;
        AbstractC3628e.subscription(0, j, bArr2);
        while (this.f11848e != 0) {
            update((byte) 0);
        }
        billing(bArr2);
        billing(this.f11837e);
        byte[] bArr3 = this.f11844e;
        System.arraycopy(bArr3, 0, bArr, i, bArr3.length);
        reset();
        return 32;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // defpackage.InterfaceC1196e
    public final int getByteLength() {
        return 32;
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return 32;
    }

    public final void license(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = this.f11838e;
            if (i >= 8) {
                System.arraycopy(bArr, 8, bArr, 0, 24);
                System.arraycopy(bArr2, 0, bArr, 24, 8);
                return;
            } else {
                bArr2[i] = (byte) (bArr[i] ^ bArr[i + 8]);
                i++;
            }
        }
    }

    public final void purchase(byte[] bArr) {
        short[] sArr;
        int i = 0;
        while (true) {
            int length = bArr.length / 2;
            sArr = this.f11842e;
            if (i >= length) {
                break;
            }
            int i2 = i * 2;
            sArr[i] = (short) ((bArr[i2] & 255) | ((bArr[i2 + 1] << 8) & 65280));
            i++;
        }
        short s = (short) (((((sArr[0] ^ sArr[1]) ^ sArr[2]) ^ sArr[3]) ^ sArr[12]) ^ sArr[15]);
        short[] sArr2 = this.f11846e;
        sArr2[15] = s;
        System.arraycopy(sArr, 1, sArr2, 0, 15);
        for (int i3 = 0; i3 < bArr.length / 2; i3++) {
            int i4 = i3 * 2;
            short s2 = sArr2[i3];
            bArr[i4 + 1] = (byte) (s2 >> 8);
            bArr[i4] = (byte) s2;
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final void reset() {
        byte[][] bArr;
        this.f11852e = 0L;
        this.f11848e = 0;
        int i = 0;
        while (true) {
            byte[] bArr2 = this.f11844e;
            if (i >= bArr2.length) {
                break;
            }
            bArr2[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.f11840e;
            if (i2 >= bArr3.length) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr4 = this.f11851e;
            if (i3 >= bArr4.length) {
                break;
            }
            bArr4[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            bArr = this.f11855e;
            byte[] bArr5 = bArr[1];
            if (i4 >= bArr5.length) {
                break;
            }
            bArr5[i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr6 = bArr[3];
            if (i5 >= bArr6.length) {
                break;
            }
            bArr6[i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr7 = this.f11837e;
            if (i6 >= bArr7.length) {
                break;
            }
            bArr7[i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr8 = this.f11854e;
            if (i7 >= bArr8.length) {
                System.arraycopy(f11836e, 0, bArr[2], 0, 32);
                return;
            } else {
                bArr8[i7] = 0;
                i7++;
            }
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        int i = this.f11848e;
        int i2 = i + 1;
        this.f11848e = i2;
        byte[] bArr = this.f11854e;
        bArr[i] = b;
        if (i2 == bArr.length) {
            yandex(bArr);
            billing(bArr);
            this.f11848e = 0;
        }
        this.f11852e++;
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        while (this.f11848e != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.f11854e;
            if (i2 < bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            yandex(bArr2);
            billing(bArr2);
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f11852e += bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        C5535e c5535e = (C5535e) interfaceC0554e;
        byte[] bArr = c5535e.f11849e;
        this.f11849e = bArr;
        this.f11841e.init(true, new C1794e(null, bArr));
        reset();
        byte[] bArr2 = c5535e.f11844e;
        System.arraycopy(bArr2, 0, this.f11844e, 0, bArr2.length);
        byte[] bArr3 = c5535e.f11840e;
        System.arraycopy(bArr3, 0, this.f11840e, 0, bArr3.length);
        byte[] bArr4 = c5535e.f11851e;
        System.arraycopy(bArr4, 0, this.f11851e, 0, bArr4.length);
        byte[] bArr5 = c5535e.f11837e;
        System.arraycopy(bArr5, 0, this.f11837e, 0, bArr5.length);
        byte[][] bArr6 = c5535e.f11855e;
        byte[] bArr7 = bArr6[1];
        byte[][] bArr8 = this.f11855e;
        System.arraycopy(bArr7, 0, bArr8[1], 0, bArr7.length);
        byte[] bArr9 = bArr6[2];
        System.arraycopy(bArr9, 0, bArr8[2], 0, bArr9.length);
        byte[] bArr10 = bArr6[3];
        System.arraycopy(bArr10, 0, bArr8[3], 0, bArr10.length);
        byte[] bArr11 = c5535e.f11854e;
        System.arraycopy(bArr11, 0, this.f11854e, 0, bArr11.length);
        this.f11848e = c5535e.f11848e;
        this.f11852e = c5535e.f11852e;
    }

    public final void yandex(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f11837e;
            if (i == bArr2.length) {
                return;
            }
            int i3 = (bArr2[i] & 255) + (bArr[i] & 255) + i2;
            bArr2[i] = (byte) i3;
            i2 = i3 >>> 8;
            i++;
        }
    }
}
