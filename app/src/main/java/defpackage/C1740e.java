package defpackage;

import android.R;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* renamed from: eُِؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1740e implements InterfaceC2227e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final byte[][] f4730e = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, Byte.MIN_VALUE, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, Byte.MAX_VALUE, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, 52, 110, 80, -34, 104, 101, -68, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, 16, 33, -16, -45, 93, 15, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, -68, -99, 109, -63, -79, 14, Byte.MIN_VALUE, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, 16, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, 61, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, Byte.MAX_VALUE, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f4731e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f4732e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f4733e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f4734e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f4735e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f4736e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f4737e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f4738e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f4739e;

    public C1740e() {
        this.f4737e = false;
        this.f4732e = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f4735e = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f4731e = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f4739e = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f4733e = 0;
        this.f4736e = null;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
        for (int i = 0; i < 256; i++) {
            byte[][] bArr = f4730e;
            byte b = bArr[0][i];
            int i2 = b & 255;
            int license = (license(i2) ^ i2) & 255;
            int i3 = 180;
            int license2 = (((((b & 1) != 0 ? 180 : 0) ^ (i2 >> 1)) ^ i2) ^ license(i2)) & 255;
            int i4 = bArr[1][i];
            int i5 = i4 & 255;
            int[] iArr = {i2, i5};
            int[] iArr2 = {license, (license(i5) ^ i5) & 255};
            int i6 = i5 >> 1;
            if ((i4 & 1) == 0) {
                i3 = 0;
            }
            int[] iArr3 = {license2, (((i6 ^ i3) ^ i5) ^ license(i5)) & 255};
            int[] iArr4 = (int[]) this.f4732e;
            int i7 = iArr[1] | (iArr2[1] << 8);
            int i8 = iArr3[1];
            iArr4[i] = i7 | (i8 << 16) | (i8 << 24);
            int[] iArr5 = (int[]) this.f4735e;
            int i9 = iArr3[0];
            iArr5[i] = i9 | (i9 << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            int[] iArr6 = (int[]) this.f4731e;
            int i10 = iArr2[1];
            int i11 = iArr3[1];
            iArr6[i] = i10 | (i11 << 8) | (iArr[1] << 16) | (i11 << 24);
            int[] iArr7 = (int[]) this.f4739e;
            int i12 = iArr2[0];
            iArr7[i] = (iArr3[0] << 16) | (iArr[0] << 8) | i12 | (i12 << 24);
        }
    }

    public C1740e(C7000e c7000e, InterfaceC8376e interfaceC8376e, ArrayList arrayList) {
        this.f4732e = c7000e;
        this.f4735e = interfaceC8376e;
        this.f4731e = arrayList;
        this.f4737e = AbstractC5304e.premium(AbstractC7535e.admob(interfaceC8376e.license()), '/');
        this.f4734e = new ArrayList(16);
        this.f4736e = AbstractC9510e.ad;
        try {
            List adcel = adcel(AbstractC7535e.admob(interfaceC8376e.license()));
            this.f4739e = adcel;
            this.f4738e = arrayList.isEmpty() ? null : new C3083e(adcel);
        } catch (C4849e e) {
            throw new Exception("Url decode failed for " + AbstractC7535e.loadAd(((InterfaceC8376e) this.f4735e).license()), e);
        }
    }

    public static int appmetrica(int i) {
        int i2 = i >>> 24;
        int i3 = i2 & 255;
        int i4 = ((i3 << 1) ^ ((i2 & 128) != 0 ? 333 : 0)) & 255;
        int i5 = ((i3 >>> 1) ^ ((i2 & 1) != 0 ? 166 : 0)) ^ i4;
        return ((((i << 8) ^ (i5 << 24)) ^ (i4 << 16)) ^ (i5 << 8)) ^ i3;
    }

    public static int billing(int i) {
        return (i >>> 16) & 255;
    }

    public static int license(int i) {
        return ((i >> 2) ^ ((i & 2) != 0 ? 180 : 0)) ^ ((i & 1) != 0 ? 90 : 0);
    }

    public static int purchase(int i) {
        return (i >>> 8) & 255;
    }

    public static int yandex(int i) {
        return (i >>> 24) & 255;
    }

    public int ad(int[] iArr, int i) {
        int i2;
        int i3;
        int[] iArr2 = (int[]) this.f4739e;
        int[] iArr3 = (int[]) this.f4731e;
        int[] iArr4 = (int[]) this.f4735e;
        int[] iArr5 = (int[]) this.f4732e;
        int i4 = i & 255;
        int purchase = purchase(i);
        int billing = billing(i);
        int yandex = yandex(i);
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = this.f4733e & 3;
        byte[][] bArr = f4730e;
        if (i9 != 0) {
            if (i9 == 1) {
                byte[] bArr2 = bArr[0];
                i2 = iArr3[(bArr[1][billing] & 255) ^ billing(i5)] ^ (iArr4[(bArr2[purchase] & 255) ^ purchase(i5)] ^ iArr5[(bArr2[i4] & 255) ^ (i5 & 255)]);
                i3 = iArr2[(bArr[1][yandex] & 255) ^ yandex(i5)];
                return i3 ^ i2;
            }
            if (i9 != 2) {
                if (i9 != 3) {
                    return 0;
                }
            }
            byte[] bArr3 = bArr[0];
            i2 = iArr3[(bArr[1][(bArr[0][billing] & 255) ^ billing(i6)] & 255) ^ billing(i5)] ^ (iArr4[(bArr3[(bArr[1][purchase] & 255) ^ purchase(i6)] & 255) ^ purchase(i5)] ^ iArr5[(bArr3[(bArr3[i4] & 255) ^ (i6 & 255)] & 255) ^ (i5 & 255)]);
            byte[] bArr4 = bArr[1];
            i3 = iArr2[(bArr4[(bArr4[yandex] & 255) ^ yandex(i6)] & 255) ^ yandex(i5)];
            return i3 ^ i2;
        }
        i4 = (bArr[1][i4] & 255) ^ (i8 & 255);
        purchase = (bArr[0][purchase] & 255) ^ purchase(i8);
        billing = (bArr[0][billing] & 255) ^ billing(i8);
        yandex = (bArr[1][yandex] & 255) ^ yandex(i8);
        byte[] bArr5 = bArr[1];
        i4 = (bArr5[i4] & 255) ^ (i7 & 255);
        purchase = (bArr5[purchase] & 255) ^ purchase(i7);
        billing = (bArr[0][billing] & 255) ^ billing(i7);
        yandex = (bArr[0][yandex] & 255) ^ yandex(i7);
        byte[] bArr32 = bArr[0];
        i2 = iArr3[(bArr[1][(bArr[0][billing] & 255) ^ billing(i6)] & 255) ^ billing(i5)] ^ (iArr4[(bArr32[(bArr[1][purchase] & 255) ^ purchase(i6)] & 255) ^ purchase(i5)] ^ iArr5[(bArr32[(bArr32[i4] & 255) ^ (i6 & 255)] & 255) ^ (i5 & 255)]);
        byte[] bArr42 = bArr[1];
        i3 = iArr2[(bArr42[(bArr42[yandex] & 255) ^ yandex(i6)] & 255) ^ yandex(i5)];
        return i3 ^ i2;
    }

    public List adcel(String str) {
        if (str.length() == 0 || str.equals("/")) {
            return C13664e.f27089e;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '/') {
                i++;
            }
        }
        ArrayList arrayList = new ArrayList(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int m1865interface = AbstractC5304e.m1865interface(str, '/', i4, 4);
            if (m1865interface == -1) {
                m1865interface = length;
            }
            if (m1865interface != i4) {
                arrayList.add(AbstractC6528e.metrica(i4, m1865interface, 4, str));
            }
            i4 = m1865interface + 1;
            i3 = m1865interface;
        }
        InterfaceC8376e interfaceC8376e = (InterfaceC8376e) this.f4735e;
        C8208e c8208e = AbstractC7925e.ad;
        if (!interfaceC8376e.getAttributes().vip(AbstractC7925e.ad) && AbstractC6507e.amazon(str, "/", false)) {
            arrayList.add(BuildConfig.FLAVOR);
        }
        return arrayList;
    }

    public void advert(byte[] bArr) {
        int i;
        char c;
        int i2;
        int purchase;
        int billing;
        int yandex;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = (int[]) this.f4739e;
        int[] iArr4 = (int[]) this.f4731e;
        int[] iArr5 = (int[]) this.f4735e;
        int[] iArr6 = (int[]) this.f4732e;
        int[] iArr7 = new int[4];
        int[] iArr8 = new int[4];
        int[] iArr9 = new int[4];
        this.f4738e = new int[40];
        char c2 = 0;
        int i8 = 0;
        while (true) {
            i = 1;
            if (i8 >= this.f4733e) {
                break;
            }
            int i9 = i8 * 8;
            iArr7[i8] = AbstractC3628e.advert(i9, bArr);
            int advert = AbstractC3628e.advert(i9 + 4, bArr);
            iArr8[i8] = advert;
            int i10 = (this.f4733e - 1) - i8;
            int i11 = iArr7[i8];
            for (int i12 = 0; i12 < 4; i12++) {
                advert = appmetrica(advert);
            }
            int i13 = advert ^ i11;
            for (int i14 = 0; i14 < 4; i14++) {
                i13 = appmetrica(i13);
            }
            iArr9[i10] = i13;
            i8++;
        }
        for (int i15 = 0; i15 < 20; i15++) {
            int i16 = 33686018 * i15;
            int ad = ad(iArr7, i16);
            int rotateLeft = Integer.rotateLeft(ad(iArr8, i16 + R.attr.cacheColorHint), 8);
            int i17 = ad + rotateLeft;
            int[] iArr10 = (int[]) this.f4738e;
            int i18 = i15 * 2;
            iArr10[i18] = i17;
            int i19 = i17 + rotateLeft;
            iArr10[i18 + 1] = (i19 << 9) | (i19 >>> 23);
        }
        int i20 = iArr9[0];
        int i21 = iArr9[1];
        int i22 = 2;
        int i23 = iArr9[2];
        int i24 = 3;
        int i25 = iArr9[3];
        this.f4734e = new int[1024];
        int i26 = 0;
        while (i26 < 256) {
            int i27 = this.f4733e & i24;
            byte[][] bArr2 = f4730e;
            if (i27 != 0) {
                if (i27 == i) {
                    int[] iArr11 = (int[]) this.f4734e;
                    int i28 = i26 * 2;
                    c = c2;
                    int i29 = bArr2[c2][i26] & 255;
                    iArr11[i28] = iArr6[(i20 & 255) ^ i29];
                    iArr11[i28 + 1] = iArr5[i29 ^ purchase(i20)];
                    ((int[]) this.f4734e)[i28 + AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE] = iArr4[(bArr2[i][i26] & 255) ^ billing(i20)];
                    ((int[]) this.f4734e)[i28 + 513] = iArr3[(bArr2[i][i26] & 255) ^ yandex(i20)];
                    iArr = iArr3;
                    iArr2 = iArr4;
                } else if (i27 == i22) {
                    c = c2;
                    i7 = i26;
                    i6 = i7;
                    i5 = i6;
                    i3 = i;
                    i4 = i5;
                    int[] iArr12 = (int[]) this.f4734e;
                    iArr = iArr3;
                    int i30 = i26 * 2;
                    byte[] bArr3 = bArr2[c];
                    iArr2 = iArr4;
                    iArr12[i30] = iArr6[(bArr3[(i21 & 255) ^ (bArr3[i7] & 255)] & 255) ^ (i20 & 255)];
                    iArr12[i30 + 1] = iArr5[(bArr3[(bArr2[i3][i6] & 255) ^ purchase(i21)] & 255) ^ purchase(i20)];
                    ((int[]) this.f4734e)[i30 + AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE] = iArr2[(bArr2[i3][(bArr2[c][i5] & 255) ^ billing(i21)] & 255) ^ billing(i20)];
                    byte[] bArr4 = bArr2[i3];
                    ((int[]) this.f4734e)[i30 + 513] = iArr[(bArr4[(bArr4[i4] & 255) ^ yandex(i21)] & 255) ^ yandex(i20)];
                    i26++;
                    c2 = c;
                    iArr3 = iArr;
                    i = i3;
                    iArr4 = iArr2;
                    i22 = 2;
                    i24 = 3;
                } else if (i27 != i24) {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c = c2;
                } else {
                    c = c2;
                    i2 = i26;
                    purchase = i2;
                    billing = purchase;
                    yandex = billing;
                }
                i3 = i;
                i26++;
                c2 = c;
                iArr3 = iArr;
                i = i3;
                iArr4 = iArr2;
                i22 = 2;
                i24 = 3;
            } else {
                c = c2;
                i2 = (bArr2[i][i26] & 255) ^ (i25 & 255);
                purchase = (bArr2[c][i26] & 255) ^ purchase(i25);
                billing = (bArr2[c][i26] & 255) ^ billing(i25);
                yandex = (bArr2[i][i26] & 255) ^ yandex(i25);
            }
            byte[] bArr5 = bArr2[i];
            i3 = i;
            i7 = (bArr5[i2] & 255) ^ (i23 & 255);
            i6 = (bArr5[purchase] & 255) ^ purchase(i23);
            i5 = (bArr2[c][billing] & 255) ^ billing(i23);
            i4 = (bArr2[c][yandex] & 255) ^ yandex(i23);
            int[] iArr122 = (int[]) this.f4734e;
            iArr = iArr3;
            int i302 = i26 * 2;
            byte[] bArr32 = bArr2[c];
            iArr2 = iArr4;
            iArr122[i302] = iArr6[(bArr32[(i21 & 255) ^ (bArr32[i7] & 255)] & 255) ^ (i20 & 255)];
            iArr122[i302 + 1] = iArr5[(bArr32[(bArr2[i3][i6] & 255) ^ purchase(i21)] & 255) ^ purchase(i20)];
            ((int[]) this.f4734e)[i302 + AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE] = iArr2[(bArr2[i3][(bArr2[c][i5] & 255) ^ billing(i21)] & 255) ^ billing(i20)];
            byte[] bArr42 = bArr2[i3];
            ((int[]) this.f4734e)[i302 + 513] = iArr[(bArr42[(bArr42[i4] & 255) ^ yandex(i21)] & 255) ^ yandex(i20)];
            i26++;
            c2 = c;
            iArr3 = iArr;
            i = i3;
            iArr4 = iArr2;
            i22 = 2;
            i24 = 3;
        }
    }

    @Override // defpackage.InterfaceC2227e
    public String getAlgorithmName() {
        return "Twofish";
    }

    @Override // defpackage.InterfaceC2227e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        if (!(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to Twofish init - ", interfaceC3894e));
        }
        this.f4737e = z;
        byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
        this.f4736e = bArr;
        int length = bArr.length * 8;
        if (length != 128 && length != 192 && length != 256) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        if (interfaceC3894e instanceof EnumC0300e) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
        byte[] bArr2 = (byte[]) this.f4736e;
        this.f4733e = bArr2.length / 8;
        advert(bArr2);
    }

    @Override // defpackage.InterfaceC2227e
    public int isPro() {
        return 16;
    }

    public int metrica(int i) {
        int[] iArr = (int[]) this.f4734e;
        return iArr[(((i >>> 16) & 255) * 2) + 513] ^ ((iArr[((i >>> 24) & 255) * 2] ^ iArr[((i & 255) * 2) + 1]) ^ iArr[(((i >>> 8) & 255) * 2) + AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE]);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mopub(defpackage.AbstractC10731e r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.C10944e
            if (r0 == 0) goto L14
            r0 = r11
            eُِؗ r0 = (defpackage.C10944e) r0
            int r1 = r0.f21674e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f21674e = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            eُِؗ r0 = new eُِؗ
            r0.<init>(r10, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.f21673e
            int r0 = r7.f21674e
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            defpackage.AbstractC2003e.purchase(r11)
            r1 = r10
            goto L4f
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L30:
            defpackage.AbstractC2003e.purchase(r11)
            java.lang.Object r11 = r10.f4732e
            r2 = r11
            eِۜؑ r2 = (defpackage.C11997e) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.f21674e = r1
            r3 = 0
            r5 = -4503599627370497(0xffefffffffffffff, double:-1.7976931348623157E308)
            r1 = r10
            java.lang.Object r11 = r1.startapp(r2, r3, r4, r5, r7)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r11 != r0) goto L4f
            return r0
        L4f:
            java.lang.Object r11 = r1.f4734e
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L70
            eؚْ٘ r11 = new eؚْ٘
            java.lang.Object r0 = r1.f4732e
            eِۜؑ r0 = (defpackage.C11997e) r0
            java.lang.Object r2 = r1.f4736e
            eُ٘ٚ r2 = (defpackage.C17843e) r2
            if (r2 == 0) goto L68
            eۣؔؗ r2 = r2.startapp
            goto L6a
        L68:
            eۣؔؗ r2 = defpackage.C2394e.f6123e
        L6a:
            java.lang.String r3 = "No matched subtrees found"
            r11.<init>(r0, r3, r2)
            goto Lb2
        L70:
            eَؘۘ r0 = new eَؘۘ
            r2 = 1
            r0.<init>(r2)
            int r2 = defpackage.AbstractC6874e.billing(r11)
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            if (r2 < 0) goto La0
            r5 = 0
        L82:
            java.lang.Object r6 = r11.get(r5)
            eؗۛٚ r6 = (defpackage.C5158e) r6
            eُٝؓ r7 = r6.vip
            r0.m4618e(r7)
            double r6 = r6.metrica
            r8 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L97
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L97:
            double r3 = java.lang.Math.min(r3, r6)
            if (r5 == r2) goto La0
            int r5 = r5 + 1
            goto L82
        La0:
            eؗۛٚ r2 = new eؗۛٚ
            java.lang.Object r11 = defpackage.AbstractC13480e.m3570break(r11)
            eؗۛٚ r11 = (defpackage.C5158e) r11
            eِۜؑ r11 = r11.ad
            eُٝؓ r0 = r0.build()
            r2.<init>(r11, r0, r3)
            r11 = r2
        Lb2:
            java.lang.Object r0 = r1.f4738e
            eؕؒٝ r0 = (defpackage.C3083e) r0
            if (r0 == 0) goto Lba
            r0.license = r11
        Lba:
            if (r0 == 0) goto Ld4
            java.lang.Object r2 = r1.f4731e
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        Lc4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ld4
            java.lang.Object r3 = r2.next()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r3.invoke(r0)
            goto Lc4
        Ld4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1740e.mopub(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC2227e
    public void reset() {
        byte[] bArr = (byte[]) this.f4736e;
        if (bArr != null) {
            advert(bArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x020b, code lost:
    
        if (r1 > r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0279, code lost:
    
        r2 = -1.7976931348623157E308d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0276, code lost:
    
        if (r3 > r2) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Type inference failed for: r30v0, types: [eُِؓ] */
    /* JADX WARN: Type inference failed for: r4v21, types: [int] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x02fd -> B:11:0x0312). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startapp(defpackage.C11997e r31, int r32, java.util.ArrayList r33, double r34, defpackage.AbstractC10731e r36) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1740e.startapp(eِۜؑ, int, java.util.ArrayList, double, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC2227e
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (((byte[]) this.f4736e) == null) {
            throw new IllegalStateException("Twofish not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        char c = 3;
        int i3 = 2;
        int i4 = 0;
        if (this.f4737e) {
            int advert = AbstractC3628e.advert(i, bArr) ^ ((int[]) this.f4738e)[0];
            int advert2 = ((int[]) this.f4738e)[1] ^ AbstractC3628e.advert(i + 4, bArr);
            int advert3 = ((int[]) this.f4738e)[2] ^ AbstractC3628e.advert(i + 8, bArr);
            int advert4 = AbstractC3628e.advert(i + 12, bArr) ^ ((int[]) this.f4738e)[3];
            int i5 = 8;
            while (i4 < 16) {
                int vip = vip(advert);
                int metrica = metrica(advert2);
                advert3 = Integer.rotateRight(advert3 ^ ((vip + metrica) + ((int[]) this.f4738e)[i5]), 1);
                advert4 = Integer.rotateLeft(advert4, 1) ^ (((metrica * i3) + vip) + ((int[]) this.f4738e)[i5 + 1]);
                int vip2 = vip(advert3);
                int metrica2 = metrica(advert4);
                int i6 = i5 + 3;
                advert = Integer.rotateRight(advert ^ ((vip2 + metrica2) + ((int[]) this.f4738e)[i5 + 2]), 1);
                i5 += 4;
                advert2 = Integer.rotateLeft(advert2, 1) ^ (((metrica2 * 2) + vip2) + ((int[]) this.f4738e)[i6]);
                i4 += 2;
                i3 = i3;
            }
            AbstractC3628e.yandex(((int[]) this.f4738e)[4] ^ advert3, i2, bArr2);
            AbstractC3628e.yandex(advert4 ^ ((int[]) this.f4738e)[5], i2 + 4, bArr2);
            AbstractC3628e.yandex(((int[]) this.f4738e)[6] ^ advert, i2 + 8, bArr2);
            AbstractC3628e.yandex(((int[]) this.f4738e)[7] ^ advert2, i2 + 12, bArr2);
        } else {
            int advert5 = AbstractC3628e.advert(i, bArr) ^ ((int[]) this.f4738e)[4];
            int advert6 = AbstractC3628e.advert(i + 4, bArr) ^ ((int[]) this.f4738e)[5];
            int advert7 = AbstractC3628e.advert(i + 8, bArr) ^ ((int[]) this.f4738e)[6];
            int advert8 = AbstractC3628e.advert(i + 12, bArr) ^ ((int[]) this.f4738e)[7];
            int i7 = 39;
            int i8 = 0;
            while (i8 < 16) {
                int vip3 = vip(advert5);
                int metrica3 = metrica(advert6);
                char c2 = c;
                int i9 = advert8 ^ (((metrica3 * 2) + vip3) + ((int[]) this.f4738e)[i7]);
                advert7 = Integer.rotateLeft(advert7, 1) ^ ((vip3 + metrica3) + ((int[]) this.f4738e)[i7 - 1]);
                advert8 = Integer.rotateRight(i9, 1);
                int vip4 = vip(advert7);
                int metrica4 = metrica(advert8);
                int i10 = i7 - 3;
                int i11 = advert6 ^ (((metrica4 * 2) + vip4) + ((int[]) this.f4738e)[i7 - 2]);
                i7 -= 4;
                advert5 = Integer.rotateLeft(advert5, 1) ^ ((vip4 + metrica4) + ((int[]) this.f4738e)[i10]);
                advert6 = Integer.rotateRight(i11, 1);
                i8 += 2;
                c = c2;
                i4 = i4;
            }
            AbstractC3628e.yandex(((int[]) this.f4738e)[i4] ^ advert7, i2, bArr2);
            AbstractC3628e.yandex(advert8 ^ ((int[]) this.f4738e)[1], i2 + 4, bArr2);
            AbstractC3628e.yandex(((int[]) this.f4738e)[2] ^ advert5, i2 + 8, bArr2);
            AbstractC3628e.yandex(((int[]) this.f4738e)[c] ^ advert6, i2 + 12, bArr2);
        }
        return 16;
    }

    public int vip(int i) {
        int[] iArr = (int[]) this.f4734e;
        return iArr[(((i >>> 24) & 255) * 2) + 513] ^ ((iArr[(i & 255) * 2] ^ iArr[(((i >>> 8) & 255) * 2) + 1]) ^ iArr[(((i >>> 16) & 255) * 2) + AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE]);
    }
}
