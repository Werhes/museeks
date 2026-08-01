package defpackage;

import java.util.Arrays;

/* renamed from: eٟؕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3509e implements adcel {
    public byte[] Signature;
    public InterfaceC2227e ad;
    public byte[] adcel;
    public byte[] admob;
    public byte[] advert;
    public byte[] amazon;
    public boolean appmetrica;
    public byte[] billing;
    public long inmobi;
    public long isVip;
    public boolean license;
    public byte[] loadAd;
    public C16089e metrica;
    public byte[] mopub;
    public long pro;
    public int purchase;
    public int remoteconfig;
    public byte[] signatures;
    public byte[] smaato;
    public byte[] startapp;
    public int subscription;
    public int tapsense;
    public C10312e vip;
    public byte[] yandex;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٟؕٝ, java.lang.Object] */
    public static C3509e adcel(InterfaceC2227e interfaceC2227e) {
        ?? obj = new Object();
        if (interfaceC2227e.isPro() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        C10312e c10312e = new C10312e(23, false);
        obj.ad = interfaceC2227e;
        obj.vip = c10312e;
        return obj;
    }

    @Override // defpackage.mopub
    public final void ad(int i, int i2, byte[] bArr) {
        metrica();
        int i3 = this.tapsense;
        if (i3 > 0) {
            int i4 = 16 - i3;
            if (i2 < i4) {
                System.arraycopy(bArr, i, this.signatures, i3, i2);
                this.tapsense += i2;
                return;
            } else {
                System.arraycopy(bArr, i, this.signatures, i3, i4);
                purchase(this.loadAd, this.signatures);
                this.isVip += 16;
                i += i4;
                i2 -= i4;
            }
        }
        int i5 = i2 + i;
        int i6 = i5 - 16;
        while (i <= i6) {
            byte[] bArr2 = this.loadAd;
            AbstractC17976e.billing(bArr2, i, bArr);
            this.vip.ads(bArr2);
            this.isVip += 16;
            i += 16;
        }
        int i7 = i5 - i;
        this.tapsense = i7;
        System.arraycopy(bArr, i, this.signatures, 0, i7);
    }

    public final void appmetrica(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (bArr2.length - i2 < 16) {
            throw new RuntimeException("Output buffer too short");
        }
        if (this.pro == 0) {
            startapp();
        }
        byte[] bArr3 = new byte[16];
        yandex(bArr3);
        AbstractC17976e.billing(bArr3, i, bArr);
        purchase(this.amazon, bArr3);
        System.arraycopy(bArr3, 0, bArr2, i2, 16);
        this.pro += 16;
    }

    public final void billing(int i, int i2, byte[] bArr, byte[] bArr2) {
        while (true) {
            i2--;
            if (i2 < 0) {
                this.vip.ads(bArr);
                return;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [long] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, eٍؘٖ] */
    @Override // defpackage.mopub
    public final int doFinal(byte[] bArr, int i) {
        long j;
        ?? r18;
        metrica();
        if (this.pro == 0) {
            startapp();
        }
        int i2 = this.remoteconfig;
        if (!this.license) {
            int i3 = this.purchase;
            if (i2 < i3) {
                throw new Exception("data too short");
            }
            i2 -= i3;
            if (bArr.length - i < i2) {
                throw new RuntimeException("Output buffer too short");
            }
        } else if (bArr.length - i < this.purchase + i2) {
            throw new RuntimeException("Output buffer too short");
        }
        if (i2 > 0) {
            byte[] bArr2 = this.advert;
            byte[] bArr3 = new byte[16];
            yandex(bArr3);
            if (!this.license) {
                billing(0, i2, this.amazon, bArr2);
                int i4 = i2;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        break;
                    }
                    bArr2[i4] = (byte) (bArr2[i4] ^ bArr3[i4]);
                }
            } else {
                int i5 = i2;
                while (true) {
                    i5--;
                    if (i5 < 0) {
                        break;
                    }
                    bArr2[i5] = (byte) (bArr2[i5] ^ bArr3[i5]);
                }
                billing(0, i2, this.amazon, bArr2);
            }
            System.arraycopy(bArr2, 0, bArr, i, i2);
            this.pro += i2;
        }
        long j2 = this.isVip;
        int i6 = this.tapsense;
        long j3 = j2 + i6;
        this.isVip = j3;
        if (j3 > this.inmobi) {
            if (i6 > 0) {
                billing(0, i6, this.loadAd, this.signatures);
            }
            if (this.inmobi > 0) {
                AbstractC17976e.yandex(this.loadAd, this.Signature);
            }
            long j4 = ((this.pro * 8) + 127) >>> 7;
            byte[] bArr4 = new byte[16];
            if (this.metrica == null) {
                ?? obj = new Object();
                this.metrica = obj;
                byte[] bArr5 = this.adcel;
                r18 = 7;
                long[] jArr = new long[2];
                j = 8;
                int i7 = 0;
                for (int i8 = 0; i8 < 2; i8++) {
                    jArr[i8] = AbstractC3628e.license(i7, bArr5);
                    i7 += 8;
                }
                obj.f31681e = jArr;
            } else {
                r18 = 7;
                j = 8;
            }
            C16089e c16089e = this.metrica;
            c16089e.getClass();
            long[] jArr2 = {Long.MIN_VALUE};
            if (j4 > 0) {
                long[] jArr3 = (long[]) c16089e.f31681e;
                boolean z = true;
                long[] jArr4 = {jArr3[0], jArr3[1]};
                while (true) {
                    if ((j4 & 1) != 0) {
                        AbstractC17976e.license(jArr2, jArr4);
                    }
                    long[] jArr5 = new long[4];
                    boolean z2 = z;
                    AbstractC15792e.appmetrica(0, jArr4[0], jArr5);
                    AbstractC15792e.appmetrica(2, jArr4[z2 ? 1 : 0], jArr5);
                    long j5 = jArr5[0];
                    long j6 = jArr5[z2 ? 1 : 0];
                    long j7 = jArr5[2];
                    long j8 = jArr5[3];
                    long j9 = j6 ^ (((j8 ^ (j8 >>> (z2 ? 1L : 0L))) ^ (j8 >>> 2)) ^ (j8 >>> r18));
                    long j10 = j7 ^ (((j8 << 63) ^ (j8 << 62)) ^ (j8 << 57));
                    jArr4[0] = j5 ^ (((j10 ^ (j10 >>> (z2 ? 1L : 0L))) ^ (j10 >>> 2)) ^ (j10 >>> r18));
                    jArr4[z2 ? 1 : 0] = j9 ^ (((j10 << 63) ^ (j10 << 62)) ^ (j10 << 57));
                    j4 >>>= z2 ? 1L : 0L;
                    if (j4 <= 0) {
                        break;
                    }
                    z = z2 ? 1 : 0;
                }
            }
            int i9 = 0;
            for (int i10 = 0; i10 < 2; i10++) {
                AbstractC3628e.admob(i9, jArr2[i10], bArr4);
                i9 += 8;
            }
            byte[] bArr6 = this.loadAd;
            long[] jArr6 = new long[2];
            int i11 = 0;
            for (int i12 = 0; i12 < 2; i12++) {
                jArr6[i12] = AbstractC3628e.license(i11, bArr6);
                i11 += 8;
            }
            long[] jArr7 = new long[2];
            int i13 = 0;
            for (int i14 = 0; i14 < 2; i14++) {
                jArr7[i14] = AbstractC3628e.license(i13, bArr4);
                i13 += 8;
            }
            AbstractC17976e.license(jArr6, jArr7);
            int i15 = 0;
            for (int i16 = 0; i16 < 2; i16++) {
                AbstractC3628e.admob(i15, jArr6[i16], bArr6);
                i15 += 8;
            }
            AbstractC17976e.yandex(this.amazon, this.loadAd);
        } else {
            j = 8;
        }
        byte[] bArr7 = new byte[16];
        AbstractC3628e.admob(0, this.isVip * j, bArr7);
        AbstractC3628e.admob(8, this.pro * j, bArr7);
        purchase(this.amazon, bArr7);
        byte[] bArr8 = new byte[16];
        this.ad.tapsense(0, 0, this.mopub, bArr8);
        AbstractC17976e.yandex(bArr8, this.amazon);
        int i17 = this.purchase;
        byte[] bArr9 = new byte[i17];
        this.smaato = bArr9;
        System.arraycopy(bArr8, 0, bArr9, 0, i17);
        if (this.license) {
            System.arraycopy(this.smaato, 0, bArr, i + this.remoteconfig, this.purchase);
            i2 += this.purchase;
        } else {
            int i18 = this.purchase;
            byte[] bArr10 = new byte[i18];
            System.arraycopy(this.advert, i2, bArr10, 0, i18);
            if (!AbstractC12442e.loadAd(this.smaato, bArr10)) {
                throw new Exception("mac check in GCM failed");
            }
        }
        mopub(false);
        return i2;
    }

    @Override // defpackage.mopub
    public final String getAlgorithmName() {
        return this.ad.getAlgorithmName() + "/GCM";
    }

    @Override // defpackage.mopub
    public final int getOutputSize(int i) {
        int i2 = i + this.remoteconfig;
        if (this.license) {
            return i2 + this.purchase;
        }
        int i3 = this.purchase;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // defpackage.adcel
    public final InterfaceC2227e getUnderlyingCipher() {
        return this.ad;
    }

    @Override // defpackage.mopub
    public final int getUpdateOutputSize(int i) {
        int i2 = i + this.remoteconfig;
        if (!this.license) {
            int i3 = this.purchase;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    @Override // defpackage.mopub
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        byte[] bArr;
        C14915e c14915e;
        byte[] bArr2;
        InterfaceC2227e interfaceC2227e = this.ad;
        this.license = z;
        this.smaato = null;
        this.appmetrica = true;
        if (interfaceC3894e instanceof smaato) {
            smaato smaatoVar = (smaato) interfaceC3894e;
            bArr = AbstractC12442e.license(smaatoVar.f36456e);
            this.startapp = AbstractC12442e.license(smaatoVar.f36458e);
            int i = smaatoVar.f36457e;
            if (i < 32 || i > 128 || i % 8 != 0) {
                throw new IllegalArgumentException(AbstractC1786e.admob(i, "Invalid value for MAC size: "));
            }
            this.purchase = i / 8;
            c14915e = smaatoVar.f36455e;
        } else {
            if (!(interfaceC3894e instanceof C11494e)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM");
            }
            C11494e c11494e = (C11494e) interfaceC3894e;
            bArr = c11494e.f23095e;
            this.startapp = null;
            this.purchase = 16;
            c14915e = (C14915e) c11494e.f23094e;
        }
        this.advert = new byte[z ? 16 : this.purchase + 16];
        if (bArr == null || bArr.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z && (bArr2 = this.yandex) != null && Arrays.equals(bArr2, bArr)) {
            if (c14915e == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr3 = this.billing;
            if (bArr3 != null && Arrays.equals(bArr3, c14915e.f29591e)) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.yandex = bArr;
        if (c14915e != null) {
            this.billing = c14915e.f29591e;
        }
        if (c14915e != null) {
            interfaceC2227e.init(true, c14915e);
            byte[] bArr4 = new byte[16];
            this.adcel = bArr4;
            interfaceC2227e.tapsense(0, 0, bArr4, bArr4);
            this.vip.signatures(this.adcel);
            this.metrica = null;
        } else if (this.adcel == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr5 = new byte[16];
        this.mopub = bArr5;
        byte[] bArr6 = this.yandex;
        if (bArr6.length == 12) {
            System.arraycopy(bArr6, 0, bArr5, 0, bArr6.length);
            this.mopub[15] = 1;
        } else {
            int length = bArr6.length;
            for (int i2 = 0; i2 < length; i2 += 16) {
                billing(i2, Math.min(length - i2, 16), bArr5, bArr6);
            }
            byte[] bArr7 = new byte[16];
            AbstractC3628e.admob(8, this.yandex.length * 8, bArr7);
            purchase(this.mopub, bArr7);
        }
        this.amazon = new byte[16];
        this.loadAd = new byte[16];
        this.Signature = new byte[16];
        this.signatures = new byte[16];
        this.tapsense = 0;
        this.isVip = 0L;
        this.inmobi = 0L;
        this.admob = AbstractC12442e.license(this.mopub);
        this.subscription = -2;
        this.remoteconfig = 0;
        this.pro = 0L;
        byte[] bArr8 = this.startapp;
        if (bArr8 != null) {
            ad(0, bArr8.length, bArr8);
        }
    }

    public final void license(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (bArr2.length - i2 < 16) {
            throw new RuntimeException("Output buffer too short");
        }
        if (this.pro == 0) {
            startapp();
        }
        byte[] bArr3 = new byte[16];
        yandex(bArr3);
        byte[] bArr4 = this.amazon;
        AbstractC17976e.billing(bArr4, i, bArr);
        this.vip.ads(bArr4);
        int i3 = 0;
        do {
            bArr2[i2 + i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
            int i4 = i3 + 1;
            bArr2[i2 + i4] = (byte) (bArr[i4 + i] ^ bArr3[i4]);
            int i5 = i3 + 2;
            bArr2[i2 + i5] = (byte) (bArr[i5 + i] ^ bArr3[i5]);
            int i6 = i3 + 3;
            bArr2[i2 + i6] = (byte) (bArr[i6 + i] ^ bArr3[i6]);
            i3 += 4;
        } while (i3 < 16);
        this.pro += 16;
    }

    public final void metrica() {
        if (this.appmetrica) {
            return;
        }
        if (!this.license) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    public final void mopub(boolean z) {
        this.ad.reset();
        this.amazon = new byte[16];
        this.loadAd = new byte[16];
        this.Signature = new byte[16];
        this.signatures = new byte[16];
        this.tapsense = 0;
        this.isVip = 0L;
        this.inmobi = 0L;
        this.admob = AbstractC12442e.license(this.mopub);
        this.subscription = -2;
        this.remoteconfig = 0;
        this.pro = 0L;
        byte[] bArr = this.advert;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z) {
            this.smaato = null;
        }
        if (this.license) {
            this.appmetrica = false;
            return;
        }
        byte[] bArr2 = this.startapp;
        if (bArr2 != null) {
            ad(0, bArr2.length, bArr2);
        }
    }

    @Override // defpackage.mopub
    public final int processByte(byte b, byte[] bArr, int i) {
        metrica();
        byte[] bArr2 = this.advert;
        int i2 = this.remoteconfig;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.remoteconfig = i3;
        if (i3 != bArr2.length) {
            return 0;
        }
        if (this.license) {
            appmetrica(0, i, bArr2, bArr);
            this.remoteconfig = 0;
        } else {
            license(0, i, bArr2, bArr);
            byte[] bArr3 = this.advert;
            System.arraycopy(bArr3, 16, bArr3, 0, this.purchase);
            this.remoteconfig = this.purchase;
        }
        return 16;
    }

    @Override // defpackage.mopub
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        metrica();
        if (bArr.length - i < i2) {
            throw new RuntimeException("Input buffer too short");
        }
        if (bArr == bArr2 && AbstractC12442e.m3347class(i, i2, i3, getUpdateOutputSize(i2))) {
            bArr = new byte[i2];
            System.arraycopy(bArr2, i, bArr, 0, i2);
            i = 0;
        }
        int i5 = 16;
        if (this.license) {
            int i6 = this.remoteconfig;
            if (i6 > 0) {
                int i7 = 16 - i6;
                if (i2 < i7) {
                    System.arraycopy(bArr, i, this.advert, i6, i2);
                } else {
                    System.arraycopy(bArr, i, this.advert, i6, i7);
                    appmetrica(0, i3, this.advert, bArr2);
                    i += i7;
                    i2 -= i7;
                }
            } else {
                i5 = 0;
            }
            int i8 = i2 + i;
            int i9 = i8 - 16;
            while (i <= i9) {
                appmetrica(i, i3 + i5, bArr, bArr2);
                i += 16;
                i5 += 16;
            }
            int i10 = i8 - i;
            this.remoteconfig = i10;
            System.arraycopy(bArr, i, this.advert, 0, i10);
            return i5;
        }
        byte[] bArr3 = this.advert;
        int length = bArr3.length;
        int i11 = this.remoteconfig;
        int i12 = length - i11;
        if (i2 >= i12) {
            if (i11 >= 16) {
                license(0, i3, bArr3, bArr2);
                byte[] bArr4 = this.advert;
                int i13 = this.remoteconfig - 16;
                this.remoteconfig = i13;
                System.arraycopy(bArr4, 16, bArr4, 0, i13);
                if (i2 < i12 + 16) {
                    System.arraycopy(bArr, i, this.advert, this.remoteconfig, i2);
                    this.remoteconfig += i2;
                    return 16;
                }
                i4 = 16;
            } else {
                i4 = 0;
            }
            byte[] bArr5 = this.advert;
            int length2 = (i2 + i) - bArr5.length;
            int i14 = this.remoteconfig;
            int i15 = 16 - i14;
            System.arraycopy(bArr, i, bArr5, i14, i15);
            license(0, i3 + i4, this.advert, bArr2);
            int i16 = i + i15;
            int i17 = i4 + 16;
            while (i16 <= length2) {
                license(i16, i3 + i17, bArr, bArr2);
                i16 += 16;
                i17 += 16;
            }
            byte[] bArr6 = this.advert;
            int length3 = (bArr6.length + length2) - i16;
            this.remoteconfig = length3;
            System.arraycopy(bArr, i16, bArr6, 0, length3);
            return i17;
        }
        System.arraycopy(bArr, i, bArr3, i11, i2);
        this.remoteconfig += i2;
        return 0;
    }

    public final void purchase(byte[] bArr, byte[] bArr2) {
        AbstractC17976e.yandex(bArr, bArr2);
        this.vip.ads(bArr);
    }

    public final void startapp() {
        if (this.isVip > 0) {
            System.arraycopy(this.loadAd, 0, this.Signature, 0, 16);
            this.inmobi = this.isVip;
        }
        int i = this.tapsense;
        if (i > 0) {
            billing(0, i, this.Signature, this.signatures);
            this.inmobi += this.tapsense;
        }
        if (this.inmobi > 0) {
            System.arraycopy(this.Signature, 0, this.amazon, 0, 16);
        }
    }

    @Override // defpackage.mopub
    public final byte[] vip() {
        byte[] bArr = this.smaato;
        return bArr == null ? new byte[this.purchase] : AbstractC12442e.license(bArr);
    }

    public final void yandex(byte[] bArr) {
        int i = this.subscription;
        if (i == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.subscription = i - 1;
        byte[] bArr2 = this.admob;
        int i2 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i2;
        int i3 = (i2 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i3;
        int i4 = (i3 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i4;
        bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
        this.ad.tapsense(0, 0, bArr2, bArr);
    }
}
