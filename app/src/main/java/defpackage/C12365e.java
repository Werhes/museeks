package defpackage;

import org.conscrypt.PSKKeyManager;

/* renamed from: eٌّٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12365e implements InterfaceC1196e, InterfaceC0554e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final byte[] f24787e = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, 95, 33, Byte.MIN_VALUE, Byte.MAX_VALUE, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f24788e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f24789e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f24790e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f24791e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EnumC0300e f24792e;

    public C12365e() {
        this(EnumC0300e.f2305e);
    }

    public C12365e(EnumC0300e enumC0300e) {
        this.f24790e = new byte[48];
        this.f24789e = new byte[16];
        this.f24788e = new byte[16];
        this.f24792e = enumC0300e;
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        reset();
    }

    public C12365e(C12365e c12365e) {
        this.f24790e = new byte[48];
        this.f24789e = new byte[16];
        this.f24788e = new byte[16];
        this.f24792e = c12365e.f24792e;
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        license(c12365e);
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C12365e(this);
    }

    public final void appmetrica(byte[] bArr) {
        byte[] bArr2;
        int i = 0;
        while (true) {
            bArr2 = this.f24790e;
            if (i >= 16) {
                break;
            }
            bArr2[i + 16] = bArr[i];
            bArr2[i + 32] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 18; i3++) {
            for (int i4 = 0; i4 < 48; i4++) {
                byte b = (byte) (f24787e[i2] ^ bArr2[i4]);
                bArr2[i4] = b;
                i2 = b & 255;
            }
            i2 = (i2 + i3) % PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = this.f24789e;
        int length = bArr2.length;
        int i2 = this.f24791e;
        byte b = (byte) (length - i2);
        while (i2 < bArr2.length) {
            bArr2[i2] = b;
            i2++;
        }
        purchase(bArr2);
        appmetrica(bArr2);
        appmetrica(this.f24788e);
        System.arraycopy(this.f24790e, 0, bArr, i, 16);
        reset();
        return 16;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "MD2";
    }

    @Override // defpackage.InterfaceC1196e
    public final int getByteLength() {
        return 16;
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return 16;
    }

    public final void license(C12365e c12365e) {
        byte[] bArr = c12365e.f24790e;
        System.arraycopy(bArr, 0, this.f24790e, 0, bArr.length);
        byte[] bArr2 = c12365e.f24789e;
        System.arraycopy(bArr2, 0, this.f24789e, 0, bArr2.length);
        this.f24791e = c12365e.f24791e;
        byte[] bArr3 = c12365e.f24788e;
        System.arraycopy(bArr3, 0, this.f24788e, 0, bArr3.length);
    }

    public final void purchase(byte[] bArr) {
        byte[] bArr2 = this.f24788e;
        byte b = bArr2[15];
        for (int i = 0; i < 16; i++) {
            b = (byte) (f24787e[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            bArr2[i] = b;
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f24790e;
            if (i == bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.f24791e = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f24789e;
            if (i2 == bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.f24788e;
            if (i3 == bArr3.length) {
                return;
            }
            bArr3[i3] = 0;
            i3++;
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        int i = this.f24791e;
        int i2 = i + 1;
        this.f24791e = i2;
        byte[] bArr = this.f24789e;
        bArr[i] = b;
        if (i2 == 16) {
            purchase(bArr);
            appmetrica(bArr);
            this.f24791e = 0;
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        while (this.f24791e != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 >= 16) {
            byte[] bArr2 = this.f24789e;
            System.arraycopy(bArr, i, bArr2, 0, 16);
            purchase(bArr2);
            appmetrica(bArr2);
            i2 -= 16;
            i += 16;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        license((C12365e) interfaceC0554e);
    }
}
