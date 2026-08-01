package defpackage;

import org.conscrypt.PSKKeyManager;

/* renamed from: eٌٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8481e implements InterfaceC14556e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int[] f17261e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f17262e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public byte[] f17263e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f17264e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public byte[] f17265e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f17266e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17267e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f17268e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int[] f17269e;

    public static int ad(int i, int i2) {
        return (i - i2) & 511;
    }

    public static int adcel(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    public static void advert(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i;
    }

    public static int mopub(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    public static void smaato(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i;
    }

    public int amazon() {
        int i;
        int i2;
        int[] iArr = this.f17269e;
        int[] iArr2 = this.f17261e;
        int i3 = this.f17268e;
        int i4 = i3 & 511;
        if (i3 < 512) {
            int i5 = iArr2[i4];
            int i6 = iArr2[ad(i4, 3)];
            int i7 = iArr2[ad(i4, 10)];
            iArr2[i4] = adcel(i7, 8) + (adcel(i6, 10) ^ adcel(iArr2[ad(i4, 511)], 23)) + i5;
            int i8 = iArr2[ad(i4, 12)];
            i = iArr[i8 & 255] + iArr[((i8 >> 16) & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            i2 = iArr2[i4];
        } else {
            int i9 = iArr[i4];
            int i10 = iArr[ad(i4, 3)];
            int i11 = iArr[ad(i4, 10)];
            int i12 = iArr[ad(i4, 511)];
            iArr[i4] = ((i11 >>> (-8)) | (i11 << 8)) + (((i10 >>> (-10)) | (i10 << 10)) ^ ((i12 >>> (-23)) | (i12 << 23))) + i9;
            int i13 = iArr[ad(i4, 12)];
            i = iArr2[i13 & 255] + iArr2[((i13 >> 16) & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            i2 = iArr[i4];
        }
        int i14 = i2 ^ i;
        this.f17268e = (this.f17268e + 1) & 1023;
        return i14;
    }

    public int appmetrica() {
        int[] iArr = this.f17261e;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 13) | (i2 << 3);
        int i4 = iArr[2];
        int i5 = (i2 >>> 7) | (i4 << 9);
        int i6 = iArr[3];
        int i7 = (i4 >>> 6) | (i6 << 10);
        int i8 = iArr[4];
        int i9 = (i6 >>> 3) | (i8 << 13);
        return (((i8 << 2) | (i6 >>> 14)) ^ ((((i ^ i3) ^ i5) ^ i7) ^ i9)) & 65535;
    }

    public int billing() {
        int[] iArr = this.f17269e;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 9) | (i2 << 7);
        int i4 = (i >>> 14) | (i2 << 2);
        int i5 = (i >>> 15) | (i2 << 1);
        int i6 = iArr[2];
        int i7 = (i2 >>> 5) | (i6 << 11);
        int i8 = (i2 >>> 12) | (i6 << 4);
        int i9 = iArr[3];
        int i10 = (i6 >>> 1) | (i9 << 15);
        int i11 = (i6 >>> 5) | (i9 << 11);
        int i12 = (i6 >>> 13) | (i9 << 3);
        int i13 = iArr[4];
        int i14 = (i9 >>> 4) | (i13 << 12);
        int i15 = (i9 >>> 12) | (i13 << 4);
        int i16 = (i9 >>> 14) | (i13 << 2);
        int i17 = (i13 << 1) | (i9 >>> 15);
        int i18 = i17 & i15;
        int i19 = (((i ^ (((((((((i16 ^ i15) ^ i14) ^ i12) ^ i11) ^ i10) ^ i8) ^ i7) ^ i4) ^ i3)) ^ i18) ^ (i11 & i10)) ^ (i5 & i3);
        int i20 = i15 & i14;
        int i21 = i10 & i8 & i7;
        return (((((((((i17 & i12) & i8) & i3) ^ ((i19 ^ (i20 & i12)) ^ i21)) ^ ((i20 & i11) & i10)) ^ ((i18 & i7) & i5)) ^ (((i18 & i14) & i12) & i11)) ^ ((i21 & i5) & i3)) ^ (((((i14 & i12) & i11) & i10) & i8) & i7)) & 65535;
    }

    @Override // defpackage.InterfaceC14556e
    public final String getAlgorithmName() {
        switch (this.f17267e) {
            case 0:
                return "Grain-128";
            case 1:
                return "Grain v1";
            case 2:
                return "HC-128";
            default:
                return "HC-256";
        }
    }

    @Override // defpackage.InterfaceC14556e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        InterfaceC3894e interfaceC3894e2;
        switch (this.f17267e) {
            case 0:
                if (!(interfaceC3894e instanceof C11494e)) {
                    throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
                }
                C11494e c11494e = (C11494e) interfaceC3894e;
                byte[] bArr = c11494e.f23095e;
                if (bArr == null || bArr.length != 12) {
                    throw new IllegalArgumentException("Grain-128 requires exactly 12 bytes of IV");
                }
                InterfaceC3894e interfaceC3894e3 = c11494e.f23094e;
                if (!(interfaceC3894e3 instanceof C14915e)) {
                    throw new IllegalArgumentException("Grain-128 init parameters must include a key");
                }
                byte[] bArr2 = ((C14915e) interfaceC3894e3).f29591e;
                if (bArr2.length != 16) {
                    throw new IllegalArgumentException("Grain-128 key must be 128 bits long");
                }
                if (interfaceC3894e instanceof EnumC0300e) {
                    throw new IllegalArgumentException("params should not be CryptoServicePurpose");
                }
                ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                byte[] bArr3 = new byte[bArr2.length];
                this.f17262e = bArr3;
                this.f17263e = new byte[bArr2.length];
                this.f17261e = new int[4];
                this.f17269e = new int[4];
                this.f17265e = new byte[4];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                System.arraycopy(bArr2, 0, this.f17263e, 0, bArr2.length);
                reset();
                return;
            case 1:
                if (!(interfaceC3894e instanceof C11494e)) {
                    throw new IllegalArgumentException("Grain v1 init parameters must include an IV");
                }
                C11494e c11494e2 = (C11494e) interfaceC3894e;
                byte[] bArr4 = c11494e2.f23095e;
                if (bArr4 == null || bArr4.length != 8) {
                    throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
                }
                InterfaceC3894e interfaceC3894e4 = c11494e2.f23094e;
                if (!(interfaceC3894e4 instanceof C14915e)) {
                    throw new IllegalArgumentException("Grain v1 init parameters must include a key");
                }
                byte[] bArr5 = ((C14915e) interfaceC3894e4).f29591e;
                if (bArr5.length != 10) {
                    throw new IllegalArgumentException("Grain v1 key must be 80 bits long");
                }
                byte[] bArr6 = new byte[bArr5.length];
                this.f17262e = bArr6;
                this.f17263e = new byte[bArr5.length];
                this.f17261e = new int[5];
                this.f17269e = new int[5];
                this.f17265e = new byte[2];
                System.arraycopy(bArr4, 0, bArr6, 0, bArr4.length);
                System.arraycopy(bArr5, 0, this.f17263e, 0, bArr5.length);
                if (interfaceC3894e instanceof EnumC0300e) {
                    throw new IllegalArgumentException("params should not be CryptoServicePurpose");
                }
                ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                reset();
                return;
            case 2:
                if (!(interfaceC3894e instanceof C11494e)) {
                    throw new IllegalArgumentException("no IV passed");
                }
                C11494e c11494e3 = (C11494e) interfaceC3894e;
                this.f17262e = c11494e3.f23095e;
                InterfaceC3894e interfaceC3894e5 = c11494e3.f23094e;
                if (!(interfaceC3894e5 instanceof C14915e)) {
                    throw new IllegalArgumentException(AbstractC8703e.remoteconfig("Invalid parameter passed to HC128 init - ", interfaceC3894e));
                }
                this.f17263e = ((C14915e) interfaceC3894e5).f29591e;
                yandex();
                if (interfaceC3894e instanceof EnumC0300e) {
                    throw new IllegalArgumentException("params should not be CryptoServicePurpose");
                }
                ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                this.f17266e = true;
                return;
            default:
                if (interfaceC3894e instanceof C11494e) {
                    C11494e c11494e4 = (C11494e) interfaceC3894e;
                    this.f17262e = c11494e4.f23095e;
                    interfaceC3894e2 = c11494e4.f23094e;
                } else {
                    this.f17262e = new byte[0];
                    interfaceC3894e2 = interfaceC3894e;
                }
                if (!(interfaceC3894e2 instanceof C14915e)) {
                    throw new IllegalArgumentException(AbstractC8703e.remoteconfig("Invalid parameter passed to HC256 init - ", interfaceC3894e));
                }
                this.f17263e = ((C14915e) interfaceC3894e2).f29591e;
                startapp();
                int length = this.f17263e.length;
                if (interfaceC3894e instanceof EnumC0300e) {
                    throw new IllegalArgumentException("params should not be CryptoServicePurpose");
                }
                ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                this.f17266e = true;
                return;
        }
    }

    public int license() {
        int[] iArr = this.f17261e;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 7) | (i2 << 25);
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = (i4 >>> 6) | (i5 << 26);
        return i5 ^ ((((i ^ i3) ^ ((i2 >>> 6) | (i4 << 26))) ^ i6) ^ ((i4 >>> 17) | (i5 << 15)));
    }

    public int loadAd() {
        int i;
        int i2;
        int[] iArr = this.f17269e;
        int[] iArr2 = this.f17261e;
        int i3 = this.f17268e;
        int i4 = i3 & 1023;
        if (i3 < 1024) {
            int i5 = iArr2[(i4 - 3) & 1023];
            int i6 = iArr2[(i4 - 1023) & 1023];
            iArr2[i4] = iArr2[(i4 - 10) & 1023] + (mopub(i6, 23) ^ mopub(i5, 10)) + iArr[(i5 ^ i6) & 1023] + iArr2[i4];
            int i7 = iArr2[(i4 - 12) & 1023];
            i = iArr[i7 & 255] + iArr[((i7 >> 8) & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES] + iArr[((i7 >> 16) & 255) + AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE] + iArr[((i7 >> 24) & 255) + 768];
            i2 = iArr2[i4];
        } else {
            int i8 = iArr[(i4 - 3) & 1023];
            int i9 = iArr[(i4 - 1023) & 1023];
            iArr[i4] = iArr[(i4 - 10) & 1023] + (mopub(i9, 23) ^ mopub(i8, 10)) + iArr2[(i8 ^ i9) & 1023] + iArr[i4];
            int i10 = iArr[(i4 - 12) & 1023];
            i = iArr2[i10 & 255] + iArr2[((i10 >> 8) & 255) + PSKKeyManager.MAX_KEY_LENGTH_BYTES] + iArr2[((i10 >> 16) & 255) + AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE] + iArr2[((i10 >> 24) & 255) + 768];
            i2 = iArr[i4];
        }
        int i11 = i2 ^ i;
        this.f17268e = (this.f17268e + 1) & 2047;
        return i11;
    }

    public int metrica() {
        int[] iArr = this.f17269e;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 1) | (i2 << 15);
        int i4 = (i >>> 2) | (i2 << 14);
        int i5 = (i >>> 4) | (i2 << 12);
        int i6 = (i >>> 10) | (i2 << 6);
        int i7 = iArr[2];
        int i8 = (i2 >>> 15) | (i7 << 1);
        int i9 = iArr[3];
        int i10 = (i7 >>> 11) | (i9 << 5);
        int i11 = iArr[4];
        int i12 = (i9 >>> 8) | (i11 << 8);
        int i13 = (i11 << 1) | (i9 >>> 15);
        int[] iArr2 = this.f17261e;
        int i14 = iArr2[0] >>> 3;
        int i15 = iArr2[1];
        int i16 = i14 | (i15 << 13);
        int i17 = iArr2[2];
        int i18 = (i15 >>> 9) | (i17 << 7);
        int i19 = (iArr2[3] << 2) | (i17 >>> 14);
        int i20 = iArr2[4];
        int i21 = i19 & i20;
        int i22 = ((((i18 ^ i13) ^ (i16 & i20)) ^ i21) ^ (i20 & i13)) ^ ((i16 & i18) & i19);
        int i23 = i16 & i19;
        return (((((((((i13 & i21) ^ (((i23 & i13) ^ ((i20 & i23) ^ i22)) ^ ((i18 & i19) & i13))) ^ i3) ^ i4) ^ i5) ^ i6) ^ i8) ^ i10) ^ i12) & 65535;
    }

    @Override // defpackage.InterfaceC14556e
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        switch (this.f17267e) {
            case 0:
                if (!this.f17266e) {
                    throw new IllegalStateException("Grain-128 not initialised");
                }
                if (i + i2 > bArr.length) {
                    throw new RuntimeException("input buffer too short");
                }
                if (i3 + i2 > bArr2.length) {
                    throw new RuntimeException("output buffer too short");
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = i3 + i4;
                    byte b = bArr[i + i4];
                    if (this.f17264e > 3) {
                        int vip = vip();
                        this.f17268e = vip;
                        byte[] bArr3 = this.f17265e;
                        bArr3[0] = (byte) vip;
                        bArr3[1] = (byte) (vip >> 8);
                        bArr3[2] = (byte) (vip >> 16);
                        bArr3[3] = (byte) (vip >> 24);
                        int[] iArr = this.f17269e;
                        advert(iArr, purchase() ^ this.f17261e[0]);
                        this.f17269e = iArr;
                        int[] iArr2 = this.f17261e;
                        advert(iArr2, license());
                        this.f17261e = iArr2;
                        this.f17264e = 0;
                    }
                    byte[] bArr4 = this.f17265e;
                    int i6 = this.f17264e;
                    this.f17264e = i6 + 1;
                    bArr2[i5] = (byte) (b ^ bArr4[i6]);
                }
                return i2;
            case 1:
                if (!this.f17266e) {
                    throw new IllegalStateException("Grain v1 not initialised");
                }
                if (i + i2 > bArr.length) {
                    throw new RuntimeException("input buffer too short");
                }
                if (i3 + i2 > bArr2.length) {
                    throw new RuntimeException("output buffer too short");
                }
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = i3 + i7;
                    byte b2 = bArr[i + i7];
                    if (this.f17264e > 1) {
                        int metrica = metrica();
                        this.f17268e = metrica;
                        byte[] bArr5 = this.f17265e;
                        bArr5[0] = (byte) metrica;
                        bArr5[1] = (byte) (metrica >> 8);
                        int[] iArr3 = this.f17269e;
                        smaato(iArr3, billing() ^ this.f17261e[0]);
                        this.f17269e = iArr3;
                        int[] iArr4 = this.f17261e;
                        smaato(iArr4, appmetrica());
                        this.f17261e = iArr4;
                        this.f17264e = 0;
                    }
                    byte[] bArr6 = this.f17265e;
                    int i9 = this.f17264e;
                    this.f17264e = i9 + 1;
                    bArr2[i8] = (byte) (b2 ^ bArr6[i9]);
                }
                return i2;
            case 2:
                if (!this.f17266e) {
                    throw new IllegalStateException("HC-128 not initialised");
                }
                if (i + i2 > bArr.length) {
                    throw new RuntimeException("input buffer too short");
                }
                if (i3 + i2 > bArr2.length) {
                    throw new RuntimeException("output buffer too short");
                }
                for (int i10 = 0; i10 < i2; i10++) {
                    int i11 = i3 + i10;
                    byte b3 = bArr[i + i10];
                    byte[] bArr7 = this.f17265e;
                    if (this.f17264e == 0) {
                        int amazon = amazon();
                        bArr7[0] = (byte) (amazon & 255);
                        bArr7[1] = (byte) ((amazon >> 8) & 255);
                        bArr7[2] = (byte) ((amazon >> 16) & 255);
                        bArr7[3] = (byte) ((amazon >> 24) & 255);
                    }
                    int i12 = this.f17264e;
                    byte b4 = bArr7[i12];
                    this.f17264e = (i12 + 1) & 3;
                    bArr2[i11] = (byte) (b3 ^ b4);
                }
                return i2;
            default:
                if (!this.f17266e) {
                    throw new IllegalStateException("HC-256 not initialised");
                }
                if (i + i2 > bArr.length) {
                    throw new RuntimeException("input buffer too short");
                }
                if (i3 + i2 > bArr2.length) {
                    throw new RuntimeException("output buffer too short");
                }
                for (int i13 = 0; i13 < i2; i13++) {
                    int i14 = i3 + i13;
                    byte b5 = bArr[i + i13];
                    byte[] bArr8 = this.f17265e;
                    if (this.f17264e == 0) {
                        int loadAd = loadAd();
                        bArr8[0] = (byte) (loadAd & 255);
                        bArr8[1] = (byte) ((loadAd >> 8) & 255);
                        bArr8[2] = (byte) ((loadAd >> 16) & 255);
                        bArr8[3] = (byte) ((loadAd >> 24) & 255);
                    }
                    int i15 = this.f17264e;
                    byte b6 = bArr8[i15];
                    this.f17264e = (i15 + 1) & 3;
                    bArr2[i14] = (byte) (b5 ^ b6);
                }
                return i2;
        }
    }

    public int purchase() {
        int[] iArr = this.f17269e;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 3) | (i2 << 29);
        int i4 = (i >>> 11) | (i2 << 21);
        int i5 = (i >>> 13) | (i2 << 19);
        int i6 = (i >>> 17) | (i2 << 15);
        int i7 = (i >>> 18) | (i2 << 14);
        int i8 = (i >>> 26) | (i2 << 6);
        int i9 = (i >>> 27) | (i2 << 5);
        int i10 = iArr[2];
        int i11 = (i2 >>> 8) | (i10 << 24);
        int i12 = (i2 >>> 16) | (i10 << 16);
        int i13 = (i2 >>> 24) | (i10 << 8);
        int i14 = (i2 >>> 27) | (i10 << 5);
        int i15 = (i2 >>> 29) | (i10 << 3);
        int i16 = iArr[3];
        return (((((((i16 ^ (((i ^ i8) ^ i13) ^ ((i10 >>> 27) | (i16 << 5)))) ^ (i3 & ((i10 >>> 3) | (i16 << 29)))) ^ (i4 & i5)) ^ (i6 & i7)) ^ (i9 & i14)) ^ (i11 & i12)) ^ (i15 & ((i10 >>> 1) | (i16 << 31)))) ^ (((i10 >>> 4) | (i16 << 28)) & ((i10 >>> 20) | (i16 << 12)));
    }

    @Override // defpackage.InterfaceC14556e
    public final void reset() {
        switch (this.f17267e) {
            case 0:
                this.f17264e = 4;
                byte[] bArr = this.f17263e;
                byte[] bArr2 = this.f17262e;
                bArr2[12] = -1;
                bArr2[13] = -1;
                bArr2[14] = -1;
                bArr2[15] = -1;
                this.f17263e = bArr;
                this.f17262e = bArr2;
                int i = 0;
                int i2 = 0;
                while (true) {
                    int[] iArr = this.f17269e;
                    if (i >= iArr.length) {
                        for (int i3 = 0; i3 < 8; i3++) {
                            this.f17268e = vip();
                            int[] iArr2 = this.f17269e;
                            advert(iArr2, (purchase() ^ this.f17261e[0]) ^ this.f17268e);
                            this.f17269e = iArr2;
                            int[] iArr3 = this.f17261e;
                            advert(iArr3, license() ^ this.f17268e);
                            this.f17261e = iArr3;
                        }
                        this.f17266e = true;
                        return;
                    }
                    byte[] bArr3 = this.f17263e;
                    int i4 = i2 + 3;
                    int i5 = i2 + 2;
                    int i6 = i2 + 1;
                    iArr[i] = (bArr3[i2] & 255) | (bArr3[i4] << 24) | ((bArr3[i5] << 16) & 16711680) | ((bArr3[i6] << 8) & 65280);
                    int[] iArr4 = this.f17261e;
                    byte[] bArr4 = this.f17262e;
                    iArr4[i] = (bArr4[i2] & 255) | ((bArr4[i6] << 8) & 65280) | (bArr4[i4] << 24) | ((bArr4[i5] << 16) & 16711680);
                    i2 += 4;
                    i++;
                }
            case 1:
                this.f17264e = 2;
                byte[] bArr5 = this.f17263e;
                byte[] bArr6 = this.f17262e;
                bArr6[8] = -1;
                bArr6[9] = -1;
                this.f17263e = bArr5;
                this.f17262e = bArr6;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f17269e;
                    if (i7 >= iArr5.length) {
                        for (int i9 = 0; i9 < 10; i9++) {
                            this.f17268e = metrica();
                            int[] iArr6 = this.f17269e;
                            smaato(iArr6, (billing() ^ this.f17261e[0]) ^ this.f17268e);
                            this.f17269e = iArr6;
                            int[] iArr7 = this.f17261e;
                            smaato(iArr7, appmetrica() ^ this.f17268e);
                            this.f17261e = iArr7;
                        }
                        this.f17266e = true;
                        return;
                    }
                    byte[] bArr7 = this.f17263e;
                    int i10 = i8 + 1;
                    iArr5[i7] = ((bArr7[i8] & 255) | (bArr7[i10] << 8)) & 65535;
                    int[] iArr8 = this.f17261e;
                    byte[] bArr8 = this.f17262e;
                    iArr8[i7] = ((bArr8[i8] & 255) | (bArr8[i10] << 8)) & 65535;
                    i8 += 2;
                    i7++;
                }
            case 2:
                yandex();
                return;
            default:
                startapp();
                return;
        }
    }

    public void startapp() {
        byte[] bArr = this.f17263e;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.f17262e.length < 16) {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.f17263e;
            System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.f17263e = bArr2;
        }
        byte[] bArr4 = this.f17262e;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.f17262e;
            System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.f17262e = bArr5;
        }
        this.f17264e = 0;
        this.f17268e = 0;
        int[] iArr = new int[2560];
        for (int i = 0; i < 32; i++) {
            int i2 = i >> 2;
            iArr[i2] = iArr[i2] | ((this.f17263e[i] & 255) << ((i & 3) * 8));
        }
        for (int i3 = 0; i3 < 32; i3++) {
            int i4 = (i3 >> 2) + 8;
            iArr[i4] = iArr[i4] | ((this.f17262e[i3] & 255) << ((i3 & 3) * 8));
        }
        for (int i5 = 16; i5 < 2560; i5++) {
            int i6 = iArr[i5 - 2];
            int i7 = iArr[i5 - 15];
            iArr[i5] = ((i6 >>> 10) ^ (mopub(i6, 17) ^ mopub(i6, 19))) + iArr[i5 - 7] + ((i7 >>> 3) ^ (mopub(i7, 7) ^ mopub(i7, 18))) + iArr[i5 - 16] + i5;
        }
        System.arraycopy(iArr, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, this.f17261e, 0, 1024);
        System.arraycopy(iArr, 1536, this.f17269e, 0, 1024);
        for (int i8 = 0; i8 < 4096; i8++) {
            loadAd();
        }
        this.f17268e = 0;
    }

    public int vip() {
        int[] iArr = this.f17269e;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 2) | (i2 << 30);
        int i4 = (i >>> 12) | (i2 << 20);
        int i5 = (i >>> 15) | (i2 << 17);
        int i6 = iArr[2];
        int i7 = (i2 >>> 4) | (i6 << 28);
        int i8 = (i2 >>> 13) | (i6 << 19);
        int i9 = iArr[3];
        int i10 = (i6 >>> 9) | (i9 << 23);
        int i11 = (i6 >>> 25) | (i9 << 7);
        int i12 = (i9 << 1) | (i6 >>> 31);
        int[] iArr2 = this.f17261e;
        int i13 = iArr2[0];
        int i14 = iArr2[1];
        int i15 = (i13 >>> 8) | (i14 << 24);
        int i16 = (i13 >>> 13) | (i14 << 19);
        int i17 = (i13 >>> 20) | (i14 << 12);
        int i18 = iArr2[2];
        int i19 = iArr2[3];
        int i20 = i16 & i17;
        return ((((((((((i12 & i4) & ((i19 << 1) | (i18 >>> 31))) ^ (((i20 ^ (i4 & i15)) ^ (i12 & ((i14 >>> 10) | (i18 << 22)))) ^ (((i14 >>> 28) | (i18 << 4)) & ((i18 >>> 15) | (i19 << 17))))) ^ ((i18 >>> 29) | (i19 << 3))) ^ i3) ^ i5) ^ i7) ^ i8) ^ i6) ^ i10) ^ i11;
    }

    public void yandex() {
        int[] iArr = this.f17269e;
        int[] iArr2 = this.f17261e;
        if (this.f17263e.length != 16) {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        if (this.f17262e.length != 16) {
            throw new IllegalArgumentException("The IV must be 128 bits long");
        }
        this.f17264e = 0;
        this.f17268e = 0;
        int[] iArr3 = new int[1280];
        for (int i = 0; i < 16; i++) {
            int i2 = i >> 2;
            iArr3[i2] = ((this.f17263e[i] & 255) << ((i & 3) * 8)) | iArr3[i2];
        }
        System.arraycopy(iArr3, 0, iArr3, 4, 4);
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f17262e;
            if (i3 >= bArr.length || i3 >= 16) {
                break;
            }
            int i4 = (i3 >> 2) + 8;
            iArr3[i4] = ((bArr[i3] & 255) << ((i3 & 3) * 8)) | iArr3[i4];
            i3++;
        }
        System.arraycopy(iArr3, 8, iArr3, 12, 4);
        for (int i5 = 16; i5 < 1280; i5++) {
            int i6 = iArr3[i5 - 2];
            int adcel = ((i6 >>> 10) ^ (adcel(i6, 17) ^ adcel(i6, 19))) + iArr3[i5 - 7];
            int i7 = iArr3[i5 - 15];
            iArr3[i5] = adcel + ((i7 >>> 3) ^ (adcel(i7, 7) ^ adcel(i7, 18))) + iArr3[i5 - 16] + i5;
        }
        System.arraycopy(iArr3, PSKKeyManager.MAX_KEY_LENGTH_BYTES, iArr2, 0, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE);
        System.arraycopy(iArr3, 768, iArr, 0, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE);
        for (int i8 = 0; i8 < 512; i8++) {
            iArr2[i8] = amazon();
        }
        for (int i9 = 0; i9 < 512; i9++) {
            iArr[i9] = amazon();
        }
        this.f17268e = 0;
    }
}
