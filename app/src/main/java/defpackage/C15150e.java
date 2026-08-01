package defpackage;

import java.util.Arrays;
import java.util.Vector;

/* renamed from: eٕؐٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15150e implements adcel {
    public long Signature;
    public InterfaceC2227e ad;
    public byte[] adcel;
    public long admob;
    public byte[] advert;
    public int amazon;
    public byte[] appmetrica;
    public byte[] billing;
    public int license;
    public int loadAd;
    public boolean metrica;
    public byte[] mopub;
    public byte[] pro;
    public Vector purchase;
    public byte[] remoteconfig;
    public byte[] signatures;
    public byte[] smaato;
    public byte[] startapp;
    public byte[] subscription;
    public byte[] tapsense;
    public InterfaceC2227e vip;
    public byte[] yandex;

    public static void billing(byte[] bArr, byte[] bArr2) {
        AbstractC4340e.startapp(bArr2, 16, bArr);
    }

    public static void license(int i, byte[] bArr) {
        bArr[i] = Byte.MIN_VALUE;
        while (true) {
            i++;
            if (i >= 16) {
                return;
            } else {
                bArr[i] = 0;
            }
        }
    }

    public static byte[] metrica(byte[] bArr) {
        int i = 16;
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (true) {
            i--;
            if (i < 0) {
                bArr2[15] = (byte) (bArr2[15] ^ (135 >>> ((1 - i2) << 3)));
                return bArr2;
            }
            int i3 = bArr[i] & 255;
            bArr2[i] = (byte) (i2 | (i3 << 1));
            i2 = (i3 >>> 7) & 1;
        }
    }

    @Override // defpackage.mopub
    public final void ad(int i, int i2, byte[] bArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.advert;
            int i4 = this.amazon;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.amazon = i5;
            if (i5 == bArr2.length) {
                long j = this.Signature + 1;
                this.Signature = j;
                billing(this.subscription, appmetrica(Long.numberOfTrailingZeros(j)));
                billing(this.advert, this.subscription);
                InterfaceC2227e interfaceC2227e = this.ad;
                byte[] bArr3 = this.advert;
                interfaceC2227e.tapsense(0, 0, bArr3, bArr3);
                billing(this.remoteconfig, this.advert);
                this.amazon = 0;
            }
        }
    }

    public final byte[] appmetrica(int i) {
        while (i >= this.purchase.size()) {
            Vector vector = this.purchase;
            vector.addElement(metrica((byte[]) vector.lastElement()));
        }
        return (byte[]) this.purchase.elementAt(i);
    }

    @Override // defpackage.mopub
    public final int doFinal(byte[] bArr, int i) {
        byte[] bArr2;
        InterfaceC2227e interfaceC2227e = this.ad;
        byte[] bArr3 = this.pro;
        if (this.metrica) {
            bArr2 = null;
        } else {
            int i2 = this.loadAd;
            int i3 = this.license;
            if (i2 < i3) {
                throw new Exception("data too short");
            }
            int i4 = i2 - i3;
            this.loadAd = i4;
            bArr2 = new byte[i3];
            System.arraycopy(this.smaato, i4, bArr2, 0, i3);
        }
        int i5 = this.amazon;
        if (i5 > 0) {
            license(i5, this.advert);
            billing(this.subscription, this.billing);
            billing(this.advert, this.subscription);
            byte[] bArr4 = this.advert;
            interfaceC2227e.tapsense(0, 0, bArr4, bArr4);
            billing(this.remoteconfig, this.advert);
        }
        int i6 = this.loadAd;
        if (i6 > 0) {
            if (this.metrica) {
                license(i6, this.smaato);
                billing(this.signatures, this.smaato);
            }
            billing(bArr3, this.billing);
            byte[] bArr5 = new byte[16];
            interfaceC2227e.tapsense(0, 0, bArr3, bArr5);
            billing(this.smaato, bArr5);
            int length = bArr.length;
            int i7 = this.loadAd;
            if (length < i + i7) {
                throw new RuntimeException("Output buffer too short");
            }
            System.arraycopy(this.smaato, 0, bArr, i, i7);
            if (!this.metrica) {
                license(this.loadAd, this.smaato);
                billing(this.signatures, this.smaato);
            }
        }
        billing(this.signatures, bArr3);
        billing(this.signatures, this.yandex);
        byte[] bArr6 = this.signatures;
        interfaceC2227e.tapsense(0, 0, bArr6, bArr6);
        billing(this.signatures, this.remoteconfig);
        int i8 = this.license;
        byte[] bArr7 = new byte[i8];
        this.tapsense = bArr7;
        System.arraycopy(this.signatures, 0, bArr7, 0, i8);
        int i9 = this.loadAd;
        if (this.metrica) {
            int length2 = bArr.length;
            int i10 = i + i9;
            int i11 = this.license;
            if (length2 < i10 + i11) {
                throw new RuntimeException("Output buffer too short");
            }
            System.arraycopy(this.tapsense, 0, bArr, i10, i11);
            i9 += this.license;
        } else if (!AbstractC12442e.loadAd(this.tapsense, bArr2)) {
            throw new Exception("mac check in OCB failed");
        }
        interfaceC2227e.reset();
        this.vip.reset();
        byte[] bArr8 = this.advert;
        if (bArr8 != null) {
            Arrays.fill(bArr8, (byte) 0);
        }
        byte[] bArr9 = this.smaato;
        if (bArr9 != null) {
            Arrays.fill(bArr9, (byte) 0);
        }
        this.amazon = 0;
        this.loadAd = 0;
        this.Signature = 0L;
        this.admob = 0L;
        byte[] bArr10 = this.subscription;
        if (bArr10 != null) {
            Arrays.fill(bArr10, (byte) 0);
        }
        byte[] bArr11 = this.remoteconfig;
        if (bArr11 != null) {
            Arrays.fill(bArr11, (byte) 0);
        }
        System.arraycopy(this.mopub, 0, bArr3, 0, 16);
        byte[] bArr12 = this.signatures;
        if (bArr12 != null) {
            Arrays.fill(bArr12, (byte) 0);
        }
        byte[] bArr13 = this.appmetrica;
        if (bArr13 != null) {
            ad(0, bArr13.length, bArr13);
        }
        return i9;
    }

    @Override // defpackage.mopub
    public final String getAlgorithmName() {
        return this.vip.getAlgorithmName() + "/OCB";
    }

    @Override // defpackage.mopub
    public final int getOutputSize(int i) {
        int i2 = i + this.loadAd;
        if (this.metrica) {
            return i2 + this.license;
        }
        int i3 = this.license;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // defpackage.adcel
    public final InterfaceC2227e getUnderlyingCipher() {
        return this.vip;
    }

    @Override // defpackage.mopub
    public final int getUpdateOutputSize(int i) {
        int i2 = i + this.loadAd;
        if (!this.metrica) {
            int i3 = this.license;
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
        byte[] bArr2 = this.mopub;
        byte[] bArr3 = this.adcel;
        InterfaceC2227e interfaceC2227e = this.ad;
        boolean z2 = this.metrica;
        this.metrica = z;
        this.tapsense = null;
        if (interfaceC3894e instanceof smaato) {
            smaato smaatoVar = (smaato) interfaceC3894e;
            bArr = AbstractC12442e.license(smaatoVar.f36456e);
            this.appmetrica = AbstractC12442e.license(smaatoVar.f36458e);
            int i = smaatoVar.f36457e;
            if (i < 64 || i > 128 || i % 8 != 0) {
                throw new IllegalArgumentException(AbstractC1786e.admob(i, "Invalid value for MAC size: "));
            }
            this.license = i / 8;
            c14915e = smaatoVar.f36455e;
        } else {
            if (!(interfaceC3894e instanceof C11494e)) {
                throw new IllegalArgumentException("invalid parameters passed to OCB");
            }
            C11494e c11494e = (C11494e) interfaceC3894e;
            bArr = c11494e.f23095e;
            this.appmetrica = null;
            this.license = 16;
            c14915e = (C14915e) c11494e.f23094e;
        }
        this.advert = new byte[16];
        this.smaato = new byte[z ? 16 : this.license + 16];
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (bArr.length > 15) {
            throw new IllegalArgumentException("IV must be no more than 15 bytes");
        }
        if (c14915e != null) {
            interfaceC2227e.init(true, c14915e);
            this.vip.init(z, c14915e);
            this.startapp = null;
        } else if (z2 != z) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        byte[] bArr4 = new byte[16];
        this.billing = bArr4;
        interfaceC2227e.tapsense(0, 0, bArr4, bArr4);
        this.yandex = metrica(this.billing);
        Vector vector = new Vector();
        this.purchase = vector;
        vector.addElement(metrica(this.yandex));
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArr, 0, bArr5, 16 - bArr.length, bArr.length);
        bArr5[0] = (byte) (this.license << 4);
        int length = 15 - bArr.length;
        bArr5[length] = (byte) (bArr5[length] | 1);
        byte b = bArr5[15];
        int i2 = b & 63;
        bArr5[15] = (byte) (b & 192);
        byte[] bArr6 = this.startapp;
        if (bArr6 == null || !Arrays.equals(bArr5, bArr6)) {
            byte[] bArr7 = new byte[16];
            this.startapp = bArr5;
            interfaceC2227e.tapsense(0, 0, bArr5, bArr7);
            System.arraycopy(bArr7, 0, bArr3, 0, 16);
            int i3 = 0;
            while (i3 < 8) {
                int i4 = i3 + 16;
                byte b2 = bArr7[i3];
                i3++;
                bArr3[i4] = (byte) (b2 ^ bArr7[i3]);
            }
        }
        int i5 = i2 % 8;
        int i6 = i2 / 8;
        if (i5 == 0) {
            System.arraycopy(bArr3, i6, bArr2, 0, 16);
        } else {
            for (int i7 = 0; i7 < 16; i7++) {
                int i8 = bArr3[i6] & 255;
                i6++;
                bArr2[i7] = (byte) ((i8 << i5) | ((bArr3[i6] & 255) >>> (8 - i5)));
            }
        }
        this.amazon = 0;
        this.loadAd = 0;
        this.Signature = 0L;
        this.admob = 0L;
        this.subscription = new byte[16];
        this.remoteconfig = new byte[16];
        System.arraycopy(bArr2, 0, this.pro, 0, 16);
        this.signatures = new byte[16];
        byte[] bArr8 = this.appmetrica;
        if (bArr8 != null) {
            ad(0, bArr8.length, bArr8);
        }
    }

    @Override // defpackage.mopub
    public final int processByte(byte b, byte[] bArr, int i) {
        byte[] bArr2 = this.smaato;
        int i2 = this.loadAd;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.loadAd = i3;
        if (i3 != bArr2.length) {
            return 0;
        }
        purchase(i, bArr);
        return 16;
    }

    @Override // defpackage.mopub
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            throw new RuntimeException("Input buffer too short");
        }
        if (bArr == bArr2 && AbstractC12442e.m3347class(i, i2, i3, getUpdateOutputSize(i2))) {
            bArr = new byte[i2];
            System.arraycopy(bArr2, i, bArr, 0, i2);
            i = 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            byte[] bArr3 = this.smaato;
            int i6 = this.loadAd;
            bArr3[i6] = bArr[i + i5];
            int i7 = i6 + 1;
            this.loadAd = i7;
            if (i7 == bArr3.length) {
                purchase(i3 + i4, bArr2);
                i4 += 16;
            }
        }
        return i4;
    }

    public final void purchase(int i, byte[] bArr) {
        byte[] bArr2 = this.pro;
        if (bArr.length < i + 16) {
            throw new RuntimeException("Output buffer too short");
        }
        if (this.metrica) {
            billing(this.signatures, this.smaato);
            this.loadAd = 0;
        }
        long j = this.admob + 1;
        this.admob = j;
        billing(bArr2, appmetrica(Long.numberOfTrailingZeros(j)));
        billing(this.smaato, bArr2);
        InterfaceC2227e interfaceC2227e = this.vip;
        byte[] bArr3 = this.smaato;
        interfaceC2227e.tapsense(0, 0, bArr3, bArr3);
        billing(this.smaato, bArr2);
        System.arraycopy(this.smaato, 0, bArr, i, 16);
        if (this.metrica) {
            return;
        }
        billing(this.signatures, this.smaato);
        byte[] bArr4 = this.smaato;
        System.arraycopy(bArr4, 16, bArr4, 0, this.license);
        this.loadAd = this.license;
    }

    @Override // defpackage.mopub
    public final byte[] vip() {
        byte[] bArr = this.tapsense;
        return bArr == null ? new byte[this.license] : AbstractC12442e.license(bArr);
    }
}
